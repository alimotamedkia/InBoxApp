package ir.anishehparsi.inboxapp

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MessageItem(modifier: Modifier = Modifier, item: InboxMessages) {

    OutlinedCard {
        var isExpanded by rememberSaveable { mutableStateOf(false) }
        Column(modifier = Modifier.animateContentSize()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = item.title,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.weight(1f))
                IconButton(onClick = { isExpanded = !isExpanded }) {
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = ""
                    )
                }
            }
            if (isExpanded) {
                Row(
                    modifier = Modifier.padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(modifier = Modifier.weight(2f), text = item.shortMessage)
                    Spacer(
                        modifier.weight(0.08f)
                    )
                    Button(modifier = Modifier.weight(1f), onClick = {})
                    { Text(text = "Action", fontSize = 12.sp) }
                }
            }
        }
    }
}

@Composable
fun MessageList(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.padding(horizontal = 24.dp)) {
        items(messageInbox) {
            MessageItem(item = it)
            Spacer(modifier = Modifier.padding(vertical = 4.dp))
        }
    }
}

@Preview
@Composable
fun Preview1(modifier: Modifier = Modifier) {
    MessageList()
}

