package com.prism.hider.vault.calculator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import androidx.room.x0;

/* JADX INFO: loaded from: classes6.dex */
public class H extends View {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f168512g = {0, 0, 0, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4262n f168513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f168515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f168516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f168517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f168518f;

    public H(Context context, C4262n c4262n, String str) {
        super(context);
        this.f168515c = new Paint(1);
        Paint paint = new Paint(1);
        this.f168516d = paint;
        Paint paint2 = new Paint(1);
        this.f168517e = paint2;
        this.f168518f = new RectF();
        this.f168513a = c4262n;
        this.f168514b = str;
        paint.setStyle(Paint.Style.STROKE);
        paint2.setTextAlign(Paint.Align.RIGHT);
    }

    public final int a(int i10) {
        return i10 != 0 ? i10 != 2 ? i10 != 3 ? this.f168513a.f168569f : this.f168513a.f168575l : this.f168513a.f168573j : this.f168513a.f168571h;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10;
        boolean z11;
        int i10;
        int[] iArr;
        Canvas canvas2 = canvas;
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        boolean zEquals = ClassicCalcSkinFragment.f168473q.equals(this.f168514b);
        boolean zEquals2 = I.f168519d.equals(this.f168514b);
        boolean zEquals3 = C.f168420d.equals(this.f168514b);
        float f13 = height;
        float f14 = f13 * 0.89285713f;
        float f15 = width;
        if (f14 > f15) {
            f10 = f15 / 0.89285713f;
            f11 = f15;
        } else {
            f10 = f13;
            f11 = f14;
        }
        float f16 = (f15 - f11) / 2.0f;
        float f17 = (f13 - f10) / 2.0f;
        float f18 = 0.093f * f11;
        if (zEquals || (iArr = this.f168513a.f168565b) == null || iArr.length < 2) {
            this.f168515c.setShader(null);
            this.f168515c.setColor(zEquals ? -1 : this.f168513a.f168564a);
        } else {
            this.f168515c.setShader(new LinearGradient(f16, f17, f16 + f11, f17 + f10, this.f168513a.f168565b, (float[]) null, Shader.TileMode.CLAMP));
        }
        float f19 = f16 + f11;
        float f20 = f17 + f10;
        this.f168518f.set(f16, f17, f19, f20);
        canvas2.drawRoundRect(this.f168518f, f18, f18, this.f168515c);
        this.f168515c.setShader(null);
        float f21 = 0.06f * f11;
        float f22 = f16 + f21;
        float f23 = f19 - f21;
        float f24 = f23 - f22;
        float f25 = f17 + f21;
        float f26 = f20 - f21;
        float f27 = (zEquals3 ? 0.143f : 0.131f) * f10;
        if (zEquals || (i10 = this.f168513a.f168567d) == 0) {
            f12 = 2.0f;
        } else {
            this.f168515c.setColor(i10);
            this.f168518f.set(f22, f25, f23, f25 + f27);
            float f28 = 0.013f * f11;
            f12 = 2.0f;
            canvas2.drawRoundRect(this.f168518f, f28, f28, this.f168515c);
        }
        this.f168517e.setColor(zEquals ? -12303292 : this.f168513a.f168566c);
        this.f168517e.setTextSize(0.62f * f27);
        canvas2.drawText(x0.f117314f, f23 - (0.03f * f11), ((f27 / f12) + f25) - ((this.f168517e.ascent() + this.f168517e.descent()) / f12), this.f168517e);
        float f29 = (f10 * 0.02f) + f25 + f27;
        if (zEquals) {
            this.f168515c.setColor(-13290187);
            float f30 = (0.68f * f24) + f22;
            canvas2.drawRect(f22, f29, f30, f26, this.f168515c);
            this.f168515c.setColor(-11513776);
            float f31 = (f24 * 0.24f) + f30;
            canvas.drawRect(f30, f29, f31, f26, this.f168515c);
            this.f168515c.setColor(-13326253);
            canvas.drawRect(f31, f29, f23, f26, this.f168515c);
            return;
        }
        float f32 = f24 / 4.0f;
        float f33 = (f26 - f29) / 5.0f;
        float fMin = Math.min(f32, f33) - (0.027f * f11);
        int i11 = 0;
        while (true) {
            int[] iArr2 = f168512g;
            if (i11 >= iArr2.length) {
                return;
            }
            int i12 = iArr2[i11];
            float f34 = ((i11 % 4) * f32) + f22;
            float f35 = ((i11 / 4) * f33) + f29;
            if (zEquals2) {
                this.f168518f.set(f34, f35, f34 + f32, f35 + f33);
                this.f168515c.setColor(this.f168513a.f168564a);
                canvas2.drawRect(this.f168518f, this.f168515c);
                this.f168516d.setColor(-1250068);
                this.f168516d.setStrokeWidth(Math.max(1.0f, 0.006f * f11));
                RectF rectF = this.f168518f;
                float f36 = rectF.right;
                z10 = zEquals2;
                z11 = zEquals3;
                canvas2.drawLine(f36, rectF.top, f36, rectF.bottom, this.f168516d);
                RectF rectF2 = this.f168518f;
                float f37 = rectF2.left;
                float f38 = rectF2.bottom;
                canvas.drawLine(f37, f38, rectF2.right, f38, this.f168516d);
                if (i12 == 2 || i12 == 3) {
                    float f39 = 0.01f * f11;
                    this.f168516d.setColor(-2130748874);
                    this.f168516d.setStrokeWidth(Math.max(1.5f, 0.011f * f11));
                    RectF rectF3 = this.f168518f;
                    canvas2 = canvas;
                    canvas2.drawRect(rectF3.left + f39, rectF3.top + f39, rectF3.right - f39, rectF3.bottom - f39, this.f168516d);
                } else {
                    canvas2 = canvas;
                }
            } else {
                z10 = zEquals2;
                z11 = zEquals3;
                float f40 = (f32 / f12) + f34;
                float f41 = (f33 / f12) + f35;
                float f42 = fMin / f12;
                this.f168518f.set(f40 - f42, f41 - f42, f40 + f42, f41 + f42);
                if (z11) {
                    f42 = fMin * 0.3f;
                }
                this.f168515c.setColor(a(i12));
                canvas2.drawRoundRect(this.f168518f, f42, f42, this.f168515c);
                int i13 = this.f168513a.f168578o;
                if (i13 != 0) {
                    this.f168516d.setColor(i13);
                    this.f168516d.setStrokeWidth(Math.max(1.0f, 0.008f * f11));
                    canvas2.drawRoundRect(this.f168518f, f42, f42, this.f168516d);
                }
            }
            i11++;
            zEquals3 = z11;
            zEquals2 = z10;
        }
    }
}
