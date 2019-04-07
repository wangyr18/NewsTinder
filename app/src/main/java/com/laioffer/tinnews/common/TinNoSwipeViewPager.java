package com.laioffer.tinnews.common;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class TinNoSwipeViewPager extends ViewPager {
    public TinNoSwipeViewPager(Context context) {
        super(context);
    }

    public TinNoSwipeViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return false;//super.onInterceptTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return false;//super.onTouchEvent(event);
    }
}
