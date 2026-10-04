package wa;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import xa.C5800b;

/* JADX INFO: renamed from: wa.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC5771b extends Cloneable {
    Map<String, List<String>> T0();

    int V1() throws IOException;

    /* JADX INFO: renamed from: clone */
    InterfaceC5771b mo52clone();

    void close();

    long getContentLength();

    InputStream getInputStream() throws IOException;

    String j2(String str);

    void m3(C5800b c5800b) throws IOException;

    InputStream r0() throws IOException;
}
