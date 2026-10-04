package Ha;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.compose.ui.graphics.colorspace.C2016d;
import com.prism.commons.utils.l0;
import i.C4541d;
import java.lang.ref.WeakReference;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes7.dex */
public class d implements Ha.c, View.OnTouchListener, Ia.e, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f50684G = -1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f50685H = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f50686I = 1;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f50687J = 2;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public RunnableC0046d f50689A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f50690B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f50691C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f50692D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ImageView.ScaleType f50693E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Interpolator f50694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f50696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f50697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f50698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f50699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f50700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f50701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public WeakReference<ImageView> f50702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GestureDetector f50703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ia.d f50704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Matrix f50705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Matrix f50706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Matrix f50707n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final RectF f50708o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f50709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public e f50710q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f50711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i f50712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View.OnLongClickListener f50713t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g f50714u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h f50715v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f50716w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f50717x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f50718y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f50719z;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f50683F = l0.b(d.class.getSimpleName());

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static int f50688K = 1;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (d.this.f50715v == null || d.this.c() > 1.0f || motionEvent.getPointerCount() > d.f50688K || motionEvent2.getPointerCount() > d.f50688K) {
                return false;
            }
            return d.this.f50715v.onFling(motionEvent, motionEvent2, f10, f11);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (d.this.f50713t != null) {
                d dVar = d.this;
                dVar.f50713t.onLongClick(dVar.W());
            }
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50721a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f50721a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50721a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50721a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50721a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50721a[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f50722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f50723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f50724c = System.currentTimeMillis();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f50725d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f50726e;

        public c(float f10, float f11, float f12, float f13) {
            this.f50722a = f12;
            this.f50723b = f13;
            this.f50725d = f10;
            this.f50726e = f11;
        }

        public final float a() {
            return d.this.f50694a.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f50724c) * 1.0f) / d.this.f50695b));
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageViewW = d.this.W();
            if (imageViewW == null) {
                return;
            }
            float fA = a();
            float f10 = this.f50725d;
            d.this.A(C4541d.a(this.f50726e, f10, fA, f10) / d.this.c(), this.f50722a, this.f50723b);
            if (fA < 1.0f) {
                imageViewW.postOnAnimation(this);
            }
        }
    }

    /* JADX INFO: renamed from: Ha.d$d, reason: collision with other inner class name */
    public class RunnableC0046d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ja.d f50728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f50730c;

        public RunnableC0046d(Context context) {
            this.f50728a = new Ja.b(context);
        }

        public void a() {
            this.f50728a.c(true);
        }

        public void b(int i10, int i11, int i12, int i13) {
            int i14;
            int iRound;
            int i15;
            int iRound2;
            RectF rectFI = d.this.i();
            if (rectFI == null) {
                return;
            }
            int iRound3 = Math.round(-rectFI.left);
            float f10 = i10;
            if (f10 < rectFI.width()) {
                iRound = Math.round(rectFI.width() - f10);
                i14 = 0;
            } else {
                i14 = iRound3;
                iRound = i14;
            }
            int iRound4 = Math.round(-rectFI.top);
            float f11 = i11;
            if (f11 < rectFI.height()) {
                iRound2 = Math.round(rectFI.height() - f11);
                i15 = 0;
            } else {
                i15 = iRound4;
                iRound2 = i15;
            }
            this.f50729b = iRound3;
            this.f50730c = iRound4;
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f50728a.b(iRound3, iRound4, i12, i13, i14, iRound, i15, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageViewW;
            if (this.f50728a.g() || (imageViewW = d.this.W()) == null || !this.f50728a.a()) {
                return;
            }
            int iD = this.f50728a.d();
            int iE = this.f50728a.e();
            d.this.f50707n.postTranslate(this.f50729b - iD, this.f50730c - iE);
            d dVar = d.this;
            dVar.j0(dVar.U());
            this.f50729b = iD;
            this.f50730c = iE;
            imageViewW.postOnAnimation(this);
        }
    }

    public interface e {
        void a(RectF rectF);
    }

    public interface f {
        void a(View view, float f10, float f11);

        void b();
    }

    public interface g {
        void a(float f10, float f11, float f12);
    }

    public interface h {
        boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11);
    }

    public interface i {
        void a(View view, float f10, float f11);
    }

    public d(ImageView imageView) {
        this(imageView, true);
    }

    public static void R(float f10, float f11, float f12) {
        if (f10 >= f11) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f11 >= f12) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    public static boolean d0(ImageView imageView) {
        return (imageView == null || imageView.getDrawable() == null) ? false : true;
    }

    public static boolean e0(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (b.f50721a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
    }

    public static void k0(ImageView imageView) {
        if (imageView == null || (imageView instanceof Ha.c)) {
            return;
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
        if (scaleType.equals(imageView.getScaleType())) {
            return;
        }
        imageView.setScaleType(scaleType);
    }

    @Override // Ia.e
    public void A(float f10, float f11, float f12) {
        if (c() < this.f50698e || f10 < 1.0f) {
            if (c() > this.f50696c || f10 > 1.0f) {
                g gVar = this.f50714u;
                if (gVar != null) {
                    gVar.a(f10, f11, f12);
                }
                this.f50707n.postScale(f10, f10, f11, f12);
                O();
            }
        }
    }

    @Override // Ha.c
    public Bitmap B() {
        ImageView imageViewW = W();
        if (imageViewW == null) {
            return null;
        }
        return imageViewW.getDrawingCache();
    }

    @Override // Ha.c
    public boolean C(Matrix matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }
        ImageView imageViewW = W();
        if (imageViewW == null || imageViewW.getDrawable() == null) {
            return false;
        }
        this.f50707n.set(matrix);
        j0(U());
        Q();
        return true;
    }

    @Override // Ha.c
    public void D(h hVar) {
        this.f50715v = hVar;
    }

    @Override // Ha.c
    public void E(float f10, float f11, float f12) {
        R(f10, f11, f12);
        this.f50696c = f10;
        this.f50697d = f11;
        this.f50698e = f12;
    }

    @Override // Ha.c
    public float F() {
        return this.f50697d;
    }

    @Override // Ha.c
    public float G() {
        return this.f50696c;
    }

    public final void N() {
        RunnableC0046d runnableC0046d = this.f50689A;
        if (runnableC0046d != null) {
            runnableC0046d.a();
            this.f50689A = null;
        }
    }

    public final void O() {
        if (Q()) {
            j0(U());
        }
    }

    public final void P() {
        ImageView imageViewW = W();
        if (imageViewW != null && !(imageViewW instanceof Ha.c) && !ImageView.ScaleType.MATRIX.equals(imageViewW.getScaleType())) {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher. You should call setScaleType on the PhotoViewAttacher instead of on the ImageView");
        }
    }

    public final boolean Q() {
        RectF rectFT;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        ImageView imageViewW = W();
        if (imageViewW == null || (rectFT = T(U())) == null) {
            return false;
        }
        float fHeight = rectFT.height();
        float fWidth = rectFT.width();
        float fX = X(imageViewW);
        float f16 = 0.0f;
        if (fHeight <= fX) {
            int i10 = b.f50721a[this.f50693E.ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    fX = (fX - fHeight) / 2.0f;
                    f11 = rectFT.top;
                } else {
                    fX -= fHeight;
                    f11 = rectFT.top;
                }
            } else {
                f10 = rectFT.top;
                f12 = -f10;
            }
        } else {
            f10 = rectFT.top;
            if (f10 > 0.0f) {
                f12 = -f10;
            } else {
                f11 = rectFT.bottom;
                f12 = f11 < fX ? fX - f11 : 0.0f;
            }
        }
        float fY = Y(imageViewW);
        if (fWidth <= fY) {
            int i11 = b.f50721a[this.f50693E.ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    f14 = (fY - fWidth) / 2.0f;
                    f15 = rectFT.left;
                } else {
                    f14 = fY - fWidth;
                    f15 = rectFT.left;
                }
                f13 = f14 - f15;
            } else {
                f13 = -rectFT.left;
            }
            f16 = f13;
            this.f50690B = 2;
        } else {
            float f17 = rectFT.left;
            if (f17 > 0.0f) {
                this.f50690B = 0;
                f16 = -f17;
            } else {
                float f18 = rectFT.right;
                if (f18 < fY) {
                    f16 = fY - f18;
                    this.f50690B = 1;
                } else {
                    this.f50690B = -1;
                }
            }
        }
        this.f50707n.postTranslate(f16, f12);
        return true;
    }

    public void S() {
        WeakReference<ImageView> weakReference = this.f50702i;
        if (weakReference == null) {
            return;
        }
        ImageView imageView = weakReference.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            imageView.setOnTouchListener(null);
            N();
        }
        GestureDetector gestureDetector = this.f50703j;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        this.f50710q = null;
        this.f50711r = null;
        this.f50712s = null;
        this.f50702i = null;
    }

    public final RectF T(Matrix matrix) {
        Drawable drawable;
        ImageView imageViewW = W();
        if (imageViewW == null || (drawable = imageViewW.getDrawable()) == null) {
            return null;
        }
        this.f50708o.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.f50708o);
        return this.f50708o;
    }

    public final Matrix U() {
        this.f50706m.set(this.f50705l);
        this.f50706m.postConcat(this.f50707n);
        return this.f50706m;
    }

    public Matrix V() {
        return this.f50706m;
    }

    public ImageView W() {
        WeakReference<ImageView> weakReference = this.f50702i;
        ImageView imageView = weakReference != null ? weakReference.get() : null;
        if (imageView == null) {
            S();
        }
        return imageView;
    }

    public final int X(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    public final int Y(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    @Nullable
    public f Z() {
        return this.f50711r;
    }

    @Override // Ha.c
    public void a(Matrix matrix) {
        matrix.set(U());
    }

    @Nullable
    public i a0() {
        return this.f50712s;
    }

    @Override // Ha.c
    public void b(float f10, float f11, float f12, boolean z10) {
        ImageView imageViewW = W();
        if (imageViewW == null || f10 < this.f50696c || f10 > this.f50698e) {
            return;
        }
        if (z10) {
            imageViewW.post(new c(c(), f10, f11, f12));
        } else {
            this.f50707n.setScale(f10, f10, f11, f12);
            O();
        }
    }

    public void b0(Matrix matrix) {
        matrix.set(this.f50707n);
    }

    @Override // Ha.c
    public float c() {
        return (float) Math.sqrt(((float) Math.pow(c0(this.f50707n, 0), 2.0d)) + ((float) Math.pow(c0(this.f50707n, 3), 2.0d)));
    }

    public final float c0(Matrix matrix, int i10) {
        matrix.getValues(this.f50709p);
        return this.f50709p[i10];
    }

    @Override // Ha.c
    public void d(i iVar) {
        this.f50712s = iVar;
    }

    @Override // Ha.c
    public void e(float f10) {
        f(f10, false);
    }

    @Override // Ha.c
    public void f(float f10, boolean z10) {
        if (W() != null) {
            b(f10, r0.getRight() / 2, r0.getBottom() / 2, z10);
        }
    }

    public final void f0() {
        this.f50707n.reset();
        n(this.f50691C);
        j0(U());
        Q();
    }

    @Override // Ha.c
    public float g() {
        return this.f50698e;
    }

    public void g0(float f10) {
        i0(this.f50691C + f10);
    }

    @Override // Ha.c
    public void h(boolean z10) {
        this.f50699f = z10;
    }

    public void h0(boolean z10) {
        this.f50701h = z10;
        m0();
    }

    @Override // Ha.c
    public RectF i() {
        Q();
        return T(U());
    }

    public void i0(float f10) {
        this.f50691C = f10 % 360.0f;
        m0();
    }

    @Override // Ha.c
    public void j(View.OnLongClickListener onLongClickListener) {
        this.f50713t = onLongClickListener;
    }

    public final void j0(Matrix matrix) {
        RectF rectFT;
        ImageView imageViewW = W();
        if (imageViewW != null) {
            P();
            imageViewW.setImageMatrix(matrix);
            if (this.f50710q == null || (rectFT = T(matrix)) == null) {
                return;
            }
            this.f50710q.a(rectFT);
        }
    }

    @Override // Ha.c
    public void k(boolean z10) {
        this.f50692D = z10;
        m0();
    }

    @Override // Ia.e
    public void l(float f10, float f11, float f12, float f13) {
        ImageView imageViewW = W();
        RunnableC0046d runnableC0046d = new RunnableC0046d(imageViewW.getContext());
        this.f50689A = runnableC0046d;
        runnableC0046d.b(Y(imageViewW), X(imageViewW), (int) f12, (int) f13);
        imageViewW.post(this.f50689A);
    }

    public void l0(Interpolator interpolator) {
        this.f50694a = interpolator;
    }

    @Override // Ha.c
    public void m(float f10) {
        this.f50707n.setRotate(f10 % 360.0f);
        O();
    }

    public void m0() {
        ImageView imageViewW = W();
        if (imageViewW != null) {
            if (!this.f50692D) {
                f0();
            } else {
                k0(imageViewW);
                n0(imageViewW.getDrawable());
            }
        }
    }

    @Override // Ha.c
    public void n(float f10) {
        this.f50707n.postRotate(f10 % 360.0f);
        O();
    }

    public final void n0(Drawable drawable) {
        ImageView imageViewW = W();
        if (imageViewW == null || drawable == null) {
            return;
        }
        float fY = Y(imageViewW);
        float fX = X(imageViewW);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f50705l.reset();
        float f10 = intrinsicWidth;
        float f11 = fY / f10;
        float f12 = intrinsicHeight;
        float f13 = fX / f12;
        int i10 = (int) this.f50691C;
        if (this.f50701h && intrinsicWidth > intrinsicHeight) {
            i10 = 90;
        }
        ImageView.ScaleType scaleType = this.f50693E;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f50705l.postTranslate((fY - f10) / 2.0f, (fX - f12) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f11, f13);
            this.f50705l.postScale(fMax, fMax);
            this.f50705l.postTranslate(C2016d.a(f10, fMax, fY, 2.0f), C2016d.a(f12, fMax, fX, 2.0f));
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f11, f13));
            this.f50705l.postScale(fMin, fMin);
            this.f50705l.postTranslate(C2016d.a(f10, fMin, fY, 2.0f), C2016d.a(f12, fMin, fX, 2.0f));
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f10, f12);
            RectF rectF2 = new RectF(0.0f, 0.0f, fY, fX);
            if (i10 % Opcodes.GETFIELD != 0) {
                rectF = new RectF(0.0f, 0.0f, f12, f10);
            }
            int i11 = b.f50721a[this.f50693E.ordinal()];
            if (i11 == 2) {
                this.f50705l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i11 == 3) {
                this.f50705l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i11 == 4) {
                this.f50705l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i11 == 5) {
                this.f50705l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        this.f50707n.reset();
        n(i10);
        j0(U());
        Q();
    }

    @Override // Ha.c
    public void o(g gVar) {
        this.f50714u = gVar;
    }

    @Override // Ia.e
    public void onDrag(float f10, float f11) {
        if (this.f50704k.d()) {
            return;
        }
        ImageView imageViewW = W();
        this.f50707n.postTranslate(f10, f11);
        O();
        ViewParent parent = imageViewW.getParent();
        if (!this.f50699f || this.f50704k.d() || this.f50700g) {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        int i10 = this.f50690B;
        if ((i10 == 2 || ((i10 == 0 && f10 >= 1.0f) || (i10 == 1 && f10 <= -1.0f))) && parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ImageView imageViewW = W();
        if (imageViewW != null) {
            if (!this.f50692D) {
                n0(imageViewW.getDrawable());
                return;
            }
            int top = imageViewW.getTop();
            int right = imageViewW.getRight();
            int bottom = imageViewW.getBottom();
            int left = imageViewW.getLeft();
            if (top == this.f50716w && bottom == this.f50718y && left == this.f50719z && right == this.f50717x) {
                return;
            }
            n0(imageViewW.getDrawable());
            this.f50716w = top;
            this.f50717x = right;
            this.f50718y = bottom;
            this.f50719z = left;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ha.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // Ha.c
    public void p(float f10) {
        R(f10, this.f50697d, this.f50698e);
        this.f50696c = f10;
    }

    @Override // Ha.c
    public ImageView.ScaleType q() {
        return this.f50693E;
    }

    @Override // Ha.c
    public void r(int i10) {
        if (i10 < 0) {
            i10 = 200;
        }
        this.f50695b = i10;
    }

    @Override // Ha.c
    public boolean s() {
        return this.f50692D;
    }

    @Override // Ha.c
    public void t(float f10) {
        R(this.f50696c, f10, this.f50698e);
        this.f50697d = f10;
    }

    @Override // Ha.c
    public void u(float f10) {
        R(this.f50696c, this.f50697d, f10);
        this.f50698e = f10;
    }

    @Override // Ha.c
    public void v(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        if (onDoubleTapListener != null) {
            this.f50703j.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            this.f50703j.setOnDoubleTapListener(new Ha.b(this));
        }
    }

    @Override // Ha.c
    public void w(f fVar) {
        this.f50711r = fVar;
    }

    @Override // Ha.c
    public void x(ImageView.ScaleType scaleType) {
        if (!e0(scaleType) || scaleType == this.f50693E) {
            return;
        }
        this.f50693E = scaleType;
        m0();
    }

    @Override // Ha.c
    public void z(e eVar) {
        this.f50710q = eVar;
    }

    public d(ImageView imageView, boolean z10) {
        this.f50694a = new AccelerateDecelerateInterpolator();
        this.f50695b = 200;
        this.f50696c = 1.0f;
        this.f50697d = 1.75f;
        this.f50698e = 3.0f;
        this.f50699f = true;
        this.f50700g = false;
        this.f50701h = false;
        this.f50705l = new Matrix();
        this.f50706m = new Matrix();
        this.f50707n = new Matrix();
        this.f50708o = new RectF();
        this.f50709p = new float[9];
        this.f50690B = 2;
        this.f50693E = ImageView.ScaleType.FIT_CENTER;
        this.f50702i = new WeakReference<>(imageView);
        imageView.setDrawingCacheEnabled(true);
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        k0(imageView);
        if (imageView.isInEditMode()) {
            return;
        }
        this.f50704k = Ia.f.a(imageView.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new a());
        this.f50703j = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new Ha.b(this));
        this.f50691C = 0.0f;
        k(z10);
    }

    @Override // Ha.c
    public Ha.c y() {
        return this;
    }
}
