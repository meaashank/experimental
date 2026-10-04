package H2;

import I2.AbstractC1164a;
import I2.C1165a0;
import I2.C1166b;
import I2.D0;
import I2.H0;
import I2.I0;
import I2.J0;
import I2.K0;
import I2.P0;
import I2.S0;
import I2.z0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.InterfaceC4330d;
import e.e0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f45478a = Uri.parse("*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uri f45479b = Uri.parse("");

    public interface a {
        @e0
        void onComplete(long j10);
    }

    public interface b {
        @e0
        void onPostMessage(@NonNull WebView webView, @NonNull o oVar, @NonNull Uri uri, boolean z10, @NonNull c cVar);
    }

    @InterfaceC4330d
    @Deprecated
    public static void A(@NonNull List<String> list, @Nullable ValueCallback<Boolean> valueCallback) {
        z(new HashSet(list), valueCallback);
    }

    @e0
    public static void B(@NonNull WebView webView, @Nullable w wVar) {
        AbstractC1164a.h hVar = H0.f50937O;
        if (hVar.c()) {
            C1165a0.e(webView, wVar);
        } else {
            if (!hVar.d()) {
                throw H0.a();
            }
            c(webView);
            l(webView).o(null, wVar);
        }
    }

    @e0
    @SuppressLint({"LambdaLast"})
    public static void C(@NonNull WebView webView, @NonNull Executor executor, @NonNull w wVar) {
        AbstractC1164a.h hVar = H0.f50937O;
        if (hVar.c()) {
            C1165a0.f(webView, executor, wVar);
        } else {
            if (!hVar.d()) {
                throw H0.a();
            }
            c(webView);
            l(webView).o(executor, wVar);
        }
    }

    @InterfaceC4330d
    public static void D(@NonNull Context context, @Nullable ValueCallback<Boolean> valueCallback) {
        AbstractC1164a.f fVar = H0.f50957e;
        if (fVar.c()) {
            WebView.startSafeBrowsing(context, valueCallback);
        } else {
            if (!fVar.d()) {
                throw H0.a();
            }
            I0.b.f50988a.getStatics().initSafeBrowsing(context, valueCallback);
        }
    }

    @NonNull
    @e0
    public static i a(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set) {
        if (H0.f50944V.d()) {
            return l(webView).a(str, (String[]) set.toArray(new String[0]));
        }
        throw H0.a();
    }

    @e0
    public static void b(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set, @NonNull b bVar) {
        if (!H0.f50943U.d()) {
            throw H0.a();
        }
        l(webView).b(str, (String[]) set.toArray(new String[0]), bVar);
    }

    public static void c(WebView webView) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
                return;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        }
        Looper webViewLooper = webView.getWebViewLooper();
        if (webViewLooper == Looper.myLooper()) {
            return;
        }
        throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
    }

    public static WebViewProviderBoundaryInterface d(WebView webView) {
        return I0.b.f50988a.createWebView(webView);
    }

    @NonNull
    @e0
    public static p[] e(@NonNull WebView webView) {
        H0.f50927E.getClass();
        return D0.l(webView.createWebMessageChannel());
    }

    @Nullable
    @InterfaceC4330d
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static PackageInfo f() {
        if (Build.VERSION.SDK_INT >= 26) {
            return WebView.getCurrentWebViewPackage();
        }
        try {
            return i();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @Nullable
    @InterfaceC4330d
    public static PackageInfo g(@NonNull Context context) {
        PackageInfo packageInfoF = f();
        return packageInfoF != null ? packageInfoF : j(context);
    }

    public static K0 h() {
        return I0.b.f50988a;
    }

    @SuppressLint({"PrivateApi"})
    public static PackageInfo i() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    @SuppressLint({"PrivateApi"})
    public static PackageInfo j(Context context) {
        try {
            String str = Build.VERSION.SDK_INT <= 23 ? (String) Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", null).invoke(null, null) : (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @NonNull
    @e0
    public static d k(@NonNull WebView webView) {
        if (H0.f50954c0.d()) {
            return l(webView).d();
        }
        throw H0.a();
    }

    public static J0 l(WebView webView) {
        return new J0(I0.b.f50988a.createWebView(webView));
    }

    @NonNull
    @InterfaceC4330d
    public static Uri m() {
        AbstractC1164a.f fVar = H0.f50967j;
        if (fVar.c()) {
            return WebView.getSafeBrowsingPrivacyPolicyUrl();
        }
        if (fVar.d()) {
            return I0.b.f50988a.getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw H0.a();
    }

    @NonNull
    @InterfaceC4330d
    public static String n() {
        if (H0.f50946X.d()) {
            return I0.b.f50988a.getStatics().getVariationsHeader();
        }
        throw H0.a();
    }

    @Nullable
    @e0
    public static WebChromeClient o(@NonNull WebView webView) {
        AbstractC1164a.e eVar = H0.f50931I;
        if (eVar.c()) {
            return webView.getWebChromeClient();
        }
        if (!eVar.d()) {
            throw H0.a();
        }
        c(webView);
        return l(webView).f50989a.getWebChromeClient();
    }

    @NonNull
    @e0
    public static WebViewClient p(@NonNull WebView webView) {
        AbstractC1164a.e eVar = H0.f50930H;
        if (eVar.c()) {
            return webView.getWebViewClient();
        }
        if (!eVar.d()) {
            throw H0.a();
        }
        c(webView);
        return l(webView).f50989a.getWebViewClient();
    }

    @Nullable
    @e0
    public static v q(@NonNull WebView webView) {
        AbstractC1164a.h hVar = H0.f50932J;
        if (hVar.c()) {
            WebViewRenderProcess webViewRenderProcess = webView.getWebViewRenderProcess();
            if (webViewRenderProcess != null) {
                return S0.c(webViewRenderProcess);
            }
            return null;
        }
        if (!hVar.d()) {
            throw H0.a();
        }
        c(webView);
        return l(webView).g();
    }

    @Nullable
    @e0
    public static w r(@NonNull WebView webView) {
        AbstractC1164a.h hVar = H0.f50937O;
        if (!hVar.c()) {
            if (!hVar.d()) {
                throw H0.a();
            }
            c(webView);
            return l(webView).h();
        }
        WebViewRenderProcessClient webViewRenderProcessClient = webView.getWebViewRenderProcessClient();
        if (webViewRenderProcessClient == null || !(webViewRenderProcessClient instanceof P0)) {
            return null;
        }
        return ((P0) webViewRenderProcessClient).a();
    }

    @e0
    public static boolean s(@NonNull WebView webView) {
        if (H0.f50960f0.d()) {
            return l(webView).f50989a.isAudioMuted();
        }
        throw H0.a();
    }

    @InterfaceC4330d
    public static boolean t() {
        if (H0.f50940R.d()) {
            return I0.b.f50988a.getStatics().isMultiProcessEnabled();
        }
        throw H0.a();
    }

    @e0
    public static void u(@NonNull WebView webView, long j10, @NonNull a aVar) {
        H0.f50949a.getClass();
        C1166b.i(webView, j10, aVar);
    }

    @e0
    public static void v(@NonNull WebView webView, @NonNull o oVar, @NonNull Uri uri) {
        if (f45478a.equals(uri)) {
            uri = f45479b;
        }
        AbstractC1164a.b bVar = H0.f50928F;
        bVar.getClass();
        if (oVar.e() == 0) {
            webView.postWebMessage(C1166b.b(oVar), uri);
        } else {
            if (!bVar.d() || !z0.a(oVar.e())) {
                throw H0.a();
            }
            c(webView);
            l(webView).k(oVar, uri);
        }
    }

    @e0
    public static void w(@NonNull WebView webView, @NonNull String str) {
        if (!H0.f50943U.d()) {
            throw H0.a();
        }
        l(webView).l(str);
    }

    @e0
    public static void x(@NonNull WebView webView, boolean z10) {
        if (!H0.f50960f0.d()) {
            throw H0.a();
        }
        l(webView).m(z10);
    }

    @e0
    public static void y(@NonNull WebView webView, @NonNull String str) {
        if (!H0.f50954c0.d()) {
            throw H0.a();
        }
        l(webView).n(str);
    }

    @InterfaceC4330d
    public static void z(@NonNull Set<String> set, @Nullable ValueCallback<Boolean> valueCallback) {
        AbstractC1164a.f fVar = H0.f50965i;
        AbstractC1164a.f fVar2 = H0.f50963h;
        if (fVar.d()) {
            I0.b.f50988a.getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        if (fVar2.c()) {
            WebView.setSafeBrowsingWhitelist(arrayList, valueCallback);
        } else {
            if (!fVar2.d()) {
                throw H0.a();
            }
            I0.b.f50988a.getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        }
    }
}
