package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.g;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f106539v = "CircularFlow";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static int f106540w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static float f106541x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ConstraintLayout f106542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f106543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float[] f106544n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f106545o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f106546p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f106547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f106548r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f106549s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Float f106550t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Integer f106551u;

    public CircularFlow(Context context) {
        super(context);
    }

    public static float[] X(float[] array, int index) {
        float[] fArr = new float[array.length - 1];
        int i10 = 0;
        for (int i11 = 0; i11 < array.length; i11++) {
            if (i11 != index) {
                fArr[i10] = array[i11];
                i10++;
            }
        }
        return fArr;
    }

    public static int[] Y(int[] array, int index) {
        int[] iArr = new int[array.length - 1];
        int i10 = 0;
        for (int i11 = 0; i11 < array.length; i11++) {
            if (i11 != index) {
                iArr[i10] = array[i11];
                i10++;
            }
        }
        return iArr;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void A(AttributeSet attrs) {
        super.A(attrs);
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.f110547y6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.f110276g7) {
                    this.f106543m = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == g.m.f110216c7) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f106548r = string;
                    a0(string);
                } else if (index == g.m.f110261f7) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f106549s = string2;
                    d0(string2);
                } else if (index == g.m.f110231d7) {
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, f106541x);
                    this.f106550t = Float.valueOf(f10);
                    b0(f10);
                } else if (index == g.m.f110246e7) {
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, f106540w);
                    this.f106551u = Integer.valueOf(dimensionPixelSize);
                    c0(dimensionPixelSize);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public int C(View view) {
        int iC = super.C(view);
        if (iC == -1) {
            return iC;
        }
        d dVar = new d();
        dVar.H(this.f106542l);
        dVar.F(view.getId(), 8);
        dVar.r(this.f106542l);
        float[] fArr = this.f106544n;
        if (iC < fArr.length) {
            this.f106544n = W(fArr, iC);
            this.f106547q--;
        }
        int[] iArr = this.f106545o;
        if (iC < iArr.length) {
            this.f106545o = Z(iArr, iC);
            this.f106546p--;
        }
        S();
        return iC;
    }

    public final void P(String angleString) {
        float[] fArr;
        if (angleString == null || angleString.length() == 0 || this.f107592c == null || (fArr = this.f106544n) == null) {
            return;
        }
        if (this.f106547q + 1 > fArr.length) {
            this.f106544n = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f106544n[this.f106547q] = Integer.parseInt(angleString);
        this.f106547q++;
    }

    public final void Q(String radiusString) {
        int[] iArr;
        if (radiusString == null || radiusString.length() == 0 || this.f107592c == null || (iArr = this.f106545o) == null) {
            return;
        }
        if (this.f106546p + 1 > iArr.length) {
            this.f106545o = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f106545o[this.f106546p] = (int) (Integer.parseInt(radiusString) * this.f107592c.getResources().getDisplayMetrics().density);
        this.f106546p++;
    }

    public void R(View view, int radius, float angle) {
        if (t(view.getId())) {
            return;
        }
        p(view);
        this.f106547q++;
        float[] fArrT = T();
        this.f106544n = fArrT;
        fArrT[this.f106547q - 1] = angle;
        this.f106546p++;
        int[] iArrU = U();
        this.f106545o = iArrU;
        iArrU[this.f106546p - 1] = (int) (radius * this.f107592c.getResources().getDisplayMetrics().density);
        S();
    }

    public final void S() {
        this.f106542l = (ConstraintLayout) getParent();
        for (int i10 = 0; i10 < this.f107591b; i10++) {
            View viewById = this.f106542l.getViewById(this.f107590a[i10]);
            if (viewById != null) {
                int i11 = f106540w;
                float f10 = f106541x;
                int[] iArr = this.f106545o;
                if (iArr == null || i10 >= iArr.length) {
                    Integer num = this.f106551u;
                    if (num == null || num.intValue() == -1) {
                        Log.e(f106539v, "Added radius to view with id: " + this.f107598i.get(Integer.valueOf(viewById.getId())));
                    } else {
                        this.f106546p++;
                        if (this.f106545o == null) {
                            this.f106545o = new int[1];
                        }
                        int[] iArrU = U();
                        this.f106545o = iArrU;
                        iArrU[this.f106546p - 1] = i11;
                    }
                } else {
                    i11 = iArr[i10];
                }
                float[] fArr = this.f106544n;
                if (fArr == null || i10 >= fArr.length) {
                    Float f11 = this.f106550t;
                    if (f11 == null || f11.floatValue() == -1.0f) {
                        Log.e(f106539v, "Added angle to view with id: " + this.f107598i.get(Integer.valueOf(viewById.getId())));
                    } else {
                        this.f106547q++;
                        if (this.f106544n == null) {
                            this.f106544n = new float[1];
                        }
                        float[] fArrT = T();
                        this.f106544n = fArrT;
                        fArrT[this.f106547q - 1] = f10;
                    }
                } else {
                    f10 = fArr[i10];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.f107683r = f10;
                layoutParams.f107679p = this.f106543m;
                layoutParams.f107681q = i11;
                viewById.setLayoutParams(layoutParams);
            }
        }
        q();
    }

    public float[] T() {
        return Arrays.copyOf(this.f106544n, this.f106547q);
    }

    public int[] U() {
        return Arrays.copyOf(this.f106545o, this.f106546p);
    }

    public boolean V(View view) {
        return t(view.getId()) && z(view.getId()) != -1;
    }

    public final float[] W(float[] angles, int index) {
        return (angles == null || index < 0 || index >= this.f106547q) ? angles : X(angles, index);
    }

    public final int[] Z(int[] radius, int index) {
        return (radius == null || index < 0 || index >= this.f106546p) ? radius : Y(radius, index);
    }

    public final void a0(String idList) {
        if (idList == null) {
            return;
        }
        int i10 = 0;
        this.f106547q = 0;
        while (true) {
            int iIndexOf = idList.indexOf(44, i10);
            if (iIndexOf == -1) {
                P(idList.substring(i10).trim());
                return;
            } else {
                P(idList.substring(i10, iIndexOf).trim());
                i10 = iIndexOf + 1;
            }
        }
    }

    public void b0(float angle) {
        f106541x = angle;
    }

    public void c0(int radius) {
        f106540w = radius;
    }

    public final void d0(String idList) {
        if (idList == null) {
            return;
        }
        int i10 = 0;
        this.f106546p = 0;
        while (true) {
            int iIndexOf = idList.indexOf(44, i10);
            if (iIndexOf == -1) {
                Q(idList.substring(i10).trim());
                return;
            } else {
                Q(idList.substring(i10, iIndexOf).trim());
                i10 = iIndexOf + 1;
            }
        }
    }

    public void e0(View view, float angle) {
        if (!V(view)) {
            Log.e(f106539v, "It was not possible to update angle to view with id: " + view.getId());
            return;
        }
        int iZ = z(view.getId());
        if (iZ > this.f106544n.length) {
            return;
        }
        float[] fArrT = T();
        this.f106544n = fArrT;
        fArrT[iZ] = angle;
        S();
    }

    public void f0(View view, int radius) {
        if (!V(view)) {
            Log.e(f106539v, "It was not possible to update radius to view with id: " + view.getId());
            return;
        }
        int iZ = z(view.getId());
        if (iZ > this.f106545o.length) {
            return;
        }
        int[] iArrU = U();
        this.f106545o = iArrU;
        iArrU[iZ] = (int) (radius * this.f107592c.getResources().getDisplayMetrics().density);
        S();
    }

    public void g0(View view, int radius, float angle) {
        if (!V(view)) {
            Log.e(f106539v, "It was not possible to update radius and angle to view with id: " + view.getId());
            return;
        }
        int iZ = z(view.getId());
        if (T().length > iZ) {
            float[] fArrT = T();
            this.f106544n = fArrT;
            fArrT[iZ] = angle;
        }
        if (U().length > iZ) {
            int[] iArrU = U();
            this.f106545o = iArrU;
            iArrU[iZ] = (int) (radius * this.f107592c.getResources().getDisplayMetrics().density);
        }
        S();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f106548r;
        if (str != null) {
            this.f106544n = new float[1];
            a0(str);
        }
        String str2 = this.f106549s;
        if (str2 != null) {
            this.f106545o = new int[1];
            d0(str2);
        }
        Float f10 = this.f106550t;
        if (f10 != null) {
            b0(f10.floatValue());
        }
        Integer num = this.f106551u;
        if (num != null) {
            c0(num.intValue());
        }
        S();
    }

    public CircularFlow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CircularFlow(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
