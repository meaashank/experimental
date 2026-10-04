package mozilla.components.lib.fetch.httpurlconnection;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zd.i;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final HttpURLConnection f221197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull HttpURLConnection connection, @NotNull InputStream stream, boolean z10, @Nullable String str) {
        super(z10 ? new GZIPInputStream(stream) : stream, str);
        G.p(connection, "connection");
        G.p(stream, "stream");
        this.f221197d = connection;
    }

    @Override // zd.i.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.f221197d.disconnect();
    }
}
