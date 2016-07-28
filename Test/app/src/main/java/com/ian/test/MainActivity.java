package com.ian.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.array_adapter_test);

        ListView list1 = (ListView) findViewById(R.id.list1);

        String[] arr1 = {"孙悟空","猪八戒","沙和尚"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.array_item
            , arr1);

        list1.setAdapter(adapter1);

        ListView list2 = (ListView)findViewById(R.id.list2);

        String[] arr2 = {"Java", "Hibernate", "Spring", "Android"};

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,R.layout.array_item
            ,arr2);
        list2.setAdapter(adapter2);
    }

    public void clickHandler(View source){

        TextView tv = (TextView)findViewById(R.id.show);
        tv.setText("Hello Android-" + new java.util.Date());
    }
}
