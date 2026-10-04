package kotlin;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C4987s {
    @Xc.e
    @InterfaceC4887e0(version = "1.1")
    public static void a(@NotNull Throwable th, @NotNull Throwable exception) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.G.p(th, "<this>");
        kotlin.jvm.internal.G.p(exception, "exception");
        if (th != exception) {
            Xc.n.f79086a.a(th, exception);
        }
    }

    @NotNull
    public static final StackTraceElement[] b(@NotNull Throwable th) {
        kotlin.jvm.internal.G.p(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        kotlin.jvm.internal.G.m(stackTrace);
        return stackTrace;
    }

    public static /* synthetic */ void c(Throwable th) {
    }

    @NotNull
    public static final List<Throwable> d(@NotNull Throwable th) {
        kotlin.jvm.internal.G.p(th, "<this>");
        return Xc.n.f79086a.d(th);
    }

    @InterfaceC4887e0(version = "1.4")
    public static /* synthetic */ void e(Throwable th) {
    }

    @Xc.f
    public static final void f(Throwable th) {
        kotlin.jvm.internal.G.p(th, "<this>");
        th.printStackTrace();
    }

    @Xc.f
    public static final void g(Throwable th, PrintStream stream) {
        kotlin.jvm.internal.G.p(th, "<this>");
        kotlin.jvm.internal.G.p(stream, "stream");
        th.printStackTrace(stream);
    }

    @Xc.f
    public static final void h(Throwable th, PrintWriter writer) {
        kotlin.jvm.internal.G.p(th, "<this>");
        kotlin.jvm.internal.G.p(writer, "writer");
        th.printStackTrace(writer);
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static String i(@NotNull Throwable th) {
        kotlin.jvm.internal.G.p(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }
}
