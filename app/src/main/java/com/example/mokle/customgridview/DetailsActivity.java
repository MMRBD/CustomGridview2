package com.example.mokle.customgridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        textView = (TextView) findViewById(R.id.letterText);

        String letter = "";
        Bundle bundle = getIntent().getExtras();
        letter = bundle.getString("letter");
        textView.setText(letter);
        Toast.makeText(DetailsActivity.this, "Cliked: "+letter, Toast.LENGTH_SHORT).show();
    }
}
