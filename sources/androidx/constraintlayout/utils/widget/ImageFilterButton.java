package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.g;
import e.T;
import h.C4472a;

/* JADX INFO: loaded from: classes2.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageFilterView.c f107448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f107449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f107450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f107451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Path f107452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewOutlineProvider f107453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RectF f107454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable[] f107455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LayerDrawable f107456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f107457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f107458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f107459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f107460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f107461n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f107462o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f107463p;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), (ImageFilterButton.this.f107450c * Math.min(r3, r4)) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f107451d);
        }
    }

    public ImageFilterButton(Context context) {
        super(context, null);
        this.f107448a = new ImageFilterView.c();
        this.f107449b = 0.0f;
        this.f107450c = 0.0f;
        this.f107451d = Float.NaN;
        this.f107455h = new Drawable[2];
        this.f107457j = true;
        this.f107458k = null;
        this.f107459l = null;
        this.f107460m = Float.NaN;
        this.f107461n = Float.NaN;
        this.f107462o = Float.NaN;
        this.f107463p = Float.NaN;
        setPadding(0, 0, 0, 0);
    }

    private void m(Context context, AttributeSet attrs) {
        setPadding(0, 0, 0, 0);
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.ve);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f107458k = typedArrayObtainStyledAttributes.getDrawable(g.m.we);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.Ae) {
                    this.f107449b = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == g.m.Je) {
                    A(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == g.m.Ie) {
                    z(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == g.m.ze) {
                    p(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == g.m.Ge) {
                    x(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == g.m.He) {
                    y(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == g.m.Fe) {
                    this.f107457j = typedArrayObtainStyledAttributes.getBoolean(index, this.f107457j);
                } else if (index == g.m.Be) {
                    r(typedArrayObtainStyledAttributes.getFloat(index, this.f107460m));
                } else if (index == g.m.Ce) {
                    s(typedArrayObtainStyledAttributes.getFloat(index, this.f107461n));
                } else if (index == g.m.De) {
                    t(typedArrayObtainStyledAttributes.getFloat(index, this.f107463p));
                } else if (index == g.m.Ee) {
                    u(typedArrayObtainStyledAttributes.getFloat(index, this.f107462o));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f107459l = drawable;
            if (this.f107458k == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f107459l = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f107455h;
                    Drawable drawableMutate = drawable2.mutate();
                    this.f107459l = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f107455h;
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f107459l = drawableMutate2;
            drawableArr2[0] = drawableMutate2;
            this.f107455h[1] = this.f107458k.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f107455h);
            this.f107456i = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f107449b * 255.0f));
            if (!this.f107457j) {
                this.f107456i.getDrawable(0).setAlpha((int) ((1.0f - this.f107449b) * 255.0f));
            }
            super.setImageDrawable(this.f107456i);
        }
    }

    public void A(float warmth) {
        ImageFilterView.c cVar = this.f107448a;
        cVar.f107490g = warmth;
        cVar.c(this);
    }

    public final void B() {
        if (Float.isNaN(this.f107460m) && Float.isNaN(this.f107461n) && Float.isNaN(this.f107462o) && Float.isNaN(this.f107463p)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            v();
        }
    }

    public float c() {
        return this.f107448a.f107489f;
    }

    public float d() {
        return this.f107449b;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float e() {
        return this.f107460m;
    }

    public float f() {
        return this.f107461n;
    }

    public float g() {
        return this.f107463p;
    }

    public float h() {
        return this.f107462o;
    }

    public float i() {
        return this.f107451d;
    }

    public float j() {
        return this.f107450c;
    }

    public float k() {
        return this.f107448a.f107488e;
    }

    public float l() {
        return this.f107448a.f107490g;
    }

    @Override // android.view.View
    public void layout(int l10, int t10, int r10, int b10) {
        super.layout(l10, t10, r10, b10);
        v();
    }

    public void n(int resId) {
        Drawable drawableMutate = C4472a.b(getContext(), resId).mutate();
        this.f107458k = drawableMutate;
        Drawable[] drawableArr = this.f107455h;
        drawableArr[0] = this.f107459l;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f107455h);
        this.f107456i = layerDrawable;
        super.setImageDrawable(layerDrawable);
        q(this.f107449b);
    }

    public void o(float brightness) {
        ImageFilterView.c cVar = this.f107448a;
        cVar.f107487d = brightness;
        cVar.c(this);
    }

    public void p(float contrast) {
        ImageFilterView.c cVar = this.f107448a;
        cVar.f107489f = contrast;
        cVar.c(this);
    }

    public void q(float crossfade) {
        this.f107449b = crossfade;
        if (this.f107455h != null) {
            if (!this.f107457j) {
                this.f107456i.getDrawable(0).setAlpha((int) ((1.0f - this.f107449b) * 255.0f));
            }
            this.f107456i.getDrawable(1).setAlpha((int) (this.f107449b * 255.0f));
            super.setImageDrawable(this.f107456i);
        }
    }

    public void r(float pan) {
        this.f107460m = pan;
        B();
    }

    public void s(float pan) {
        this.f107461n = pan;
        B();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f107458k == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f107459l = drawableMutate;
        Drawable[] drawableArr = this.f107455h;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f107458k;
        LayerDrawable layerDrawable = new LayerDrawable(this.f107455h);
        this.f107456i = layerDrawable;
        super.setImageDrawable(layerDrawable);
        q(this.f107449b);
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int resId) {
        if (this.f107458k == null) {
            super.setImageResource(resId);
            return;
        }
        Drawable drawableMutate = C4472a.b(getContext(), resId).mutate();
        this.f107459l = drawableMutate;
        Drawable[] drawableArr = this.f107455h;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f107458k;
        LayerDrawable layerDrawable = new LayerDrawable(this.f107455h);
        this.f107456i = layerDrawable;
        super.setImageDrawable(layerDrawable);
        q(this.f107449b);
    }

    public void t(float rotation) {
        this.f107463p = rotation;
        B();
    }

    public void u(float zoom) {
        this.f107462o = zoom;
        B();
    }

    public final void v() {
        if (Float.isNaN(this.f107460m) && Float.isNaN(this.f107461n) && Float.isNaN(this.f107462o) && Float.isNaN(this.f107463p)) {
            return;
        }
        float f10 = Float.isNaN(this.f107460m) ? 0.0f : this.f107460m;
        float f11 = Float.isNaN(this.f107461n) ? 0.0f : this.f107461n;
        float f12 = Float.isNaN(this.f107462o) ? 1.0f : this.f107462o;
        float f13 = Float.isNaN(this.f107463p) ? 0.0f : this.f107463p;
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

    public final void w(boolean overlay) {
        this.f107457j = overlay;
    }

    @T(21)
    public void x(float round) {
        if (Float.isNaN(round)) {
            this.f107451d = round;
            float f10 = this.f107450c;
            this.f107450c = -1.0f;
            y(f10);
            return;
        }
        boolean z10 = this.f107451d != round;
        this.f107451d = round;
        if (round != 0.0f) {
            if (this.f107452e == null) {
                this.f107452e = new Path();
            }
            if (this.f107454g == null) {
                this.f107454g = new RectF();
            }
            if (this.f107453f == null) {
                b bVar = new b();
                this.f107453f = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f107454g.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f107452e.reset();
            Path path = this.f107452e;
            RectF rectF = this.f107454g;
            float f11 = this.f107451d;
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    @T(21)
    public void y(float round) {
        boolean z10 = this.f107450c != round;
        this.f107450c = round;
        if (round != 0.0f) {
            if (this.f107452e == null) {
                this.f107452e = new Path();
            }
            if (this.f107454g == null) {
                this.f107454g = new RectF();
            }
            if (this.f107453f == null) {
                a aVar = new a();
                this.f107453f = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f107450c) / 2.0f;
            this.f107454g.set(0.0f, 0.0f, width, height);
            this.f107452e.reset();
            this.f107452e.addRoundRect(this.f107454g, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void z(float saturation) {
        ImageFilterView.c cVar = this.f107448a;
        cVar.f107488e = saturation;
        cVar.c(this);
    }

    public ImageFilterButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f107448a = new ImageFilterView.c();
        this.f107449b = 0.0f;
        this.f107450c = 0.0f;
        this.f107451d = Float.NaN;
        this.f107455h = new Drawable[2];
        this.f107457j = true;
        this.f107458k = null;
        this.f107459l = null;
        this.f107460m = Float.NaN;
        this.f107461n = Float.NaN;
        this.f107462o = Float.NaN;
        this.f107463p = Float.NaN;
        m(context, attrs);
    }

    public ImageFilterButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f107448a = new ImageFilterView.c();
        this.f107449b = 0.0f;
        this.f107450c = 0.0f;
        this.f107451d = Float.NaN;
        this.f107455h = new Drawable[2];
        this.f107457j = true;
        this.f107458k = null;
        this.f107459l = null;
        this.f107460m = Float.NaN;
        this.f107461n = Float.NaN;
        this.f107462o = Float.NaN;
        this.f107463p = Float.NaN;
        m(context, attrs);
    }
}
