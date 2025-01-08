package ir.anishehparsi.inboxapp

data class InboxMessages( val title: String,
                          val shortMessage: String,
                          val longMessage: String,
                          val imageId: Int,
)

val messageInbox = listOf(
    InboxMessages(
        "Reminder",
        "Don't forget to complete the assignment.",
        "This is just a friendly reminder to complete the assignment before the deadline. Let me know if you need any help or clarification. I'm here to support you and make sure everything goes smoothly!",
        R.drawable.image
    ),
    InboxMessages(
        "Meeting Update",
        "The meeting has been rescheduled.",
        "The team meeting originally planned for tomorrow has been moved to next Monday at 10:00 AM. Please update your calendars and let me know if the new time works for you. We’ll be discussing important updates, so your presence is valuable.",
        R.drawable.image
    ),
    InboxMessages(
        "Thank You",
        "Thanks for your help with the project!",
        "I really appreciate all the hard work and effort you put into making the project successful. Your dedication and creativity have made a huge difference. It couldn’t have been done without you, and I’m truly grateful!",
        R.drawable.image
    ),
    InboxMessages(
        "Lunch Plans",
        "Let's grab lunch tomorrow.",
        "Would you be free to grab lunch tomorrow around 1:00 PM? I know a great place downtown we could check out. It’s been a while since we caught up, and I’d love to hear what’s new with you!",
        R.drawable.image
    ),
    InboxMessages(
        "Event Invitation",
        "You're invited to the annual gala.",
        "We’re excited to invite you to our annual gala this Friday at 7:00 PM. It’s a formal event with dinner, live music, and great company. Please RSVP by Thursday. We hope you can make it!",
        R.drawable.image
    ),
    InboxMessages(
        "Quick Question",
        "Can you share the document?",
        "I’m working on the report and was wondering if you could share the document you mentioned earlier. It would really help me wrap things up faster. Let me know if you have any trouble finding it!",
        R.drawable.image
    ),
    InboxMessages(
        "Project Update",
        "The project is almost complete.",
        "We’ve made significant progress on the project, and it’s almost ready for final review. Let’s schedule a time to go over the details and make sure everything is perfect before we move forward.",
        R.drawable.image
    ),
    InboxMessages(
        "Travel Plans",
        "Looking forward to the trip!",
        "I’m really excited about our upcoming trip! Let me know if there’s anything specific you’d like to plan for during the journey. We could also finalize the itinerary soon to make sure we don’t miss out on anything exciting!",
        R.drawable.image
    ),
    InboxMessages(
        "Feedback Request",
        "Could you review this draft?",
        "I’ve completed the first draft of the presentation. Could you take a look and share your thoughts? Any feedback would be greatly appreciated. Let me know if there’s anything you’d like me to revise or add!",
        R.drawable.image
    ),
    InboxMessages(
        "Birthday Wishes",
        "Happy Birthday!",
        "Wishing you a wonderful birthday filled with joy, laughter, and all your favorite things. May this year bring you happiness, success, and everything you’ve been hoping for. Have an amazing day!",
        R.drawable.image
    )
)
