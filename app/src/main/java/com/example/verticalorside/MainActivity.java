package com.example.verticalorside;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;
    private final int MP = ViewGroup.LayoutParams.MATCH_PARENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        int orientation = getResources().getConfiguration().orientation;

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            slideLayout();
        } else {
            verticalLayout();
        }


    }

    public void verticalLayout() {

        LinearLayout linearLayout = new LinearLayout(this);
        // 垂直方向
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        // linearLayoutをContentViewにセット
        setContentView(linearLayout);

        // TextView インスタンス生成
        TextView textView = new TextView(this);
        textView.setText("今は縦画面です");
        linearLayout.addView(textView, new LinearLayout.LayoutParams(WC, WC));


        TextView textView2 = new TextView(this);
        textView2.setText("縦に並べる");

        linearLayout.addView(textView2, new LinearLayout.LayoutParams(WC,WC));

        TextView textView3 = new TextView(this);
        textView3.setText("縦画面だけにね");

        linearLayout.addView(textView3, new LinearLayout.LayoutParams(WC,WC));



    }

    public void slideLayout() {

        LinearLayout linearLayout = new LinearLayout(this);
        // 垂直方向
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);

        // linearLayoutをContentViewにセット
        setContentView(linearLayout);

        // TextView インスタンス生成
        TextView textView = new TextView(this);
        textView.setText("今は横画面です");

        linearLayout.addView(textView, new LinearLayout.LayoutParams(WC, WC));

        TextView textView2 = new TextView(this);
        textView2.setText("横に並べる");

        linearLayout.addView(textView2, new LinearLayout.LayoutParams(WC,WC));

        TextView textView3 = new TextView(this);
        textView3.setText("横画面だけにね");

        linearLayout.addView(textView3, new LinearLayout.LayoutParams(WC,WC));


    }
}
