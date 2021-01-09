package com.example.notebin.expenses;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.notebin.CustomGrid;
import com.example.notebin.R;

import java.util.ArrayList;

public class AddExpense extends AppCompatActivity {

    GridView grid;
    TextView show;
    EditText details,amount;
    ArrayList<String> Detail_list = new ArrayList<String>();
   int total = 0;
    ArrayList<Integer> Code = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Detail_list.add("Taken From Anirudh \n [ -40 ] ");
        Code.add(6);
        Detail_list.add("Take From Rohit \n [ -100 ]");
        Code.add(6);
        Detail_list.add("Given To Yash \n [ +200 ]");
        Code.add(5);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expense);
        CustomGrid adapter = new CustomGrid(AddExpense.this, Detail_list,Code,-1,"");
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        show = (TextView)findViewById(R.id.grid_text);
        details = (EditText) findViewById(R.id.details);
        amount = (EditText) findViewById(R.id.amount);
        total = 60;
        show.setText(String.valueOf(total));
        show.setTextColor(Color.parseColor("#FF0000"));

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(AddExpense.this,  Detail_list.get(+position), Toast.LENGTH_SHORT).show();

            }
        });

    }

    public void insert(View view) {
        String t = details.getText().toString();
        String c = amount.getText().toString();
        if(t!= ""&&c!="")
        {
            Detail_list.add(0,t+"\n [ "+c+" ]");
                if(c.charAt(0) =='-')
                {

                    Code.add(0,6);
                }
                else
                {
                    Code.add(0,5);
                }
                total = total + Integer.parseInt(c.toString());
                details.setText("");
                amount.setText("");
            show.setText(String.valueOf(total));
            if(total<0)
                show.setTextColor(Color.parseColor("#FF0000"));
            else
                show.setTextColor(Color.parseColor("#00FF00"));
            Toast.makeText(AddExpense.this, "Expense Added ", Toast.LENGTH_SHORT).show();
            CustomGrid adapter = new CustomGrid(AddExpense.this, Detail_list,Code,-1,"");
            grid=(GridView)findViewById(R.id.grid);
            grid.setAdapter(adapter);
        }
        else
        {
            Toast.makeText(AddExpense.this, "Plz insert the proper values ", Toast.LENGTH_SHORT).show();
        }
    }
}
