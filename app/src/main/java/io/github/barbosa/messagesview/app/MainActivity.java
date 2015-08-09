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
            Sender sender = new Sender("Gustavo", "Barbosa", null, i % 2 == 0);
            Message message = new Message(sender);
            message.setText("Hello " + (i + 1));

            messages.add(message);
        }

        return messages;
    }
}
