package ru.smeleyka.a3mira;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by smeleyka on 20.03.18.
 */

public class BottomNavigationViewBehavior extends CoordinatorLayout.Behavior<BottomNavigationView> {
    private static final String TAG = "BotNavVieBehavior.class";

    private int height;

    public BottomNavigationViewBehavior() {
        super();
    }

    public BottomNavigationViewBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.d(TAG,"Second Constructor");

    }

    @Override
    public boolean onTouchEvent(CoordinatorLayout parent, BottomNavigationView child, MotionEvent ev) {
        Log.d(TAG,ev.toString());
        return super.onTouchEvent(parent, child, ev);
    }

    @Override
    public boolean onLayoutChild(CoordinatorLayout parent, BottomNavigationView child, int layoutDirection) {
        height = child.getHeight();
        return super.onLayoutChild(parent, child, layoutDirection);
    }

    @Override
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout,
                                       @NonNull BottomNavigationView child,
                                       @NonNull View directTargetChild,
                                       @NonNull View target, int axes, int type) {
        Log.d(TAG,String.valueOf(axes));
        return axes == ViewCompat.SCROLL_AXIS_VERTICAL;
    }

    @Override
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomNavigationView child,
                               @NonNull View target,
                               int dxConsumed, int dyConsumed,
                               int dxUnconsumed, int dyUnconsumed,
                               @ViewCompat.NestedScrollType int type)
    {
        if (dyConsumed > 0) {
            slideDown(child);
        } else if (dyConsumed < 0) {
            slideUp(child);
        }
    }

    private void slideUp(BottomNavigationView child) {
        child.clearAnimation();
        child.animate().translationY(0).setDuration(200);
    }

    private void slideDown(BottomNavigationView child) {
        child.clearAnimation();
        child.animate().translationY(height).setDuration(200);
    }
}