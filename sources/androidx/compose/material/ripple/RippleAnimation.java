package androidx.compose.material.ripple;

import androidx.compose.animation.L;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1575b;
import androidx.compose.animation.core.C1595l;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.graphics.J0;
import androidx.compose.ui.graphics.K0;
import androidx.compose.ui.graphics.drawscope.DrawScope$CC;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.C5119x;
import kotlinx.coroutines.InterfaceC5117w;
import kotlinx.coroutines.M;
import n0.C5238e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,184:1\n81#2:185\n107#2,2:186\n81#2:188\n107#2,2:189\n225#3,8:191\n272#3,14:199\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n*L\n73#1:185\n73#1:186,2\n74#1:188\n74#1:189,2\n148#1:191,8\n148#1:199,14\n*E\n"})
@r(parameters = 0)
public final class RippleAnimation {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f98795l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public P.g f98796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f98797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f98798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Float f98799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public P.g f98800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Animatable<Float, C1595l> f98801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Animatable<Float, C1595l> f98802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Animatable<Float, C1595l> f98803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final InterfaceC5117w<L0> f98804i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f98805j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f98806k;

    public /* synthetic */ RippleAnimation(P.g gVar, float f10, boolean z10, C4969v c4969v) {
        this(gVar, f10, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r2.i(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.material.ripple.RippleAnimation$animate$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material.ripple.RippleAnimation$animate$1) r0
            int r1 = r0.f98810d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f98810d = r1
            goto L18
        L13:
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = new androidx.compose.material.ripple.RippleAnimation$animate$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f98808b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f98810d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.C4885d0.n(r7)
            goto L70
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f98807a
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.C4885d0.n(r7)
            goto L64
        L3d:
            java.lang.Object r2 = r0.f98807a
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.C4885d0.n(r7)
            goto L54
        L45:
            kotlin.C4885d0.n(r7)
            r0.f98807a = r6
            r0.f98810d = r5
            java.lang.Object r7 = r6.h(r0)
            if (r7 != r1) goto L53
            goto L6f
        L53:
            r2 = r6
        L54:
            r2.n(r5)
            kotlinx.coroutines.w<kotlin.L0> r7 = r2.f98804i
            r0.f98807a = r2
            r0.f98810d = r4
            java.lang.Object r7 = r7.o(r0)
            if (r7 != r1) goto L64
            goto L6f
        L64:
            r7 = 0
            r0.f98807a = r7
            r0.f98810d = r3
            java.lang.Object r7 = r2.i(r0)
            if (r7 != r1) goto L70
        L6f:
            return r1
        L70:
            kotlin.L0 r7 = kotlin.L0.f217464a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.f(kotlin.coroutines.e):java.lang.Object");
    }

    public final void g(@NotNull androidx.compose.ui.graphics.drawscope.h hVar, long j10) {
        if (this.f98799d == null) {
            this.f98799d = Float.valueOf(f.b(hVar.e()));
        }
        if (this.f98796a == null) {
            this.f98796a = new P.g(hVar.Y());
        }
        if (this.f98800e == null) {
            this.f98800e = new P.g(P.h.a(P.n.t(hVar.e()) / 2.0f, P.n.m(hVar.e()) / 2.0f));
        }
        float fFloatValue = (!k() || l()) ? this.f98801f.v().floatValue() : 1.0f;
        Float f10 = this.f98799d;
        G.m(f10);
        float fJ = C5238e.j(f10.floatValue(), this.f98797b, this.f98802g.v().floatValue());
        P.g gVar = this.f98796a;
        G.m(gVar);
        float fP = P.g.p(gVar.f65507a);
        P.g gVar2 = this.f98800e;
        G.m(gVar2);
        float fJ2 = C5238e.j(fP, P.g.p(gVar2.f65507a), this.f98803h.v().floatValue());
        P.g gVar3 = this.f98796a;
        G.m(gVar3);
        float fR = P.g.r(gVar3.f65507a);
        P.g gVar4 = this.f98800e;
        G.m(gVar4);
        long jA = P.h.a(fJ2, C5238e.j(fR, P.g.r(gVar4.f65507a), this.f98803h.v().floatValue()));
        long jW = K0.w(j10, K0.A(j10) * fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.f98798c) {
            DrawScope$CC.z(hVar, jW, fJ, jA, 0.0f, null, null, 0, 120, null);
            return;
        }
        float fT = P.n.t(hVar.e());
        float fM = P.n.m(hVar.e());
        J0.f100729b.getClass();
        int i10 = J0.f100731d;
        androidx.compose.ui.graphics.drawscope.f fVarL1 = hVar.l1();
        long jE = fVarL1.e();
        fVarL1.g().A();
        try {
            fVarL1.j().b(0.0f, 0.0f, fT, fM, i10);
            DrawScope$CC.z(hVar, jW, fJ, jA, 0.0f, null, null, 0, 120, null);
        } finally {
            L.a(fVarL1, jE);
        }
    }

    public final Object h(kotlin.coroutines.e<? super L0> eVar) {
        Object objG = M.g(new RippleAnimation$fadeIn$2(this, null), eVar);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : L0.f217464a;
    }

    public final Object i(kotlin.coroutines.e<? super L0> eVar) {
        Object objG = M.g(new RippleAnimation$fadeOut$2(this, null), eVar);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : L0.f217464a;
    }

    public final void j() {
        m(true);
        this.f98804i.P(L0.f217464a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k() {
        return ((Boolean) this.f98806k.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l() {
        return ((Boolean) this.f98805j.getValue()).booleanValue();
    }

    public final void m(boolean z10) {
        this.f98806k.setValue(Boolean.valueOf(z10));
    }

    public final void n(boolean z10) {
        this.f98805j.setValue(Boolean.valueOf(z10));
    }

    public RippleAnimation(P.g gVar, float f10, boolean z10) {
        this.f98796a = gVar;
        this.f98797b = f10;
        this.f98798c = z10;
        this.f98801f = C1575b.b(0.0f, 0.0f, 2, null);
        this.f98802g = C1575b.b(0.0f, 0.0f, 2, null);
        this.f98803h = C1575b.b(0.0f, 0.0f, 2, null);
        this.f98804i = new C5119x(null);
        Boolean bool = Boolean.FALSE;
        this.f98805j = M1.g(bool, null, 2, null);
        this.f98806k = M1.g(bool, null, 2, null);
    }
}
