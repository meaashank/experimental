package androidx.compose.foundation.contextmenu;

import androidx.collection.C1550p;
import androidx.compose.runtime.T1;
import androidx.compose.ui.graphics.K0;
import e.f0;
import kotlin.B0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
@f0
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f89037f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f89038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f89039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f89040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f89041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f89042e;

    public /* synthetic */ b(long j10, long j11, long j12, long j13, long j14, C4969v c4969v) {
        this(j10, j11, j12, j13, j14);
    }

    public final long a() {
        return this.f89038a;
    }

    public final long b() {
        return this.f89042e;
    }

    public final long c() {
        return this.f89041d;
    }

    public final long d() {
        return this.f89040c;
    }

    public final long e() {
        return this.f89039b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return K0.y(this.f89038a, bVar.f89038a) && B0.p(this.f89039b, bVar.f89039b) && B0.p(this.f89040c, bVar.f89040c) && B0.p(this.f89041d, bVar.f89041d) && B0.p(this.f89042e, bVar.f89042e);
    }

    public int hashCode() {
        return C1550p.a(this.f89042e) + a.a(this.f89041d, a.a(this.f89040c, a.a(this.f89039b, K0.K(this.f89038a) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) K0.L(this.f89038a)) + ", textColor=" + ((Object) K0.L(this.f89039b)) + ", iconColor=" + ((Object) K0.L(this.f89040c)) + ", disabledTextColor=" + ((Object) K0.L(this.f89041d)) + ", disabledIconColor=" + ((Object) K0.L(this.f89042e)) + ')';
    }

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f89038a = j10;
        this.f89039b = j11;
        this.f89040c = j12;
        this.f89041d = j13;
        this.f89042e = j14;
    }
}
