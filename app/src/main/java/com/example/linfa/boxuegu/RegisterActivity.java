package com.example.linfa.boxuegu;
/**
 * @date 2018/3/19
 * @author skylinelin
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    private TextView tv_main_bar; //标题
    private TextView tv_back; //返回按钮
    private Button btn_register; //注册按钮

    //用户名、密码、再次输入密码的控件
    private EditText et_user_name,et_psw,et_psw_again;

    //用户名、密码、再次输入密码的获取值
    private String userName,psw,pswAgain;

    //标题布局
    private RelativeLayout rl_title_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initViews();
    }

    private void initViews() {
        //从main_title_bar.xml获取相应的控件

    }
}
