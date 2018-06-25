package me.example.davidllorca.jokedisplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_displayer);

        String jokeToDisplay = getIntent().getStringExtra("jokeToDisplay");
        ((TextView) findViewById(R.id.tv_joke_displayer_joke)).setText(jokeToDisplay);
    }
}
