package laboratory.domain.com.androidactivitylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView jokeTextView = findViewById(R.id.joke_textView);

        String jokeString = getIntent().getStringExtra("Joke");

        jokeTextView.setText(jokeString);
    }
}
