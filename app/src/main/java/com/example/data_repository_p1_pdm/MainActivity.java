package com.example.data_repository_p1_pdm;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Button photosButton;
    private Button textButton;
    private Button cameraButton;
    private GridLayout photosLayout;
    private GridLayout textLayout;
    private GridLayout fullScreenLayout;


    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private ImageView fullScreenImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        photosButton = findViewById(R.id.photosButton);
        textButton = findViewById(R.id.textButton);
        cameraButton = findViewById(R.id.cameraButton);
        photosLayout = findViewById(R.id.photosLayout);
        textLayout = findViewById(R.id.textLayout);
        fullScreenLayout = findViewById(R.id.fullScreenLayout);
        fullScreenImageView = findViewById(R.id.fullScreenImageView);
        textButton.setBackground(getResources().getDrawable(R.drawable.border, null));
        textButton.setTextColor(Color.GRAY);
        photosButton.setBackground(getResources().getDrawable(R.drawable.border_btn, null));
        photosButton.setTextColor(Color.WHITE);

        img1 = findViewById(R.id.img1ImageView);
        img2 = findViewById(R.id.img2ImageView);
        img3 = findViewById(R.id.img3ImageView);
        img4 = findViewById(R.id.img4ImageView);

        photosButton.setOnClickListener((v) -> {
            photosLayout.setVisibility(View.VISIBLE);
            textLayout.setVisibility(View.GONE);
            fullScreenLayout.setVisibility(View.GONE);

            textButton.setBackground(getResources().getDrawable(R.drawable.border_btn, null));
            textButton.setTextColor(Color.WHITE);
            photosButton.setBackground(getResources().getDrawable(R.drawable.border, null));
            photosButton.setTextColor(Color.GRAY);
            cameraButton.setVisibility(View.VISIBLE);
        });

        textButton.setOnClickListener((v) -> {
            photosLayout.setVisibility(View.GONE);
            textLayout.setVisibility(View.VISIBLE);
            fullScreenLayout.setVisibility(View.GONE);
            photosButton.setBackground(getResources().getDrawable(R.drawable.border_btn, null));
            photosButton.setTextColor(Color.WHITE);
            textButton.setBackground(getResources().getDrawable(R.drawable.border, null));
            textButton.setTextColor(Color.GRAY);
            cameraButton.setVisibility(View.INVISIBLE);
        });

        img1.setOnClickListener((v) -> {
            photosLayout.setVisibility(View.GONE);
            textLayout.setVisibility(View.GONE);
            fullScreenLayout.setVisibility(View.VISIBLE);
            cameraButton.setVisibility(View.GONE);
            fullScreenImageView.setImageDrawable(getResources().getDrawable(R.drawable.img1, null));
            fullScreenImageView.setContentDescription(getResources().getString(R.string.img1));
            photosButton.setBackground(getResources().getDrawable(R.drawable.border_btn, null));
            photosButton.setTextColor(Color.WHITE);

        });

        img2.setOnClickListener((v) -> {
            photosLayout.setVisibility(View.GONE);
            textLayout.setVisibility(View.GONE);
            fullScreenLayout.setVisibility(View.VISIBLE);
            cameraButton.setVisibility(View.GONE);
            fullScreenImageView.setImageDrawable(getResources().getDrawable(R.drawable.img2, null));
            fullScreenImageView.setContentDescription(getResources().getString(R.string.img2));
            photosButton.setBackground(getResources().getDrawable(R.drawable.border_btn, null));
            photosButton.setTextColor(Color.WHITE);
        });

        img3.setOnClickListener((v) -> {
            photosLayout.setVisibility(View.GONE);
            textLayout.setVisibility(View.GONE);
            fullScreenLayout.setVisibility(View.VISIBLE);
            cameraButton.setVisibility(View.GONE);
            fullScreenImageView.setImageDrawable(getResources().getDrawable(R.drawable.img3, null));
            fullScreenImageView.setContentDescription(getResources().getString(R.string.img3));
            photosButton.setBackground(getResources().getDrawable(R.drawable.border_btn, null));
            photosButton.setTextColor(Color.WHITE);
        });

        img4.setOnClickListener((v) -> {
            photosLayout.setVisibility(View.GONE);
            textLayout.setVisibility(View.GONE);
            fullScreenLayout.setVisibility(View.VISIBLE);
            cameraButton.setVisibility(View.GONE);
            fullScreenImageView.setImageDrawable(getResources().getDrawable(R.drawable.img4, null));
            fullScreenImageView.setContentDescription(getResources().getString(R.string.img3));
            photosButton.setBackground(getResources().getDrawable(R.drawable.border_btn, null));
            photosButton.setTextColor(Color.WHITE);
        });
    }
}
