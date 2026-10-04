package U6;

import U6.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.C3853q;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;
import com.prism.commons.utils.n0;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.client.stub.GuestActivityStub;
import com.prism.gaia.client.stub.GuestDialogStub;
import com.prism.gaia.client.stub.GuestJobServiceProxy;
import com.prism.gaia.client.stub.GuestPendingActivityProxy;
import com.prism.gaia.client.stub.GuestPendingReceiverProxy;
import com.prism.gaia.client.stub.GuestPendingServiceProxy;
import com.prism.gaia.client.stub.GuestServiceStub;
import com.prism.gaia.client.stub.GuestShortcutActivityProxy;
import com.prism.gaia.client.stub.SandboxedProcessServiceStub;
import com.prism.gaia.helper.compat.NativeLibraryHelperCompat;
import com.prism.gaia.naked.compat.android.app.ActivityManagerNativeCompat2;
import com.prism.gaia.naked.compat.dalvik.system.VMRuntimeCompat2;
import com.prism.gaia.naked.metadata.android.app.IActivityManagerCAG;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import s6.C5577b;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f68667A = 26;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f68668B = "com.app.hider.master.promax";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f68669C = "com.app.hider.helper.hider32helper";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f68670D = "com.app.hider.helper.hider64helper";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f68671E = "com.app.hider.helper.hider64helper";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f68672F = 1000000;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f68673G = 1000000;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f68674H = 200;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f68675I = 300;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f68676J = 300;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f68677K = 0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f68678L = 63;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f68679M = 200;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f68680N = 250;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f68681O = 500;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f68682P = 110;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f68683Q = 300;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f68684R = 64;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f68685S = 51;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final String f68686T = "_gaia_guest_provider_stub_";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String f68687U = "_gaia_64agent_guest_provider_stub_";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f68688V = "com.prism.internal.invalid";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final String f68689W = "com.app.hider.master.promax_GaiaOutsiderAct_";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final String f68690X = "com.app.hider.master.promax_GaiaProtected_";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String f68691Y = "com.app.hider.master.promax_GaiaSReceiver_";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final String f68692Z = ":guest";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f68694a0 = ":sandbox";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f68703f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f68705g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f68707h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f68709i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f68711j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static n f68713k = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static String[] f68717n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String[] f68718o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static String[] f68719p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static String[] f68720q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static String[] f68721r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static String[] f68722s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public static String f68723t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public static String f68724u = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final boolean f68728y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final boolean f68729z = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f68693a = l0.b(c.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f68695b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f68697c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f68699d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f68701e = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f68715l = {"armeabi-v7a"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f68716m = {"arm64-v8a"};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static String f68725v = "user_terms_not_finished_yet";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final HashSet<String> f68726w = new HashSet<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final HashSet<String> f68727x = new HashSet<>();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static String f68696b0 = GuestPendingActivityProxy.class.getName();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static String f68698c0 = GuestPendingServiceProxy.class.getName();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static String f68700d0 = GuestPendingReceiverProxy.class.getName();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static String f68702e0 = GuestJobServiceProxy.class.getName();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static String f68704f0 = GuestShortcutActivityProxy.class.getName();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f68706g0 = GuestActivityStub.class.getName();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f68708h0 = GuestDialogStub.class.getName();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f68710i0 = GuestServiceStub.class.getName();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f68712j0 = SandboxedProcessServiceStub.class.getName();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final List<C5577b> f68714k0 = new LinkedList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f68730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f68731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f68732c;

        public a(boolean z10, boolean z11, int i10) {
            this.f68730a = z10;
            this.f68731b = z11;
            this.f68732c = i10;
        }

        public String a(Context context) {
            StringBuilder sbA = androidx.compose.runtime.changelist.a.a(context.getString(this.f68730a ? o.n.f72057G2 : o.n.f72063H2));
            sbA.append(this.f68731b ? "  64bit" : "  32bit");
            StringBuilder sbA2 = android.support.v4.media.f.a(sbA.toString(), "  api");
            sbA2.append(this.f68732c);
            return sbA2.toString();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f68733a = "gaia";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final com.prism.gaia.helper.e f68734b = new com.prism.gaia.helper.e("", android.support.v4.media.e.a(new StringBuilder(), File.separator, f68733a));
    }

    public static int A(String str) {
        try {
            PackageInfo packageInfoU = GaiaContext.j().U(str, 0);
            if (packageInfoU != null) {
                return packageInfoU.versionCode;
            }
            return 1000000;
        } catch (Throwable unused) {
            I.a(f68693a, "helper support not installed yet");
            return 1000000;
        }
    }

    public static String B(int i10, String str) {
        return C(i10, str) + i10;
    }

    public static String C(int i10, String str) {
        return W(str) ? A(str) < 2 ? f68687U : androidx.compose.runtime.changelist.j.a(str, "._gaia_64agent_guest_provider_stub_") : androidx.compose.runtime.changelist.j.a(str, "._gaia_guest_provider_stub_");
    }

    public static String D(String str) {
        return C(-1, str);
    }

    public static int E() {
        try {
            PackageInfo packageInfoU = GaiaContext.j().U("com.app.hider.master.promax", 0);
            if (packageInfoU != null) {
                return packageInfoU.versionCode;
            }
            return 1000000;
        } catch (Throwable th) {
            I.u(f68693a, "failed to get launch version: " + th.getMessage());
            return 1000000;
        }
    }

    public static com.prism.gaia.helper.e F() {
        return b.f68734b;
    }

    public static Set<String> G() {
        return f68726w;
    }

    public static String H(int i10) {
        return f68712j0 + "$Sandbox" + i10;
    }

    public static String I() {
        return f68711j;
    }

    public static String J() {
        return f68725v;
    }

    public static void K(Context context, n nVar) {
        I.p();
        i6.d.a();
        f68713k = nVar;
        if (f68695b) {
            boolean zIsRunning64BitVM = VMRuntimeCompat2.Util.isRunning64BitVM();
            f68699d = zIsRunning64BitVM;
            f68703f = zIsRunning64BitVM;
            f68705g = zIsRunning64BitVM ? "com.app.hider.helper.hider64helper" : "com.app.hider.helper.hider32helper";
        } else {
            f68703f = VMRuntimeCompat2.Util.isRunning64BitVM();
            f68705g = "com.app.hider.master.promax";
        }
        f68707h = context.getApplicationInfo().targetSdkVersion;
        f68709i = Z();
        f68711j = "com.app.hider.master.promax" + context.getString(o.n.f72292u4);
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        Arrays.toString(strArr);
        String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
        Arrays.toString(strArr2);
        f68717n = strArr;
        f68718o = strArr2;
        f68719p = Build.SUPPORTED_ABIS;
        f68720q = NativeLibraryHelperCompat.e(f68715l, strArr);
        String[] strArrE = NativeLibraryHelperCompat.e(f68716m, strArr2);
        f68721r = strArrE;
        String[] strArr3 = f68720q;
        f68723t = strArr3.length > 0 ? strArr3[0] : null;
        f68724u = strArrE.length > 0 ? strArrE[0] : null;
        Arrays.toString(strArr3);
        Arrays.toString(f68721r);
        if (f68724u == null) {
            f68697c = false;
        } else {
            f68697c = true;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String[] strArr4 : f68703f ? new String[][]{f68721r, f68720q} : new String[][]{f68720q, f68721r}) {
            linkedHashSet.addAll(Arrays.asList(strArr4));
        }
        String[] strArr5 = (String[]) linkedHashSet.toArray(new String[0]);
        f68722s = strArr5;
        Arrays.toString(strArr5);
        HashSet<String> hashSet = f68726w;
        hashSet.addAll(Arrays.asList(U6.b.f68587x));
        if (C3841e.w() && f68707h >= 29) {
            hashSet.addAll(Arrays.asList(U6.b.f68588y));
        }
        if (C3841e.D() && f68707h >= 33) {
            hashSet.removeAll(Arrays.asList(U6.b.f68567d));
            hashSet.addAll(Arrays.asList(U6.b.f68589z));
        }
        HashSet<String> hashSet2 = f68727x;
        hashSet2.add(U6.b.f68570g);
        hashSet2.addAll(Arrays.asList(U6.b.f68567d));
        if (C3841e.D()) {
            hashSet2.addAll(Arrays.asList(U6.b.f68568e));
        }
        if (C3841e.D() && f68707h >= 33) {
            nVar.b().getClass();
            f68714k0.add(new C5577b("android.permission.POST_NOTIFICATIONS", o.n.f72082K3, false));
        }
        p6.i.f226368a = "com.app.hider.master.promax";
    }

    public static void L(Context context) {
        f68725v = C3853q.c(context);
    }

    public static boolean M(String str) {
        return f68705g.equals(str);
    }

    public static boolean N() {
        return false;
    }

    public static boolean O() {
        return false;
    }

    public static boolean P() {
        return true;
    }

    public static boolean Q(String str) {
        return str != null && str.startsWith(f68710i0);
    }

    public static boolean R(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("com.app.hider.helper.hider32helper");
    }

    public static boolean S(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("com.app.hider.helper.hider64helper");
    }

    public static boolean T(String str) {
        int iA = A(str);
        return iA != 1000000 && iA >= 200;
    }

    public static boolean U(String str) {
        return false;
    }

    public static boolean V(String str) {
        int iA = A(str);
        return (str.equals("com.app.hider.helper.hider32helper") || str.equals("com.app.hider.helper.hider64helper")) ? iA != 1000000 && iA >= 200 : iA != 1000000 && iA >= 300;
    }

    public static boolean W(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("com.app.hider.helper.hider32helper") || str.startsWith("com.app.hider.helper.hider64helper");
    }

    public static boolean X(String str) {
        return "com.app.hider.master.promax".equals(str) || W(str);
    }

    public static boolean Y(String str) {
        if (str != null) {
            return str.endsWith(f68686T) || str.endsWith(f68687U);
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public static boolean Z() {
        return Process.isIsolated();
    }

    public static String a(boolean z10, int i10) {
        return z10 ? "com.app.hider.helper.hider64helper" : "com.app.hider.helper.hider32helper";
    }

    public static boolean a0(String str) {
        return "com.app.hider.master.promax".equals(str);
    }

    public static a b(String str) {
        int iZ = z(str);
        return iZ > 0 ? new a(true, false, iZ) : iZ < 0 ? new a(true, true, -iZ) : new a(false, f68697c, f68707h);
    }

    public static boolean b0() {
        return f68697c;
    }

    public static String c(String str, int i10, @NonNull String str2) {
        return str + f68694a0 + i10 + com.prism.gaia.server.accounts.b.f166434b0 + H(i10) + com.prism.gaia.server.accounts.b.f166434b0 + str2;
    }

    public static boolean c0() {
        return false;
    }

    public static String d() {
        return f68705g;
    }

    public static boolean d0(String str) {
        return f68727x.contains(str);
    }

    public static boolean e() {
        return f68709i;
    }

    public static boolean e0() {
        return false;
    }

    public static int f() {
        return f68707h;
    }

    public static boolean f0() {
        return f68703f;
    }

    public static void g() {
        try {
            IActivityManagerCAG.N21_.addPackageDependency().call(ActivityManagerNativeCompat2.Util.getIActivityManager(), "com.app.hider.master.promax");
        } catch (Throwable th) {
            I.h(f68693a, "addPackageDependency exception.", th);
        }
    }

    public static boolean g0() {
        return f68695b;
    }

    @Nullable
    public static String h() {
        return f68723t;
    }

    public static boolean h0(int i10) {
        return i10 >= 500;
    }

    public static String[] i() {
        return f68720q;
    }

    public static boolean i0() {
        return false;
    }

    public static String[] j() {
        return f68717n;
    }

    public static boolean j0(boolean z10, int i10) {
        if (!z10) {
            return false;
        }
        if (GaiaContext.j().x() < 34) {
            return true;
        }
        A6.l.a(i10);
        return false;
    }

    @Nullable
    public static String k() {
        return f68724u;
    }

    public static void k0(boolean z10) {
        f68699d = z10;
    }

    public static String[] l() {
        return f68721r;
    }

    public static void l0(int i10) {
        f68701e = i10;
    }

    public static String[] m() {
        return f68718o;
    }

    public static void m0() {
        f68695b = true;
    }

    public static String[] n() {
        return f68722s;
    }

    public static boolean n0() {
        return n0.e() || n0.d().f162117a;
    }

    public static String[] o() {
        return f68719p;
    }

    public static String p() {
        return f68703f ? f68724u : f68723t;
    }

    public static String q() {
        return NativeLibraryHelperCompat.l(p());
    }

    public static n r() {
        return f68713k;
    }

    public static String s(int i10) {
        return t(i10, false);
    }

    public static String t(int i10, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f68706g0);
        sb2.append("$Guest");
        sb2.append(i10);
        sb2.append(z10 ? "R" : "");
        return sb2.toString();
    }

    public static String u(int i10) {
        return v(i10, false);
    }

    public static String v(int i10, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f68708h0);
        sb2.append("$Guest");
        sb2.append(i10);
        sb2.append(z10 ? "R" : "");
        return sb2.toString();
    }

    public static String w(int i10, int i11) {
        if (h0(i10)) {
            return H(i10);
        }
        return f68710i0 + "$Guest" + i10;
    }

    public static int x(String str) {
        if (str == null) {
            return -1;
        }
        if (!str.startsWith("com.app.hider.helper.hider32helper")) {
            return -2;
        }
        if (str.length() == 34) {
            return 26;
        }
        try {
            return Integer.parseInt(str.substring(38));
        } catch (NumberFormatException unused) {
            return -3;
        }
    }

    public static int y(String str) {
        if (str == null) {
            return -1;
        }
        if (!str.startsWith("com.app.hider.helper.hider64helper")) {
            return -2;
        }
        if (str.length() == 34) {
            return 26;
        }
        try {
            return Integer.parseInt(str.substring(38));
        } catch (NumberFormatException unused) {
            return -3;
        }
    }

    public static int z(String str) {
        if (str == null) {
            return 0;
        }
        int iX = x(str);
        if (iX > 0) {
            return iX;
        }
        int iY = y(str);
        if (iY > 0) {
            return -iY;
        }
        return 0;
    }
}
