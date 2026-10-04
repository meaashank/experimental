package androidx.compose.foundation.lazy;

import androidx.compose.runtime.X1;
import androidx.compose.ui.layout.InterfaceC2183s;
import androidx.compose.ui.layout.InterfaceC2185u;
import androidx.compose.ui.layout.O;
import androidx.compose.ui.layout.T;
import androidx.compose.ui.layout.U;
import androidx.compose.ui.layout.v0;
import androidx.compose.ui.node.C;
import androidx.compose.ui.p;
import k0.C4811b;
import k0.C4812c;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyItemScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/ParentSizeNode\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,163:1\n26#2:164\n26#2:165\n*S KotlinDebug\n*F\n+ 1 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/ParentSizeNode\n*L\n138#1:164\n146#1:165\n*E\n"})
public final class ParentSizeNode extends p.d implements C {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f91180o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public X1<Integer> f91181p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public X1<Integer> f91182q;

    public /* synthetic */ ParentSizeNode(float f10, X1 x12, X1 x13, int i10, C4969v c4969v) {
        this(f10, (i10 & 2) != 0 ? null : x12, (i10 & 4) != 0 ? null : x13);
    }

    @Override // androidx.compose.ui.node.C
    public /* synthetic */ int U(InterfaceC2185u interfaceC2185u, InterfaceC2183s interfaceC2183s, int i10) {
        return androidx.compose.ui.node.B.d(this, interfaceC2185u, interfaceC2183s, i10);
    }

    @Override // androidx.compose.ui.node.C
    public /* synthetic */ int X(InterfaceC2185u interfaceC2185u, InterfaceC2183s interfaceC2183s, int i10) {
        return androidx.compose.ui.node.B.b(this, interfaceC2185u, interfaceC2183s, i10);
    }

    @Override // androidx.compose.ui.node.C
    public /* synthetic */ int d0(InterfaceC2185u interfaceC2185u, InterfaceC2183s interfaceC2183s, int i10) {
        return androidx.compose.ui.node.B.a(this, interfaceC2185u, interfaceC2183s, i10);
    }

    public final float e3() {
        return this.f91180o;
    }

    @Nullable
    public final X1<Integer> f3() {
        return this.f91182q;
    }

    @Override // androidx.compose.ui.node.C
    @NotNull
    public T g(@NotNull androidx.compose.ui.layout.V v10, @NotNull O o10, long j10) {
        X1<Integer> x12 = this.f91181p;
        int iRound = (x12 == null || x12.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(x12.getValue().floatValue() * this.f91180o);
        X1<Integer> x13 = this.f91182q;
        int iRound2 = (x13 == null || x13.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(x13.getValue().floatValue() * this.f91180o);
        int iQ = iRound != Integer.MAX_VALUE ? iRound : C4811b.q(j10);
        int iP = iRound2 != Integer.MAX_VALUE ? iRound2 : C4811b.p(j10);
        if (iRound == Integer.MAX_VALUE) {
            iRound = C4811b.o(j10);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = C4811b.n(j10);
        }
        final v0 v0VarB0 = o10.B0(C4812c.a(iQ, iRound, iP, iRound2));
        return U.s(v10, v0VarB0.f102604a, v0VarB0.f102605b, null, new ed.l<v0.a, L0>() { // from class: androidx.compose.foundation.lazy.ParentSizeNode$measure$1
            {
                super(1);
            }

            public final void e(@NotNull v0.a aVar) {
                v0.a.j(aVar, v0VarB0, 0, 0, 0.0f, 4, null);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(v0.a aVar) {
                e(aVar);
                return L0.f217464a;
            }
        }, 4, null);
    }

    @Nullable
    public final X1<Integer> g3() {
        return this.f91181p;
    }

    public final void h3(float f10) {
        this.f91180o = f10;
    }

    public final void i3(@Nullable X1<Integer> x12) {
        this.f91182q = x12;
    }

    public final void j3(@Nullable X1<Integer> x12) {
        this.f91181p = x12;
    }

    @Override // androidx.compose.ui.node.C
    public /* synthetic */ int k0(InterfaceC2185u interfaceC2185u, InterfaceC2183s interfaceC2183s, int i10) {
        return androidx.compose.ui.node.B.c(this, interfaceC2185u, interfaceC2183s, i10);
    }

    public ParentSizeNode(float f10, @Nullable X1<Integer> x12, @Nullable X1<Integer> x13) {
        this.f91180o = f10;
        this.f91181p = x12;
        this.f91182q = x13;
    }
}
