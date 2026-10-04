package I2;

import android.os.Build;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f50985a = "org.chromium.support_lib_glue.SupportLibReflectionUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f50986b = "createWebViewProviderFactory";

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final V0 f50987a = new V0(b.f50988a.getWebkitToCompatConverter());
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final K0 f50988a = I0.a();
    }

    @NonNull
    public static K0 a() {
        try {
            return new L0((WebViewProviderFactoryBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new C1181i0();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static InvocationHandler b() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (InvocationHandler) Class.forName(f50985a, false, e()).getDeclaredMethod(f50986b, null).invoke(null, null);
    }

    @NonNull
    public static V0 c() {
        return a.f50987a;
    }

    @NonNull
    public static K0 d() {
        return b.f50988a;
    }

    @NonNull
    public static ClassLoader e() {
        return Build.VERSION.SDK_INT >= 28 ? WebView.getWebViewClassLoader() : f().getClass().getClassLoader();
    }

    public static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }
}
