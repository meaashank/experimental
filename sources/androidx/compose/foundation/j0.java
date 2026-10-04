package androidx.compose.foundation;

import androidx.compose.foundation.layout.InterfaceC1694n0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.T1;
import androidx.compose.ui.graphics.K0;
import androidx.compose.ui.graphics.M0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@L
@T1
public final class j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f90164c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f90165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC1694n0 f90166b;

    public /* synthetic */ j0(long j10, InterfaceC1694n0 interfaceC1694n0, C4969v c4969v) {
        this(j10, interfaceC1694n0);
    }

    @NotNull
    public final InterfaceC1694n0 a() {
        return this.f90166b;
    }

    public final long b() {
        return this.f90165a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.G.n(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        j0 j0Var = (j0) obj;
        return K0.y(this.f90165a, j0Var.f90165a) && kotlin.jvm.internal.G.g(this.f90166b, j0Var.f90166b);
    }

    public int hashCode() {
        return this.f90166b.hashCode() + (K0.K(this.f90165a) * 31);
    }

    @NotNull
    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) K0.L(this.f90165a)) + ", drawPadding=" + this.f90166b + ')';
    }

    public j0(long j10, InterfaceC1694n0 interfaceC1694n0) {
        this.f90165a = j10;
        this.f90166b = interfaceC1694n0;
    }

    public /* synthetic */ j0(long j10, InterfaceC1694n0 interfaceC1694n0, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? M0.d(4284900966L) : j10, (i10 & 2) != 0 ? PaddingKt.c(0.0f, 0.0f, 3, null) : interfaceC1694n0);
    }
}
