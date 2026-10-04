package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.runtime.D;
import androidx.compose.runtime.InterfaceC1938p;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.InterfaceC2183s;
import androidx.compose.ui.layout.InterfaceC2185u;
import androidx.compose.ui.layout.InterfaceC2188x;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.v0;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.l0;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2287v0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.G1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.bumptech.glide.load.engine.GlideException;
import ed.InterfaceC4376a;
import java.util.Comparator;
import java.util.List;
import k0.C4811b;
import k0.InterfaceC4814e;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 9 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 10 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 11 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 12 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 13 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 14 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,1555:1\n1324#1,7:1562\n1324#1,7:1670\n1149#1,2:1687\n1151#1,2:1701\n202#1:1704\n1312#1,7:2069\n202#1:2244\n202#1:2256\n202#1:2268\n1324#1,7:2287\n1208#2:1556\n1187#2,2:1557\n1208#2:1559\n1187#2,2:1560\n1208#2:1569\n1187#2,2:1570\n1208#2:1759\n1187#2,2:1760\n1208#2:1833\n1187#2,2:1834\n1208#2:1907\n1187#2,2:1908\n1208#2:2030\n1187#2,2:2031\n1208#2:2112\n1187#2,2:2113\n1208#2:2197\n1187#2,2:2198\n48#3:1572\n48#3:1628\n48#3:1658\n48#3:1689\n460#4,7:1573\n146#4:1580\n467#4,4:1581\n460#4,11:1585\n476#4,11:1596\n460#4,11:1629\n460#4,11:1659\n460#4,11:1690\n146#4:1703\n460#4,11:1705\n460#4,11:2151\n460#4,11:2245\n460#4,11:2257\n460#4,11:2269\n42#5,7:1607\n42#5,7:1614\n96#5,7:1621\n42#5,7:1641\n42#5,7:1648\n66#5,9:1677\n66#5,9:1946\n96#5,7:1955\n96#5,7:1962\n42#5,7:1970\n96#5,7:2280\n82#6:1640\n82#6:1656\n94#6:1657\n82#6:1686\n84#6:1719\n80#6:1724\n84#6:1798\n107#6:1872\n94#6:1969\n96#6,3:1977\n100#6:1981\n96#6:1986\n98#6,3:1988\n92#6:1994\n92#6:2014\n78#6:2076\n78#6:2096\n90#6:2162\n80#6:2231\n78#6:2232\n78#6:2236\n78#6:2238\n80#6:2239\n1#7:1655\n720#8,3:1716\n723#8,3:1721\n697#8,8:1725\n720#8,3:1733\n705#8,2:1736\n698#8:1738\n699#8,11:1782\n723#8,3:1793\n710#8:1796\n700#8:1797\n697#8,8:1799\n720#8,3:1807\n705#8,2:1810\n698#8:1812\n699#8,11:1856\n723#8,3:1867\n710#8:1870\n700#8:1871\n697#8,8:1873\n720#8,3:1881\n705#8,2:1884\n698#8:1886\n699#8,11:1930\n723#8,3:1941\n710#8:1944\n700#8:1945\n720#8,3:1983\n723#8,3:1991\n697#8,8:1995\n720#8,3:2003\n705#8,2:2006\n698#8:2008\n699#8,11:2053\n723#8,3:2064\n710#8:2067\n700#8:2068\n697#8,8:2077\n720#8,3:2085\n705#8,2:2088\n698#8:2090\n699#8,11:2135\n723#8,3:2146\n710#8:2149\n700#8:2150\n720#8,3:2233\n723#8,3:2241\n249#9:1720\n249#9:1745\n249#9:1819\n249#9:1893\n249#9:1987\n249#9:2016\n249#9:2098\n249#9:2183\n249#9:2237\n249#9:2240\n432#10,6:1739\n442#10,2:1746\n444#10,8:1751\n452#10,9:1762\n461#10,8:1774\n432#10,6:1813\n442#10,2:1820\n444#10,8:1825\n452#10,9:1836\n461#10,8:1848\n432#10,6:1887\n442#10,2:1894\n444#10,8:1899\n452#10,9:1910\n461#10,8:1922\n432#10,5:2009\n437#10:2015\n442#10,2:2017\n444#10,8:2022\n452#10,9:2033\n461#10,8:2045\n432#10,5:2091\n437#10:2097\n442#10,2:2099\n444#10,8:2104\n452#10,9:2115\n461#10,8:2127\n432#10,6:2177\n442#10,2:2184\n444#10,8:2189\n452#10,9:2200\n461#10,8:2212\n245#11,3:1748\n248#11,3:1771\n245#11,3:1822\n248#11,3:1845\n245#11,3:1896\n248#11,3:1919\n245#11,3:2019\n248#11,3:2042\n245#11,3:2101\n248#11,3:2124\n245#11,3:2186\n248#11,3:2209\n53#12:1980\n58#13:1982\n115#14:2163\n104#14,13:2164\n117#14:2220\n109#14,10:2221\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n119#1:1562,7\n510#1:1670,7\n543#1:1687,2\n543#1:1701,2\n612#1:1704\n1192#1:2069,7\n1360#1:2244\n1382#1:2256\n1394#1:2268\n1440#1:2287,7\n133#1:1556\n133#1:1557,2\n558#1:1559\n558#1:1560,2\n145#1:1569\n145#1:1570,2\n727#1:1759\n727#1:1760,2\n740#1:1833\n740#1:1834,2\n752#1:1907\n752#1:1908,2\n1176#1:2030\n1176#1:2031,2\n1274#1:2112\n1274#1:2113,2\n1303#1:2197\n1303#1:2198,2\n149#1:1572\n375#1:1628\n500#1:1658\n544#1:1689\n149#1:1573,7\n151#1:1580\n149#1:1581,4\n202#1:1585,11\n204#1:1596,11\n375#1:1629,11\n500#1:1659,11\n544#1:1690,11\n574#1:1703\n612#1:1705,11\n1278#1:2151,11\n1360#1:2245,11\n1382#1:2257,11\n1394#1:2269,11\n289#1:1607,7\n294#1:1614,7\n335#1:1621,7\n454#1:1641,7\n457#1:1648,7\n526#1:1677,9\n884#1:1946,9\n914#1:1955,7\n917#1:1962,7\n1102#1:1970,7\n1409#1:2280,7\n428#1:1640\n479#1:1656\n492#1:1657\n539#1:1686\n706#1:1719\n727#1:1724\n740#1:1798\n752#1:1872\n931#1:1969\n1139#1:1977,3\n1139#1:1981\n1141#1:1986\n1141#1:1988,3\n1176#1:1994\n1177#1:2014\n1274#1:2076\n1275#1:2096\n1303#1:2162\n1333#1:2231\n1333#1:2232\n1335#1:2236\n1336#1:2238\n1340#1:2239\n705#1:1716,3\n705#1:1721,3\n727#1:1725,8\n727#1:1733,3\n727#1:1736,2\n727#1:1738\n727#1:1782,11\n727#1:1793,3\n727#1:1796\n727#1:1797\n740#1:1799,8\n740#1:1807,3\n740#1:1810,2\n740#1:1812\n740#1:1856,11\n740#1:1867,3\n740#1:1870\n740#1:1871\n752#1:1873,8\n752#1:1881,3\n752#1:1884,2\n752#1:1886\n752#1:1930,11\n752#1:1941,3\n752#1:1944\n752#1:1945\n1140#1:1983,3\n1140#1:1991,3\n1176#1:1995,8\n1176#1:2003,3\n1176#1:2006,2\n1176#1:2008\n1176#1:2053,11\n1176#1:2064,3\n1176#1:2067\n1176#1:2068\n1274#1:2077,8\n1274#1:2085,3\n1274#1:2088,2\n1274#1:2090\n1274#1:2135,11\n1274#1:2146,3\n1274#1:2149\n1274#1:2150\n1334#1:2233,3\n1334#1:2241,3\n706#1:1720\n727#1:1745\n740#1:1819\n752#1:1893\n1141#1:1987\n1176#1:2016\n1274#1:2098\n1303#1:2183\n1335#1:2237\n1340#1:2240\n727#1:1739,6\n727#1:1746,2\n727#1:1751,8\n727#1:1762,9\n727#1:1774,8\n740#1:1813,6\n740#1:1820,2\n740#1:1825,8\n740#1:1836,9\n740#1:1848,8\n752#1:1887,6\n752#1:1894,2\n752#1:1899,8\n752#1:1910,9\n752#1:1922,8\n1176#1:2009,5\n1176#1:2015\n1176#1:2017,2\n1176#1:2022,8\n1176#1:2033,9\n1176#1:2045,8\n1274#1:2091,5\n1274#1:2097\n1274#1:2099,2\n1274#1:2104,8\n1274#1:2115,9\n1274#1:2127,8\n1303#1:2177,6\n1303#1:2184,2\n1303#1:2189,8\n1303#1:2200,9\n1303#1:2212,8\n727#1:1748,3\n727#1:1771,3\n740#1:1822,3\n740#1:1845,3\n752#1:1896,3\n752#1:1919,3\n1176#1:2019,3\n1176#1:2042,3\n1274#1:2101,3\n1274#1:2124,3\n1303#1:2186,3\n1303#1:2209,3\n1139#1:1980\n1139#1:1982\n1303#1:2163\n1303#1:2164,13\n1303#1:2220\n1303#1:2221,10\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class LayoutNode implements InterfaceC1938p, androidx.compose.ui.layout.x0, m0, androidx.compose.ui.layout.D, ComposeUiNode, InterfaceC2218w, l0.b {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f102723M = 8;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f102725O = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final C2194b0 f102729A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final LayoutNodeLayoutDelegate f102730B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public LayoutNodeSubcompositionsState f102731C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public NodeCoordinator f102732D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f102733E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public androidx.compose.ui.p f102734F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public androidx.compose.ui.p f102735G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public ed.l<? super l0, L0> f102736H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public ed.l<? super l0, L0> f102737I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f102738J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f102739K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f102740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f102741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f102743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public LayoutNode f102744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f102745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Y<LayoutNode> f102746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public androidx.compose.runtime.collection.c<LayoutNode> f102747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f102748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public LayoutNode f102749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public l0 f102750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public AndroidViewHolder f102751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f102752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f102753n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public androidx.compose.ui.semantics.l f102754o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.collection.c<LayoutNode> f102755p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f102756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public androidx.compose.ui.layout.Q f102757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public C2219x f102758s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public InterfaceC4814e f102759t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public LayoutDirection f102760u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public G1 f102761v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public androidx.compose.runtime.D f102762w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public UsageByParent f102763x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public UsageByParent f102764y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f102765z;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public static final c f102722L = new c();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @NotNull
    public static final d f102724N = new b();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4376a<LayoutNode> f102726P = new InterfaceC4376a<LayoutNode>() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // ed.InterfaceC4376a
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final LayoutNode invoke() {
            return new LayoutNode(false, 0 == true ? 1 : 0, 3, null);
        }
    };

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @NotNull
    public static final G1 f102727Q = new a();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @NotNull
    public static final Comparator<LayoutNode> f102728R = new G();

    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    public static final class a implements G1 {
        @Override // androidx.compose.ui.platform.G1
        public long a() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.G1
        public /* synthetic */ float b() {
            return 2.0f;
        }

        @Override // androidx.compose.ui.platform.G1
        public float c() {
            return 16.0f;
        }

        @Override // androidx.compose.ui.platform.G1
        public /* synthetic */ float d() {
            return 16.0f;
        }

        @Override // androidx.compose.ui.platform.G1
        public long e() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.G1
        public long f() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.G1
        public long g() {
            k0.m.f214323b.getClass();
            return k0.m.f214324c;
        }

        @Override // androidx.compose.ui.platform.G1
        public /* synthetic */ float h() {
            return Float.MAX_VALUE;
        }
    }

    public static final class b extends d {
        public b() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // androidx.compose.ui.layout.Q
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.T a(androidx.compose.ui.layout.V v10, List list, long j10) {
            j(v10, list, j10);
            throw null;
        }

        @NotNull
        public Void j(@NotNull androidx.compose.ui.layout.V v10, @NotNull List<? extends androidx.compose.ui.layout.O> list, long j10) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    public static final class c {
        public c() {
        }

        public static /* synthetic */ void c() {
        }

        @NotNull
        public final InterfaceC4376a<LayoutNode> a() {
            return LayoutNode.f102726P;
        }

        @NotNull
        public final G1 b() {
            return LayoutNode.f102727Q;
        }

        @NotNull
        public final Comparator<LayoutNode> d() {
            return LayoutNode.f102728R;
        }

        public c(C4969v c4969v) {
        }
    }

    @androidx.compose.runtime.internal.r(parameters = 1)
    public static abstract class d implements androidx.compose.ui.layout.Q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f102770b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f102771a;

        public d(@NotNull String str) {
            this.f102771a = str;
        }

        @Override // androidx.compose.ui.layout.Q
        public /* bridge */ /* synthetic */ int b(InterfaceC2185u interfaceC2185u, List list, int i10) {
            h(interfaceC2185u, list, i10);
            throw null;
        }

        @Override // androidx.compose.ui.layout.Q
        public /* bridge */ /* synthetic */ int c(InterfaceC2185u interfaceC2185u, List list, int i10) {
            i(interfaceC2185u, list, i10);
            throw null;
        }

        @Override // androidx.compose.ui.layout.Q
        public /* bridge */ /* synthetic */ int d(InterfaceC2185u interfaceC2185u, List list, int i10) {
            f(interfaceC2185u, list, i10);
            throw null;
        }

        @Override // androidx.compose.ui.layout.Q
        public /* bridge */ /* synthetic */ int e(InterfaceC2185u interfaceC2185u, List list, int i10) {
            g(interfaceC2185u, list, i10);
            throw null;
        }

        @NotNull
        public Void f(@NotNull InterfaceC2185u interfaceC2185u, @NotNull List<? extends InterfaceC2183s> list, int i10) {
            throw new IllegalStateException(this.f102771a.toString());
        }

        @NotNull
        public Void g(@NotNull InterfaceC2185u interfaceC2185u, @NotNull List<? extends InterfaceC2183s> list, int i10) {
            throw new IllegalStateException(this.f102771a.toString());
        }

        @NotNull
        public Void h(@NotNull InterfaceC2185u interfaceC2185u, @NotNull List<? extends InterfaceC2183s> list, int i10) {
            throw new IllegalStateException(this.f102771a.toString());
        }

        @NotNull
        public Void i(@NotNull InterfaceC2185u interfaceC2185u, @NotNull List<? extends InterfaceC2183s> list, int i10) {
            throw new IllegalStateException(this.f102771a.toString());
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102772a;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f102772a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNode() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public static boolean A1(LayoutNode layoutNode, C4811b c4811b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4811b = layoutNode.f102730B.f102791r.B1();
        }
        return layoutNode.z1(c4811b);
    }

    public static /* synthetic */ String E(LayoutNode layoutNode, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return layoutNode.D(i10);
    }

    public static /* synthetic */ void F1(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.E1(z10);
    }

    private final float G0() {
        return this.f102730B.f102791r.f102828A;
    }

    public static /* synthetic */ void H1(LayoutNode layoutNode, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        layoutNode.G1(z10, z11, z12);
    }

    @InterfaceC4850b0
    public static /* synthetic */ void I0() {
    }

    public static /* synthetic */ void J1(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.I1(z10);
    }

    public static /* synthetic */ void L0(LayoutNode layoutNode, long j10, r rVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        layoutNode.K0(j10, rVar, z12, z11);
    }

    public static /* synthetic */ void L1(LayoutNode layoutNode, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        layoutNode.K1(z10, z11, z12);
    }

    public static /* synthetic */ void N0(LayoutNode layoutNode, long j10, r rVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        layoutNode.M0(j10, rVar, z10, z11);
    }

    @InterfaceC4982o(message = "Temporary API to support ConstraintLayout prototyping.")
    public static /* synthetic */ void Q() {
    }

    public static /* synthetic */ void Z0(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        layoutNode.Y0(z10);
    }

    @androidx.compose.ui.i
    public static /* synthetic */ void b0() {
    }

    public static /* synthetic */ boolean f1(LayoutNode layoutNode, C4811b c4811b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4811b = layoutNode.f102730B.z();
        }
        return layoutNode.e1(c4811b);
    }

    public static final int u(LayoutNode layoutNode, LayoutNode layoutNode2) {
        return layoutNode.G0() == layoutNode2.G0() ? kotlin.jvm.internal.G.t(layoutNode.E0(), layoutNode2.E0()) : Float.compare(layoutNode.G0(), layoutNode2.G0());
    }

    public final void A(@NotNull l0 l0Var) {
        LayoutNode layoutNode;
        int i10 = 0;
        if (this.f102750k != null) {
            W.a.g("Cannot attach " + this + " as it already is attached.  Tree: " + E(this, 0, 1, null));
            throw null;
        }
        LayoutNode layoutNode2 = this.f102749j;
        if (layoutNode2 != null && !kotlin.jvm.internal.G.g(layoutNode2.f102750k, l0Var)) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(l0Var);
            sb2.append(") than the parent's owner(");
            LayoutNode layoutNodeD0 = D0();
            sb2.append(layoutNodeD0 != null ? layoutNodeD0.f102750k : null);
            sb2.append("). This tree: ");
            sb2.append(E(this, 0, 1, null));
            sb2.append(" Parent tree: ");
            LayoutNode layoutNode3 = this.f102749j;
            sb2.append(layoutNode3 != null ? E(layoutNode3, 0, 1, null) : null);
            W.a.g(sb2.toString());
            throw null;
        }
        LayoutNode layoutNodeD02 = D0();
        if (layoutNodeD02 == null) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f102730B;
            layoutNodeLayoutDelegate.f102791r.f102851t = true;
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.f102792s;
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.f102809s = true;
            }
        }
        this.f102729A.f103037c.f102928v = layoutNodeD02 != null ? layoutNodeD02.f102729A.f103036b : null;
        this.f102750k = l0Var;
        this.f102752m = (layoutNodeD02 != null ? layoutNodeD02.f102752m : -1) + 1;
        androidx.compose.ui.p pVar = this.f102735G;
        if (pVar != null) {
            z(pVar);
        }
        this.f102735G = null;
        if (this.f102729A.t(8)) {
            X0();
        }
        l0Var.getClass();
        if (this.f102743d) {
            U1(this);
        } else {
            LayoutNode layoutNode4 = this.f102749j;
            if (layoutNode4 == null || (layoutNode = layoutNode4.f102744e) == null) {
                layoutNode = this.f102744e;
            }
            U1(layoutNode);
            if (this.f102744e == null && this.f102729A.t(512)) {
                U1(this);
            }
        }
        if (!this.f102739K) {
            this.f102729A.C();
        }
        androidx.compose.runtime.collection.c<LayoutNode> cVar = this.f102746g.f103026a;
        int i11 = cVar.f99566c;
        if (i11 > 0) {
            LayoutNode[] layoutNodeArr = cVar.f99564a;
            do {
                layoutNodeArr[i10].A(l0Var);
                i10++;
            } while (i10 < i11);
        }
        if (!this.f102739K) {
            this.f102729A.I();
        }
        U0();
        if (layoutNodeD02 != null) {
            layoutNodeD02.U0();
        }
        C2194b0 c2194b0 = this.f102729A;
        NodeCoordinator nodeCoordinator = c2194b0.f103036b.f102927u;
        for (NodeCoordinator nodeCoordinator2 = c2194b0.f103037c; !kotlin.jvm.internal.G.g(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f102927u) {
            nodeCoordinator2.q3();
        }
        ed.l<? super l0, L0> lVar = this.f102736H;
        if (lVar != null) {
            lVar.invoke(l0Var);
        }
        this.f102730B.c0();
        if (this.f102739K) {
            return;
        }
        Q0();
    }

    public final C2219x A0() {
        C2219x c2219x = this.f102758s;
        if (c2219x != null) {
            return c2219x;
        }
        C2219x c2219x2 = new C2219x(this, this.f102757r);
        this.f102758s = c2219x2;
        return c2219x2;
    }

    public final void B() {
        this.f102764y = this.f102763x;
        this.f102763x = UsageByParent.NotUsed;
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ0 = J0();
        int i10 = cVarJ0.f99566c;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = cVarJ0.f99564a;
            int i11 = 0;
            do {
                LayoutNode layoutNode = layoutNodeArr[i11];
                if (layoutNode.f102763x != UsageByParent.NotUsed) {
                    layoutNode.B();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    @NotNull
    public final NodeCoordinator B0() {
        return this.f102729A.f103037c;
    }

    public final void B1() {
        int i10 = this.f102746g.f103026a.f99566c;
        while (true) {
            i10--;
            if (-1 >= i10) {
                this.f102746g.c();
                return;
            }
            u1(this.f102746g.e(i10));
        }
    }

    public final void C() {
        this.f102764y = this.f102763x;
        this.f102763x = UsageByParent.NotUsed;
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ0 = J0();
        int i10 = cVarJ0.f99566c;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = cVarJ0.f99564a;
            int i11 = 0;
            do {
                LayoutNode layoutNode = layoutNodeArr[i11];
                if (layoutNode.f102763x == UsageByParent.InLayoutBlock) {
                    layoutNode.C();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    @Nullable
    public final l0 C0() {
        return this.f102750k;
    }

    public final void C1(int i10, int i11) {
        if (!(i11 >= 0)) {
            W.a.f("count (" + i11 + ") must be greater than 0");
            throw null;
        }
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            u1(this.f102746g.e(i12));
            this.f102746g.i(i12);
            if (i12 == i10) {
                return;
            } else {
                i12--;
            }
        }
    }

    public final String D(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(GlideException.a.f139488d);
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ0 = J0();
        int i12 = cVarJ0.f99566c;
        if (i12 > 0) {
            LayoutNode[] layoutNodeArr = cVarJ0.f99564a;
            int i13 = 0;
            do {
                sb2.append(layoutNodeArr[i13].D(i10 + 1));
                i13++;
            } while (i13 < i12);
        }
        String string = sb2.toString();
        if (i10 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        kotlin.jvm.internal.G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Nullable
    public final LayoutNode D0() {
        LayoutNode layoutNode = this.f102749j;
        while (layoutNode != null && layoutNode.f102740a) {
            layoutNode = layoutNode.f102749j;
        }
        return layoutNode;
    }

    public final void D1() {
        if (this.f102763x == UsageByParent.NotUsed) {
            C();
        }
        this.f102730B.f102791r.u2();
    }

    public final int E0() {
        return this.f102730B.f102791r.f102840i;
    }

    public final void E1(boolean z10) {
        l0 l0Var;
        if (this.f102740a || (l0Var = this.f102750k) == null) {
            return;
        }
        l0Var.H(this, true, z10);
    }

    public final void F() {
        l0 l0Var = this.f102750k;
        if (l0Var == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode layoutNodeD0 = D0();
            sb2.append(layoutNodeD0 != null ? E(layoutNodeD0, 0, 1, null) : null);
            W.a.h(sb2.toString());
            throw null;
        }
        LayoutNode layoutNodeD02 = D0();
        if (layoutNodeD02 != null) {
            layoutNodeD02.S0();
            layoutNodeD02.U0();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f102730B;
            LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate.f102791r;
            UsageByParent usageByParent = UsageByParent.NotUsed;
            measurePassDelegate.f102843l = usageByParent;
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.f102792s;
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.f102800j = usageByParent;
            }
        }
        this.f102730B.V();
        ed.l<? super l0, L0> lVar = this.f102737I;
        if (lVar != null) {
            lVar.invoke(l0Var);
        }
        if (this.f102729A.t(8)) {
            X0();
        }
        this.f102729A.J();
        this.f102753n = true;
        androidx.compose.runtime.collection.c<LayoutNode> cVar = this.f102746g.f103026a;
        int i10 = cVar.f99566c;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = cVar.f99564a;
            int i11 = 0;
            do {
                layoutNodeArr[i11].F();
                i11++;
            } while (i11 < i10);
        }
        this.f102753n = false;
        this.f102729A.D();
        l0Var.a0(this);
        this.f102750k = null;
        U1(null);
        this.f102752m = 0;
        this.f102730B.f102791r.f2();
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate2 = this.f102730B.f102792s;
        if (lookaheadPassDelegate2 != null) {
            lookaheadPassDelegate2.c2();
        }
    }

    @Nullable
    public final LayoutNodeSubcompositionsState F0() {
        return this.f102731C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final void G() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f102730B;
        if (layoutNodeLayoutDelegate.f102776c != LayoutState.Idle || layoutNodeLayoutDelegate.f102778e || layoutNodeLayoutDelegate.f102777d || this.f102739K || !U()) {
            return;
        }
        p.d dVar = this.f102729A.f103039e;
        if ((dVar.f103118d & 256) != 0) {
            while (dVar != null) {
                if ((dVar.f103117c & 256) != 0) {
                    p.d dVarL = dVar;
                    androidx.compose.runtime.collection.c cVar = null;
                    while (dVarL != 0) {
                        if (dVarL instanceof InterfaceC2213q) {
                            InterfaceC2213q interfaceC2213q = (InterfaceC2213q) dVarL;
                            interfaceC2213q.n0(C2204h.m(interfaceC2213q, 256));
                        } else if ((dVarL.f103117c & 256) != 0 && (dVarL instanceof AbstractC2206j)) {
                            p.d dVar2 = ((AbstractC2206j) dVarL).f103066p;
                            int i10 = 0;
                            dVarL = dVarL;
                            while (dVar2 != null) {
                                if ((dVar2.f103117c & 256) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        dVarL = dVar2;
                                    } else {
                                        if (cVar == null) {
                                            cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                        }
                                        if (dVarL != 0) {
                                            cVar.b(dVarL);
                                            dVarL = 0;
                                        }
                                        cVar.b(dVar2);
                                    }
                                }
                                dVar2 = dVar2.f103120f;
                                dVarL = dVarL;
                            }
                            if (i10 == 1) {
                            }
                        }
                        dVarL = C2204h.l(cVar);
                    }
                }
                if ((dVar.f103118d & 256) == 0) {
                    return;
                } else {
                    dVar = dVar.f103120f;
                }
            }
        }
    }

    public final void G1(boolean z10, boolean z11, boolean z12) {
        if (this.f102744e == null) {
            W.a.g("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
            throw null;
        }
        l0 l0Var = this.f102750k;
        if (l0Var == null || this.f102753n || this.f102740a) {
            return;
        }
        l0Var.B(this, true, z10, z11);
        if (z12) {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.f102730B.f102792s;
            kotlin.jvm.internal.G.m(lookaheadPassDelegate);
            lookaheadPassDelegate.Q1(z10);
        }
    }

    @Override // androidx.compose.ui.layout.D
    public boolean H() {
        return this.f102750k != null;
    }

    @NotNull
    public final androidx.compose.runtime.collection.c<LayoutNode> H0() {
        if (this.f102756q) {
            this.f102755p.q();
            androidx.compose.runtime.collection.c<LayoutNode> cVar = this.f102755p;
            cVar.c(cVar.f99566c, J0());
            this.f102755p.t0(f102728R);
            this.f102756q = false;
        }
        return this.f102755p;
    }

    public final void I(@NotNull androidx.compose.ui.graphics.C0 c02, @Nullable GraphicsLayer graphicsLayer) {
        this.f102729A.f103037c.G2(c02, graphicsLayer);
    }

    public final void I1(boolean z10) {
        l0 l0Var;
        if (this.f102740a || (l0Var = this.f102750k) == null) {
            return;
        }
        k0.i(l0Var, this, false, z10, 2, null);
    }

    public final void J(@NotNull ed.l<? super LayoutNode, L0> lVar) {
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ0 = J0();
        int i10 = cVarJ0.f99566c;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = cVarJ0.f99564a;
            int i11 = 0;
            do {
                lVar.invoke(layoutNodeArr[i11]);
                i11++;
            } while (i11 < i10);
        }
    }

    @NotNull
    public final androidx.compose.runtime.collection.c<LayoutNode> J0() {
        c2();
        if (this.f102745f == 0) {
            return this.f102746g.f103026a;
        }
        androidx.compose.runtime.collection.c<LayoutNode> cVar = this.f102747h;
        kotlin.jvm.internal.G.m(cVar);
        return cVar;
    }

    public final void K(@NotNull ed.p<? super Integer, ? super LayoutNode, L0> pVar) {
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ0 = J0();
        int i10 = cVarJ0.f99566c;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = cVarJ0.f99564a;
            int i11 = 0;
            do {
                pVar.invoke(Integer.valueOf(i11), layoutNodeArr[i11]);
                i11++;
            } while (i11 < i10);
        }
    }

    public final void K0(long j10, @NotNull r rVar, boolean z10, boolean z11) {
        long jM2 = NodeCoordinator.M2(this.f102729A.f103037c, j10, false, 2, null);
        NodeCoordinator nodeCoordinator = this.f102729A.f103037c;
        NodeCoordinator.f102900N.getClass();
        nodeCoordinator.i3(NodeCoordinator.f102909W, jM2, rVar, z10, z11);
    }

    public final void K1(boolean z10, boolean z11, boolean z12) {
        l0 l0Var;
        if (this.f102753n || this.f102740a || (l0Var = this.f102750k) == null) {
            return;
        }
        k0.h(l0Var, this, false, z10, z11, 2, null);
        if (z12) {
            this.f102730B.f102791r.Q1(z10);
        }
    }

    public final void L(@NotNull ed.l<? super D, L0> lVar) {
        C2194b0 c2194b0 = this.f102729A;
        NodeCoordinator nodeCoordinator = c2194b0.f103037c;
        C2215t c2215t = c2194b0.f103036b;
        while (nodeCoordinator != c2215t) {
            kotlin.jvm.internal.G.n(nodeCoordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            D d10 = (D) nodeCoordinator;
            lVar.invoke(d10);
            nodeCoordinator = d10.f102927u;
        }
    }

    public final void M(@NotNull ed.l<? super NodeCoordinator, L0> lVar) {
        C2194b0 c2194b0 = this.f102729A;
        NodeCoordinator nodeCoordinator = c2194b0.f103036b.f102927u;
        for (NodeCoordinator nodeCoordinator2 = c2194b0.f103037c; !kotlin.jvm.internal.G.g(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f102927u) {
            lVar.invoke(nodeCoordinator2);
        }
    }

    public final void M0(long j10, @NotNull r rVar, boolean z10, boolean z11) {
        long jM2 = NodeCoordinator.M2(this.f102729A.f103037c, j10, false, 2, null);
        NodeCoordinator nodeCoordinator = this.f102729A.f103037c;
        NodeCoordinator.f102900N.getClass();
        nodeCoordinator.i3(NodeCoordinator.f102910X, jM2, rVar, true, z11);
    }

    public final void M1(@NotNull LayoutNode layoutNode) {
        if (e.f102772a[layoutNode.f102730B.f102776c.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + layoutNode.f102730B.f102776c);
        }
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.f102730B;
        if (layoutNodeLayoutDelegate.f102780g) {
            H1(layoutNode, true, false, false, 6, null);
            return;
        }
        if (layoutNodeLayoutDelegate.f102781h) {
            layoutNode.E1(true);
        }
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode.f102730B;
        if (layoutNodeLayoutDelegate2.f102777d) {
            L1(layoutNode, true, false, false, 6, null);
        } else if (layoutNodeLayoutDelegate2.f102778e) {
            layoutNode.I1(true);
        }
    }

    public final boolean N() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate;
        AlignmentLines alignmentLines;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f102730B;
        return layoutNodeLayoutDelegate.f102791r.f102853v.l() || !((lookaheadPassDelegate = layoutNodeLayoutDelegate.f102792s) == null || (alignmentLines = lookaheadPassDelegate.f102810t) == null || !alignmentLines.l());
    }

    public final void N1() {
        this.f102729A.H();
    }

    public final boolean O() {
        return this.f102735G != null;
    }

    public final void O0(@NotNull InterfaceC4376a<L0> interfaceC4376a) {
        this.f102753n = true;
        interfaceC4376a.invoke();
        this.f102753n = false;
    }

    public final void O1() {
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ0 = J0();
        int i10 = cVarJ0.f99566c;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = cVarJ0.f99564a;
            int i11 = 0;
            do {
                LayoutNode layoutNode = layoutNodeArr[i11];
                UsageByParent usageByParent = layoutNode.f102764y;
                layoutNode.f102763x = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.O1();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final boolean P() {
        return this.f102765z;
    }

    public final void P0(int i10, @NotNull LayoutNode layoutNode) {
        if (!(layoutNode.f102749j == null)) {
            StringBuilder sb2 = new StringBuilder("Cannot insert ");
            sb2.append(layoutNode);
            sb2.append(" because it already has a parent. This tree: ");
            sb2.append(E(this, 0, 1, null));
            sb2.append(" Other tree: ");
            LayoutNode layoutNode2 = layoutNode.f102749j;
            sb2.append(layoutNode2 != null ? E(layoutNode2, 0, 1, null) : null);
            W.a.g(sb2.toString());
            throw null;
        }
        if (!(layoutNode.f102750k == null)) {
            W.a.g("Cannot insert " + layoutNode + " because it already has an owner. This tree: " + E(this, 0, 1, null) + " Other tree: " + E(layoutNode, 0, 1, null));
            throw null;
        }
        layoutNode.f102749j = this;
        this.f102746g.a(i10, layoutNode);
        w1();
        if (layoutNode.f102740a) {
            this.f102745f++;
        }
        a1();
        l0 l0Var = this.f102750k;
        if (l0Var != null) {
            layoutNode.A(l0Var);
        }
        if (layoutNode.f102730B.f102787n > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f102730B;
            layoutNodeLayoutDelegate.W(layoutNodeLayoutDelegate.f102787n + 1);
        }
    }

    public final void P1(boolean z10) {
        this.f102765z = z10;
    }

    public final void Q0() {
        if (this.f102729A.s(7168)) {
            for (p.d dVar = this.f102729A.f103039e; dVar != null; dVar = dVar.f103120f) {
                int i10 = dVar.f103117c;
                if (((i10 & 1024) != 0) | ((i10 & 2048) != 0) | ((i10 & 4096) != 0)) {
                    C2200e0.a(dVar);
                }
            }
        }
    }

    public final void Q1(int i10) {
        this.f102752m = i10;
    }

    @NotNull
    public final List<androidx.compose.ui.layout.O> R() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.f102730B.f102792s;
        kotlin.jvm.internal.G.m(lookaheadPassDelegate);
        return lookaheadPassDelegate.t1();
    }

    @Override // androidx.compose.ui.node.m0
    public boolean R0() {
        return H();
    }

    public final void R1(boolean z10) {
        this.f102733E = z10;
    }

    @NotNull
    public final List<androidx.compose.ui.layout.O> S() {
        return this.f102730B.f102791r.y1();
    }

    public final void S0() {
        NodeCoordinator nodeCoordinatorG0 = g0();
        if (nodeCoordinatorG0 != null) {
            nodeCoordinatorG0.k3();
            return;
        }
        LayoutNode layoutNodeD0 = D0();
        if (layoutNodeD0 != null) {
            layoutNodeD0.S0();
        }
    }

    public final void S1(@Nullable AndroidViewHolder androidViewHolder) {
        this.f102751l = androidViewHolder;
    }

    @Override // androidx.compose.ui.layout.D
    @NotNull
    public InterfaceC2188x T() {
        return this.f102729A.f103036b;
    }

    public final void T0() {
        C2194b0 c2194b0 = this.f102729A;
        NodeCoordinator nodeCoordinator = c2194b0.f103037c;
        C2215t c2215t = c2194b0.f103036b;
        while (nodeCoordinator != c2215t) {
            kotlin.jvm.internal.G.n(nodeCoordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            D d10 = (D) nodeCoordinator;
            j0 j0Var = d10.f102922L;
            if (j0Var != null) {
                j0Var.invalidate();
            }
            nodeCoordinator = d10.f102927u;
        }
        j0 j0Var2 = this.f102729A.f103036b.f102922L;
        if (j0Var2 != null) {
            j0Var2.invalidate();
        }
    }

    public final void T1(@NotNull UsageByParent usageByParent) {
        this.f102763x = usageByParent;
    }

    @Override // androidx.compose.ui.layout.D
    public boolean U() {
        return this.f102730B.f102791r.f102851t;
    }

    public final void U0() {
        if (this.f102744e != null) {
            H1(this, false, false, false, 7, null);
        } else {
            L1(this, false, false, false, 7, null);
        }
    }

    public final void U1(LayoutNode layoutNode) {
        if (kotlin.jvm.internal.G.g(layoutNode, this.f102744e)) {
            return;
        }
        this.f102744e = layoutNode;
        if (layoutNode != null) {
            this.f102730B.q();
            C2194b0 c2194b0 = this.f102729A;
            NodeCoordinator nodeCoordinator = c2194b0.f103036b.f102927u;
            for (NodeCoordinator nodeCoordinator2 = c2194b0.f103037c; !kotlin.jvm.internal.G.g(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f102927u) {
                nodeCoordinator2.J2();
            }
        }
        U0();
    }

    @Override // androidx.compose.ui.layout.D
    public int V() {
        return this.f102741b;
    }

    public final void V0() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f102730B;
        if (layoutNodeLayoutDelegate.f102778e || layoutNodeLayoutDelegate.f102777d || this.f102738J) {
            return;
        }
        K.c(this).p(this);
    }

    public final void V1(boolean z10) {
        this.f102738J = z10;
    }

    @Override // androidx.compose.ui.layout.D
    @Nullable
    public androidx.compose.ui.layout.D W() {
        return D0();
    }

    public final void W0() {
        this.f102730B.M();
    }

    public final void W1(@Nullable ed.l<? super l0, L0> lVar) {
        this.f102736H = lVar;
    }

    @Override // androidx.compose.ui.layout.D
    @NotNull
    public List<androidx.compose.ui.layout.Z> X() {
        return this.f102729A.p();
    }

    public final void X0() {
        this.f102754o = null;
        K.c(this).h0();
    }

    public final void X1(@Nullable ed.l<? super l0, L0> lVar) {
        this.f102737I = lVar;
    }

    @Override // androidx.compose.ui.layout.D
    public boolean Y() {
        return this.f102739K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    public final void Y0(boolean z10) {
        LayoutNode layoutNodeD0;
        if (z10 && (layoutNodeD0 = D0()) != null) {
            layoutNodeD0.S0();
        }
        X0();
        L1(this, false, false, false, 7, null);
        p.d dVar = this.f102729A.f103039e;
        if ((dVar.f103118d & 2) != 0) {
            while (dVar != null) {
                if ((dVar.f103117c & 2) != 0) {
                    p.d dVarL = dVar;
                    androidx.compose.runtime.collection.c cVar = null;
                    while (dVarL != 0) {
                        if (dVarL instanceof C) {
                            j0 j0Var = C2204h.m((C) dVarL, 2).f102922L;
                            if (j0Var != null) {
                                j0Var.invalidate();
                            }
                        } else if ((dVarL.f103117c & 2) != 0 && (dVarL instanceof AbstractC2206j)) {
                            p.d dVar2 = ((AbstractC2206j) dVarL).f103066p;
                            int i10 = 0;
                            dVarL = dVarL;
                            while (dVar2 != null) {
                                if ((dVar2.f103117c & 2) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        dVarL = dVar2;
                                    } else {
                                        if (cVar == null) {
                                            cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                        }
                                        if (dVarL != 0) {
                                            cVar.b(dVarL);
                                            dVarL = 0;
                                        }
                                        cVar.b(dVar2);
                                    }
                                }
                                dVar2 = dVar2.f103120f;
                                dVarL = dVarL;
                            }
                            if (i10 == 1) {
                            }
                        }
                        dVarL = C2204h.l(cVar);
                    }
                }
                if ((dVar.f103118d & 2) == 0) {
                    break;
                } else {
                    dVar = dVar.f103120f;
                }
            }
        }
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ0 = J0();
        int i11 = cVarJ0.f99566c;
        if (i11 > 0) {
            LayoutNode[] layoutNodeArr = cVarJ0.f99564a;
            int i12 = 0;
            do {
                layoutNodeArr[i12].Y0(false);
                i12++;
            } while (i12 < i11);
        }
    }

    public void Y1(int i10) {
        this.f102741b = i10;
    }

    @NotNull
    public final List<LayoutNode> Z() {
        return J0().o();
    }

    public final void Z1(@Nullable LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.f102731C = layoutNodeSubcompositionsState;
    }

    @Override // androidx.compose.ui.layout.D, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public InterfaceC4814e a() {
        return this.f102759t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.semantics.l] */
    @Nullable
    public final androidx.compose.ui.semantics.l a0() {
        if (!H() || this.f102739K) {
            return null;
        }
        if (!this.f102729A.t(8) || this.f102754o != null) {
            return this.f102754o;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f217904a = new androidx.compose.ui.semantics.l();
        K.c(this).v().j(this, new InterfaceC4376a<L0>() { // from class: androidx.compose.ui.node.LayoutNode$collapsedSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            public /* bridge */ /* synthetic */ L0 invoke() {
                invoke2();
                return L0.f217464a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v6 */
            /* JADX WARN: Type inference failed for: r5v7, types: [T, androidx.compose.ui.semantics.l] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C2194b0 c2194b0 = this.f102768d.f102729A;
                Ref.ObjectRef<androidx.compose.ui.semantics.l> objectRef2 = objectRef;
                if ((c2194b0.f103039e.f103118d & 8) != 0) {
                    for (p.d dVar = c2194b0.f103038d; dVar != null; dVar = dVar.f103119e) {
                        if ((dVar.f103117c & 8) != 0) {
                            p.d dVarL = dVar;
                            androidx.compose.runtime.collection.c cVar = null;
                            while (dVarL != 0) {
                                if (dVarL instanceof x0) {
                                    x0 x0Var = (x0) dVarL;
                                    if (x0Var.B1()) {
                                        ?? lVar = new androidx.compose.ui.semantics.l();
                                        objectRef2.f217904a = lVar;
                                        lVar.f104174c = true;
                                    }
                                    if (x0Var.q1()) {
                                        objectRef2.f217904a.f104173b = true;
                                    }
                                    x0Var.o0(objectRef2.f217904a);
                                } else if ((dVarL.f103117c & 8) != 0 && (dVarL instanceof AbstractC2206j)) {
                                    p.d dVar2 = ((AbstractC2206j) dVarL).f103066p;
                                    int i10 = 0;
                                    dVarL = dVarL;
                                    while (dVar2 != null) {
                                        if ((dVar2.f103117c & 8) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                dVarL = dVar2;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                                }
                                                if (dVarL != 0) {
                                                    cVar.b(dVarL);
                                                    dVarL = 0;
                                                }
                                                cVar.b(dVar2);
                                            }
                                        }
                                        dVar2 = dVar2.f103120f;
                                        dVarL = dVarL;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                dVarL = C2204h.l(cVar);
                            }
                        }
                    }
                }
            }
        });
        androidx.compose.ui.semantics.l lVar = (androidx.compose.ui.semantics.l) objectRef.f217904a;
        this.f102754o = lVar;
        return lVar;
    }

    public final void a1() {
        LayoutNode layoutNode;
        if (this.f102745f > 0) {
            this.f102748i = true;
        }
        if (!this.f102740a || (layoutNode = this.f102749j) == null) {
            return;
        }
        layoutNode.a1();
    }

    public final void a2(boolean z10) {
        this.f102743d = z10;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public androidx.compose.ui.p b() {
        return this.f102734F;
    }

    public final boolean b1() {
        return this.f102730B.f102791r.f102852u;
    }

    public final boolean b2() {
        if (this.f102729A.t(4) && !this.f102729A.t(2)) {
            return true;
        }
        for (p.d dVar = this.f102729A.f103039e; dVar != null; dVar = dVar.f103120f) {
            if ((dVar.f103117c & 2) != 0 && C2204h.m(dVar, 2).f102922L != null) {
                return false;
            }
            if ((dVar.f103117c & 4) != 0) {
                return true;
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.layout.D, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public G1 c() {
        return this.f102761v;
    }

    public final int c0() {
        return this.f102752m;
    }

    @Nullable
    public final Boolean c1() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.f102730B.f102792s;
        if (lookaheadPassDelegate != null) {
            return Boolean.valueOf(lookaheadPassDelegate.f102809s);
        }
        return null;
    }

    public final void c2() {
        if (this.f102745f > 0) {
            y1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void d(@NotNull LayoutDirection layoutDirection) {
        if (this.f102760u != layoutDirection) {
            this.f102760u = layoutDirection;
            v1();
            p.d dVar = this.f102729A.f103039e;
            if ((dVar.f103118d & 4) != 0) {
                while (dVar != null) {
                    if ((dVar.f103117c & 4) != 0) {
                        p.d dVarL = dVar;
                        androidx.compose.runtime.collection.c cVar = null;
                        while (dVarL != 0) {
                            if (dVarL instanceof InterfaceC2211o) {
                                InterfaceC2211o interfaceC2211o = (InterfaceC2211o) dVarL;
                                if (interfaceC2211o instanceof androidx.compose.ui.draw.d) {
                                    ((androidx.compose.ui.draw.d) interfaceC2211o).V1();
                                }
                            } else if ((dVarL.f103117c & 4) != 0 && (dVarL instanceof AbstractC2206j)) {
                                p.d dVar2 = ((AbstractC2206j) dVarL).f103066p;
                                int i10 = 0;
                                dVarL = dVarL;
                                while (dVar2 != null) {
                                    if ((dVar2.f103117c & 4) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            dVarL = dVar2;
                                        } else {
                                            if (cVar == null) {
                                                cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                            }
                                            if (dVarL != 0) {
                                                cVar.b(dVarL);
                                                dVarL = 0;
                                            }
                                            cVar.b(dVar2);
                                        }
                                    }
                                    dVar2 = dVar2.f103120f;
                                    dVarL = dVarL;
                                }
                                if (i10 == 1) {
                                }
                            }
                            dVarL = C2204h.l(cVar);
                        }
                    }
                    if ((dVar.f103118d & 4) == 0) {
                        return;
                    } else {
                        dVar = dVar.f103120f;
                    }
                }
            }
        }
    }

    @NotNull
    public final List<LayoutNode> d0() {
        return this.f102746g.f103026a.o();
    }

    public final boolean d1() {
        return this.f102743d;
    }

    @Override // androidx.compose.runtime.InterfaceC1938p
    public void e() {
        AndroidViewHolder androidViewHolder = this.f102751l;
        if (androidViewHolder != null) {
            androidViewHolder.e();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f102731C;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.x();
        }
        C2194b0 c2194b0 = this.f102729A;
        NodeCoordinator nodeCoordinator = c2194b0.f103036b.f102927u;
        for (NodeCoordinator nodeCoordinator2 = c2194b0.f103037c; !kotlin.jvm.internal.G.g(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f102927u) {
            nodeCoordinator2.u3();
        }
    }

    public final boolean e0() {
        long j10 = this.f102729A.f103036b.f102607d;
        return C4811b.m(j10) && C4811b.k(j10);
    }

    public final boolean e1(@Nullable C4811b c4811b) {
        if (c4811b == null || this.f102744e == null) {
            return false;
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.f102730B.f102792s;
        kotlin.jvm.internal.G.m(lookaheadPassDelegate);
        return lookaheadPassDelegate.f2(c4811b.f214284a);
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void f(@NotNull InterfaceC4814e interfaceC4814e) {
        if (kotlin.jvm.internal.G.g(this.f102759t, interfaceC4814e)) {
            return;
        }
        this.f102759t = interfaceC4814e;
        v1();
        for (p.d dVar = this.f102729A.f103039e; dVar != null; dVar = dVar.f103120f) {
            if ((dVar.f103117c & 16) != 0) {
                ((r0) dVar).i2();
            } else if (dVar instanceof androidx.compose.ui.draw.d) {
                ((androidx.compose.ui.draw.d) dVar).V1();
            }
        }
    }

    @NotNull
    public final NodeCoordinator f0() {
        return this.f102729A.f103036b;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @androidx.compose.ui.i
    public void g(int i10) {
        this.f102742c = i10;
    }

    public final NodeCoordinator g0() {
        if (this.f102733E) {
            C2194b0 c2194b0 = this.f102729A;
            NodeCoordinator nodeCoordinator = c2194b0.f103036b;
            NodeCoordinator nodeCoordinator2 = c2194b0.f103037c.f102928v;
            this.f102732D = null;
            while (true) {
                if (kotlin.jvm.internal.G.g(nodeCoordinator, nodeCoordinator2)) {
                    break;
                }
                if ((nodeCoordinator != null ? nodeCoordinator.f102922L : null) != null) {
                    this.f102732D = nodeCoordinator;
                    break;
                }
                nodeCoordinator = nodeCoordinator != null ? nodeCoordinator.f102928v : null;
            }
        }
        NodeCoordinator nodeCoordinator3 = this.f102732D;
        if (nodeCoordinator3 == null || nodeCoordinator3.f102922L != null) {
            return nodeCoordinator3;
        }
        W.a.h("layer was not set");
        throw null;
    }

    public final void g1() {
        if (this.f102763x == UsageByParent.NotUsed) {
            C();
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.f102730B.f102792s;
        kotlin.jvm.internal.G.m(lookaheadPassDelegate);
        lookaheadPassDelegate.g2();
    }

    @Override // androidx.compose.ui.layout.D
    public int getHeight() {
        return this.f102730B.f102791r.f102605b;
    }

    @Override // androidx.compose.ui.layout.D, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.f102760u;
    }

    @Override // androidx.compose.ui.layout.D
    public int getWidth() {
        return this.f102730B.f102791r.f102604a;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @androidx.compose.ui.i
    public int h() {
        return this.f102742c;
    }

    public final boolean h0() {
        return this.f102733E;
    }

    public final void h1() {
        this.f102730B.O();
    }

    @Override // androidx.compose.runtime.InterfaceC1938p
    public void i() {
        AndroidViewHolder androidViewHolder = this.f102751l;
        if (androidViewHolder != null) {
            androidViewHolder.i();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f102731C;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.G(true);
        }
        this.f102739K = true;
        N1();
        if (H()) {
            X0();
        }
    }

    @Nullable
    public final AndroidViewHolder i0() {
        return this.f102751l;
    }

    public final void i1() {
        this.f102730B.P();
    }

    @Override // androidx.compose.ui.layout.x0
    public void j() {
        LayoutNode layoutNode;
        if (this.f102744e != null) {
            layoutNode = this;
            H1(layoutNode, false, false, false, 5, null);
        } else {
            L1(this, false, false, false, 5, null);
            layoutNode = this;
        }
        C4811b c4811bB1 = layoutNode.f102730B.f102791r.B1();
        if (c4811bB1 != null) {
            l0 l0Var = layoutNode.f102750k;
            if (l0Var != null) {
                l0Var.z(this, c4811bB1.f214284a);
                return;
            }
            return;
        }
        l0 l0Var2 = layoutNode.f102750k;
        if (l0Var2 != null) {
            k0.g(l0Var2, false, 1, null);
        }
    }

    @NotNull
    public final UsageByParent j0() {
        return this.f102763x;
    }

    public final void j1() {
        this.f102730B.f102780g = true;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void k(@NotNull androidx.compose.ui.layout.Q q10) {
        if (kotlin.jvm.internal.G.g(this.f102757r, q10)) {
            return;
        }
        this.f102757r = q10;
        C2219x c2219x = this.f102758s;
        if (c2219x != null) {
            c2219x.k(q10);
        }
        U0();
    }

    @NotNull
    public final LayoutNodeLayoutDelegate k0() {
        return this.f102730B;
    }

    public final void k1() {
        this.f102730B.f102777d = true;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void l(@NotNull androidx.compose.ui.p pVar) {
        if (!(!this.f102740a || this.f102734F == androidx.compose.ui.p.f103112M2)) {
            W.a.f("Modifiers are not supported on virtual LayoutNodes");
            throw null;
        }
        if (this.f102739K) {
            W.a.f("modifier is updated when deactivated");
            throw null;
        }
        if (H()) {
            z(pVar);
        } else {
            this.f102735G = pVar;
        }
    }

    public final boolean l0() {
        return this.f102730B.f102778e;
    }

    public final int l1(int i10) {
        return A0().c(i10);
    }

    @Override // androidx.compose.ui.node.InterfaceC2218w
    @androidx.compose.ui.j
    @Nullable
    public View m() {
        AndroidViewHolder androidViewHolder = this.f102751l;
        if (androidViewHolder != null) {
            return androidViewHolder.f105508c;
        }
        return null;
    }

    @NotNull
    public final LayoutState m0() {
        return this.f102730B.f102776c;
    }

    public final int m1(int i10) {
        return A0().d(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void n(@NotNull androidx.compose.runtime.D d10) {
        this.f102762w = d10;
        f((InterfaceC4814e) d10.b(CompositionLocalsKt.i()));
        d((LayoutDirection) d10.b(CompositionLocalsKt.f103491l));
        p((G1) d10.b(CompositionLocalsKt.f103496q));
        p.d dVar = this.f102729A.f103039e;
        if ((dVar.f103118d & 32768) != 0) {
            while (dVar != null) {
                if ((dVar.f103117c & 32768) != 0) {
                    p.d dVarL = dVar;
                    androidx.compose.runtime.collection.c cVar = null;
                    while (dVarL != 0) {
                        if (dVarL instanceof InterfaceC2199e) {
                            p.d dVarG0 = ((InterfaceC2199e) dVarL).g0();
                            if (dVarG0.f103127m) {
                                C2200e0.e(dVarG0);
                            } else {
                                dVarG0.f103124j = true;
                            }
                        } else if ((dVarL.f103117c & 32768) != 0 && (dVarL instanceof AbstractC2206j)) {
                            p.d dVar2 = ((AbstractC2206j) dVarL).f103066p;
                            int i10 = 0;
                            dVarL = dVarL;
                            while (dVar2 != null) {
                                if ((dVar2.f103117c & 32768) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        dVarL = dVar2;
                                    } else {
                                        if (cVar == null) {
                                            cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                        }
                                        if (dVarL != 0) {
                                            cVar.b(dVarL);
                                            dVarL = 0;
                                        }
                                        cVar.b(dVar2);
                                    }
                                }
                                dVar2 = dVar2.f103120f;
                                dVarL = dVarL;
                            }
                            if (i10 == 1) {
                            }
                        }
                        dVarL = C2204h.l(cVar);
                    }
                }
                if ((dVar.f103118d & 32768) == 0) {
                    return;
                } else {
                    dVar = dVar.f103120f;
                }
            }
        }
    }

    public final boolean n0() {
        return this.f102730B.f102781h;
    }

    public final int n1(int i10) {
        return A0().e(i10);
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public androidx.compose.runtime.D o() {
        return this.f102762w;
    }

    public final boolean o0() {
        return this.f102730B.f102780g;
    }

    public final int o1(int i10) {
        return A0().f(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void p(@NotNull G1 g12) {
        if (kotlin.jvm.internal.G.g(this.f102761v, g12)) {
            return;
        }
        this.f102761v = g12;
        p.d dVar = this.f102729A.f103039e;
        if ((dVar.f103118d & 16) != 0) {
            while (dVar != null) {
                if ((dVar.f103117c & 16) != 0) {
                    p.d dVarL = dVar;
                    androidx.compose.runtime.collection.c cVar = null;
                    while (dVarL != 0) {
                        if (dVarL instanceof r0) {
                            ((r0) dVarL).u2();
                        } else if ((dVarL.f103117c & 16) != 0 && (dVarL instanceof AbstractC2206j)) {
                            p.d dVar2 = ((AbstractC2206j) dVarL).f103066p;
                            int i10 = 0;
                            dVarL = dVarL;
                            while (dVar2 != null) {
                                if ((dVar2.f103117c & 16) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        dVarL = dVar2;
                                    } else {
                                        if (cVar == null) {
                                            cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                        }
                                        if (dVarL != 0) {
                                            cVar.b(dVarL);
                                            dVarL = 0;
                                        }
                                        cVar.b(dVar2);
                                    }
                                }
                                dVar2 = dVar2.f103120f;
                                dVarL = dVarL;
                            }
                            if (i10 == 1) {
                            }
                        }
                        dVarL = C2204h.l(cVar);
                    }
                }
                if ((dVar.f103118d & 16) == 0) {
                    return;
                } else {
                    dVar = dVar.f103120f;
                }
            }
        }
    }

    @Nullable
    public final LayoutNodeLayoutDelegate.LookaheadPassDelegate p0() {
        return this.f102730B.f102792s;
    }

    public final int p1(int i10) {
        return A0().g(i10);
    }

    @Override // androidx.compose.runtime.InterfaceC1938p
    public void q() {
        if (!H()) {
            W.a.f("onReuse is only expected on attached node");
            throw null;
        }
        AndroidViewHolder androidViewHolder = this.f102751l;
        if (androidViewHolder != null) {
            androidViewHolder.q();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f102731C;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.G(false);
        }
        if (this.f102739K) {
            this.f102739K = false;
            X0();
        } else {
            N1();
        }
        this.f102741b = androidx.compose.ui.semantics.o.d();
        this.f102729A.C();
        this.f102729A.I();
        M1(this);
    }

    @Nullable
    public final LayoutNode q0() {
        return this.f102744e;
    }

    public final int q1(int i10) {
        return A0().h(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // androidx.compose.ui.node.l0.b
    public void r() {
        p.d dVar;
        C2215t c2215t = this.f102729A.f103036b;
        boolean zJ = C2200e0.j(128);
        if (zJ) {
            dVar = c2215t.f103092Y;
        } else {
            dVar = c2215t.f103092Y.f103119e;
            if (dVar == null) {
                return;
            }
        }
        for (p.d dVarF3 = c2215t.f3(zJ); dVarF3 != null && (dVarF3.f103118d & 128) != 0; dVarF3 = dVarF3.f103120f) {
            if ((dVarF3.f103117c & 128) != 0) {
                p.d dVarL = dVarF3;
                androidx.compose.runtime.collection.c cVar = null;
                while (dVarL != 0) {
                    if (dVarL instanceof A) {
                        ((A) dVarL).D(this.f102729A.f103036b);
                    } else if ((dVarL.f103117c & 128) != 0 && (dVarL instanceof AbstractC2206j)) {
                        p.d dVar2 = ((AbstractC2206j) dVarL).f103066p;
                        int i10 = 0;
                        dVarL = dVarL;
                        while (dVar2 != null) {
                            if ((dVar2.f103117c & 128) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    dVarL = dVar2;
                                } else {
                                    if (cVar == null) {
                                        cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                    }
                                    if (dVarL != 0) {
                                        cVar.b(dVarL);
                                        dVarL = 0;
                                    }
                                    cVar.b(dVar2);
                                }
                            }
                            dVar2 = dVar2.f103120f;
                            dVarL = dVarL;
                        }
                        if (i10 == 1) {
                        }
                    }
                    dVarL = C2204h.l(cVar);
                }
            }
            if (dVarF3 == dVar) {
                return;
            }
        }
    }

    @NotNull
    public final I r0() {
        return K.c(this).b0();
    }

    public final int r1(int i10) {
        return A0().i(i10);
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public androidx.compose.ui.layout.Q s() {
        return this.f102757r;
    }

    @NotNull
    public final LayoutNodeLayoutDelegate.MeasurePassDelegate s0() {
        return this.f102730B.f102791r;
    }

    public final int s1(int i10) {
        return A0().j(i10);
    }

    public final boolean t0() {
        return this.f102730B.f102777d;
    }

    public final void t1(int i10, int i11, int i12) {
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            this.f102746g.a(i10 > i11 ? i11 + i13 : (i11 + i12) - 2, this.f102746g.i(i10 > i11 ? i10 + i13 : i10));
        }
        w1();
        a1();
        U0();
    }

    @NotNull
    public String toString() {
        return C2287v0.c(this, null) + " children: " + Z().size() + " measurePolicy: " + this.f102757r;
    }

    @NotNull
    public final UsageByParent u0() {
        return this.f102730B.f102791r.f102843l;
    }

    public final void u1(LayoutNode layoutNode) {
        if (layoutNode.f102730B.f102787n > 0) {
            this.f102730B.W(r0.f102787n - 1);
        }
        if (this.f102750k != null) {
            layoutNode.F();
        }
        layoutNode.f102749j = null;
        layoutNode.f102729A.f103037c.f102928v = null;
        if (layoutNode.f102740a) {
            this.f102745f--;
            androidx.compose.runtime.collection.c<LayoutNode> cVar = layoutNode.f102746g.f103026a;
            int i10 = cVar.f99566c;
            if (i10 > 0) {
                LayoutNode[] layoutNodeArr = cVar.f99564a;
                int i11 = 0;
                do {
                    layoutNodeArr[i11].f102729A.f103037c.f102928v = null;
                    i11++;
                } while (i11 < i10);
            }
        }
        a1();
        w1();
    }

    @NotNull
    public final UsageByParent v0() {
        UsageByParent usageByParent;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.f102730B.f102792s;
        return (lookaheadPassDelegate == null || (usageByParent = lookaheadPassDelegate.f102800j) == null) ? UsageByParent.NotUsed : usageByParent;
    }

    public final void v1() {
        U0();
        LayoutNode layoutNodeD0 = D0();
        if (layoutNodeD0 != null) {
            layoutNodeD0.S0();
        }
        T0();
    }

    public final boolean w0() {
        return this.f102738J;
    }

    public final void w1() {
        if (!this.f102740a) {
            this.f102756q = true;
            return;
        }
        LayoutNode layoutNodeD0 = D0();
        if (layoutNodeD0 != null) {
            layoutNodeD0.w1();
        }
    }

    @NotNull
    public final C2194b0 x0() {
        return this.f102729A;
    }

    public final void x1(int i10, int i11) {
        v0.a aVarO;
        C2215t c2215t;
        if (this.f102763x == UsageByParent.NotUsed) {
            C();
        }
        LayoutNode layoutNodeD0 = D0();
        if (layoutNodeD0 == null || (c2215t = layoutNodeD0.f102729A.f103036b) == null || (aVarO = c2215t.f102876k) == null) {
            aVarO = K.c(this).O();
        }
        v0.a.r(aVarO, this.f102730B.f102791r, i10, i11, 0.0f, 4, null);
    }

    @Nullable
    public final ed.l<l0, L0> y0() {
        return this.f102736H;
    }

    public final void y1() {
        if (this.f102748i) {
            int i10 = 0;
            this.f102748i = false;
            androidx.compose.runtime.collection.c<LayoutNode> cVar = this.f102747h;
            if (cVar == null) {
                cVar = new androidx.compose.runtime.collection.c<>(new LayoutNode[16], 0);
                this.f102747h = cVar;
            }
            cVar.q();
            androidx.compose.runtime.collection.c<LayoutNode> cVar2 = this.f102746g.f103026a;
            int i11 = cVar2.f99566c;
            if (i11 > 0) {
                LayoutNode[] layoutNodeArr = cVar2.f99564a;
                do {
                    LayoutNode layoutNode = layoutNodeArr[i10];
                    if (layoutNode.f102740a) {
                        cVar.c(cVar.f99566c, layoutNode.J0());
                    } else {
                        cVar.b(layoutNode);
                    }
                    i10++;
                } while (i10 < i11);
            }
            this.f102730B.N();
        }
    }

    public final void z(androidx.compose.ui.p pVar) {
        this.f102734F = pVar;
        this.f102729A.S(pVar);
        this.f102730B.c0();
        if (this.f102744e == null && this.f102729A.t(512)) {
            U1(this);
        }
    }

    @Nullable
    public final ed.l<l0, L0> z0() {
        return this.f102737I;
    }

    public final boolean z1(@Nullable C4811b c4811b) {
        if (c4811b == null) {
            return false;
        }
        if (this.f102763x == UsageByParent.NotUsed) {
            B();
        }
        return this.f102730B.f102791r.t2(c4811b.f214284a);
    }

    public LayoutNode(boolean z10, int i10) {
        this.f102740a = z10;
        this.f102741b = i10;
        this.f102746g = new Y<>(new androidx.compose.runtime.collection.c(new LayoutNode[16], 0), new InterfaceC4376a<L0>() { // from class: androidx.compose.ui.node.LayoutNode$_foldedChildren$1
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            public /* bridge */ /* synthetic */ L0 invoke() {
                invoke2();
                return L0.f217464a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f102767d.f102730B.N();
            }
        });
        this.f102755p = new androidx.compose.runtime.collection.c<>(new LayoutNode[16], 0);
        this.f102756q = true;
        this.f102757r = f102724N;
        this.f102759t = K.f102720b;
        this.f102760u = LayoutDirection.Ltr;
        this.f102761v = f102727Q;
        androidx.compose.runtime.D.f99088I2.getClass();
        this.f102762w = D.a.f99090b;
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.f102763x = usageByParent;
        this.f102764y = usageByParent;
        this.f102729A = new C2194b0(this);
        this.f102730B = new LayoutNodeLayoutDelegate(this);
        this.f102733E = true;
        this.f102734F = androidx.compose.ui.p.f103112M2;
    }

    public /* synthetic */ LayoutNode(boolean z10, int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? androidx.compose.ui.semantics.o.d() : i10);
    }
}
