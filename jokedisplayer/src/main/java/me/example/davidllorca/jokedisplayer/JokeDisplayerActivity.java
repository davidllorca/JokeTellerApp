package me.example.davidllorca.jokedisplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayerActivity extends AppCompatActivity {

    public static final String EXTRA_KEY_JOKE = "jokeToDisplay";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_displayer);

        if (getIntent().getStringExtra(EXTRA_KEY_JOKE) != null) {
            String jokeToDisplay = getIntent().getStringExtra(EXTRA_KEY_JOKE);
            ((TextView) findViewById(R.id.tv_joke_displayer_joke)).setText(jokeToDisplay);
        }
    }
}
