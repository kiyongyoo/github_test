package com.example.textview;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //뷰의 주소값을 담을 참조 변수를 선언
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // id 속성이 Text2인 뷰의 주소 값을 얻어온다.
        text1 = (TextView)findViewById(R.id.Text2);
        // 새로운 문자열을 설정한다.
        text1.setText("새로운 문자열");
    }
}