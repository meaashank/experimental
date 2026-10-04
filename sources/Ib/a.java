package Ib;

import Jb.g;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g<Boolean> f52987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f52988b;

    public a(@NotNull g<Boolean> fetchObserver, boolean z10) {
        G.p(fetchObserver, "fetchObserver");
        this.f52987a = fetchObserver;
        this.f52988b = z10;
    }

    @NotNull
    public final g<Boolean> a() {
        return this.f52987a;
    }

    public final boolean b() {
        return this.f52988b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        G.n(obj, "null cannot be cast to non-null type com.tonyodev.fetch2.util.ActiveDownloadInfo");
        return G.g(this.f52987a, ((a) obj).f52987a);
    }

    public int hashCode() {
        return this.f52987a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ActiveDownloadInfo(fetchObserver=" + this.f52987a + ", includeAddedDownloads=" + this.f52988b + ")";
    }
}
