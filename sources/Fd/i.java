package Fd;

import java.net.Proxy;
import kotlin.jvm.internal.G;
import okhttp3.HttpUrl;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f39999a = new i();

    @NotNull
    public final String a(@NotNull Request request, @NotNull Proxy.Type proxyType) {
        G.p(request, "request");
        G.p(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.f225287b);
        sb2.append(' ');
        i iVar = f39999a;
        if (iVar.b(request, proxyType)) {
            sb2.append(request.f225286a);
        } else {
            sb2.append(iVar.c(request.f225286a));
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final boolean b(Request request, Proxy.Type type) {
        return !request.f225286a.f225233j && type == Proxy.Type.HTTP;
    }

    @NotNull
    public final String c(@NotNull HttpUrl url) {
        G.p(url, "url");
        String strX = url.x();
        String strZ = url.z();
        if (strZ == null) {
            return strX;
        }
        return strX + '?' + ((Object) strZ);
    }
}
