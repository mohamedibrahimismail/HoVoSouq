package com.hazem.hovosouq.activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.hazem.hovosouq.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import butterknife.BindView;
import jp.wasabeef.blurry.Blurry;

public class Profile extends AppCompatActivity {

    ImageView cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        cover = (ImageView)findViewById(R.id.cover);

        Bitmap coverimage = BitmapFactory.decodeResource(getResources(), R.drawable.cover_image2);
        Blurry.with(this).radius(20).from(coverimage).into(cover);




    }
}
