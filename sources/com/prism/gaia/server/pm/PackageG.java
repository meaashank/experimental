package com.prism.gaia.server.pm;

import android.annotation.SuppressLint;
import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.Parcel;
import androidx.compose.animation.core.E0;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.compat.android.content.pm.ApplicationInfoCompat2;
import com.prism.gaia.naked.compat.android.content.pm.PackageParserCompat2;
import com.prism.gaia.remote.GuestAppInfo;
import com.prism.gaia.server.pm.PackageParserG;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes6.dex */
public class PackageG {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final String f167485K = "asdf-".concat(PackageG.class.getSimpleName());

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Deprecated
    public static final int f167486L = 1;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f167487M = 2;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public PackageSettingG f167488A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String[] f167489B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int[] f167490C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public State f167491D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public StateCode f167492E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f167493F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f167494G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f167495H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public z f167496I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f167497J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<PackageParserG.a> f167498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<PackageParserG.a> f167499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<PackageParserG.f> f167500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<PackageParserG.g> f167501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<PackageParserG.c> f167502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<PackageParserG.d> f167503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<PackageParserG.e> f167504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<String> f167505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashSet<String> f167506i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<String> f167507j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ApplicationInfo f167508k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Signature[] f167509l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f167510m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bundle f167511n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f167512o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f167513p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f167514q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f167515r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList<String> f167516s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList<String> f167517t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<String> f167518u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f167519v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f167520w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f167521x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList<ConfigurationInfo> f167522y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList<FeatureInfo> f167523z;

    public enum State {
        DEFAULT,
        NEED_DELETE,
        NEED_FIX;

        public boolean isRightState() {
            return this == DEFAULT;
        }
    }

    public enum StateCode {
        DEFAULT,
        INSTALL_ERROR,
        PACKAGE_DAMAGED,
        NEED_MIGRATING,
        NEED_RELOCATE,
        NEED_REINSTALL,
        DEPEND_SYSTEM_MISSING,
        HELPER_MISSING,
        HELPER_NO_INSTALL,
        HELPER_NO_REL_START,
        OPTIMIZE_WAITING,
        HELPER_VS_TOO_LOW;

        public static StateCode readFromParcel(Parcel parcel) {
            return values()[parcel.readInt()];
        }

        public boolean isRightState() {
            return this == DEFAULT;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(ordinal());
        }
    }

    public PackageG() {
        this.f167522y = null;
        this.f167523z = null;
        this.f167494G = 0;
        this.f167491D = State.DEFAULT;
        this.f167492E = StateCode.DEFAULT;
        this.f167493F = null;
    }

    public static long f(int i10, int i11) {
        if (i10 < 0) {
            return ((long) i11) & ZipKt.f225990j;
        }
        return (((long) i11) & ZipKt.f225990j) | (((long) i10) << 32);
    }

    public static int h(long j10) {
        return (int) j10;
    }

    public static int i(long j10) {
        return (int) (j10 >> 32);
    }

    public boolean A() {
        return this.f167491D.isRightState();
    }

    public void B(z zVar) {
        ApplicationInfo applicationInfo;
        Boolean bool;
        this.f167496I = zVar;
        if (zVar == null || (applicationInfo = this.f167508k) == null || (bool = zVar.f167683c) == null || applicationInfo.enabled == bool.booleanValue()) {
            return;
        }
        boolean z10 = this.f167508k.enabled;
        this.f167508k.enabled = bool.booleanValue();
    }

    public void C(int i10) {
        this.f167494G = i10 | this.f167494G;
    }

    public void D(int i10) {
        this.f167494G = i10;
    }

