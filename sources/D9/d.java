package D9;

import U6.c;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Environment;
import android.system.Os;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.C2564b;
import androidx.multidex.MultiDexExtractor;
import com.prism.commons.utils.C3838b;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.io.GFile;
import com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAG;
import com.prism.gaia.os.GaiaUserHandle;
import com.prism.gaia.server.pm.GaiaUserManagerService;
import i6.d;
import java.io.File;
import java.io.IOException;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f22989a = "asdf-".concat(d.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f22990b = "virtual";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static GFile f22991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static GFile f22992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static GFile f22993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static GFile f22994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static GFile f22995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static GFile f22996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static GFile f22997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static GFile f22998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static GFile f22999k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static GFile f23000l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static GFile f23001m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static GFile f23002n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static GFile f23003o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static GFile f23004p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static GFile f23005q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static GFile f23006r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile GFile f23007s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static volatile GFile f23008t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static volatile GFile f23009u;

    public static GFile A() {
        return new GFile(f23008t, f22990b);
    }

    public static GFile B() {
        return new GFile(f23007s, d.a.f202868j);
    }

    public static GFile C(@NonNull String str) {
        return new GFile(f23008t, android.support.v4.media.e.a(new StringBuilder(c.b.f68733a), File.separator, str));
    }

    public static GFile D(@NonNull String str, @NonNull String str2) {
        return new GFile(C(str), str2);
    }

    public static GFile E() {
        return f23007s;
    }

    public static GFile F(@NonNull String str) {
        return new GFile(f23007s, android.support.v4.media.e.a(new StringBuilder("virtual/Android/data"), File.separator, str));
    }

    public static GFile G() {
        return new GFile(f23007s, f22990b);
    }

    public static GFile H(@Nullable String str) {
        if (str == null) {
            str = "com.app.hider.master.promax";
        }
        return ((!C3841e.D() || U6.c.f() < 33) && F(str).exists()) ? G() : z(str).exists() ? A() : C(str);
    }

    public static GFile I() {
        return new GFile(f23002n, "account-list.ini");
    }

    public static GFile J() {
        return new GFile(f23002n, "device-info.ini");
    }

    public static GFile K() {
        return new GFile(f23002n, "download-watermark.ini");
    }

    public static GFile L() {
        return new GFile(f23002n, "job-list.ini");
    }

    public static GFile M(String str) {
        return new GFile(f23002n, android.support.v4.media.i.a("class/net/", str, "/address"));
    }

    public static GFile N() {
        return new GFile(f23002n, "notifications.ini");
    }

    public static GFile O() {
        return new GFile(f23002n, "packages.ini");
    }

    public static GFile P() {
        return new GFile(f23002n, "pid-dist");
    }

    public static GFile Q(int i10) {
        return new GFile(P(), String.valueOf(i10));
    }

    public static GFile R(String str) {
        return new GFile(r(str), "package.ini");
    }

    public static GFile S(String str) {
        return new GFile(r(str), "package_v2.ini");
    }

    public static GFile T(String str) {
        return new GFile(r(str), "properties.ini");
    }

    public static GFile U(String str) {
        return new GFile(r(str), "signature.ini");
    }

    public static GFile V(String str) {
        return new GFile(r(str), "signatureV3.ini");
    }

    public static GFile W(String str) {
        return new GFile(r(str), "user_state.ini");
    }

    public static GFile X() {
        return new GFile(f23002n, "process-config");
    }

    public static GFile Y() {
        return new GFile(f23002n, "setting.ini");
    }

    public static GFile Z() {
        return new GFile(f23002n, "uid-list.ini");
    }

    public static GFile a(String str) {
        GFile gFileM = m(str);
        if (gFileM == null) {
            return null;
        }
        try {
            com.prism.gaia.helper.utils.l.K(gFileM, -1);
            return gFileM;
        } catch (IOException unused) {
            return null;
        }
    }

    public static GFile a0() {
        return new GFile(f23002n, "uid-list.ini.bak");
    }

    public static boolean b() {
        File file = new File(new File(GaiaContext.j().l().dataDir), f22990b);
        if (f22992d.exists() || !file.exists()) {
            return false;
        }
        try {
            com.prism.gaia.helper.utils.l.O(file.getAbsolutePath(), f22992d.getAbsolutePath());
            String str = f22992d.getAbsolutePath() + "/opt";
            GFile gFile = new GFile(f22992d, "data");
            gFile.C(-1);
            GFile gFile2 = new GFile(gFile, "dalvik_cache");
            gFile2.C(-1);
            if (new File(str).exists()) {
                String.format("dalvik-new=%s, dalvik-old=%s", gFile2.getAbsoluteFile(), str);
                com.prism.gaia.helper.utils.l.O(str, gFile2.getAbsolutePath());
            }
            GFile gFile3 = new GFile(gFile, "app");
            gFile3.C(-1);
            String str2 = gFile3.getAbsolutePath() + "/system";
            if (new File(str2).exists()) {
                File file2 = new File(gFile, "system");
                String.format("sys-old=%s, sys-new=%s", str2, file2);
                com.prism.gaia.helper.utils.l.O(str2, file2.getAbsolutePath());
            }
            Os.symlink(f22992d.getAbsolutePath(), file.getAbsolutePath());
            com.prism.gaia.helper.utils.l.f(gFile.getAbsolutePath(), 493, true);
        } catch (Exception unused) {
        }
        return true;
    }

    public static GFile b0() {
        return new GFile(f23002n, "virtual-loc.ini");
    }

    public static void c(Context context) {
        f23007s = new GFile(Environment.getExternalStorageDirectory());
        f23008t = new GFile(context.getExternalFilesDir(null).getParent());
        f23009u = null;
        File[] externalMediaDirs = GaiaContext.j().z().getExternalMediaDirs();
        if (C3838b.n(externalMediaDirs)) {
            return;
        }
        f23009u = new GFile(externalMediaDirs[0]);
        f23009u.getAbsolutePath();
    }

    public static GFile c0() {
        return f23006r;
    }

    public static boolean d(ApplicationInfo applicationInfo, boolean z10) {
        String str = applicationInfo.packageName;
        GFile gFileA = z10 ? a(str) : m(str);
        if (gFileA == null) {
            return false;
        }
        String strE = e(applicationInfo.sourceDir, gFileA);
        if (z10 && !new GFile(strE).exists()) {
            return false;
        }
        applicationInfo.sourceDir = strE;
        applicationInfo.publicSourceDir = e(applicationInfo.publicSourceDir, gFileA);
        applicationInfo.uid = GaiaUserHandle.fixToVuserId(applicationInfo.uid, 1);
        f(applicationInfo.splitSourceDirs, gFileA);
        f(applicationInfo.splitPublicSourceDirs, gFileA);
        return true;
    }

    public static GFile d0() {
        return new GFile(f22995g, ".session_dir");
    }

    public static String e(String str, GFile gFile) {
        return new GFile(gFile, new GFile(str).getName()).getAbsolutePath();
    }

    public static GFile e0(int i10) {
        return new GFile(f22998j, String.valueOf(i10));
    }

    public static void f(String[] strArr, GFile gFile) {
        if (strArr == null) {
            return;
        }
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr[i10] = e(strArr[i10], gFile);
        }
    }

    public static GFile f0(int i10) {
        return new GFile(f23004p, String.valueOf(i10));
    }

    public static GFile g() {
        return f23000l;
    }

    public static GFile g0() {
        return f23004p;
    }

    public static GFile h() {
        return f23001m;
    }

    public static GFile h0(int i10) {
        return new GFile(f23003o, String.valueOf(i10));
    }

    public static GFile i() {
        return f22995g;
    }

    public static GFile i0() {
        return f23003o;
    }

    public static GFile j() {
        return f23002n;
    }

    public static GFile j0() {
        return f22998j;
    }

    public static GFile k() {
        return f23005q;
    }

    public static GFile k0(int i10, String str) {
        return new GFile(l0(i10), android.support.v4.media.i.a("download-owned-", str, ".ini"));
    }

    public static GFile l() {
        return f23009u;
    }

    public static GFile l0(int i10) {
        return new GFile(new GFile(f23002n, GaiaUserManagerService.f167449I), String.valueOf(i10));
    }

    public static GFile m(String str) {
        if (f23009u == null) {
            return null;
        }
        GFile gFile = f23009u;
        StringBuilder sb2 = new StringBuilder(c.b.f68733a);
        String str2 = File.separator;
        return new GFile(gFile, C2564b.a(sb2, str2, "app", str2, str));
    }

    public static GFile m0(int i10) {
        return new GFile(e0(i10), "wifiMacAddress");
    }

    public static GFile n() {
        return f22999k;
    }

    public static void n0(ApplicationInfo applicationInfo, int i10) {
        try {
            com.prism.gaia.helper.utils.l.K(s(i10, applicationInfo.packageName), -1);
            com.prism.gaia.helper.utils.l.K(u(i10, applicationInfo.packageName), -1);
            com.prism.gaia.helper.utils.l.K(t(i10, applicationInfo.packageName), -1);
            com.prism.gaia.helper.utils.l.K(new GFile(s(i10, applicationInfo.packageName), "shared_prefs"), -1);
        } catch (IOException e10) {
            C5705o.c().a(e10, "APP_DATA_INIT", null);
        }
    }

    public static GFile o(String str) {
        return new GFile(f22999k, androidx.compose.runtime.changelist.j.a(str, MultiDexExtractor.f114845k));
    }

    public static void o0() {
        try {
            f22992d.C(493);
            f22993e.C(493);
            f22994f.C(493);
            f22995g.C(493);
            f22996h.C(493);
            f22997i.C(493);
            f22998j.C(493);
            f22999k.C(493);
            f23000l.C(493);
            f23001m.C(493);
            f23002n.C(493);
            f23003o.C(493);
            f23004p.C(493);
            f23005q.C(493);
            f23006r.C(493);
        } catch (IOException unused) {
        }
    }

    public static GFile p() {
        return f22991c;
    }

    public static void p0(Context context) {
        GFile gFile;
        GFile gFile2;
        String str;
        ApplicationInfo applicationInfoL = GaiaContext.j().l();
        if (applicationInfoL.packageName == null || (str = applicationInfoL.dataDir) == null || str.contains("/null")) {
            C5705o.c().a(new IllegalStateException("gaia dirs from unusable host appInfo: dataDir=" + applicationInfoL.dataDir), "GAIA_DIRS_BAD_HOST_APPINFO", null);
        }
        GFile gFile3 = new GFile(applicationInfoL.dataDir);
        if (C3841e.p()) {
            gFile = new GFile(applicationInfoL.deviceProtectedDataDir);
            gFile2 = new GFile(ApplicationInfoCAG.N24.credentialProtectedDataDir().get(applicationInfoL));
        } else {
            gFile = gFile3;
            gFile2 = gFile;
        }
        f22991c = new GFile(gFile3.getAbsolutePath());
        f22992d = new GFile(gFile3, c.b.f68733a);
        f22993e = new GFile(gFile, c.b.f68733a);
        f22994f = new GFile(gFile2, c.b.f68733a);
        b();
        f23005q = new GFile(f22992d, u4.g.f239565h);
        f23006r = new GFile(f22992d, "system_cache");
        f22995g = new GFile(f22992d, "data");
        f22996h = new GFile(f22993e, "data");
        f22997i = new GFile(f22994f, "data");
        f22999k = new GFile(f22995g, "framework");
        f23000l = new GFile(f22995g, "dalvik_cache");
        f23001m = new GFile(f22995g, "app");
        f23002n = new GFile(f22995g, "system");
        f22998j = new GFile(f22995g, "user");
        f23003o = new GFile(f22996h, "user_de");
        f23004p = new GFile(f22997i, "user");
        o0();
    }

    public static GFile q(String str) {
        return new GFile(r(str), "base.apk");
    }

    public static boolean q0(String str) {
        return str.startsWith(f22999k.getAbsolutePath());
    }

    public static GFile r(String str) {
        return new GFile(f23001m, str);
    }

    public static boolean r0(@NonNull String str) {
        return str.startsWith(f23008t.getAbsolutePath() + File.separator + f22990b);
    }

    public static GFile s(int i10, String str) {
        return new GFile(e0(i10), str);
    }

    public static boolean s0(@NonNull String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f23008t.getAbsolutePath());
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(c.b.f68733a);
        sb2.append(str2);
        return str.startsWith(sb2.toString());
    }

    public static GFile t(int i10, String str) {
        return new GFile(f0(i10), str);
    }

    public static boolean t0(@NonNull String str) {
        return str.startsWith(f23007s.getAbsolutePath() + File.separator + f22990b);
    }

    public static GFile u(int i10, String str) {
        return new GFile(h0(i10), str);
    }

    public static boolean u0(@NonNull String str) {
        return s0(str) || t0(str) || r0(str);
    }

    public static GFile v(String str) {
        return new GFile(r(str), "ext.zip");
    }

    public static void v0() {
        com.prism.gaia.helper.utils.l.s(f22992d);
        com.prism.gaia.helper.utils.l.s(f22993e);
        com.prism.gaia.helper.utils.l.s(f22994f);
        o0();
    }

    public static GFile w(String str) {
        return new GFile(r(str), "_icon");
    }

    public static void w0(Context context) {
        p0(context);
        if (U6.c.e()) {
            return;
        }
        c(context);
    }

    public static GFile x(String str) {
        return new GFile(r(str), "_label");
    }

    public static GFile y(String str, String str2) {
        return new GFile(r(str), str2);
    }

    public static GFile z(String str) {
        return new GFile(f23008t, android.support.v4.media.e.a(new StringBuilder("virtual/Android/data"), File.separator, str));
    }
}
