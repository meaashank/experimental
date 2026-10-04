package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C2377c;
import androidx.constraintlayout.motion.widget.e;
import androidx.constraintlayout.widget.g;
import androidx.core.view.E;
import com.bumptech.glide.load.engine.GlideException;
import e.T;
import g.C4426a;

/* JADX INFO: loaded from: classes2.dex */
public class MotionLabel extends View implements e {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static String f107509W = "MotionLabel";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f107510a0 = 1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f107511b0 = 2;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f107512c0 = 3;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f107513A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f107514B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f107515C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f107516D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Drawable f107517E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Matrix f107518F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Bitmap f107519G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public BitmapShader f107520H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Matrix f107521I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f107522J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f107523K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f107524L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f107525M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Paint f107526N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f107527O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Rect f107528P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Paint f107529Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public float f107530R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public float f107531S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f107532T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public float f107533U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f107534V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextPaint f107535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Path f107536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f107538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f107539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f107540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f107541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewOutlineProvider f107542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RectF f107543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f107544j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f107545k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f107546l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f107547m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f107548n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f107549o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f107550p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Rect f107551q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f107552r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f107553s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f107554t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f107555u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f107556v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f107557w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Layout f107558x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f107559y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f107560z;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), (MotionLabel.this.f107540f * Math.min(r3, r4)) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f107541g);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        this.f107535a = new TextPaint();
        this.f107536b = new Path();
        this.f107537c = 65535;
        this.f107538d = 65535;
        this.f107539e = false;
        this.f107540f = 0.0f;
        this.f107541g = Float.NaN;
        this.f107544j = 48.0f;
        this.f107545k = Float.NaN;
        this.f107548n = 0.0f;
        this.f107549o = "Hello World";
        this.f107550p = true;
        this.f107551q = new Rect();
        this.f107553s = 1;
        this.f107554t = 1;
        this.f107555u = 1;
        this.f107556v = 1;
        this.f107559y = 8388659;
        this.f107560z = 0;
        this.f107513A = false;
        this.f107522J = Float.NaN;
        this.f107523K = Float.NaN;
        this.f107524L = 0.0f;
        this.f107525M = 0.0f;
        this.f107526N = new Paint();
        this.f107527O = 0;
        this.f107531S = Float.NaN;
        this.f107532T = Float.NaN;
        this.f107533U = Float.NaN;
        this.f107534V = Float.NaN;
        v(context, null);
    }

    public void A(CharSequence text) {
        this.f107549o = text.toString();
        invalidate();
    }

    public void B(float pan) {
        this.f107531S = pan;
        S();
        invalidate();
    }

    public void C(float pan) {
        this.f107532T = pan;
        S();
        invalidate();
    }

    public void D(float rotation) {
        this.f107534V = rotation;
        S();
        invalidate();
    }

    public void E(float zoom) {
        this.f107533U = zoom;
        S();
        invalidate();
    }

    public void F(int color) {
        this.f107537c = color;
        invalidate();
    }

    public void G(int color) {
        this.f107538d = color;
        this.f107539e = true;
        invalidate();
    }

    public void H(float width) {
        this.f107548n = width;
        this.f107539e = true;
        if (Float.isNaN(width)) {
            this.f107548n = 1.0f;
            this.f107539e = false;
        }
        invalidate();
    }

    public void I(float textPanX) {
        this.f107524L = textPanX;
        invalidate();
    }

    public void J(float textPanY) {
        this.f107525M = textPanY;
        invalidate();
    }

    public void K(float size) {
        this.f107544j = size;
        Log.v(f107509W, C2377c.f() + GlideException.a.f139488d + size + " / " + this.f107545k);
        TextPaint textPaint = this.f107535a;
        if (!Float.isNaN(this.f107545k)) {
            size = this.f107545k;
        }
        textPaint.setTextSize(size);
        f(Float.isNaN(this.f107545k) ? 1.0f : this.f107544j / this.f107545k);
        requestLayout();
        invalidate();
    }

    public void L(float mTextureHeight) {
        this.f107522J = mTextureHeight;
        S();
        invalidate();
    }

    public void M(float mTextureWidth) {
        this.f107523K = mTextureWidth;
        S();
        invalidate();
    }

    public void N(Typeface tf) {
        if (this.f107535a.getTypeface() != tf) {
            this.f107535a.setTypeface(tf);
            if (this.f107558x != null) {
                this.f107558x = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public final void O(String familyName, int typefaceIndex, int styleIndex) {
        Typeface typefaceCreate;
        if (familyName != null) {
            typefaceCreate = Typeface.create(familyName, styleIndex);
            if (typefaceCreate != null) {
                N(typefaceCreate);
                return;
            }
        } else {
            typefaceCreate = null;
        }
        if (typefaceIndex == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (typefaceIndex == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (typefaceIndex == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        if (styleIndex <= 0) {
            this.f107535a.setFakeBoldText(false);
            this.f107535a.setTextSkewX(0.0f);
            N(typefaceCreate);
        } else {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(styleIndex) : Typeface.create(typefaceCreate, styleIndex);
            N(typefaceDefaultFromStyle);
            int i10 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & styleIndex;
            this.f107535a.setFakeBoldText((i10 & 1) != 0);
            this.f107535a.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public final void P(Context context, @Nullable AttributeSet attrs) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C4426a.b.f200751J0, typedValue, true);
        TextPaint textPaint = this.f107535a;
        int i10 = typedValue.data;
        this.f107537c = i10;
        textPaint.setColor(i10);
    }

    public void Q() {
        this.f107553s = getPaddingLeft();
        this.f107554t = getPaddingRight();
        this.f107555u = getPaddingTop();
        this.f107556v = getPaddingBottom();
        O(this.f107557w, this.f107547m, this.f107546l);
        this.f107535a.setColor(this.f107537c);
        this.f107535a.setStrokeWidth(this.f107548n);
        this.f107535a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f107535a.setFlags(128);
        K(this.f107544j);
        this.f107535a.setAntiAlias(true);
    }

    public final void R() {
        if (this.f107517E != null) {
            this.f107521I = new Matrix();
            int intrinsicWidth = this.f107517E.getIntrinsicWidth();
            int intrinsicHeight = this.f107517E.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.f107523K) ? 128 : (int) this.f107523K;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.f107522J) ? 128 : (int) this.f107522J;
            }
            if (this.f107527O != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f107519G = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f107519G);
            this.f107517E.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f107517E.setFilterBitmap(true);
            this.f107517E.draw(canvas);
            if (this.f107527O != 0) {
                this.f107519G = e(this.f107519G, 4);
            }
            Bitmap bitmap = this.f107519G;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f107520H = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    public final void S() {
        float f10 = Float.isNaN(this.f107531S) ? 0.0f : this.f107531S;
        float f11 = Float.isNaN(this.f107532T) ? 0.0f : this.f107532T;
        float f12 = Float.isNaN(this.f107533U) ? 1.0f : this.f107533U;
        float f13 = Float.isNaN(this.f107534V) ? 0.0f : this.f107534V;
        this.f107521I.reset();
        float width = this.f107519G.getWidth();
        float height = this.f107519G.getHeight();
        float f14 = Float.isNaN(this.f107523K) ? this.f107515C : this.f107523K;
        float f15 = Float.isNaN(this.f107522J) ? this.f107516D : this.f107522J;
        float f16 = f12 * (width * f15 < height * f14 ? f14 / width : f15 / height);
        this.f107521I.postScale(f16, f16);
        float f17 = width * f16;
        float f18 = f14 - f17;
        float f19 = f16 * height;
        float f20 = f15 - f19;
        if (!Float.isNaN(this.f107522J)) {
            f20 = this.f107522J / 2.0f;
        }
        if (!Float.isNaN(this.f107523K)) {
            f18 = this.f107523K / 2.0f;
        }
        this.f107521I.postTranslate((((f10 * f18) + f14) - f17) * 0.5f, (((f11 * f20) + f15) - f19) * 0.5f);
        this.f107521I.postRotate(f13, f14 / 2.0f, f15 / 2.0f);
        this.f107520H.setLocalMatrix(this.f107521I);
    }

    @Override // androidx.constraintlayout.motion.widget.e
    public void a(float l10, float t10, float r10, float b10) {
        int i10 = (int) (l10 + 0.5f);
        this.f107514B = l10 - i10;
        int i11 = (int) (r10 + 0.5f);
        int i12 = i11 - i10;
        int i13 = (int) (b10 + 0.5f);
        int i14 = (int) (0.5f + t10);
        int i15 = i13 - i14;
        float f10 = r10 - l10;
        this.f107515C = f10;
        float f11 = b10 - t10;
        this.f107516D = f11;
        d(l10, t10, r10, b10);
        if (getMeasuredHeight() == i15 && getMeasuredWidth() == i12) {
            super.layout(i10, i14, i11, i13);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
            super.layout(i10, i14, i11, i13);
        }
        if (this.f107513A) {
            if (this.f107528P == null) {
                this.f107529Q = new Paint();
                this.f107528P = new Rect();
                this.f107529Q.set(this.f107535a);
                this.f107530R = this.f107529Q.getTextSize();
            }
            this.f107515C = f10;
            this.f107516D = f11;
            Paint paint = this.f107529Q;
            String str = this.f107549o;
            paint.getTextBounds(str, 0, str.length(), this.f107528P);
            float fHeight = this.f107528P.height() * 1.3f;
            float f12 = (f10 - this.f107554t) - this.f107553s;
            float f13 = (f11 - this.f107556v) - this.f107555u;
            float fWidth = this.f107528P.width();
            if (fWidth * f13 > fHeight * f12) {
                this.f107535a.setTextSize((this.f107530R * f12) / fWidth);
            } else {
                this.f107535a.setTextSize((this.f107530R * f13) / fHeight);
            }
            if (this.f107539e || !Float.isNaN(this.f107545k)) {
                f(Float.isNaN(this.f107545k) ? 1.0f : this.f107544j / this.f107545k);
            }
        }
    }

    public final void d(float l10, float t10, float r10, float b10) {
        if (this.f107521I == null) {
            return;
        }
        this.f107515C = r10 - l10;
        this.f107516D = b10 - t10;
        S();
    }

    public Bitmap e(Bitmap bitmapOriginal, int factor) {
        System.nanoTime();
        int width = bitmapOriginal.getWidth() / 2;
        int height = bitmapOriginal.getHeight() / 2;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapOriginal, width, height, true);
        for (int i10 = 0; i10 < factor && width >= 32 && height >= 32; i10++) {
            width /= 2;
            height /= 2;
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
        }
        return bitmapCreateScaledBitmap;
    }

    public void f(float scale) {
        if (this.f107539e || scale != 1.0f) {
            this.f107536b.reset();
            String str = this.f107549o;
            int length = str.length();
            this.f107535a.getTextBounds(str, 0, length, this.f107551q);
            this.f107535a.getTextPath(str, 0, length, 0.0f, 0.0f, this.f107536b);
            if (scale != 1.0f) {
                Log.v(f107509W, C2377c.f() + " scale " + scale);
                Matrix matrix = new Matrix();
                matrix.postScale(scale, scale);
                this.f107536b.transform(matrix);
            }
            Rect rect = this.f107551q;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.f107550p = false;
        }
    }

    public final float g() {
        float f10 = Float.isNaN(this.f107545k) ? 1.0f : this.f107544j / this.f107545k;
        TextPaint textPaint = this.f107535a;
        String str = this.f107549o;
        return ((this.f107524L + 1.0f) * ((((Float.isNaN(this.f107515C) ? getMeasuredWidth() : this.f107515C) - getPaddingLeft()) - getPaddingRight()) - (textPaint.measureText(str, 0, str.length()) * f10))) / 2.0f;
    }

    public float h() {
        return this.f107541g;
    }

    public float i() {
        return this.f107540f;
    }

    public float j() {
        return this.f107545k;
    }

    public float k() {
        return this.f107531S;
    }

    public float l() {
        return this.f107532T;
    }

    @Override // android.view.View
    public void layout(int l10, int t10, int r10, int b10) {
        super.layout(l10, t10, r10, b10);
        boolean zIsNaN = Float.isNaN(this.f107545k);
        float f10 = zIsNaN ? 1.0f : this.f107544j / this.f107545k;
        this.f107515C = r10 - l10;
        this.f107516D = b10 - t10;
        if (this.f107513A) {
            if (this.f107528P == null) {
                this.f107529Q = new Paint();
                this.f107528P = new Rect();
                this.f107529Q.set(this.f107535a);
                this.f107530R = this.f107529Q.getTextSize();
            }
            Paint paint = this.f107529Q;
            String str = this.f107549o;
            paint.getTextBounds(str, 0, str.length(), this.f107528P);
            int iWidth = this.f107528P.width();
            int iHeight = (int) (this.f107528P.height() * 1.3f);
            float f11 = (this.f107515C - this.f107554t) - this.f107553s;
            float f12 = (this.f107516D - this.f107556v) - this.f107555u;
            if (zIsNaN) {
                float f13 = iWidth;
                float f14 = iHeight;
                if (f13 * f12 > f14 * f11) {
                    this.f107535a.setTextSize((this.f107530R * f11) / f13);
                } else {
                    this.f107535a.setTextSize((this.f107530R * f12) / f14);
                }
            } else {
                float f15 = iWidth;
                float f16 = iHeight;
                f10 = f15 * f12 > f16 * f11 ? f11 / f15 : f12 / f16;
            }
        }
        if (this.f107539e || !zIsNaN) {
            d(l10, t10, r10, b10);
            f(f10);
        }
    }

    public float m() {
        return this.f107534V;
    }

    public float n() {
        return this.f107533U;
    }

    public int o() {
        return this.f107538d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f10 = Float.isNaN(this.f107545k) ? 1.0f : this.f107544j / this.f107545k;
        super.onDraw(canvas);
        if (!this.f107539e && f10 == 1.0f) {
            canvas.drawText(this.f107549o, this.f107514B + g() + this.f107553s, u() + this.f107555u, this.f107535a);
            return;
        }
        if (this.f107550p) {
            f(f10);
        }
        if (this.f107518F == null) {
            this.f107518F = new Matrix();
        }
        if (!this.f107539e) {
            float fG = g() + this.f107553s;
            float fU = u() + this.f107555u;
            this.f107518F.reset();
            this.f107518F.preTranslate(fG, fU);
            this.f107536b.transform(this.f107518F);
            this.f107535a.setColor(this.f107537c);
            this.f107535a.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f107535a.setStrokeWidth(this.f107548n);
            canvas.drawPath(this.f107536b, this.f107535a);
            this.f107518F.reset();
            this.f107518F.preTranslate(-fG, -fU);
            this.f107536b.transform(this.f107518F);
            return;
        }
        this.f107526N.set(this.f107535a);
        this.f107518F.reset();
        float fG2 = g() + this.f107553s;
        float fU2 = u() + this.f107555u;
        this.f107518F.postTranslate(fG2, fU2);
        this.f107518F.preScale(f10, f10);
        this.f107536b.transform(this.f107518F);
        if (this.f107520H != null) {
            this.f107535a.setFilterBitmap(true);
            this.f107535a.setShader(this.f107520H);
        } else {
            this.f107535a.setColor(this.f107537c);
        }
        this.f107535a.setStyle(Paint.Style.FILL);
        this.f107535a.setStrokeWidth(this.f107548n);
        canvas.drawPath(this.f107536b, this.f107535a);
        if (this.f107520H != null) {
            this.f107535a.setShader(null);
        }
        this.f107535a.setColor(this.f107538d);
        this.f107535a.setStyle(Paint.Style.STROKE);
        this.f107535a.setStrokeWidth(this.f107548n);
        canvas.drawPath(this.f107536b, this.f107535a);
        this.f107518F.reset();
        this.f107518F.postTranslate(-fG2, -fU2);
        this.f107536b.transform(this.f107518F);
        this.f107535a.set(this.f107526N);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        this.f107513A = false;
        this.f107553s = getPaddingLeft();
        this.f107554t = getPaddingRight();
        this.f107555u = getPaddingTop();
        this.f107556v = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f107535a;
            String str = this.f107549o;
            textPaint.getTextBounds(str, 0, str.length(), this.f107551q);
            if (mode != 1073741824) {
                size = (int) (this.f107551q.width() + 0.99999f);
            }
            size += this.f107553s + this.f107554t;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f107535a.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f107555u + this.f107556v + fontMetricsInt;
            }
        } else if (this.f107560z != 0) {
            this.f107513A = true;
        }
        setMeasuredDimension(size, size2);
    }

    public float p() {
        return this.f107524L;
    }

    public float q() {
        return this.f107525M;
    }

    public float r() {
        return this.f107522J;
    }

    public float s() {
        return this.f107523K;
    }

    public Typeface t() {
        return this.f107535a.getTypeface();
    }

    public final float u() {
        float f10 = Float.isNaN(this.f107545k) ? 1.0f : this.f107544j / this.f107545k;
        Paint.FontMetrics fontMetrics = this.f107535a.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.f107516D) ? getMeasuredHeight() : this.f107516D) - getPaddingTop()) - getPaddingBottom();
        float f11 = fontMetrics.descent;
        float f12 = fontMetrics.ascent;
        return (((1.0f - this.f107525M) * (measuredHeight - ((f11 - f12) * f10))) / 2.0f) - (f10 * f12);
    }

    public final void v(Context context, AttributeSet attrs) {
        P(context, attrs);
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.Lj);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.Rj) {
                    A(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == g.m.Tj) {
                    this.f107557w = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == g.m.Xj) {
                    this.f107545k = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f107545k);
                } else if (index == g.m.Mj) {
                    this.f107544j = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f107544j);
                } else if (index == g.m.Oj) {
                    this.f107546l = typedArrayObtainStyledAttributes.getInt(index, this.f107546l);
                } else if (index == g.m.Nj) {
                    this.f107547m = typedArrayObtainStyledAttributes.getInt(index, this.f107547m);
                } else if (index == g.m.Pj) {
                    this.f107537c = typedArrayObtainStyledAttributes.getColor(index, this.f107537c);
                } else if (index == g.m.Vj) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.f107541g);
                    this.f107541g = dimension;
                    x(dimension);
                } else if (index == g.m.Wj) {
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f107540f);
                    this.f107540f = f10;
                    y(f10);
                } else if (index == g.m.Qj) {
                    w(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == g.m.Uj) {
                    this.f107560z = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == g.m.dk) {
                    this.f107538d = typedArrayObtainStyledAttributes.getInt(index, this.f107538d);
                    this.f107539e = true;
                } else if (index == g.m.ek) {
                    this.f107548n = typedArrayObtainStyledAttributes.getDimension(index, this.f107548n);
                    this.f107539e = true;
                } else if (index == g.m.Yj) {
                    this.f107517E = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.f107539e = true;
                } else if (index == g.m.Zj) {
                    this.f107531S = typedArrayObtainStyledAttributes.getFloat(index, this.f107531S);
                } else if (index == g.m.ak) {
                    this.f107532T = typedArrayObtainStyledAttributes.getFloat(index, this.f107532T);
                } else if (index == g.m.fk) {
                    this.f107524L = typedArrayObtainStyledAttributes.getFloat(index, this.f107524L);
                } else if (index == g.m.gk) {
                    this.f107525M = typedArrayObtainStyledAttributes.getFloat(index, this.f107525M);
                } else if (index == g.m.bk) {
                    this.f107534V = typedArrayObtainStyledAttributes.getFloat(index, this.f107534V);
                } else if (index == g.m.ck) {
                    this.f107533U = typedArrayObtainStyledAttributes.getFloat(index, this.f107533U);
                } else if (index == g.m.jk) {
                    this.f107522J = typedArrayObtainStyledAttributes.getDimension(index, this.f107522J);
                } else if (index == g.m.kk) {
                    this.f107523K = typedArrayObtainStyledAttributes.getDimension(index, this.f107523K);
                } else if (index == g.m.ik) {
                    this.f107527O = typedArrayObtainStyledAttributes.getInt(index, this.f107527O);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        R();
        Q();
    }

    @SuppressLint({"RtlHardcoded"})
    public void w(int gravity) {
        if ((gravity & E.f111495d) == 0) {
            gravity |= E.f111493b;
        }
        if ((gravity & 112) == 0) {
            gravity |= 48;
        }
        if (gravity != this.f107559y) {
            invalidate();
        }
        this.f107559y = gravity;
        int i10 = gravity & 112;
        if (i10 == 48) {
            this.f107525M = -1.0f;
        } else if (i10 != 80) {
            this.f107525M = 0.0f;
        } else {
            this.f107525M = 1.0f;
        }
        int i11 = gravity & E.f111495d;
        if (i11 != 3) {
            if (i11 != 5) {
                if (i11 != 8388611) {
                    if (i11 != 8388613) {
                        this.f107524L = 0.0f;
                        return;
                    }
                }
            }
            this.f107524L = 1.0f;
            return;
        }
        this.f107524L = -1.0f;
    }

    @T(21)
    public void x(float round) {
        if (Float.isNaN(round)) {
            this.f107541g = round;
            float f10 = this.f107540f;
            this.f107540f = -1.0f;
            y(f10);
            return;
        }
        boolean z10 = this.f107541g != round;
        this.f107541g = round;
        if (round != 0.0f) {
            if (this.f107536b == null) {
                this.f107536b = new Path();
            }
            if (this.f107543i == null) {
                this.f107543i = new RectF();
            }
            if (this.f107542h == null) {
                b bVar = new b();
                this.f107542h = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f107543i.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f107536b.reset();
            Path path = this.f107536b;
            RectF rectF = this.f107543i;
            float f11 = this.f107541g;
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
        boolean z10 = this.f107540f != round;
        this.f107540f = round;
        if (round != 0.0f) {
            if (this.f107536b == null) {
                this.f107536b = new Path();
            }
            if (this.f107543i == null) {
                this.f107543i = new RectF();
            }
            if (this.f107542h == null) {
                a aVar = new a();
                this.f107542h = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f107540f) / 2.0f;
            this.f107543i.set(0.0f, 0.0f, width, height);
            this.f107536b.reset();
            this.f107536b.addRoundRect(this.f107543i, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void z(float size) {
        this.f107545k = size;
    }

    public MotionLabel(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.f107535a = new TextPaint();
        this.f107536b = new Path();
        this.f107537c = 65535;
        this.f107538d = 65535;
        this.f107539e = false;
        this.f107540f = 0.0f;
        this.f107541g = Float.NaN;
        this.f107544j = 48.0f;
        this.f107545k = Float.NaN;
        this.f107548n = 0.0f;
        this.f107549o = "Hello World";
        this.f107550p = true;
        this.f107551q = new Rect();
        this.f107553s = 1;
        this.f107554t = 1;
        this.f107555u = 1;
        this.f107556v = 1;
        this.f107559y = 8388659;
        this.f107560z = 0;
        this.f107513A = false;
        this.f107522J = Float.NaN;
        this.f107523K = Float.NaN;
        this.f107524L = 0.0f;
        this.f107525M = 0.0f;
        this.f107526N = new Paint();
        this.f107527O = 0;
        this.f107531S = Float.NaN;
        this.f107532T = Float.NaN;
        this.f107533U = Float.NaN;
        this.f107534V = Float.NaN;
        v(context, attrs);
    }

    public MotionLabel(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f107535a = new TextPaint();
        this.f107536b = new Path();
        this.f107537c = 65535;
        this.f107538d = 65535;
        this.f107539e = false;
        this.f107540f = 0.0f;
        this.f107541g = Float.NaN;
        this.f107544j = 48.0f;
        this.f107545k = Float.NaN;
        this.f107548n = 0.0f;
        this.f107549o = "Hello World";
        this.f107550p = true;
        this.f107551q = new Rect();
        this.f107553s = 1;
        this.f107554t = 1;
        this.f107555u = 1;
        this.f107556v = 1;
        this.f107559y = 8388659;
        this.f107560z = 0;
        this.f107513A = false;
        this.f107522J = Float.NaN;
        this.f107523K = Float.NaN;
        this.f107524L = 0.0f;
        this.f107525M = 0.0f;
        this.f107526N = new Paint();
        this.f107527O = 0;
        this.f107531S = Float.NaN;
        this.f107532T = Float.NaN;
        this.f107533U = Float.NaN;
        this.f107534V = Float.NaN;
        v(context, attrs);
    }
}
