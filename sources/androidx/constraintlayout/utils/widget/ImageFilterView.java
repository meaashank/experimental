package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.g;
import e.T;
import h.C4472a;

/* JADX INFO: loaded from: classes2.dex */
public class ImageFilterView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f107466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f107467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f107468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f107469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f107470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f107471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f107472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Path f107473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewOutlineProvider f107474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RectF f107475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable[] f107476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LayerDrawable f107477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f107478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f107479n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f107480o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f107481p;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), (ImageFilterView.this.f107471f * Math.min(r3, r4)) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f107472g);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float[] f107484a = new float[20];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ColorMatrix f107485b = new ColorMatrix();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorMatrix f107486c = new ColorMatrix();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f107487d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f107488e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f107489f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f107490g = 1.0f;

        public final void a(float brightness) {
            float[] fArr = this.f107484a;
            fArr[0] = brightness;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = brightness;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = brightness;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        public final void b(float saturationStrength) {
            float f10 = 1.0f - saturationStrength;
            float f11 = 0.2999f * f10;
            float f12 = 0.587f * f10;
            float f13 = f10 * 0.114f;
            float[] fArr = this.f107484a;
            fArr[0] = f11 + saturationStrength;
            fArr[1] = f12;
            fArr[2] = f13;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f11;
            fArr[6] = f12 + saturationStrength;
            fArr[7] = f13;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f11;
            fArr[11] = f12;
            fArr[12] = f13 + saturationStrength;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        public void c(ImageView view) {
            boolean z10;
            this.f107485b.reset();
            float f10 = this.f107488e;
            boolean z11 = true;
            if (f10 != 1.0f) {
                b(f10);
                this.f107485b.set(this.f107484a);
                z10 = true;
            } else {
                z10 = false;
            }
            float f11 = this.f107489f;
            if (f11 != 1.0f) {
                this.f107486c.setScale(f11, f11, f11, 1.0f);
                this.f107485b.postConcat(this.f107486c);
                z10 = true;
            }
            float f12 = this.f107490g;
            if (f12 != 1.0f) {
                d(f12);
                this.f107486c.set(this.f107484a);
                this.f107485b.postConcat(this.f107486c);
                z10 = true;
            }
            float f13 = this.f107487d;
            if (f13 != 1.0f) {
                a(f13);
                this.f107486c.set(this.f107484a);
                this.f107485b.postConcat(this.f107486c);
            } else {
                z11 = z10;
            }
            if (z11) {
                view.setColorFilter(new ColorMatrixColorFilter(this.f107485b));
            } else {
                view.clearColorFilter();
            }
        }

        public final void d(float warmth) {
            float fLog;
            float fPow;
            if (warmth <= 0.0f) {
                warmth = 0.01f;
            }
            float f10 = (5000.0f / warmth) / 100.0f;
            if (f10 > 66.0f) {
                double d10 = f10 - 60.0f;
                fPow = ((float) Math.pow(d10, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) Math.pow(d10, 0.07551484555006027d)) * 288.12216f;
            } else {
                fLog = (((float) Math.log(f10)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            float fLog2 = f10 < 66.0f ? f10 > 19.0f ? (((float) Math.log(f10 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
            float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
            float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
            float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
            float[] fArr = this.f107484a;
            fArr[0] = fMin / fMin4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fMin2 / fMin5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = fMin6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        this.f107466a = new c();
        this.f107467b = true;
        this.f107468c = null;
        this.f107469d = null;
        this.f107470e = 0.0f;
        this.f107471f = 0.0f;
        this.f107472g = Float.NaN;
        this.f107476k = new Drawable[2];
        this.f107478m = Float.NaN;
        this.f107479n = Float.NaN;
        this.f107480o = Float.NaN;
        this.f107481p = Float.NaN;
    }

    private void E() {
        if (Float.isNaN(this.f107478m) && Float.isNaN(this.f107479n) && Float.isNaN(this.f107480o) && Float.isNaN(this.f107481p)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            y();
        }
    }

    private void p(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.ve);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f107468c = typedArrayObtainStyledAttributes.getDrawable(g.m.we);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.Ae) {
                    this.f107470e = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == g.m.Je) {
                    D(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == g.m.Ie) {
                    C(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == g.m.ze) {
                    s(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == g.m.ye) {
                    r(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == g.m.Ge) {
                    A(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == g.m.He) {
                    B(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == g.m.Fe) {
                    this.f107467b = typedArrayObtainStyledAttributes.getBoolean(index, this.f107467b);
                } else if (index == g.m.Be) {
                    u(typedArrayObtainStyledAttributes.getFloat(index, this.f107478m));
                } else if (index == g.m.Ce) {
                    v(typedArrayObtainStyledAttributes.getFloat(index, this.f107479n));
                } else if (index == g.m.De) {
                    w(typedArrayObtainStyledAttributes.getFloat(index, this.f107481p));
                } else if (index == g.m.Ee) {
                    x(typedArrayObtainStyledAttributes.getFloat(index, this.f107480o));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f107469d = drawable;
            if (this.f107468c == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f107469d = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f107476k;
                    Drawable drawableMutate = drawable2.mutate();
                    this.f107469d = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f107476k;
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f107469d = drawableMutate2;
            drawableArr2[0] = drawableMutate2;
            this.f107476k[1] = this.f107468c.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f107476k);
            this.f107477l = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f107470e * 255.0f));
            if (!this.f107467b) {
                this.f107477l.getDrawable(0).setAlpha((int) ((1.0f - this.f107470e) * 255.0f));
            }
            super.setImageDrawable(this.f107477l);
        }
    }

    private void y() {
        if (Float.isNaN(this.f107478m) && Float.isNaN(this.f107479n) && Float.isNaN(this.f107480o) && Float.isNaN(this.f107481p)) {
            return;
        }
        float f10 = Float.isNaN(this.f107478m) ? 0.0f : this.f107478m;
        float f11 = Float.isNaN(this.f107479n) ? 0.0f : this.f107479n;
        float f12 = Float.isNaN(this.f107480o) ? 1.0f : this.f107480o;
        float f13 = Float.isNaN(this.f107481p) ? 0.0f : this.f107481p;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f14 = f12 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f14, f14);
        float f15 = intrinsicWidth * f14;
        float f16 = f14 * intrinsicHeight;
        matrix.postTranslate(((((width - f15) * f10) + width) - f15) * 0.5f, ((((height - f16) * f11) + height) - f16) * 0.5f);
        matrix.postRotate(f13, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void z(boolean overlay) {
        this.f107467b = overlay;
    }

    @T(21)
    public void A(float round) {
        if (Float.isNaN(round)) {
            this.f107472g = round;
            float f10 = this.f107471f;
            this.f107471f = -1.0f;
            B(f10);
            return;
        }
        boolean z10 = this.f107472g != round;
        this.f107472g = round;
        if (round != 0.0f) {
            if (this.f107473h == null) {
                this.f107473h = new Path();
            }
            if (this.f107475j == null) {
                this.f107475j = new RectF();
            }
            if (this.f107474i == null) {
                b bVar = new b();
                this.f107474i = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f107475j.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f107473h.reset();
            Path path = this.f107473h;
            RectF rectF = this.f107475j;
            float f11 = this.f107472g;
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    @T(21)
    public void B(float round) {
        boolean z10 = this.f107471f != round;
        this.f107471f = round;
        if (round != 0.0f) {
            if (this.f107473h == null) {
                this.f107473h = new Path();
            }
            if (this.f107475j == null) {
                this.f107475j = new RectF();
            }
            if (this.f107474i == null) {
                a aVar = new a();
                this.f107474i = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f107471f) / 2.0f;
            this.f107475j.set(0.0f, 0.0f, width, height);
            this.f107473h.reset();
            this.f107473h.addRoundRect(this.f107475j, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void C(float saturation) {
        c cVar = this.f107466a;
        cVar.f107488e = saturation;
        cVar.c(this);
    }

    public void D(float warmth) {
        c cVar = this.f107466a;
        cVar.f107490g = warmth;
        cVar.c(this);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float e() {
        return this.f107466a.f107487d;
    }

    public float f() {
        return this.f107466a.f107489f;
    }

    public float g() {
        return this.f107470e;
    }

    public float h() {
        return this.f107478m;
    }

    public float i() {
        return this.f107479n;
    }

    public float j() {
        return this.f107481p;
    }

    public float k() {
        return this.f107480o;
    }

    public float l() {
        return this.f107472g;
    }

    @Override // android.view.View
    public void layout(int l10, int t10, int r10, int b10) {
        super.layout(l10, t10, r10, b10);
        y();
    }

    public float m() {
        return this.f107471f;
    }

    public float n() {
        return this.f107466a.f107488e;
    }

    public float o() {
        return this.f107466a.f107490g;
    }

    public void q(int resId) {
        Drawable drawableMutate = C4472a.b(getContext(), resId).mutate();
        this.f107468c = drawableMutate;
        Drawable[] drawableArr = this.f107476k;
        drawableArr[0] = this.f107469d;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f107476k);
        this.f107477l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        t(this.f107470e);
    }

    public void r(float brightness) {
        c cVar = this.f107466a;
        cVar.f107487d = brightness;
        cVar.c(this);
    }

    public void s(float contrast) {
        c cVar = this.f107466a;
        cVar.f107489f = contrast;
        cVar.c(this);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f107468c == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f107469d = drawableMutate;
        Drawable[] drawableArr = this.f107476k;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f107468c;
        LayerDrawable layerDrawable = new LayerDrawable(this.f107476k);
        this.f107477l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        t(this.f107470e);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        if (this.f107468c == null) {
            super.setImageResource(resId);
            return;
        }
        Drawable drawableMutate = C4472a.b(getContext(), resId).mutate();
        this.f107469d = drawableMutate;
        Drawable[] drawableArr = this.f107476k;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f107468c;
        LayerDrawable layerDrawable = new LayerDrawable(this.f107476k);
        this.f107477l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        t(this.f107470e);
    }

    public void t(float crossfade) {
        this.f107470e = crossfade;
        if (this.f107476k != null) {
            if (!this.f107467b) {
                this.f107477l.getDrawable(0).setAlpha((int) ((1.0f - this.f107470e) * 255.0f));
            }
            this.f107477l.getDrawable(1).setAlpha((int) (this.f107470e * 255.0f));
            super.setImageDrawable(this.f107477l);
        }
    }

    public void u(float pan) {
        this.f107478m = pan;
        E();
    }

    public void v(float pan) {
        this.f107479n = pan;
        E();
    }

    public void w(float rotation) {
        this.f107481p = rotation;
        E();
    }

    public void x(float zoom) {
        this.f107480o = zoom;
        E();
    }

    public ImageFilterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f107466a = new c();
        this.f107467b = true;
        this.f107468c = null;
        this.f107469d = null;
        this.f107470e = 0.0f;
        this.f107471f = 0.0f;
        this.f107472g = Float.NaN;
        this.f107476k = new Drawable[2];
        this.f107478m = Float.NaN;
        this.f107479n = Float.NaN;
        this.f107480o = Float.NaN;
        this.f107481p = Float.NaN;
        p(context, attrs);
    }

    public ImageFilterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f107466a = new c();
        this.f107467b = true;
        this.f107468c = null;
        this.f107469d = null;
        this.f107470e = 0.0f;
        this.f107471f = 0.0f;
        this.f107472g = Float.NaN;
        this.f107476k = new Drawable[2];
        this.f107478m = Float.NaN;
        this.f107479n = Float.NaN;
        this.f107480o = Float.NaN;
        this.f107481p = Float.NaN;
        p(context, attrs);
    }
}
