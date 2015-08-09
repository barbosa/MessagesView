package io.github.barbosa.messagesview.library.views;

import android.content.Context;
import android.widget.TextView;

import io.github.barbosa.messagesview.R;

public class TextMessageMeListItem extends TextMessageListItem {

    public TextMessageMeListItem(Context context) {
        super(context);

        inflate(context, R.layout.chat_message_text_right_list_item, this);

        avatarView = (AvatarView) findViewById(R.id.chat_message_text_right_list_item_avatar);
        messageTextView = (TextView) findViewById(R.id.chat_message_text_right_list_item_message);
        dateTextView = (TextView) findViewById(R.id.chat_message_text_right_list_item_date);
    }
}
