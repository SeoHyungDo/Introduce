package com.example.user.introduce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button enter,info; /* 버튼선언 */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* 선언 */
        enter = findViewById(R.id.enter);
        info = findViewById(R.id.info);
    }

    public void enter(View view){ /* 메인화면에서 입장 클릭시 */
        Intent go_enter = new Intent(this, WaitingRoom.class);
        startActivity(go_enter);
        finish();

    }


    public void info(View view){ /* 메인화면에서 개발자 정보 클릭시 */
        Intent go_Info = new Intent(this, dev_Info.class);
        startActivity(go_Info);
        finish();
    }
}
