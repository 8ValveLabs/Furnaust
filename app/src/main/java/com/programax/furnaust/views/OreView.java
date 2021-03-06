package com.programax.furnaust.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.programax.furnaust.Constants;
import com.programax.furnaust.R;

public class OreView extends androidx.appcompat.widget.AppCompatImageView {

    private int count;
    private Paint ore_paint;
    private Paint.FontMetrics metrics;

    public OreView(@NonNull Context context) {
        super(context);
        init();
        count = 0000;
    }

    public OreView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
        TypedArray attrs_arr = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.OreView,
                0,0);
        try {
            count = attrs_arr.getInt(R.styleable.OreView_count_label, 0);
        }
        finally {
            attrs_arr.recycle();
        }
    }

    public OreView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void setCount(int count){
        this.count = count;
        invalidate();
        requestLayout();
    }

    public int getCount() {
        return this.count;
    }

    public void setOreType(Context context, String type)
    {
        switch(type) {
            case "sulfur":
                this.setImageResource(R.drawable.sulfur_ore_icon);
                this.setVisibility(View.INVISIBLE);
                invalidate();
                requestLayout();
                break;
            case "metal":
                this.setImageResource(R.drawable.metal_ore_icon);
                invalidate();
                requestLayout();
                break;
            case "hqm":
                this.setImageResource(R.drawable.high_quality_metal_ore_icon);
                invalidate();
                requestLayout();
                break;
            default:
                this.setImageBitmap(BitmapFactory.decodeResource(context.getResources(), R.drawable.sulfur_ore_icon));
                invalidate();
                requestLayout();
        }
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
        int scaledWidth = MeasureSpec.getSize(widthMeasureSpec) / Constants.LargeFurnace.cols;
        int scaledHeight = MeasureSpec.getMode(heightMeasureSpec) / Constants.LargeFurnace.rows;
        this.setMeasuredDimension(scaledWidth, scaledWidth);
    }


    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText(String.valueOf(count), 15, 50, ore_paint);
    }
}
