package com.example.hpfolio.myfirstapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView) findViewById(R.id.tvData);
        Button btnBack = (Button) findViewById(R.id.btnBackData);

        Bundle bundle = getIntent().getExtras();
        String myData = bundle.getString("data");
        textView.setText(myData);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentForBackData = new Intent();
                intentForBackData.putExtra("datafromsecondactivity", "i am the dat aof second activity");
                setResult(Activity.RESULT_OK, intentForBackData);
                finish();
            }
        });

    }
}
