package e7;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.io.GFile;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: e7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4369a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f200282b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f200283c = -2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Set<Long> f200286f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f200281a = "asdf-".concat(C4369a.class.getSimpleName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile long f200284d = -2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f200285e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static long f200287g = -1;

    public static void a(File file, String str) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            FileLock fileLockLock = randomAccessFile.getChannel().lock();
            try {
                randomAccessFile.seek(randomAccessFile.length());
                randomAccessFile.write(str.getBytes("UTF-8"));
            } finally {
                fileLockLock.release();
            }
        } finally {
            randomAccessFile.close();
        }
    }

    public static void b(long j10) {
        if (f200284d == -2 || f200284d == -1) {
            GFile gFileK = D9.d.K();
            try {
                if (gFileK.exists()) {
                    f200284d = -2L;
                    h();
                    return;
                }
                GFile parentFile = gFileK.getParentFile();
                if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
                    long j11 = j10 - 1;
                    if (gFileK.createNewFile()) {
                        FileOutputStream fileOutputStream = new FileOutputStream(gFileK);
                        try {
                            fileOutputStream.write(String.valueOf(j11).getBytes("UTF-8"));
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            fileOutputStream.close();
                            throw th;
                        }
                    }
                    f200284d = -2L;
                    h();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static Set<Long> c() {
        GFile gFileD = d();
        long jLastModified = gFileD.lastModified();
        synchronized (f200285e) {
            try {
                Set<Long> set = f200286f;
                if (set != null && jLastModified == f200287g) {
                    return set;
                }
                HashSet hashSet = new HashSet();
                try {
                    if (gFileD.exists()) {
                        for (String str : f(gFileD).split("\n")) {
                            String strTrim = str.trim();
                            if (strTrim.length() != 0) {
                                try {
                                    hashSet.add(Long.valueOf(Long.parseLong(strTrim)));
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                    synchronized (f200285e) {
                        f200286f = hashSet;
                        f200287g = jLastModified;
                    }
                    return hashSet;
                } catch (Throwable unused2) {
                    return Collections.EMPTY_SET;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static GFile d() {
        return D9.d.k0(GaiaContext.j().Z(), GaiaContext.f164212y.r());
    }

    public static void e(Set<Long> set) {
        try {
            Set<Long> setC = c();
            if (!setC.isEmpty() && !set.containsAll(setC)) {
                StringBuilder sb2 = new StringBuilder();
                HashSet hashSet = new HashSet();
                for (Long l10 : setC) {
                    if (set.contains(l10)) {
                        sb2.append(l10);
                        sb2.append('\n');
                        hashSet.add(l10);
                    }
                }
                GFile gFileD = d();
                RandomAccessFile randomAccessFile = new RandomAccessFile(gFileD, "rw");
                try {
                    FileLock fileLockLock = randomAccessFile.getChannel().lock();
                    try {
                        byte[] bytes = sb2.toString().getBytes("UTF-8");
                        randomAccessFile.seek(0L);
                        randomAccessFile.write(bytes);
                        randomAccessFile.setLength(bytes.length);
                        randomAccessFile.close();
                        synchronized (f200285e) {
                            f200286f = hashSet;
                            f200287g = gFileD.lastModified();
                        }
                        hashSet.size();
                    } finally {
                        fileLockLock.release();
                    }
                } catch (Throwable th) {
                    randomAccessFile.close();
                    throw th;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static String f(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, CampaignEx.JSON_KEY_AD_R);
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            return new String(bArr, "UTF-8");
        } finally {
            randomAccessFile.close();
        }
    }

    public static void g(long j10) {
        try {
            b(j10);
            GFile gFileD = d();
            GFile parentFile = gFileD.getParentFile();
            if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
                a(gFileD, j10 + "\n");
                synchronized (f200285e) {
                    try {
                        Set<Long> set = f200286f;
                        if (set != null) {
                            set.add(Long.valueOf(j10));
                            f200287g = gFileD.lastModified();
                        }
                    } finally {
                    }
                }
                GaiaContext gaiaContext = GaiaContext.f164212y;
                gaiaContext.getClass();
                gaiaContext.Z();
            }
        } catch (Throwable unused) {
        }
    }

    public static long h() {
        long j10 = f200284d;
        if (j10 != -2) {
            return j10;
        }
        GFile gFileK = D9.d.K();
        long j11 = gFileK.exists() ? Long.parseLong(f(gFileK).trim()) : -1L;
        if (j11 != -1) {
            f200284d = j11;
        }
        return j11;
    }
}
