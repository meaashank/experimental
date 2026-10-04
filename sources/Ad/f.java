package ad;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.InterfaceC4887e0;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class f {
    @InterfaceC4887e0(version = "1.8")
    @InterfaceC1473d
    @NotNull
    public static final InputStream a(@NotNull InputStream inputStream, @NotNull Base64 base64) {
        G.p(inputStream, "<this>");
        G.p(base64, "base64");
        return new C1472c(inputStream, base64);
    }

    @InterfaceC4887e0(version = "1.8")
    @InterfaceC1473d
    @NotNull
    public static final OutputStream b(@NotNull OutputStream outputStream, @NotNull Base64 base64) {
        G.p(outputStream, "<this>");
        G.p(base64, "base64");
        return new kotlin.io.encoding.a(outputStream, base64);
    }
}
