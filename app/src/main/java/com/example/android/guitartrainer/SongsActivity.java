package com.example.android.guitartrainer;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PiotrM on 21.05.2017.
 */

public class SongsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Find the View that shows the numbers category
        Button player = (Button) findViewById(R.id.button4);
        // Set a click listener on that View
        player.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent playerIntent = new Intent(SongsActivity.this, PlayerActivity.class);
                // Start the new activity
                startActivity(playerIntent);
            }
        });
    }
}