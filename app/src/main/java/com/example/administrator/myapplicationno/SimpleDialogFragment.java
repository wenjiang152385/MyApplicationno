package com.example.administrator.myapplicationno;

import android.app.DialogFragment;
import android.graphics.Color;
import android.graphics.RadialGradient;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


/**
 * Created by Administrator on 2016/9/23 0023.
 */
public class SimpleDialogFragment extends DialogFragment {

    private IDialogFragment mIDialogFragment;

    private TextView mTitle;
    private TextView mContent;
    private Button mSubmit;
    private String title;
    private String content;
    private String submit;
    private Window window;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = setViewParams(inflater, container, savedInstanceState);
        initViews(view);
//        mTitle.setText(title);
//        mContent.setText(content);
//        mSubmit.setText(submit);
//        mSubmit.setOnClickListener(mOnClickListener);
        return view;
    }

    public void setOnButtonClickListener(IDialogFragment iDialogFragment) {
        mIDialogFragment = iDialogFragment;
    }

//    public void setTitle(String text) {
//        title = text;
//    }
//
//    public void setContent(String text) {
//        content = text;
//    }
//
//    public void setSubmit(String text) {
//        submit = text;
//    }

    private void initViews(View view) {
//        mTitle = (TextView) view.findViewById(R.id.dialog_title);
//        mContent = (TextView) view.findViewById(R.id.content);
//        mSubmit = (Button) view.findViewById(R.id.submit);


        radioButton1 = (RadioButton) view.findViewById(R.id.rb1);
        radioButton2 = (RadioButton) view.findViewById(R.id.rb2);
        radioButton3 = (RadioButton) view.findViewById(R.id.rb3);

    }

    private View setViewParams(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        window = getDialog().getWindow();
       //window.setBackgroundDrawableResource(R.drawable.backs);

        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view = inflater.inflate(R.layout.layout_simple_dialog, ((ViewGroup) window.findViewById(android.R.id.content)), false);
       window.setBackgroundDrawable(new ColorDrawable(Color.BLACK));

        UIUtils toolUtils = new UIUtils();
        window.setLayout((int) (toolUtils.getDisplayMetrics(getActivity()).widthPixels / 1.5),
                (int) (toolUtils.getDisplayMetrics(getActivity()).heightPixels / 1.5));

        return view;

    }


    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.submit:
                    mIDialogFragment.onDialogFragmentButtonClickListener();
//                    SimpleDialogFragment.this.dismiss();
                    break;
                default:
                    break;
            }
        }
    };

}
