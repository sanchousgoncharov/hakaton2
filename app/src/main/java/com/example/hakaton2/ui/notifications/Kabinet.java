package com.example.hakaton2.ui.notifications;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hakaton2.R;

public class Kabinet extends AppCompatActivity {

    public Button btnach;
    public Button btnhelp;
    public Button btnlead;
    public Button btnevent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kabinet);

        btnach = (Button) findViewById(R.id.btnAchivments);
        btnhelp = (Button) findViewById(R.id.btnHelp);
        btnlead = (Button) findViewById(R.id.btnLeader);
        btnevent = (Button) findViewById(R.id.btnEvent);
        btnach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kabinet.this, Achivments.class);
                startActivity(intent);
            }
        });
        btnhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kabinet.this, Help.class);
                startActivity(intent);
            }
        });
        btnlead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kabinet.this, TableOfLeaders.class);
                startActivity(intent);
            }
        });
        btnevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kabinet.this, Events.class);
                startActivity(intent);
            }
        });
    }
}