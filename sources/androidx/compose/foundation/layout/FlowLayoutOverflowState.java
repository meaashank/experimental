package androidx.compose.foundation.layout;

import androidx.activity.C1477d;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.foundation.layout.O;
import androidx.compose.ui.layout.InterfaceC2183s;
import k0.C4811b;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFlowLayoutOverflow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowLayoutOverflowState\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,906:1\n232#2:907\n232#2:908\n*S KotlinDebug\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowLayoutOverflowState\n*L\n813#1:907\n825#1:908\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class FlowLayoutOverflowState {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f90430m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FlowLayoutOverflow.OverflowType f90431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f90433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f90434d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f90435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public androidx.compose.ui.layout.O f90436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public androidx.compose.ui.layout.v0 f90437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public androidx.compose.ui.layout.O f90438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public androidx.compose.ui.layout.v0 f90439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public androidx.collection.H f90440j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public androidx.collection.H f90441k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ed.p<? super Boolean, ? super Integer, ? extends androidx.compose.ui.layout.O> f90442l;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90443a;

        static {
            int[] iArr = new int[FlowLayoutOverflow.OverflowType.values().length];
            try {
                iArr[FlowLayoutOverflow.OverflowType.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.Clip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandIndicator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f90443a = iArr;
        }
    }

    public FlowLayoutOverflowState(@NotNull FlowLayoutOverflow.OverflowType overflowType, int i10, int i11) {
        this.f90431a = overflowType;
        this.f90432b = i10;
        this.f90433c = i11;
    }

    public static FlowLayoutOverflowState i(FlowLayoutOverflowState flowLayoutOverflowState, FlowLayoutOverflow.OverflowType overflowType, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            overflowType = flowLayoutOverflowState.f90431a;
        }
        if ((i12 & 2) != 0) {
            i10 = flowLayoutOverflowState.f90432b;
        }
        if ((i12 & 4) != 0) {
            i11 = flowLayoutOverflowState.f90433c;
        }
        flowLayoutOverflowState.getClass();
        return new FlowLayoutOverflowState(overflowType, i10, i11);
    }

    @NotNull
    public final FlowLayoutOverflow.OverflowType e() {
        return this.f90431a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowLayoutOverflowState)) {
            return false;
        }
        FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) obj;
        return this.f90431a == flowLayoutOverflowState.f90431a && this.f90432b == flowLayoutOverflowState.f90432b && this.f90433c == flowLayoutOverflowState.f90433c;
    }

    public final int f() {
        return this.f90432b;
    }

    public final int g() {
        return this.f90433c;
    }

    @NotNull
    public final FlowLayoutOverflowState h(@NotNull FlowLayoutOverflow.OverflowType overflowType, int i10, int i11) {
        return new FlowLayoutOverflowState(overflowType, i10, i11);
    }

    public int hashCode() {
        return (((this.f90431a.hashCode() * 31) + this.f90432b) * 31) + this.f90433c;
    }

    @Nullable
    public final O.a j(boolean z10, int i10, int i11) {
        androidx.compose.ui.layout.O oInvoke;
        androidx.collection.H h10;
        androidx.compose.ui.layout.v0 v0Var;
        androidx.compose.ui.layout.O o10;
        androidx.compose.ui.layout.v0 v0Var2;
        int i12 = a.f90443a[this.f90431a.ordinal()];
        if (i12 == 1 || i12 == 2) {
            return null;
        }
        if (i12 != 3 && i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (z10) {
            ed.p<? super Boolean, ? super Integer, ? extends androidx.compose.ui.layout.O> pVar = this.f90442l;
            if (pVar == null || (oInvoke = pVar.invoke(Boolean.TRUE, Integer.valueOf(p()))) == null) {
                oInvoke = this.f90436f;
            }
            h10 = this.f90440j;
            if (this.f90442l == null) {
                v0Var = this.f90437g;
                o10 = oInvoke;
                v0Var2 = v0Var;
            }
            o10 = oInvoke;
            v0Var2 = null;
        } else {
            if (i10 < this.f90432b - 1 || i11 < this.f90433c) {
                oInvoke = null;
            } else {
                ed.p<? super Boolean, ? super Integer, ? extends androidx.compose.ui.layout.O> pVar2 = this.f90442l;
                if (pVar2 == null || (oInvoke = pVar2.invoke(Boolean.FALSE, Integer.valueOf(p()))) == null) {
                    oInvoke = this.f90438h;
                }
            }
            h10 = this.f90441k;
            if (this.f90442l == null) {
                v0Var = this.f90439i;
                o10 = oInvoke;
                v0Var2 = v0Var;
            }
            o10 = oInvoke;
            v0Var2 = null;
        }
        if (o10 == null) {
            return null;
        }
        kotlin.jvm.internal.G.m(h10);
        return new O.a(o10, v0Var2, h10.f86706a, false, 8, null);
    }

    @Nullable
    public final androidx.collection.H k(boolean z10, int i10, int i11) {
        int i12 = a.f90443a[this.f90431a.ordinal()];
        if (i12 != 1 && i12 != 2) {
            if (i12 != 3) {
                if (i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z10) {
                    return this.f90440j;
                }
                if (i10 + 1 < this.f90432b || i11 < this.f90433c) {
                    return null;
                }
                return this.f90441k;
            }
            if (z10) {
                return this.f90440j;
            }
        }
        return null;
    }

    public final int l() {
        return this.f90435e;
    }

    public final int m() {
        return this.f90434d;
    }

    public final int n() {
        return this.f90433c;
    }

    public final int o() {
        return this.f90432b;
    }

    public final int p() {
        int i10 = this.f90434d;
        if (i10 != -1) {
            return i10;
        }
        throw new IllegalStateException("Accessing noOfItemsShown before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.");
    }

    @NotNull
    public final FlowLayoutOverflow.OverflowType q() {
        return this.f90431a;
    }

    public final void r(int i10) {
        this.f90435e = i10;
    }

    public final void s(int i10) {
        this.f90434d = i10;
    }

    public final void t(@NotNull final S s10, @Nullable androidx.compose.ui.layout.O o10, @Nullable androidx.compose.ui.layout.O o11, long j10) {
        LayoutOrientation layoutOrientation = s10.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical;
        long jQ = C1692m0.q(C1692m0.f(C1692m0.d(j10, layoutOrientation), 0, 0, 0, 0, 10, null), layoutOrientation);
        if (o10 != null) {
            FlowLayoutKt.p(o10, s10, jQ, new ed.l<androidx.compose.ui.layout.v0, kotlin.L0>() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$setOverflowMeasurables$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void e(@Nullable androidx.compose.ui.layout.v0 v0Var) {
                    int iJ;
                    int iH;
                    if (v0Var != null) {
                        S s11 = s10;
                        iJ = s11.j(v0Var);
                        iH = s11.h(v0Var);
                    } else {
                        iJ = 0;
                        iH = 0;
                    }
                    this.f90444d.f90440j = new androidx.collection.H(androidx.collection.H.d(iJ, iH));
                    this.f90444d.f90437g = v0Var;
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(androidx.compose.ui.layout.v0 v0Var) {
                    e(v0Var);
                    return kotlin.L0.f217464a;
                }
            });
            this.f90436f = o10;
        }
        if (o11 != null) {
            FlowLayoutKt.p(o11, s10, jQ, new ed.l<androidx.compose.ui.layout.v0, kotlin.L0>() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$setOverflowMeasurables$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void e(@Nullable androidx.compose.ui.layout.v0 v0Var) {
                    int iJ;
                    int iH;
                    if (v0Var != null) {
                        S s11 = s10;
                        iJ = s11.j(v0Var);
                        iH = s11.h(v0Var);
                    } else {
                        iJ = 0;
                        iH = 0;
                    }
                    this.f90446d.f90441k = new androidx.collection.H(androidx.collection.H.d(iJ, iH));
                    this.f90446d.f90439i = v0Var;
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(androidx.compose.ui.layout.v0 v0Var) {
                    e(v0Var);
                    return kotlin.L0.f217464a;
                }
            });
            this.f90438h = o11;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FlowLayoutOverflowState(type=");
        sb2.append(this.f90431a);
        sb2.append(", minLinesToShowCollapse=");
        sb2.append(this.f90432b);
        sb2.append(", minCrossAxisSizeToShowCollapse=");
        return C1477d.a(sb2, this.f90433c, ')');
    }

    public final void u(@Nullable InterfaceC2183s interfaceC2183s, @Nullable InterfaceC2183s interfaceC2183s2, boolean z10, long j10) {
        long jD = C1692m0.d(j10, z10 ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        if (interfaceC2183s != null) {
            int iN = FlowLayoutKt.n(interfaceC2183s, z10, C4811b.n(jD));
            this.f90440j = new androidx.collection.H(androidx.collection.H.d(iN, z10 ? interfaceC2183s.r0(iN) : interfaceC2183s.w0(iN)));
            this.f90436f = interfaceC2183s instanceof androidx.compose.ui.layout.O ? (androidx.compose.ui.layout.O) interfaceC2183s : null;
            this.f90437g = null;
        }
        if (interfaceC2183s2 != null) {
            int iN2 = FlowLayoutKt.n(interfaceC2183s2, z10, C4811b.n(jD));
            this.f90441k = new androidx.collection.H(androidx.collection.H.d(iN2, z10 ? interfaceC2183s2.r0(iN2) : interfaceC2183s2.w0(iN2)));
            this.f90438h = interfaceC2183s2 instanceof androidx.compose.ui.layout.O ? (androidx.compose.ui.layout.O) interfaceC2183s2 : null;
            this.f90439i = null;
        }
    }

    public final void v(@NotNull S s10, long j10, @NotNull ed.p<? super Boolean, ? super Integer, ? extends androidx.compose.ui.layout.O> pVar) {
        this.f90434d = 0;
        this.f90442l = pVar;
        t(s10, pVar.invoke(Boolean.TRUE, 0), pVar.invoke(Boolean.FALSE, 0), j10);
    }
}
