package com.example.assignment1mc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.TokenWatcher;
import android.util.Log;
import android.widget.Toast;

import com.example.assignment1mc.databinding.ActivitySecondBinding;
import com.example.assignment1mc.databinding.ActivityThirdBinding;

public class third extends AppCompatActivity {
    ActivityThirdBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityThirdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        binding.displayname.setText(intent.getStringExtra("name"));
        binding.displayrole.setText(intent.getStringExtra("role"));
        if (intent.getBooleanExtra("music_box", true)) {
            binding.musicb.setChecked(true);
            Float rating = intent.getFloatExtra("music_rating", 0);
            binding.musicr.setRating(rating);
        }
        if (intent.getBooleanExtra("dance_box", true)) {
            binding.danceb.setChecked(true);
            Float rating = intent.getFloatExtra("dance_rating", 0);
            binding.dancer.setRating(rating);
        }
        if (intent.getBooleanExtra("play_box", true)) {
            binding.playb.setChecked(true);
            Float rating = intent.getFloatExtra("play_rating", 0);
            binding.playr.setRating(rating);
        }
        if (intent.getBooleanExtra("fashion_box", true)) {
            binding.fashionb.setChecked(true);
            Float rating = intent.getFloatExtra("fashion_rating", 0);
            binding.fashionr.setRating(rating);
        }
        if (intent.getBooleanExtra("food_box", true)) {
            binding.foodb.setChecked(true);
            Float rating = intent.getFloatExtra("food_rating", 0);
            binding.foodr.setRating(rating);
        }
        binding.musicb.setEnabled(false);
        binding.danceb.setEnabled(false);
        binding.playb.setEnabled(false);
        binding.fashionb.setEnabled(false);
        binding.foodb.setEnabled(false);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("State", "State of Activity third Changed From Resumed to Paused");
        Toast.makeText(third.this, "State Of Activity third Changed From Resumed to Paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("State", "State of Activity third restarts");
        Toast.makeText(this, "Activity third restarts", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("State", "Activity third destroyed");
        Toast.makeText(this, "Activity third Destroyed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("State", "Activity third starts");
        Toast.makeText(this, "Activity third starts", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("State", "Activity third stopped");
        Toast.makeText(this, "Activity third stopped", Toast.LENGTH_SHORT).show();
    }
}