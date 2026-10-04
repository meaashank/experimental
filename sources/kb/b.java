package Kb;

import com.tonyodev.fetch2core.server.FileRequest;
import com.tonyodev.fetch2core.server.FileResponse;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketAddress;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58542a = a.f58544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58543b = 8192;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f58544a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f58545b = 8192;
    }

    @Nullable
    FileRequest a();

    int c(@NotNull byte[] bArr, int i10, int i11);

    void close();

    void e(@NotNull SocketAddress socketAddress);

    @Nullable
    FileResponse g();

    @NotNull
    InputStream getInputStream();

    @NotNull
    OutputStream getOutputStream();

    boolean isClosed();
}
