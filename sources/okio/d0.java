package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 extends C5358h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Socket f225930n;

    public d0(@NotNull Socket socket) {
        kotlin.jvm.internal.G.p(socket, "socket");
        this.f225930n = socket;
    }

    @Override // okio.C5358h
    public void C() {
        try {
            this.f225930n.close();
        } catch (AssertionError e10) {
            if (!Q.j(e10)) {
                throw e10;
            }
            Q.f225874a.log(Level.WARNING, "Failed to close timed out socket " + this.f225930n, (Throwable) e10);
        } catch (Exception e11) {
            Q.f225874a.log(Level.WARNING, "Failed to close timed out socket " + this.f225930n, (Throwable) e11);
        }
    }

    @Override // okio.C5358h
    @NotNull
    public IOException y(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(Jb.d.f58184l);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
