package okhttp3;

import java.io.IOException;
import okio.g0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface d extends Cloneable {

    public interface a {
        @NotNull
        d a(@NotNull Request request);
    }

    void H2(@NotNull e eVar);

    boolean P();

    boolean U();

    void cancel();

    @NotNull
    /* JADX INFO: renamed from: clone */
    d mo43clone();

    @NotNull
    Response execute() throws IOException;

    @NotNull
    Request request();

    @NotNull
    g0 timeout();
}
