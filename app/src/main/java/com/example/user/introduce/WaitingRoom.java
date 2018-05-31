package com.example.user.introduce;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WaitingRoom extends MainActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.waitingroom);

        back = findViewById(R.id.go_back);

    }


    public void go_back(View view){  /* 어플 초기화면으로 이동 */
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
        finish();
    }

}
