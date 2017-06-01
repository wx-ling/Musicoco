package com.duan.musicoco.fragment.lyric;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.duan.musicoco.R;

/**
 * Created by DuanJiaNing on 2017/5/30.
 */

public class LyricFragment extends Fragment implements ViewContract, View.OnClickListener {

    public static final String TAG = "LyricFragment";

    private PresenterContract presenter;

    private View view;

    //触摸事件时是否为点击
    private boolean isClick = false;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_play_lyric, null);
        initViews(view, null);

        return view;
    }

    @Override
    public void setPresenter(PresenterContract presenter) {
        this.presenter = presenter;
    }

    @Override
    public void initViews(@Nullable View view, Object obj) {
        view.findViewById(R.id.play_lyric_root).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return false;
//                switch (event.getAction()) {
//                    case MotionEvent.ACTION_DOWN:
//                        isClick = true;
//                        return true;
//                    case MotionEvent.ACTION_MOVE:
//                        isClick = false;
//                        return false;
//                    case MotionEvent.ACTION_UP:
//                        if (isClick)
//                            getActivity().onBackPressed();
//                        break;
//                }
//                return false;
            }
        });
    }

    @Override
    public void showFragment(Animation.AnimationListener f) {
        Animation show = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_in_top);
        show.setAnimationListener(f);
        view.startAnimation(show);
    }

    @Override
    public void hideFragment(Animation.AnimationListener f) {
        Animation hide = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_out_top);
        hide.setAnimationListener(f);
        view.startAnimation(hide);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
        }
    }
}