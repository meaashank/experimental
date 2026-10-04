package androidx.compose.material;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q0 f98745a = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f98746b = 0;

    @NotNull
    public final androidx.compose.material.ripple.e a(long j10, boolean z10) {
        return z10 ? ((double) androidx.compose.ui.graphics.M0.r(j10)) > 0.5d ? RippleKt.f97023e : RippleKt.f97024f : RippleKt.f97025g;
    }

    public final long b(long j10, boolean z10) {
        float fR = androidx.compose.ui.graphics.M0.r(j10);
        if (z10 || fR >= 0.5d) {
            return j10;
        }
        androidx.compose.ui.graphics.K0.f100733b.getClass();
        return androidx.compose.ui.graphics.K0.f100738g;
    }
}
