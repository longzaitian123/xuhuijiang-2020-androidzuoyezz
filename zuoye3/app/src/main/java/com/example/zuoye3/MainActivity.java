package com.example.zuoye3;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.example.zuoye3.util.DateUtil;
public class MainActivity extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener{
    private TextView a_control;
    private TextView  a_bbs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a_control=findViewById(R.id.a_control);
        a_control.setOnClickListener(this);
        a_control.setOnLongClickListener(this);

        a_bbs=findViewById(R.id.a_bbs);
        a_bbs.setOnClickListener(this);
        a_bbs.setOnLongClickListener(this);
        //设置ltswb文本的移动方式为滚动形式
        a_bbs.setMovementMethod(new ScrollingMovementMethod());
    }
    private String[] mChatStr={"开黑啊","外面下雨了吗","今天天气真不错","你是谁","哇塞，你好列害啊",};
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.a_control||v.getId()==R.id.a_bbs){
            //生成0到4的随机数字
            int random=(int)(Math.random()*10)%5;
            //拼接聊天内容
            String newStr=String.format("%s\n%s %s",a_bbs.getText().toString(), DateUtil.getNowTime(),mChatStr[random]);
            //设置ltswb文本内容
            a_bbs.setText(newStr);
        }
    }
    @Override
    public boolean onLongClick(View v) {
        if(v.getId()==R.id.a_control||v.getId()==R.id.a_bbs){
            a_bbs.setText("");
        }
        return true;
    }
}