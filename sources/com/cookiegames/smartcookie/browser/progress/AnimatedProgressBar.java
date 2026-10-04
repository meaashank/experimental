package com.cookiegames.smartcookie.browser.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import androidx.compose.runtime.internal.r;
import androidx.core.view.C2507z0;
import com.cookiegames.smartcookie.browser.progress.AnimatedProgressBar;
import com.cookiegames.smartcookie.p;
import e.InterfaceC4337k;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 0)
public final class AnimatedProgressBar extends View {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f141037k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f141038l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f141039m = 500;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f141040n = 200;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f141041o = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f141043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f141044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f141045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f141046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Interpolator f141047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Interpolator f141048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Queue<Animation> f141049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Paint f141050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Rect f141051j;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public final class b extends Animation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f141052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f141053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f141054c;

        public b(int i10, int i11, int i12) {
            this.f141052a = i10;
            this.f141053b = i11;
            this.f141054c = i12;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, @NotNull Transformation t10) {
            G.p(t10, "t");
            int i10 = this.f141052a + ((int) (this.f141053b * f10));
            if (i10 <= this.f141054c) {
                AnimatedProgressBar.this.f141043b = i10;
                AnimatedProgressBar.this.invalidate();
            }
            if (Math.abs(1.0f - f10) < 1.0E-5d) {
                if (AnimatedProgressBar.this.f141042a >= 100) {
                    AnimatedProgressBar.this.i();
                }
                if (AnimatedProgressBar.this.f141049h.isEmpty()) {
                    return;
                }
                AnimatedProgressBar animatedProgressBar = AnimatedProgressBar.this;
                animatedProgressBar.startAnimation(animatedProgressBar.f141049h.poll());
            }
        }

        @Override // android.view.animation.Animation
        public boolean willChangeBounds() {
            return false;
        }

        @Override // android.view.animation.Animation
        public boolean willChangeTransformationMatrix() {
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        G.p(context, "context");
        this.f141045d = true;
        this.f141047f = new LinearInterpolator();
        this.f141048g = new P3.b();
        this.f141049h = new ArrayDeque();
        this.f141050i = new Paint();
        this.f141051j = new Rect();
        k(context, attributeSet);
    }

    public static void a(Ref.IntRef intRef, int i10) {
        intRef.f217902a = i10;
    }

    public static final void b(Ref.IntRef intRef, int i10) {
        intRef.f217902a = i10;
    }

    public final void g(int i10, int i11, int i12) {
        b bVar = new b(i10, i11, i12);
        bVar.setDuration(this.f141046e);
        bVar.setInterpolator(this.f141048g);
        if (this.f141049h.isEmpty()) {
            startAnimation(bVar);
        } else {
            this.f141049h.add(bVar);
        }
    }

    public final void h() {
        animate().alpha(1.0f).setDuration(200L).setInterpolator(this.f141047f).start();
    }

    public final void i() {
        animate().alpha(0.0f).setDuration(200L).setInterpolator(this.f141047f).start();
    }

    public final int j() {
        return this.f141042a;
    }

    public final void k(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p.u.f147422k0, 0, 0);
        G.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f141044c = typedArrayObtainStyledAttributes.getColor(p.u.f147467n0, -65536);
            this.f141045d = typedArrayObtainStyledAttributes.getBoolean(p.u.f147452m0, false);
            this.f141046e = typedArrayObtainStyledAttributes.getInteger(p.u.f147437l0, 500);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void l(boolean z10) {
        this.f141045d = z10;
    }

    public final void m(int i10) {
        this.f141046e = i10;
    }

    public final void n(int i10) {
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.f217902a = i10;
        if (i10 > 100) {
            intRef.f217902a = 100;
        } else if (i10 < 0) {
            intRef.f217902a = 0;
        }
        int measuredWidth = getMeasuredWidth();
        final int i11 = intRef.f217902a;
        if (measuredWidth == 0 && !C2507z0.Y0(this)) {
            post(new Runnable() { // from class: P3.a
                @Override // java.lang.Runnable
                public final void run() {
                    AnimatedProgressBar.a(intRef, i11);
                }
            });
            return;
        }
        if (getAlpha() < 1.0f) {
            h();
        }
        Rect rect = this.f141051j;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = getBottom() - getTop();
        int i12 = intRef.f217902a;
        int i13 = this.f141042a;
        if (i12 < i13 && !this.f141045d) {
            this.f141043b = 0;
        } else if (i12 == i13 && i12 == 100) {
            i();
        }
        int i14 = intRef.f217902a;
        this.f141042a = i14;
        int i15 = this.f141043b;
        int i16 = ((i14 * measuredWidth) / 100) - i15;
        if (i16 != 0) {
            g(i15, i16, measuredWidth);
        }
    }

    public final void o(@InterfaceC4337k int i10) {
        this.f141044c = i10;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        G.p(canvas, "canvas");
        this.f141050i.setColor(this.f141044c);
        this.f141050i.setStrokeWidth(10.0f);
        Rect rect = this.f141051j;
        rect.right = rect.left + this.f141043b;
        canvas.drawRect(rect, this.f141050i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        invalidate();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@NotNull Parcelable state) {
        G.p(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            this.f141042a = bundle.getInt("progressState");
            state = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("progressState", this.f141042a);
        return bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        G.p(context, "context");
        this.f141045d = true;
        this.f141047f = new LinearInterpolator();
        this.f141048g = new P3.b();
        this.f141049h = new ArrayDeque();
        this.f141050i = new Paint();
        this.f141051j = new Rect();
        k(context, attributeSet);
    }
}
