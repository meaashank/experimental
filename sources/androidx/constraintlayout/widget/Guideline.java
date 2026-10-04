package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes2.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f107783a;

    public Guideline(Context context) {
        super(context);
        this.f107783a = true;
        super.setVisibility(8);
    }

    public void a(boolean filter) {
        this.f107783a = filter;
    }

    public void b(int margin) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f107783a && layoutParams.f107649a == margin) {
            return;
        }
        layoutParams.f107649a = margin;
        setLayoutParams(layoutParams);
    }

    public void c(int margin) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f107783a && layoutParams.f107651b == margin) {
            return;
        }
        layoutParams.f107651b = margin;
        setLayoutParams(layoutParams);
    }

    public void d(float ratio) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f107783a && layoutParams.f107653c == ratio) {
            return;
        }
        layoutParams.f107653c = ratio;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
    }

    public Guideline(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f107783a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f107783a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.f107783a = true;
        super.setVisibility(8);
    }
}
