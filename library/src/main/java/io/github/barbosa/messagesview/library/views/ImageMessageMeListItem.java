package io.github.barbosa.messagesview.library.views;

import android.content.Context;
import android.widget.TextView;

import io.github.barbosa.messagesview.R;

public class ImageMessageMeListItem extends ImageMessageListItem {

    public ImageMessageMeListItem(Context context) {
        super(context);

        inflate(context, R.layout.chat_message_image_right_list_item, this);

        avatarView = (AvatarView) findViewById(R.id.chat_message_image_right_list_item_avatar);
        dateTextView = (TextView) findViewById(R.id.chat_message_image_right_list_item_date);
        imageNameTextView = (TextView) findViewById(R.id.chat_message_image_right_list_item_file_name);
    }
}
