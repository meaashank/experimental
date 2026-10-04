package okhttp3;

import java.io.IOException;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    @NotNull
    public static final a Companion = new a();

    @NotNull
    private final String protocol;

    public static final class a {
        public a() {
        }

        @dd.o
        @NotNull
        public final Protocol a(@NotNull String protocol) throws IOException {
            G.p(protocol, "protocol");
            Protocol protocol2 = Protocol.HTTP_1_0;
            if (protocol.equals(protocol2.protocol)) {
                return protocol2;
            }
            Protocol protocol3 = Protocol.HTTP_1_1;
            if (protocol.equals(protocol3.protocol)) {
                return protocol3;
            }
            Protocol protocol4 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (protocol.equals(protocol4.protocol)) {
                return protocol4;
            }
            Protocol protocol5 = Protocol.HTTP_2;
            if (protocol.equals(protocol5.protocol)) {
                return protocol5;
            }
            Protocol protocol6 = Protocol.SPDY_3;
            if (protocol.equals(protocol6.protocol)) {
                return protocol6;
            }
            Protocol protocol7 = Protocol.QUIC;
            if (protocol.equals(protocol7.protocol)) {
                return protocol7;
            }
            throw new IOException(G.C("Unexpected protocol: ", protocol));
        }

        public a(C4969v c4969v) {
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    @dd.o
    @NotNull
    public static final Protocol get(@NotNull String str) throws IOException {
        return Companion.a(str);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.protocol;
    }
}
