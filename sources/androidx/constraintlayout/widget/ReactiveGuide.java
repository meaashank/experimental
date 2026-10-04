package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.g;
import androidx.constraintlayout.widget.h;

/* JADX INFO: loaded from: classes2.dex */
public class ReactiveGuide extends View implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f107787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f107788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f107790d;

    public ReactiveGuide(Context context) {
        super(context);
        this.f107787a = -1;
        this.f107788b = false;
        this.f107789c = 0;
        this.f107790d = true;
        super.setVisibility(8);
        e(null);
    }

    @Override // androidx.constraintlayout.widget.h.a
    public void a(int key, int newValue, int oldValue) {
        j(newValue);
        int id2 = getId();
        if (id2 > 0 && (getParent() instanceof MotionLayout)) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            int iJ0 = motionLayout.j0();
            int i10 = this.f107789c;
            if (i10 != 0) {
                iJ0 = i10;
            }
            int i11 = 0;
            if (!this.f107788b) {
                if (!this.f107790d) {
                    b(newValue, id2, motionLayout, iJ0);
                    return;
                }
                int[] iArrH0 = motionLayout.h0();
                while (i11 < iArrH0.length) {
                    b(newValue, id2, motionLayout, iArrH0[i11]);
                    i11++;
                }
                return;
            }
            if (this.f107790d) {
                int[] iArrH02 = motionLayout.h0();
                while (i11 < iArrH02.length) {
                    int i12 = iArrH02[i11];
                    if (i12 != iJ0) {
                        b(newValue, id2, motionLayout, i12);
                    }
                    i11++;
                }
            }
            d dVarS = motionLayout.S(iJ0);
            dVarS.d1(id2, newValue);
            motionLayout.t1(iJ0, dVarS, 1000);
        }
    }

    public final void b(int newValue, int id2, MotionLayout motionLayout, int currentState) {
        d dVarG0 = motionLayout.g0(currentState);
        dVarG0.d1(id2, newValue);
        motionLayout.s1(currentState, dVarG0);
    }

    public int c() {
        return this.f107789c;
    }

    public int d() {
        return this.f107787a;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public final void e(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.f109954K8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.f110014O8) {
                    this.f107787a = typedArrayObtainStyledAttributes.getResourceId(index, this.f107787a);
                } else if (index == g.m.f109969L8) {
                    this.f107788b = typedArrayObtainStyledAttributes.getBoolean(index, this.f107788b);
                } else if (index == g.m.f109999N8) {
                    this.f107789c = typedArrayObtainStyledAttributes.getResourceId(index, this.f107789c);
                } else if (index == g.m.f109984M8) {
                    this.f107790d = typedArrayObtainStyledAttributes.getBoolean(index, this.f107790d);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f107787a != -1) {
            ConstraintLayout.getSharedValues().a(this.f107787a, this);
        }
    }

    public boolean f() {
        return this.f107788b;
    }

    public void g(boolean animate) {
        this.f107788b = animate;
    }

    public void h(int id2) {
        this.f107789c = id2;
    }

    public void i(int id2) {
        h sharedValues = ConstraintLayout.getSharedValues();
        int i10 = this.f107787a;
        if (i10 != -1) {
            sharedValues.e(i10, this);
        }
        this.f107787a = id2;
        if (id2 != -1) {
            sharedValues.a(id2, this);
        }
    }

    public void j(int margin) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f107649a = margin;
        setLayoutParams(layoutParams);
    }

    public void k(int margin) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f107651b = margin;
        setLayoutParams(layoutParams);
    }

    public void l(float ratio) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f107653c = ratio;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
    }

    public ReactiveGuide(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f107787a = -1;
        this.f107788b = false;
        this.f107789c = 0;
        this.f107790d = true;
        super.setVisibility(8);
        e(attrs);
    }

    public ReactiveGuide(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f107787a = -1;
        this.f107788b = false;
        this.f107789c = 0;
        this.f107790d = true;
        super.setVisibility(8);
        e(attrs);
    }

    public ReactiveGuide(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.f107787a = -1;
        this.f107788b = false;
        this.f107789c = 0;
        this.f107790d = true;
        super.setVisibility(8);
        e(attrs);
    }
}
