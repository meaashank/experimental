package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public class MBRotationView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Camera f155472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Matrix f155473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f155474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f155475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f155476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f155477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f155478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f155479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f155480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f155481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f155482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f155483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f155484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f155485n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f155486o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Runnable f155487p;

    public MBRotationView(Context context) {
        super(context);
        this.f155476e = 40;
        this.f155477f = 20;
        this.f155478g = 0;
        this.f155479h = 0;
        this.f155481j = 0;
        this.f155482k = 0.5f;
        this.f155483l = 0.9f;
        this.f155484m = true;
        this.f155485n = false;
        this.f155486o = false;
        this.f155487p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void b(Canvas canvas) {
        int height = getHeight() / 2;
        int i10 = ((this.f155478g * this.f155474c) / 2) / this.f155476e;
        a(canvas, i10, height, 0);
        a(canvas, i10, height, 1);
        if (Math.abs(this.f155478g) > this.f155476e / 2) {
            a(canvas, i10, height, 3);
            a(canvas, i10, height, 2);
        } else {
            a(canvas, i10, height, 2);
            a(canvas, i10, height, 3);
        }
    }

    private int c(int i10) {
        int i11;
        int i12;
        int i13;
        if (i10 == 0) {
            i11 = this.f155486o ? this.f155479h - 2 : this.f155479h + 2;
        } else if (i10 != 1) {
            if (i10 != 2) {
                i11 = i10 != 3 ? 0 : this.f155479h;
            } else if (this.f155486o) {
                i12 = this.f155479h;
                i11 = i12 - 1;
            } else {
                i13 = this.f155479h;
                i11 = i13 + 1;
            }
        } else if (this.f155486o) {
            i13 = this.f155479h;
            i11 = i13 + 1;
        } else {
            i12 = this.f155479h;
            i11 = i12 - 1;
        }
        int childCount = i11 % getChildCount();
        return childCount >= 0 ? childCount : getChildCount() + childCount;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f155485n) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        float f10 = i14;
        float f11 = this.f155482k;
        int i15 = (int) (((1.0f - f11) * f10) / 2.0f);
        int i16 = i13 - i11;
        float f12 = i16;
        float f13 = this.f155483l;
        int i17 = (int) (((1.0f - f13) * f12) / 2.0f);
        this.f155474c = (int) (f12 * f13);
        this.f155475d = (int) (f10 * f11);
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            childAt.layout(i15, i17, i14 - i15, i16 - i17);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i19 = layoutParams.width;
            int i20 = this.f155475d;
            if (i19 != i20) {
                layoutParams.width = i20;
                layoutParams.height = this.f155474c;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z10) {
        if (z10) {
            postDelayed(this.f155487p, 1000 / this.f155477f);
        }
        this.f155484m = z10;
    }

    public void setHeightRatio(float f10) {
        this.f155483l = f10;
    }

    public void setRotateV(boolean z10) {
        this.f155485n = z10;
        invalidate();
    }

    public void setWidthRatio(float f10) {
        this.f155482k = f10;
    }

    private void a() {
        this.f155472a = new Camera();
        this.f155473b = new Matrix();
        setWillNotDraw(false);
    }

    private void a(Canvas canvas) {
        int width = getWidth() / 2;
        int i10 = ((this.f155478g * this.f155475d) / 2) / this.f155476e;
        b(canvas, i10, width, 0);
        b(canvas, i10, width, 1);
        if (Math.abs(this.f155478g) > this.f155476e / 2) {
            b(canvas, i10, width, 3);
            b(canvas, i10, width, 2);
        } else {
            b(canvas, i10, width, 2);
            b(canvas, i10, width, 3);
        }
    }

    private void b(int i10, int i11, int i12) {
        float f10 = (-i10) / 2.0f;
        if (i12 == 0) {
            this.f155472a.translate(0.0f, f10, 0.0f);
            float f11 = -i11;
            this.f155472a.rotateX(f11);
            this.f155472a.translate(0.0f, f10, 0.0f);
            this.f155472a.translate(0.0f, f10, 0.0f);
            this.f155472a.rotateX(f11);
            this.f155472a.translate(0.0f, f10, 0.0f);
            return;
        }
        if (i12 == 1) {
            this.f155472a.translate(0.0f, f10, 0.0f);
            this.f155472a.rotateX(i11);
            this.f155472a.translate(0.0f, f10, 0.0f);
        } else if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f155472a.rotateX(0.0f);
        } else {
            this.f155472a.translate(0.0f, f10, 0.0f);
            this.f155472a.rotateX(-i11);
            this.f155472a.translate(0.0f, f10, 0.0f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f155476e = 40;
        this.f155477f = 20;
        this.f155478g = 0;
        this.f155479h = 0;
        this.f155481j = 0;
        this.f155482k = 0.5f;
        this.f155483l = 0.9f;
        this.f155484m = true;
        this.f155485n = false;
        this.f155486o = false;
        this.f155487p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void a(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f155472a.save();
        this.f155473b.reset();
        float f10 = i10;
        this.f155472a.translate(0.0f, f10, 0.0f);
        this.f155472a.rotateX(this.f155478g);
        this.f155472a.translate(0.0f, f10, 0.0f);
        if (i10 == 0) {
            if (this.f155486o) {
                b(this.f155474c, this.f155476e, i12);
            } else {
                b(-this.f155474c, -this.f155476e, i12);
            }
        } else if (i10 > 0) {
            b(this.f155474c, this.f155476e, i12);
        } else if (i10 < 0) {
            b(-this.f155474c, -this.f155476e, i12);
        }
        this.f155472a.getMatrix(this.f155473b);
        this.f155472a.restore();
        this.f155473b.preTranslate((-getWidth()) / 2, -i11);
        this.f155473b.postTranslate(getWidth() / 2, i11);
        canvas.concat(this.f155473b);
        View childAt = getChildAt(c(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (getChildCount() == 0) {
            return;
        }
        int i10 = this.f155478g - 1;
        this.f155478g = i10;
        this.f155480i = this.f155479h;
        a(i10);
        if (this.f155484m) {
            postDelayed(this.f155487p, 1000 / this.f155477f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f155476e = 40;
        this.f155477f = 20;
        this.f155478g = 0;
        this.f155479h = 0;
        this.f155481j = 0;
        this.f155482k = 0.5f;
        this.f155483l = 0.9f;
        this.f155484m = true;
        this.f155485n = false;
        this.f155486o = false;
        this.f155487p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void b(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f155472a.save();
        this.f155473b.reset();
        float f10 = i10;
        this.f155472a.translate(f10, 0.0f, 0.0f);
        this.f155472a.rotateY(this.f155478g);
        this.f155472a.translate(f10, 0.0f, 0.0f);
        if (i10 == 0) {
            if (this.f155486o) {
                a(this.f155475d, this.f155476e, i12);
            } else {
                a(-this.f155475d, -this.f155476e, i12);
            }
        } else if (i10 > 0) {
            a(this.f155475d, this.f155476e, i12);
        } else if (i10 < 0) {
            a(-this.f155475d, -this.f155476e, i12);
        }
        this.f155472a.getMatrix(this.f155473b);
        this.f155472a.restore();
        this.f155473b.preTranslate(-i11, (-getHeight()) / 2);
        this.f155473b.postTranslate(i11, getHeight() / 2);
        canvas.concat(this.f155473b);
        View childAt = getChildAt(c(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private void a(int i10) {
        int i11 = this.f155476e;
        int i12 = this.f155480i - (i10 / i11);
        this.f155478g = i10 % i11;
        b(i12);
        invalidate();
    }

    private void a(int i10, int i11, int i12) {
        if (i12 == 0) {
            float f10 = (-i10) / 2;
            this.f155472a.translate(f10, 0.0f, 0.0f);
            float f11 = -i11;
            this.f155472a.rotateY(f11);
            this.f155472a.translate(f10, 0.0f, 0.0f);
            this.f155472a.translate(f10, 0.0f, 0.0f);
            this.f155472a.rotateY(f11);
            this.f155472a.translate(f10, 0.0f, 0.0f);
            return;
        }
        if (i12 == 1) {
            float f12 = i10 / 2;
            this.f155472a.translate(f12, 0.0f, 0.0f);
            this.f155472a.rotateY(i11);
            this.f155472a.translate(f12, 0.0f, 0.0f);
            return;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f155472a.rotateY(0.0f);
        } else {
            float f13 = (-i10) / 2;
            this.f155472a.translate(f13, 0.0f, 0.0f);
            this.f155472a.rotateY(-i11);
            this.f155472a.translate(f13, 0.0f, 0.0f);
        }
    }

    private void b(int i10) {
        int iC;
        this.f155479h = i10;
        if (Math.abs(this.f155478g) > this.f155476e / 2) {
            iC = c(2);
        } else {
            iC = c(3);
        }
        if (this.f155481j != iC) {
            this.f155481j = iC;
        }
    }
}
