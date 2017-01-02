package cn.edu.gdmec.s07150638.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.zip.Inflater;

import cn.edu.gdmec.s07150638.toast.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toast_layout);
        initEvent();
    }

    private void initEvent() {
        // 显示默认Toast
        findViewById(R.id.toast_bt1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast1();
            }
        });
        // 显示改变位置的Toast
        findViewById(R.id.toast_bt2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast2();
            }
        });
        // 显示图片的Toast
        findViewById(R.id.toast_bt3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast3();
            }
        });
        // 显示自定义的Toast
        findViewById(R.id.toast_bt4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast4();
            }
        });

    }

    private void showToast1() {
        Toast toast = Toast.makeText(MainActivity.this,"显示默认的Toast",Toast.LENGTH_SHORT);
        toast.show();
    }

    private void showToast2() {
        Toast toast = Toast.makeText(MainActivity.this, "显示改变位置的Toast", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    private void showToast3() {
        Toast toast = Toast.makeText(MainActivity.this,"显示带图片的Toast",Toast.LENGTH_SHORT);
        LinearLayout linear_toast = (LinearLayout) toast.getView();
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.topimg);
        linear_toast.addView(image,0);
        toast.show();
    }

    private void showToast4() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View toast_view = inflater.inflate(R.layout.toast_1,null);
        Toast toast = new Toast(this);
        toast.setView(toast_view);
        toast.show();
    }
}
