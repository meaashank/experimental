package Fd;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.text.F;
import okhttp3.Protocol;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f40003d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f40004e = 307;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f40005f = 308;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f40006g = 421;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f40007h = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public final Protocol f40008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    public final int f40009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    @NotNull
    public final String f40010c;

    public static final class a {
        public a() {
        }

        @NotNull
        public final k a(@NotNull Response response) {
            G.p(response, "response");
            return new k(response.f225293b, response.f225295d, response.f225294c);
        }

        @NotNull
        public final k b(@NotNull String statusLine) throws IOException {
            Protocol protocol;
            int i10;
            String strSubstring;
            G.p(statusLine, "statusLine");
            if (F.L2(statusLine, "HTTP/1.", false, 2, null)) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException(G.C("Unexpected status line: ", statusLine));
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException(G.C("Unexpected status line: ", statusLine));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!F.L2(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException(G.C("Unexpected status line: ", statusLine));
                }
                protocol = Protocol.HTTP_1_0;
                i10 = 4;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException(G.C("Unexpected status line: ", statusLine));
            }
            try {
                String strSubstring2 = statusLine.substring(i10, i11);
                G.o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i12 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i11) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i11) != ' ') {
                        throw new ProtocolException(G.C("Unexpected status line: ", statusLine));
                    }
                    strSubstring = statusLine.substring(i10 + 4);
                    G.o(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new k(protocol, i12, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(G.C("Unexpected status line: ", statusLine));
            }
        }

        public a(C4969v c4969v) {
        }
    }

    public k(@NotNull Protocol protocol, int i10, @NotNull String message) {
        G.p(protocol, "protocol");
        G.p(message, "message");
        this.f40008a = protocol;
        this.f40009b = i10;
        this.f40010c = message;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f40008a == Protocol.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f40009b);
        sb2.append(' ');
        sb2.append(this.f40010c);
        String string = sb2.toString();
        G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
