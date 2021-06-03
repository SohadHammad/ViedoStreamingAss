package com.example.viedostreamingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.viedo1);
        btn2=findViewById(R.id.viedo2);
        btn3=findViewById(R.id.viedo3);
        btn4=findViewById(R.id.viedo4);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         intent("https://firebasestorage.googleapis.com/v0/b/mccfirebase-ff14c.appspot.com/o/VID-20210509-WA0000.mp4?alt=media&token=dccbe9ef-d65c-47ea-94a6-ccd220a312cd");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent("https://firebasestorage.googleapis.com/v0/b/projmcc-aa2b6.appspot.com/o/%D8%A7%D9%84%D9%82%D8%AF%D8%B3..%20%D9%85%D8%B3%D8%AA%D9%88%D8%B7%D9%86%D9%88%D9%86%20%D9%8A%D8%B9%D8%AA%D8%AF%D9%88%D9%86%20%D8%B9%D9%84%D9%89%20%D9%85%D9%88%D8%A7%D8%A6%D8%AF%20%D8%A5%D9%81%D8%B7%D8%A7%D8%B1%20%D9%81%D9%8A%20_%D8%A7%D9%84%D8%B4%D9%8A%D8%AE%20%D8%AC%D8%B1%D8%A7%D8%AD_.mp4?alt=media&token=f35bfbf3-2e9d-4f1f-88b7-dc3ecccb89e2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent("https://firebasestorage.googleapis.com/v0/b/projmcc-aa2b6.appspot.com/o/%D9%81%D9%8A%D8%AF%D9%8A%D9%88%20%D8%B5%D8%A7%D8%AF%D9%85%20%D9%84%D9%82%D9%88%D8%A7%D8%AA%20%D8%A7%D9%84%D8%A7%D8%AD%D8%AA%D9%84%D8%A7%D9%84%20%D8%AA%D8%B9%D8%AA%D8%AF%D9%8A%20%D8%B9%D9%84%D9%89%20%D9%81%D8%AA%D9%8A%D8%A7%D8%AA%20%D9%81%D9%84%D8%B3%D8%B7%D9%8A%D9%86%D9%8A%D8%A7%D8%AA%20%D9%88%D8%AA%D8%B9%D8%AA%D9%82%D9%84%20%D8%B9%D8%AF%D8%AF%D8%A7%20%D9%85%D9%86%D9%87%D9%86.mp4?alt=media&token=456996d8-dcea-4fdb-9c97-52d76fabc281");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent("https://firebasestorage.googleapis.com/v0/b/projmcc-aa2b6.appspot.com/o/%D9%85%D8%A6%D8%A9%20%D8%AC%D8%B1%D9%8A%D8%AD%20%D9%81%D9%84%D8%B3%D8%B7%D9%8A%D9%86%D9%8A%20%D9%86%D8%AA%D9%8A%D8%AC%D8%A9%20%D8%A7%D9%84%D9%85%D9%88%D8%A7%D8%AC%D9%87%D8%A7%D8%AA%20%D9%85%D8%B9%20%D9%82%D9%88%D8%A7%D8%AA%20%D8%A7%D9%84%D8%A7%D8%AD%D8%AA%D9%84%D8%A7%D9%84%20%D8%A7%D9%84%D8%A5%D8%B3%D8%B1%D8%A7%D8%A6%D9%8A%D9%84%D9%8A.mp4?alt=media&token=28f2254f-ffce-419b-b0f9-9bddeda047f3");

            }
        });

    }
    public  void intent(String url){
        Intent i =new Intent(this,ViedoActivity.class);
        i.putExtra("Url",url);
        startActivity(i);
    }
}