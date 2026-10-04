package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.G;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f225792a = new k();

    @dd.k
    @dd.o
    @NotNull
    public static final String a(@NotNull String username, @NotNull String password) {
        G.p(username, "username");
        G.p(password, "password");
        return c(username, password, null, 4, null);
    }

    @dd.k
    @dd.o
    @NotNull
    public static final String b(@NotNull String username, @NotNull String password, @NotNull Charset charset) {
        G.p(username, "username");
        G.p(password, "password");
        G.p(charset, "charset");
        return G.C("Basic ", ByteString.f225866d.j(username + ':' + password, charset).h());
    }

    public static /* synthetic */ String c(String str, String str2, Charset ISO_8859_1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            ISO_8859_1 = StandardCharsets.ISO_8859_1;
            G.o(ISO_8859_1, "ISO_8859_1");
        }
        return b(str, str2, ISO_8859_1);
    }
}
