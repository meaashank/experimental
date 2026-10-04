package com.prism.gaia.naked.compat.android.security.net.config;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.prism.gaia.naked.compat.android.security.net.config.ManifestConfigSourceCompat2;
import com.prism.gaia.naked.metadata.android.security.net.config.ApplicationConfigCAG;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class ApplicationConfigCompat2 {

    public static class Util {
        @TargetApi(24)
        public static void changeConfigSource(Object obj, Object obj2) {
            ApplicationConfigCAG.N24.setDefaultInstance().call(obj);
            ApplicationConfigCAG.N24.mConfigSource().set(obj, obj2);
            ApplicationConfigCAG.N24.mInitialized().set(obj, false);
            ApplicationConfigCAG.N24.ensureInitialized().call(obj, new Object[0]);
        }

        @TargetApi(24)
        public static void clearDefaultInstance() {
            ApplicationConfigCAG.N24.setDefaultInstance().call(null);
        }

        @TargetApi(24)
        public static String describeRuleFreeTrust(ApplicationInfo applicationInfo, int i10) {
            try {
                Object objNewInstance = ApplicationConfigCAG.N24.ORG_CLASS().getConstructor(Class.forName("android.security.net.config.ConfigSource")).newInstance(ManifestConfigSourceCompat2.Util.ctor(applicationInfo, i10));
                return "cleartext=" + isCleartextTrafficPermitted(objNewInstance) + " perDomainRules=" + hasPerDomainConfigs(objNewInstance);
            } catch (Throwable th) {
                return "<failed: " + th.getClass().getName() + ": " + th.getMessage() + ">";
            }
        }

        @TargetApi(24)
        public static Object getDefaultInstance() {
            return ApplicationConfigCAG.N24.getDefaultInstance().call(new Object[0]);
        }

        @TargetApi(24)
        public static boolean hasPerDomainConfigs(Object obj) {
            try {
                Method method = ApplicationConfigCAG.N24.ORG_CLASS().getMethod("hasPerDomainConfigs", null);
                method.setAccessible(true);
                return Boolean.TRUE.equals(method.invoke(obj, null));
            } catch (Throwable unused) {
                return false;
            }
        }

        @TargetApi(24)
        public static boolean installGuestConfigAsDefault(Context context) {
            try {
                Object objNewInstance = ApplicationConfigCAG.N24.ORG_CLASS().getConstructor(Class.forName("android.security.net.config.ConfigSource")).newInstance(ManifestConfigSourceCompat2.Util.ctorFromContext(context));
                ApplicationConfigCAG.N24.mInitialized().set(objNewInstance, false);
                ApplicationConfigCAG.N24.ensureInitialized().call(objNewInstance, new Object[0]);
                ApplicationConfigCAG.N24.setDefaultInstance().call(objNewInstance);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        @TargetApi(24)
        public static void installRuleFreeTrustAsDefault(ApplicationInfo applicationInfo, int i10) {
            try {
                Object objNewInstance = ApplicationConfigCAG.N24.ORG_CLASS().getConstructor(Class.forName("android.security.net.config.ConfigSource")).newInstance(ManifestConfigSourceCompat2.Util.ctor(applicationInfo, i10));
                ApplicationConfigCAG.N24.setDefaultInstance().call(objNewInstance);
                ApplicationConfigCAG.N24.mInitialized().set(objNewInstance, false);
                ApplicationConfigCAG.N24.ensureInitialized().call(objNewInstance, new Object[0]);
            } catch (Throwable unused) {
                clearDefaultInstance();
            }
        }

        @TargetApi(24)
        public static boolean isCleartextTrafficPermitted(Object obj) {
            return ApplicationConfigCAG.N24.isCleartextTrafficPermitted().call(obj, new Object[0]).booleanValue();
        }
    }
}
