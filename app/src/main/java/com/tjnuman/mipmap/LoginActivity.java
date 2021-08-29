package com.tjnuman.mipmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import br.com.simplepass.loading_button_lib.customViews.CircularProgressButton;
import br.com.simplepass.loading_button_lib.interfaces.OnAnimationEndListener;

public class LoginActivity extends AppCompatActivity {
    CircularProgressButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Bitmap myLogo = BitmapFactory.decodeResource(this.getResources(), R.drawable.checked);

        btn = (CircularProgressButton) findViewById(R.id.cirLoginButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn.startAnimation();
                btn.doneLoadingAnimation(R.color.black, myLogo);
                Intent intent = new Intent(LoginActivity.this, MapActivity.class);
                startActivity(intent);
                finish();

            }
        });

    }



}