package com.example.myapplication.activity.notesactivites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Users extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.users);

        Button mainmenu = (Button) findViewById(R.id.btnusers);

        mainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainmenuIntent = new Intent(Users.this, MainMenu.class);
                startActivity(mainmenuIntent);
            }
        });
    }

}
