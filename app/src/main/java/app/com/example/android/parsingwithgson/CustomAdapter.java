package app.com.example.android.parsingwithgson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Ryan vdW on 2015/10/26.
 */
public class CustomAdapter extends BaseAdapter {

    private Context mContext;
    private List<Response.MoviesEntity> movieItem;
    private LayoutInflater mInflater;
    private int id;
    public CustomAdapter(Context context, List<Response.MoviesEntity> movieItem) {
        this.mContext = context;
        this.movieItem = movieItem;
    }

    @Override
    public int getCount() {
        return movieItem.size();
    }

    @Override
    public Object getItem(int position) {
        return movieItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.each_list_item, parent, false);

        Response.MoviesEntity item = (Response.MoviesEntity) getItem(position);
        ImageView thumbnail = (ImageView) rowView.findViewById(R.id.thumbnail);
        TextView title = (TextView) rowView.findViewById(R.id.title);
        TextView rating = (TextView) rowView.findViewById(R.id.rating);
        TextView movieId = (TextView) rowView.findViewById(R.id.movieId);

        String imageUrl = item.getPosters().getOriginal();
        Picasso.with(mContext).load(imageUrl).into(thumbnail);
        title.setText(item.getTitle());
        rating.setText(item.getRatings().getAudience_rating());
        movieId.setText(item.getId());
        return rowView;
    }
}
