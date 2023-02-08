package com.example.assignment1mc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.assignment1mc.databinding.ActivitySecondBinding;

public class second extends AppCompatActivity {
    ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String role = intent.getStringExtra("role");
        binding.musiccheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.musiccheckbox.isChecked()) {
                    binding.musicrating.setVisibility(View.VISIBLE);
                } else {
                    binding.musicrating.setVisibility(View.INVISIBLE);
                }
            }
        });

        binding.dancecheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.dancecheckbox.isChecked()) {
                    binding.dancerating.setVisibility(View.VISIBLE);
                } else {
                    binding.dancerating.setVisibility(View.INVISIBLE);
                }
            }
        });
        binding.playcheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.playcheckbox.isChecked()) {
                    binding.playrating.setVisibility(View.VISIBLE);
                } else {
                    binding.playrating.setVisibility(View.INVISIBLE);
                }
            }
        });

        binding.fashioncheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.fashioncheckbox.isChecked()) {
                    binding.fashionrating.setVisibility(View.VISIBLE);
                } else {
                    binding.fashionrating.setVisibility(View.INVISIBLE);
                }
            }
        });

        binding.foodcheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.foodcheckbox.isChecked()) {
                    binding.foodrating.setVisibility(View.VISIBLE);
                } else {
                    binding.foodrating.setVisibility(View.INVISIBLE);
                }
            }
        });
        binding.clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.musiccheckbox.setChecked(false);
                binding.musicrating.setVisibility(View.INVISIBLE);
                binding.musicrating.setRating(0);
                binding.dancecheckbox.setChecked(false);
                binding.dancerating.setVisibility(View.INVISIBLE);
                binding.dancerating.setRating(0);
                binding.playcheckbox.setChecked(false);
                binding.playrating.setVisibility(View.INVISIBLE);
                binding.playrating.setRating(0);
                binding.fashioncheckbox.setChecked(false);
                binding.fashionrating.setVisibility(View.INVISIBLE);
                binding.fashionrating.setRating(0);
                binding.foodcheckbox.setChecked(false);
                binding.foodrating.setVisibility(View.INVISIBLE);
                binding.foodrating.setRating(0);
            }
        });

        binding.submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(second.this, "Your Response Have Been Recorded", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(second.this, third.class);
                intent.putExtra("name", name);
                intent.putExtra("role", role);
                intent.putExtra("music_box", binding.musiccheckbox.isChecked());
                intent.putExtra("dance_box", binding.dancecheckbox.isChecked());
                intent.putExtra("play_box", binding.playcheckbox.isChecked());
                intent.putExtra("fashion_box", binding.fashioncheckbox.isChecked());
                intent.putExtra("food_box", binding.foodcheckbox.isChecked());
                intent.putExtra("music_rating", binding.musicrating.getRating());
                intent.putExtra("dance_rating", binding.dancerating.getRating());
                intent.putExtra("play_rating", binding.playrating.getRating());
                intent.putExtra("fashion_rating", binding.fashionrating.getRating());
                intent.putExtra("food_rating", binding.foodrating.getRating());
                startActivity(intent);

            }
        });


    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("State", "State of Activity second Changed From Resumed to Paused");
        Toast.makeText(second.this, "State Of Activity second Changed From Resumed to Paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("State","Activity second restarts");
        Toast.makeText(second.this, "Activity second restarts", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("State","Activity second destroyed");
        Toast.makeText(second.this, "Activity second Destroyed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("State","Activity second starts");
        Toast.makeText(second.this, "Activity second starts", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("State","Activity second stopped");
        Toast.makeText(second.this, "Activity second stopped", Toast.LENGTH_SHORT).show();
    }
}