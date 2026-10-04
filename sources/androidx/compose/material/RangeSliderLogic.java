package androidx.compose.material;

import androidx.compose.runtime.X1;
import kotlinx.coroutines.C5092j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class RangeSliderLogic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.foundation.interaction.g f97010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final androidx.compose.foundation.interaction.g f97011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final X1<Float> f97012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final X1<Float> f97013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final X1<ed.p<Boolean, Float, kotlin.L0>> f97014e;

    /* JADX WARN: Multi-variable type inference failed */
    public RangeSliderLogic(@NotNull androidx.compose.foundation.interaction.g gVar, @NotNull androidx.compose.foundation.interaction.g gVar2, @NotNull X1<Float> x12, @NotNull X1<Float> x13, @NotNull X1<? extends ed.p<? super Boolean, ? super Float, kotlin.L0>> x14) {
        this.f97010a = gVar;
        this.f97011b = gVar2;
        this.f97012c = x12;
        this.f97013d = x13;
        this.f97014e = x14;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.g a(boolean z10) {
        return z10 ? this.f97010a : this.f97011b;
    }

    public final void b(boolean z10, float f10, @NotNull androidx.compose.foundation.interaction.d dVar, @NotNull kotlinx.coroutines.L l10) {
        this.f97014e.getValue().invoke(Boolean.valueOf(z10), Float.valueOf(f10 - (z10 ? this.f97012c : this.f97013d).getValue().floatValue()));
        C5092j.f(l10, null, null, new RangeSliderLogic$captureThumb$1(this, z10, dVar, null), 3, null);
    }

    public final int c(float f10) {
        return Float.compare(Math.abs(this.f97012c.getValue().floatValue() - f10), Math.abs(this.f97013d.getValue().floatValue() - f10));
    }

    @NotNull
    public final androidx.compose.foundation.interaction.g d() {
        return this.f97011b;
    }

    @NotNull
    public final X1<ed.p<Boolean, Float, kotlin.L0>> e() {
        return this.f97014e;
    }

    @NotNull
    public final X1<Float> f() {
        return this.f97013d;
    }

    @NotNull
    public final X1<Float> g() {
        return this.f97012c;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.g h() {
        return this.f97010a;
    }
}
