package gear.yc.com.gearapplication.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.View;

import java.sql.Time;

import gear.yc.com.gearapplication.BaseActivity;
import gear.yc.com.gearapplication.R;
import gear.yc.com.gearapplication.databinding.ActivityDatabindingBinding;
import gear.yc.com.gearapplication.pojo.User;

/**
 * GearApplication
 * Created by YichenZ on 2016/3/23 15:25.
 */
public class DataBindingActivity extends BaseActivity {
    User user;
    ActivityDatabindingBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUI();

        new Thread(runnable).start();
    }

    @Override
    public void initUI() {
        super.initUI();
        binding = DataBindingUtil.setContentView(this, R.layout.activity_databinding);
        user=new User();
        user.setId("2213");
        user.setUser("Joker");
        user.setPwd("123123");
        binding.setUser(user);
    }

    Runnable runnable =new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(3000);
                user.setPwd("321321");
                binding.setUser(user);
                handler.sendEmptyMessage(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    Handler handler =new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

        }
    };
}
