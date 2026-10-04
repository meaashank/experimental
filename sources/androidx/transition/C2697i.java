package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C2507z0;
import androidx.transition.C2705q;

/* JADX INFO: renamed from: androidx.transition.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class C2697i extends ViewGroup implements InterfaceC2694f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f117866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f117867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f117868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f117869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Matrix f117870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f117871f;

    /* JADX INFO: renamed from: androidx.transition.i$a */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            C2507z0.s1(C2697i.this);
            C2697i c2697i = C2697i.this;
            ViewGroup viewGroup = c2697i.f117866a;
            if (viewGroup == null || (view = c2697i.f117867b) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            C2697i.this.f117866a.postInvalidateOnAnimation();
            C2697i c2697i2 = C2697i.this;
            c2697i2.f117866a = null;
            c2697i2.f117867b = null;
            return true;
        }
    }

    public C2697i(View view) {
        super(view.getContext());
        this.f117871f = new a();
        this.f117868c = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    public static C2697i b(View view, ViewGroup viewGroup, Matrix matrix) {
        int i10;
        C2695g c2695g;
        if (!(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        C2695g c2695gB = C2695g.b(viewGroup);
        C2697i c2697i = (C2697i) view.getTag(C2705q.g.f118595v0);
        if (c2697i == null || (c2695g = (C2695g) c2697i.getParent()) == c2695gB) {
            i10 = 0;
        } else {
            i10 = c2697i.f117869d;
            c2695g.removeView(c2697i);
            c2697i = null;
        }
        if (c2697i == null) {
            if (matrix == null) {
                matrix = new Matrix();
                c(view, viewGroup, matrix);
            }
            c2697i = new C2697i(view);
            c2697i.f117870e = matrix;
            if (c2695gB == null) {
                c2695gB = new C2695g(viewGroup);
            } else {
                c2695gB.g();
            }
            d(viewGroup, c2695gB);
            d(viewGroup, c2697i);
            c2695gB.a(c2697i);
            c2697i.f117869d = i10;
        } else if (matrix != null) {
            c2697i.h(matrix);
        }
        c2697i.f117869d++;
        return c2697i;
    }

    public static void c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        N.j(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        N.k(viewGroup, matrix);
    }

    public static void d(View view, View view2) {
        N.g(view2, view2.getLeft(), view2.getTop(), view.getWidth() + view2.getLeft(), view.getHeight() + view2.getTop());
    }

    public static C2697i e(View view) {
        return (C2697i) view.getTag(C2705q.g.f118595v0);
    }

    public static void f(View view) {
        C2697i c2697iE = e(view);
        if (c2697iE != null) {
            int i10 = c2697iE.f117869d - 1;
            c2697iE.f117869d = i10;
            if (i10 <= 0) {
                ((C2695g) c2697iE.getParent()).removeView(c2697iE);
            }
        }
    }

    public static void g(@NonNull View view, @Nullable C2697i c2697i) {
        view.setTag(C2705q.g.f118595v0, c2697i);
    }

    @Override // androidx.transition.InterfaceC2694f
    public void a(ViewGroup viewGroup, View view) {
        this.f117866a = viewGroup;
        this.f117867b = view;
    }

    public void h(@NonNull Matrix matrix) {
        this.f117870e = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.f117868c, this);
        this.f117868c.getViewTreeObserver().addOnPreDrawListener(this.f117871f);
        N.i(this.f117868c, 4);
        if (this.f117868c.getParent() != null) {
            ((View) this.f117868c.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f117868c.getViewTreeObserver().removeOnPreDrawListener(this.f117871f);
        N.i(this.f117868c, 0);
        g(this.f117868c, null);
        if (this.f117868c.getParent() != null) {
            ((View) this.f117868c.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C2690b.a(canvas, true);
        canvas.setMatrix(this.f117870e);
        N.i(this.f117868c, 0);
        this.f117868c.invalidate();
        N.i(this.f117868c, 4);
        drawChild(canvas, this.f117868c, getDrawingTime());
        C2690b.a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View, androidx.transition.InterfaceC2694f
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (e(this.f117868c) == this) {
            N.i(this.f117868c, i10 == 0 ? 4 : 0);
        }
    }
}
