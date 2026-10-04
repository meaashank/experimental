package androidx.compose.ui.graphics.layer;

import P.g;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.ui.graphics.AbstractC2098q2;
import androidx.compose.ui.graphics.B0;
import androidx.compose.ui.graphics.C0;
import androidx.compose.ui.graphics.C2031g0;
import androidx.compose.ui.graphics.C2117v2;
import androidx.compose.ui.graphics.InterfaceC2105s2;
import androidx.compose.ui.graphics.J0;
import androidx.compose.ui.graphics.K0;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Q2;
import androidx.compose.ui.unit.LayoutDirection;
import k0.InterfaceC4814e;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAndroidGraphicsLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 8 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,997:1\n626#1,6:1057\n632#1,3:1064\n630#1,7:1067\n626#1,6:1120\n632#1,3:1127\n630#1,7:1130\n205#2:998\n205#2:1063\n205#2:1078\n205#2:1126\n44#3,20:999\n64#3,4:1046\n107#3,6:1084\n113#3,3:1117\n267#4,4:1019\n237#4,7:1023\n248#4,3:1031\n251#4,2:1035\n272#4,2:1037\n254#4,6:1039\n274#4:1045\n267#4,4:1090\n237#4,7:1094\n248#4,3:1102\n251#4,2:1106\n272#4,2:1108\n254#4,6:1110\n274#4:1116\n1810#5:1030\n1672#5:1034\n1810#5:1101\n1672#5:1105\n1#6:1050\n38#7,5:1051\n38#7,5:1079\n26#8:1056\n26#8:1074\n26#8:1075\n26#8:1076\n26#8:1077\n*S KotlinDebug\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer\n*L\n606#1:1057,6\n606#1:1064,3\n606#1:1067,7\n732#1:1120,6\n732#1:1127,3\n732#1:1130,7\n150#1:998\n606#1:1063\n631#1:1078\n732#1:1126\n433#1:999,20\n433#1:1046,4\n696#1:1084,6\n696#1:1117,3\n433#1:1019,4\n433#1:1023,7\n433#1:1031,3\n433#1:1035,2\n433#1:1037,2\n433#1:1039,6\n433#1:1045\n696#1:1090,4\n696#1:1094,7\n696#1:1102,3\n696#1:1106,2\n696#1:1108,2\n696#1:1110,6\n696#1:1116\n433#1:1030\n433#1:1034\n696#1:1101\n696#1:1105\n586#1:1051,5\n649#1:1079,5\n591#1:1056\n608#1:1074\n609#1:1075\n611#1:1076\n613#1:1077\n*E\n"})
public final class GraphicsLayer {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final a f101217y = new a();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final I f101218z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final GraphicsLayerImpl f101219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final H f101220b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Outline f101225g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f101227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f101228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f101229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public AbstractC2098q2 f101230l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Path f101231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Path f101232n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f101233o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public InterfaceC2105s2 f101234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f101235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final C2054a f101236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f101237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f101238t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f101239u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f101240v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f101241w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public RectF f101242x;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public InterfaceC4814e f101221c = androidx.compose.ui.graphics.drawscope.g.f101079a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public LayoutDirection f101222d = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public ed.l<? super androidx.compose.ui.graphics.drawscope.h, L0> f101223e = new ed.l<androidx.compose.ui.graphics.drawscope.h, L0>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$drawBlock$1
        public final void e(@NotNull androidx.compose.ui.graphics.drawscope.h hVar) {
        }

