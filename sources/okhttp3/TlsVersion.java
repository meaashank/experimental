package okhttp3;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    @NotNull
    public static final a Companion = new a();

    @NotNull
    private final String javaName;

    public static final class a {
        public a() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @dd.o
        @NotNull
        public final TlsVersion a(@NotNull String javaName) {
            G.p(javaName, "javaName");
            int iHashCode = javaName.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return TlsVersion.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return TlsVersion.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return TlsVersion.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return TlsVersion.TLS_1_0;
                }
            } else if (javaName.equals("SSLv3")) {
                return TlsVersion.SSL_3_0;
            }
            throw new IllegalArgumentException(G.C("Unexpected TLS version: ", javaName));
        }

        public a(C4969v c4969v) {
        }
    }

    TlsVersion(String str) {
        this.javaName = str;
    }

    @dd.o
    @NotNull
    public static final TlsVersion forJavaName(@NotNull String str) {
        return Companion.a(str);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "javaName", imports = {}))
    @dd.j(name = "-deprecated_javaName")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m42deprecated_javaName() {
        return this.javaName;
    }

    @dd.j(name = "javaName")
    @NotNull
    public final String javaName() {
        return this.javaName;
    }
}
