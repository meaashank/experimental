package com.tonyodev.fetch2core;

import Jb.p;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import com.android.launcher3.IconCache;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tonyodev.fetch2core.Downloader;
import dd.j;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.collections.n0;
import kotlin.collections.y0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.F;
import kotlin.text.M;
import org.apache.http.protocol.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nFetchCoreUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchCoreUtils.kt\ncom/tonyodev/fetch2core/FetchCoreUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,419:1\n1#2:420\n*E\n"})
@j(name = "FetchCoreUtils")
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f194466a = "GET";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f194467b = "HEAD";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f194468c = "Accept-Ranges";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f194469d = "accept-ranges";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f194470e = "AcceptRanges";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f194471f = "content-length";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f194472g = "Content-Length";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f194473h = "ContentLength";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f194474i = "Transfer-Encoding";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f194475j = "transfer-encoding";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f194476k = "TransferEncoding";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f194477l = "Content-Range";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String f194478m = "content-range";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f194479n = "ContentRange";

    public static final class a implements p {
        @Override // Jb.p
        public boolean a() {
            return false;
        }
    }

    @NotNull
    public static final p A() {
        return new a();
    }

    public static final int B(@NotNull String url, @NotNull String file) {
        G.p(url, "url");
        G.p(file, "file");
        return file.hashCode() + (url.hashCode() * 31);
    }

    public static final boolean C(long j10, long j11, long j12) {
        return j11 - j10 >= j12;
    }

    public static final boolean D(long j10, long j11, long j12) {
        return TimeUnit.NANOSECONDS.toMillis(j11 - j10) >= j12;
    }

    public static final boolean E(@NotNull String url) {
        G.p(url, "url");
        try {
            if (F.L2(url, "fetchlocal://", false, 2, null) && k(url).length() > 0) {
                if (l(url) > -1) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final boolean F(int i10, @NotNull Map<String, ? extends List<String>> headers) {
        G.p(headers, "headers");
        return a(i10, headers);
    }

    public static final boolean G(@NotNull String path) {
        G.p(path, "path");
        if (path.length() <= 0) {
            path = null;
        }
        if (path != null) {
            return F.L2(path, "content://", false, 2, null) || F.L2(path, R3.a.f67727e, false, 2, null);
        }
        return false;
    }

    public static final boolean H(@NotNull File oldFile, @NotNull File newFile) {
        G.p(oldFile, "oldFile");
        G.p(newFile, "newFile");
        return oldFile.renameTo(newFile);
    }

    public static final void I(@NotNull String filePath, long j10) {
        G.p(filePath, "filePath");
        File fileM = m(filePath);
        if (fileM.exists()) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileM, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.setLength(0L);
                randomAccessFile.writeLong(j10);
            } catch (Exception unused) {
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
            try {
                randomAccessFile.close();
            } catch (Exception unused3) {
            }
        }
    }

    @SuppressLint({"DefaultLocale"})
    public static final boolean a(int i10, @NotNull Map<String, ? extends List<String>> headers) {
        String lowerCase;
        G.p(headers, "headers");
        String strR = r(headers, "Accept-Ranges", f194469d, f194470e);
        String strR2 = r(headers, "Transfer-Encoding", "transfer-encoding", f194476k);
        long jI = i(headers, -1L);
        boolean z10 = i10 == 206 || G.g(strR, "bytes");
        if (jI <= -1 || !z10) {
            if (jI > -1) {
                if (strR2 != null) {
                    lowerCase = strR2.toLowerCase(Locale.ROOT);
                    G.o(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = null;
                }
                if (!G.g(lowerCase, HTTP.CHUNK_CODING)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final long b(long j10, long j11, long j12) {
        if (j11 >= 1 && j10 >= 1 && j12 >= 1) {
            return ((long) Math.abs(Math.ceil((j11 - j10) / j12))) * ((long) 1000);
        }
        return -1L;
    }

    public static final int c(long j10, long j11) {
        if (j11 < 1) {
            return -1;
        }
        if (j10 < 1) {
            return 0;
        }
        if (j10 >= j11) {
            return 100;
        }
        return (int) ((j10 / j11) * ((double) 100));
    }

    @NotNull
    public static final Downloader.a d(@NotNull Downloader.a response) {
        G.p(response, "response");
        return new Downloader.a(response.f194442a, response.f194443b, response.f194444c, null, response.f194446e, response.f194447f, response.f194448g, response.f194449h, response.f194450i);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x002f A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x002f: PHI (r0v3 java.lang.String) = (r0v10 java.lang.String), (r0v7 java.lang.String) binds: [B:23:0x0041, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r1v2 java.io.BufferedReader) = (r1v1 java.io.BufferedReader), (r1v3 java.io.BufferedReader) binds: [B:23:0x0041, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String e(@org.jetbrains.annotations.Nullable java.io.InputStream r3, boolean r4) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L3f
            r3.<init>()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L3f
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L3f
        L17:
            if (r2 == 0) goto L29
            r3.append(r2)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L3f
            r2 = 10
            r3.append(r2)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L3f
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L3f
            goto L17
        L26:
            r3 = move-exception
            r0 = r1
            goto L37
        L29:
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L3f
            if (r4 == 0) goto L44
        L2f:
            r1.close()     // Catch: java.lang.Exception -> L44
            goto L44
        L33:
            r3 = move-exception
            goto L37
        L35:
            r1 = r0
            goto L3f
        L37:
            if (r4 == 0) goto L3e
            if (r0 == 0) goto L3e
            r0.close()     // Catch: java.lang.Exception -> L3e
        L3e:
            throw r3
        L3f:
            if (r4 == 0) goto L44
            if (r1 == 0) goto L44
            goto L2f
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tonyodev.fetch2core.b.e(java.io.InputStream, boolean):java.lang.String");
    }

    public static /* synthetic */ String f(InputStream inputStream, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return e(inputStream, z10);
    }

    public static final void g(@NotNull File file) throws FileNotFoundException {
        G.p(file, "file");
        if (file.exists()) {
            return;
        }
        if (file.getParentFile() != null) {
            File parentFile = file.getParentFile();
            G.m(parentFile);
            if (!parentFile.exists()) {
                File parentFile2 = file.getParentFile();
                G.m(parentFile2);
                if (!parentFile2.mkdirs()) {
                    throw new FileNotFoundException(file + " file_not_found");
                }
                if (file.createNewFile()) {
                    return;
                }
                throw new FileNotFoundException(file + " file_not_found");
            }
        }
        if (file.createNewFile()) {
            return;
        }
        throw new FileNotFoundException(file + " file_not_found");
    }

    public static final boolean h(@NotNull File file) {
        G.p(file, "file");
        if (file.exists() && file.canWrite()) {
            return file.delete();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long i(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r7, long r8) {
        /*
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.G.p(r7, r0)
            java.lang.String r0 = "content-range"
            java.lang.String r1 = "ContentRange"
            java.lang.String r2 = "Content-Range"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.lang.String r1 = r(r7, r0)
            if (r1 == 0) goto L24
            r5 = 6
            r6 = 0
            java.lang.String r2 = "/"
            r3 = 0
            r4 = 0
            int r0 = kotlin.text.M.a4(r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L25
        L24:
            r0 = 0
        L25:
            r2 = -1
            if (r0 == 0) goto L54
            r4 = -1
            int r5 = r0.intValue()
            if (r5 == r4) goto L54
            int r4 = r0.intValue()
            int r5 = r1.length()
            if (r4 >= r5) goto L54
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.String r0 = r1.substring(r0)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.G.o(r0, r1)
            java.lang.Long r0 = kotlin.text.E.t1(r0)
            if (r0 == 0) goto L54
            long r0 = r0.longValue()
            goto L55
        L54:
            r0 = r2
        L55:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L75
            java.lang.String r0 = "Content-Length"
            java.lang.String r1 = "ContentLength"
            java.lang.String r2 = "content-length"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.lang.String r7 = r(r7, r0)
            if (r7 == 0) goto L74
            java.lang.Long r7 = kotlin.text.E.t1(r7)
            if (r7 == 0) goto L74
            long r7 = r7.longValue()
            return r7
        L74:
            return r8
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tonyodev.fetch2core.b.i(java.util.Map, long):long");
    }

    @NotNull
    public static final CookieManager j() {
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        return cookieManager;
    }

    @NotNull
    public static final String k(@NotNull String url) {
        G.p(url, "url");
        int iL3 = M.L3(url, "//", 0, false, 6, null);
        String strSubstring = url.substring(iL3 + 2, M.a4(url, com.prism.gaia.server.accounts.b.f166434b0, 0, false, 6, null));
        G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int l(@NotNull String url) {
        G.p(url, "url");
        String strSubstring = url.substring(M.a4(url, com.prism.gaia.server.accounts.b.f166434b0, 0, false, 6, null) + 1, url.length());
        G.o(strSubstring, "substring(...)");
        int iL3 = M.L3(strSubstring, RemoteSettings.FORWARD_SLASH_STRING, 0, false, 6, null);
        if (iL3 == -1) {
            return Integer.parseInt(strSubstring);
        }
        String strSubstring2 = strSubstring.substring(0, iL3);
        G.o(strSubstring2, "substring(...)");
        return Integer.parseInt(strSubstring2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.File m(@org.jetbrains.annotations.NotNull java.lang.String r1) throws java.io.IOException {
        /*
            java.lang.String r0 = "filePath"
            kotlin.jvm.internal.G.p(r1, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L37
            java.io.File r1 = r0.getParentFile()
            if (r1 == 0) goto L34
            java.io.File r1 = r0.getParentFile()
            kotlin.jvm.internal.G.m(r1)
            boolean r1 = r1.exists()
            if (r1 != 0) goto L34
            java.io.File r1 = r0.getParentFile()
            kotlin.jvm.internal.G.m(r1)
            boolean r1 = r1.mkdirs()
            if (r1 == 0) goto L37
            r0.createNewFile()
            return r0
        L34:
            r0.createNewFile()
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tonyodev.fetch2core.b.m(java.lang.String):java.io.File");
    }

    @Nullable
    public static final String n(@NotNull String file) {
        G.p(file, "file");
        File file2 = new File(file);
        try {
            byte[] bArr = new byte[8192];
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            DigestInputStream digestInputStream = new DigestInputStream(new FileInputStream(file2), messageDigest);
            do {
                try {
                } finally {
                }
            } while (digestInputStream.read(bArr) != -1);
            digestInputStream.close();
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            G.o(string, "toString(...)");
            while (string.length() < 32) {
                string = MBridgeConstans.ENDCARD_URL_TYPE_PL + string;
            }
            return string;
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    public static final String o(@NotNull String url) {
        G.p(url, "url");
        String lastPathSegment = Uri.parse(url).getLastPathSegment();
        return lastPathSegment == null ? "-1" : lastPathSegment;
    }

    @NotNull
    public static final String p(@NotNull Context context) {
        G.p(context, "context");
        return context.getFilesDir().getAbsoluteFile() + "/_fetchData/temp";
    }

    @NotNull
    public static final Uri q(@NotNull String path) {
        G.p(path, "path");
        if (G(path)) {
            Uri uri = Uri.parse(path);
            G.o(uri, "parse(...)");
            return uri;
        }
        Uri uriFromFile = Uri.fromFile(new File(path));
        G.o(uriFromFile, "fromFile(...)");
        return uriFromFile;
    }

    @Nullable
    public static final String r(@NotNull Map<String, ? extends List<String>> headers, @NotNull String... keys) {
        G.p(headers, "headers");
        G.p(keys, "keys");
        int length = keys.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                return null;
            }
            List<String> list = headers.get(keys[i10]);
            String str = list != null ? (String) U.L2(list) : null;
            if (str != null && !M.Q3(str)) {
                return str;
            }
            i10++;
        }
    }

    @NotNull
    public static final File s(@NotNull String originalPath) throws FileNotFoundException {
        G.p(originalPath, "originalPath");
        File file = new File(originalPath);
        if (file.exists()) {
            String strA = androidx.compose.runtime.changelist.j.a(file.getParent(), RemoteSettings.FORWARD_SLASH_STRING);
            String strH0 = kotlin.io.p.h0(file);
            String strJ0 = kotlin.io.p.j0(file);
            int i10 = 0;
            while (file.exists()) {
                i10++;
                file = new File(strA + (strJ0 + " (" + i10 + ")") + IconCache.EMPTY_CLASS_NAME + strH0);
            }
        }
        g(file);
        return file;
    }

    @Nullable
    public static final Long t(@NotNull String filePath) {
        G.p(filePath, "filePath");
        File fileM = m(filePath);
        if (fileM.exists()) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileM, CampaignEx.JSON_KEY_AD_R);
            try {
                try {
                    Long lValueOf = Long.valueOf(randomAccessFile.readLong());
                    try {
                        randomAccessFile.close();
                        return lValueOf;
                    } catch (Exception unused) {
                        return lValueOf;
                    }
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
                randomAccessFile.close();
                return null;
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Exception unused4) {
                }
                throw th;
            }
        }
        return null;
    }

    @NotNull
    public static final String u(@NotNull byte[] bytes, int i10, int i11) {
        G.p(bytes, "bytes");
        try {
            byte[] bArr = new byte[8192];
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            DigestInputStream digestInputStream = new DigestInputStream(new ByteArrayInputStream(bytes, i10, i11), messageDigest);
            do {
                try {
                } finally {
                }
            } while (digestInputStream.read(bArr) != -1);
            digestInputStream.close();
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            G.o(string, "toString(...)");
            while (string.length() < 32) {
                string = MBridgeConstans.ENDCARD_URL_TYPE_PL + string;
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static /* synthetic */ String v(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return u(bArr, i10, i11);
    }

    @NotNull
    public static final Pair<Long, Long> w(@NotNull String range) {
        long j10;
        G.p(range, "range");
        int iA4 = M.a4(range, "=", 0, false, 6, null);
        int iA42 = M.a4(range, com.prism.gaia.download.a.f164606q, 0, false, 6, null);
        String strSubstring = range.substring(iA4 + 1, iA42);
        G.o(strSubstring, "substring(...)");
        long j11 = Long.parseLong(strSubstring);
        try {
            String strSubstring2 = range.substring(iA42 + 1, range.length());
            G.o(strSubstring2, "substring(...)");
            j10 = Long.parseLong(strSubstring2);
        } catch (Exception unused) {
            j10 = -1;
        }
        return new Pair<>(Long.valueOf(j11), Long.valueOf(j10));
    }

    @NotNull
    public static final String x(@NotNull String url) {
        G.p(url, "url");
        try {
            Uri uri = Uri.parse(url);
            return uri.getScheme() + "://" + uri.getAuthority();
        } catch (Exception unused) {
            return "https://google.com";
        }
    }

    public static final long y(@NotNull Downloader.b request, @NotNull Downloader<?, ?> downloader) {
        Map<String, List<String>> mapZ;
        G.p(request, "request");
        G.p(downloader, "downloader");
        try {
            Downloader.a aVarU1 = downloader.U1(request, new a());
            if (aVarU1 == null || (mapZ = aVarU1.f194448g) == null) {
                mapZ = n0.z();
            }
            long jI = i(mapZ, -1L);
            if (aVarU1 != null) {
                downloader.R0(aVarU1);
            }
            return jI;
        } catch (Exception unused) {
            return -1L;
        }
    }

    @NotNull
    public static final Set<Downloader.FileDownloaderType> z(@NotNull Downloader.b request, @NotNull Downloader<?, ?> downloader) {
        G.p(request, "request");
        G.p(downloader, "downloader");
        Set<Downloader.FileDownloaderType> setQ = y0.q(Downloader.FileDownloaderType.SEQUENTIAL);
        try {
            Downloader.a aVarU1 = downloader.U1(request, new a());
            if (aVarU1 != null) {
                if (F(aVarU1.f194442a, aVarU1.f194448g)) {
                    setQ.add(Downloader.FileDownloaderType.PARALLEL);
                }
                downloader.R0(aVarU1);
            }
        } catch (Exception unused) {
        }
        return setQ;
    }
}