        @Override // ed.l
        public /* bridge */ /* synthetic */ L0 invoke(androidx.compose.ui.graphics.drawscope.h hVar) {
            return L0.f217464a;
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ed.l<androidx.compose.ui.graphics.drawscope.h, L0> f101224f = new ed.l<androidx.compose.ui.graphics.drawscope.h, L0>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$clipDrawBlock$1
        {
            super(1);
        }

        public final void e(@NotNull androidx.compose.ui.graphics.drawscope.h hVar) {
            Path path = this.f101243d.f101231m;
            GraphicsLayer graphicsLayer = this.f101243d;
            if (!graphicsLayer.f101233o || !graphicsLayer.f101241w || path == null) {
                graphicsLayer.f101223e.invoke(hVar);
                return;
            }
            ed.l<? super androidx.compose.ui.graphics.drawscope.h, L0> lVar = graphicsLayer.f101223e;
            J0.f100729b.getClass();
            int i10 = J0.f100731d;
            androidx.compose.ui.graphics.drawscope.f fVarL1 = hVar.l1();
            long jE = fVarL1.e();
            fVarL1.g().A();
            try {
                fVarL1.j().d(path, i10);
                lVar.invoke(hVar);
            } finally {
                androidx.compose.animation.L.a(fVarL1, jE);
            }
        }

        @Override // ed.l
        public /* bridge */ /* synthetic */ L0 invoke(androidx.compose.ui.graphics.drawscope.h hVar) {
            e(hVar);
            return L0.f217464a;
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f101226h = true;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        I i10;
        H.f101252g.getClass();
        if (H.f101253h) {
            i10 = J.f101260a;
        } else if (Build.VERSION.SDK_INT >= 28) {
            i10 = L.f101261a;
        } else {
            X.f101282a.getClass();
            i10 = LayerSnapshotV22.f101263a;
        }
        f101218z = i10;
    }

    public GraphicsLayer(@NotNull GraphicsLayerImpl graphicsLayerImpl, @Nullable H h10) {
        this.f101219a = graphicsLayerImpl;
        this.f101220b = h10;
        g.a aVar = P.g.f65503b;
        aVar.getClass();
        this.f101227i = P.g.f65504c;
        P.n.f65527b.getClass();
        this.f101228j = P.n.f65529d;
        this.f101236r = new C2054a();
        graphicsLayerImpl.L(false);
        k0.t.f214328b.getClass();
        this.f101238t = k0.t.f214329c;
        k0.x.f214338b.getClass();
        this.f101239u = k0.x.f214339c;
        aVar.getClass();
        this.f101240v = P.g.f65506e;
    }

    public static void f0(GraphicsLayer graphicsLayer, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            P.g.f65503b.getClass();
            j10 = P.g.f65504c;
        }
        if ((i10 & 2) != 0) {
            P.n.f65527b.getClass();
            j11 = P.n.f65529d;
        }
        graphicsLayer.e0(j10, j11);
    }

    public static void l0(GraphicsLayer graphicsLayer, long j10, long j11, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            P.g.f65503b.getClass();
            j10 = P.g.f65504c;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            P.n.f65527b.getClass();
            j11 = P.n.f65529d;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        graphicsLayer.k0(j12, j13, f10);
    }

    public static /* synthetic */ void p() {
    }

    public final float A() {
        return this.f101219a.u();
    }

    public final float B() {
        return this.f101219a.x();
    }

    public final float C() {
        return this.f101219a.B();
    }

    public final float D() {
        return this.f101219a.b0();
    }

    public final long E() {
        return this.f101239u;
    }

    public final long F() {
        return this.f101219a.J();
    }

    public final long G() {
        return this.f101238t;
    }

    public final float H() {
        return this.f101219a.r();
    }

    public final float I() {
        return this.f101219a.q();
    }

    public final boolean J() {
        return this.f101237s;
    }

    public final Outline K() {
        Outline outline = this.f101225g;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.f101225g = outline2;
        return outline2;
    }

    public final RectF L() {
        RectF rectF = this.f101242x;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.f101242x = rectF2;
        return rectF2;
    }

    public final void M() {
        this.f101235q++;
    }

    public final void N() {
        this.f101235q--;
        f();
    }

