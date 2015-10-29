package app.com.example.android.parsingwithgson;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class PostsActivity extends AppCompatActivity {

    ListView mListView;
    Response mResponseObj;
    CustomAdapter adapter;
    String url = "http://api.rottentomatoes.com/api/public/v1.0/lists/movies/box_office.json?apikey=9htuhtcb4ymusd73d4z6jxcj";
    Gson gson;
    AsyncHttpClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.movieList);

        client = new AsyncHttpClient();
        client.get(PostsActivity.this, url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String responseStr = new String(responseBody);
                gson = new Gson();
                mResponseObj = gson.fromJson(responseStr, Response.class);
                adapter = new CustomAdapter(PostsActivity.this, mResponseObj.getMovies());

                mListView.setAdapter(adapter);
                System.out.println("Network called");
                mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        TextView movieId = (TextView) findViewById(R.id.movieId);
                        String idStr = movieId.getText().toString();
                        int movie = Integer.parseInt(idStr);
                        String movieStr = movie + "";

                        Intent i = new Intent(PostsActivity.this, Details.class);
                        i.putExtra("MovieID", movie);
                        System.out.println("The id is: " + id);
                        startActivity(i);

                    }
                });

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });

    }

}
