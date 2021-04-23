package com.programax.furnaust.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.programax.furnaust.R;

public class OreView extends androidx.appcompat.widget.AppCompatImageView {

    private int count;
    private Paint ore_paint;
    private Paint.FontMetrics metrics;

    public OreView(@NonNull Context context) {
        super(context);
        init();
    }

    public OreView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public OreView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {
        ore_paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        ore_paint.setTypeface(Typeface.DEFAULT);
        ore_paint.setColor(getResources().getColor(android.R.color.black));
        ore_paint.setTextSize((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 20, getResources().getDisplayMetrics()));
        metrics = ore_paint.getFontMetrics();
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int scaledWidth = MeasureSpec.getSize(widthMeasureSpec) / 6;
        int scaledHeight = MeasureSpec.getMode(heightMeasureSpec) / 3;
        this.setMeasuredDimension(scaledWidth, scaledWidth);
    }


    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText("0000", 15, 50, ore_paint);

    }
}
