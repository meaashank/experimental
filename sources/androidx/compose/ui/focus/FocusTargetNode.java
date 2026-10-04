package androidx.compose.ui.focus;

import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.layout.InterfaceC2169h;
import androidx.compose.ui.node.AbstractC2206j;
import androidx.compose.ui.node.C2194b0;
import androidx.compose.ui.node.C2204h;
import androidx.compose.ui.node.InterfaceC2199e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.W;
import androidx.compose.ui.node.g0;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nFocusTargetNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,268:1\n1#2:269\n1#2:277\n1#2:289\n1#2:373\n1#2:387\n40#3,7:270\n47#3,4:280\n40#3,7:366\n47#3,4:376\n728#4,2:278\n728#4,2:374\n98#5:284\n96#5:285\n96#5:380\n96#5:446\n262#6,2:286\n62#6:288\n63#6,8:290\n264#6:298\n265#6,2:300\n432#6,12:302\n444#6,8:317\n452#6,9:328\n461#6,8:340\n268#6:348\n72#6,7:349\n269#6:356\n251#6,5:381\n62#6:386\n63#6,8:388\n432#6,6:396\n442#6,2:403\n444#6,8:408\n452#6,9:419\n461#6,8:431\n72#6,7:439\n310#6:447\n167#6:448\n168#6:456\n169#6,12:460\n311#6:472\n432#6,5:473\n312#6,2:478\n437#6:480\n442#6,2:482\n444#6,17:487\n461#6,8:507\n314#6:515\n181#6,8:516\n315#6:524\n249#7:299\n249#7:402\n249#7:481\n245#8,3:314\n248#8,3:337\n245#8,3:405\n248#8,3:428\n245#8,3:484\n248#8,3:504\n1208#9:325\n1187#9,2:326\n1208#9:416\n1187#9,2:417\n1208#9:457\n1187#9,2:458\n66#10,9:357\n42#10,7:449\n*S KotlinDebug\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n105#1:277\n119#1:289\n250#1:373\n225#1:387\n105#1:270,7\n105#1:280,4\n250#1:366,7\n250#1:376,4\n105#1:278,2\n250#1:374,2\n119#1:284\n119#1:285\n225#1:380\n237#1:446\n119#1:286,2\n119#1:288\n119#1:290,8\n119#1:298\n119#1:300,2\n119#1:302,12\n119#1:317,8\n119#1:328,9\n119#1:340,8\n119#1:348\n119#1:349,7\n119#1:356\n225#1:381,5\n225#1:386\n225#1:388,8\n225#1:396,6\n225#1:403,2\n225#1:408,8\n225#1:419,9\n225#1:431,8\n225#1:439,7\n237#1:447\n237#1:448\n237#1:456\n237#1:460,12\n237#1:472\n237#1:473,5\n237#1:478,2\n237#1:480\n237#1:482,2\n237#1:487,17\n237#1:507,8\n237#1:515\n237#1:516,8\n237#1:524\n119#1:299\n225#1:402\n237#1:481\n119#1:314,3\n119#1:337,3\n225#1:405,3\n225#1:428,3\n237#1:484,3\n237#1:504,3\n119#1:325\n119#1:326,2\n225#1:416\n225#1:417,2\n237#1:457\n237#1:458,2\n181#1:357,9\n237#1:449,7\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class FocusTargetNode extends p.d implements InterfaceC2199e, J, g0, androidx.compose.ui.modifier.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f100612t = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f100613o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f100614p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public FocusStateImpl f100615q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f100616r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f100617s;

    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class FocusTargetElement extends W<FocusTargetNode> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final FocusTargetElement f100618c = new FocusTargetElement();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f100619d = 0;

        private FocusTargetElement() {
        }

        @Override // androidx.compose.ui.node.W
        public p.d c() {
            return new FocusTargetNode();
        }

        @Override // androidx.compose.ui.node.W
        public boolean equals(@Nullable Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.W
        public void f(@NotNull C2278s0 c2278s0) {
            c2278s0.f103927a = "focusTarget";
        }

        @Override // androidx.compose.ui.node.W
        public /* bridge */ /* synthetic */ void h(p.d dVar) {
        }

        @Override // androidx.compose.ui.node.W
        public int hashCode() {
            return 1739042953;
        }

        @NotNull
        public FocusTargetNode i() {
            return new FocusTargetNode();
        }

        public void j(@NotNull FocusTargetNode focusTargetNode) {
        }
    }

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100620a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f100620a = iArr;
        }
    }

    public static /* synthetic */ void o3() {
    }

    public static final boolean r3(FocusTargetNode focusTargetNode) {
        p.d dVar = focusTargetNode.f103115a;
        if (!dVar.f103127m) {
            W.a.g("visitSubtreeIf called on an unattached node");
            throw null;
        }
        androidx.compose.runtime.collection.c cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
        p.d dVar2 = dVar.f103120f;
        if (dVar2 == null) {
            C2204h.c(cVar, dVar);
        } else {
            cVar.b(dVar2);
        }
        while (true) {
            if (!cVar.V()) {
                break;
            }
            p.d dVar3 = (p.d) cVar.l0(cVar.f99566c - 1);
            if ((dVar3.f103118d & 1024) != 0) {
                for (p.d dVar4 = dVar3; dVar4 != null; dVar4 = dVar4.f103120f) {
                    if ((dVar4.f103117c & 1024) != 0) {
                        androidx.compose.runtime.collection.c cVar2 = null;
                        p.d dVarL = dVar4;
                        while (dVarL != null) {
                            if (dVarL instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) dVarL;
                                if (focusTargetNode2.f100615q != null) {
                                    int i10 = a.f100620a[focusTargetNode2.y1().ordinal()];
                                    if (i10 == 1 || i10 == 2 || i10 == 3) {
                                        return true;
                                    }
                                    if (i10 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            } else if ((dVarL.f103117c & 1024) != 0 && (dVarL instanceof AbstractC2206j)) {
                                int i11 = 0;
                                for (p.d dVar5 = ((AbstractC2206j) dVarL).f103066p; dVar5 != null; dVar5 = dVar5.f103120f) {
                                    if ((dVar5.f103117c & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            dVarL = dVar5;
                                        } else {
                                            if (cVar2 == null) {
                                                cVar2 = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                            }
                                            if (dVarL != null) {
                                                cVar2.b(dVarL);
                                                dVarL = null;
                                            }
                                            cVar2.b(dVar5);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            dVarL = C2204h.l(cVar2);
                        }
                    }
                }
            }
            C2204h.c(cVar, dVar3);
        }
        return false;
    }

    public static final boolean s3(FocusTargetNode focusTargetNode) {
        C2194b0 c2194b0;
        p.d dVar = focusTargetNode.f103115a;
        if (!dVar.f103127m) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        p.d dVar2 = dVar.f103119e;
        LayoutNode layoutNodeR = C2204h.r(focusTargetNode);
        while (true) {
            if (layoutNodeR == null) {
                break;
            }
            if ((layoutNodeR.f102729A.f103039e.f103118d & 1024) != 0) {
                while (dVar2 != null) {
                    if ((dVar2.f103117c & 1024) != 0) {
                        p.d dVarL = dVar2;
                        androidx.compose.runtime.collection.c cVar = null;
                        while (dVarL != null) {
                            if (dVarL instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) dVarL;
                                if (focusTargetNode2.f100615q != null) {
                                    int i10 = a.f100620a[focusTargetNode2.y1().ordinal()];
                                    if (i10 != 1 && i10 != 2) {
                                        if (i10 == 3) {
                                            return true;
                                        }
                                        if (i10 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                }
                            } else if ((dVarL.f103117c & 1024) != 0 && (dVarL instanceof AbstractC2206j)) {
                                int i11 = 0;
                                for (p.d dVar3 = ((AbstractC2206j) dVarL).f103066p; dVar3 != null; dVar3 = dVar3.f103120f) {
                                    if ((dVar3.f103117c & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            dVarL = dVar3;
                                        } else {
                                            if (cVar == null) {
                                                cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                            }
                                            if (dVarL != null) {
                                                cVar.b(dVarL);
                                                dVarL = null;
                                            }
                                            cVar.b(dVar3);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            dVarL = C2204h.l(cVar);
                        }
                    }
                    dVar2 = dVar2.f103119e;
                }
            }
            layoutNodeR = layoutNodeR.D0();
            dVar2 = (layoutNodeR == null || (c2194b0 = layoutNodeR.f102729A) == null) ? null : c2194b0.f103038d;
        }
        return false;
    }

    public static final boolean t3(FocusTargetNode focusTargetNode) {
        return focusTargetNode.f100615q != null;
    }

    @Override // androidx.compose.ui.node.g0
    public void E1() {
        FocusStateImpl focusStateImplY1 = y1();
        u3();
        if (focusStateImplY1 != y1()) {
            C1994i.c(this);
        }
    }

    @Override // androidx.compose.ui.modifier.j, androidx.compose.ui.modifier.n
    public /* synthetic */ Object H(androidx.compose.ui.modifier.c cVar) {
        return androidx.compose.ui.modifier.i.a(this, cVar);
    }

    @Override // androidx.compose.ui.p.d
    public boolean H2() {
        return this.f100616r;
    }

    @Override // androidx.compose.ui.p.d
    public void P2() {
        int i10 = a.f100620a[y1().ordinal()];
        if (i10 == 1 || i10 == 2) {
            t tVarG = C2204h.s(this).G();
            C1989d.f100651b.getClass();
            tVarG.f(true, true, false, C1989d.f100659j);
            L.c(this);
        } else if (i10 == 3) {
            M mC = C2204h.s(this).G().c();
            try {
                if (mC.f100631c) {
                    mC.g();
                }
                mC.f100631c = true;
                v3(FocusStateImpl.Inactive);
                mC.h();
            } catch (Throwable th) {
                mC.h();
                throw th;
            }
        }
        this.f100615q = null;
    }

    @Override // androidx.compose.ui.modifier.j
    public /* synthetic */ void e2(androidx.compose.ui.modifier.c cVar, Object obj) {
        androidx.compose.ui.modifier.i.c(this, cVar, obj);
    }

    public final void i3() {
        FocusStateImpl focusStateImplI = C2204h.s(this).G().c().i(this);
        if (focusStateImplI != null) {
            this.f100615q = focusStateImplI;
        } else {
            W.a.h("committing a node that was not updated in the current transaction");
            throw null;
        }
    }

    public final void j3(int i10, @NotNull ed.l<? super FocusRequester, L0> lVar) {
        if (this.f100614p) {
            return;
        }
        this.f100614p = true;
        try {
            FocusRequester focusRequesterInvoke = ((FocusPropertiesImpl) l3()).f100587j.invoke(new C1989d(i10));
            FocusRequester.f100591b.getClass();
            if (focusRequesterInvoke != FocusRequester.f100593d) {
                lVar.invoke(focusRequesterInvoke);
            }
        } finally {
            this.f100614p = false;
        }
    }

    public final void k3(int i10, @NotNull ed.l<? super FocusRequester, L0> lVar) {
        if (this.f100613o) {
            return;
        }
        this.f100613o = true;
        try {
            FocusRequester focusRequesterInvoke = ((FocusPropertiesImpl) l3()).f100588k.invoke(new C1989d(i10));
            FocusRequester.f100591b.getClass();
            if (focusRequesterInvoke != FocusRequester.f100593d) {
                lVar.invoke(focusRequesterInvoke);
            }
        } finally {
            this.f100613o = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    @NotNull
    public final v l3() {
        C2194b0 c2194b0;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        p.d dVar = this.f103115a;
        if (!dVar.f103127m) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        LayoutNode layoutNodeR = C2204h.r(this);
        p.d dVar2 = dVar;
        loop0: while (layoutNodeR != null) {
            if ((layoutNodeR.f102729A.f103039e.f103118d & 3072) != 0) {
                while (dVar2 != null) {
                    int i10 = dVar2.f103117c;
                    if ((i10 & 3072) != 0) {
                        if (dVar2 != dVar && (i10 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i10 & 2048) != 0) {
                            p.d dVarL = dVar2;
                            androidx.compose.runtime.collection.c cVar = null;
                            while (dVarL != 0) {
                                if (dVarL instanceof x) {
                                    ((x) dVarL).Z1(focusPropertiesImpl);
                                } else if ((dVarL.f103117c & 2048) != 0 && (dVarL instanceof AbstractC2206j)) {
                                    p.d dVar3 = ((AbstractC2206j) dVarL).f103066p;
                                    int i11 = 0;
                                    dVarL = dVarL;
                                    while (dVar3 != null) {
                                        if ((dVar3.f103117c & 2048) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                dVarL = dVar3;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                                }
                                                if (dVarL != 0) {
                                                    cVar.b(dVarL);
                                                    dVarL = 0;
                                                }
                                                cVar.b(dVar3);
                                            }
                                        }
                                        dVar3 = dVar3.f103120f;
                                        dVarL = dVarL;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                dVarL = C2204h.l(cVar);
                            }
                        }
                    }
                    dVar2 = dVar2.f103119e;
                }
            }
            layoutNodeR = layoutNodeR.D0();
            dVar2 = (layoutNodeR == null || (c2194b0 = layoutNodeR.f102729A) == null) ? null : c2194b0.f103038d;
        }
        return focusPropertiesImpl;
    }

    @Nullable
    public final InterfaceC2169h m3() {
        return (InterfaceC2169h) androidx.compose.ui.modifier.i.a(this, BeyondBoundsLayoutKt.a());
    }

    @Override // androidx.compose.ui.focus.J
    @NotNull
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public FocusStateImpl y1() {
        FocusStateImpl focusStateImplI;
        M mB = L.b(this);
        if (mB != null && (focusStateImplI = mB.i(this)) != null) {
            return focusStateImplI;
        }
        FocusStateImpl focusStateImpl = this.f100615q;
        return focusStateImpl == null ? FocusStateImpl.Inactive : focusStateImpl;
    }

    public final int p3() {
        return this.f100617s;
    }

    public final void q3() {
        if (this.f100615q != null) {
            throw new IllegalStateException("Re-initializing focus target node.");
        }
        M mC = C2204h.s(this).G().c();
        try {
            if (mC.f100631c) {
                mC.g();
            }
            mC.f100631c = true;
            v3((s3(this) && r3(this)) ? FocusStateImpl.ActiveParent : FocusStateImpl.Inactive);
            mC.h();
        } catch (Throwable th) {
            mC.h();
            throw th;
        }
    }

    public final void u3() {
        if (this.f100615q == null) {
            q3();
        }
        int i10 = a.f100620a[y1().ordinal()];
        if (i10 == 1 || i10 == 2) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            h0.a(this, new InterfaceC4376a<L0>() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // ed.InterfaceC4376a
                public /* bridge */ /* synthetic */ L0 invoke() {
                    invoke2();
                    return L0.f217464a;
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.focus.v] */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    objectRef.f217904a = this.l3();
                }
            });
            T t10 = objectRef.f217904a;
            if (t10 == 0) {
                kotlin.jvm.internal.G.S("focusProperties");
                throw null;
            }
            if (((v) t10).t()) {
                return;
            }
            C2204h.s(this).G().q(true);
        }
    }

    public void v3(@NotNull FocusStateImpl focusStateImpl) {
        C2204h.s(this).G().c().j(this, focusStateImpl);
    }

    public final void w3(int i10) {
        this.f100617s = i10;
    }

    @Override // androidx.compose.ui.modifier.j
    public androidx.compose.ui.modifier.h z0() {
        return androidx.compose.ui.modifier.b.f102630b;
    }
}
