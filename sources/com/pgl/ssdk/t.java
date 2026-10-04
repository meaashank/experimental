package com.pgl.ssdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tonyodev.fetch2core.server.FileResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile String f161912a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile String f161913b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f161914c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f161915d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f161916e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f161917f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f161918g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f161919h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f161920i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile long f161921j = -1;

    public static void a(File file, boolean z10) throws Throwable {
        RandomAccessFile randomAccessFile;
        e eVarA;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, CampaignEx.JSON_KEY_AD_R);
            } catch (IOException unused) {
                return;
            }
        } catch (FileNotFoundException unused2) {
        } catch (IOException unused3) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (TextUtils.isEmpty(f161912a) && (eVarA = a(file)) != null) {
                f161912a = a(eVarA.a());
                f161915d = eVarA.b();
                if (z10) {
                    a();
                    try {
                        randomAccessFile.close();
                        return;
                    } catch (IOException unused4) {
                        return;
                    }
                }
            }
            if (TextUtils.isEmpty(f161916e)) {
                f161916e = a(randomAccessFile);
            }
            if (f161919h == 0) {
                f161919h = randomAccessFile.length() / 1024;
            }
            if (f161920i == 0) {
                f161920i = b(file);
            }
            randomAccessFile.close();
        } catch (FileNotFoundException unused5) {
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
        } catch (IOException unused6) {
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException unused7) {
                }
            }
            throw th;
        }
    }

    public static String b() throws Throwable {
        long j10;
        boolean z10;
        String string;
        String string2;
        String string3;
        String string4;
        long j11;
        long j12;
        int i10;
        String str;
        if (TextUtils.isEmpty(f161912a) || TextUtils.isEmpty(f161916e) || f161918g == -1) {
            SharedPreferences sharedPreferencesA = u0.a(x.b());
            long j13 = -1;
            if (sharedPreferencesA != null) {
                j13 = sharedPreferencesA.getLong("mt", -1L);
                string2 = sharedPreferencesA.getString("sa", null);
                string3 = sharedPreferencesA.getString("sj", null);
                string4 = sharedPreferencesA.getString(FileResponse.FIELD_MD5, null);
                j11 = sharedPreferencesA.getLong("as", 0L);
                j12 = sharedPreferencesA.getLong("ds", 0L);
                z10 = true;
                i10 = sharedPreferencesA.getInt("cpc", -1);
                j10 = 0;
                string = sharedPreferencesA.getString("ap", null);
            } else {
                j10 = 0;
                z10 = true;
                string = null;
                string2 = null;
                string3 = null;
                string4 = null;
                j11 = 0;
                j12 = 0;
                i10 = 0;
            }
            String strC = c();
            if (strC == null) {
                return null;
            }
            File file = new File(strC);
            str = null;
            Object[] objArr = (Object[]) com.pgl.ssdk.ces.a.meta(158, x.b(), strC);
            Integer num = (Integer) objArr[0];
            String str2 = (String) objArr[z10 ? 1 : 0];
            long jLastModified = file.lastModified();
            if (jLastModified != j13 || string2 == null || i10 == -1) {
                f161921j = jLastModified;
                if (str2 != null) {
                    f161917f = str2;
                }
                if (num != null) {
                    f161918g = num.intValue();
                }
                a(file, false);
                a();
            } else {
                f161912a = string2;
                f161915d = string3;
                f161919h = j11;
                f161920i = j12;
                f161916e = string4;
                f161918g = i10;
                f161917f = string;
            }
        } else {
            j10 = 0;
            str = null;
            z10 = true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f161912a)) {
                jSONObject.put("sign", f161912a);
            }
            if (!TextUtils.isEmpty(f161915d)) {
                jSONObject.put(P0.c.f65540h, f161915d);
            }
            if (!TextUtils.isEmpty(f161916e)) {
                jSONObject.put(FileResponse.FIELD_MD5, f161916e);
            }
            if (!TextUtils.isEmpty(f161917f)) {
                jSONObject.put("path", f161917f);
            }
            long j14 = f161919h;
            if (j14 != j10) {
                jSONObject.put("apkSize", j14);
            }
            long j15 = f161920i;
            if (j15 != j10) {
                jSONObject.put("dexSize", j15);
            }
            int i11 = f161918g;
            if (i11 != -1) {
                jSONObject.put(Z3.f.f79422s, i11);
            }
            f();
            jSONObject.put("signpm", f161913b);
            if (!TextUtils.isEmpty(f161913b) && !TextUtils.isEmpty(f161912a)) {
                if (!f161913b.equals(f161912a)) {
                    f161914c = z10;
                }
                jSONObject.put("rebud", f161914c);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    public static String c() {
        if (x.b() == null) {
            return null;
        }
        String packageCodePath = x.b().getPackageCodePath();
        if (TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        File file = new File(packageCodePath);
        if (file.exists() && file.canRead()) {
            return packageCodePath;
        }
        return null;
    }

    public static void d() throws Throwable {
        if (TextUtils.isEmpty(f161912a)) {
            SharedPreferences sharedPreferencesA = u0.a(x.b());
            String string = null;
            long j10 = -1;
            if (sharedPreferencesA != null) {
                j10 = sharedPreferencesA.getLong("mt", -1L);
                string = sharedPreferencesA.getString("sa", null);
            }
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            File file = new File(strC);
            long jLastModified = file.lastModified();
            if (jLastModified != j10 || string == null) {
                f161921j = jLastModified;
                a(file, true);
                a();
            } else {
                f161912a = string;
            }
        }
        f();
        if (TextUtils.isEmpty(f161913b) || TextUtils.isEmpty(f161912a) || f161913b.equals(f161912a)) {
            return;
        }
        f161914c = true;
    }

    public static String e() throws Throwable {
        d();
        return f161912a;
    }

    public static String f() {
        if (!TextUtils.isEmpty(f161913b)) {
            return f161913b;
        }
        try {
            String strA = a(x.b().getPackageManager().getPackageInfo(x.b().getPackageName(), 64).signatures[0].toByteArray());
            f161913b = strA;
            return strA;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() throws Throwable {
        d();
        return f161914c;
    }

    public static void a() {
        SharedPreferences sharedPreferencesA = u0.a(x.b());
        if (sharedPreferencesA != null) {
            if (!TextUtils.isEmpty(f161912a)) {
                sharedPreferencesA.edit().putString("sa", f161912a).apply();
            }
            if (!TextUtils.isEmpty(f161916e)) {
                sharedPreferencesA.edit().putString(FileResponse.FIELD_MD5, f161916e).apply();
            }
            if (!TextUtils.isEmpty(f161915d)) {
                sharedPreferencesA.edit().putString("sj", f161915d).apply();
            }
            if (f161919h != 0) {
                sharedPreferencesA.edit().putLong("as", f161919h).apply();
            }
            if (f161920i != 0) {
                sharedPreferencesA.edit().putLong("ds", f161920i).apply();
            }
            if (f161921j != -1) {
                sharedPreferencesA.edit().putLong("mt", f161921j).apply();
            }
            if (f161918g != -1) {
                sharedPreferencesA.edit().putInt("cpc", f161918g).apply();
            }
            if (TextUtils.isEmpty(f161917f)) {
                return;
            }
            sharedPreferencesA.edit().putString("ap", f161917f).apply();
        }
    }

    public static String a(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(bArr);
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3).toUpperCase());
                sb2.append(com.prism.gaia.server.accounts.b.f166434b0);
            }
            return sb2.substring(0, sb2.length() - 1);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.pgl.ssdk.e a(java.io.File r6) throws java.lang.Throwable {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L1e com.pgl.ssdk.f.a -> L25
            java.lang.String r2 = "r"
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L1e com.pgl.ssdk.f.a -> L25
            long r2 = r1.length()     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.f.a -> L26
            r4 = 0
            com.pgl.ssdk.o r2 = com.pgl.ssdk.p.a(r1, r4, r2)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.f.a -> L26
            com.pgl.ssdk.c$a r3 = com.pgl.ssdk.c.a(r2)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.f.a -> L26
            java.util.List r2 = com.pgl.ssdk.k.a(r2, r3)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.f.a -> L26
            r1.close()     // Catch: java.io.IOException -> L2c
            goto L2c
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L2b
            r1.close()     // Catch: java.io.IOException -> L2b
            goto L2b
        L25:
            r1 = r0
        L26:
            if (r1 == 0) goto L2b
            r1.close()     // Catch: java.io.IOException -> L2b
        L2b:
            r2 = r0
        L2c:
            if (r2 == 0) goto L34
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L38
        L34:
            java.util.List r2 = com.pgl.ssdk.j.a(r6)
        L38:
            if (r2 == 0) goto L48
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L48
            r6 = 0
            java.lang.Object r6 = r2.get(r6)
            com.pgl.ssdk.e r6 = (com.pgl.ssdk.e) r6
            return r6
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.t.a(java.io.File):com.pgl.ssdk.e");
    }

    public static long b(File file) throws Throwable {
        String str;
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(file);
                int i10 = 0;
                int size = 0;
                while (true) {
                    if (i10 == 0) {
                        str = "classes.dex";
                    } else {
                        str = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i10));
                    }
                    ZipEntry entry = zipFile2.getEntry(str);
                    if (entry == null) {
                        break;
                    }
                    try {
                        size = (int) (((long) size) + entry.getSize());
                        i10++;
                    } catch (ZipException unused) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (IOException unused2) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                long j10 = size / 1000;
                try {
                    zipFile2.close();
                } catch (IOException unused4) {
                }
                return j10;
            } catch (IOException unused5) {
                return 0L;
            }
        } catch (ZipException unused6) {
        } catch (IOException unused7) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String a(RandomAccessFile randomAccessFile) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1048576];
            while (true) {
                int i10 = randomAccessFile.read(bArr);
                if (i10 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i10);
            }
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            while (string.length() < 32) {
                string = MBridgeConstans.ENDCARD_URL_TYPE_PL.concat(string);
            }
            return string;
        } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
