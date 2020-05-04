package com.example.testserdar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;

import java.util.ArrayList;

public class user extends AppCompatActivity {


    ListView listMessages;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        listMessages = findViewById(R.id.listMessages);
        TextView messageBtn = findViewById(R.id.messagesBtn);
        TextView friendList = findViewById(R.id.friendlist);
        TextView notifications = findViewById(R.id.notifications);
        TextView myprofile = findViewById(R.id.myprofile);


        ArrayList<String> messages= new ArrayList<String>();


        ArrayAdapter<String> adapterArr  = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, messages);







        messages.add("Maria");
        messages.add("Mihai");
        messages.add("Maria");
        messages.add("Mihai");
        messages.add("Maria");
        messages.add("Mihai");
        messages.add("Maria");
        messages.add("Mihai");
        messages.add("Maria");
        messages.add("Mihai");
        messages.add("Maria");
        messages.add("Mihai"); messages.add("Maria");
        messages.add("Mihai");
        messages.add("Maria");
        messages.add("Mihai");
        messages.add("Maria");
        messages.add("Mihai");
        messages.add("Maria");
        messages.add("Mihai");
        messages.add("Maria");
        messages.add("Mihai");
        messages.add("Maria");
        messages.add("Mihai");


        listMessages.setAdapter(adapterArr);



        friendList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),friendlist.class);
                startActivity(intent);
            }
        });

        notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), notifications.class);
                startActivity(intent);
            }
        });

        myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), myprofile.class);
                startActivity(intent);
            }
        });
        friendList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), friendlist.class);
                startActivity(intent);
            }
        });

    }
}
