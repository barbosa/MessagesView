package io.github.barbosa.messagesview.library.views;

import android.content.Context;
import android.widget.TextView;

import io.github.barbosa.messagesview.R;

public class ImageMessageOthersListItem extends ImageMessageListItem {

    public ImageMessageOthersListItem(Context context) {
        super(context);

        inflate(context, R.layout.chat_message_image_left_list_item, this);

        avatarView = (AvatarView) findViewById(R.id.chat_message_image_left_list_item_avatar);
        dateTextView = (TextView) findViewById(R.id.chat_message_image_left_list_item_date);
        senderNameTextView = (TextView) findViewById(R.id.chat_message_image_left_list_item_sender_name);
        imageNameTextView = (TextView) findViewById(R.id.chat_message_image_left_list_item_file_name);
    }
}
