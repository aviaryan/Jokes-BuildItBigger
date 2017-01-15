package in.aviaryan.jokedisplaylib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    TextView jokeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();
        jokeView = (TextView) findViewById(R.id.jokeview);
        jokeView.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
    }
}
