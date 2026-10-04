package okhttp3;

import kotlin.jvm.internal.G;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class x {
    public void a(@NotNull w webSocket, int i10, @NotNull String reason) {
        G.p(webSocket, "webSocket");
        G.p(reason, "reason");
    }

    public void b(@NotNull w webSocket, int i10, @NotNull String reason) {
        G.p(webSocket, "webSocket");
        G.p(reason, "reason");
    }

    public void c(@NotNull w webSocket, @NotNull Throwable t10, @Nullable Response response) {
        G.p(webSocket, "webSocket");
        G.p(t10, "t");
    }

    public void d(@NotNull w webSocket, @NotNull String text) {
        G.p(webSocket, "webSocket");
        G.p(text, "text");
    }

    public void e(@NotNull w webSocket, @NotNull ByteString bytes) {
        G.p(webSocket, "webSocket");
        G.p(bytes, "bytes");
    }

    public void f(@NotNull w webSocket, @NotNull Response response) {
        G.p(webSocket, "webSocket");
        G.p(response, "response");
    }
}
