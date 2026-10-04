package com.pgl.ssdk;

import android.content.Context;
import com.tencent.qcloud.core.http.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f161881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f161882b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f161884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f161885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f161886f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f161883c = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f161887g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f161888h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f161889i = 10000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f161890j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f161891k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f161892l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f161893m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private HttpURLConnection f161894n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Runnable f161895o = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m0.this.a() || m0.this.f161891k >= m0.this.f161890j) {
                return;
            }
            m0.c(m0.this);
            o0.a(this);
        }
    }

    public m0(Context context, String str) {
        str = (str == null || str.length() <= 0) ? "" : str;
        this.f161881a = context;
        this.f161882b = str;
    }

    public static /* synthetic */ int c(m0 m0Var) {
        int i10 = m0Var.f161891k;
        m0Var.f161891k = i10 + 1;
        return i10;
    }

    public abstract boolean a(int i10, byte[] bArr);

    private void a(int i10) throws ProtocolException {
        this.f161894n.setRequestMethod(i10 != 1 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? "GET" : f.c.f194278e : "HEAD" : "DELETE" : "PUT" : "POST");
    }

    private void b(int i10) {
        String str = i10 != 1 ? i10 != 2 ? "" : "application/octet-stream" : "application/json; charset=utf-8";
        if (str.length() > 0) {
            this.f161894n.addRequestProperty("Content-Type", str);
        }
        this.f161894n.addRequestProperty("Cookie", "sessionid=" + this.f161882b);
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                this.f161894n.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9");
                return;
            }
            this.f161894n.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9,en-US;q=0.6,en;q=0.4");
        } catch (Throwable unused) {
        }
    }

    private byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr, 0, 1024);
            if (i10 > 0) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[Catch: all -> 0x007d, PHI: r1
      0x0075: PHI (r1v14 java.io.InputStream) = (r1v13 java.io.InputStream), (r1v19 java.io.InputStream) binds: [B:18:0x0072, B:15:0x006e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x007d, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x001f, B:9:0x003c, B:11:0x003f, B:12:0x0055, B:20:0x0075, B:6:0x0017), top: B:36:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[PHI: r1 r2
      0x0083: PHI (r1v1 java.net.HttpURLConnection) = (r1v0 java.net.HttpURLConnection), (r1v15 java.net.HttpURLConnection) binds: [B:25:0x0080, B:22:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0083: PHI (r2v1 boolean) = (r2v0 boolean), (r2v7 boolean) binds: [B:25:0x0080, B:22:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a() {
        /*
            r4 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = r4.f161883c     // Catch: java.lang.Throwable -> L7d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7d
            boolean r2 = r4.f161893m     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto L17
            java.net.Proxy r2 = java.net.Proxy.NO_PROXY     // Catch: java.lang.Throwable -> L7d
            java.net.URLConnection r1 = r1.openConnection(r2)     // Catch: java.lang.Throwable -> L7d
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Throwable -> L7d
            r4.f161894n = r1     // Catch: java.lang.Throwable -> L7d
            goto L1f
        L17:
            java.net.URLConnection r1 = r1.openConnection()     // Catch: java.lang.Throwable -> L7d
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Throwable -> L7d
            r4.f161894n = r1     // Catch: java.lang.Throwable -> L7d
        L1f:
            java.net.HttpURLConnection r1 = r4.f161894n     // Catch: java.lang.Throwable -> L7d
            int r2 = r4.f161889i     // Catch: java.lang.Throwable -> L7d
            r1.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L7d
            java.net.HttpURLConnection r1 = r4.f161894n     // Catch: java.lang.Throwable -> L7d
            int r2 = r4.f161889i     // Catch: java.lang.Throwable -> L7d
            r1.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L7d
            int r1 = r4.f161884d     // Catch: java.lang.Throwable -> L7d
            r4.a(r1)     // Catch: java.lang.Throwable -> L7d
            int r1 = r4.f161885e     // Catch: java.lang.Throwable -> L7d
            r4.b(r1)     // Catch: java.lang.Throwable -> L7d
            byte[] r1 = r4.f161886f     // Catch: java.lang.Throwable -> L7d
            r2 = 1
            if (r1 == 0) goto L55
            int r1 = r1.length     // Catch: java.lang.Throwable -> L7d
            if (r1 <= 0) goto L55
            java.net.HttpURLConnection r1 = r4.f161894n     // Catch: java.lang.Throwable -> L7d
            r1.setDoOutput(r2)     // Catch: java.lang.Throwable -> L7d
            java.net.HttpURLConnection r1 = r4.f161894n     // Catch: java.lang.Throwable -> L7d
            java.io.OutputStream r1 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L7d
            byte[] r3 = r4.f161886f     // Catch: java.lang.Throwable -> L7d
            r1.write(r3)     // Catch: java.lang.Throwable -> L7d
            r1.flush()     // Catch: java.lang.Throwable -> L7d
            r1.close()     // Catch: java.lang.Throwable -> L7d
        L55:
            java.net.HttpURLConnection r1 = r4.f161894n     // Catch: java.lang.Throwable -> L7d
            r1.connect()     // Catch: java.lang.Throwable -> L7d
            java.net.HttpURLConnection r1 = r4.f161894n     // Catch: java.lang.Throwable -> L71
            int r1 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L71
            r4.f161887g = r1     // Catch: java.lang.Throwable -> L71
            java.net.HttpURLConnection r1 = r4.f161894n     // Catch: java.lang.Throwable -> L71
            java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Throwable -> L71
            byte[] r3 = r4.a(r1)     // Catch: java.lang.Throwable -> L72
            r4.f161888h = r3     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L78
            goto L75
        L71:
            r1 = r0
        L72:
            if (r1 != 0) goto L75
            goto L78
        L75:
            r1.close()     // Catch: java.lang.Throwable -> L7d
        L78:
            java.net.HttpURLConnection r1 = r4.f161894n
            if (r1 == 0) goto L88
            goto L83
        L7d:
            java.net.HttpURLConnection r1 = r4.f161894n
            r2 = 0
            if (r1 != 0) goto L83
            goto L88
        L83:
            r1.disconnect()
            r4.f161894n = r0
        L88:
            if (r2 == 0) goto L91
            int r0 = r4.f161887g
            byte[] r1 = r4.f161888h
            r4.a(r0, r1)
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.m0.a():boolean");
    }

    private void b(int i10, int i11, byte[] bArr) {
        this.f161884d = i10;
        this.f161885e = i11;
        this.f161886f = bArr;
    }

    public void a(int i10, int i11, byte[] bArr) {
        b(i10, i11, bArr);
        o0.a(this.f161895o);
    }
}
