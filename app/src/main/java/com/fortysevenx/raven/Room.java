package com.fortysevenx.raven;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class Room extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        ImageView i1 = (ImageView) findViewById(R.id.image);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1.setLayoutParams(new ConstraintLayout.LayoutParams(i1.getWidth()+400,i1.getHeight()+300));
            }
        });
        ImageView doc = findViewById(R.id.doc);
        doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Room.this,docViewer.class);
                startActivity(intent);
            }
        });

        VideoView v = findViewById(R.id.video);
        String vpath = "android.resource://"+getPackageName()+'/'+R.raw.withcer;
        Uri uri = Uri.parse(vpath);
        v.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        v.setMediaController(mediaController);
        mediaController.setAnchorView(v);

    }
}