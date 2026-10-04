package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import kotlin.C4987s;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class RouteException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IOException f225604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public IOException f225605b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(@NotNull IOException firstConnectException) {
        super(firstConnectException);
        G.p(firstConnectException, "firstConnectException");
        this.f225604a = firstConnectException;
        this.f225605b = firstConnectException;
    }

    public final void a(@NotNull IOException e10) throws IllegalAccessException, InvocationTargetException {
        G.p(e10, "e");
        C4987s.a(this.f225604a, e10);
        this.f225605b = e10;
    }

    @NotNull
    public final IOException d() {
        return this.f225604a;
    }

    @NotNull
    public final IOException g() {
        return this.f225605b;
    }
}
