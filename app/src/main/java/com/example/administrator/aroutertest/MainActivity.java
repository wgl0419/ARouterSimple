package com.example.administrator.aroutertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;


public class MainActivity extends AppCompatActivity {

    private Button another;
    private Button other;


    private MainActivity instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instance = this;

        another = findViewById(R.id.tv_another);
        other = findViewById(R.id.tv_other);

        another.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //发起路由跳转
//                Intent intent = new Intent(instance, AnotherActivity.class);
//                startActivity(intent);
                ARouter.getInstance().build("/first/firstTestActivity")
                        .withString("key3", "another")
                        .navigation();

            }
        });
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ARouter.getInstance().build("/other/otheractivity").withString("key3", "other").navigation();
//                Intent intent = new Intent(instance, OtherActivity.class);
//                startActivity(intent);
            }
        });
    }
}
