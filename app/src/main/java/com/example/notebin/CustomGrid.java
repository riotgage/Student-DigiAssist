package com.example.notebin;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class CustomGrid extends BaseAdapter{
    private Context mContext;
    private final  List<String> title;
    private final List<Integer> shapes;
    private  final int loc;
    private  final String containst;

    public CustomGrid(Context c, List<String> title, List<Integer> shapes,int loc,String containst) {
        mContext = c;
        this.shapes = shapes;
        this.title = title;
        this.loc = loc;
        this.containst = containst;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return title.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

//            grid = new View(mContext);
            grid = inflater.inflate(R.layout.grid, null);
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            textView.setText(title.get(position));
            LinearLayout li  = (LinearLayout) grid.findViewById(R.id.card_view);
            if(shapes.get(position) == 4)
            {
                li.setBackgroundColor(Color.parseColor("#CCCC00"));
            }
            else if(shapes.get(position) == 5)
            {
                li.setBackgroundColor(Color.parseColor("#00FF00"));
            }
            else if(shapes.get(position) == 6)
            {
                li.setBackgroundColor(Color.parseColor("#FF0000"));
            }


        } else {
            grid = (View) convertView;
        }

        return grid;
    }
}