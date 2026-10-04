package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class C2049k2 extends L0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f101138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f101139d;

    public /* synthetic */ C2049k2(long j10, long j11, ColorFilter colorFilter, C4969v c4969v) {
        this(j10, j11, colorFilter);
    }

    public final long b() {
        return this.f101139d;
    }

    public final long c() {
        return this.f101138c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2049k2)) {
            return false;
        }
        C2049k2 c2049k2 = (C2049k2) obj;
        return K0.y(this.f101138c, c2049k2.f101138c) && kotlin.B0.p(this.f101139d, c2049k2.f101139d);
    }

    public int hashCode() {
        return C1550p.a(this.f101139d) + (K0.K(this.f101138c) * 31);
    }

    @NotNull
    public String toString() {
        return "LightingColorFilter(multiply=" + ((Object) K0.L(this.f101138c)) + ", add=" + ((Object) K0.L(this.f101139d)) + ')';
    }

    public /* synthetic */ C2049k2(long j10, long j11, C4969v c4969v) {
        this(j10, j11);
    }

    public C2049k2(long j10, long j11, ColorFilter colorFilter) {
        super(colorFilter);
        this.f101138c = j10;
        this.f101139d = j11;
    }

    public C2049k2(long j10, long j11) {
        this(j10, j11, M.c(j10, j11));
    }
}
