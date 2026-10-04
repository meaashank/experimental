package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import com.google.firebase.ktx.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3524e4 extends ImageView implements InterfaceC3482b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC3496c4 f152838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f152839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f152840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f152841d;

    public C3524e4(Context context) {
        super(context, null);
        this.f152839b = 1.0f;
        this.f152840c = true;
        this.f152841d = BuildConfig.VERSION_NAME;
        setLayerType(1, null);
    }

    private final int getDensity() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (!(getContext() instanceof Activity)) {
            return 240;
        }
        Context context = getContext();
        kotlin.jvm.internal.G.n(context, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    private static /* synthetic */ void getMContentMode$annotations() {
    }

    private final float getScale() {
        float density = getContext().getResources().getDisplayMetrics().densityDpi / getDensity();
        this.f152839b = density;
        if (density < 0.1f) {
            this.f152839b = 0.1f;
        }
        if (this.f152839b > 5.0f) {
            this.f152839b = 5.0f;
        }
        return this.f152839b;
    }

    public final void a(Canvas canvas) {
        float fMin;
        float f10;
        float f11;
        canvas.save();
        float f12 = this.f152839b;
        canvas.scale(f12, f12);
        float width = getWidth();
        float height = getHeight();
        float fD = (this.f152838a != null ? r2.d() : 0) * this.f152839b;
        float fA = (this.f152838a != null ? r4.a() : 0) * this.f152839b;
        String str = this.f152841d;
        if (kotlin.jvm.internal.G.g(str, "aspectFill")) {
            fMin = Math.max(height / fA, width / fD);
            float f13 = width - (fD * fMin);
            float f14 = 2;
            float f15 = this.f152839b * fMin;
            f10 = (f13 / f14) / f15;
            f11 = ((height - (fA * fMin)) / f14) / f15;
            canvas.scale(fMin, fMin);
        } else if (kotlin.jvm.internal.G.g(str, "aspectFit")) {
            fMin = Math.min(height / fA, width / fD);
            float f16 = width - (fD * fMin);
            float f17 = 2;
            float f18 = this.f152839b * fMin;
            f10 = (f16 / f17) / f18;
            f11 = ((height - (fA * fMin)) / f17) / f18;
            canvas.scale(fMin, fMin);
        } else {
            fMin = height / fA;
            canvas.scale(width / fD, fMin);
            f10 = 0.0f;
            f11 = 0.0f;
        }
        float[] fArr = {f10, f11, fMin};
        InterfaceC3496c4 interfaceC3496c4 = this.f152838a;
        if (interfaceC3496c4 != null) {
            interfaceC3496c4.a(canvas, fArr[0], fArr[1]);
        }
        canvas.restore();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.G.p(canvas, "canvas");
        InterfaceC3496c4 interfaceC3496c4 = this.f152838a;
        if (interfaceC3496c4 != null) {
            if (!interfaceC3496c4.c()) {
                a(canvas);
                return;
            }
            interfaceC3496c4.b();
            a(canvas);
            if (this.f152840c) {
                postInvalidateOnAnimation();
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f152840c = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        this.f152839b = getScale();
        Drawable drawable = getDrawable();
        InterfaceC3496c4 interfaceC3496c4 = this.f152838a;
        if (drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth <= 0) {
                intrinsicWidth = 1;
            }
            if (intrinsicHeight > 0) {
                i = intrinsicHeight;
            }
        } else if (interfaceC3496c4 != null) {
            int iD = interfaceC3496c4.d();
            int iA = interfaceC3496c4.a();
            if (iD <= 0) {
                iD = 1;
            }
            i = iA > 0 ? iA : 1;
            intrinsicWidth = iD;
        } else {
            i = 0;
            intrinsicWidth = 0;
        }
        setMeasuredDimension(View.resolveSize(Math.max(getPaddingLeft() + getPaddingRight() + intrinsicWidth, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(getPaddingTop() + getPaddingBottom() + i, getSuggestedMinimumHeight()), i11));
    }

    @Override // android.view.View
    public final void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        boolean z10 = i10 == 1;
        this.f152840c = z10;
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i10) {
        kotlin.jvm.internal.G.p(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        boolean z10 = i10 == 0;
        this.f152840c = z10;
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        boolean z10 = i10 == 0;
        this.f152840c = z10;
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    public final void setContentMode(@NotNull String contentMode) {
        kotlin.jvm.internal.G.p(contentMode, "contentMode");
        this.f152841d = contentMode;
    }

    public final void setGifImpl(@Nullable InterfaceC3496c4 interfaceC3496c4) {
        this.f152838a = interfaceC3496c4;
        if (interfaceC3496c4 != null) {
            interfaceC3496c4.a(this);
            interfaceC3496c4.start();
        }
        requestLayout();
    }

    public final void setPaused(boolean z10) {
        InterfaceC3496c4 interfaceC3496c4 = this.f152838a;
        if (interfaceC3496c4 != null) {
            interfaceC3496c4.a(z10);
        }
    }
}
