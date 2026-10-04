package c7;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.commons.utils.C3855t;
import com.prism.commons.utils.l0;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.genum.AutoLogSetting;
import com.prism.gaia.helper.utils.ComponentUtils;
import com.prism.gaia.helper.utils.PkgUtils;
import com.prism.gaia.naked.metadata.android.graphics.drawable.IconCAG;
import com.prism.gaia.server.GaiaGuestContentProviderProxy;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okio.internal.ZipKt;
import v8.C5714x;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f131266c = l0.b(m.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f131267a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AutoLogSetting f131268b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f131269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f131270b;

        public a(boolean z10) {
            this.f131269a = z10;
        }

        public static a e(Object[] objArr, int i10, boolean z10) {
            a aVar = new a(z10);
            if (z10) {
                aVar.f131270b = ((Long) objArr[i10]).longValue();
                return aVar;
            }
            aVar.f131270b = ((long) ((Integer) objArr[i10]).intValue()) & ZipKt.f225990j;
            return aVar;
        }

        public a a(int i10) {
            this.f131270b &= ((long) i10) & ZipKt.f225990j;
            return this;
        }

        public a b(long j10) {
            this.f131270b = j10 & this.f131270b;
            return this;
        }

        public a c(int i10) {
            this.f131270b |= ((long) i10) & ZipKt.f225990j;
            return this;
        }

        public a d(long j10) {
            this.f131270b = j10 | this.f131270b;
            return this;
        }

        public int f() {
            return (int) (this.f131270b & ZipKt.f225990j);
        }

        public long g() {
            return this.f131270b;
        }

        public void h(Object[] objArr, int i10) {
            if (this.f131269a) {
                objArr[i10] = Long.valueOf(g());
            } else {
                objArr[i10] = Integer.valueOf(f());
            }
        }
    }

    public m() {
        InterfaceC2951c interfaceC2951c = (InterfaceC2951c) getClass().getAnnotation(InterfaceC2951c.class);
        if (interfaceC2951c != null) {
            this.f131268b = interfaceC2951c.value();
        }
    }

    public static PackageManager B() {
        return v().getPackageManager();
    }

    public static PackageInfo C(String str) {
        return D(str, 0, GaiaContext.j().Z());
    }

    public static PackageInfo D(String str, int i10, int i11) {
        PackageInfo packageInfoC = C5714x.j().C(str, i10, i11);
        h(packageInfoC);
        return packageInfoC;
    }

    public static ProviderInfo E(ComponentName componentName, int i10, int i11) {
        ProviderInfo providerInfoL = C5714x.j().L(componentName, i10, i11);
        i(providerInfoL);
        return providerInfoL;
    }

    public static int F() {
        return GaiaContext.j().R();
    }

    public static int G() {
        return GaiaContext.j().V();
    }

    public static ActivityInfo H(ComponentName componentName, int i10, int i11) {
        ActivityInfo activityInfoM = C5714x.j().M(componentName, i10, i11);
        f(activityInfoM);
        return activityInfoM;
    }

    public static ServiceInfo I(ComponentName componentName, int i10, int i11) {
        ServiceInfo serviceInfoO = C5714x.j().O(componentName, i10, i11);
        k(serviceInfoO);
        return serviceInfoO;
    }

    public static PackageManager J() {
        return GaiaContext.j().T();
    }

    public static int K() {
        return GaiaContext.j().W();
    }

    public static int L() {
        return GaiaContext.j().Y();
    }

    public static int M() {
        return GaiaContext.j().Z();
    }

    public static int N(Object[] objArr, Class cls) {
        if (objArr == null) {
            return -1;
        }
        int i10 = 0;
        for (Object obj : objArr) {
            if (cls.isInstance(obj)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static boolean O() {
        return GaiaContext.j().e0() || GaiaContext.f164212y.j0() || a0();
    }

    public static boolean Q() {
        return GaiaContext.j().e0();
    }

    public static boolean R(ApplicationInfo applicationInfo) {
        return PkgUtils.m(applicationInfo);
    }

    public static boolean S(ApplicationInfo applicationInfo) {
        return PkgUtils.n(applicationInfo);
    }

    public static boolean T(ComponentName componentName) {
        return ComponentUtils.n(componentName);
    }

    public static boolean U(Intent intent) {
        return ComponentUtils.o(intent);
    }

    public static boolean V(Intent intent) {
        return ComponentUtils.p(intent);
    }

    public static boolean W() {
        return GaiaContext.j().h0();
    }

    public static boolean X(Intent intent) {
        return E9.a.e(intent);
    }

    public static boolean Y() {
        return GaiaContext.j().e0() || a0();
    }

    public static boolean Z() {
        return GaiaContext.j().e0() || GaiaContext.f164212y.i0();
    }

    public static boolean a0() {
        return GaiaContext.j().i0() && GProcessClient.f164187n.Y5();
    }

    public static boolean b0() {
        return GaiaContext.j().i0();
    }

    public static boolean c0() {
        return GaiaContext.j().j0();
    }

    public static void d(Intent intent) {
        E9.a.a(intent);
    }

    public static void e(Intent intent) {
        E9.a.b(intent);
    }

    public static List<ResolveInfo> e0(Intent intent, String str, int i10, int i11) {
        List<ResolveInfo> listU = C5714x.j().U(intent, str, i10, i11);
        if (listU == null) {
            return null;
        }
        Iterator<ResolveInfo> it = listU.iterator();
        while (it.hasNext()) {
            j(it.next());
        }
        return listU;
    }

    public static void f(@Nullable ActivityInfo activityInfo) {
        if (activityInfo == null) {
            return;
        }
        g(activityInfo.applicationInfo);
    }

    public static List<ResolveInfo> f0(Intent intent, String str, int i10, int i11) {
        List<ResolveInfo> listV = C5714x.j().V(intent, str, i10, i11);
        if (listV == null) {
            return null;
        }
        Iterator<ResolveInfo> it = listV.iterator();
        while (it.hasNext()) {
            j(it.next());
        }
        return listV;
    }

    public static void g(@Nullable ApplicationInfo applicationInfo) {
        if (applicationInfo != null && Q()) {
            applicationInfo.uid = GaiaContext.f164212y.R();
            applicationInfo.flags &= -32769;
        }
    }

    public static List<ResolveInfo> g0(Intent intent, String str, int i10, int i11) {
        List<ResolveInfo> listW = C5714x.j().W(intent, str, i10, i11);
        if (listW == null) {
            return null;
        }
        Iterator<ResolveInfo> it = listW.iterator();
        while (it.hasNext()) {
            j(it.next());
        }
        return listW;
    }

    public static void h(@Nullable PackageInfo packageInfo) {
        if (packageInfo == null) {
            return;
        }
        g(packageInfo.applicationInfo);
    }

    public static List<ResolveInfo> h0(Intent intent, String str, int i10, int i11) {
        List<ResolveInfo> listX = C5714x.j().X(intent, str, i10, i11);
        if (listX == null) {
            return null;
        }
        Iterator<ResolveInfo> it = listX.iterator();
        while (it.hasNext()) {
            j(it.next());
        }
        return listX;
    }

    public static void i(@Nullable ProviderInfo providerInfo) {
        if (providerInfo == null) {
            return;
        }
        g(providerInfo.applicationInfo);
    }

    public static void i0(Object[] objArr, int i10) {
        if (objArr != null && objArr.length > i10 && (objArr[i10] instanceof String)) {
            objArr[i10] = GaiaContext.j().v();
        }
    }

    public static void j(@Nullable ResolveInfo resolveInfo) {
        if (resolveInfo == null) {
            return;
        }
        f(resolveInfo.activityInfo);
        k(resolveInfo.serviceInfo);
        i(resolveInfo.providerInfo);
    }

    @SuppressLint({"WrongConstant"})
    public static ResolveInfo j0(Intent intent) {
        return J().resolveActivity(intent, C5714x.f239908c);
    }

    public static void k(@Nullable ServiceInfo serviceInfo) {
        if (serviceInfo == null) {
            return;
        }
        g(serviceInfo.applicationInfo);
    }

    public static ResolveInfo k0(Intent intent) {
        return l0(intent, intent.getType(), C5714x.f239908c, M());
    }

    public static void l(Icon icon) {
        String str;
        Uri uriM;
        ApplicationInfo applicationInfoU;
        Resources resourcesF;
        Drawable drawableG;
        if (icon == null) {
            return;
        }
        int iIntValue = IconCAG.f165813G.mType().get(icon).intValue();
        if (iIntValue != 2) {
            if ((iIntValue != 4 && iIntValue != 6) || (str = IconCAG.f165813G.mString1().get(icon)) == null || (uriM = m(Uri.parse(str))) == null) {
                return;
            }
            IconCAG.f165813G.mString1().set(icon, uriM.toString());
            return;
        }
        String str2 = IconCAG.f165813G.mString1().get(icon);
        if (PkgUtils.r(str2) || (applicationInfoU = GaiaContext.j().u(str2)) == null || (resourcesF = GaiaContext.f164212y.f(applicationInfoU)) == null || (drawableG = D0.i.g(resourcesF, IconCAG.f165813G.mInt1().get(icon).intValue(), null)) == null) {
            return;
        }
        Bitmap bitmapE = C3855t.e(drawableG);
        IconCAG.f165813G.mType().set(icon, 1);
        IconCAG.f165813G.mObj1().set(icon, bitmapE);
        IconCAG.f165813G.mString1().set(icon, null);
    }

    public static ResolveInfo l0(Intent intent, String str, int i10, int i11) {
        if (str == null) {
            str = intent.resolveTypeIfNeeded(p());
        }
        ResolveInfo resolveInfoC0 = C5714x.j().c0(intent, str, i10, i11);
        j(resolveInfoC0);
        return resolveInfoC0;
    }

    public static Uri m(Uri uri) {
        String authority;
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        return (scheme == null || scheme.startsWith("http") || (authority = uri.getAuthority()) == null || C5714x.j().b0(authority, 512, 0) == null) ? uri : GaiaGuestContentProviderProxy.x(uri);
    }

    public static ProviderInfo m0(String str) {
        return n0(str, C5714x.f239908c, M());
    }

    public static ActivityInfo n(ComponentName componentName, int i10, int i11) {
        ActivityInfo activityInfoK = C5714x.j().k(componentName, i10, i11);
        f(activityInfoK);
        return activityInfoK;
    }

    public static ProviderInfo n0(String str, int i10, int i11) {
        ProviderInfo providerInfoB0 = C5714x.j().b0(str, i10, i11);
        i(providerInfoB0);
        return providerInfoB0;
    }

    public static ApplicationInfo o(String str, int i10, int i11) {
        ApplicationInfo applicationInfoO = C5714x.j().o(str, i10, i11);
        g(applicationInfoO);
        return applicationInfoO;
    }

    @SuppressLint({"WrongConstant"})
    public static ProviderInfo o0(String str) {
        return J().resolveContentProvider(str, C5714x.f239908c);
    }

    public static ContentResolver p() {
        return v().getContentResolver();
    }

    public static ResolveInfo p0(Intent intent) {
        return q0(intent, intent.getType(), C5714x.f239908c, M());
    }

    public static String q() {
        return GaiaContext.j().r();
    }

    public static ResolveInfo q0(Intent intent, String str, int i10, int i11) {
        if (str == null) {
            str = intent.resolveTypeIfNeeded(p());
        }
        ResolveInfo resolveInfoD0 = C5714x.j().d0(intent, str, i10, i11);
        j(resolveInfoD0);
        return resolveInfoD0;
    }

    public static ComponentName r() {
        return new ComponentName(w(), U6.c.s(GaiaContext.f164212y.X()));
    }

    @SuppressLint({"WrongConstant"})
    public static ResolveInfo r0(Intent intent) {
        return J().resolveService(intent, C5714x.f239908c);
    }

    public static ApplicationInfo s(String str) {
        try {
            return v().getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static PackageInfo t(String str) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfoU = u(str);
        if (packageInfoU != null) {
            return packageInfoU;
        }
        throw new PackageManager.NameNotFoundException(w.y.a("Unknown package: ", str));
    }

    public static PackageInfo u(String str) {
        PackageInfo packageInfoU;
        try {
            packageInfoU = C(str);
        } catch (Throwable unused) {
            packageInfoU = null;
        }
        if (packageInfoU != null) {
            h(packageInfoU);
            return packageInfoU;
        }
        try {
            packageInfoU = GaiaContext.j().U(str, 0);
        } catch (Throwable unused2) {
        }
        if (packageInfoU == null || !PkgUtils.n(packageInfoU.applicationInfo)) {
            return null;
        }
        return packageInfoU;
    }

    public static Context v() {
        return GaiaContext.j().n();
    }

    public static String w() {
        return GaiaContext.j().v();
    }

    public static List<ApplicationInfo> x(int i10, int i11) {
        List<ApplicationInfo> listV = C5714x.j().v(i10, i11);
        if (listV == null) {
            return null;
        }
        Iterator<ApplicationInfo> it = listV.iterator();
        while (it.hasNext()) {
            g(it.next());
        }
        return listV;
    }

    @NonNull
    public static List<PackageInfo> y(int i10) {
        List<PackageInfo> listX = C5714x.j().x(i10, M());
        if (listX == null) {
            return new ArrayList(0);
        }
        Iterator<PackageInfo> it = listX.iterator();
        while (it.hasNext()) {
            h(it.next());
        }
        return listX;
    }

    public abstract String A();

    public boolean P() {
        return this.f131267a;
    }

    public boolean b(Object obj, Method method, Object... objArr) {
        return true;
    }

    public Object c(Object obj, Method method, Object... objArr) throws Throwable {
        return method.invoke(obj, objArr);
    }

    public List<ProviderInfo> d0(String str, int i10, int i11) {
        List<ProviderInfo> listT = C5714x.j().T(str, i10, i11);
        if (listT == null) {
            return null;
        }
        Iterator<ProviderInfo> it = listT.iterator();
        while (it.hasNext()) {
            i(it.next());
        }
        return listT;
    }

    public void s0(boolean z10) {
        this.f131267a = z10;
    }

    public void t0(AutoLogSetting autoLogSetting) {
        this.f131268b = autoLogSetting;
    }

    public String toString() {
        return "Method: " + A();
    }

    public AutoLogSetting z() {
        return this.f131268b;
    }

    public Object a(Object obj, Method method, Object[] objArr, Object obj2) throws Throwable {
        return obj2;
    }
}
