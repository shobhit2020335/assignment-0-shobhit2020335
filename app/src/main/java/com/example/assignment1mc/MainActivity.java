package com.example.assignment1mc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.assignment1mc.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void gosecond(View v) {
        if (binding.inputname.getText().toString().isEmpty()) {
            binding.inputname.setError("Required");
            binding.inputname.requestFocus();
        }
        else if (binding.inputrole.getText().toString().isEmpty()) {
            binding.inputrole.setError("Required");
            binding.inputrole.requestFocus();
        }
        else {
            Intent intent = new Intent(this, second.class);
            intent.putExtra("name", binding.inputname.getText().toString());
            intent.putExtra("role", binding.inputrole.getText().toString());
            startActivity(intent);

        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("State", "State of Activity MainActivity Changed From Resumed to Paused");
        Toast.makeText(MainActivity.this, "State Of Activity MainActivity Changed From Resumed to Paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("State","Activity MainActivity restarts");
        Toast.makeText(MainActivity.this, "Activity MainActivity restarts", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("State","Activity MainActivity destroyed");
        Toast.makeText(MainActivity.this, "Activity MainActivity Destroyed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("State","Activity MainActivity starts");
        Toast.makeText(MainActivity.this, "Activity MainActivity starts", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("State","Activity MainActivity stopped");
        Toast.makeText(MainActivity.this, "Activity MainActivity stopped", Toast.LENGTH_SHORT).show();
    }

}