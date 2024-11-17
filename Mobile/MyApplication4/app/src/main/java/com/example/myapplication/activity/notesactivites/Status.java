package com.example.myapplication.activity.notesactivites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Status extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.status);

        Button mainmenu = (Button) findViewById(R.id.btnstatus);

        mainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent statusIntent = new Intent(Status.this, MainMenu.class);
                startActivity(statusIntent);
            }
        });
    }

}
