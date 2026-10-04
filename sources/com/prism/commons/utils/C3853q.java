package com.prism.commons.utils;

import B0.C0920d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import i3.C4546a;
import java.io.File;
import java.io.FileFilter;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.prism.commons.utils.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3853q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f162128b = 1048576;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f162129c = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f162131e = "02:00:00:00:00:00";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162127a = l0.b(C3853q.class.getSimpleName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FileFilter f162130d = new a();

    /* JADX INFO: renamed from: com.prism.commons.utils.q$a */
    public class a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i10 = 3; i10 < name.length(); i10++) {
                if (name.charAt(i10) < '0' || name.charAt(i10) > '9') {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean a(Context context) {
        return C0920d.checkSelfPermission(context, U6.b.f68570g) == 0;
    }

    @SuppressLint({"HardwareIds"})
    public static String b(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    @NonNull
    public static String c(Context context) {
        try {
            return b(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String d(Context context) {
        String strE = e(context);
        return strE != null ? strE.toUpperCase() : strE;
    }

    public static String e(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "bluetooth_address");
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    public static String f(Context context) {
        return q(context).getDeviceId();
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    public static String g(Context context) {
        return q(context).getSimSerialNumber();
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    public static String h(Context context) {
        String imei = Build.VERSION.SDK_INT >= 26 ? q(context).getImei() : null;
        if (imei == null) {
            String strF = f(context);
            if (s(strF)) {
                imei = strF;
            }
        }
        if (imei == null || s(imei)) {
            return imei;
        }
        return null;
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    public static String i(Context context) {
        return q(context).getSubscriberId();
    }

    @SuppressLint({"MissingPermission"})
    public static String j(Context context) {
        String meid = Build.VERSION.SDK_INT >= 26 ? q(context).getMeid() : null;
        if (meid == null) {
            String strF = f(context);
            if (!s(strF) && StringUtils.i(strF)) {
                meid = strF;
            }
        }
        if (meid == null || StringUtils.i(meid)) {
            return meid;
        }
        return null;
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    public static String k() {
        String str = Build.SERIAL;
        return (!u(str) && Build.VERSION.SDK_INT >= 26) ? Build.getSerial() : str;
    }

    @SuppressLint({"HardwareIds"})
    public static String l() {
        return Build.SERIAL;
    }

    public static String m() {
        ArrayList list;
        int size;
        int i10;
        try {
            list = Collections.list(NetworkInterface.getNetworkInterfaces());
            size = list.size();
            i10 = 0;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        while (i10 < size) {
            Object obj = list.get(i10);
            i10++;
            NetworkInterface networkInterface = (NetworkInterface) obj;
            if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                byte[] hardwareAddress = networkInterface.getHardwareAddress();
                if (hardwareAddress == null) {
                    return null;
                }
                return n(hardwareAddress);
            }
            return null;
        }
        return null;
    }

    public static String n(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(String.format("%02X:", Byte.valueOf(b10)));
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public static byte[] o(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(6);
        for (String str2 : str.split(com.prism.gaia.server.accounts.b.f166434b0)) {
            arrayList.add(Byte.valueOf((byte) (Integer.valueOf(str2, 16).intValue() & 255)));
        }
        byte[] bArr = new byte[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            bArr[i10] = ((Byte) arrayList.get(i10)).byteValue();
        }
        return bArr;
    }

    public static int p() {
        try {
            return new File(C4546a.f202824c).listFiles(f162130d).length;
        } catch (NullPointerException | SecurityException unused) {
            return 4;
        }
    }

    public static TelephonyManager q(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static boolean r(String str) {
        return (str == null || str.equalsIgnoreCase(f162131e)) ? false : true;
    }

    public static boolean s(String str) {
        return StringUtils.h(str) && str.length() >= 15;
    }

    public static boolean t(String str) {
        return StringUtils.i(str);
    }

    public static boolean u(String str) {
        return (str == null || str.equalsIgnoreCase("unknown")) ? false : true;
    }

    public static void v(Context context) {
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
        I.b(f162127a, "current memoryInfo: avail=%dMB, used=%dMB, max=%dMB, total=%dMB, native:%dMB/%dMB", Long.valueOf((runtime.maxMemory() - jFreeMemory) / 1048576), Long.valueOf(jFreeMemory / 1048576), Long.valueOf(runtime.maxMemory() / 1048576), Long.valueOf(runtime.totalMemory() / 1048576), Long.valueOf(Debug.getNativeHeapAllocatedSize() / 1048576), Long.valueOf(Debug.getNativeHeapSize() / 1048576));
    }
}
