package com.example.android.guitartrainer;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by PiotrM on 21.05.2017.
 */

public class NotesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        // Find the View that shows the numbers category
        Button player = (Button) findViewById(R.id.button2);
        // Set a click listener on that View
        player.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent chordsIntent = new Intent(NotesActivity.this, ChordsActivity.class);
                // Start the new activity
                startActivity(chordsIntent);
            }
        });

    }
}