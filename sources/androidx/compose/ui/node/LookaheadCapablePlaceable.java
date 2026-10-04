package androidx.compose.ui.node;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.ui.layout.AbstractC2155a;
import androidx.compose.ui.layout.InterfaceC2188x;
import androidx.compose.ui.layout.J0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.layout.v0;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.unit.LayoutDirection;
import java.lang.ref.WeakReference;
import java.util.Map;
import k0.C4813d;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadCapablePlaceable\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 10 ObjectFloatMap.kt\nandroidx/collection/ObjectFloatMap\n*L\n1#1,491:1\n418#2,3:492\n363#2,6:495\n373#2,3:502\n376#2,2:506\n422#2:508\n423#2:536\n379#2,6:537\n424#2:543\n363#2,6:545\n373#2,3:552\n376#2,2:556\n379#2,6:562\n418#2,3:580\n363#2,6:583\n373#2,3:590\n376#2,2:594\n422#2,2:596\n379#2,6:598\n424#2:604\n418#2,3:605\n363#2,6:608\n373#2,3:615\n376#2,2:619\n422#2,2:621\n379#2,6:623\n424#2:629\n1810#3:501\n1672#3:505\n1810#3:518\n1672#3:522\n1810#3:551\n1672#3:555\n1810#3:589\n1672#3:593\n1810#3:614\n1672#3:618\n1810#3:641\n1672#3:645\n1810#3:666\n1672#3:670\n1810#3:693\n1672#3:697\n842#4,2:509\n845#4,4:525\n849#4:535\n237#5,7:511\n248#5,3:519\n251#5,2:523\n254#5,6:529\n267#5,4:682\n237#5,7:686\n248#5,3:694\n251#5,2:698\n272#5,2:700\n254#5,6:702\n274#5:708\n1047#6:544\n1049#6,4:558\n1053#6:568\n863#6:569\n1#7:570\n1#7:630\n341#8:571\n342#8:577\n345#8:579\n42#9,5:572\n48#9:578\n401#10,4:631\n373#10,6:635\n383#10,3:642\n386#10,2:646\n406#10,2:648\n389#10,6:650\n408#10:656\n415#10,3:657\n373#10,6:660\n383#10,3:667\n386#10,2:671\n419#10,2:673\n389#10,6:675\n421#10:681\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadCapablePlaceable\n*L\n163#1:492,3\n163#1:495,6\n163#1:502,3\n163#1:506,2\n163#1:508\n163#1:536\n163#1:537,6\n163#1:543\n166#1:545,6\n166#1:552,3\n166#1:556,2\n166#1:562,6\n232#1:580,3\n232#1:583,6\n232#1:590,3\n232#1:594,2\n232#1:596,2\n232#1:598,6\n232#1:604\n247#1:605,3\n247#1:608,6\n247#1:615,3\n247#1:619,2\n247#1:621,2\n247#1:623,6\n247#1:629\n163#1:501\n163#1:505\n164#1:518\n164#1:522\n166#1:551\n166#1:555\n232#1:589\n232#1:593\n247#1:614\n247#1:618\n268#1:641\n268#1:645\n281#1:666\n281#1:670\n291#1:693\n291#1:697\n164#1:509,2\n164#1:525,4\n164#1:535\n164#1:511,7\n164#1:519,3\n164#1:523,2\n164#1:529,6\n291#1:682,4\n291#1:686,7\n291#1:694,3\n291#1:698,2\n291#1:700,2\n291#1:702,6\n291#1:708\n166#1:544\n166#1:558,4\n166#1:568\n171#1:569\n171#1:570\n211#1:571\n211#1:577\n211#1:579\n211#1:572,5\n211#1:578\n268#1:631,4\n268#1:635,6\n268#1:642,3\n268#1:646,2\n268#1:648,2\n268#1:650,6\n268#1:656\n281#1:657,3\n281#1:660,6\n281#1:667,3\n281#1:671,2\n281#1:673,2\n281#1:675,6\n281#1:681\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public abstract class LookaheadCapablePlaceable extends androidx.compose.ui.layout.v0 implements T, X {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f102870p = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public androidx.compose.ui.layout.B0 f102872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f102873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f102874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f102875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final v0.a f102876k = new androidx.compose.ui.layout.I(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public androidx.collection.E0<androidx.compose.ui.layout.A0> f102877l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public androidx.collection.E0<androidx.compose.ui.layout.A0> f102878m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public MutableScatterMap<androidx.compose.ui.layout.A0, MutableScatterSet<WeakReference<LayoutNode>>> f102879n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final a f102869o = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final ed.l<p0, L0> f102871q = new ed.l<p0, L0>() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1
        public final void e(@NotNull p0 p0Var) {
            if (p0Var.R0()) {
                p0Var.f103075b.p1(p0Var);
            }
        }

        @Override // ed.l
        public /* bridge */ /* synthetic */ L0 invoke(p0 p0Var) {
            e(p0Var);
            return L0.f217464a;
        }
    };

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public static final class b implements androidx.compose.ui.layout.T {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f102881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f102882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map<AbstractC2155a, Integer> f102883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ed.l<androidx.compose.ui.layout.B0, L0> f102884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ed.l<v0.a, L0> f102885e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ LookaheadCapablePlaceable f102886f;

        /* JADX WARN: Multi-variable type inference failed */
        public b(int i10, int i11, Map<AbstractC2155a, Integer> map, ed.l<? super androidx.compose.ui.layout.B0, L0> lVar, ed.l<? super v0.a, L0> lVar2, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
            this.f102881a = i10;
            this.f102882b = i11;
            this.f102883c = map;
            this.f102884d = lVar;
            this.f102885e = lVar2;
            this.f102886f = lookaheadCapablePlaceable;
        }

        @Override // androidx.compose.ui.layout.T
        @NotNull
        public Map<AbstractC2155a, Integer> E() {
            return this.f102883c;
        }

        @Override // androidx.compose.ui.layout.T
        @Nullable
        public ed.l<androidx.compose.ui.layout.B0, L0> F() {
            return this.f102884d;
        }

        @Override // androidx.compose.ui.layout.T
        public void G() {
            this.f102885e.invoke(this.f102886f.f102876k);
        }

        @Override // androidx.compose.ui.layout.T
        public int getHeight() {
            return this.f102882b;
        }

        @Override // androidx.compose.ui.layout.T
        public int getWidth() {
            return this.f102881a;
        }
    }

    public static final class c implements androidx.compose.ui.layout.B0 {
        public c() {
        }

        @Override // k0.InterfaceC4814e
        public /* synthetic */ P.j A0(k0.l lVar) {
            return C4813d.h(this, lVar);
        }

        @Override // k0.InterfaceC4814e
        public /* synthetic */ long C(long j10) {
            return C4813d.e(this, j10);
        }

        @Override // k0.InterfaceC4814e
        public long G(int i10) {
            return s(V(i10));
        }

        @Override // k0.InterfaceC4814e
        public long I(float f10) {
            return s(W(f10));
        }

        @Override // androidx.compose.ui.layout.B0
        public void I0(@NotNull androidx.compose.ui.layout.A0 a02, float f10) {
            LookaheadCapablePlaceable.this.Z1(a02, f10);
        }

        @Override // k0.InterfaceC4814e
        public /* synthetic */ int I1(float f10) {
            return C4813d.b(this, f10);
        }

        @Override // k0.InterfaceC4814e
        public /* synthetic */ float M1(long j10) {
            return C4813d.f(this, j10);
        }

        @Override // androidx.compose.ui.layout.B0
        @NotNull
        public InterfaceC2188x T() {
            LookaheadCapablePlaceable.this.n1().f102730B.S();
            return LookaheadCapablePlaceable.this.T();
        }

        @Override // k0.InterfaceC4814e
        public float V(int i10) {
            return i10 / a();
        }

        @Override // k0.InterfaceC4814e
        public float W(float f10) {
            return f10 / a();
        }

        @Override // k0.InterfaceC4814e
        public /* synthetic */ long Z(long j10) {
            return C4813d.i(this, j10);
        }

        @Override // k0.InterfaceC4814e
        public float a() {
            return LookaheadCapablePlaceable.this.a();
        }

        @Override // k0.p
        public /* synthetic */ float k(long j10) {
            return k0.o.a(this, j10);
        }

        @Override // k0.InterfaceC4814e
        public float l2(float f10) {
            return a() * f10;
        }

        @Override // k0.p
        public float m0() {
            return LookaheadCapablePlaceable.this.m0();
        }

        @Override // k0.InterfaceC4814e
        public int p2(long j10) {
            return Math.round(M1(j10));
        }

        @Override // k0.p
        public /* synthetic */ long s(float f10) {
            return k0.o.b(this, f10);
        }

        @Override // androidx.compose.ui.layout.B0
        public void x1(@NotNull K0 k02, float f10) {
            LookaheadCapablePlaceable.this.X1(k02, f10);
        }
    }

    public static /* synthetic */ void Q1() {
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ P.j A0(k0.l lVar) {
        return C4813d.h(this, lVar);
    }

    @Nullable
    public abstract LookaheadCapablePlaceable A1();

    @NotNull
    public final v0.a B1() {
        return this.f102876k;
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ long C(long j10) {
        return C4813d.e(this, j10);
    }

    @Override // androidx.compose.ui.layout.InterfaceC2185u
    public boolean D1() {
        return false;
    }

    @Override // androidx.compose.ui.node.X
    public void E0(boolean z10) {
        this.f102873h = z10;
    }

    public abstract long E1();

    @Override // androidx.compose.ui.layout.V
    @NotNull
    public androidx.compose.ui.layout.T F0(int i10, int i11, @NotNull Map<AbstractC2155a, Integer> map, @Nullable ed.l<? super androidx.compose.ui.layout.B0, L0> lVar, @NotNull ed.l<? super v0.a, L0> lVar2) {
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return new b(i10, i11, map, lVar, lVar2, this);
        }
        W.a.g("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @NotNull
    public final androidx.compose.ui.layout.B0 F1() {
        androidx.compose.ui.layout.B0 b02 = this.f102872g;
        return b02 == null ? new c() : b02;
    }

    @Override // k0.InterfaceC4814e
    public long G(int i10) {
        return s(V(i10));
    }

    @Override // androidx.compose.ui.layout.V
    public androidx.compose.ui.layout.T H1(int i10, int i11, Map map, ed.l lVar) {
        return F0(i10, i11, map, null, lVar);
    }

    @Override // k0.InterfaceC4814e
    public long I(float f10) {
        return s(W(f10));
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ int I1(float f10) {
        return C4813d.b(this, f10);
    }

    public final void L1(@NotNull NodeCoordinator nodeCoordinator) {
        AlignmentLines alignmentLinesE;
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.f102927u;
        if (!kotlin.jvm.internal.G.g(nodeCoordinator2 != null ? nodeCoordinator2.n1() : null, nodeCoordinator.n1())) {
            ((LayoutNodeLayoutDelegate.MeasurePassDelegate) nodeCoordinator.v1()).f102853v.q();
            return;
        }
        InterfaceC2191a interfaceC2191aN0 = ((LayoutNodeLayoutDelegate.MeasurePassDelegate) nodeCoordinator.v1()).n0();
        if (interfaceC2191aN0 == null || (alignmentLinesE = interfaceC2191aN0.E()) == null) {
            return;
        }
        alignmentLinesE.q();
    }

    @Override // androidx.compose.ui.layout.Y
    public final int M(@NotNull AbstractC2155a abstractC2155a) {
        int iO1;
        if (y1() && (iO1 = o1(abstractC2155a)) != Integer.MIN_VALUE) {
            return iO1 + ((int) (abstractC2155a instanceof J0 ? this.f102608e >> 32 : this.f102608e & ZipKt.f225990j));
        }
        return Integer.MIN_VALUE;
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ float M1(long j10) {
        return C4813d.f(this, j10);
    }

    public final void N1(androidx.compose.ui.layout.A0 a02) {
        MutableScatterMap<androidx.compose.ui.layout.A0, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap = t1(a02).f102879n;
        MutableScatterSet<WeakReference<LayoutNode>> mutableScatterSetL0 = mutableScatterMap != null ? mutableScatterMap.l0(a02) : null;
        if (mutableScatterSetL0 != null) {
            W1(mutableScatterSetL0);
        }
    }

    public final boolean P1(LayoutNode layoutNode, LayoutNode layoutNode2) {
        if (layoutNode == layoutNode2) {
            return true;
        }
        LayoutNode layoutNodeD0 = layoutNode.D0();
        if (layoutNodeD0 != null) {
            return P1(layoutNodeD0, layoutNode2);
        }
        return false;
    }

    public final boolean S1() {
        return this.f102875j;
    }

    @NotNull
    public abstract InterfaceC2188x T();

    @Override // k0.InterfaceC4814e
    public float V(int i10) {
        return i10 / a();
    }

    public final boolean V1() {
        return this.f102874i;
    }

    @Override // k0.InterfaceC4814e
    public float W(float f10) {
        return f10 / a();
    }

    public final void W1(MutableScatterSet<WeakReference<LayoutNode>> mutableScatterSet) {
        LayoutNode layoutNode;
        Object[] objArr = mutableScatterSet.f86877b;
        long[] jArr = mutableScatterSet.f86876a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128 && (layoutNode = (LayoutNode) ((WeakReference) objArr[(i10 << 3) + i12]).get()) != null) {
                        if (D1()) {
                            layoutNode.E1(false);
                        } else {
                            layoutNode.I1(false);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void X1(@NotNull androidx.compose.ui.layout.A0 a02, float f10) {
        androidx.collection.E0<androidx.compose.ui.layout.A0> e02 = this.f102877l;
        if (e02 == null) {
            e02 = new androidx.collection.E0<>(0, 1, null);
            this.f102877l = e02;
        }
        if (getLayoutDirection() != LayoutDirection.Ltr) {
            f10 = this.f102604a - f10;
        }
        e02.l0(a02, f10);
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ long Z(long j10) {
        return C4813d.i(this, j10);
    }

    public final void Z1(@NotNull androidx.compose.ui.layout.A0 a02, float f10) {
        androidx.collection.E0<androidx.compose.ui.layout.A0> e02 = this.f102877l;
        if (e02 == null) {
            e02 = new androidx.collection.E0<>(0, 1, null);
            this.f102877l = e02;
        }
        e02.l0(a02, f10);
    }

    public abstract void a2();

    public final void c2(boolean z10) {
        this.f102875j = z10;
    }

    public final void d2(boolean z10) {
        this.f102874i = z10;
    }

    @Override // k0.p
    public /* synthetic */ float k(long j10) {
        return k0.o.a(this, j10);
    }

    @Override // k0.InterfaceC4814e
    public float l2(float f10) {
        return a() * f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1(androidx.compose.ui.node.LayoutNode r32, androidx.compose.ui.layout.A0 r33) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadCapablePlaceable.m1(androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.A0):void");
    }

    @Override // androidx.compose.ui.node.T
    @NotNull
    public abstract LayoutNode n1();

    public abstract int o1(@NotNull AbstractC2155a abstractC2155a);

    /* JADX WARN: Removed duplicated region for block: B:63:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p1(final androidx.compose.ui.node.p0 r28) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadCapablePlaceable.p1(androidx.compose.ui.node.p0):void");
    }

    @Override // k0.InterfaceC4814e
    public int p2(long j10) {
        return Math.round(M1(j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q1(@org.jetbrains.annotations.Nullable androidx.compose.ui.layout.T r14) {
        /*
            r13 = this;
            if (r14 == 0) goto Lb
            androidx.compose.ui.node.p0 r0 = new androidx.compose.ui.node.p0
            r0.<init>(r14, r13)
            r13.p1(r0)
            return
        Lb:
            androidx.collection.MutableScatterMap<androidx.compose.ui.layout.A0, androidx.collection.MutableScatterSet<java.lang.ref.WeakReference<androidx.compose.ui.node.LayoutNode>>> r14 = r13.f102879n
            if (r14 == 0) goto L54
            java.lang.Object[] r0 = r14.f86839c
            long[] r14 = r14.f86837a
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L54
            r2 = 0
            r3 = r2
        L1a:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L4f
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L34:
            if (r8 >= r6) goto L4d
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L49
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            androidx.collection.MutableScatterSet r9 = (androidx.collection.MutableScatterSet) r9
            r13.W1(r9)
        L49:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L34
        L4d:
            if (r6 != r7) goto L54
        L4f:
            if (r3 == r1) goto L54
            int r3 = r3 + 1
            goto L1a
        L54:
            androidx.collection.MutableScatterMap<androidx.compose.ui.layout.A0, androidx.collection.MutableScatterSet<java.lang.ref.WeakReference<androidx.compose.ui.node.LayoutNode>>> r14 = r13.f102879n
            if (r14 == 0) goto L5b
            r14.K()
        L5b:
            androidx.collection.E0<androidx.compose.ui.layout.A0> r14 = r13.f102877l
            if (r14 == 0) goto L62
            r14.P()
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadCapablePlaceable.q1(androidx.compose.ui.layout.T):void");
    }

    @Override // k0.p
    public /* synthetic */ long s(float f10) {
        return k0.o.b(this, f10);
    }

    @Override // androidx.compose.ui.node.X
    public boolean s0() {
        return this.f102873h;
    }

    public final LookaheadCapablePlaceable t1(androidx.compose.ui.layout.A0 a02) {
        LookaheadCapablePlaceable lookaheadCapablePlaceableA1;
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            androidx.collection.E0<androidx.compose.ui.layout.A0> e02 = lookaheadCapablePlaceable.f102877l;
            if ((e02 != null && e02.d(a02)) || (lookaheadCapablePlaceableA1 = lookaheadCapablePlaceable.A1()) == null) {
                break;
            }
            lookaheadCapablePlaceable = lookaheadCapablePlaceableA1;
        }
        return lookaheadCapablePlaceable;
    }

    public final float u1(@NotNull androidx.compose.ui.layout.A0 a02, float f10) {
        if (this.f102875j) {
            return f10;
        }
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            androidx.collection.E0<androidx.compose.ui.layout.A0> e02 = lookaheadCapablePlaceable.f102877l;
            float fR = e02 != null ? e02.r(a02, Float.NaN) : Float.NaN;
            if (!Float.isNaN(fR)) {
                lookaheadCapablePlaceable.m1(n1(), a02);
                return a02.a(fR, lookaheadCapablePlaceable.T(), T());
            }
            LookaheadCapablePlaceable lookaheadCapablePlaceableA1 = lookaheadCapablePlaceable.A1();
            if (lookaheadCapablePlaceableA1 == null) {
                lookaheadCapablePlaceable.m1(n1(), a02);
                return f10;
            }
            lookaheadCapablePlaceable = lookaheadCapablePlaceableA1;
        }
    }

    @NotNull
    public abstract InterfaceC2191a v1();

    @Nullable
    public abstract LookaheadCapablePlaceable w1();

    public abstract boolean y1();

    @NotNull
    public abstract androidx.compose.ui.layout.T z1();
}
