package com.example.administrator.aroutertest;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by Administrator on 2018/5/10.
 */
@Route(path = "/com/Activity1")
public class TestActivity1 extends Activity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

//        setContentView(R.layout.another);
    }
}
