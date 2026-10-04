package androidx.compose.foundation.layout;

import androidx.compose.animation.C1635o;
import androidx.compose.foundation.C1749o;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.C1968u;
import androidx.compose.runtime.InterfaceC1917i;
import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.layout.v0;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import k0.C4811b;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class FlowMeasureLazyPolicy implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f90458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Arrangement.d f90459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Arrangement.l f90460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f90461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final B f90462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f90463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f90464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f90465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f90466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final FlowLayoutOverflowState f90467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final List<ed.p<InterfaceC1946s, Integer, kotlin.L0>> f90468k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ed.r<Integer, Q, InterfaceC1946s, Integer, kotlin.L0> f90469l;

    public /* synthetic */ FlowMeasureLazyPolicy(boolean z10, Arrangement.d dVar, Arrangement.l lVar, float f10, B b10, float f11, int i10, int i11, int i12, FlowLayoutOverflowState flowLayoutOverflowState, List list, ed.r rVar, C4969v c4969v) {
        this(z10, dVar, lVar, f10, b10, f11, i10, i11, i12, flowLayoutOverflowState, list, rVar);
    }

    public static FlowMeasureLazyPolicy A(FlowMeasureLazyPolicy flowMeasureLazyPolicy, boolean z10, Arrangement.d dVar, Arrangement.l lVar, float f10, B b10, float f11, int i10, int i11, int i12, FlowLayoutOverflowState flowLayoutOverflowState, List list, ed.r rVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = flowMeasureLazyPolicy.f90458a;
        }
        if ((i13 & 2) != 0) {
            dVar = flowMeasureLazyPolicy.f90459b;
        }
        if ((i13 & 4) != 0) {
            lVar = flowMeasureLazyPolicy.f90460c;
        }
        if ((i13 & 8) != 0) {
            f10 = flowMeasureLazyPolicy.f90461d;
        }
        if ((i13 & 16) != 0) {
            b10 = flowMeasureLazyPolicy.f90462e;
        }
        if ((i13 & 32) != 0) {
            f11 = flowMeasureLazyPolicy.f90463f;
        }
        if ((i13 & 64) != 0) {
            i10 = flowMeasureLazyPolicy.f90464g;
        }
        if ((i13 & 128) != 0) {
            i11 = flowMeasureLazyPolicy.f90465h;
        }
        if ((i13 & 256) != 0) {
            i12 = flowMeasureLazyPolicy.f90466i;
        }
        if ((i13 & 512) != 0) {
            flowLayoutOverflowState = flowMeasureLazyPolicy.f90467j;
        }
        if ((i13 & 1024) != 0) {
            list = flowMeasureLazyPolicy.f90468k;
        }
        if ((i13 & 2048) != 0) {
            rVar = flowMeasureLazyPolicy.f90469l;
        }
        ed.r rVar2 = rVar;
        flowMeasureLazyPolicy.getClass();
        FlowLayoutOverflowState flowLayoutOverflowState2 = flowLayoutOverflowState;
        int i14 = i11;
        float f12 = f11;
        List list2 = list;
        int i15 = i12;
        int i16 = i10;
        B b11 = b10;
        Arrangement.l lVar2 = lVar;
        return new FlowMeasureLazyPolicy(z10, dVar, lVar2, f10, b11, f12, i16, i14, i15, flowLayoutOverflowState2, list2, rVar2);
    }

    private final float t() {
        return this.f90461d;
    }

    private final float v() {
        return this.f90463f;
    }

    private final int w() {
        return this.f90464g;
    }

    private final int x() {
        return this.f90465h;
    }

    @NotNull
    public final ed.p<androidx.compose.ui.layout.G0, C4811b, androidx.compose.ui.layout.T> B() {
        return new FlowMeasureLazyPolicy$getMeasurePolicy$1(this);
    }

    public final androidx.compose.ui.layout.T C(final androidx.compose.ui.layout.G0 g02, long j10) {
        if (this.f90464g <= 0 || this.f90465h == 0 || this.f90466i == 0 || (C4811b.n(j10) == 0 && this.f90467j.f90431a != FlowLayoutOverflow.OverflowType.Visible)) {
            return androidx.compose.ui.layout.U.s(g02, 0, 0, null, new ed.l<v0.a, kotlin.L0>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$1
                public final void e(@NotNull v0.a aVar) {
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(v0.a aVar) {
                    return kotlin.L0.f217464a;
                }
            }, 4, null);
        }
        C1710w c1710w = new C1710w(this.f90464g, new ed.p<Integer, Q, List<? extends androidx.compose.ui.layout.O>>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$measurablesIterator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @NotNull
            public final List<androidx.compose.ui.layout.O> e(final int i10, @NotNull final Q q10) {
                androidx.compose.ui.layout.G0 g03 = g02;
                Integer numValueOf = Integer.valueOf(i10);
                final FlowMeasureLazyPolicy flowMeasureLazyPolicy = this;
                return g03.j1(numValueOf, new ComposableLambdaImpl(-195060736, true, new ed.p<InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$measurablesIterator$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @InterfaceC1917i
                    public final void e(@Nullable InterfaceC1946s interfaceC1946s, int i11) {
                        if ((i11 & 3) == 2 && interfaceC1946s.c()) {
                            interfaceC1946s.o();
                            return;
                        }
                        if (C1968u.c0()) {
                            C1968u.p0(-195060736, i11, -1, "androidx.compose.foundation.layout.FlowMeasureLazyPolicy.measure.<anonymous>.<anonymous> (ContextualFlowLayout.kt:452)");
                        }
                        flowMeasureLazyPolicy.f90469l.x(Integer.valueOf(i10), q10, interfaceC1946s, 0);
                        if (C1968u.c0()) {
                            C1968u.o0();
                        }
                    }

                    @Override // ed.p
                    public /* bridge */ /* synthetic */ kotlin.L0 invoke(InterfaceC1946s interfaceC1946s, Integer num) {
                        e(interfaceC1946s, num.intValue());
                        return kotlin.L0.f217464a;
                    }
                }));
            }

            @Override // ed.p
            public /* bridge */ /* synthetic */ List<? extends androidx.compose.ui.layout.O> invoke(Integer num, Q q10) {
                return e(num.intValue(), q10);
            }
        });
        FlowLayoutOverflowState flowLayoutOverflowState = this.f90467j;
        flowLayoutOverflowState.f90435e = this.f90464g;
        flowLayoutOverflowState.v(this, j10, new ed.p<Boolean, Integer, androidx.compose.ui.layout.O>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Nullable
            public final androidx.compose.ui.layout.O e(boolean z10, int i10) {
                ed.p<? super InterfaceC1946s, ? super Integer, kotlin.L0> pVar = (ed.p) kotlin.collections.U.b3(this.f90472d.f90468k, !z10 ? 1 : 0);
                if (pVar == null) {
                    return null;
                }
                androidx.compose.ui.layout.G0 g03 = g02;
                FlowMeasureLazyPolicy flowMeasureLazyPolicy = this.f90472d;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z10);
                sb2.append(flowMeasureLazyPolicy.f90464g);
                sb2.append(i10);
                return (androidx.compose.ui.layout.O) kotlin.collections.U.b3(g03.j1(sb2.toString(), pVar), 0);
            }

            @Override // ed.p
            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.O invoke(Boolean bool, Integer num) {
                return e(bool.booleanValue(), num.intValue());
            }
        });
        return FlowLayoutKt.f(g02, this, c1710w, this.f90461d, this.f90463f, C1692m0.d(j10, this.f90458a ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical), this.f90466i, this.f90465h, this.f90467j);
    }

    public final boolean e() {
        return this.f90458a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasureLazyPolicy)) {
            return false;
        }
        FlowMeasureLazyPolicy flowMeasureLazyPolicy = (FlowMeasureLazyPolicy) obj;
        return this.f90458a == flowMeasureLazyPolicy.f90458a && kotlin.jvm.internal.G.g(this.f90459b, flowMeasureLazyPolicy.f90459b) && kotlin.jvm.internal.G.g(this.f90460c, flowMeasureLazyPolicy.f90460c) && k0.i.l(this.f90461d, flowMeasureLazyPolicy.f90461d) && kotlin.jvm.internal.G.g(this.f90462e, flowMeasureLazyPolicy.f90462e) && k0.i.l(this.f90463f, flowMeasureLazyPolicy.f90463f) && this.f90464g == flowMeasureLazyPolicy.f90464g && this.f90465h == flowMeasureLazyPolicy.f90465h && this.f90466i == flowMeasureLazyPolicy.f90466i && kotlin.jvm.internal.G.g(this.f90467j, flowMeasureLazyPolicy.f90467j) && kotlin.jvm.internal.G.g(this.f90468k, flowMeasureLazyPolicy.f90468k) && kotlin.jvm.internal.G.g(this.f90469l, flowMeasureLazyPolicy.f90469l);
    }

    @Override // androidx.compose.foundation.layout.S, androidx.compose.foundation.layout.InterfaceC1707u0
    public /* synthetic */ long f(int i10, int i11, int i12, int i13, boolean z10) {
        return FlowLineMeasurePolicy$CC.a(this, i10, i11, i12, i13, z10);
    }

    @Override // androidx.compose.foundation.layout.S, androidx.compose.foundation.layout.InterfaceC1707u0
    public /* synthetic */ void g(int i10, int[] iArr, int[] iArr2, androidx.compose.ui.layout.V v10) {
        FlowLineMeasurePolicy$CC.f(this, i10, iArr, iArr2, v10);
    }

    @Override // androidx.compose.foundation.layout.S, androidx.compose.foundation.layout.InterfaceC1707u0
    public /* synthetic */ int h(androidx.compose.ui.layout.v0 v0Var) {
        return FlowLineMeasurePolicy$CC.b(this, v0Var);
    }

    public int hashCode() {
        return this.f90469l.hashCode() + T.a(this.f90468k, (this.f90467j.hashCode() + ((((((androidx.compose.animation.B.a(this.f90463f, (this.f90462e.hashCode() + androidx.compose.animation.B.a(this.f90461d, (this.f90460c.hashCode() + ((this.f90459b.hashCode() + (C1635o.a(this.f90458a) * 31)) * 31)) * 31, 31)) * 31, 31) + this.f90464g) * 31) + this.f90465h) * 31) + this.f90466i) * 31)) * 31, 31);
    }

    @Override // androidx.compose.foundation.layout.S, androidx.compose.foundation.layout.InterfaceC1707u0
    public /* synthetic */ androidx.compose.ui.layout.T i(androidx.compose.ui.layout.v0[] v0VarArr, androidx.compose.ui.layout.V v10, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        return FlowLineMeasurePolicy$CC.e(this, v0VarArr, v10, i10, iArr, i11, i12, iArr2, i13, i14, i15);
    }

    @Override // androidx.compose.foundation.layout.S
    public boolean isHorizontal() {
        return this.f90458a;
    }

    @Override // androidx.compose.foundation.layout.S, androidx.compose.foundation.layout.InterfaceC1707u0
    public /* synthetic */ int j(androidx.compose.ui.layout.v0 v0Var) {
        return FlowLineMeasurePolicy$CC.d(this, v0Var);
    }

    @Override // androidx.compose.foundation.layout.S
    @NotNull
    public B k() {
        return this.f90462e;
    }

    @Override // androidx.compose.foundation.layout.S
    @NotNull
    public Arrangement.l l() {
        return this.f90460c;
    }

    @Override // androidx.compose.foundation.layout.S
    public /* synthetic */ int m(androidx.compose.ui.layout.v0 v0Var, A0 a02, int i10, LayoutDirection layoutDirection, int i11) {
        return FlowLineMeasurePolicy$CC.c(this, v0Var, a02, i10, layoutDirection, i11);
    }

    @Override // androidx.compose.foundation.layout.S
    @NotNull
    public Arrangement.d n() {
        return this.f90459b;
    }

    public final FlowLayoutOverflowState o() {
        return this.f90467j;
    }

    public final List<ed.p<InterfaceC1946s, Integer, kotlin.L0>> p() {
        return this.f90468k;
    }

    public final ed.r<Integer, Q, InterfaceC1946s, Integer, kotlin.L0> q() {
        return this.f90469l;
    }

    @NotNull
    public final Arrangement.d r() {
        return this.f90459b;
    }

    @NotNull
    public final Arrangement.l s() {
        return this.f90460c;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FlowMeasureLazyPolicy(isHorizontal=");
        sb2.append(this.f90458a);
        sb2.append(", horizontalArrangement=");
        sb2.append(this.f90459b);
        sb2.append(", verticalArrangement=");
        sb2.append(this.f90460c);
        sb2.append(", mainAxisSpacing=");
        C1749o.a(this.f90461d, sb2, ", crossAxisAlignment=");
        sb2.append(this.f90462e);
        sb2.append(", crossAxisArrangementSpacing=");
        C1749o.a(this.f90463f, sb2, ", itemCount=");
        sb2.append(this.f90464g);
        sb2.append(", maxLines=");
        sb2.append(this.f90465h);
        sb2.append(", maxItemsInMainAxis=");
        sb2.append(this.f90466i);
        sb2.append(", overflow=");
        sb2.append(this.f90467j);
        sb2.append(", overflowComposables=");
        sb2.append(this.f90468k);
        sb2.append(", getComposable=");
        sb2.append(this.f90469l);
        sb2.append(')');
        return sb2.toString();
    }

    @NotNull
    public final B u() {
        return this.f90462e;
    }

    public final int y() {
        return this.f90466i;
    }

    @NotNull
    public final FlowMeasureLazyPolicy z(boolean z10, @NotNull Arrangement.d dVar, @NotNull Arrangement.l lVar, float f10, @NotNull B b10, float f11, int i10, int i11, int i12, @NotNull FlowLayoutOverflowState flowLayoutOverflowState, @NotNull List<? extends ed.p<? super InterfaceC1946s, ? super Integer, kotlin.L0>> list, @NotNull ed.r<? super Integer, ? super Q, ? super InterfaceC1946s, ? super Integer, kotlin.L0> rVar) {
        return new FlowMeasureLazyPolicy(z10, dVar, lVar, f10, b10, f11, i10, i11, i12, flowLayoutOverflowState, list, rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowMeasureLazyPolicy(boolean z10, Arrangement.d dVar, Arrangement.l lVar, float f10, B b10, float f11, int i10, int i11, int i12, FlowLayoutOverflowState flowLayoutOverflowState, List<? extends ed.p<? super InterfaceC1946s, ? super Integer, kotlin.L0>> list, ed.r<? super Integer, ? super Q, ? super InterfaceC1946s, ? super Integer, kotlin.L0> rVar) {
        this.f90458a = z10;
        this.f90459b = dVar;
        this.f90460c = lVar;
        this.f90461d = f10;
        this.f90462e = b10;
        this.f90463f = f11;
        this.f90464g = i10;
        this.f90465h = i11;
        this.f90466i = i12;
        this.f90467j = flowLayoutOverflowState;
        this.f90468k = list;
        this.f90469l = rVar;
    }
}
