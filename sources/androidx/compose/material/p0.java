package androidx.compose.material;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@P
@InterfaceC1924k0
public final class p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f98664c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f98665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final androidx.compose.material.ripple.e f98666b;

    public /* synthetic */ p0(long j10, androidx.compose.material.ripple.e eVar, C4969v c4969v) {
        this(j10, eVar);
    }

    public final long a() {
        return this.f98665a;
    }

    @Nullable
    public final androidx.compose.material.ripple.e b() {
        return this.f98666b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return androidx.compose.ui.graphics.K0.y(this.f98665a, p0Var.f98665a) && kotlin.jvm.internal.G.g(this.f98666b, p0Var.f98666b);
    }

    public int hashCode() {
        int iK = androidx.compose.ui.graphics.K0.K(this.f98665a) * 31;
        androidx.compose.material.ripple.e eVar = this.f98666b;
        return iK + (eVar != null ? eVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RippleConfiguration(color=" + ((Object) androidx.compose.ui.graphics.K0.L(this.f98665a)) + ", rippleAlpha=" + this.f98666b + ')';
    }

    public p0(long j10, androidx.compose.material.ripple.e eVar) {
        this.f98665a = j10;
        this.f98666b = eVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p0(long j10, androidx.compose.material.ripple.e eVar, int i10, C4969v c4969v) {
        if ((i10 & 1) != 0) {
            androidx.compose.ui.graphics.K0.f100733b.getClass();
            j10 = androidx.compose.ui.graphics.K0.f100746o;
        }
        this(j10, (i10 & 2) != 0 ? null : eVar);
    }
}
