package V3;

import androidx.collection.C1550p;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f74612c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f74613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f74614b;

    public i(@NotNull String domain, long j10) {
        G.p(domain, "domain");
        this.f74613a = domain;
        this.f74614b = j10;
    }

    public static /* synthetic */ i d(i iVar, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = iVar.f74613a;
        }
        if ((i10 & 2) != 0) {
            j10 = iVar.f74614b;
        }
        return iVar.c(str, j10);
    }

    @NotNull
    public final String a() {
        return this.f74613a;
    }

    public final long b() {
        return this.f74614b;
    }

    @NotNull
    public final i c(@NotNull String domain, long j10) {
        G.p(domain, "domain");
        return new i(domain, j10);
    }

    @NotNull
    public final String e() {
        return this.f74613a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return G.g(this.f74613a, iVar.f74613a) && this.f74614b == iVar.f74614b;
    }

    public final long f() {
        return this.f74614b;
    }

    public int hashCode() {
        return C1550p.a(this.f74614b) + (this.f74613a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AllowListEntry(domain=" + this.f74613a + ", timeCreated=" + this.f74614b + ")";
    }
}
