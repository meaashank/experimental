package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.L1;
import androidx.compose.runtime.M1;
import androidx.compose.ui.layout.InterfaceC2188x;
import androidx.compose.ui.text.font.AbstractC2325w;
import androidx.compose.ui.unit.LayoutDirection;
import ed.InterfaceC4376a;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,252:1\n149#2:253\n81#3:254\n81#3:255\n107#3,2:256\n81#3:258\n107#3,2:259\n81#3:261\n107#3,2:262\n81#3:264\n107#3,2:265\n*S KotlinDebug\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutState\n*L\n80#1:253\n46#1:254\n73#1:255\n73#1:256,2\n74#1:258\n74#1:259,2\n75#1:261\n75#1:262,2\n80#1:264\n80#1:265,2\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class TextLayoutState {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f94001i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public b1 f94002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ed.p<? super InterfaceC4814e, ? super InterfaceC4376a<androidx.compose.ui.text.S>, kotlin.L0> f94003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final b1 f94004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f94005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f94006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f94007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f94008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final androidx.compose.foundation.relocation.c f94009h;

    public TextLayoutState() {
        b1 b1Var = new b1();
        this.f94002a = b1Var;
        this.f94004c = b1Var;
        this.f94005d = ActualAndroid_androidKt.e(null, L1.a());
        this.f94006e = ActualAndroid_androidKt.e(null, L1.a());
        this.f94007f = ActualAndroid_androidKt.e(null, L1.a());
        this.f94008g = M1.g(new k0.i(0), null, 2, null);
        this.f94009h = new BringIntoViewRequesterImpl();
    }

    public static /* synthetic */ int i(TextLayoutState textLayoutState, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return textLayoutState.h(j10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.x r0 = r5.k()
            if (r0 == 0) goto L23
            boolean r1 = r0.H()
            if (r1 == 0) goto L1a
            androidx.compose.ui.layout.x r1 = r5.e()
            r2 = 0
            if (r1 == 0) goto L21
            r3 = 0
            r4 = 2
            P.j r2 = androidx.compose.ui.layout.C2187w.m(r1, r0, r3, r4, r2)
            goto L21
        L1a:
            P.j$a r0 = P.j.f65508e
            r0.getClass()
            P.j r2 = P.j.f65510g
        L21:
            if (r2 != 0) goto L2a
        L23:
            P.j$a r0 = P.j.f65508e
            r0.getClass()
            P.j r2 = P.j.f65510g
        L2a:
            long r6 = androidx.compose.foundation.text.input.internal.d1.a(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextLayoutState.b(long):long");
    }

    @NotNull
    public final androidx.compose.foundation.relocation.c c() {
        return this.f94009h;
    }

    @Nullable
    public final InterfaceC2188x d() {
        return (InterfaceC2188x) this.f94006e.getValue();
    }

    @Nullable
    public final InterfaceC2188x e() {
        return (InterfaceC2188x) this.f94007f.getValue();
    }

    @Nullable
    public final androidx.compose.ui.text.S f() {
        return this.f94004c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float g() {
        return ((k0.i) this.f94008g.getValue()).f214312a;
    }

    public final int h(long j10, boolean z10) {
        androidx.compose.ui.text.S sK = this.f94004c.getValue();
        if (sK == null) {
            return -1;
        }
        if (z10) {
            j10 = b(j10);
        }
        return sK.f104309b.B(d1.b(this, j10));
    }

    @Nullable
    public final ed.p<InterfaceC4814e, InterfaceC4376a<androidx.compose.ui.text.S>, kotlin.L0> j() {
        return this.f94003b;
    }

    @Nullable
    public final InterfaceC2188x k() {
        return (InterfaceC2188x) this.f94005d.getValue();
    }

    public final boolean l(long j10) {
        androidx.compose.ui.text.S sK = this.f94004c.getValue();
        if (sK == null) {
            return false;
        }
        long jB = d1.b(this, b(j10));
        int iR = sK.f104309b.r(P.g.r(jB));
        return P.g.p(jB) >= sK.f104309b.t(iR) && P.g.p(jB) <= sK.f104309b.u(iR);
    }

    @NotNull
    public final androidx.compose.ui.text.S m(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection, @NotNull AbstractC2325w.b bVar, long j10) {
        androidx.compose.ui.text.S sL = this.f94002a.l(interfaceC4814e, layoutDirection, bVar, j10);
        ed.p<? super InterfaceC4814e, ? super InterfaceC4376a<androidx.compose.ui.text.S>, kotlin.L0> pVar = this.f94003b;
        if (pVar != null) {
            pVar.invoke(interfaceC4814e, new InterfaceC4376a<androidx.compose.ui.text.S>() { // from class: androidx.compose.foundation.text.input.internal.TextLayoutState$layoutWithNewMeasureInputs$1$textLayoutProvider$1
                {
                    super(0);
                }

                @Override // ed.InterfaceC4376a
                @Nullable
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.ui.text.S invoke() {
                    return this.f94010d.f94002a.getValue();
                }
            });
        }
        return sL;
    }

    public final void n(@Nullable InterfaceC2188x interfaceC2188x) {
        this.f94006e.setValue(interfaceC2188x);
    }

    public final void o(@Nullable InterfaceC2188x interfaceC2188x) {
        this.f94007f.setValue(interfaceC2188x);
    }

    public final void p(float f10) {
        this.f94008g.setValue(new k0.i(f10));
    }

    public final void q(@Nullable ed.p<? super InterfaceC4814e, ? super InterfaceC4376a<androidx.compose.ui.text.S>, kotlin.L0> pVar) {
        this.f94003b = pVar;
    }

    public final void r(@Nullable InterfaceC2188x interfaceC2188x) {
        this.f94005d.setValue(interfaceC2188x);
    }

    public final void s(@NotNull TransformedTextFieldState transformedTextFieldState, @NotNull androidx.compose.ui.text.b0 b0Var, boolean z10, boolean z11) {
        this.f94002a.q(transformedTextFieldState, b0Var, z10, z11);
    }
}
