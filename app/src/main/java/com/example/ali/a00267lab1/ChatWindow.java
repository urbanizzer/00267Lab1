package com.example.ali.a00267lab1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class ChatWindow extends AppCompatActivity {
    ListView myListView;
    EditText myText;
    Button sendButton;
    ArrayList<String> myListArray;
    ChatAdapter messageAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_window);

        myListView = (ListView) findViewById(R.id.myListView);
        myText = (EditText) findViewById(R.id.mymessage);
        sendButton = (Button) findViewById(R.id.mysend);
        myListArray = new ArrayList<String>();
        messageAdapter = new ChatAdapter(this);
        myListView.setAdapter(messageAdapter);



        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myListArray.add(myText.getText().toString());
                myText.setText("");
                messageAdapter.notifyDataSetChanged();
                myText.setText("");
            }
        });


        ArrayList<String> ListView = new ArrayList<String>();

        ChatAdapter listAdapter = new ChatAdapter(this);
        myListView.setAdapter(listAdapter);

        ChatAdapter messageAdapter = new ChatAdapter(this);
        myListView.setAdapter(messageAdapter);

        messageAdapter.notifyDataSetChanged();


    }

    private class ChatAdapter extends ArrayAdapter<String> {
        public ChatAdapter(Context ctx){
            super(ctx,0);
        }

        @Override
        public int getCount() { return myListArray.size(); }

        @Override
        public String getItem(int position) { return myListArray.get(position); }

        LayoutInflater inflater = ChatWindow.this.getLayoutInflater();

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View result = null;
            if (position % 2 == 0) {

                result = inflater.inflate(R.layout.chat_row_incoming, null);
                TextView messagein = (TextView) result.findViewById(R.id.message_text_In);
                messagein.setText(getItem(position));

            } else {
                result = inflater.inflate(R.layout.chat_row_incoming, null);
                TextView messageout = (TextView) result.findViewById(R.id.message_text_out);
                messageout.setText(getItem(position));

            }


            return result;

        }


    }
}

