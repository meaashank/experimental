package j5;

import C4.q;
import android.R;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.Nullable;
import androidx.compose.animation.X;
import androidx.compose.runtime.C1979x1;
import j5.C4786b;
import org.objectweb.asm.Opcodes;
import q8.C5443b;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public class g extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public CharSequence f214094A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public StaticLayout f214095B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f214096C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f214097D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f214098E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f214099F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f214100G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f214101H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public SpannableStringBuilder f214102I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public DynamicLayout f214103J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public TextPaint f214104K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public Paint f214105L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Rect f214106M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Rect f214107N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Path f214108O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f214109P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f214110Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int[] f214111R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f214112S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f214113T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f214114U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f214115V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f214116W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f214117a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f214118a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f214119b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f214120b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f214121c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f214122c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f214123d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f214124d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f214125e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f214126e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f214127f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f214128f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f214129g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Bitmap f214130g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f214131h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public m f214132h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f214133i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @Nullable
    public ViewOutlineProvider f214134i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f214135j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final C4786b.d f214136j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f214137k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final ValueAnimator f214138k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f214139l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final ValueAnimator f214140l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f214141m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final ValueAnimator f214142m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f214143n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final ValueAnimator f214144n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final ViewGroup f214145o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ValueAnimator[] f214146o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ViewManager f214147p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f214148p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j5.e f214149q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f214150r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextPaint f214151s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextPaint f214152t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Paint f214153u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Paint f214154v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Paint f214155w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Paint f214156x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f214157y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public StaticLayout f214158z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g gVar = g.this;
            if (gVar.f214132h0 == null || gVar.f214111R == null || !gVar.f214121c) {
                return;
            }
            int iCenterX = gVar.f214150r.centerX();
            int iCenterY = g.this.f214150r.centerY();
            g gVar2 = g.this;
            double dK = gVar.k(iCenterX, iCenterY, (int) gVar2.f214122c0, (int) gVar2.f214124d0);
            g gVar3 = g.this;
            boolean z10 = dK <= ((double) gVar3.f214115V);
            int[] iArr = gVar3.f214111R;
            double dK2 = gVar3.k(iArr[0], iArr[1], (int) gVar3.f214122c0, (int) gVar3.f214124d0);
            g gVar4 = g.this;
            boolean z11 = dK2 <= ((double) gVar4.f214109P);
            if (z10) {
                gVar4.f214121c = false;
                gVar4.f214132h0.c(gVar4);
            } else if (z11) {
                gVar4.f214132h0.a(gVar4);
            } else if (gVar4.f214100G) {
                gVar4.f214121c = false;
                gVar4.f214132h0.b(gVar4);
            }
        }
    }

    public class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            g gVar = g.this;
            if (gVar.f214132h0 == null || !gVar.f214150r.contains((int) gVar.f214122c0, (int) gVar.f214124d0)) {
                return false;
            }
            g gVar2 = g.this;
            gVar2.f214132h0.e(gVar2);
            return true;
        }
    }

    public class c extends ViewOutlineProvider {
        public c() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            g gVar = g.this;
            int[] iArr = gVar.f214111R;
            if (iArr == null) {
                return;
            }
            int i10 = iArr[0];
            float f10 = gVar.f214109P;
            int i11 = iArr[1];
            outline.setOval((int) (i10 - f10), (int) (i11 - f10), (int) (i10 + f10), (int) (i11 + f10));
            outline.setAlpha(g.this.f214112S / 255.0f);
            outline.offset(0, g.this.f214141m);
        }
    }

    public class d implements C4786b.d {
        public d() {
        }

        @Override // j5.C4786b.d
        public void a(float f10) {
            g gVar = g.this;
            float f11 = gVar.f214110Q * f10;
            boolean z10 = f11 > gVar.f214109P;
            if (!z10) {
                gVar.h();
            }
            g gVar2 = g.this;
            float f12 = gVar2.f214149q.f214060c * 255.0f;
            gVar2.f214109P = f11;
            float f13 = 1.5f * f10;
            gVar2.f214112S = (int) Math.min(f12, f13 * f12);
            g.this.f214108O.reset();
            g gVar3 = g.this;
            Path path = gVar3.f214108O;
            int[] iArr = gVar3.f214111R;
            path.addCircle(iArr[0], iArr[1], gVar3.f214109P, Path.Direction.CW);
            g.this.f214116W = (int) Math.min(255.0f, f13 * 255.0f);
            if (z10) {
                g.this.f214115V = Math.min(1.0f, f13) * r0.f214125e;
            } else {
                g gVar4 = g.this;
                gVar4.f214115V = gVar4.f214125e * f10;
                gVar4.f214113T *= f10;
            }
            g gVar5 = g.this;
            gVar5.f214118a0 = (int) (gVar5.i(f10, 0.7f) * 255.0f);
            if (z10) {
                g.this.h();
            }
            g gVar6 = g.this;
            gVar6.w(gVar6.f214106M);
        }
    }

    public class e implements C4786b.c {
        public e() {
        }

        @Override // j5.C4786b.c
        public void a() {
            g.this.f214140l0.start();
            g.this.f214121c = true;
        }
    }

    public class f implements C4786b.d {
        public f() {
        }

        @Override // j5.C4786b.d
        public void a(float f10) {
            g.this.f214136j0.a(f10);
        }
    }

    /* JADX INFO: renamed from: j5.g$g, reason: collision with other inner class name */
    public class C0808g implements C4786b.d {
        public C0808g() {
        }

        @Override // j5.C4786b.d
        public void a(float f10) {
            float fI = g.this.i(f10, 0.5f);
            g gVar = g.this;
            float f11 = gVar.f214125e;
            gVar.f214113T = (fI + 1.0f) * f11;
            gVar.f214114U = (int) ((1.0f - fI) * 255.0f);
            float fU = gVar.u(f10);
            g gVar2 = g.this;
            gVar.f214115V = (fU * gVar2.f214127f) + f11;
            float f12 = gVar2.f214109P;
            float f13 = gVar2.f214110Q;
            if (f12 != f13) {
                gVar2.f214109P = f13;
            }
            gVar2.h();
            g gVar3 = g.this;
            gVar3.w(gVar3.f214106M);
        }
    }

    public class h implements C4786b.c {
        public h() {
        }

        @Override // j5.C4786b.c
        public void a() {
            g.this.o(true);
        }
    }

    public class i implements C4786b.d {
        public i() {
        }

        @Override // j5.C4786b.d
        public void a(float f10) {
            g.this.f214136j0.a(f10);
        }
    }

    public class j implements C4786b.c {
        public j() {
        }

        @Override // j5.C4786b.c
        public void a() {
            g.this.o(true);
        }
    }

    public class k implements C4786b.d {
        public k() {
        }

        @Override // j5.C4786b.d
        public void a(float f10) {
            float fMin = Math.min(1.0f, 2.0f * f10);
            g gVar = g.this;
            gVar.f214109P = X.a(fMin, 0.2f, 1.0f, gVar.f214110Q);
            float f11 = 1.0f - fMin;
            gVar.f214112S = (int) (gVar.f214149q.f214060c * f11 * 255.0f);
            gVar.f214108O.reset();
            g gVar2 = g.this;
            Path path = gVar2.f214108O;
            int[] iArr = gVar2.f214111R;
            path.addCircle(iArr[0], iArr[1], gVar2.f214109P, Path.Direction.CW);
            g gVar3 = g.this;
            float f12 = 1.0f - f10;
            int i10 = gVar3.f214125e;
            gVar3.f214115V = i10 * f12;
            gVar3.f214116W = (int) (f12 * 255.0f);
            gVar3.f214113T = (f10 + 1.0f) * i10;
            gVar3.f214114U = (int) (f12 * gVar3.f214114U);
            gVar3.f214118a0 = (int) (f11 * 255.0f);
            gVar3.h();
            g gVar4 = g.this;
            gVar4.w(gVar4.f214106M);
        }
    }

    public class l implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j5.e f214170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f214171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f214172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f214173d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f214174e;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                int[] iArr = new int[2];
                l lVar = l.this;
                g.this.f214150r.set(lVar.f214170a.a());
                g.this.getLocationOnScreen(iArr);
                g.this.f214150r.offset(-iArr[0], -iArr[1]);
                l lVar2 = l.this;
                if (lVar2.f214171b != null) {
                    WindowManager windowManager = (WindowManager) lVar2.f214172c.getSystemService(C5443b.f226850e);
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    Rect rect = new Rect();
                    l.this.f214171b.getWindowVisibleDisplayFrame(rect);
                    int[] iArr2 = new int[2];
                    l.this.f214171b.getLocationInWindow(iArr2);
                    l lVar3 = l.this;
                    if (lVar3.f214173d) {
                        rect.top = iArr2[1];
                    }
                    if (lVar3.f214174e) {
                        rect.bottom = lVar3.f214171b.getHeight() + iArr2[1];
                    }
                    g.this.f214126e0 = Math.max(0, rect.top);
                    g.this.f214128f0 = Math.min(rect.bottom, displayMetrics.heightPixels);
                }
                g.this.n();
                g.this.requestFocus();
                g.this.g();
                g.this.F();
            }
        }

        public l(j5.e eVar, ViewGroup viewGroup, Context context, boolean z10, boolean z11) {
            this.f214170a = eVar;
            this.f214171b = viewGroup;
            this.f214172c = context;
            this.f214173d = z10;
            this.f214174e = z11;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (g.this.f214119b) {
                return;
            }
            g.this.G();
            this.f214170a.K(new a());
        }
    }

    public g(Context context, ViewManager viewManager, @Nullable ViewGroup viewGroup, j5.e eVar, @Nullable m mVar) {
        boolean z10;
        boolean z11;
        super(context);
        this.f214117a = false;
        this.f214119b = false;
        this.f214121c = true;
        this.f214136j0 = new d();
        C4786b c4786b = new C4786b(false);
        c4786b.f212568a.setDuration(250L);
        c4786b.f212568a.setStartDelay(250L);
        c4786b.f212568a.setInterpolator(new AccelerateDecelerateInterpolator());
        c4786b.f(new f());
        c4786b.f212569b = new e();
        ValueAnimator valueAnimatorA = c4786b.a();
        this.f214138k0 = valueAnimatorA;
        C4786b c4786b2 = new C4786b(false);
        c4786b2.f212568a.setDuration(1000L);
        c4786b2.f212568a.setRepeatCount(-1);
        c4786b2.f212568a.setInterpolator(new AccelerateDecelerateInterpolator());
        c4786b2.f(new C0808g());
        ValueAnimator valueAnimatorA2 = c4786b2.a();
        this.f214140l0 = valueAnimatorA2;
        C4786b c4786b3 = new C4786b(true);
        c4786b3.f212568a.setDuration(250L);
        c4786b3.f212568a.setInterpolator(new AccelerateDecelerateInterpolator());
        c4786b3.f(new i());
        c4786b3.f212569b = new h();
        ValueAnimator valueAnimatorA3 = c4786b3.a();
        this.f214142m0 = valueAnimatorA3;
        C4786b c4786b4 = new C4786b(false);
        c4786b4.f212568a.setDuration(250L);
        c4786b4.f212568a.setInterpolator(new AccelerateDecelerateInterpolator());
        c4786b4.f(new k());
        c4786b4.f212569b = new j();
        ValueAnimator valueAnimatorA4 = c4786b4.a();
        this.f214144n0 = valueAnimatorA4;
        this.f214146o0 = new ValueAnimator[]{valueAnimatorA, valueAnimatorA2, valueAnimatorA4, valueAnimatorA3};
        if (eVar == null) {
            throw new IllegalArgumentException("Target cannot be null");
        }
        this.f214149q = eVar;
        this.f214147p = viewManager;
        this.f214145o = viewGroup;
        this.f214132h0 = mVar == null ? new m() : mVar;
        this.f214157y = eVar.f214058a;
        this.f214094A = eVar.f214059b;
        this.f214123d = j5.i.a(context, 20);
        this.f214137k = j5.i.a(context, 40);
        int iA = j5.i.a(context, eVar.f214061d);
        this.f214125e = iA;
        this.f214129g = j5.i.a(context, 40);
        this.f214131h = j5.i.a(context, 8);
        this.f214133i = j5.i.a(context, 360);
        this.f214135j = j5.i.a(context, 20);
        this.f214139l = j5.i.a(context, 88);
        this.f214141m = j5.i.a(context, 8);
        int iA2 = j5.i.a(context, 1);
        this.f214143n = iA2;
        this.f214127f = (int) (iA * 0.1f);
        this.f214108O = new Path();
        this.f214150r = new Rect();
        this.f214106M = new Rect();
        TextPaint textPaint = new TextPaint();
        this.f214151s = textPaint;
        textPaint.setTextSize(eVar.c0(context));
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        textPaint.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f214152t = textPaint2;
        textPaint2.setTextSize(eVar.j(context));
        textPaint2.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
        textPaint2.setAntiAlias(true);
        textPaint2.setAlpha(Opcodes.L2F);
        Paint paint = new Paint();
        this.f214153u = paint;
        paint.setAntiAlias(true);
        paint.setAlpha((int) (eVar.f214060c * 255.0f));
        Paint paint2 = new Paint();
        this.f214154v = paint2;
        paint2.setAntiAlias(true);
        paint2.setAlpha(50);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(iA2);
        paint2.setColor(-16777216);
        Paint paint3 = new Paint();
        this.f214155w = paint3;
        paint3.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.f214156x = paint4;
        paint4.setAntiAlias(true);
        f(context);
        if (context instanceof Activity) {
            int i10 = ((Activity) context).getWindow().getAttributes().flags;
            z10 = (67108864 & i10) != 0;
            z11 = (i10 & C1979x1.f100279m) != 0;
        } else {
            z10 = false;
            z11 = false;
        }
        l lVar = new l(eVar, viewGroup, context, z10, z11);
        this.f214148p0 = lVar;
        getViewTreeObserver().addOnGlobalLayoutListener(lVar);
        setFocusableInTouchMode(true);
        setClickable(true);
        setOnClickListener(new a());
        setOnLongClickListener(new b());
    }

    public static g B(Activity activity, j5.e eVar) {
        return C(activity, eVar, null);
    }

    public static g C(Activity activity, j5.e eVar, m mVar) {
        if (activity == null) {
            throw new IllegalArgumentException("Activity is null");
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        g gVar = new g(activity, viewGroup, (ViewGroup) viewGroup.findViewById(R.id.content), eVar, mVar);
        viewGroup.addView(gVar, layoutParams);
        return gVar;
    }

    public static g D(Dialog dialog, j5.e eVar) {
        return E(dialog, eVar, null);
    }

    public static g E(Dialog dialog, j5.e eVar, m mVar) {
        if (dialog == null) {
            throw new IllegalArgumentException("Dialog is null");
        }
        Context context = dialog.getContext();
        WindowManager windowManager = (WindowManager) context.getSystemService(C5443b.f226850e);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = 2;
        layoutParams.format = 1;
        layoutParams.flags = 0;
        layoutParams.gravity = 8388659;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.width = -1;
        layoutParams.height = -1;
        g gVar = new g(context, windowManager, null, eVar, mVar);
        windowManager.addView(gVar, layoutParams);
        return gVar;
    }

    public void A(boolean z10) {
        if (this.f214097D != z10) {
            this.f214097D = z10;
            postInvalidate();
        }
    }

    public final void F() {
        if (this.f214101H) {
            return;
        }
        this.f214121c = false;
        this.f214138k0.start();
        this.f214101H = true;
    }

    public void G() {
        int iMin = Math.min(getWidth(), this.f214133i) - (this.f214129g * 2);
        if (iMin <= 0) {
            return;
        }
        CharSequence charSequence = this.f214157y;
        TextPaint textPaint = this.f214151s;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f214158z = new StaticLayout(charSequence, textPaint, iMin, alignment, 1.0f, 0.0f, false);
        if (this.f214094A != null) {
            this.f214095B = new StaticLayout(this.f214094A, this.f214152t, iMin, alignment, 1.0f, 0.0f, false);
        } else {
            this.f214095B = null;
        }
    }

    public void f(Context context) {
        j5.e eVar = this.f214149q;
        this.f214098E = eVar.f214083z;
        boolean z10 = eVar.f214081x;
        this.f214099F = z10;
        this.f214100G = eVar.f214082y;
        if (z10 && !eVar.f214056A) {
            c cVar = new c();
            this.f214134i0 = cVar;
            setOutlineProvider(cVar);
            setElevation(this.f214141m);
        }
        setLayerType(2, null);
        Resources.Theme theme = context.getTheme();
        this.f214096C = j5.i.d(context, "isLightTheme") == 0;
        Integer numO = this.f214149q.O(context);
        if (numO != null) {
            this.f214153u.setColor(numO.intValue());
        } else if (theme != null) {
            this.f214153u.setColor(j5.i.d(context, "colorPrimary"));
        } else {
            this.f214153u.setColor(-1);
        }
        Integer numR = this.f214149q.R(context);
        if (numR != null) {
            this.f214155w.setColor(numR.intValue());
        } else {
            this.f214155w.setColor(this.f214096C ? -16777216 : -1);
        }
        if (this.f214149q.f214056A) {
            this.f214155w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        this.f214156x.setColor(this.f214155w.getColor());
        Integer numN = this.f214149q.n(context);
        if (numN != null) {
            this.f214120b0 = j5.i.b(numN.intValue(), 0.3f);
        } else {
            this.f214120b0 = -1;
        }
        Integer numZ = this.f214149q.Z(context);
        if (numZ != null) {
            this.f214151s.setColor(numZ.intValue());
        } else {
            this.f214151s.setColor(this.f214096C ? -16777216 : -1);
        }
        Integer numG = this.f214149q.g(context);
        if (numG != null) {
            this.f214152t.setColor(numG.intValue());
        } else {
            this.f214152t.setColor(this.f214151s.getColor());
        }
        Typeface typeface = this.f214149q.f214064g;
        if (typeface != null) {
            this.f214151s.setTypeface(typeface);
        }
        Typeface typeface2 = this.f214149q.f214065h;
        if (typeface2 != null) {
            this.f214152t.setTypeface(typeface2);
        }
    }

    public void g() {
        this.f214107N = r();
        int[] iArrP = p();
        this.f214111R = iArrP;
        this.f214110Q = q(iArrP[0], iArrP[1], this.f214107N, this.f214150r);
    }

    public void h() {
        if (this.f214111R == null) {
            return;
        }
        this.f214106M.left = (int) Math.max(0.0f, r0[0] - this.f214109P);
        this.f214106M.top = (int) Math.min(0.0f, this.f214111R[1] - this.f214109P);
        this.f214106M.right = (int) Math.min(getWidth(), this.f214111R[0] + this.f214109P + this.f214137k);
        this.f214106M.bottom = (int) Math.min(getHeight(), this.f214111R[1] + this.f214109P + this.f214137k);
    }

    public float i(float f10, float f11) {
        if (f10 < f11) {
            return 0.0f;
        }
        return (f10 - f11) / (1.0f - f11);
    }

    public void j(boolean z10) {
        this.f214119b = true;
        this.f214140l0.cancel();
        this.f214138k0.cancel();
        if (!this.f214101H || this.f214111R == null) {
            o(z10);
        } else if (z10) {
            this.f214144n0.start();
        } else {
            this.f214142m0.start();
        }
    }

    public double k(int i10, int i11, int i12, int i13) {
        return Math.sqrt(Math.pow(i13 - i11, 2.0d) + Math.pow(i12 - i10, 2.0d));
    }

    public void l(Canvas canvas) {
        if (this.f214105L == null) {
            Paint paint = new Paint();
            this.f214105L = paint;
            paint.setARGB(255, 255, 0, 0);
            this.f214105L.setStyle(Paint.Style.STROKE);
            this.f214105L.setStrokeWidth(j5.i.a(getContext(), 1));
        }
        if (this.f214104K == null) {
            TextPaint textPaint = new TextPaint();
            this.f214104K = textPaint;
            textPaint.setColor(-65536);
            this.f214104K.setTextSize(j5.i.c(getContext(), 16));
        }
        this.f214105L.setStyle(Paint.Style.STROKE);
        canvas.drawRect(this.f214107N, this.f214105L);
        canvas.drawRect(this.f214150r, this.f214105L);
        int[] iArr = this.f214111R;
        canvas.drawCircle(iArr[0], iArr[1], 10.0f, this.f214105L);
        int[] iArr2 = this.f214111R;
        canvas.drawCircle(iArr2[0], iArr2[1], this.f214110Q - this.f214137k, this.f214105L);
        canvas.drawCircle(this.f214150r.centerX(), this.f214150r.centerY(), this.f214125e + this.f214123d, this.f214105L);
        this.f214105L.setStyle(Paint.Style.FILL);
        String str = "Text bounds: " + this.f214107N.toShortString() + "\nTarget bounds: " + this.f214150r.toShortString() + "\nCenter: " + this.f214111R[0] + q.f17581a + this.f214111R[1] + "\nView size: " + getWidth() + q.f17581a + getHeight() + "\nTarget bounds: " + this.f214150r.toShortString();
        SpannableStringBuilder spannableStringBuilder = this.f214102I;
        if (spannableStringBuilder == null) {
            this.f214102I = new SpannableStringBuilder(str);
        } else {
            spannableStringBuilder.clear();
            this.f214102I.append((CharSequence) str);
        }
        if (this.f214103J == null) {
            this.f214103J = new DynamicLayout(str, this.f214104K, getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        int iSave = canvas.save();
        this.f214105L.setARGB(220, 0, 0, 0);
        canvas.translate(0.0f, this.f214126e0);
        canvas.drawRect(0.0f, 0.0f, this.f214103J.getWidth(), this.f214103J.getHeight(), this.f214105L);
        this.f214105L.setARGB(255, 255, 0, 0);
        this.f214103J.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public void m(Canvas canvas) {
        float f10 = this.f214112S * 0.2f;
        this.f214154v.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f214154v.setAlpha((int) f10);
        int[] iArr = this.f214111R;
        canvas.drawCircle(iArr[0], iArr[1] + this.f214141m, this.f214109P, this.f214154v);
        this.f214154v.setStyle(Paint.Style.STROKE);
        for (int i10 = 6; i10 > 0; i10--) {
            this.f214154v.setAlpha((int) ((i10 / 7.0f) * f10));
            int[] iArr2 = this.f214111R;
            canvas.drawCircle(iArr2[0], iArr2[1] + this.f214141m, this.f214109P + ((7 - i10) * this.f214143n), this.f214154v);
        }
    }

    public void n() {
        Drawable drawable = this.f214149q.f214063f;
        if (!this.f214098E || drawable == null) {
            this.f214130g0 = null;
            return;
        }
        if (this.f214130g0 != null) {
            return;
        }
        this.f214130g0 = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f214130g0);
        drawable.setColorFilter(new PorterDuffColorFilter(this.f214153u.getColor(), PorterDuff.Mode.SRC_ATOP));
        drawable.draw(canvas);
        drawable.setColorFilter(null);
    }

    public final void o(boolean z10) {
        z(z10);
        j5.k.d(this.f214147p, this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        if (this.f214117a || this.f214111R == null) {
            return;
        }
        int i10 = this.f214126e0;
        if (i10 > 0 && this.f214128f0 > 0) {
            canvas.clipRect(0, i10, getWidth(), this.f214128f0);
        }
        int i11 = this.f214120b0;
        if (i11 != -1) {
            canvas.drawColor(i11);
        }
        this.f214153u.setAlpha(this.f214112S);
        if (this.f214099F && this.f214134i0 == null) {
            int iSave = canvas.save();
            canvas.clipPath(this.f214108O, Region.Op.DIFFERENCE);
            m(canvas);
            canvas.restoreToCount(iSave);
        }
        int[] iArr = this.f214111R;
        canvas.drawCircle(iArr[0], iArr[1], this.f214109P, this.f214153u);
        this.f214155w.setAlpha(this.f214116W);
        int i12 = this.f214114U;
        if (i12 > 0) {
            this.f214156x.setAlpha(i12);
            canvas.drawCircle(this.f214150r.centerX(), this.f214150r.centerY(), this.f214113T, this.f214156x);
        }
        canvas.drawCircle(this.f214150r.centerX(), this.f214150r.centerY(), this.f214115V, this.f214155w);
        int iSave2 = canvas.save();
        Rect rect = this.f214107N;
        canvas.translate(rect.left, rect.top);
        this.f214151s.setAlpha(this.f214118a0);
        StaticLayout staticLayout2 = this.f214158z;
        if (staticLayout2 != null) {
            staticLayout2.draw(canvas);
        }
        if (this.f214095B != null && (staticLayout = this.f214158z) != null) {
            canvas.translate(0.0f, staticLayout.getHeight() + this.f214131h);
            this.f214152t.setAlpha((int) (this.f214149q.f214057B * this.f214118a0));
            this.f214095B.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        if (this.f214130g0 != null) {
            canvas.translate(this.f214150r.centerX() - (this.f214130g0.getWidth() / 2), this.f214150r.centerY() - (this.f214130g0.getHeight() / 2));
            canvas.drawBitmap(this.f214130g0, 0.0f, 0.0f, this.f214155w);
        } else if (this.f214149q.f214063f != null) {
            canvas.translate(this.f214150r.centerX() - (this.f214149q.f214063f.getBounds().width() / 2), this.f214150r.centerY() - (this.f214149q.f214063f.getBounds().height() / 2));
            this.f214149q.f214063f.setAlpha(this.f214155w.getAlpha());
            this.f214149q.f214063f.draw(canvas);
        }
        canvas.restoreToCount(iSave3);
        if (this.f214097D) {
            l(canvas);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!x() || !this.f214100G || i10 != 4) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (!x() || !this.f214121c || !this.f214100G || i10 != 4 || !keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        this.f214121c = false;
        m mVar = this.f214132h0;
        if (mVar != null) {
            mVar.b(this);
            return true;
        }
        j(false);
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f214122c0 = motionEvent.getX();
        this.f214124d0 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    public int[] p() {
        if (v(this.f214150r.centerY())) {
            return new int[]{this.f214150r.centerX(), this.f214150r.centerY()};
        }
        int iMax = (Math.max(this.f214150r.width(), this.f214150r.height()) / 2) + this.f214123d;
        int iS = s();
        boolean z10 = ((this.f214150r.centerY() - this.f214125e) - this.f214123d) - iS > 0;
        int iMin = Math.min(this.f214107N.left, this.f214150r.left - iMax);
        int iMax2 = Math.max(this.f214107N.right, this.f214150r.right + iMax);
        StaticLayout staticLayout = this.f214158z;
        int height = staticLayout != null ? staticLayout.getHeight() : 0;
        return new int[]{(iMin + iMax2) / 2, z10 ? (((this.f214150r.centerY() - this.f214125e) - this.f214123d) - iS) + height : this.f214150r.centerY() + this.f214125e + this.f214123d + height};
    }

    public int q(int i10, int i11, Rect rect, Rect rect2) {
        int iCenterX = rect2.centerX();
        int iCenterY = rect2.centerY();
        Rect rect3 = new Rect(iCenterX, iCenterY, iCenterX, iCenterY);
        int i12 = -((int) (this.f214125e * 1.1f));
        rect3.inset(i12, i12);
        return Math.max(y(i10, i11, rect), y(i10, i11, rect3)) + this.f214137k;
    }

    public Rect r() {
        int iS = s();
        int iT = t();
        int iCenterY = ((this.f214150r.centerY() - this.f214125e) - this.f214123d) - iS;
        if (iCenterY <= this.f214126e0) {
            iCenterY = this.f214150r.centerY() + this.f214125e + this.f214123d;
        }
        int iMax = Math.max(this.f214129g, (this.f214150r.centerX() - ((getWidth() / 2) - this.f214150r.centerX() < 0 ? -this.f214135j : this.f214135j)) - iT);
        return new Rect(iMax, iCenterY, Math.min(getWidth() - this.f214129g, iT + iMax), iS + iCenterY);
    }

    public int s() {
        StaticLayout staticLayout = this.f214158z;
        if (staticLayout == null) {
            return 0;
        }
        if (this.f214095B == null) {
            return staticLayout.getHeight() + this.f214131h;
        }
        return this.f214095B.getHeight() + staticLayout.getHeight() + this.f214131h;
    }

    public int t() {
        StaticLayout staticLayout = this.f214158z;
        if (staticLayout == null) {
            return 0;
        }
        return this.f214095B == null ? staticLayout.getWidth() : Math.max(staticLayout.getWidth(), this.f214095B.getWidth());
    }

    public float u(float f10) {
        return f10 < 0.5f ? f10 / 0.5f : (1.0f - f10) / 0.5f;
    }

    public boolean v(int i10) {
        int i11 = this.f214128f0;
        if (i11 <= 0) {
            return i10 < this.f214139l || i10 > getHeight() - this.f214139l;
        }
        int i12 = this.f214139l;
        return i10 < i12 || i10 > i11 - i12;
    }

    public void w(Rect rect) {
        invalidate(rect);
        if (this.f214134i0 != null) {
            invalidateOutline();
        }
    }

    public boolean x() {
        return !this.f214117a && this.f214101H;
    }

    public int y(int i10, int i11, Rect rect) {
        return (int) Math.max(k(i10, i11, rect.left, rect.top), Math.max(k(i10, i11, rect.right, rect.top), Math.max(k(i10, i11, rect.left, rect.bottom), k(i10, i11, rect.right, rect.bottom))));
    }

    public void z(boolean z10) {
        if (this.f214117a) {
            return;
        }
        this.f214119b = false;
        this.f214117a = true;
        for (ValueAnimator valueAnimator : this.f214146o0) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f214148p0);
        this.f214101H = false;
    }

    public static class m {
        public void b(g gVar) {
            gVar.j(false);
        }

        public void c(g gVar) {
            gVar.j(true);
        }

        public void e(g gVar) {
            c(gVar);
        }

        public void a(g gVar) {
        }

        public void d(g gVar, boolean z10) {
        }
    }
}
