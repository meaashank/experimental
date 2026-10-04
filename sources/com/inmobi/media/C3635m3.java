package com.inmobi.media;

import android.app.NotificationManager;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import e.InterfaceC4336j;
import ed.InterfaceC4376a;
import f8.C4409c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p8.C5397a;
import t7.C5617a;

/* JADX INFO: renamed from: com.inmobi.media.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3635m3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f153127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3591j1 f153128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C3591j1 f153129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f153130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pair f153131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f153132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f153133j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n[] f153125b = {kotlin.jvm.internal.O.u(new PropertyReference1Impl(C3635m3.class, "maxDeviceVolume", "getMaxDeviceVolume()I", 0)), kotlin.jvm.internal.O.f217893a.n(new PropertyReference1Impl(C3635m3.class, "curDeviceVolume", "getCurDeviceVolume()I", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3635m3 f153124a = new C3635m3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f153126c = -1;

    static {
        int i10 = 15;
        f153128e = new C3591j1((Integer) i10, (InterfaceC4376a) C3621l3.f153101a, false, 12);
        f153129f = new C3591j1((Integer) i10, (InterfaceC4376a) C3607k3.f153076a, true, 8);
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.G.o(RELEASE, "RELEASE");
        f153130g = RELEASE;
        f153131h = new Pair("d-api-lev", "" + Build.VERSION.SDK_INT);
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.G.o(MANUFACTURER, "MANUFACTURER");
        f153132i = MANUFACTURER;
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.G.o(MODEL, "MODEL");
        f153133j = MODEL;
    }

    @dd.o
    @InterfaceC4336j(api = 24)
    public static final boolean A() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static void H() {
        C3657nb.a(new F5.U1());
    }

    public static final void I() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes() + availableBytes;
            if (Environment.getExternalStorageState().equals("mounted")) {
                availableBytes = availableBytes2;
            }
            f153126c = availableBytes / ((long) 1048576);
        } catch (Exception e10) {
            R1 r12 = new R1(e10);
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(r12);
        }
    }

    public static void J() {
        C3657nb.a(new F5.S1());
    }

    public static final void K() {
        UUID uuidFromString;
        Context contextD = C3657nb.d();
        if (contextD == null) {
            return;
        }
        Object systemService = contextD.getSystemService(C4409c.f200663f);
        kotlin.jvm.internal.G.n(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManagerA = F5.K1.a(systemService);
        Object systemService2 = contextD.getSystemService("storage");
        kotlin.jvm.internal.G.n(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        kotlin.jvm.internal.G.o(storageVolumes, "getStorageVolumes(...)");
        Iterator it = storageVolumes.iterator();
        long freeBytes = 0;
        while (it.hasNext()) {
            StorageVolume storageVolumeA = F5.M1.a(it.next());
            String uuid = storageVolumeA.getUuid();
            if (uuid == null) {
                uuidFromString = StorageManager.UUID_DEFAULT;
                kotlin.jvm.internal.G.m(uuidFromString);
            } else {
                try {
                    uuidFromString = UUID.fromString(uuid);
                    kotlin.jvm.internal.G.m(uuidFromString);
                } catch (Exception unused) {
                }
            }
            if (storageVolumeA.getState().equals("mounted")) {
                try {
                    freeBytes += storageStatsManagerA.getFreeBytes(uuidFromString);
                } catch (Exception e10) {
                    R1 r12 = new R1(e10);
                    C3511d5 c3511d5 = C3511d5.f152815a;
                    C3511d5.f152817c.a(r12);
                }
            }
        }
        f153126c = freeBytes / ((long) 1048576);
    }

    public static void L() {
        C3657nb.a(new F5.V1());
    }

    public static final void M() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            float blockCountLong = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            float blockCountLong2 = (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) + blockCountLong;
            if (Environment.getExternalStorageState().equals("mounted")) {
                blockCountLong = blockCountLong2;
            }
            f153127d = "" + (blockCountLong / 1048576);
        } catch (Exception e10) {
            R1 r12 = new R1(e10);
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(r12);
        }
    }

    public static void N() {
        C3657nb.a(new F5.T1());
    }

    public static final void O() {
        UUID uuidFromString;
        Context contextD = C3657nb.d();
        if (contextD == null) {
            return;
        }
        Object systemService = contextD.getSystemService(C4409c.f200663f);
        kotlin.jvm.internal.G.n(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManagerA = F5.K1.a(systemService);
        Object systemService2 = contextD.getSystemService("storage");
        kotlin.jvm.internal.G.n(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        kotlin.jvm.internal.G.o(storageVolumes, "getStorageVolumes(...)");
        Iterator it = storageVolumes.iterator();
        long totalBytes = 0;
        while (it.hasNext()) {
            StorageVolume storageVolumeA = F5.M1.a(it.next());
            String uuid = storageVolumeA.getUuid();
            if (uuid == null) {
                uuidFromString = StorageManager.UUID_DEFAULT;
                kotlin.jvm.internal.G.m(uuidFromString);
            } else {
                try {
                    uuidFromString = UUID.fromString(uuid);
                    kotlin.jvm.internal.G.m(uuidFromString);
                } catch (Exception unused) {
                }
            }
            if (storageVolumeA.getState().equals("mounted")) {
                try {
                    totalBytes += storageStatsManagerA.getTotalBytes(uuidFromString);
                } catch (Exception e10) {
                    R1 r12 = new R1(e10);
                    C3511d5 c3511d5 = C3511d5.f152815a;
                    C3511d5.f152817c.a(r12);
                }
            }
        }
        f153127d = "" + (totalBytes / ((long) 1048576));
    }

    public static String o() {
        String string;
        Context contextD = C3657nb.d();
        if (contextD == null || !AbstractC3822z9.a(contextD, s3.e.f238487b)) {
            return "";
        }
        Object systemService = contextD.getSystemService(C5617a.f239212e);
        NetworkInfo activeNetworkInfo = null;
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return "";
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e10) {
            e10.toString();
        }
        if (activeNetworkInfo == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "";
            }
            if (!networkCapabilities.hasTransport(0)) {
                if (!networkCapabilities.hasTransport(1)) {
                    string = networkCapabilities.hasTransport(2) ? "7" : networkCapabilities.hasTransport(3) ? "9" : networkCapabilities.hasTransport(4) ? "17" : networkCapabilities.hasTransport(5) ? "10" : networkCapabilities.hasTransport(6) ? "11" : "8";
                }
                return "1";
            }
            string = "0|" + activeNetworkInfo.getSubtype();
            return string;
        }
        int type = activeNetworkInfo.getType();
        int subtype = activeNetworkInfo.getSubtype();
        if (type != 0) {
            if (type != 1) {
                string = String.valueOf(type);
            }
            return "1";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        sb2.append('|');
        sb2.append(subtype);
        string = sb2.toString();
        return string;
    }

    @NotNull
    public static final String q() {
        int iP = f153124a.p();
        return iP != 0 ? iP != 1 ? "NIL" : C5397a.f226370e : "carrier";
    }

    @dd.o
    public static /* synthetic */ void r() {
    }

    @dd.o
    @InterfaceC4336j(api = 21)
    public static final boolean y() {
        return true;
    }

    @dd.o
    @InterfaceC4336j(api = 23)
    public static final boolean z() {
        return true;
    }

    @InterfaceC4336j(api = 27)
    public final boolean B() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @InterfaceC4336j(api = 28)
    public final boolean C() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @InterfaceC4336j(api = 29)
    public final boolean D() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @InterfaceC4336j(api = 30)
    public final boolean E() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @InterfaceC4336j(api = 31)
    public final boolean F() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @InterfaceC4336j(api = 33)
    public final boolean G() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public final int a(@Nullable Context context, boolean z10) {
        if (context == null || z10) {
            return 0;
        }
        int iIntValue = ((Number) f153129f.getValue(this, f153125b[1])).intValue();
        int iM = m();
        if (iM <= 0) {
            return 0;
        }
        return (iIntValue * 100) / iM;
    }

    @Nullable
    public final Pair<String, String> b() {
        Context contextD = C3657nb.d();
        if (contextD == null) {
            return null;
        }
        return Settings.Global.getInt(contextD.getContentResolver(), "airplane_mode_on", 0) != 0 ? new Pair<>("d-airplane-m", "1") : new Pair<>("d-airplane-m", MBridgeConstans.ENDCARD_URL_TYPE_PL);
    }

    @NotNull
    public final Pair<String, String> c() {
        return f153131h;
    }

    @Nullable
    public final Pair<String, String> d() {
        if (Build.VERSION.SDK_INT >= 26) {
            J();
        } else {
            H();
        }
        long j10 = f153126c;
        if (j10 != -1) {
            return new Pair<>("d-av-disk", String.valueOf(j10));
        }
        return null;
    }

    public final long e() {
        return f153126c;
    }

    @Nullable
    public final Pair<String, String> f() {
        Context contextD = C3657nb.d();
        if (contextD == null) {
            return null;
        }
        Intent intentA = AbstractC3620l2.a(contextD, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return new Pair<>("d-bat-chrg", (intentA != null ? intentA.getIntExtra("status", -1) : -1) == 2 ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
    }

    @Nullable
    public final Pair<String, String> g() {
        Context contextD = C3657nb.d();
        Integer numValueOf = null;
        if (contextD == null) {
            return null;
        }
        if (AbstractC3620l2.a(contextD, null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) != null) {
            numValueOf = Integer.valueOf((int) ((r0.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) * 100) / r0.getIntExtra("scale", -1)));
        }
        return new Pair<>("d-bat-lev", "" + numValueOf);
    }

    @Nullable
    public final Pair<String, String> h() {
        Context contextD = C3657nb.d();
        if (contextD == null) {
            return null;
        }
        Object systemService = contextD.getSystemService(Y7.a.f79330e);
        kotlin.jvm.internal.G.n(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode() ? new Pair<>("d-bat-sav", "1") : new Pair<>("d-bat-sav", MBridgeConstans.ENDCARD_URL_TYPE_PL);
    }

    @Nullable
    public final Pair<String, String> i() {
        String str;
        int i10 = Resources.getSystem().getConfiguration().uiMode & 48;
        if (i10 == 16) {
            str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
        } else {
            if (i10 != 32) {
                return null;
            }
            str = "1";
        }
        return new Pair<>("d-drk-m", str);
    }

    @Nullable
    public final Pair<String, String> j() {
        Context contextD = C3657nb.d();
        if (contextD == null) {
            return null;
        }
        Object systemService = contextD.getSystemService("notification");
        kotlin.jvm.internal.G.n(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        try {
            int currentInterruptionFilter = ((NotificationManager) systemService).getCurrentInterruptionFilter();
            return new Pair<>("d-dnd", (currentInterruptionFilter == 2 || currentInterruptionFilter == 3 || currentInterruptionFilter == 4) ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.Pair<java.lang.String, java.lang.String> k() {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.Context r1 = com.inmobi.media.C3657nb.d()
            if (r1 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            kotlin.jvm.internal.G.n(r1, r2)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            java.util.List r2 = r1.getEnabledInputMethodList()
            java.lang.String r3 = "getEnabledInputMethodList(...)"
            kotlin.jvm.internal.G.o(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L27:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L95
            java.lang.Object r3 = r2.next()
            android.view.inputmethod.InputMethodInfo r3 = (android.view.inputmethod.InputMethodInfo) r3
            r4 = 1
            java.util.List r3 = r1.getEnabledInputMethodSubtypeList(r3, r4)
            java.lang.String r4 = "getEnabledInputMethodSubtypeList(...)"
            kotlin.jvm.internal.G.o(r3, r4)
            java.util.Iterator r3 = r3.iterator()
        L41:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L27
            java.lang.Object r4 = r3.next()
            android.view.inputmethod.InputMethodSubtype r4 = (android.view.inputmethod.InputMethodSubtype) r4
            java.lang.String r5 = r4.getMode()
            java.lang.String r6 = "keyboard"
            boolean r5 = kotlin.jvm.internal.G.g(r5, r6)
            if (r5 == 0) goto L41
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 24
            if (r5 < r6) goto L7b
            java.lang.String r5 = F5.J1.a(r4)
            java.lang.String r6 = "getLanguageTag(...)"
            kotlin.jvm.internal.G.o(r5, r6)
            int r5 = r5.length()
            if (r5 <= 0) goto L7b
            java.lang.String r4 = F5.J1.a(r4)
            java.util.Locale r4 = java.util.Locale.forLanguageTag(r4)
            java.lang.String r4 = r4.getLanguage()
            goto L88
        L7b:
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r4 = r4.getLocale()
            r5.<init>(r4)
            java.lang.String r4 = r5.getLanguage()
        L88:
            kotlin.jvm.internal.G.m(r4)
            int r5 = r4.length()
            if (r5 <= 0) goto L41
            r0.add(r4)
            goto L41
        L95:
            kotlin.Pair r1 = new kotlin.Pair
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.G.o(r0, r2)
            java.lang.String r2 = "d-key-lang"
            r1.<init>(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3635m3.k():kotlin.Pair");
    }

    @NotNull
    public final String l() {
        return f153132i;
    }

    public final int m() {
        return ((Number) f153128e.getValue(this, f153125b[0])).intValue();
    }

    @NotNull
    public final String n() {
        return f153133j;
    }

    public final int p() {
        String strO = o();
        if (kotlin.text.F.L2(strO, MBridgeConstans.ENDCARD_URL_TYPE_PL, false, 2, null)) {
            return 0;
        }
        return kotlin.text.F.L2(strO, "1", false, 2, null) ? 1 : 2;
    }

    @NotNull
    public final String s() {
        return f153130g;
    }

    @Nullable
    public final Pair<String, String> t() {
        if (Build.VERSION.SDK_INT >= 26) {
            N();
        } else {
            L();
        }
        String str = f153127d;
        if (str != null) {
            return new Pair<>("d-tot-disk", str);
        }
        return null;
    }

    @Nullable
    public final Pair<String, String> u() {
        Context contextD = C3657nb.d();
        if (contextD == null) {
            return null;
        }
        Intent intentA = AbstractC3620l2.a(contextD, null, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        return (intentA == null || intentA.getIntExtra("state", 0) != 1) ? new Pair<>("d-w-h", MBridgeConstans.ENDCARD_URL_TYPE_PL) : new Pair<>("d-w-h", "1");
    }

    @e.g0
    public final void v() {
        d();
        t();
        m();
    }

    @InterfaceC4336j(api = 17)
    public final boolean w() {
        return true;
    }

    @InterfaceC4336j(api = 20)
    public final boolean x() {
        return true;
    }

    @NotNull
    public final String a(@NotNull Context context) {
        kotlin.jvm.internal.G.p(context, "context");
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? "" : networkOperatorName;
    }

    @NotNull
    public final Map<String, String> a(boolean z10) {
        HashMap map = new HashMap();
        try {
            map.put("os-v", f153130g);
            String BRAND = Build.BRAND;
            kotlin.jvm.internal.G.o(BRAND, "BRAND");
            map.put("d-brand-name", BRAND);
            map.put("d-manufacturer-name", f153132i);
            map.put("d-model-name", f153133j);
            map.put("d-nettype-raw", o());
            String string = Locale.getDefault().toString();
            kotlin.jvm.internal.G.o(string, "toString(...)");
            map.put("d-localization", string);
            String language = Locale.getDefault().getLanguage();
            kotlin.jvm.internal.G.o(language, "getLanguage(...)");
            map.put("d-language", language);
            map.put("d-media-volume", String.valueOf(a(C3657nb.d(), z10)));
        } catch (Exception unused) {
        }
        return map;
    }

    @NotNull
    public final C3593j3 a() {
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory();
        long jFreeMemory = runtime.freeMemory();
        return new C3593j3(jMaxMemory, jFreeMemory, jMaxMemory - jFreeMemory);
    }
}
