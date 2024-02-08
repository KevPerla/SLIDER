package com.example.slider;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.img1, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.img22, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.img3, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.img4, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.img5, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.img6, ScaleTypes.CENTER_CROP));

        ImageSlider imageSlider = findViewById(R.id.image_slider);
        imageSlider.setImageList(imageList);


        Button btnOfficialSite = findViewById(R.id.btnSite);
        btnOfficialSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.marvel.com/movies/avengers-endgame";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}