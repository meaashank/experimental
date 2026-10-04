package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC4982o(message = "changed in Okio 2.x")
public final class C5352b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5352b f225921a = new C5352b();

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    @NotNull
    public final c0 a(@NotNull File file) {
        kotlin.jvm.internal.G.p(file, "file");
        return Q.b(file);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    @NotNull
    public final c0 b() {
        return new C5359i();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "sink.buffer()", imports = {"okio.buffer"}))
    @NotNull
    public final InterfaceC5361k c(@NotNull c0 sink) {
        kotlin.jvm.internal.G.p(sink, "sink");
        return S.b(sink);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "source.buffer()", imports = {"okio.buffer"}))
    @NotNull
    public final InterfaceC5362l d(@NotNull e0 source) {
        kotlin.jvm.internal.G.p(source, "source");
        return S.c(source);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "file.sink()", imports = {"okio.sink"}))
    @NotNull
    public final c0 e(@NotNull File file) {
        kotlin.jvm.internal.G.p(file, "file");
        return Q.q(file, false, 1, null);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "outputStream.sink()", imports = {"okio.sink"}))
    @NotNull
    public final c0 f(@NotNull OutputStream outputStream) {
        kotlin.jvm.internal.G.p(outputStream, "outputStream");
        return Q.n(outputStream);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "socket.sink()", imports = {"okio.sink"}))
    @NotNull
    public final c0 g(@NotNull Socket socket) {
        kotlin.jvm.internal.G.p(socket, "socket");
        return Q.o(socket);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "path.sink(*options)", imports = {"okio.sink"}))
    @NotNull
    public final c0 h(@NotNull Path path, @NotNull OpenOption... options) {
        kotlin.jvm.internal.G.p(path, "path");
        kotlin.jvm.internal.G.p(options, "options");
        return Q.p(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "file.source()", imports = {"okio.source"}))
    @NotNull
    public final e0 i(@NotNull File file) {
        kotlin.jvm.internal.G.p(file, "file");
        return Q.r(file);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "inputStream.source()", imports = {"okio.source"}))
    @NotNull
    public final e0 j(@NotNull InputStream inputStream) {
        kotlin.jvm.internal.G.p(inputStream, "inputStream");
        return Q.s(inputStream);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "socket.source()", imports = {"okio.source"}))
    @NotNull
    public final e0 k(@NotNull Socket socket) {
        kotlin.jvm.internal.G.p(socket, "socket");
        return Q.t(socket);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "path.source(*options)", imports = {"okio.source"}))
    @NotNull
    public final e0 l(@NotNull Path path, @NotNull OpenOption... options) {
        kotlin.jvm.internal.G.p(path, "path");
        kotlin.jvm.internal.G.p(options, "options");
        return Q.u(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }
}
