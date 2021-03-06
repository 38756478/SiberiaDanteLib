package com.sample.ui.activity.view;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ImageSpan;
import android.widget.TextView;

import com.sample.R;
import com.sample.SampleApplication;
import com.sample.ui.activity.BaseActivity;
import com.siberiadante.lib.widget.CenterAlignImageSpan;

public class ImageSpanActivity extends BaseActivity {

    private TextView textViewNoLineSpace;
    private TextView textView;
    private TextView textViewCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_span);
        textViewNoLineSpace = (TextView) findViewById(R.id.tv_image_span_no_line_space);
        textView = (TextView) findViewById(R.id.tv_image_span);
        textViewCustom = (TextView) findViewById(R.id.tv_image_span_custom);

        SpannableString spannableStringNoLineSpace = new SpannableString("默认的ImageSpan显示无lineSpacingExtra默认的ImageSpan显示无lineSpacingExtra默认的ImageSpan显示无lineSpacingExtra");
        final ImageSpan imageSpanNoLineSpace  = new ImageSpan(this.getApplicationContext(), R.mipmap.ic_launcher, DynamicDrawableSpan.ALIGN_BASELINE);//默认ImageSpan
        spannableStringNoLineSpace.setSpan(imageSpanNoLineSpace, 0, 2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textViewNoLineSpace.setText(spannableStringNoLineSpace);


        SpannableString spannableString = new SpannableString("默认的ImageSpan显示默认的ImageSpan显示默认的ImageSpan显示默认的ImageSpan显示默认的ImageSpan显示默认的ImageSpan显示默认的ImageSpan显示默认的ImageSpan显示");
        final ImageSpan imageSpan = new ImageSpan(this.getApplicationContext(), R.mipmap.ic_launcher, DynamicDrawableSpan.ALIGN_BASELINE);//默认ImageSpan
        spannableString.setSpan(imageSpan, 0, 2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(spannableString);

        SpannableString spannableStringCustom = new SpannableString("测试图文混排测试图文混排测试图文混排测试图文混排测试图文混排测试图文混排测试图文混排测试图文混排测试图文混排测试图文混排测试图文混排测试图文混排测试图文混排测试图文混排测试图文混排测试图文混排测试图文混排测试图文混排");
        CenterAlignImageSpan span = new CenterAlignImageSpan(this.getApplicationContext(), R.mipmap.ic_launcher, ImageSpan.ALIGN_BASELINE);//重写的ImageSpan
        spannableStringCustom.setSpan(span, 0, 2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textViewCustom.setText(spannableStringCustom);
    }
}
