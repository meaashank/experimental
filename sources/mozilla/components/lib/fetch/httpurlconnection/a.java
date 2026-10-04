package mozilla.components.lib.fetch.httpurlconnection;

import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.G;
import kotlin.text.C5013e;
import zd.i;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i.a {
    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        byte[] bytes = "".getBytes(C5013e.f218326b);
        G.o(bytes, "getBytes(...)");
        super(new ByteArrayInputStream(bytes), null, 2, null);
    }
}
