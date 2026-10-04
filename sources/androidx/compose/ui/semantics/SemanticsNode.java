package androidx.compose.ui.semantics;

import androidx.compose.ui.layout.AbstractC2155a;
import androidx.compose.ui.layout.C2187w;
import androidx.compose.ui.layout.C2189y;
import androidx.compose.ui.layout.D;
import androidx.compose.ui.node.C2204h;
import androidx.compose.ui.node.InterfaceC2203g;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.l0;
import androidx.compose.ui.node.v0;
import androidx.compose.ui.node.x0;
import androidx.compose.ui.node.y0;
import androidx.compose.ui.p;
import java.util.ArrayList;
import java.util.List;
import k0.x;
import kotlin.L0;
import kotlin.collections.EmptyList;
import kotlin.collections.U;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,486:1\n1#2:487\n82#3:488\n82#3:502\n82#3:513\n33#4,6:489\n33#4,6:507\n460#5,7:495\n467#5,4:503\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n*L\n193#1:488\n277#1:502\n392#1:513\n235#1:489,6\n371#1:507,6\n272#1:495,7\n272#1:503,4\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class SemanticsNode {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f104024h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final p.d f104025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f104026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LayoutNode f104027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final l f104028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f104029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public SemanticsNode f104030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f104031g;

    public static final class a extends p.d implements x0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ed.l<u, L0> f104032o;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ed.l<? super u, L0> lVar) {
            this.f104032o = lVar;
        }

        @Override // androidx.compose.ui.node.x0
        public /* synthetic */ boolean B1() {
            return false;
        }

        @Override // androidx.compose.ui.node.x0
        public void o0(@NotNull u uVar) {
            this.f104032o.invoke(uVar);
        }

        @Override // androidx.compose.ui.node.x0
        public /* synthetic */ boolean q1() {
            return false;
        }
    }

    public SemanticsNode(@NotNull p.d dVar, boolean z10, @NotNull LayoutNode layoutNode, @NotNull l lVar) {
        this.f104025a = dVar;
        this.f104026b = z10;
        this.f104027c = layoutNode;
        this.f104028d = lVar;
        this.f104031g = layoutNode.f102741b;
    }

    public static /* synthetic */ List L(SemanticsNode semanticsNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return semanticsNode.K(z10, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List g(SemanticsNode semanticsNode, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        semanticsNode.f(list);
        return list;
    }

    public static /* synthetic */ List n(SemanticsNode semanticsNode, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = !semanticsNode.f104026b;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        return semanticsNode.m(z10, z11, z12);
    }

    public final long A() {
        NodeCoordinator nodeCoordinatorE = e();
        if (nodeCoordinatorE != null) {
            return nodeCoordinatorE.f102606c;
        }
        x.f214338b.getClass();
        return x.f214339c;
    }

    @NotNull
    public final P.j B() {
        InterfaceC2203g interfaceC2203gI;
        if (!this.f104028d.f104173b || (interfaceC2203gI = p.i(this.f104027c)) == null) {
            interfaceC2203gI = this.f104025a;
        }
        return y0.c(interfaceC2203gI.g0(), y0.a(this.f104028d));
    }

    @NotNull
    public final l C() {
        return this.f104028d;
    }

    public final boolean D() {
        return this.f104029e;
    }

    public final boolean E() {
        return this.f104026b && this.f104028d.f104173b;
    }

    public final boolean F() {
        return u() == null;
    }

    public final boolean G() {
        NodeCoordinator nodeCoordinatorE = e();
        if (nodeCoordinatorE != null) {
            return nodeCoordinatorE.m3();
        }
        return false;
    }

    public final boolean H() {
        return !this.f104029e && y().isEmpty() && p.h(this.f104027c, new ed.l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$isUnmergedLeafNode$1
            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull LayoutNode layoutNode) {
                l lVarA0 = layoutNode.a0();
                boolean z10 = false;
                if (lVarA0 != null && lVarA0.f104173b) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        }) == null;
    }

    public final void I(l lVar) {
        if (this.f104028d.f104174c) {
            return;
        }
        List listL = L(this, false, false, 3, null);
        int size = listL.size();
        for (int i10 = 0; i10 < size; i10++) {
            SemanticsNode semanticsNode = (SemanticsNode) listL.get(i10);
            if (!semanticsNode.E()) {
                lVar.x(semanticsNode.f104028d);
                semanticsNode.I(lVar);
            }
        }
    }

    public final void J(boolean z10) {
        this.f104029e = z10;
    }

    @NotNull
    public final List<SemanticsNode> K(boolean z10, boolean z11) {
        if (this.f104029e) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList();
        d(this.f104027c, arrayList, z11);
        if (z10) {
            b(arrayList);
        }
        return arrayList;
    }

    @NotNull
    public final SemanticsNode a() {
        return new SemanticsNode(this.f104025a, true, this.f104027c, this.f104028d);
    }

    public final void b(List<SemanticsNode> list) {
        final i iVarJ = p.j(this);
        if (iVarJ != null && this.f104028d.f104173b && !list.isEmpty()) {
            list.add(c(iVarJ, new ed.l<u, L0>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                {
                    super(1);
                }

                public final void e(@NotNull u uVar) {
                    SemanticsPropertiesKt.C1(uVar, iVarJ.f104135a);
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(u uVar) {
                    e(uVar);
                    return L0.f217464a;
                }
            }));
        }
        l lVar = this.f104028d;
        SemanticsProperties semanticsProperties = SemanticsProperties.f104049a;
        semanticsProperties.getClass();
        SemanticsPropertyKey<List<String>> semanticsPropertyKey = SemanticsProperties.f104050b;
        if (!lVar.f104172a.containsKey(semanticsPropertyKey) || list.isEmpty()) {
            return;
        }
        l lVar2 = this.f104028d;
        if (lVar2.f104173b) {
            semanticsProperties.getClass();
            List list2 = (List) lVar2.t(semanticsPropertyKey, SemanticsConfigurationKt$getOrNull$1.f104023d);
            final String str = list2 != null ? (String) U.L2(list2) : null;
            if (str != null) {
                list.add(0, c(null, new ed.l<u, L0>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void e(@NotNull u uVar) {
                        SemanticsPropertiesKt.o1(uVar, str);
                    }

                    @Override // ed.l
                    public /* bridge */ /* synthetic */ L0 invoke(u uVar) {
                        e(uVar);
                        return L0.f217464a;
                    }
                }));
            }
        }
    }

    public final SemanticsNode c(i iVar, ed.l<? super u, L0> lVar) {
        l lVar2 = new l();
        lVar2.f104173b = false;
        lVar2.f104174c = false;
        lVar.invoke(lVar2);
        SemanticsNode semanticsNode = new SemanticsNode(new a(lVar), false, new LayoutNode(true, iVar != null ? p.k(this) : p.g(this)), lVar2);
        semanticsNode.f104029e = true;
        semanticsNode.f104030f = this;
        return semanticsNode;
    }

    public final void d(LayoutNode layoutNode, List<SemanticsNode> list, boolean z10) {
        androidx.compose.runtime.collection.c<LayoutNode> cVarH0 = layoutNode.H0();
        int i10 = cVarH0.f99566c;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = cVarH0.f99564a;
            int i11 = 0;
            do {
                LayoutNode layoutNode2 = layoutNodeArr[i11];
                if (layoutNode2.H() && (z10 || !layoutNode2.f102739K)) {
                    if (layoutNode2.f102729A.t(8)) {
                        list.add(p.a(layoutNode2, this.f104026b));
                    } else {
                        d(layoutNode2, list, z10);
                    }
                }
                i11++;
            } while (i11 < i10);
        }
    }

    @Nullable
    public final NodeCoordinator e() {
        if (this.f104029e) {
            SemanticsNode semanticsNodeU = u();
            if (semanticsNodeU != null) {
                return semanticsNodeU.e();
            }
            return null;
        }
        InterfaceC2203g interfaceC2203gI = p.i(this.f104027c);
        if (interfaceC2203gI == null) {
            interfaceC2203gI = this.f104025a;
        }
        return C2204h.m(interfaceC2203gI, 8);
    }

    public final List<SemanticsNode> f(List<SemanticsNode> list) {
        List listL = L(this, false, false, 3, null);
        int size = listL.size();
        for (int i10 = 0; i10 < size; i10++) {
            SemanticsNode semanticsNode = (SemanticsNode) listL.get(i10);
            if (semanticsNode.E()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.f104028d.f104174c) {
                semanticsNode.f(list);
            }
        }
        return list;
    }

    public final int h(@NotNull AbstractC2155a abstractC2155a) {
        NodeCoordinator nodeCoordinatorE = e();
        if (nodeCoordinatorE != null) {
            return nodeCoordinatorE.M(abstractC2155a);
        }
        return Integer.MIN_VALUE;
    }

    @NotNull
    public final P.j i() {
        SemanticsNode semanticsNodeU = u();
        if (semanticsNodeU == null) {
            P.j.f65508e.getClass();
            return P.j.f65510g;
        }
        NodeCoordinator nodeCoordinatorE = e();
        if (nodeCoordinatorE != null) {
            if (!nodeCoordinatorE.H()) {
                nodeCoordinatorE = null;
            }
            if (nodeCoordinatorE != null) {
                return C2187w.m(C2204h.m(semanticsNodeU.f104025a, 8), nodeCoordinatorE.T(), false, 2, null);
            }
        }
        P.j.f65508e.getClass();
        return P.j.f65510g;
    }

    @NotNull
    public final P.j j() {
        P.j jVarM;
        NodeCoordinator nodeCoordinatorE = e();
        if (nodeCoordinatorE != null) {
            if (!nodeCoordinatorE.H()) {
                nodeCoordinatorE = null;
            }
            if (nodeCoordinatorE != null && (jVarM = C2187w.m(C2189y.d(nodeCoordinatorE), nodeCoordinatorE, false, 2, null)) != null) {
                return jVarM;
            }
        }
        P.j.f65508e.getClass();
        return P.j.f65510g;
    }

    @NotNull
    public final P.j k() {
        P.j jVarC;
        NodeCoordinator nodeCoordinatorE = e();
        if (nodeCoordinatorE != null) {
            if (!nodeCoordinatorE.H()) {
                nodeCoordinatorE = null;
            }
            if (nodeCoordinatorE != null && (jVarC = C2189y.c(nodeCoordinatorE)) != null) {
                return jVarC;
            }
        }
        P.j.f65508e.getClass();
        return P.j.f65510g;
    }

    @NotNull
    public final List<SemanticsNode> l() {
        return n(this, false, false, false, 7, null);
    }

    @NotNull
    public final List<SemanticsNode> m(boolean z10, boolean z11, boolean z12) {
        return (z10 || !this.f104028d.f104174c) ? E() ? g(this, null, 1, null) : K(z11, z12) : EmptyList.f217510a;
    }

    @NotNull
    public final l o() {
        if (!E()) {
            return this.f104028d;
        }
        l lVarJ = this.f104028d.j();
        I(lVarJ);
        return lVarJ;
    }

    public final int p() {
        return this.f104031g;
    }

    @NotNull
    public final D q() {
        return this.f104027c;
    }

    @NotNull
    public final LayoutNode r() {
        return this.f104027c;
    }

    public final boolean s() {
        return this.f104026b;
    }

    @NotNull
    public final p.d t() {
        return this.f104025a;
    }

    @Nullable
    public final SemanticsNode u() {
        SemanticsNode semanticsNode = this.f104030f;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        LayoutNode layoutNodeH = this.f104026b ? p.h(this.f104027c, new ed.l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$1
            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull LayoutNode layoutNode) {
                l lVarA0 = layoutNode.a0();
                boolean z10 = false;
                if (lVarA0 != null && lVarA0.f104173b) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        }) : null;
        if (layoutNodeH == null) {
            layoutNodeH = p.h(this.f104027c, new ed.l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$2
                @Override // ed.l
                @NotNull
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@NotNull LayoutNode layoutNode) {
                    return Boolean.valueOf(layoutNode.f102729A.t(8));
                }
            });
        }
        if (layoutNodeH == null) {
            return null;
        }
        return p.a(layoutNodeH, this.f104026b);
    }

    public final long v() {
        NodeCoordinator nodeCoordinatorE = e();
        if (nodeCoordinatorE != null) {
            if (!nodeCoordinatorE.H()) {
                nodeCoordinatorE = null;
            }
            if (nodeCoordinatorE != null) {
                return C2189y.f(nodeCoordinatorE);
            }
        }
        P.g.f65503b.getClass();
        return P.g.f65504c;
    }

    public final long w() {
        NodeCoordinator nodeCoordinatorE = e();
        if (nodeCoordinatorE != null) {
            if (!nodeCoordinatorE.H()) {
                nodeCoordinatorE = null;
            }
            if (nodeCoordinatorE != null) {
                return C2189y.g(nodeCoordinatorE);
            }
        }
        P.g.f65503b.getClass();
        return P.g.f65504c;
    }

    public final long x() {
        NodeCoordinator nodeCoordinatorE = e();
        if (nodeCoordinatorE != null) {
            if (!nodeCoordinatorE.H()) {
                nodeCoordinatorE = null;
            }
            if (nodeCoordinatorE != null) {
                return C2189y.h(nodeCoordinatorE);
            }
        }
        P.g.f65503b.getClass();
        return P.g.f65504c;
    }

    @NotNull
    public final List<SemanticsNode> y() {
        return n(this, false, true, false, 4, null);
    }

    @Nullable
    public final v0 z() {
        l0 l0Var = this.f104027c.f102750k;
        if (l0Var != null) {
            return l0Var.y();
        }
        return null;
    }
}
