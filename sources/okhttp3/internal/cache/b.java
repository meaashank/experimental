package okhttp3.internal.cache;

import java.io.IOException;
import okio.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface b {
    void abort();

    @NotNull
    c0 body() throws IOException;
}
