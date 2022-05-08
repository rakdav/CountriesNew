package com.main.countries;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;

import com.main.countries.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<Country> states = new ArrayList<Country>();
    private DBCountries dbCountries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        dbCountries=new DBCountries(this);
       // setInitialData();
        states=dbCountries.selectAll();
        RecyclerView recyclerView = findViewById(R.id.list);
        StateAdapter adapter = new StateAdapter(this, states);
        recyclerView.setAdapter(adapter);
        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AddActivity.class);
                startActivity(intent);
            }
        });
    }
    private void setInitialData(){
        dbCountries.Insert("Бразилия", "Бразилиа");
        dbCountries.Insert("Аргентина", "Буэнос-Айрес");
        dbCountries.Insert("Колумбия", "Богота");
    }


}