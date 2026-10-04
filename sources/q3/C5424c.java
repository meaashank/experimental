package q3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.vectordrawable.graphics.drawable.b;
import e.f0;
import f3.InterfaceC4386a;
import g3.InterfaceC4450h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import q3.C5428g;
import y3.m;

/* JADX INFO: renamed from: q3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5424c extends Drawable implements C5428g.b, Animatable, androidx.vectordrawable.graphics.drawable.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f226753l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f226754m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f226755n = 119;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f226756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f226757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f226758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f226759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f226760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f226761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f226762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f226763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Paint f226764i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Rect f226765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<b.a> f226766k;

    /* JADX INFO: renamed from: q3.c$a */
    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @f0
        public final C5428g f226767a;

        public a(C5428g c5428g) {
            this.f226767a = c5428g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new C5424c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new C5424c(this);
        }
    }

    @Deprecated
    public C5424c(Context context, InterfaceC4386a interfaceC4386a, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, InterfaceC4450h<Bitmap> interfaceC4450h, int i10, int i11, Bitmap bitmap) {
        this(context, interfaceC4386a, interfaceC4450h, i10, i11, bitmap);
    }

    @Override // q3.C5428g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f226761f++;
        }
        int i10 = this.f226762g;
        if (i10 == -1 || this.f226761f < i10) {
            return;
        }
        l();
        stop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    public ByteBuffer c() {
        return this.f226756a.f226767a.b();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void clearAnimationCallbacks() {
        List<b.a> list = this.f226766k;
        if (list != null) {
            list.clear();
        }
    }

    public final Rect d() {
        if (this.f226765j == null) {
            this.f226765j = new Rect();
        }
        return this.f226765j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f226759d) {
            return;
        }
        if (this.f226763h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f226763h = false;
        }
        canvas.drawBitmap(this.f226756a.f226767a.c(), (Rect) null, d(), i());
    }

    public Bitmap e() {
        return this.f226756a.f226767a.e();
    }

    public int f() {
        return this.f226756a.f226767a.f();
    }

    public int g() {
        return this.f226756a.f226767a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f226756a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f226756a.f226767a.i();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f226756a.f226767a.m();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public InterfaceC4450h<Bitmap> h() {
        return this.f226756a.f226767a.h();
    }

    public final Paint i() {
        if (this.f226764i == null) {
            this.f226764i = new Paint(2);
        }
        return this.f226764i;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f226757b;
    }

    public int j() {
        return this.f226756a.f226767a.l();
    }

    public boolean k() {
        return this.f226759d;
    }

    public final void l() {
        List<b.a> list = this.f226766k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f226766k.get(i10).onAnimationEnd(this);
            }
        }
    }

    public void m() {
        this.f226759d = true;
        this.f226756a.f226767a.a();
    }

    public final void n() {
        this.f226761f = 0;
    }

    public void o(InterfaceC4450h<Bitmap> interfaceC4450h, Bitmap bitmap) {
        this.f226756a.f226767a.q(interfaceC4450h, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f226763h = true;
    }

    public void p(boolean z10) {
        this.f226757b = z10;
    }

    public void q(int i10) {
        if (i10 <= 0 && i10 != -1 && i10 != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i10 != 0) {
            this.f226762g = i10;
        } else {
            int iJ = this.f226756a.f226767a.j();
            this.f226762g = iJ != 0 ? iJ : -1;
        }
    }

    public void r() {
        m.b(!this.f226757b, "You cannot restart a currently running animation.");
        this.f226756a.f226767a.r();
        start();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void registerAnimationCallback(@NonNull b.a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f226766k == null) {
            this.f226766k = new ArrayList();
        }
        this.f226766k.add(aVar);
    }

    public final void s() {
        m.b(!this.f226759d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f226756a.f226767a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f226757b) {
                return;
            }
            this.f226757b = true;
            this.f226756a.f226767a.v(this);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        i().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        i().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        m.b(!this.f226759d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f226760e = z10;
        if (!z10) {
            t();
        } else if (this.f226758c) {
            s();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f226758c = true;
        this.f226761f = 0;
        if (this.f226760e) {
            s();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f226758c = false;
        t();
    }

    public final void t() {
        this.f226757b = false;
        this.f226756a.f226767a.w(this);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public boolean unregisterAnimationCallback(@NonNull b.a aVar) {
        List<b.a> list = this.f226766k;
        if (list == null || aVar == null) {
            return false;
        }
        return list.remove(aVar);
    }

    public C5424c(Context context, InterfaceC4386a interfaceC4386a, InterfaceC4450h<Bitmap> interfaceC4450h, int i10, int i11, Bitmap bitmap) {
        this(new a(new C5428g(com.bumptech.glide.c.e(context), interfaceC4386a, i10, i11, interfaceC4450h, bitmap)));
    }

    public C5424c(a aVar) {
        this.f226760e = true;
        this.f226762g = -1;
        m.f(aVar, "Argument must not be null");
        this.f226756a = aVar;
    }

    @f0
    public C5424c(C5428g c5428g, Paint paint) {
        this(new a(c5428g));
        this.f226764i = paint;
    }
}
