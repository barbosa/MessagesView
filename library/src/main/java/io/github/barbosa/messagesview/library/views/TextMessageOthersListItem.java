package io.github.barbosa.messagesview.library.views;

import android.content.Context;
import android.widget.TextView;

import io.github.barbosa.messagesview.R;

public class TextMessageOthersListItem extends TextMessageListItem {

    public TextMessageOthersListItem(Context context) {
        super(context);

        inflate(context, R.layout.chat_message_text_left_list_item, this);

        avatarView = (AvatarView) findViewById(R.id.chat_message_text_left_list_item_avatar);
        messageTextView = (TextView) findViewById(R.id.chat_message_text_left_list_item_message);
        dateTextView = (TextView) findViewById(R.id.chat_message_text_left_list_item_date);
        senderNameTextView = (TextView) findViewById(R.id.chat_message_text_left_list_item_sender_name);
    }
}
