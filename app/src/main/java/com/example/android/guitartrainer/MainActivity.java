package com.example.android.guitartrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the notes category
        TextView notes = (TextView) findViewById(R.id.notes);
        // Set a click listener on that View
        notes.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NotesActivity}
                Intent notesIntent = new Intent(MainActivity.this, NotesActivity.class);
                // Start the new activity
                startActivity(notesIntent);
            }
        });

        //The same applies to the next activities.
        TextView chords = (TextView) findViewById(R.id.chords);
        chords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chordsIntent = new Intent(MainActivity.this, ChordsActivity.class);
                startActivity(chordsIntent);
            }
        });
        TextView songs = (TextView) findViewById(R.id.songs);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });
        TextView about = (TextView) findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
            }
        });
        TextView player = (TextView) findViewById(R.id.player);
        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(MainActivity.this, PlayerActivity.class);
                startActivity(playerIntent);
            }
        });
    }
}