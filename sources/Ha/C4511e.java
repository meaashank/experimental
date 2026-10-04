package ha;

import androidx.compose.ui.input.pointer.C2151s;
import ha.x;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: ha.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4511e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f202518l = 60000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f202519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f202520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f202521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutorService f202522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, List<b>> f202523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, Integer> f202524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<String, Long> f202525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<String, Long> f202526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<String, String> f202527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set<String> f202528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile long f202529k;

    /* JADX INFO: renamed from: ha.e$a */
    public interface a {
        InputStream open(String str) throws IOException;
    }

    /* JADX INFO: renamed from: ha.e$b */
    public interface b {
        void a(File file, IOException iOException);
    }

    /* JADX INFO: renamed from: ha.e$c */
    public static final class c implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f202530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f202531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f202532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HttpURLConnection f202533d;

        public c(InputStream inputStream, boolean z10) {
            this(inputStream, z10, -1L, null);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.f202530a.close();
            } finally {
                HttpURLConnection httpURLConnection = this.f202533d;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }

        public c(InputStream inputStream, boolean z10, long j10) {
            this(inputStream, z10, j10, null);
        }

        public c(InputStream inputStream, boolean z10, long j10, HttpURLConnection httpURLConnection) {
            this.f202530a = inputStream;
            this.f202531b = z10;
            this.f202532c = j10;
            this.f202533d = httpURLConnection;
        }
    }

    /* JADX INFO: renamed from: ha.e$d */
    public interface d {
        c a(String str, long j10) throws IOException;
    }

    public C4511e(File file, long j10, a aVar) {
        this(file, j10, aVar, new C4509c());
    }

    public static String c(String str) {
        return "bundled_" + m(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void d(File file, File file2) throws IOException {
        if (!file.renameTo(file2)) {
            throw new IOException("Cannot commit asset");
        }
    }

    public static void e(InputStream inputStream, FileOutputStream fileOutputStream, long j10) throws IOException {
        byte[] bArr = new byte[32768];
        long j11 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            }
            j11 += (long) i10;
            if (j11 > j10) {
                throw new IOException("Resource exceeds size limit");
            }
            fileOutputStream.write(bArr, 0, i10);
        }
    }

    public static void g(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException("Cannot remove asset");
        }
    }

    public static String m(byte[] bArr) {
        try {
            return n(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public static String n(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(String.format(Locale.ROOT, "%02x", Integer.valueOf(b10 & 255)));
        }
        return sb2.toString();
    }

    public static String p(x.b bVar) {
        return bVar.f202604a.isEmpty() ? c(bVar.f202606c) : bVar.f202605b;
    }

    public static c r(String str, long j10) throws IOException {
        long jS;
        for (int i10 = 0; i10 <= 3; i10++) {
            if (!x.g(str)) {
                throw new IOException("Asset transport requires HTTPS");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(8000);
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            if (j10 > 0) {
                httpURLConnection.setRequestProperty("Range", C2151s.a("bytes=", j10, com.prism.gaia.download.a.f164606q));
            }
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    if (responseCode != 200 && responseCode != 206) {
                        throw new IOException("Asset HTTP " + responseCode);
                    }
                    if (responseCode == 206) {
                        String headerField = httpURLConnection.getHeaderField("Content-Range");
                        if (headerField != null) {
                            if (headerField.startsWith("bytes " + j10 + com.prism.gaia.download.a.f164606q)) {
                                int iLastIndexOf = headerField.lastIndexOf(47);
                                if (iLastIndexOf < 0) {
                                    throw new IOException("Invalid partial response");
                                }
                                jS = s(headerField.substring(iLastIndexOf + 1));
                            }
                        }
                        throw new IOException("Invalid partial response");
                    }
                    jS = s(httpURLConnection.getHeaderField("Content-Length"));
                    return new c(httpURLConnection.getInputStream(), responseCode == 206, jS, httpURLConnection);
                }
                String headerField2 = httpURLConnection.getHeaderField("Location");
                if (headerField2 == null) {
                    throw new IOException("Missing redirect target");
                }
                str = new URL(new URL(str), headerField2).toString();
                httpURLConnection.disconnect();
            } catch (IOException e10) {
                httpURLConnection.disconnect();
                throw e10;
            }
        }
        throw new IOException("Too many asset redirects");
    }

    public static long s(String str) throws IOException {
        if (str == null || str.equals("*")) {
            return -1L;
        }
        try {
            long j10 = Long.parseLong(str);
            if (j10 >= 0) {
                return j10;
            }
        } catch (NumberFormatException unused) {
        }
        throw new IOException("Invalid resource length");
    }

    public static String y(File file) throws IOException {
        BufferedInputStream bufferedInputStream;
        MessageDigest messageDigest;
        byte[] bArr;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                bArr = new byte[32768];
            } finally {
            }
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
        while (true) {
            int i10 = bufferedInputStream.read(bArr);
            if (i10 == -1) {
                String strN = n(messageDigest.digest());
                bufferedInputStream.close();
                return strN;
            }
            messageDigest.update(bArr, 0, i10);
            throw new AssertionError(e10);
        }
    }

    public synchronized void A(x.b bVar) {
        B(p(bVar));
        if (!bVar.f202604a.isEmpty() && !bVar.f202606c.isEmpty()) {
            B(c(bVar.f202606c));
        }
    }

    public final void B(String str) {
        Integer num = this.f202524f.get(str);
        if (num == null || num.intValue() <= 1) {
            this.f202524f.remove(str);
        } else {
            this.f202524f.put(str, Integer.valueOf(num.intValue() - 1));
        }
    }

    public final void f(InputStream inputStream, FileOutputStream fileOutputStream, String str, long j10, long j11, boolean z10) throws IOException {
        byte[] bArr = new byte[32768];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            }
            j10 += (long) i10;
            if (j10 > j11) {
                throw new IOException("Resource exceeds size limit");
            }
            if (!z10) {
                w(str, j10);
            }
            fileOutputStream.write(bArr, 0, i10);
        }
    }

    public final void h(x.b bVar, b bVar2, IOException iOException) {
        if (!bVar.f202606c.isEmpty()) {
            try {
                String strC = c(bVar.f202606c);
                synchronized (this) {
                    bVar2.a(o(bVar.f202606c, strC), null);
                }
                return;
            } catch (IOException unused) {
            }
        }
        if (iOException == null) {
            iOException = new IOException("Asset unavailable");
        }
        bVar2.a(null, iOException);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.File i(ha.x.b r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ha.C4511e.i(ha.x$b):java.io.File");
    }

    public final void j() throws IOException {
        if (!this.f202519a.isDirectory() && !this.f202519a.mkdirs() && !this.f202519a.isDirectory()) {
            throw new IOException("No asset directory");
        }
    }

    public final synchronized File k(x.b bVar) throws IOException {
        String strP = p(bVar);
        File file = new File(this.f202519a, strP + ".data");
        if (bVar.f202604a.isEmpty() && !this.f202528j.contains(strP)) {
            return null;
        }
        if (!file.isFile()) {
            return null;
        }
        if (!bVar.f202604a.isEmpty() && (file.length() <= 0 || file.length() > x.b.f202603e || (bVar.f202607d > 0 && file.length() != bVar.f202607d))) {
            g(file);
            return null;
        }
        String str = strP + com.prism.gaia.server.accounts.b.f166434b0 + file.length() + com.prism.gaia.server.accounts.b.f166434b0 + file.lastModified();
        if (!bVar.f202604a.isEmpty() && !str.equals(this.f202527i.get(strP))) {
            if (!y(file).equals(bVar.f202605b)) {
                g(file);
                return null;
            }
            this.f202527i.put(strP, str);
        }
        file.setLastModified(System.currentTimeMillis());
        this.f202527i.put(strP, strP + com.prism.gaia.server.accounts.b.f166434b0 + file.length() + com.prism.gaia.server.accounts.b.f166434b0 + file.lastModified());
        return file;
    }

    public void l(final x.b bVar, final boolean z10, final b bVar2) {
        final String strP = p(bVar);
        this.f202522d.execute(new Runnable() { // from class: ha.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f202513a.q(bVar, bVar2, strP, z10);
            }
        });
    }

    public final synchronized File o(String str, String str2) throws IOException {
        j();
        File file = new File(this.f202519a, str2 + ".data");
        if (this.f202528j.contains(str2) && file.isFile() && file.length() > 0) {
            return file;
        }
        File file2 = new File(this.f202519a, str2 + ".part");
        InputStream inputStreamOpen = this.f202520b.open(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                e(inputStreamOpen, fileOutputStream, M6.b.f58839f);
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                inputStreamOpen.close();
                synchronized (this) {
                    w(str2, file2.length());
                    try {
                        d(file2, file);
                        this.f202528j.add(str2);
                    } finally {
                        this.f202526h.remove(str2);
                    }
                }
                return file;
            } finally {
            }
        } finally {
        }
    }

    public final /* synthetic */ void q(x.b bVar, b bVar2, String str, boolean z10) {
        IOException iOException;
        File fileO;
        List<b> listRemove;
        try {
            File fileK = k(bVar);
            if (fileK != null) {
                bVar2.a(fileK, null);
                return;
            }
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                try {
                    File fileK2 = k(bVar);
                    if (fileK2 != null) {
                        bVar2.a(fileK2, null);
                        return;
                    }
                } finally {
                }
            } catch (IOException unused2) {
            }
            List<b> list = this.f202523e.get(str);
            if (list != null) {
                list.add(bVar2);
                return;
            }
            if (!bVar.f202604a.isEmpty() && (!z10 || v(str))) {
                h(bVar, bVar2, new IOException("Asset not cached; network deferred"));
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bVar2);
            this.f202523e.put(str, arrayList);
            try {
                fileO = bVar.f202604a.isEmpty() ? o(bVar.f202606c, str) : i(bVar);
                iOException = null;
            } catch (IOException e10) {
                synchronized (this) {
                    this.f202525g.put(str, Long.valueOf(System.currentTimeMillis()));
                    iOException = e10;
                    fileO = null;
                }
            }
            synchronized (this) {
                listRemove = this.f202523e.remove(str);
                this.f202526h.remove(str);
            }
            for (b bVar3 : listRemove) {
                if (fileO == null) {
                    try {
                        h(bVar, bVar3, iOException);
                    } catch (RuntimeException unused3) {
                    }
                } else {
                    bVar3.a(fileO, null);
                }
            }
        }
    }

    public synchronized void t(x.b bVar) {
        u(p(bVar));
        if (!bVar.f202604a.isEmpty() && !bVar.f202606c.isEmpty()) {
            u(c(bVar.f202606c));
        }
    }

    public final void u(String str) {
        Map<String, Integer> map = this.f202524f;
        map.put(str, Integer.valueOf(map.containsKey(str) ? 1 + this.f202524f.get(str).intValue() : 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean v(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.Map<java.lang.String, java.lang.Long> r0 = r4.f202525g     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L1d
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L1d
            if (r5 == 0) goto L1f
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1d
            long r2 = r5.longValue()     // Catch: java.lang.Throwable -> L1d
            long r0 = r0 - r2
            r2 = 60000(0xea60, double:2.9644E-319)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L1f
            r5 = 1
            goto L20
        L1d:
            r5 = move-exception
            goto L22
        L1f:
            r5 = 0
        L20:
            monitor-exit(r4)
            return r5
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ha.C4511e.v(java.lang.String):boolean");
    }

    public final synchronized void w(String str, long j10) throws IOException {
        try {
            File[] fileArrListFiles = this.f202519a.listFiles();
            if (fileArrListFiles == null) {
                throw new IOException("Cannot inspect cache");
            }
            long length = j10;
            for (Map.Entry<String, Long> entry : this.f202526h.entrySet()) {
                if (!entry.getKey().equals(str)) {
                    length += entry.getValue().longValue();
                }
            }
            for (File file : fileArrListFiles) {
                String str2 = file.getName().split("\\.")[0];
                if (!str2.equals(str) && !this.f202526h.containsKey(str2)) {
                    length += file.length();
                }
            }
            Arrays.sort(fileArrListFiles, Comparator.comparingLong(new C4508b()));
            for (File file2 : fileArrListFiles) {
                if (length <= this.f202529k) {
                    break;
                }
                String str3 = file2.getName().split("\\.")[0];
                if (!str3.equals(str) && !this.f202524f.containsKey(str3) && !this.f202523e.containsKey(str3)) {
                    long length2 = file2.length();
                    if (file2.delete()) {
                        length -= length2;
                    }
                }
            }
            if (length > this.f202529k) {
                throw new IOException("Active assets exceed cache budget");
            }
            this.f202526h.put(str, Long.valueOf(j10));
        } catch (Throwable th) {
            throw th;
        }
    }

    public void x(long j10) {
        this.f202529k = j10;
    }

    public void z() {
        this.f202522d.shutdown();
    }

    public C4511e(File file, long j10, a aVar, d dVar) {
        this.f202522d = Executors.newFixedThreadPool(2);
        this.f202523e = new HashMap();
        this.f202524f = new HashMap();
        this.f202525g = new HashMap();
        this.f202526h = new HashMap();
        this.f202527i = new HashMap();
        this.f202528j = new HashSet();
        this.f202519a = file;
        this.f202529k = j10;
        this.f202520b = aVar;
        this.f202521c = dVar;
    }
}
