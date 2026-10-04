package U6;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.e0;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.naked.compat.android.content.pm.ApplicationInfoCompat2;
import com.prism.gaia.remote.AppProceedInfo;
import com.prism.gaia.remote.GuestAppInfo;
import g6.C4455a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okio.internal.ZipKt;
import v8.C5703m;
import v8.C5714x;
import y8.C5842a;

/* JADX INFO: loaded from: classes6.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f68744a = "m";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f68745b = "com.google.android.";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f68746c = "com.google.android.gsf";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f68747d = "com.google.android.gms";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f68748e = "com.google";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f68749f = "com.android.vending";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f68750g = "com.google.android.play.games";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f68751h = "com.android.chrome";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f68752i = "app_chimera";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f68753j = "com.google.example.invalidpackage";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final List<String> f68754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final List<String> f68755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Set<String> f68756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List<String> f68757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final List<String> f68758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final List<String> f68759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f68760q = "microg";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f68761r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f68762s = "org.microg.gms.checkin.CheckinService";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f68763t = 45000;

    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f68764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f68765b;

        public a(String str, CountDownLatch countDownLatch) {
            this.f68764a = str;
            this.f68765b = countDownLatch;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                m.l(this.f68764a);
            } catch (Exception unused) {
            }
            this.f68765b.countDown();
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            int i10 = 1;
            while (i10 <= 6) {
                try {
                    Thread.sleep(i10 == 1 ? e0.f86341n : 5000L);
                    Boolean boolE = m.e(0);
                    if (boolE == null) {
                        String unused = m.f68744a;
                    } else {
                        if (!boolE.booleanValue()) {
                            Intent intent = new Intent("android.server.checkin.CHECKIN_NOW");
                            intent.setPackage("com.google.android.gms");
                            C5703m.o().f(intent, null, -1, null, null, false, false, 0);
                            String unused2 = m.f68744a;
                            return;
                        }
                        Intent intent2 = new Intent();
                        intent2.setComponent(new ComponentName("com.google.android.gms", m.f68762s));
                        ComponentName componentNameG0 = C5703m.o().G0(null, intent2, 0);
                        if (componentNameG0 != null && !"!!".equals(componentNameG0.getPackageName())) {
                            String unused3 = m.f68744a;
                            return;
                        } else {
                            String unused4 = m.f68744a;
                            if (componentNameG0 != null) {
                                componentNameG0.getClassName();
                            }
                        }
                    }
                } catch (Throwable th) {
                    String unused5 = m.f68744a;
                    th.getMessage();
                }
                i10++;
            }
            String unused6 = m.f68744a;
        }
    }

    static {
        List<String> listAsList = Arrays.asList("com.android.vending", "com.google.android.play.games");
        f68754k = listAsList;
        List<String> listAsList2 = Arrays.asList("com.google.android.gsf", "com.google.android.gms", "com.google.android.googlequicksearchbox");
        f68755l = listAsList2;
        f68757n = Arrays.asList("libAppDataSearch.so", "libWhisper.so", "libconscrypt_gmscore_jni.so", "libgcastv2_base.so", "libgcastv2_support.so", "libgmscore.so", "libgoogle-ocrclient-v3.so", "libhomeworkinferencejni.so", "libjgcastservice.so", "libjingle_peerconnection_so.so", "libleveldbjni.so", "libnative_old.so", "libpredictor_jni.so", "libsslwrapper_jni.so", "libvcdiffjni.so", "libwearable-selector.so");
        f68758o = Arrays.asList("org.telegram.messenger", "com.twitter.android");
        f68759p = Arrays.asList("com.google.android.gms", "com.android.vending");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f68756m = linkedHashSet;
        linkedHashSet.addAll(listAsList2);
        linkedHashSet.addAll(listAsList);
        f68761r = new Object();
    }

    public static boolean c() {
        synchronized (m.class) {
            try {
                LinkedList linkedList = new LinkedList();
                for (String str : Collections.EMPTY_LIST) {
                    if (C5842a.m().e(str) == null) {
                        linkedList.add(str);
                    } else if (p(str)) {
                        linkedList.add(str);
                    }
                }
                if (linkedList.size() <= 0) {
                    return true;
                }
                CountDownLatch countDownLatch = new CountDownLatch(linkedList.size());
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    new a((String) it.next(), countDownLatch).start();
                }
                try {
                    countDownLatch.await();
                    return true;
                } catch (InterruptedException e10) {
                    e10.getMessage();
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static long d(int i10) {
        File file = new File(new File(D9.d.s(i10, "com.google.android.gms"), "shared_prefs"), "checkin.xml");
        if (!file.isFile()) {
            return 0L;
        }
        try {
            Matcher matcher = Pattern.compile("name=\"androidId\"\\s+value=\"(-?\\d+)\"").matcher(new String(Files.readAllBytes(file.toPath()), "UTF-8"));
            if (matcher.find()) {
                return Long.parseLong(matcher.group(1));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return 0L;
    }

    @Nullable
    public static Boolean e(int i10) {
        if (C5842a.m().e("com.google.android.gms") == null) {
            return null;
        }
        try {
            return Boolean.valueOf(C5714x.j().O(new ComponentName("com.google.android.gms", f68762s), 0, i10) != null);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static boolean f(int i10) {
        Boolean boolE = e(i10);
        if (boolE == null) {
            return false;
        }
        return boolE.booleanValue() ? d(i10) != 0 : q(i10) > 0 || v(new File(r(i10), "CheckinService.xml"), "CheckinTask_securityToken") > 0;
    }

    public static boolean g(int i10) {
        if (e(i10) == null || f(i10)) {
            return true;
        }
        u();
        long jCurrentTimeMillis = System.currentTimeMillis() + f68763t;
        while (System.currentTimeMillis() < jCurrentTimeMillis) {
            try {
                Thread.sleep(1000L);
                if (f(i10)) {
                    d(i10);
                    return true;
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File h(java.lang.String r8) {
        /*
            com.prism.gaia.client.GaiaContext r0 = com.prism.gaia.client.GaiaContext.j()
            android.content.Context r0 = r0.n()
            java.lang.String r1 = "microg/"
            java.lang.String r2 = ".apk"
            java.lang.String r1 = android.support.v4.media.i.a(r1, r8, r2)
            java.io.File r2 = new java.io.File
            java.io.File r3 = r0.getCacheDir()
            java.lang.String r4 = "microg_"
            java.lang.String r8 = w.y.a(r4, r8)
            r2.<init>(r3, r8)
            r2.mkdirs()
            java.io.File r8 = new java.io.File
            java.lang.String r3 = "base.apk"
            r8.<init>(r2, r3)
            r2 = 0
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.io.IOException -> L78 java.io.FileNotFoundException -> Laa
            android.content.res.AssetFileDescriptor r0 = r0.openFd(r1)     // Catch: java.io.IOException -> L78 java.io.FileNotFoundException -> Laa
            java.io.FileInputStream r1 = r0.createInputStream()     // Catch: java.lang.Throwable -> L7a
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7c
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L7c
            r4 = 65536(0x10000, float:9.1835E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L4a
        L3f:
            int r5 = r1.read(r4)     // Catch: java.lang.Throwable -> L4a
            if (r5 <= 0) goto L4c
            r6 = 0
            r3.write(r4, r6, r5)     // Catch: java.lang.Throwable -> L4a
            goto L3f
        L4a:
            r8 = move-exception
            goto L88
        L4c:
            r3.flush()     // Catch: java.lang.Throwable -> L4a
            java.io.FileDescriptor r4 = r3.getFD()     // Catch: java.lang.Throwable -> L4a
            r4.sync()     // Catch: java.lang.Throwable -> L4a
            long r4 = r0.getDeclaredLength()     // Catch: java.lang.Throwable -> L4a
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L7e
            long r6 = r8.length()     // Catch: java.lang.Throwable -> L4a
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 == 0) goto L7e
            r8.length()     // Catch: java.lang.Throwable -> L4a
            r8.delete()     // Catch: java.lang.Throwable -> L4a
            r3.close()     // Catch: java.lang.Throwable -> L7c
            r1.close()     // Catch: java.lang.Throwable -> L7a
            r0.close()     // Catch: java.io.IOException -> L78 java.io.FileNotFoundException -> Laa
            return r2
        L78:
            r8 = move-exception
            goto La7
        L7a:
            r8 = move-exception
            goto L9c
        L7c:
            r8 = move-exception
            goto L91
        L7e:
            r3.close()     // Catch: java.lang.Throwable -> L7c
            r1.close()     // Catch: java.lang.Throwable -> L7a
            r0.close()     // Catch: java.io.IOException -> L78 java.io.FileNotFoundException -> Laa
            return r8
        L88:
            r3.close()     // Catch: java.lang.Throwable -> L8c
            goto L90
        L8c:
            r3 = move-exception
            r8.addSuppressed(r3)     // Catch: java.lang.Throwable -> L7c
        L90:
            throw r8     // Catch: java.lang.Throwable -> L7c
        L91:
            if (r1 == 0) goto L9b
            r1.close()     // Catch: java.lang.Throwable -> L97
            goto L9b
        L97:
            r1 = move-exception
            r8.addSuppressed(r1)     // Catch: java.lang.Throwable -> L7a
        L9b:
            throw r8     // Catch: java.lang.Throwable -> L7a
        L9c:
            if (r0 == 0) goto La6
            r0.close()     // Catch: java.lang.Throwable -> La2
            goto La6
        La2:
            r0 = move-exception
            r8.addSuppressed(r0)     // Catch: java.io.IOException -> L78 java.io.FileNotFoundException -> Laa
        La6:
            throw r8     // Catch: java.io.IOException -> L78 java.io.FileNotFoundException -> Laa
        La7:
            r8.getMessage()
        Laa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U6.m.h(java.lang.String):java.io.File");
    }

    public static Collection<String> i() {
        return Collections.EMPTY_LIST;
    }

    public static Collection<String> j() {
        return new ArrayList(f68756m);
    }

    public static boolean k() {
        try {
            InputStream inputStreamOpen = GaiaContext.j().n().getAssets().open("microg/com.google.android.gms.apk");
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void l(String str) {
        synchronized (f68761r) {
            try {
                m(str);
                if ("com.google.android.gms".equals(str)) {
                    u();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void m(String str) {
        ApplicationInfo applicationInfoS;
        try {
            applicationInfoS = GaiaContext.j().S(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfoS = null;
        }
        if (applicationInfoS == null || applicationInfoS.sourceDir == null) {
            return;
        }
        C5842a.m().l(str, 0);
    }

    public static boolean n(String str) {
        File fileH = h(str);
        if (fileH == null) {
            return false;
        }
        AppProceedInfo appProceedInfoJ = C5842a.m().j(fileH.getAbsolutePath(), 0);
        if (appProceedInfoJ != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(appProceedInfoJ.code);
            sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
            sb2.append(appProceedInfoJ.msg);
        }
        if (!"com.google.android.gms".equals(str) || appProceedInfoJ == null || !appProceedInfoJ.isSuccess()) {
            return true;
        }
        t();
        u();
        return true;
    }

    public static boolean o(String str) {
        return f68756m.contains(str);
    }

    public static boolean p(String str) {
        ApplicationInfo applicationInfo;
        if (k() && !"com.android.vending".equals(str)) {
            return false;
        }
        try {
            PackageInfo packageInfoU = GaiaContext.j().U(str, 0);
            GuestAppInfo guestAppInfoE = C5842a.m().e(str);
            if (packageInfoU != null && (applicationInfo = packageInfoU.applicationInfo) != null && guestAppInfoE != null) {
                return ApplicationInfoCompat2.Util.getLongVersionCode(applicationInfo) > ((((long) guestAppInfoE.versionCodeMajor) << 32) | (((long) guestAppInfoE.versionCode) & ZipKt.f225990j));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static long q(int i10) {
        return v(new File(r(i10), "Checkin.xml"), "CheckinService_lastCheckinSuccessTime");
    }

    public static File r(int i10) {
        return new File(D9.d.s(i10, "com.google.android.gms"), "shared_prefs");
    }

    public static String s(int i10, long j10) {
        Boolean boolE = e(i10);
        if (boolE == null) {
            return "no GMS in the container";
        }
        long jQ = boolE.booleanValue() ? 0L : q(i10);
        long jCurrentTimeMillis = System.currentTimeMillis();
        u();
        long j11 = jCurrentTimeMillis + j10;
        while (System.currentTimeMillis() < j11) {
            try {
                Thread.sleep(1000L);
                if (!boolE.booleanValue()) {
                    long jQ2 = q(i10);
                    if (jQ2 > jQ) {
                        return "real GMS checked in after " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms (lastCheckinSuccessTime " + jQ + " -> " + jQ2 + ")";
                    }
                } else if (d(i10) != 0) {
                    return "microG checked in (androidId present) after " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms";
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(boolE.booleanValue() ? "microG" : "real GMS");
        sb2.append(" did NOT check in within ");
        sb2.append(j10);
        sb2.append("ms");
        return sb2.toString();
    }

    public static void t() {
        try {
            File file = new File(D9.d.s(0, "com.google.android.gms"), "shared_prefs");
            File file2 = new File(file, "com.google.android.gms_preferences.xml");
            if (file2.exists()) {
                return;
            }
            file.mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
            try {
                fileOutputStream.write("<?xml version='1.0' encoding='utf-8' standalone='yes' ?>\n<map>\n    <boolean name=\"checkin_enable_service\" value=\"true\" />\n    <boolean name=\"gcm_enable_mcs_service\" value=\"true\" />\n    <boolean name=\"droidguard_enabled\" value=\"true\" />\n    <boolean name=\"safetynet_enabled\" value=\"true\" />\n</map>\n".getBytes("UTF-8"));
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void u() {
        C4455a.b().e().execute(new b());
    }

    public static long v(File file, String str) {
        if (!file.isFile()) {
            return 0L;
        }
        try {
            Matcher matcher = Pattern.compile("name=\"" + Pattern.quote(str) + "\"\\s+value=\"(-?\\d+)\"").matcher(new String(Files.readAllBytes(file.toPath()), "UTF-8"));
            if (matcher.find()) {
                return Long.parseLong(matcher.group(1));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return 0L;
    }
}