    public final void a() {
        ArrayList<PackageParserG.a> arrayList = this.f167498a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            PackageParserG.a aVar = arrayList.get(i11);
            i11++;
            PackageParserG.a aVar2 = aVar;
            aVar2.f167530a = this;
            ArrayList<II> arrayList2 = aVar2.f167531b;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList2.get(i12);
                i12++;
                ((PackageParserG.ActivityIntentInfo) obj).activity = aVar2;
            }
        }
        ArrayList<PackageParserG.g> arrayList3 = this.f167501d;
        int size3 = arrayList3.size();
        int i13 = 0;
        while (i13 < size3) {
            PackageParserG.g gVar = arrayList3.get(i13);
            i13++;
            PackageParserG.g gVar2 = gVar;
            gVar2.f167530a = this;
            ArrayList<II> arrayList4 = gVar2.f167531b;
            int size4 = arrayList4.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj2 = arrayList4.get(i14);
                i14++;
                ((PackageParserG.ServiceIntentInfo) obj2).service = gVar2;
            }
        }
        ArrayList<PackageParserG.a> arrayList5 = this.f167499b;
        int size5 = arrayList5.size();
        int i15 = 0;
        while (i15 < size5) {
            PackageParserG.a aVar3 = arrayList5.get(i15);
            i15++;
            PackageParserG.a aVar4 = aVar3;
            aVar4.f167530a = this;
            ArrayList<II> arrayList6 = aVar4.f167531b;
            int size6 = arrayList6.size();
            int i16 = 0;
            while (i16 < size6) {
                Object obj3 = arrayList6.get(i16);
                i16++;
                ((PackageParserG.ActivityIntentInfo) obj3).activity = aVar4;
            }
        }
        ArrayList<PackageParserG.f> arrayList7 = this.f167500c;
        int size7 = arrayList7.size();
        int i17 = 0;
        while (i17 < size7) {
            PackageParserG.f fVar = arrayList7.get(i17);
            i17++;
            PackageParserG.f fVar2 = fVar;
            fVar2.f167530a = this;
            ArrayList<II> arrayList8 = fVar2.f167531b;
            int size8 = arrayList8.size();
            int i18 = 0;
            while (i18 < size8) {
                Object obj4 = arrayList8.get(i18);
                i18++;
                ((PackageParserG.ProviderIntentInfo) obj4).provider = fVar2;
            }
        }
        ArrayList<PackageParserG.c> arrayList9 = this.f167502e;
        int size9 = arrayList9.size();
        int i19 = 0;
        while (i19 < size9) {
            PackageParserG.c cVar = arrayList9.get(i19);
            i19++;
            cVar.f167530a = this;
        }
        ArrayList<PackageParserG.d> arrayList10 = this.f167503f;
        int size10 = arrayList10.size();
        int i20 = 0;
        while (i20 < size10) {
            PackageParserG.d dVar = arrayList10.get(i20);
            i20++;
            dVar.f167530a = this;
        }
        ArrayList<PackageParserG.e> arrayList11 = this.f167504g;
        int size11 = arrayList11.size();
        while (i10 < size11) {
            PackageParserG.e eVar = arrayList11.get(i10);
            i10++;
            eVar.f167530a = this;
        }
    }

    public void b() {
        this.f167494G = 0;
    }

    public long c(ApplicationInfo applicationInfo) {
        if (applicationInfo == null) {
            return 1L;
        }
        return (!C3841e.v() || this.f167520w < 0) ? this.f167519v - ApplicationInfoCompat2.Util.getVersionCode(applicationInfo) : n() - ApplicationInfoCompat2.Util.getLongVersionCode(applicationInfo);
    }

    @SuppressLint({"NewApi"})
    public long d(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return 1L;
        }
        return (!C3841e.v() || this.f167520w < 0) ? this.f167519v - packageInfo.versionCode : n() - packageInfo.getLongVersionCode();
    }

    public long e(PackageG packageG) {
        if (packageG == null) {
            return 1L;
        }
        return n() - packageG.n();
    }

    public String g(PackageG packageG) {
        String str = (this.f167510m == null || packageG.f167510m == null) ? (this.f167509l == null || packageG.f167509l == null) ? "nothing-to-compare" : "certs" : C3841e.v() ? "lineage" : "unsupported-sdk";
        StringBuilder sb2 = new StringBuilder("installed{details=");
        sb2.append(this.f167510m != null);
        sb2.append(",certs=");
        Signature[] signatureArr = this.f167509l;
        sb2.append(signatureArr == null ? "null" : String.valueOf(signatureArr.length));
        sb2.append("} incoming{details=");
        sb2.append(packageG.f167510m != null);
        sb2.append(",certs=");
        Signature[] signatureArr2 = packageG.f167509l;
        return E0.a(sb2, signatureArr2 != null ? String.valueOf(signatureArr2.length) : "null", "} compared=", str);
    }

    public void j() {
        a();
        HashSet<String> hashSet = new HashSet<>(this.f167505h.size());
        this.f167506i = hashSet;
        hashSet.addAll(this.f167505h);
        int i10 = 0;
        this.f167495H = false;
        ArrayList<PackageParserG.a> arrayList = this.f167498a;
        int size = arrayList.size();
        while (i10 < size) {
            PackageParserG.a aVar = arrayList.get(i10);
            i10++;
            if (aVar.c("android.intent.action.MAIN")) {
                this.f167495H = true;
                return;
            }
        }
    }

    public void k() {
        j();
    }

    public GuestAppInfo l() {
        PackageSettingG packageSettingG = this.f167488A;
        String str = this.f167512o;
        ApplicationInfo applicationInfo = this.f167508k;
        int i10 = applicationInfo == null ? 0 : applicationInfo.uid;
        int[] vuserIds = packageSettingG.getVuserIds();
        String str2 = packageSettingG.appPath;
        String spacePkgName = packageSettingG.getSpacePkgName();
        String str3 = packageSettingG.betterSpacePkgName;
        ApplicationInfo applicationInfo2 = this.f167508k;
        GuestAppInfo guestAppInfo = new GuestAppInfo(str, i10, vuserIds, str2, spacePkgName, str3, applicationInfo2 == null ? 0 : applicationInfo2.targetSdkVersion, this.f167514q, this.f167519v, this.f167520w, packageSettingG.installerSource, packageSettingG.apkPath, packageSettingG.splitCodePaths, packageSettingG.dexFilePaths, packageSettingG.primaryAbi, packageSettingG.secondaryAbi, packageSettingG.supportedAbis, this.f167492E, this.f167493F, this.f167494G, packageSettingG.isLaunched(0));
        PackageUserStateG userState = packageSettingG.getUserState(0);
        guestAppInfo.enabledState = userState.getEnabled();
        guestAppInfo.hidden = userState.isHidden();
        int[] iArr = guestAppInfo.vuserIds;
        if (iArr != null) {
            guestAppInfo.enabledStates = new int[iArr.length];
            guestAppInfo.hiddenStates = new boolean[iArr.length];
            for (int i11 = 0; i11 < iArr.length; i11++) {
                PackageUserStateG userState2 = packageSettingG.getUserState(iArr[i11]);
                guestAppInfo.enabledStates[i11] = userState2.getEnabled();
                guestAppInfo.hiddenStates[i11] = userState2.isHidden();
            }
        }
        return guestAppInfo;
    }

    public Bundle m() {
        Bundle bundle = this.f167511n;
        return bundle == null ? new Bundle() : bundle;
    }

    public long n() {
        return f(this.f167520w, this.f167519v);
    }

    public String o() {
        String strV = com.prism.gaia.helper.utils.l.V(D9.d.x(this.f167512o).getAbsolutePath());
        return strV != null ? strV.trim() : strV;
    }

    public ArrayList<String> p() {
        return this.f167505h;
    }

    public String q() {
        return this.f167488A.getSpacePkgName();
    }

    public int r() {
        return this.f167494G;
    }

    public boolean s(String str) {
        for (int size = this.f167498a.size() - 1; size >= 0; size--) {
            if (str.equals(this.f167498a.get(size).f167532c)) {
                return true;
            }
        }
        return false;
    }

    public boolean t(int i10) {
        return (i10 & this.f167494G) != 0;
    }

    public boolean u(String str) {
        for (int size = this.f167498a.size() - 1; size >= 0; size--) {
            if (str.equals(this.f167498a.get(size).f167532c)) {
                return true;
            }
        }
        for (int size2 = this.f167499b.size() - 1; size2 >= 0; size2--) {
            if (str.equals(this.f167499b.get(size2).f167532c)) {
                return true;
            }
        }
        for (int size3 = this.f167500c.size() - 1; size3 >= 0; size3--) {
            if (str.equals(this.f167500c.get(size3).f167532c)) {
                return true;
            }
        }
        for (int size4 = this.f167501d.size() - 1; size4 >= 0; size4--) {
            if (str.equals(this.f167501d.get(size4).f167532c)) {
                return true;
            }
        }
        return false;
    }

    public boolean v(PackageG packageG, int i10) {
        Signature[] signatureArr;
        if (this.f167510m != null && packageG.f167510m != null) {
            if (C3841e.v()) {
                return PackageParserCompat2.Util.signingDetailsCheckCapability(packageG.f167510m, this.f167510m, i10);
            }
            return false;
        }
        Signature[] signatureArr2 = this.f167509l;
        if (signatureArr2 == null || (signatureArr = packageG.f167509l) == null) {
            return false;
        }
        return Arrays.equals(signatureArr2, signatureArr);
    }

    public boolean w(String str) {
        Bundle bundle = this.f167511n;
        return (bundle == null || bundle.get(str) == null) ? false : true;
    }

    public boolean x(String str) {
        return this.f167506i.contains(str);
    }

    public boolean y(PackageG packageG, int i10) {
        Object obj;
        Object obj2;
        Signature[] signatureArr;
        if (this.f167510m == null && packageG.f167510m == null) {
            Signature[] signatureArr2 = this.f167509l;
            if (signatureArr2 == null || (signatureArr = packageG.f167509l) == null) {
                return false;
            }
            return Arrays.equals(signatureArr2, signatureArr);
        }
        if (!C3841e.v() || (obj = this.f167510m) == null || (obj2 = packageG.f167510m) == null) {
            return false;
        }
        return PackageParserCompat2.Util.signingDetailsCheckCapability(obj, obj2, i10) || PackageParserCompat2.Util.signingDetailsHasAncestorOrSelf(packageG.f167510m, this.f167510m);
    }

    public boolean z() {
        return this.f167495H;
    }

    public PackageG(String str, State state) {
        this.f167522y = null;
        this.f167523z = null;
        this.f167494G = 0;
        this.f167512o = str;
        this.f167508k = new ApplicationInfo();
        this.f167498a = new ArrayList<>();
        this.f167499b = new ArrayList<>();
        this.f167500c = new ArrayList<>();
        this.f167501d = new ArrayList<>();
        this.f167502e = new ArrayList<>();
        this.f167503f = new ArrayList<>();
        this.f167504g = new ArrayList<>();
        this.f167505h = new ArrayList<>();
        this.f167519v = -1;
        this.f167491D = state;
        this.f167492E = state.isRightState() ? StateCode.DEFAULT : StateCode.INSTALL_ERROR;
        this.f167493F = null;
    }
}
