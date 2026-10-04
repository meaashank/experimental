package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material.P;
import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.K1;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.X1;
import androidx.compose.runtime.internal.r;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.C5092j;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@P
@V({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,235:1\n81#2:236\n81#2:237\n107#2,2:238\n79#3:240\n112#3,2:241\n79#3:243\n112#3,2:244\n79#3:246\n112#3,2:247\n79#3:249\n112#3,2:250\n71#4,16:252\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n*L\n123#1:236\n125#1:237\n125#1:238,2\n126#1:240\n126#1:241,2\n127#1:243\n127#1:244,2\n128#1:246\n128#1:247,2\n129#1:249\n129#1:250,2\n201#1:252,16\n*E\n"})
@r(parameters = 0)
public final class PullRefreshState {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f98711j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final L f98712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final X1<InterfaceC4376a<L0>> f98713b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final F0 f98718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final F0 f98719h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final X1 f98714c = K1.d(new InterfaceC4376a<Float>() { // from class: androidx.compose.material.pullrefresh.PullRefreshState$adjustedDistancePulled$2
        {
            super(0);
        }

        @Override // ed.InterfaceC4376a
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f98721d.f98717f.getFloatValue() * 0.5f);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f98715d = M1.g(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final F0 f98716e = ActualAndroid_androidKt.b(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final F0 f98717f = ActualAndroid_androidKt.b(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutatorMutex f98720i = new MutatorMutex();

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshState(@NotNull L l10, @NotNull X1<? extends InterfaceC4376a<L0>> x12, float f10, float f11) {
        this.f98712a = l10;
        this.f98713b = x12;
        this.f98718g = ActualAndroid_androidKt.b(f11);
        this.f98719h = ActualAndroid_androidKt.b(f10);
    }

    public static final float a(PullRefreshState pullRefreshState) {
        return pullRefreshState.f98717f.getFloatValue();
    }

    public static final float c(PullRefreshState pullRefreshState) {
        return pullRefreshState.f98716e.getFloatValue();
    }

    public final A0 e(float f10) {
        return C5092j.f(this.f98712a, null, null, new PullRefreshState$animateIndicatorTo$1(this, f10, null), 3, null);
    }

    public final float f() {
        if (g() <= this.f98718g.getFloatValue()) {
            return g();
        }
        float fAbs = Math.abs(j()) - 1.0f;
        if (fAbs < 0.0f) {
            fAbs = 0.0f;
        }
        if (fAbs > 2.0f) {
            fAbs = 2.0f;
        }
        return this.f98718g.getFloatValue() + (this.f98718g.getFloatValue() * (fAbs - (((float) Math.pow(fAbs, 2)) / 4)));
    }

    public final float g() {
        return ((Number) this.f98714c.getValue()).floatValue();
    }

    public final float h() {
        return this.f98717f.getFloatValue();
    }

    public final float i() {
        return this.f98716e.getFloatValue();
    }

    public final float j() {
        return g() / this.f98718g.getFloatValue();
    }

    public final boolean k() {
        return n();
    }

    public final float l() {
        return this.f98718g.getFloatValue();
    }

    public final float m() {
        return this.f98716e.getFloatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n() {
        return ((Boolean) this.f98715d.getValue()).booleanValue();
    }

    public final float o() {
        return this.f98719h.getFloatValue();
    }

    public final float p() {
        return this.f98718g.getFloatValue();
    }

    public final float q(float f10) {
        if (n()) {
            return 0.0f;
        }
        float floatValue = this.f98717f.getFloatValue() + f10;
        float f11 = floatValue >= 0.0f ? floatValue : 0.0f;
        float floatValue2 = f11 - this.f98717f.getFloatValue();
        s(f11);
        w(f());
        return floatValue2;
    }

    public final float r(float f10) {
        if (n()) {
            return 0.0f;
        }
        if (g() > this.f98718g.getFloatValue()) {
            this.f98713b.getValue().invoke();
        }
        e(0.0f);
        if (this.f98717f.getFloatValue() == 0.0f || f10 < 0.0f) {
            f10 = 0.0f;
        }
        s(0.0f);
        return f10;
    }

    public final void s(float f10) {
        this.f98717f.setFloatValue(f10);
    }

    public final void t(boolean z10) {
        if (n() != z10) {
            x(z10);
            s(0.0f);
            e(z10 ? this.f98719h.getFloatValue() : 0.0f);
        }
    }

    public final void u(float f10) {
        if (this.f98719h.getFloatValue() == f10) {
            return;
        }
        y(f10);
        if (n()) {
            e(f10);
        }
    }

    public final void v(float f10) {
        z(f10);
    }

    public final void w(float f10) {
        this.f98716e.setFloatValue(f10);
    }

    public final void x(boolean z10) {
        this.f98715d.setValue(Boolean.valueOf(z10));
    }

    public final void y(float f10) {
        this.f98719h.setFloatValue(f10);
    }

    public final void z(float f10) {
        this.f98718g.setFloatValue(f10);
    }
}
