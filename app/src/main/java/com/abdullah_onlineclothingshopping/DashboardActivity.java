package com.abdullah_onlineclothingshopping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView recyclerView;
//    List<Items> itemsList = new ArrayList<>();

    TextView tvWelcome;
    Button btnAddItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
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
