package com.example.othertest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by Administrator on 2018/5/10.
 */

@Route(path = "/other/otheractivity")
public class OtherActivity extends AppCompatActivity {


    private Button other;
    private final String TAG = OtherActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.other_layout);

        other = findViewById(R.id.tv_other);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {

            String str = bundle.getString("key3");
            Log.e(TAG, " aaa " + str);
        } else {


            Log.e(TAG, " aaa 没有bundle");
        }


        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ARouter.getInstance().build("/main/main")
                        .withString("key3","other")
                        .navigation();
                finish();
            }
        });

    }

}