    public final void O(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection, long j10, @NotNull ed.l<? super androidx.compose.ui.graphics.drawscope.h, L0> lVar) {
        p0(j10);
        this.f101221c = interfaceC4814e;
        this.f101222d = layoutDirection;
        this.f101223e = lVar;
        this.f101219a.M(true);
        P();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P() {
        /*
            r15 = this;
            androidx.compose.ui.graphics.layer.a r0 = r15.f101236r
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = r0.f101298a
            r0.f101299b = r1
            androidx.collection.MutableScatterSet<androidx.compose.ui.graphics.layer.GraphicsLayer> r1 = r0.f101300c
            if (r1 == 0) goto L20
            boolean r2 = r1.s()
            if (r2 == 0) goto L20
            androidx.collection.MutableScatterSet<androidx.compose.ui.graphics.layer.GraphicsLayer> r2 = r0.f101301d
            if (r2 != 0) goto L1a
            androidx.collection.MutableScatterSet r2 = androidx.collection.T0.b()
            r0.f101301d = r2
        L1a:
            r2.E(r1)
            r1.K()
        L20:
            r1 = 1
            r0.f101302e = r1
            androidx.compose.ui.graphics.layer.GraphicsLayerImpl r1 = r15.f101219a
            k0.e r2 = r15.f101221c
            androidx.compose.ui.unit.LayoutDirection r3 = r15.f101222d
            ed.l<androidx.compose.ui.graphics.drawscope.h, kotlin.L0> r4 = r15.f101224f
            r1.F(r2, r3, r15, r4)
            r1 = 0
            r0.f101302e = r1
            androidx.compose.ui.graphics.layer.GraphicsLayer r2 = r0.f101299b
            if (r2 == 0) goto L38
            r2.N()
        L38:
            androidx.collection.MutableScatterSet<androidx.compose.ui.graphics.layer.GraphicsLayer> r0 = r0.f101301d
            if (r0 == 0) goto L89
            boolean r2 = r0.s()
            if (r2 == 0) goto L89
            java.lang.Object[] r2 = r0.f86877b
            long[] r3 = r0.f86876a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L86
            r5 = r1
        L4c:
            r6 = r3[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L81
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L66:
            if (r10 >= r8) goto L7f
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L7b
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            androidx.compose.ui.graphics.layer.GraphicsLayer r11 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r11
            r11.N()
        L7b:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L66
        L7f:
            if (r8 != r9) goto L86
        L81:
            if (r5 == r4) goto L86
            int r5 = r5 + 1
            goto L4c
        L86:
            r0.K()
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.P():void");
    }

    public final void Q() {
        if (this.f101219a.a()) {
            return;
        }
        try {
            P();
        } catch (Throwable unused) {
        }
    }

    public final void R() {
        if (this.f101237s) {
            return;
        }
        this.f101237s = true;
        f();
    }

    public final void S() {
        this.f101230l = null;
        this.f101231m = null;
        P.n.f65527b.getClass();
        this.f101228j = P.n.f65529d;
        P.g.f65503b.getClass();
        this.f101227i = P.g.f65504c;
        this.f101229k = 0.0f;
        this.f101226h = true;
        this.f101233o = false;
    }

    public final <T> T T(ed.p<? super P.g, ? super P.n, ? extends T> pVar) {
        long jH = k0.y.h(this.f101239u);
        long j10 = this.f101227i;
        long j11 = this.f101228j;
        if (j11 != P.d.f65493d) {
            jH = j11;
        }
        return pVar.invoke(new P.g(j10), new P.n(jH));
    }

    public final void U(float f10) {
        if (this.f101219a.f() == f10) {
            return;
        }
        this.f101219a.h(f10);
    }

    public final void V(long j10) {
        if (K0.y(j10, this.f101219a.e0())) {
            return;
        }
        this.f101219a.f0(j10);
    }

    public final void W(int i10) {
        if (this.f101219a.g() == i10) {
            return;
        }
        this.f101219a.b(i10);
    }

    public final void X(float f10) {
        if (this.f101219a.l() == f10) {
            return;
        }
        this.f101219a.m(f10);
    }

    public final void Y(boolean z10) {
        if (this.f101241w != z10) {
            this.f101241w = z10;
            this.f101226h = true;
            e();
        }
    }

    public final void Z(@Nullable androidx.compose.ui.graphics.L0 l02) {
        if (kotlin.jvm.internal.G.g(this.f101219a.c(), l02)) {
            return;
        }
        this.f101219a.s(l02);
    }

    public final void a0(int i10) {
        if (this.f101219a.H() == i10) {
            return;
        }
        this.f101219a.Q(i10);
    }

    public final void b0(@NotNull Path path) {
        S();
        this.f101231m = path;
        e();
    }

    public final void c0(long j10) {
        if (P.g.l(this.f101240v, j10)) {
            return;
        }
        this.f101240v = j10;
        this.f101219a.O(j10);
    }

    public final void d(GraphicsLayer graphicsLayer) {
        if (this.f101236r.i(graphicsLayer)) {
            graphicsLayer.M();
        }
    }

    public final void d0(long j10, long j11) {
        this.f101219a.I((int) (j10 >> 32), (int) (j10 & ZipKt.f225990j), j11);
    }

    public final void e() {
        if (this.f101226h) {
            Outline outline = null;
            if (this.f101241w || this.f101219a.b0() > 0.0f) {
                Path path = this.f101231m;
                if (path != null) {
                    RectF rectFL = L();
                    if (!(path instanceof androidx.compose.ui.graphics.Z)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((androidx.compose.ui.graphics.Z) path).f100925b.computeBounds(rectFL, false);
                    Outline outlineW0 = w0(path);
                    if (outlineW0 != null) {
                        outlineW0.setAlpha(this.f101219a.f());
                        outline = outlineW0;
                    }
                    this.f101219a.E(outline, k0.y.a(Math.round(rectFL.width()), Math.round(rectFL.height())));
                    if (this.f101233o && this.f101241w) {
                        this.f101219a.L(false);
                        this.f101219a.e();
                    } else {
                        this.f101219a.L(this.f101241w);
                    }
                } else {
                    this.f101219a.L(this.f101241w);
                    P.n.f65527b.getClass();
                    Outline outlineK = K();
                    long jH = k0.y.h(this.f101239u);
                    long j10 = this.f101227i;
                    long j11 = this.f101228j;
                    long j12 = j11 == P.d.f65493d ? jH : j11;
                    outlineK.setRoundRect(Math.round(P.g.p(j10)), Math.round(P.g.r(j10)), Math.round(P.n.t(j12) + P.g.p(j10)), Math.round(P.n.m(j12) + P.g.r(j10)), this.f101229k);
                    outlineK.setAlpha(this.f101219a.f());
                    this.f101219a.E(outlineK, k0.y.d(j12));
                }
            } else {
                this.f101219a.L(false);
                GraphicsLayerImpl graphicsLayerImpl = this.f101219a;
                k0.x.f214338b.getClass();
                graphicsLayerImpl.E(null, k0.x.f214339c);
            }
        }
        this.f101226h = false;
    }

    public final void e0(long j10, long j11) {
        k0(j10, j11, 0.0f);
    }

    public final void f() {
        if (this.f101237s && this.f101235q == 0) {
            H h10 = this.f101220b;
            if (h10 != null) {
                h10.k(this);
            } else {
                g();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r15 = this;
            androidx.compose.ui.graphics.layer.a r0 = r15.f101236r
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = r0.f101298a
            if (r1 == 0) goto Lc
            r1.N()
            r1 = 0
            r0.f101298a = r1
        Lc:
            androidx.collection.MutableScatterSet<androidx.compose.ui.graphics.layer.GraphicsLayer> r0 = r0.f101300c
            if (r0 == 0) goto L58
            java.lang.Object[] r1 = r0.f86877b
            long[] r2 = r0.f86876a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L55
            r4 = 0
            r5 = r4
        L1b:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L50
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L35:
            if (r10 >= r8) goto L4e
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4a
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            androidx.compose.ui.graphics.layer.GraphicsLayer r11 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r11
            r11.N()
        L4a:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L35
        L4e:
            if (r8 != r9) goto L55
        L50:
            if (r5 == r3) goto L55
            int r5 = r5 + 1
            goto L1b
        L55:
            r0.K()
        L58:
            androidx.compose.ui.graphics.layer.GraphicsLayerImpl r0 = r15.f101219a
            r0.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.g():void");
    }

    public final void g0(@Nullable Q2 q22) {
        if (kotlin.jvm.internal.G.g(this.f101219a.i(), q22)) {
            return;
        }
        this.f101219a.w(q22);
    }

    public final void h(@NotNull C0 c02, @Nullable GraphicsLayer graphicsLayer) {
        if (this.f101237s) {
            return;
        }
        e();
        Q();
        boolean z10 = this.f101219a.b0() > 0.0f;
        if (z10) {
            c02.t();
        }
        Canvas canvasD = androidx.compose.ui.graphics.H.d(c02);
        boolean zIsHardwareAccelerated = canvasD.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            canvasD.save();
            v0(canvasD);
        }
        boolean z11 = !zIsHardwareAccelerated && this.f101241w;
        if (z11) {
            c02.A();
            AbstractC2098q2 abstractC2098q2U = u();
            if (abstractC2098q2U instanceof AbstractC2098q2.b) {
                B0.o(c02, abstractC2098q2U.a(), 0, 2, null);
            } else if (abstractC2098q2U instanceof AbstractC2098q2.c) {
                Path pathA = this.f101232n;
                if (pathA != null) {
                    pathA.rewind();
                } else {
                    pathA = C2031g0.a();
                    this.f101232n = pathA;
                }
                C2117v2.B(pathA, ((AbstractC2098q2.c) abstractC2098q2U).f101395a, null, 2, null);
                B0.m(c02, pathA, 0, 2, null);
            } else if (abstractC2098q2U instanceof AbstractC2098q2.a) {
                B0.m(c02, ((AbstractC2098q2.a) abstractC2098q2U).f101393a, 0, 2, null);
            }
        }
        if (graphicsLayer != null) {
            graphicsLayer.d(this);
        }
        this.f101219a.G(c02);
        if (z11) {
            c02.r();
        }
        if (z10) {
            c02.m();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasD.restore();
    }

    public final void h0(float f10) {
        if (this.f101219a.z() == f10) {
            return;
        }
        this.f101219a.n(f10);
    }

    public final void i(@NotNull C0 c02) {
        if (androidx.compose.ui.graphics.H.d(c02).isHardwareAccelerated()) {
            Q();
            this.f101219a.G(c02);
        }
    }

    public final void i0(float f10) {
        if (this.f101219a.t() == f10) {
            return;
        }
        this.f101219a.o(f10);
    }

    @TestOnly
    public final void j() {
        this.f101219a.e();
    }

    public final void j0(float f10) {
        if (this.f101219a.u() == f10) {
            return;
        }
        this.f101219a.p(f10);
    }

    public final float k() {
        return this.f101219a.f();
    }

    public final void k0(long j10, long j11, float f10) {
        if (P.g.l(this.f101227i, j10) && P.n.k(this.f101228j, j11) && this.f101229k == f10 && this.f101231m == null) {
            return;
        }
        S();
        this.f101227i = j10;
        this.f101228j = j11;
        this.f101229k = f10;
        e();
    }

    public final long l() {
        return this.f101219a.e0();
    }

    public final int m() {
        return this.f101219a.g();
    }

    public final void m0(float f10) {
        if (this.f101219a.x() == f10) {
            return;
        }
        this.f101219a.v(f10);
    }

    public final float n() {
        return this.f101219a.l();
    }

    public final void n0(float f10) {
        if (this.f101219a.B() == f10) {
            return;
        }
        this.f101219a.y(f10);
    }

    public final boolean o() {
        return this.f101241w;
    }

    public final void o0(float f10) {
        if (this.f101219a.b0() == f10) {
            return;
        }
        this.f101219a.P(f10);
        this.f101226h = true;
        e();
    }

    public final void p0(long j10) {
        if (k0.x.h(this.f101239u, j10)) {
            return;
        }
        this.f101239u = j10;
        d0(this.f101238t, j10);
        if (this.f101228j == P.d.f65493d) {
            this.f101226h = true;
            e();
        }
    }

    @Nullable
    public final androidx.compose.ui.graphics.L0 q() {
        return this.f101219a.c();
    }

    public final void q0(long j10) {
        if (K0.y(j10, this.f101219a.J())) {
            return;
        }
        this.f101219a.j0(j10);
    }

    public final int r() {
        return this.f101219a.H();
    }

    public final void r0(long j10) {
        if (k0.t.j(this.f101238t, j10)) {
            return;
        }
        this.f101238t = j10;
        d0(j10, this.f101239u);
    }

    @NotNull
    public final GraphicsLayerImpl s() {
        return this.f101219a;
    }

    public final void s0(float f10) {
        if (this.f101219a.r() == f10) {
            return;
        }
        this.f101219a.A(f10);
    }

    public final long t() {
        return this.f101219a.k();
    }

    public final void t0(float f10) {
        if (this.f101219a.q() == f10) {
            return;
        }
        this.f101219a.j(f10);
    }

    @NotNull
    public final AbstractC2098q2 u() {
        AbstractC2098q2 abstractC2098q2 = this.f101230l;
        Path path = this.f101231m;
        if (abstractC2098q2 != null) {
            return abstractC2098q2;
        }
        if (path != null) {
            AbstractC2098q2.a aVar = new AbstractC2098q2.a(path);
            this.f101230l = aVar;
            return aVar;
        }
        long jH = k0.y.h(this.f101239u);
        long j10 = this.f101227i;
        long j11 = this.f101228j;
        if (j11 != P.d.f65493d) {
            jH = j11;
        }
        float fP = P.g.p(j10);
        float fR = P.g.r(j10);
        float fT = P.n.t(jH) + fP;
        float fM = P.n.m(jH) + fR;
        float f10 = this.f101229k;
        AbstractC2098q2 cVar = f10 > 0.0f ? new AbstractC2098q2.c(P.m.e(fP, fR, fT, fM, P.b.b(f10, 0.0f, 2, null))) : new AbstractC2098q2.b(new P.j(fP, fR, fT, fM));
        this.f101230l = cVar;
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u0(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super androidx.compose.ui.graphics.InterfaceC2025e2> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 r0 = (androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1) r0
            int r1 = r0.f101247c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f101247c = r1
            goto L18
        L13:
            androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 r0 = new androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f101245a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f101247c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.C4885d0.n(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.C4885d0.n(r5)
            androidx.compose.ui.graphics.layer.I r5 = androidx.compose.ui.graphics.layer.GraphicsLayer.f101218z
            r0.f101247c = r3
            java.lang.Object r5 = r5.a(r4, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            androidx.compose.ui.graphics.T r0 = new androidx.compose.ui.graphics.T
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.u0(kotlin.coroutines.e):java.lang.Object");
    }

    public final long v() {
        return this.f101219a.N();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v0(android.graphics.Canvas r11) {
        /*
            r10 = this;
            long r0 = r10.f101238t
            r2 = 32
            long r3 = r0 >> r2
            int r3 = (int) r3
            float r5 = (float) r3
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            int r0 = (int) r0
            float r6 = (float) r0
            long r0 = r10.f101239u
            long r7 = r0 >> r2
            int r2 = (int) r7
            float r2 = (float) r2
            float r7 = r5 + r2
            long r0 = r0 & r3
            int r0 = (int) r0
            float r0 = (float) r0
            float r8 = r6 + r0
            androidx.compose.ui.graphics.layer.GraphicsLayerImpl r0 = r10.f101219a
            float r0 = r0.f()
            androidx.compose.ui.graphics.layer.GraphicsLayerImpl r1 = r10.f101219a
            androidx.compose.ui.graphics.L0 r1 = r1.c()
            androidx.compose.ui.graphics.layer.GraphicsLayerImpl r2 = r10.f101219a
            int r2 = r2.g()
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L55
            androidx.compose.ui.graphics.r0$a r3 = androidx.compose.ui.graphics.C2099r0.f101402b
            r3.getClass()
            int r3 = androidx.compose.ui.graphics.C2099r0.f101406f
            if (r2 != r3) goto L55
            if (r1 != 0) goto L55
            androidx.compose.ui.graphics.layer.GraphicsLayerImpl r3 = r10.f101219a
            int r3 = r3.H()
            androidx.compose.ui.graphics.layer.b$a r4 = androidx.compose.ui.graphics.layer.C2055b.f101303b
            r4.getClass()
            int r4 = androidx.compose.ui.graphics.layer.C2055b.f101305d
            if (r3 != r4) goto L50
            goto L55
        L50:
            r11.save()
            r4 = r11
            goto L71
        L55:
            androidx.compose.ui.graphics.s2 r3 = r10.f101234p
            if (r3 != 0) goto L60
            androidx.compose.ui.graphics.X r3 = new androidx.compose.ui.graphics.X
            r3.<init>()
            r10.f101234p = r3
        L60:
            r3.h(r0)
            r3.b(r2)
            r3.s(r1)
            android.graphics.Paint r9 = r3.B()
            r4 = r11
            r4.saveLayer(r5, r6, r7, r8, r9)
        L71:
            r4.translate(r5, r6)
            androidx.compose.ui.graphics.layer.GraphicsLayerImpl r11 = r10.f101219a
            android.graphics.Matrix r11 = r11.D()
            r4.concat(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.v0(android.graphics.Canvas):void");
    }

    public final long w() {
        return this.f101240v;
    }

    public final Outline w0(Path path) {
        Outline outline;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 28 || path.t()) {
            Outline outlineK = K();
            if (i10 >= 30) {
                Q.f101277a.a(outlineK, path);
            } else {
                if (!(path instanceof androidx.compose.ui.graphics.Z)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outlineK.setConvexPath(((androidx.compose.ui.graphics.Z) path).f100925b);
            }
            this.f101233o = !outlineK.canClip();
            outline = outlineK;
        } else {
            Outline outline2 = this.f101225g;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.f101233o = true;
            this.f101219a.M(true);
            outline = null;
        }
        this.f101231m = path;
        return outline;
    }

    @Nullable
    public final Q2 x() {
        return this.f101219a.i();
    }

    public final float y() {
        return this.f101219a.z();
    }

    public final float z() {
        return this.f101219a.t();
    }
}
