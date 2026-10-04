package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes5.dex */
public class MBridgeImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Xfermode f155516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f155517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f155518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f155519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f155520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f155521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f155522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f155523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f155524i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f155525j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f155526k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float[] f155527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private RectF f155528m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RectF f155529n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f155530o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f155531p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Path f155532q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Paint f155533r;

    public MBridgeImageView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        a(canvas, this.f155524i, this.f155525j, this.f155529n, this.f155526k);
    }

    private void b() {
        int i10;
        int i11;
        int i12;
        try {
            if (this.f155526k == null || this.f155527l == null) {
                return;
            }
            int i13 = 0;
            while (true) {
                i10 = 2;
                if (i13 >= 2) {
                    break;
                }
                float[] fArr = this.f155526k;
                float f10 = this.f155520e;
                fArr[i13] = f10;
                this.f155527l[i13] = f10 - (this.f155524i / 2.0f);
                i13++;
            }
            while (true) {
                i11 = 4;
                if (i10 >= 4) {
                    break;
                }
                float[] fArr2 = this.f155526k;
                float f11 = this.f155521f;
                fArr2[i10] = f11;
                this.f155527l[i10] = f11 - (this.f155524i / 2.0f);
                i10++;
            }
            while (true) {
                if (i11 >= 6) {
                    break;
                }
                float[] fArr3 = this.f155526k;
                float f12 = this.f155522g;
                fArr3[i11] = f12;
                this.f155527l[i11] = f12 - (this.f155524i / 2.0f);
                i11++;
            }
            for (i12 = 6; i12 < 8; i12++) {
                float[] fArr4 = this.f155526k;
                float f13 = this.f155523h;
                fArr4[i12] = f13;
                this.f155527l[i12] = f13 - (this.f155524i / 2.0f);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.f155529n;
        if (rectF != null) {
            float f10 = this.f155524i / 2.0f;
            rectF.set(f10, f10, this.f155517b - f10, this.f155518c - f10);
        }
    }

    private void d() {
        RectF rectF = this.f155528m;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.f155517b, this.f155518c);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f155528m, null, 31);
            int i10 = this.f155517b;
            int i11 = this.f155524i * 2;
            float f10 = (i10 - i11) * 1.0f;
            float f11 = i10;
            float f12 = this.f155518c;
            canvas.scale(f10 / f11, ((r5 - i11) * 1.0f) / f12, f11 / 2.0f, f12 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f155533r;
            if (paint != null) {
                paint.reset();
                this.f155533r.setAntiAlias(true);
                this.f155533r.setStyle(Paint.Style.FILL);
                this.f155533r.setXfermode(this.f155516a);
            }
            Path path = this.f155532q;
            if (path != null) {
                path.reset();
                this.f155532q.addRoundRect(this.f155528m, this.f155527l, Path.Direction.CCW);
            }
            canvas.drawPath(this.f155532q, this.f155533r);
            Paint paint2 = this.f155533r;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f155530o) {
                a(canvas);
            }
        } catch (Exception e10) {
            q0.a("MBridgeImageView", e10.getMessage());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f155517b = i10;
        this.f155518c = i11;
        if (this.f155531p) {
            b();
        } else {
            a();
        }
        c();
        d();
    }

    public void setBorder(int i10, int i11, int i12) {
        this.f155530o = true;
        this.f155524i = i11;
        this.f155525j = i12;
        this.f155519d = i10;
    }

    public void setCornerRadius(int i10) {
        this.f155519d = i10;
    }

    public void setCustomBorder(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f155530o = true;
        this.f155531p = true;
        this.f155524i = i14;
        this.f155525j = i15;
        this.f155520e = i10;
        this.f155522g = i12;
        this.f155521f = i11;
        this.f155523h = i13;
    }

    public MBridgeImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        try {
            a(i10, i11);
            Path path = this.f155532q;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f155532q, this.f155533r);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public MBridgeImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f155532q = new Path();
        this.f155533r = new Paint();
        this.f155526k = new float[8];
        this.f155527l = new float[8];
        this.f155529n = new RectF();
        this.f155528m = new RectF();
        this.f155516a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    private void a(int i10, int i11) {
        Path path = this.f155532q;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f155533r;
        if (paint != null) {
            paint.setStrokeWidth(i10);
            this.f155533r.setColor(i11);
            this.f155533r.setStyle(Paint.Style.STROKE);
        }
    }

    private void a() {
        if (this.f155526k == null || this.f155527l == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                float[] fArr = this.f155526k;
                if (i10 >= fArr.length) {
                    return;
                }
                float f10 = this.f155519d;
                fArr[i10] = f10;
                this.f155527l[i10] = f10 - (this.f155524i / 2.0f);
                i10++;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
    }
}
