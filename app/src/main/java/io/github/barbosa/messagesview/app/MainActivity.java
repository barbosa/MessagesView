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

    private static final String[] TEXTS = new String[] {
            "I believe every human has a finite number of heartbeats. I don't intend to waste any of mine.",
            "Science has not yet mastered prophecy.",
            "The Earth was small, light blue, and so touchingly alone, our home that must be defended like a holy relic.",
            "The Earth was absolutely round. I believe I never knew what the word round meant until I saw Earth from space.",
            "Agree.",
            "Dinosaurs are extinct today because they lacked opposable thumbs and the brainpower to build a space program.",
            "Here men from the planet Earth first set foot upon the Moon.",
            "To be the first to enter the cosmos, to engage, single-handed, in an unprecedented duel with nature—could one dream of anything more?",
            "You have to get to know the meaning not just of joy but also of grief, before being allowed in the spacecraft cabin.",
            "Astronomy compels the soul to look upward, and leads us from this world to another."
    };

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
            boolean isMe = i == 2 || i == 6;
            Sender sender = new Sender("Gustavo", "Barbosa", isMe ? MONSTER_4_AVATAR_URL : MONSTER_3_AVATAR_URL, isMe);
            Message message = new Message(sender);
            message.setText(TEXTS[i]);

            messages.add(message);
        }

        return messages;
    }

}
