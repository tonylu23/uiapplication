package com.tony.uiapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    private Button mVCardView;
    private Button mVAppBarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        mVCardView = (Button) findViewById(R.id.cardviewBtn);
        mVAppBarLayout = (Button) findViewById(R.id.appBarLayout);
        mVCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this, CardViewActivity.class));
            }
        });
        mVAppBarLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this, AppBarLayoutActivity.class));
            }
        });
    }
}
