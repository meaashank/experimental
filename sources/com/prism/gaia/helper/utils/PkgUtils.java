package com.prism.gaia.helper.utils;

import a7.C1452b;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.compat.NativeLibraryHelperCompat;
import com.prism.gaia.server.pm.C4182q;
import com.prism.gaia.server.pm.PackageG;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.H0;
import kotlin.jvm.internal.T;
import s0.x;

/* JADX INFO: loaded from: classes6.dex */
public class PkgUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f165062a = "asdf-".concat(PkgUtils.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f165063b = "com.xiaomi.market";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f165064c = 24;

    public enum DependStatus {
        DEFAULT,
        MUST
    }

    public static void a(LinkedHashMap<String, DependStatus> linkedHashMap, String str, DependStatus dependStatus) {
        linkedHashMap.put(str, dependStatus);
    }

    public static void b(LinkedHashMap<String, DependStatus> linkedHashMap, Collection<String> collection, DependStatus dependStatus) {
        if (collection == null) {
            return;
        }
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), dependStatus);
        }
    }

    public static String c(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, boolean z10) {
        if (i13 < 0 || i13 >= i12) {
            return null;
        }
        int i14 = byteBuffer.getInt((i13 * 4) + i10) + i11;
        int i15 = 0;
        if (!z10) {
            short s10 = byteBuffer.getShort(i14);
            int i16 = s10 & H0.f217455d;
            int i17 = i14 + 2;
            if ((Short.MIN_VALUE & s10) != 0) {
                i16 = (byteBuffer.getShort(i17) & H0.f217455d) | ((s10 & T.f217908c) << 16);
                i17 = i14 + 4;
            }
            char[] cArr = new char[i16];
            while (i15 < i16) {
                cArr[i15] = (char) (byteBuffer.getShort((i15 * 2) + i17) & H0.f217455d);
                i15++;
            }
            return new String(cArr);
        }
        int i18 = i14 + 1;
        if ((byteBuffer.get(i14) & 128) != 0) {
            byteBuffer.get(i18);
            i18 = i14 + 2;
        }
        int i19 = i18 + 1;
        byte b10 = byteBuffer.get(i18);
        int i20 = b10 & 255;
        if ((b10 & 128) != 0) {
            i20 = ((b10 & 127) << 8) | (byteBuffer.get(i19) & 255);
            i19 = i18 + 2;
        }
        byte[] bArr = new byte[i20];
        while (i15 < i20) {
            bArr[i15] = byteBuffer.get(i19 + i15);
            i15++;
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static LinkedHashMap<String, DependStatus> d(PackageG packageG) {
        LinkedHashMap<String, DependStatus> linkedHashMap = new LinkedHashMap<>();
        if (!"com.google.android.gsf".equals(packageG.f167512o)) {
            if ("com.google.android.gms".equals(packageG.f167512o)) {
                linkedHashMap.put("com.google.android.gsf", DependStatus.MUST);
                return linkedHashMap;
            }
            if ("com.android.vending".equals(packageG.f167512o) || "com.google.android.play.games".equals(packageG.f167512o)) {
                linkedHashMap.put("com.google.android.gms", DependStatus.MUST);
                return linkedHashMap;
            }
            if (packageG.s("com.huawei.hms.activity.BridgeActivity") || packageG.s("com.huawei.android.hms.agent.common.HMSAgentActivity") || packageG.s("com.huawei.android.hms.agent.hwid.HMSSignInAgentActivity") || packageG.s("com.huawei.android.hms.agent.pay.HMSPayAgentActivity")) {
                linkedHashMap.put("com.huawei.hwid", DependStatus.DEFAULT);
            }
            if (f165063b.equals(packageG.f167512o)) {
                DependStatus dependStatus = DependStatus.DEFAULT;
                linkedHashMap.put("com.xiaomi.xmsf", dependStatus);
                linkedHashMap.put("com.xiaomi.account", dependStatus);
            }
            if (packageG.w("com.google.android.gms.version")) {
                U6.m.i();
                b(linkedHashMap, Collections.EMPTY_LIST, DependStatus.DEFAULT);
            }
        }
        return linkedHashMap;
    }

    public static String e(ApplicationInfo applicationInfo) {
        String str = applicationInfo.publicSourceDir;
        return str != null ? str : applicationInfo.sourceDir;
    }

    public static String f(String str) {
        return y(str, "package");
    }

    public static String g(String str) {
        return y(str, "split");
    }

    @TargetApi(21)
    public static String[] h(ApplicationInfo applicationInfo) {
        String[] strArr = applicationInfo.splitPublicSourceDirs;
        return strArr != null ? strArr : applicationInfo.splitSourceDirs;
    }

    public static String i(ApplicationInfo applicationInfo, String str) {
        return NativeLibraryHelperCompat.g(applicationInfo.nativeLibraryDir, applicationInfo.packageName, str);
    }

    public static String j(Context context, String str) {
        String strD = a7.c.d(str);
        if (strD == null) {
            return null;
        }
        return context.getResources().getString(context.getResources().getIdentifier(strD, x.b.f238264e, GaiaContext.j().v()));
    }

    public static String k(Context context, String str) {
        String strE = a7.c.e(str);
        if (strE == null) {
            return null;
        }
        return context.getResources().getString(context.getResources().getIdentifier(strE, x.b.f238264e, GaiaContext.j().v()));
    }

    public static boolean l(String str) {
        return GaiaContext.j().g0(str);
    }

    public static boolean m(ApplicationInfo applicationInfo) {
        if (C1452b.b(applicationInfo.packageName)) {
            return false;
        }
        return U6.c.X(applicationInfo.packageName) || r(applicationInfo.packageName) || a7.c.l(applicationInfo.packageName) || a7.c.k(applicationInfo.packageName) || U6.m.o(applicationInfo.packageName);
    }

    public static boolean n(ApplicationInfo applicationInfo) {
        if (C1452b.b(applicationInfo.packageName)) {
            return false;
        }
        return U6.c.X(applicationInfo.packageName) || q(applicationInfo);
    }

    public static boolean o(String str) {
        return U6.c.f() >= 24 && !U6.m.o(str);
    }

    public static boolean p(ApplicationInfo applicationInfo) {
        int i10 = applicationInfo.flags;
        return (i10 & 1) > 0 || (i10 & 128) != 0;
    }

    public static boolean q(ApplicationInfo applicationInfo) {
        if (a7.c.l(applicationInfo.packageName)) {
            return false;
        }
        if (a7.c.f84765j.contains(applicationInfo.packageName)) {
            return false;
        }
        return a7.c.k(applicationInfo.packageName) || p(applicationInfo);
    }

    public static boolean r(@Nullable String str) {
        return TextUtils.isEmpty(str) || "system".equals(str) || "android".equals(str) || "com.android.systemui".equals(str);
    }

    public static boolean s(String str) {
        return a7.c.i(str);
    }

    public static boolean t(ApplicationInfo applicationInfo) {
        if (U6.c.X(applicationInfo.packageName) || !u(applicationInfo.packageName)) {
            return false;
        }
        if (a7.c.f84766k.contains(applicationInfo.packageName)) {
            return false;
        }
        if (q(applicationInfo)) {
            return a7.c.f84776u.contains(applicationInfo.packageName);
        }
        return true;
    }

    public static boolean u(String str) {
        return !a7.c.l(str);
    }

    public static boolean v(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null && strArr.length > 0) {
            return true;
        }
        String[] strArr2 = applicationInfo.splitPublicSourceDirs;
        return strArr2 != null && strArr2.length > 0;
    }

    public static boolean w(String str) {
        String strY;
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile == null || !parentFile.exists() || !parentFile.isDirectory() || (strY = y(str, "package")) == null) {
            return false;
        }
        try {
            File[] fileArrListFiles = parentFile.listFiles();
            if (fileArrListFiles == null) {
                return false;
            }
            int i10 = 0;
            for (File file2 : fileArrListFiles) {
                if (file2.getName().endsWith(".apk")) {
                    i10++;
                }
            }
            if (i10 <= 1) {
                return false;
            }
            int i11 = 0;
            for (File file3 : fileArrListFiles) {
                if (file3.getName().endsWith(".apk") && !file3.equals(file)) {
                    i11++;
                    if (i11 > 24) {
                        return false;
                    }
                    String absolutePath = file3.getAbsolutePath();
                    if (strY.equals(y(absolutePath, "package")) && y(absolutePath, "split") != null) {
                        return true;
                    }
                }
            }
        } catch (SecurityException unused) {
        }
        return false;
    }

    public static String x(byte[] bArr, String str) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        if (bArr.length < 8 || (byteBufferOrder.getShort(8) & H0.f217455d) != 1) {
            return null;
        }
        int i10 = byteBufferOrder.getInt(12);
        int i11 = byteBufferOrder.getInt(16);
        boolean z10 = (byteBufferOrder.getInt(24) & 256) != 0;
        int i12 = byteBufferOrder.getInt(28) + 8;
        int i13 = i10 + 8;
        while (i13 + 8 <= bArr.length) {
            int i14 = byteBufferOrder.getShort(i13) & H0.f217455d;
            int i15 = byteBufferOrder.getInt(i13 + 4);
            if (i15 < 8) {
                break;
            }
            if (i14 == 258 && C4182q.f167623c.equals(c(byteBufferOrder, 36, i12, i11, byteBufferOrder.getInt(i13 + 20), z10))) {
                int i16 = byteBufferOrder.getShort(i13 + 24) & H0.f217455d;
                int i17 = byteBufferOrder.getShort(i13 + 28) & H0.f217455d;
                int i18 = i13 + 16 + i16;
                for (int i19 = 0; i19 < i17; i19++) {
                    int i20 = (i19 * 20) + i18;
                    if (str.equals(c(byteBufferOrder, 36, i12, i11, byteBufferOrder.getInt(i20 + 4), z10))) {
                        int i21 = byteBufferOrder.getInt(i20 + 8);
                        return i21 >= 0 ? c(byteBufferOrder, 36, i12, i11, i21, z10) : c(byteBufferOrder, 36, i12, i11, byteBufferOrder.getInt(i20 + 16), z10);
                    }
                }
                return null;
            }
            i13 += i15;
        }
        return null;
    }

    public static String y(String str, String str2) {
        ZipEntry entry;
        try {
            ZipFile zipFile = new ZipFile(str);
            try {
                entry = zipFile.getEntry(C4182q.f167622b);
            } finally {
            }
            if (entry == null) {
                zipFile.close();
                return null;
            }
            InputStream inputStream = zipFile.getInputStream(entry);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 <= 0) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        inputStream.close();
                        String strX = x(byteArray, str2);
                        zipFile.close();
                        return strX;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
            } finally {
            }
        } catch (Throwable th) {
            StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("readManifestAttr(", str2, ") failed for ", str, ": ");
            sbA.append(th);
            Log.e("PkgUtils", sbA.toString(), th);
            return null;
        }
        StringBuilder sbA2 = androidx.constraintlayout.core.parser.b.a("readManifestAttr(", str2, ") failed for ", str, ": ");
        sbA2.append(th);
        Log.e("PkgUtils", sbA2.toString(), th);
        return null;
    }
}
