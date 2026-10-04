package okhttp3;

import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface w {

    public interface a {
        @NotNull
        w b(@NotNull Request request, @NotNull x xVar);
    }

    long b();

    void cancel();

    boolean d(int i10, @Nullable String str);

    boolean f(@NotNull ByteString byteString);

    boolean g(@NotNull String str);

    @NotNull
    Request request();
}
