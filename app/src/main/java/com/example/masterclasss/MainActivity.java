package com.example.masterclasss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private com.example.masterclasss.databinding.ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = com.example.masterclasss.databinding.ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (binding.password.getText().toString().equals("admin")) {
                   binding.password.setVisibility(View.GONE);
                   binding.name.setVisibility(View.GONE);
                   binding.registration.setVisibility(View.GONE);
                   binding.welcome.setText("Привет" + binding.name.getText());
                   Toast.makeText(MainActivity.this, "Добро плжаловать", Toast.LENGTH_SHORT).show();
               }
            }
        });
    }
}