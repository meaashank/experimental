package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.G;
import okhttp3.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Set<v> f225669a = new LinkedHashSet();

    public final synchronized void a(@NotNull v route) {
        G.p(route, "route");
        this.f225669a.remove(route);
    }

    public final synchronized void b(@NotNull v failedRoute) {
        G.p(failedRoute, "failedRoute");
        this.f225669a.add(failedRoute);
    }

    public final synchronized boolean c(@NotNull v route) {
        G.p(route, "route");
        return this.f225669a.contains(route);
    }
}
