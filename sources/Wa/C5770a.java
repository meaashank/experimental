package wa;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import xa.C5800b;

/* JADX INFO: renamed from: wa.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5770a implements InterfaceC5771b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public URLConnection f240175a;

    @Override // wa.InterfaceC5771b
    public Map<String, List<String>> T0() {
        return this.f240175a.getHeaderFields();
    }

    @Override // wa.InterfaceC5771b
    public int V1() throws IOException {
        URLConnection uRLConnection = this.f240175a;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return 0;
    }

    public final void a(C5800b c5800b) {
        HashMap<String, List<String>> mapT = c5800b.t();
        if (mapT != null) {
            for (Map.Entry<String, List<String>> entry : mapT.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (value != null) {
                    Iterator<String> it = value.iterator();
                    while (it.hasNext()) {
                        this.f240175a.addRequestProperty(key, it.next());
                    }
                }
            }
        }
    }

    @Override // wa.InterfaceC5771b
    public long getContentLength() {
        try {
            return Long.parseLong(this.f240175a.getHeaderField("Content-Length"));
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // wa.InterfaceC5771b
    public InputStream getInputStream() throws IOException {
        return this.f240175a.getInputStream();
    }

    @Override // wa.InterfaceC5771b
    public String j2(String str) {
        return this.f240175a.getHeaderField(str);
    }

    @Override // wa.InterfaceC5771b
    public void m3(C5800b c5800b) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(c5800b.I()).openConnection();
        this.f240175a = uRLConnectionOpenConnection;
        uRLConnectionOpenConnection.setReadTimeout(c5800b.A());
        this.f240175a.setConnectTimeout(c5800b.n());
        this.f240175a.addRequestProperty("Range", String.format(Locale.ENGLISH, "bytes=%d-", Long.valueOf(c5800b.p())));
        this.f240175a.addRequestProperty("User-Agent", c5800b.J());
        a(c5800b);
        this.f240175a.connect();
    }

    @Override // wa.InterfaceC5771b
    public InputStream r0() {
        URLConnection uRLConnection = this.f240175a;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getErrorStream();
        }
        return null;
    }

    @Override // wa.InterfaceC5771b
    public InterfaceC5771b clone() {
        return new C5770a();
    }

    @Override // wa.InterfaceC5771b
    public void close() {
    }
}
