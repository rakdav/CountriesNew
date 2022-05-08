package com.main.countries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {
    private EditText name,capital;
    private Button ok;
    private DBCountries db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        name=findViewById(R.id.nameAdd);
        capital=findViewById(R.id.capitalAdd);
        ok=findViewById(R.id.ok);
        db=new DBCountries(this);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.Insert(name.getText().toString(),capital.getText().toString());
                finish();
            }
        });
    }
}