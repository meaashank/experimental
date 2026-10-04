package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public static final int RESIZE_MODE_FILL = 3;
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
    public static final int RESIZE_MODE_FIXED_WIDTH = 1;
    public static final int RESIZE_MODE_ZOOM = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f154917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f154918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f154919c;

    public interface b {
    }

    public final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f154920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f154921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f154922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f154923d;

        private c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f154920a = f10;
            this.f154921b = f11;
            this.f154922c = z10;
            if (this.f154923d) {
                return;
            }
            this.f154923d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f154923d = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f154919c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f154918b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f154918b / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.f154917a.a(this.f154918b, f14, false);
            return;
        }
        int i12 = this.f154919c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f154918b;
                } else if (i12 == 4) {
                    if (f15 > 0.0f) {
                        f10 = this.f154918b;
                    } else {
                        f11 = this.f154918b;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f154918b;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f154918b;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f154918b;
            measuredWidth = (int) (f13 * f10);
        }
        this.f154917a.a(this.f154918b, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f154918b != f10) {
            this.f154918b = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable b bVar) {
    }

    public void setResizeMode(int i10) {
        int i11 = this.f154919c;
        int i12 = 1;
        if (i10 == 1) {
            i12 = 0;
        } else if (i10 == 2) {
            i12 = 3;
        } else if (i10 == 3) {
            i12 = 4;
        } else if (i10 != 4) {
            i12 = i10 != 5 ? i11 : 2;
        }
        if (i11 != i12) {
            this.f154919c = i12;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f154919c = 0;
        this.f154917a = new c();
    }
}
