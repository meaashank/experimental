package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import okio.internal.ResourceFileSystem;
import okio.internal.ZipKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f225874a = Logger.getLogger("okio.Okio");

    @NotNull
    public static final c0 b(@NotNull File file) throws FileNotFoundException {
        kotlin.jvm.internal.G.p(file, "<this>");
        return n(new FileOutputStream(file, true));
    }

    @NotNull
    public static final AbstractC5368s c(@NotNull ClassLoader classLoader) {
        kotlin.jvm.internal.G.p(classLoader, "<this>");
        return new ResourceFileSystem(classLoader, true);
    }

    @NotNull
    public static final C5363m d(@NotNull c0 c0Var, @NotNull Cipher cipher) {
        kotlin.jvm.internal.G.p(c0Var, "<this>");
        kotlin.jvm.internal.G.p(cipher, "cipher");
        return new C5363m(S.b(c0Var), cipher);
    }

    @NotNull
    public static final C5364n e(@NotNull e0 e0Var, @NotNull Cipher cipher) {
        kotlin.jvm.internal.G.p(e0Var, "<this>");
        kotlin.jvm.internal.G.p(cipher, "cipher");
        return new C5364n(S.c(e0Var), cipher);
    }

    @NotNull
    public static final C5374y f(@NotNull c0 c0Var, @NotNull MessageDigest digest) {
        kotlin.jvm.internal.G.p(c0Var, "<this>");
        kotlin.jvm.internal.G.p(digest, "digest");
        return new C5374y(c0Var, digest);
    }

    @NotNull
    public static final C5374y g(@NotNull c0 c0Var, @NotNull Mac mac) {
        kotlin.jvm.internal.G.p(c0Var, "<this>");
        kotlin.jvm.internal.G.p(mac, "mac");
        return new C5374y(c0Var, mac);
    }

    @NotNull
    public static final C5375z h(@NotNull e0 e0Var, @NotNull MessageDigest digest) {
        kotlin.jvm.internal.G.p(e0Var, "<this>");
        kotlin.jvm.internal.G.p(digest, "digest");
        return new C5375z(e0Var, digest);
    }

    @NotNull
    public static final C5375z i(@NotNull e0 e0Var, @NotNull Mac mac) {
        kotlin.jvm.internal.G.p(e0Var, "<this>");
        kotlin.jvm.internal.G.p(mac, "mac");
        return new C5375z(e0Var, mac);
    }

    public static final boolean j(@NotNull AssertionError assertionError) {
        kotlin.jvm.internal.G.p(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? kotlin.text.M.p3(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final AbstractC5368s k(@NotNull AbstractC5368s abstractC5368s, @NotNull V zipPath) throws IOException {
        kotlin.jvm.internal.G.p(abstractC5368s, "<this>");
        kotlin.jvm.internal.G.p(zipPath, "zipPath");
        return ZipKt.e(zipPath, abstractC5368s, null, 4, null);
    }

    @dd.k
    @NotNull
    public static final c0 l(@NotNull File file) throws FileNotFoundException {
        kotlin.jvm.internal.G.p(file, "<this>");
        return q(file, false, 1, null);
    }

    @dd.k
    @NotNull
    public static final c0 m(@NotNull File file, boolean z10) throws FileNotFoundException {
        kotlin.jvm.internal.G.p(file, "<this>");
        return n(new FileOutputStream(file, z10));
    }

    @NotNull
    public static final c0 n(@NotNull OutputStream outputStream) {
        kotlin.jvm.internal.G.p(outputStream, "<this>");
        return new U(outputStream, new g0());
    }

    @NotNull
    public static final c0 o(@NotNull Socket socket) throws IOException {
        kotlin.jvm.internal.G.p(socket, "<this>");
        d0 d0Var = new d0(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.G.o(outputStream, "getOutputStream()");
        return d0Var.A(new U(outputStream, d0Var));
    }

    @IgnoreJRERequirement
    @NotNull
    public static final c0 p(@NotNull Path path, @NotNull OpenOption... options) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.G.o(outputStreamNewOutputStream, "newOutputStream(this, *options)");
        return n(outputStreamNewOutputStream);
    }

    public static c0 q(File file, boolean z10, int i10, Object obj) throws FileNotFoundException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m(file, z10);
    }

    @NotNull
    public static final e0 r(@NotNull File file) throws FileNotFoundException {
        kotlin.jvm.internal.G.p(file, "<this>");
        return new B(new FileInputStream(file), g0.f225946e);
    }

    @NotNull
    public static final e0 s(@NotNull InputStream inputStream) {
        kotlin.jvm.internal.G.p(inputStream, "<this>");
        return new B(inputStream, new g0());
    }

    @NotNull
    public static final e0 t(@NotNull Socket socket) throws IOException {
        kotlin.jvm.internal.G.p(socket, "<this>");
        d0 d0Var = new d0(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.G.o(inputStream, "getInputStream()");
        return d0Var.B(new B(inputStream, d0Var));
    }

    @IgnoreJRERequirement
    @NotNull
    public static final e0 u(@NotNull Path path, @NotNull OpenOption... options) throws IOException {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(options, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.G.o(inputStreamNewInputStream, "newInputStream(this, *options)");
        return s(inputStreamNewInputStream);
    }
}
