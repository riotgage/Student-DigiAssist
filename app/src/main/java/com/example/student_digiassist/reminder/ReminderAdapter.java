package com.example.student_digiassist.reminder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.student_digiassist.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

class ReminderAdapter extends ArrayAdapter<reminderModel> {

    private Context mcontext;
    ArrayList<reminderModel> reminderList;

    private static class ViewHolder{
        TextView date;
        TextView title;
        TextView desc;
        TextView time;
    }
    public ReminderAdapter(Context mcontext, ArrayList<reminderModel> reminderList) {
        super(mcontext, R.layout.row_item,reminderList);
        this.mcontext = mcontext;
        this.reminderList = reminderList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        reminderModel dataModel = getItem(position);
        ViewHolder viewHolder;

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_item, parent, false);
            viewHolder.title = convertView.findViewById(R.id.title);
            viewHolder.date = convertView.findViewById(R.id.date);
            viewHolder.desc = convertView.findViewById(R.id.description);
            viewHolder.time=convertView.findViewById(R.id.time);
            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        viewHolder.title.setText(dataModel.getTitle());
        viewHolder.date.setText(dataModel.getDate());
        viewHolder.desc.setText(dataModel.getDesc());
        viewHolder.time.setText(dataModel.getTime());
        return convertView;
    }
}
