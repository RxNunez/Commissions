package com.epicodus.commissions;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Bind(R.id.textView) TextView mAppNameTextView;
    @Bind(R.id.imageView2) ImageButton mImageView2;
    @Bind(R.id.imageView3) ImageButton mImageView3;
    @Bind(R.id.imageView4) ImageButton mImageView4;
    @Bind(R.id.imageView5) ImageView mImageView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Typeface PacificoFont = Typeface.createFromAsset(getAssets(), "fonts/Pacifico.ttf");
        mAppNameTextView.setTypeface(PacificoFont);

            mImageView5.setOnClickListener(this);
            mImageView4.setOnClickListener(this);
            mImageView3.setOnClickListener(this);
            mImageView2.setOnClickListener(this);

        }
    @Override
    public void onClick(View v) {
        if (v == mImageView2) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.firebase.com"));
            startActivity(webIntent);
        }
        if (v == mImageView3) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.deviantart.com"));
            startActivity(webIntent);
        }
        if (v == mImageView4) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.android.com"));
            startActivity(webIntent);
        }
        if (v == mImageView5) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.twitter.com"));
            startActivity(webIntent);

        }
    }
}
