package Fd;

import dd.o;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f39986a = new f();

    @o
    public static final boolean b(@NotNull String method) {
        G.p(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    @o
    public static final boolean e(@NotNull String method) {
        G.p(method, "method");
        return method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT");
    }

    public final boolean a(@NotNull String method) {
        G.p(method, "method");
        return method.equals("POST") || method.equals("PATCH") || method.equals("PUT") || method.equals("DELETE") || method.equals("MOVE");
    }

    public final boolean c(@NotNull String method) {
        G.p(method, "method");
        return !method.equals("PROPFIND");
    }

    public final boolean d(@NotNull String method) {
        G.p(method, "method");
        return method.equals("PROPFIND");
    }
}
