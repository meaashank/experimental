package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.g;

/* JADX INFO: loaded from: classes.dex */
public class Layer extends ConstraintHelper {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f106569B = "Layer";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f106570A;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f106571j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f106572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f106573l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ConstraintLayout f106574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f106575n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f106576o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f106577p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f106578q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f106579r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f106580s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f106581t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f106582u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f106583v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View[] f106584w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f106585x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f106586y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f106587z;

    public Layer(Context context) {
        super(context);
        this.f106571j = Float.NaN;
        this.f106572k = Float.NaN;
        this.f106573l = Float.NaN;
        this.f106575n = 1.0f;
        this.f106576o = 1.0f;
        this.f106577p = Float.NaN;
        this.f106578q = Float.NaN;
        this.f106579r = Float.NaN;
        this.f106580s = Float.NaN;
        this.f106581t = Float.NaN;
        this.f106582u = Float.NaN;
        this.f106583v = true;
        this.f106584w = null;
        this.f106585x = 0.0f;
        this.f106586y = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void A(AttributeSet attrs) {
        super.A(attrs);
        this.f107594e = false;
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.f110547y6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.f109877F6) {
                    this.f106587z = true;
                } else if (index == g.m.f110115V6) {
                    this.f106570A = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void I(ConstraintLayout container) {
        P();
        this.f106577p = Float.NaN;
        this.f106578q = Float.NaN;
        ConstraintWidget constraintWidgetB = ((ConstraintLayout.LayoutParams) getLayoutParams()).b();
        constraintWidgetB.c2(0);
        constraintWidgetB.y1(0);
        O();
        layout(((int) this.f106581t) - getPaddingLeft(), ((int) this.f106582u) - getPaddingTop(), getPaddingRight() + ((int) this.f106579r), getPaddingBottom() + ((int) this.f106580s));
        Q();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void K(ConstraintLayout container) {
        this.f106574m = container;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f106573l = rotation;
        } else {
            if (Float.isNaN(this.f106573l)) {
                return;
            }
            this.f106573l = rotation;
        }
    }

    public void O() {
        if (this.f106574m == null) {
            return;
        }
        if (this.f106583v || Float.isNaN(this.f106577p) || Float.isNaN(this.f106578q)) {
            if (!Float.isNaN(this.f106571j) && !Float.isNaN(this.f106572k)) {
                this.f106578q = this.f106572k;
                this.f106577p = this.f106571j;
                return;
            }
            View[] viewArrY = y(this.f106574m);
            int left = viewArrY[0].getLeft();
            int top = viewArrY[0].getTop();
            int right = viewArrY[0].getRight();
            int bottom = viewArrY[0].getBottom();
            for (int i10 = 0; i10 < this.f107591b; i10++) {
                View view = viewArrY[i10];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f106579r = right;
            this.f106580s = bottom;
            this.f106581t = left;
            this.f106582u = top;
            if (Float.isNaN(this.f106571j)) {
                this.f106577p = (left + right) / 2;
            } else {
                this.f106577p = this.f106571j;
            }
            if (Float.isNaN(this.f106572k)) {
                this.f106578q = (top + bottom) / 2;
            } else {
                this.f106578q = this.f106572k;
            }
        }
    }

    public final void P() {
        int i10;
        if (this.f106574m == null || (i10 = this.f107591b) == 0) {
            return;
        }
        View[] viewArr = this.f106584w;
        if (viewArr == null || viewArr.length != i10) {
            this.f106584w = new View[i10];
        }
        for (int i11 = 0; i11 < this.f107591b; i11++) {
            this.f106584w[i11] = this.f106574m.getViewById(this.f107590a[i11]);
        }
    }

    public final void Q() {
        if (this.f106574m == null) {
            return;
        }
        if (this.f106584w == null) {
            P();
        }
        O();
        double radians = Float.isNaN(this.f106573l) ? 0.0d : Math.toRadians(this.f106573l);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f10 = this.f106575n;
        float f11 = f10 * fCos;
        float f12 = this.f106576o;
        float f13 = (-f12) * fSin;
        float f14 = f10 * fSin;
        float f15 = f12 * fCos;
        for (int i10 = 0; i10 < this.f107591b; i10++) {
            View view = this.f106584w[i10];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f16 = right - this.f106577p;
            float f17 = bottom - this.f106578q;
            float f18 = (((f13 * f17) + (f11 * f16)) - f16) + this.f106585x;
            float f19 = (((f15 * f17) + (f16 * f14)) - f17) + this.f106586y;
            view.setTranslationX(f18);
            view.setTranslationY(f19);
            view.setScaleY(this.f106576o);
            view.setScaleX(this.f106575n);
            if (!Float.isNaN(this.f106573l)) {
                view.setRotation(this.f106573l);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f106574m = (ConstraintLayout) getParent();
        if (this.f106587z || this.f106570A) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f107591b; i10++) {
                View viewById = this.f106574m.getViewById(this.f107590a[i10]);
                if (viewById != null) {
                    if (this.f106587z) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f106570A && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void s(ConstraintLayout container) {
        r(container);
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        q();
    }

    @Override // android.view.View
    public void setPivotX(float pivotX) {
        this.f106571j = pivotX;
        Q();
    }

    @Override // android.view.View
    public void setPivotY(float pivotY) {
        this.f106572k = pivotY;
        Q();
    }

    @Override // android.view.View
    public void setRotation(float angle) {
        this.f106573l = angle;
        Q();
    }

    @Override // android.view.View
    public void setScaleX(float scaleX) {
        this.f106575n = scaleX;
        Q();
    }

    @Override // android.view.View
    public void setScaleY(float scaleY) {
        this.f106576o = scaleY;
        Q();
    }

    @Override // android.view.View
    public void setTranslationX(float dx) {
        this.f106585x = dx;
        Q();
    }

    @Override // android.view.View
    public void setTranslationY(float dy) {
        this.f106586y = dy;
        Q();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        q();
    }

    public Layer(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f106571j = Float.NaN;
        this.f106572k = Float.NaN;
        this.f106573l = Float.NaN;
        this.f106575n = 1.0f;
        this.f106576o = 1.0f;
        this.f106577p = Float.NaN;
        this.f106578q = Float.NaN;
        this.f106579r = Float.NaN;
        this.f106580s = Float.NaN;
        this.f106581t = Float.NaN;
        this.f106582u = Float.NaN;
        this.f106583v = true;
        this.f106584w = null;
        this.f106585x = 0.0f;
        this.f106586y = 0.0f;
    }

    public Layer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f106571j = Float.NaN;
        this.f106572k = Float.NaN;
        this.f106573l = Float.NaN;
        this.f106575n = 1.0f;
        this.f106576o = 1.0f;
        this.f106577p = Float.NaN;
        this.f106578q = Float.NaN;
        this.f106579r = Float.NaN;
        this.f106580s = Float.NaN;
        this.f106581t = Float.NaN;
        this.f106582u = Float.NaN;
        this.f106583v = true;
        this.f106584w = null;
        this.f106585x = 0.0f;
        this.f106586y = 0.0f;
    }
}
