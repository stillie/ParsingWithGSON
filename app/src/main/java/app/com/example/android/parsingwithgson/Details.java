package app.com.example.android.parsingwithgson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle extras = getIntent().getExtras();
        int movieId = extras.getInt("MovieID");
        TextView movieIdTextView = (TextView) findViewById(R.id.movieDetailsId);

        movieIdTextView.setText(movieId);
    }

}
