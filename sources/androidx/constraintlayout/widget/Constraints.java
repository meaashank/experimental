package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.g;

/* JADX INFO: loaded from: classes2.dex */
public class Constraints extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f107768b = "Constraints";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f107769a;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(), attrs);
    }

    public d c() {
        if (this.f107769a == null) {
            this.f107769a = new d();
        }
        this.f107769a.J(this);
        return this.f107769a;
    }

    public final void d(AttributeSet attrs) {
        Log.v(f107768b, " ################# init");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p10) {
        return new ConstraintLayout.LayoutParams(p10);
    }

    public Constraints(Context context, AttributeSet attrs) {
        super(context, attrs);
        d(attrs);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        d(attrs);
        super.setVisibility(8);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {

        /* JADX INFO: renamed from: V0, reason: collision with root package name */
        public float f107770V0;

        /* JADX INFO: renamed from: W0, reason: collision with root package name */
        public boolean f107771W0;

        /* JADX INFO: renamed from: X0, reason: collision with root package name */
        public float f107772X0;

        /* JADX INFO: renamed from: Y0, reason: collision with root package name */
        public float f107773Y0;

        /* JADX INFO: renamed from: Z0, reason: collision with root package name */
        public float f107774Z0;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        public float f107775a1;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        public float f107776b1;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        public float f107777c1;

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        public float f107778d1;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        public float f107779e1;

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        public float f107780f1;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        public float f107781g1;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        public float f107782h1;

        public LayoutParams(int width, int height) {
            super(width, height);
            this.f107770V0 = 1.0f;
            this.f107771W0 = false;
            this.f107772X0 = 0.0f;
            this.f107773Y0 = 0.0f;
            this.f107774Z0 = 0.0f;
            this.f107775a1 = 0.0f;
            this.f107776b1 = 1.0f;
            this.f107777c1 = 1.0f;
            this.f107778d1 = 0.0f;
            this.f107779e1 = 0.0f;
            this.f107780f1 = 0.0f;
            this.f107781g1 = 0.0f;
            this.f107782h1 = 0.0f;
        }

        public LayoutParams(LayoutParams source) {
            super((ConstraintLayout.LayoutParams) source);
            this.f107770V0 = 1.0f;
            this.f107771W0 = false;
            this.f107772X0 = 0.0f;
            this.f107773Y0 = 0.0f;
            this.f107774Z0 = 0.0f;
            this.f107775a1 = 0.0f;
            this.f107776b1 = 1.0f;
            this.f107777c1 = 1.0f;
            this.f107778d1 = 0.0f;
            this.f107779e1 = 0.0f;
            this.f107780f1 = 0.0f;
            this.f107781g1 = 0.0f;
            this.f107782h1 = 0.0f;
        }

        public LayoutParams(Context c10, AttributeSet attrs) {
            super(c10, attrs);
            this.f107770V0 = 1.0f;
            this.f107771W0 = false;
            this.f107772X0 = 0.0f;
            this.f107773Y0 = 0.0f;
            this.f107774Z0 = 0.0f;
            this.f107775a1 = 0.0f;
            this.f107776b1 = 1.0f;
            this.f107777c1 = 1.0f;
            this.f107778d1 = 0.0f;
            this.f107779e1 = 0.0f;
            this.f107780f1 = 0.0f;
            this.f107781g1 = 0.0f;
            this.f107782h1 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = c10.obtainStyledAttributes(attrs, g.m.f110147Xa);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.f110387nb) {
                    this.f107770V0 = typedArrayObtainStyledAttributes.getFloat(index, this.f107770V0);
                } else if (index == g.m.f109807Ab) {
                    this.f107772X0 = typedArrayObtainStyledAttributes.getFloat(index, this.f107772X0);
                    this.f107771W0 = true;
                } else if (index == g.m.f110507vb) {
                    this.f107774Z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f107774Z0);
                } else if (index == g.m.f110522wb) {
                    this.f107775a1 = typedArrayObtainStyledAttributes.getFloat(index, this.f107775a1);
                } else if (index == g.m.f110492ub) {
                    this.f107773Y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f107773Y0);
                } else if (index == g.m.f110462sb) {
                    this.f107776b1 = typedArrayObtainStyledAttributes.getFloat(index, this.f107776b1);
                } else if (index == g.m.f110477tb) {
                    this.f107777c1 = typedArrayObtainStyledAttributes.getFloat(index, this.f107777c1);
                } else if (index == g.m.f110402ob) {
                    this.f107778d1 = typedArrayObtainStyledAttributes.getFloat(index, this.f107778d1);
                } else if (index == g.m.f110417pb) {
                    this.f107779e1 = typedArrayObtainStyledAttributes.getFloat(index, this.f107779e1);
                } else if (index == g.m.f110432qb) {
                    this.f107780f1 = typedArrayObtainStyledAttributes.getFloat(index, this.f107780f1);
                } else if (index == g.m.f110447rb) {
                    this.f107781g1 = typedArrayObtainStyledAttributes.getFloat(index, this.f107781g1);
                } else if (index == g.m.f110567zb) {
                    this.f107782h1 = typedArrayObtainStyledAttributes.getFloat(index, this.f107782h1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
