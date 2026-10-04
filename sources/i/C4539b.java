package i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.InterfaceC4337k;
import e.T;

/* JADX INFO: renamed from: i.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4539b extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final boolean f202694m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f202695n = "DrawableContainerCompat";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final boolean f202696o = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f202697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f202698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f202699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f202700d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f202702f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f202704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Runnable f202705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f202706j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f202707k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f202708l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f202701e = 255;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f202703g = -1;

    /* JADX INFO: renamed from: i.b$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4539b.this.a(true);
            C4539b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: i.b$b, reason: collision with other inner class name */
    @T(21)
    public static class C0746b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: renamed from: i.b$d */
    public static abstract class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f202711A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f202712B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public boolean f202713C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public ColorFilter f202714D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public boolean f202715E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public ColorStateList f202716F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public PorterDuff.Mode f202717G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public boolean f202718H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public boolean f202719I;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C4539b f202720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Resources f202721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f202722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f202723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f202724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f202725f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Drawable[] f202726g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f202727h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f202728i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f202729j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Rect f202730k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f202731l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f202732m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f202733n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f202734o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f202735p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f202736q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f202737r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f202738s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f202739t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f202740u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f202741v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f202742w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f202743x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f202744y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f202745z;

        public d(d dVar, C4539b c4539b, Resources resources) {
            this.f202728i = false;
            this.f202731l = false;
            this.f202743x = true;
            this.f202711A = 0;
            this.f202712B = 0;
            this.f202720a = c4539b;
            this.f202721b = resources != null ? resources : dVar != null ? dVar.f202721b : null;
            int iG = C4539b.g(resources, dVar != null ? dVar.f202722c : 0);
            this.f202722c = iG;
            if (dVar == null) {
                this.f202726g = new Drawable[10];
                this.f202727h = 0;
                return;
            }
            this.f202723d = dVar.f202723d;
            this.f202724e = dVar.f202724e;
            this.f202741v = true;
            this.f202742w = true;
            this.f202728i = dVar.f202728i;
            this.f202731l = dVar.f202731l;
            this.f202743x = dVar.f202743x;
            this.f202744y = dVar.f202744y;
            this.f202745z = dVar.f202745z;
            this.f202711A = dVar.f202711A;
            this.f202712B = dVar.f202712B;
            this.f202713C = dVar.f202713C;
            this.f202714D = dVar.f202714D;
            this.f202715E = dVar.f202715E;
            this.f202716F = dVar.f202716F;
            this.f202717G = dVar.f202717G;
            this.f202718H = dVar.f202718H;
            this.f202719I = dVar.f202719I;
            if (dVar.f202722c == iG) {
                if (dVar.f202729j) {
                    this.f202730k = dVar.f202730k != null ? new Rect(dVar.f202730k) : null;
                    this.f202729j = true;
                }
                if (dVar.f202732m) {
                    this.f202733n = dVar.f202733n;
                    this.f202734o = dVar.f202734o;
                    this.f202735p = dVar.f202735p;
                    this.f202736q = dVar.f202736q;
                    this.f202732m = true;
                }
            }
            if (dVar.f202737r) {
                this.f202738s = dVar.f202738s;
                this.f202737r = true;
            }
            if (dVar.f202739t) {
                this.f202740u = dVar.f202740u;
                this.f202739t = true;
            }
            Drawable[] drawableArr = dVar.f202726g;
            this.f202726g = new Drawable[drawableArr.length];
            this.f202727h = dVar.f202727h;
            SparseArray<Drawable.ConstantState> sparseArray = dVar.f202725f;
            if (sparseArray != null) {
                this.f202725f = sparseArray.clone();
            } else {
                this.f202725f = new SparseArray<>(this.f202727h);
            }
            int i10 = this.f202727h;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f202725f.put(i11, constantState);
                    } else {
                        this.f202726g[i11] = drawableArr[i11];
                    }
                }
            }
        }

        public final boolean A(int i10, int i11) {
            int i12 = this.f202727h;
            Drawable[] drawableArr = this.f202726g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    boolean layoutDirection = drawable.setLayoutDirection(i10);
                    if (i13 == i11) {
                        z10 = layoutDirection;
                    }
                }
            }
            this.f202745z = i10;
            return z10;
        }

        public final void B(boolean z10) {
            this.f202728i = z10;
        }

        public final void C(Resources resources) {
            if (resources != null) {
                this.f202721b = resources;
                int iG = C4539b.g(resources, this.f202722c);
                int i10 = this.f202722c;
                this.f202722c = iG;
                if (i10 != iG) {
                    this.f202732m = false;
                    this.f202729j = false;
                }
            }
        }

        public final int a(Drawable drawable) {
            int i10 = this.f202727h;
            if (i10 >= this.f202726g.length) {
                r(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f202720a);
            this.f202726g[i10] = drawable;
            this.f202727h++;
            this.f202724e = drawable.getChangingConfigurations() | this.f202724e;
            s();
            this.f202730k = null;
            this.f202729j = false;
            this.f202732m = false;
            this.f202741v = false;
            return i10;
        }

        @T(21)
        public final void b(Resources.Theme theme) {
            if (theme != null) {
                f();
                int i10 = this.f202727h;
                Drawable[] drawableArr = this.f202726g;
                for (int i11 = 0; i11 < i10; i11++) {
                    Drawable drawable = drawableArr[i11];
                    if (drawable != null && drawable.canApplyTheme()) {
                        drawableArr[i11].applyTheme(theme);
                        this.f202724e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                C(theme.getResources());
            }
        }

        public boolean c() {
            if (this.f202741v) {
                return this.f202742w;
            }
            f();
            this.f202741v = true;
            int i10 = this.f202727h;
            Drawable[] drawableArr = this.f202726g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f202742w = false;
                    return false;
                }
            }
            this.f202742w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @T(21)
        public boolean canApplyTheme() {
            int i10 = this.f202727h;
            Drawable[] drawableArr = this.f202726g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f202725f.get(i11);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public final void d() {
            this.f202744y = false;
        }

        public void e() {
            this.f202732m = true;
            f();
            int i10 = this.f202727h;
            Drawable[] drawableArr = this.f202726g;
            this.f202734o = -1;
            this.f202733n = -1;
            this.f202736q = 0;
            this.f202735p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f202733n) {
                    this.f202733n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f202734o) {
                    this.f202734o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f202735p) {
                    this.f202735p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f202736q) {
                    this.f202736q = minimumHeight;
                }
            }
        }

        public final void f() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f202725f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f202726g[this.f202725f.keyAt(i10)] = w(this.f202725f.valueAt(i10).newDrawable(this.f202721b));
                }
                this.f202725f = null;
            }
        }

        public final int g() {
            return this.f202726g.length;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f202723d | this.f202724e;
        }

        public final Drawable h(int i10) {
            int iIndexOfKey;
            Drawable drawable = this.f202726g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f202725f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable drawableW = w(this.f202725f.valueAt(iIndexOfKey).newDrawable(this.f202721b));
            this.f202726g[i10] = drawableW;
            this.f202725f.removeAt(iIndexOfKey);
            if (this.f202725f.size() == 0) {
                this.f202725f = null;
            }
            return drawableW;
        }

        public final int i() {
            return this.f202727h;
        }

        public final int j() {
            if (!this.f202732m) {
                e();
            }
            return this.f202734o;
        }

        public final int k() {
            if (!this.f202732m) {
                e();
            }
            return this.f202736q;
        }

        public final int l() {
            if (!this.f202732m) {
                e();
            }
            return this.f202735p;
        }

        public final Rect m() {
            Rect rect = null;
            if (this.f202728i) {
                return null;
            }
            Rect rect2 = this.f202730k;
            if (rect2 != null || this.f202729j) {
                return rect2;
            }
            f();
            Rect rect3 = new Rect();
            int i10 = this.f202727h;
            Drawable[] drawableArr = this.f202726g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f202729j = true;
            this.f202730k = rect;
            return rect;
        }

        public final int n() {
            if (!this.f202732m) {
                e();
            }
            return this.f202733n;
        }

        public final int o() {
            return this.f202711A;
        }

        public final int p() {
            return this.f202712B;
        }

        public final int q() {
            if (this.f202737r) {
                return this.f202738s;
            }
            f();
            int i10 = this.f202727h;
            Drawable[] drawableArr = this.f202726g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f202738s = opacity;
            this.f202737r = true;
            return opacity;
        }

        public void r(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f202726g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f202726g = drawableArr;
        }

        public void s() {
            this.f202737r = false;
            this.f202739t = false;
        }

        public final boolean t() {
            return this.f202731l;
        }

        public final boolean u() {
            if (this.f202739t) {
                return this.f202740u;
            }
            f();
            int i10 = this.f202727h;
            Drawable[] drawableArr = this.f202726g;
            boolean z10 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    break;
                }
                if (drawableArr[i11].isStateful()) {
                    z10 = true;
                    break;
                }
                i11++;
            }
            this.f202740u = z10;
            this.f202739t = true;
            return z10;
        }

        public void v() {
            int i10 = this.f202727h;
            Drawable[] drawableArr = this.f202726g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.f202744y = true;
        }

        public final Drawable w(Drawable drawable) {
            drawable.setLayoutDirection(this.f202745z);
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f202720a);
            return drawableMutate;
        }

        public final void x(boolean z10) {
            this.f202731l = z10;
        }

        public final void y(int i10) {
            this.f202711A = i10;
        }

        public final void z(int i10) {
            this.f202712B = i10;
        }
    }

    public static int g(@Nullable Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f202702f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f202699c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f202706j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f202701e
            r3.setAlpha(r9)
            r13.f202706j = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            i.b$d r10 = r13.f202697a
            int r10 = r10.f202711A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f202701e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f202706j = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f202700d
            if (r9 == 0) goto L61
            long r10 = r13.f202707k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f202700d = r0
            r13.f202707k = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            i.b$d r4 = r13.f202697a
            int r4 = r4.f202712B
            int r3 = r3 / r4
            int r4 = r13.f202701e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f202707k = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f202705i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C4539b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    @T(21)
    public void applyTheme(@NonNull Resources.Theme theme) {
        this.f202697a.b(theme);
    }

    public void b() {
        this.f202697a.f202744y = false;
        this.f202704h = false;
    }

    public d c() {
        return this.f202697a;
    }

    @Override // android.graphics.drawable.Drawable
    @T(21)
    public boolean canApplyTheme() {
        return this.f202697a.canApplyTheme();
    }

    public int d() {
        return this.f202703g;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable = this.f202699c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f202700d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e(Drawable drawable) {
        if (this.f202708l == null) {
            this.f202708l = new c();
        }
        drawable.setCallback(this.f202708l.b(drawable.getCallback()));
        try {
            if (this.f202697a.f202711A <= 0 && this.f202702f) {
                drawable.setAlpha(this.f202701e);
            }
            d dVar = this.f202697a;
            if (dVar.f202715E) {
                drawable.setColorFilter(dVar.f202714D);
            } else {
                if (dVar.f202718H) {
                    drawable.setTintList(dVar.f202716F);
                }
                d dVar2 = this.f202697a;
                if (dVar2.f202719I) {
                    drawable.setTintMode(dVar2.f202717G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f202697a.f202743x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f202697a.f202713C);
            Rect rect = this.f202698b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f202708l.a());
        } catch (Throwable th) {
            drawable.setCallback(this.f202708l.a());
            throw th;
        }
    }

    public final boolean f() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f202701e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f202697a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f202697a.c()) {
            return null;
        }
        this.f202697a.f202723d = getChangingConfigurations();
        return this.f202697a;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.f202699c;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@NonNull Rect rect) {
        Rect rect2 = this.f202698b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        d dVar = this.f202697a;
        if (dVar.f202731l) {
            return dVar.j();
        }
        Drawable drawable = this.f202699c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        d dVar = this.f202697a;
        if (dVar.f202731l) {
            return dVar.n();
        }
        Drawable drawable = this.f202699c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        d dVar = this.f202697a;
        if (dVar.f202731l) {
            return dVar.k();
        }
        Drawable drawable = this.f202699c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        d dVar = this.f202697a;
        if (dVar.f202731l) {
            return dVar.l();
        }
        Drawable drawable = this.f202699c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f202699c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f202697a.q();
    }

    @Override // android.graphics.drawable.Drawable
    @T(21)
    public void getOutline(@NonNull Outline outline) {
        Drawable drawable = this.f202699c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        boolean padding;
        Rect rectM = this.f202697a.m();
        if (rectM != null) {
            rect.set(rectM);
            padding = (rectM.right | ((rectM.left | rectM.top) | rectM.bottom)) != 0;
        } else {
            Drawable drawable = this.f202699c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (f()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.f202703g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            i.b$d r0 = r9.f202697a
            int r0 = r0.f202712B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f202700d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f202699c
            if (r0 == 0) goto L29
            r9.f202700d = r0
            i.b$d r0 = r9.f202697a
            int r0 = r0.f202712B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f202707k = r0
            goto L35
        L29:
            r9.f202700d = r4
            r9.f202707k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f202699c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            i.b$d r0 = r9.f202697a
            int r1 = r0.f202727h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.h(r10)
            r9.f202699c = r0
            r9.f202703g = r10
            if (r0 == 0) goto L5a
            i.b$d r10 = r9.f202697a
            int r10 = r10.f202711A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f202706j = r2
        L51:
            r9.e(r0)
            goto L5a
        L55:
            r9.f202699c = r4
            r10 = -1
            r9.f202703g = r10
        L5a:
            long r0 = r9.f202706j
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f202707k
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f202705i
            if (r10 != 0) goto L73
            i.b$a r10 = new i.b$a
            r10.<init>()
            r9.f202705i = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C4539b.h(int):boolean");
    }

    public void i(d dVar) {
        this.f202697a = dVar;
        int i10 = this.f202703g;
        if (i10 >= 0) {
            Drawable drawableH = dVar.h(i10);
            this.f202699c = drawableH;
            if (drawableH != null) {
                e(drawableH);
            }
        }
        this.f202700d = null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        d dVar = this.f202697a;
        if (dVar != null) {
            dVar.s();
        }
        if (drawable != this.f202699c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f202697a.f202713C;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f202697a.u();
    }

    public void j(int i10) {
        h(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f202700d;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f202700d = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f202699c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f202702f) {
                this.f202699c.setAlpha(this.f202701e);
            }
        }
        if (this.f202707k != 0) {
            this.f202707k = 0L;
            z10 = true;
        }
        if (this.f202706j != 0) {
            this.f202706j = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public void k(int i10) {
        this.f202697a.f202711A = i10;
    }

    public void l(int i10) {
        this.f202697a.f202712B = i10;
    }

    public final void m(Resources resources) {
        this.f202697a.C(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f202704h && super.mutate() == this) {
            d dVarC = c();
            dVarC.v();
            i(dVarC);
            this.f202704h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f202700d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f202699c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f202697a.A(i10, d());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f202700d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f202699c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        Drawable drawable = this.f202700d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f202699c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
        if (drawable != this.f202699c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f202702f && this.f202701e == i10) {
            return;
        }
        this.f202702f = true;
        this.f202701e = i10;
        Drawable drawable = this.f202699c;
        if (drawable != null) {
            if (this.f202706j == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        d dVar = this.f202697a;
        if (dVar.f202713C != z10) {
            dVar.f202713C = z10;
            Drawable drawable = this.f202699c;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f202697a;
        dVar.f202715E = true;
        if (dVar.f202714D != colorFilter) {
            dVar.f202714D = colorFilter;
            Drawable drawable = this.f202699c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        d dVar = this.f202697a;
        if (dVar.f202743x != z10) {
            dVar.f202743x = z10;
            Drawable drawable = this.f202699c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f202699c;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f202698b;
        if (rect == null) {
            this.f202698b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f202699c;
        if (drawable != null) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@InterfaceC4337k int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f202697a;
        dVar.f202718H = true;
        if (dVar.f202716F != colorStateList) {
            dVar.f202716F = colorStateList;
            H0.d.o(this.f202699c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        d dVar = this.f202697a;
        dVar.f202719I = true;
        if (dVar.f202717G != mode) {
            dVar.f202717G = mode;
            H0.d.p(this.f202699c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f202700d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f202699c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        if (drawable != this.f202699c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    /* JADX INFO: renamed from: i.b$c */
    public static class c implements Drawable.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable.Callback f202710a;

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f202710a;
            this.f202710a = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f202710a = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
            Drawable.Callback callback = this.f202710a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            Drawable.Callback callback = this.f202710a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
        }
    }
}
