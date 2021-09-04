package com.example.imageview;

import android.text.Html;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //뷰의 주소 값을 담을 참조변수
    ImageView img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //뷰의 주소 값을 받아온다.
        img3 = (ImageView)findViewById(R.id.imageView6);
        //이미지를 셋팅한다.
        img3.setImageResource(R.drawable.pngwing1);

    }
}