package com.example.administrator.myapplication2;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.hanks.htextview.HTextView;
import com.hanks.htextview.HTextViewType;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {
    @InjectView(R.id.text2)
    HTextView mText2;
    @InjectView(R.id.iv_name)
    TextView mIvName;
    @InjectView(R.id.iv_passwod)
    TextView mIvPasswod;
    @InjectView(R.id.activity_main)
    RelativeLayout mActivityMain;
    private HTextView hTextView;

    /**
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     */
    private GoogleApiClient mClient;
    private HTextView mHTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.inject(this);

        //ctrl + p  提示  txt
        //alt + enter 自动修复  ==  任何地方都可以 exe
        //ctrl + alt + space 自动提示   txt
        //ctrl + d 复制当前行
        //ctrl + y / ctrl +x  删除当前行  shift + del
        //ctrl + alt + o  导包
        //ctrl + o  重写父类方法
        //alt + insert  获取get set 构造 toString 等等
        //sout   打印
        //F8  调试  shift + F9
        //ctrl + alt +F  变为成员变量
        //ctrl + f12  文件的结构
        //shift + F6  方法变量重命名
        //ctrl + /  单行注释
        //ctrl + shift + /  多行注释
        //ctrl + N  快速查找类并打开
        //alt + shift + 上下   /  ctrl + shift + 上下  移动代码
        //ctrl + alt + T  包裹代码 if-else - try_catch
        //ctrl + j  快速生成代码

        //ctrl + enter 在当前行上面再插入一行
        //shift+enter  在当前行下面再插入一行
        //ctrl+shift+enter 自动添加分号，光标自动跳到末尾


        //F2 定位到错误位置 或高亮位置

        //F5  复制文件
        //F4  + 光标在project 或 module 上   打开 project structure

        //ctrl + L 查找下一个 F3
        //shift + F3 查找上一个  crtl + shift + L
        //alt + F3 打开选中框查找本文件内容

        //ctrl + E 最近打开的文件

        //ctrl + shift + j  整合行

        //ctrl + alt + v 生成局部变量        !!!!
        //ctrl + alt + F 生成成员变量        !!!!


        //ctrl + shift + T 查看子类实现

        this.hTextView = (HTextView) findViewById(R.id.text2);
        this.hTextView.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                MainActivity.this.hTextView.setTextColor(Color.BLACK);
                MainActivity.this.hTextView.setBackgroundColor(Color.WHITE);
                MainActivity.this.hTextView.setTypeface(FontManager.getInstance(getAssets()).getFont
                        ("fonts/Mirza-Regular.ttf"));
                MainActivity.this.hTextView.setAnimateType(HTextViewType.FALL);
                MainActivity.this.hTextView.setDrawingCacheBackgroundColor(Color.DKGRAY);
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        mClient = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }






    @OnClick({R.id.text2, R.id.iv_name, R.id.iv_passwod})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.text2:
                break;
            case R.id.iv_name:
                break;
            case R.id.iv_passwod:
                break;
        }

    }
}
