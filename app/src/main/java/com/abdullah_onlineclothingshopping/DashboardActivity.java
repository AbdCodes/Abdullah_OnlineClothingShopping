package com.abdullah_onlineclothingshopping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import adapter.ItemsAdapter;
import model.Items;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView recyclerView;

    TextView tvWelcome;
    Button btnAddItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dashboard);
        List<Items> itemsList = new ArrayList<>();
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2 ));
        recyclerView.setAdapter(new ItemsAdapter(getApplicationContext(), itemsList));



        try {
            FileInputStream fos = openFileInput("items.txt");
            InputStreamReader isr = new InputStreamReader(fos);
            BufferedReader br = new BufferedReader(isr);
            String line = "";
            while ((line=br.readLine())!=null){
                String[] parts=line.split("->");
                String imgDrawable = parts[2];
                int id = getResources().getIdentifier(imgDrawable , "drawable", getPackageName());
                itemsList.add(new Items(parts[0], parts[1],id, parts[3]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }





        btnAddItem = findViewById(R.id.btnAddItem);
        btnAddItem.setOnClickListener(this);
        TextView tvWelcome = findViewById(R.id.tvWelcome);
        Bundle bundle = getIntent().getExtras();




    }


    @Override
    public void onClick(View v) {

        switch  (v.getId()){
            case R.id.btnAddItem:
                Intent intent=new Intent(DashboardActivity.this,AddItemActivity.class);
                startActivity(intent);
                break;

        }

    }
}
