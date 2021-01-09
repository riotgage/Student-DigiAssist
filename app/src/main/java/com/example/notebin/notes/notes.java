package com.example.notebin.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.notebin.CustomGrid;
import com.example.notebin.R;

import java.util.ArrayList;

public class notes extends AppCompatActivity {
    GridView grid;
    LinearLayout li;
    EditText title,contain;
    ArrayList<String> title_list = new ArrayList<String>();
    ArrayList<String> contain_list = new ArrayList<String>();
    ArrayList<Integer> shapes = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        title_list.add("Anirudh");
        title_list.add("Rohit");
        title_list.add("Abhishek");
        title_list.add("Tanay");
        title_list.add( "Yash");
        contain_list.add("Anirudh is briliant");
        contain_list.add("Rohit is smart");
        contain_list.add("Abhishek is in vit");
        contain_list.add("Tanay is strong");
        contain_list.add("Yash is best friend");
        shapes.add(1);
        shapes.add(2);
        shapes.add(3);
        shapes.add(2);
        shapes.add(3);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        li = (LinearLayout)findViewById(R.id.new_note_linear);
        title = (EditText) findViewById(R.id.title_notes);
        contain = (EditText) findViewById(R.id.contain_notes);
        CustomGrid adapter = new CustomGrid(notes.this, title_list,shapes,-1,"");
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(notes.this, "You Clicked at " + title_list.get(+position), Toast.LENGTH_SHORT).show();
                title.setText(title_list.get(position));
                contain.setText(contain_list.get(position));
                ViewGroup.LayoutParams params = li.getLayoutParams();
                params.height = 600;
                li.setLayoutParams(params);
            }
        });
    }

    public void insert(View view) {

        ViewGroup.LayoutParams params = li.getLayoutParams();
        if(params.height != 600)
        {
            params.height = 600;
            li.setLayoutParams(params);
        }
        else
        {
            params.height = 1;
            li.setLayoutParams(params);

        }

    }

    public void add(View view) {
        ViewGroup.LayoutParams params = li.getLayoutParams();
        params.height = 1;
        li.setLayoutParams(params);
        String t = title.getText().toString();
        String c = contain.getText().toString();
        if(t!= ""&&c!="")
        {
            for(int i = 0;i<title_list.size();i++)
            {
                if(title_list.get(i).equals(t))
                {
                    title_list.set(i, t);
                    contain_list.set(i, c);
                    shapes.add(3);
                    CustomGrid adapter = new CustomGrid(notes.this, title_list,shapes,-1,"");
                    grid.setAdapter(adapter);
                    Toast.makeText(notes.this, "Updated", Toast.LENGTH_SHORT).show();
                    return;
                }
            }

            title_list.add(0,t);
            contain_list.add(0,c);
            CustomGrid adapter = new CustomGrid(notes.this, title_list,shapes,-1,"");
            grid.setAdapter(adapter);
            Toast.makeText(notes.this, "Inserted", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(notes.this, "Invalid Data please re insert", Toast.LENGTH_SHORT).show();
        }

    }
}
