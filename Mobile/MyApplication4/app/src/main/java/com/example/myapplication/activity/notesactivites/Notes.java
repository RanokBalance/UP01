package com.example.myapplication.activity.notesactivites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Notes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.notes);

        Button mainmenu = (Button) findViewById(R.id.btnnotes);

        mainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent notesIntent = new Intent(Notes.this, MainMenu.class);
                startActivity(notesIntent);
            }
        });
    }

}
