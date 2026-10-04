package okhttp3;

import java.net.Socket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface h {
    @NotNull
    Protocol a();

    @NotNull
    v b();

    @Nullable
    Handshake c();

    @NotNull
    Socket d();
}
