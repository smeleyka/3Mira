package ru.smeleyka.a3mira;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;

/**
 * Created by smeleyka on 20.03.18.
 */

public class BottomNavigationViewBehavior extends CoordinatorLayout.Behavior<WebView> {
    private static final String TAG = "BotNavVieBehavior.class";

    private int height;

    public BottomNavigationViewBehavior() {
        super();
        Log.d(TAG,"First Constructor");

    }

    public BottomNavigationViewBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.d(TAG,"Second Constructor");

    }

    @Override
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams params) {
        Log.d(TAG,"onAttachedToLayoutParams");
        super.onAttachedToLayoutParams(params);
    }

    @Override
    public void onDetachedFromLayoutParams() {
        Log.d(TAG,"onDetachedFromLayoutParams");

        super.onDetachedFromLayoutParams();
    }

    @Override
    public boolean onInterceptTouchEvent(CoordinatorLayout parent, WebView child, MotionEvent ev) {
        Log.d(TAG,"onInterceptTouchEvent");

        return super.onInterceptTouchEvent(parent, child, ev);
    }

    @Override
    public boolean onTouchEvent(CoordinatorLayout parent, WebView child, MotionEvent ev) {
        Log.d(TAG,"onTouchEvent");

        return super.onTouchEvent(parent, child, ev);
    }

    @Override
    public int getScrimColor(CoordinatorLayout parent, WebView child) {
        Log.d(TAG,"getScrimColor");

        return super.getScrimColor(parent, child);
    }

    @Override
    public float getScrimOpacity(CoordinatorLayout parent, WebView child) {
        Log.d(TAG,"getScrimOpacity");

        return super.getScrimOpacity(parent, child);
    }

    @Override
    public boolean blocksInteractionBelow(CoordinatorLayout parent, WebView child) {
        Log.d(TAG,"blocksInteractionBelow");

        return super.blocksInteractionBelow(parent, child);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, WebView child, View dependency) {
        Log.d(TAG,"layoutDependsOn");

        return super.layoutDependsOn(parent, child, dependency);
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, WebView child, View dependency) {
        Log.d(TAG,"onDependentViewChanged");

        return super.onDependentViewChanged(parent, child, dependency);
    }

    @Override
    public void onDependentViewRemoved(CoordinatorLayout parent, WebView child, View dependency) {
        Log.d(TAG,"onDependentViewRemoved");

        super.onDependentViewRemoved(parent, child, dependency);
    }

    @Override
    public boolean onMeasureChild(CoordinatorLayout parent, WebView child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        Log.d(TAG,"onMeasureChild");

        return super.onMeasureChild(parent, child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
    }

    @Override
    public boolean onLayoutChild(CoordinatorLayout parent, WebView child, int layoutDirection) {
        Log.d(TAG,"onLayoutChild");

        return super.onLayoutChild(parent, child, layoutDirection);
    }

    @Override
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull WebView child, @NonNull View directTargetChild, @NonNull View target, int axes) {
        Log.d(TAG,"onStartNestedScroll");

        return super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target, axes);
    }

    @Override
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull WebView child, @NonNull View directTargetChild, @NonNull View target, int axes, int type) {
        Log.d(TAG,"onStartNestedScroll");

        return super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target, axes, type);
    }

    @Override
    public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull WebView child, @NonNull View directTargetChild, @NonNull View target, int axes) {
        Log.d(TAG,"onNestedScrollAccepted");

        super.onNestedScrollAccepted(coordinatorLayout, child, directTargetChild, target, axes);
    }

    @Override
    public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull WebView child, @NonNull View directTargetChild, @NonNull View target, int axes, int type) {
        Log.d(TAG,"onNestedScrollAccepted");

        super.onNestedScrollAccepted(coordinatorLayout, child, directTargetChild, target, axes, type);
    }

    @Override
    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull WebView child, @NonNull View target) {
        Log.d(TAG,"onStopNestedScroll");

        super.onStopNestedScroll(coordinatorLayout, child, target);
    }

    @Override
    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull WebView child, @NonNull View target, int type) {
        Log.d(TAG,"onStopNestedScroll");

        super.onStopNestedScroll(coordinatorLayout, child, target, type);
    }

    @Override
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull WebView child, @NonNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        Log.d(TAG,"onNestedScroll");

        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
    }

    @Override
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull WebView child, @NonNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        Log.d(TAG,"onNestedScroll");

        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
    }

    @Override
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull WebView child, @NonNull View target, int dx, int dy, @NonNull int[] consumed) {
        Log.d(TAG,"onNestedPreScroll");

        super.onNestedPreScroll(coordinatorLayout, child, target, dx, dy, consumed);
    }

    @Override
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull WebView child, @NonNull View target, int dx, int dy, @NonNull int[] consumed, int type) {
        Log.d(TAG,"onNestedPreScroll");

        super.onNestedPreScroll(coordinatorLayout, child, target, dx, dy, consumed, type);
    }

    @Override
    public boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull WebView child, @NonNull View target, float velocityX, float velocityY, boolean consumed) {
        Log.d(TAG,"onNestedFling");

        return super.onNestedFling(coordinatorLayout, child, target, velocityX, velocityY, consumed);
    }

    @Override
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull WebView child, @NonNull View target, float velocityX, float velocityY) {
        Log.d(TAG,"onNestedPreFling");

        return super.onNestedPreFling(coordinatorLayout, child, target, velocityX, velocityY);
    }

    @NonNull
    @Override
    public WindowInsetsCompat onApplyWindowInsets(CoordinatorLayout coordinatorLayout, WebView child, WindowInsetsCompat insets) {
        Log.d(TAG,"WindowInsetsCompat");

        return super.onApplyWindowInsets(coordinatorLayout, child, insets);
    }

    @Override
    public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, WebView child, Rect rectangle, boolean immediate) {
        Log.d(TAG,"onRequestChildRectangleOnScreen");

        return super.onRequestChildRectangleOnScreen(coordinatorLayout, child, rectangle, immediate);
    }

    @Override
    public void onRestoreInstanceState(CoordinatorLayout parent, WebView child, Parcelable state) {
        Log.d(TAG,"onRestoreInstanceState");

        super.onRestoreInstanceState(parent, child, state);
    }

    @Override
    public Parcelable onSaveInstanceState(CoordinatorLayout parent, WebView child) {
        Log.d(TAG,"onSaveInstanceState");

        return super.onSaveInstanceState(parent, child);
    }

    @Override
    public boolean getInsetDodgeRect(@NonNull CoordinatorLayout parent, @NonNull WebView child, @NonNull Rect rect) {
        Log.d(TAG,"getInsetDodgeRect");

        return super.getInsetDodgeRect(parent, child, rect);
    }
}