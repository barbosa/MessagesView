package io.github.barbosa.messagesview.library.views;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;

import io.github.barbosa.messagesview.library.models.Message;
import io.github.barbosa.messagesview.library.utils.PrettyDate;

public abstract class MessageListItem extends RelativeLayout {

    protected AvatarView avatarView;
    protected TextView dateTextView;
    protected TextView senderNameTextView;

    private MessageSenderType senderType = MessageSenderType.OTHERS;

    public MessageListItem(Context context) {
        super(context);
    }

    public void setMessage(Message message) {
        if (avatarView != null) {
//            if (sender != null) {
//                avatarView.setName(sender.getFirstName(), sender.getLastName());
//                if (sender.getAvatarURL() != null) {
//                    Picasso.with(getContext())
//                            .load(sender.getAvatarURL())
//                            .into(avatarView.getImageView());
//                }
//            }
        }

        if (senderNameTextView != null && message.getSender() != null) {
            senderNameTextView.setText(message.getSender().getFirstAndLastName());
        }

        if (dateTextView != null) {
            String prettyDate = PrettyDate.with(getContext()).prettify(message.getCreatedAt());
            dateTextView.setText(prettyDate);
        }
    }

    public MessageSenderType getSenderType() {
        return senderType;
    }

    public void setSenderType(MessageSenderType senderType) {
        this.senderType = senderType;
    }

    public enum MessageSenderType {
        ME, OTHERS
    }
}
