package io.github.barbosa.messagesview.library.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class MessagesView extends ListView {

    public MessagesView(Context context, AttributeSet attrs) {
        super(context, attrs);

        setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
    }
}
