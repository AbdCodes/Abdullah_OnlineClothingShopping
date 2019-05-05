package com.abdullah_onlineclothingshopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DescriptionActivity extends AppCompatActivity {

    CircleImageView itemImage;
    TextView itemName,itemPrice,itemDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        itemImage=findViewById(R.id.itemImage);
        itemName=findViewById(R.id.itemName);
        itemPrice=findViewById(R.id.itemPrice);
        itemDescription=findViewById(R.id.itemDescription);

        Bundle bundle=getIntent().getExtras();

        if (bundle!=null){
          itemName.setText(bundle.getString("itemName"));
          itemImage.setImageResource(bundle.getInt("itemImage"));
          itemPrice.setText(bundle.getString("itemPrice"));
          itemDescription.setText(bundle.getString("itemDescription"));


        }

    }
}
