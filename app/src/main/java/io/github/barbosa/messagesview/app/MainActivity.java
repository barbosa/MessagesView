package io.github.barbosa.messagesview.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import io.github.barbosa.messagesview.library.adapters.MessagesAdapter;
import io.github.barbosa.messagesview.library.models.Message;
import io.github.barbosa.messagesview.library.models.Sender;
import io.github.barbosa.messagesview.library.views.MessagesView;

public class MainActivity extends AppCompatActivity {

    MessagesView messagesView;

    private static final String MONSTER_1_AVATAR_URL = "https://cloud.githubusercontent.com/assets/235208/9158151/a87d0ad4-3edf-11e5-98a1-6dada6f8f242.png";
    private static final String MONSTER_2_AVATAR_URL = "https://cloud.githubusercontent.com/assets/235208/9158161/b76e3810-3edf-11e5-8bea-9e2d4c7d2474.png";
    private static final String MONSTER_3_AVATAR_URL = "https://cloud.githubusercontent.com/assets/235208/9158124/49a0fff2-3edf-11e5-832d-24cff752d049.png";
    private static final String MONSTER_4_AVATAR_URL = "https://cloud.githubusercontent.com/assets/235208/9158145/94dd9188-3edf-11e5-9ba5-1420b706cffc.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messagesView = (MessagesView) findViewById(R.id.messages_view);

        MessagesAdapter adapter = new MessagesAdapter(this, getMessages());
        messagesView.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }

    private List<Message> getMessages() {
        List<Message> messages = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Sender sender = new Sender("Gustavo", "Barbosa", MONSTER_1_AVATAR_URL, i % 2 == 0);
            Message message = new Message(sender);
            message.setText("Hello " + (i + 1));

            messages.add(message);
        }

        return messages;
    }
}
