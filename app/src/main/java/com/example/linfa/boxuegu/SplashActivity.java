package com.example.linfa.boxuegu;
/**
 * @date 2018/3/19
 * @author skylinelin
 */

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    private TextView tv_version;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        initViews();
    }

    private void initViews() {
        tv_version = findViewById(R.id.tv_version);

        //获取版本信息
        try {
            PackageInfo info = getPackageManager().getPackageInfo(getPackageName(), 0);
            tv_version.setText("V" + info.versionName);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            tv_version.setText("V");
        }

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, RegisterActivity.class);
                startActivity(intent);
                SplashActivity.this.finish();
            }
        };
        //三秒后启动
        timer.schedule(task, 3000);
    }
}
