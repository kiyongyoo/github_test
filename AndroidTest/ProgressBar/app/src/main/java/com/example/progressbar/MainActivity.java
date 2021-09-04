package com.example.progressbar;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //뷰의 주소 값을 담을 참조 변수
    ProgressBar bar4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bar4 = (ProgressBar) findViewById(R.id.progressBar4);
    }

    public void btn1Method(View view){
        bar4.incrementProgressBy(5);
    }
    public void btn2Method(View view){
        bar4.incrementProgressBy(-5);
    }
    public void btn3Methode(View view){
        bar4.incrementProgressBy(80);
    }
}