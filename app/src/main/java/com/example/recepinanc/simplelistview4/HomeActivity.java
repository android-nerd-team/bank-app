package com.example.recepinanc.simplelistview4;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class HomeActivity extends ActionBarActivity {

    public static final String LIST_TYPE = "LIST_TYPE";
    private Button incomeButton;
    private Button giderButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incomeButton = (Button) findViewById(R.id.income_button);
        giderButton = (Button) findViewById(R.id.gider_button);

        incomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), ListFragmentActivity.class);
                a.putExtra(LIST_TYPE,1);
                startActivity(a);
            }
        });

        giderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), ListFragmentActivity.class);
                a.putExtra(LIST_TYPE,2);
                startActivity(a);
            }
        });

    }
}
