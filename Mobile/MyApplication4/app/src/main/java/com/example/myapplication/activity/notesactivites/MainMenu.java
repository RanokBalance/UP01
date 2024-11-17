package com.example.myapplication.activity.notesactivites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.mainmenu);

        Button users = (Button) findViewById(R.id.users);
        Button notes = (Button) findViewById(R.id.notes);
        Button date = (Button) findViewById(R.id.date);
        Button status = (Button) findViewById(R.id.status);

        users.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent usersIntent = new Intent(MainMenu.this, Users.class);
                startActivity(usersIntent);
            }
        });

        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent notesIntent = new Intent(MainMenu.this, Notes.class);
                startActivity(notesIntent);
            }
        });

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dateIntent = new Intent(MainMenu.this, Date.class);
                startActivity(dateIntent);
            }
        });

        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent statusIntent = new Intent(MainMenu.this, Status.class);
                startActivity(statusIntent);
            }
        });
    }


}
