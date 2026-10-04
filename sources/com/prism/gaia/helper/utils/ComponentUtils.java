package com.prism.gaia.helper.utils;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import androidx.compose.animation.core.E0;
import com.prism.commons.utils.P;

/* JADX INFO: loaded from: classes6.dex */
public class ComponentUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f165052a = "asdf-".concat(ComponentUtils.class.getSimpleName());

    public enum ComponentType {
        ActivityInfo,
        ServiceInfo,
        ProviderInfo,
        Unknown
    }

    public static void a(StringBuilder sb2, ComponentName componentName) {
        b(sb2, componentName.getPackageName(), componentName.getClassName());
    }

    public static void b(StringBuilder sb2, String str, String str2) {
        int length;
        int length2;
        sb2.append(str);
        sb2.append('/');
        if (str2.startsWith(str) && (length2 = str2.length()) > (length = str.length()) && str2.charAt(length) == '.') {
            sb2.append((CharSequence) str2, length, length2);
        } else {
            sb2.append(str2);
        }
    }

    public static void c(ComponentInfo componentInfo) {
        if (componentInfo != null) {
            if (TextUtils.isEmpty(componentInfo.processName)) {
                componentInfo.processName = componentInfo.packageName;
            }
            componentInfo.name = h(componentInfo.packageName, componentInfo.name);
        }
    }

    public static boolean d(Intent intent, String str) {
        ComponentName component = intent.getComponent();
        if (component == null || component.getPackageName() == null || !component.getPackageName().startsWith(str)) {
            return false;
        }
        intent.setComponent(new ComponentName(str, h(component.getPackageName(), component.getClassName())));
        return true;
    }

    public static ComponentType e(ComponentInfo componentInfo) {
        return componentInfo instanceof ActivityInfo ? ComponentType.ActivityInfo : componentInfo instanceof ServiceInfo ? ComponentType.ServiceInfo : componentInfo instanceof ProviderInfo ? ComponentType.ProviderInfo : ComponentType.Unknown;
    }

    public static String f(ComponentType componentType) {
        int iOrdinal = componentType.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? "Unknown" : "ProviderInfo" : "ServiceInfo" : "ActivityInfo";
    }

    public static String g(ComponentInfo componentInfo) {
        return h(componentInfo.packageName, componentInfo.name);
    }

    public static String h(String str, String str2) {
        if (str2 != null) {
            return str2.charAt(0) == '.' ? androidx.compose.runtime.changelist.j.a(str, str2) : str2;
        }
        return null;
    }

    public static String i(ComponentInfo componentInfo) {
        return U6.c.F().c(componentInfo.applicationInfo.dataDir);
    }

    public static String j(ResolveInfo resolveInfo) {
        if (resolveInfo == null) {
            return null;
        }
        String str = resolveInfo.resolvePackageName;
        if (str != null) {
            return str;
        }
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        if (activityInfo != null) {
            return activityInfo.packageName;
        }
        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
        if (serviceInfo != null) {
            return serviceInfo.packageName;
        }
        ProviderInfo providerInfo = resolveInfo.providerInfo;
        if (providerInfo != null) {
            return providerInfo.packageName;
        }
        return null;
    }

    public static String k(ComponentInfo componentInfo) {
        return TextUtils.isEmpty(componentInfo.processName) ? componentInfo.packageName : componentInfo.processName;
    }

    public static String l(ActivityInfo activityInfo) {
        String str = activityInfo.taskAffinity;
        return (str == null && activityInfo.applicationInfo.taskAffinity == null) ? activityInfo.packageName : str != null ? str : activityInfo.applicationInfo.taskAffinity;
    }

    public static boolean m(Intent intent) {
        return intent != null && (intent.getFlags() & 524288) == 524288;
    }

    public static boolean n(ComponentName componentName) {
        return componentName != null && U6.c.X(componentName.getPackageName());
    }

    public static boolean o(Intent intent) {
        return intent != null && n(intent.getComponent());
    }

    public static boolean p(Intent intent) {
        return intent != null && U6.c.f68688V.equals(intent.getPackage());
    }

    public static boolean q(ComponentName componentName, ComponentName componentName2) {
        if (componentName == null || componentName2 == null) {
            return false;
        }
        return h(componentName.getPackageName(), componentName.getClassName()).equals(h(componentName2.getPackageName(), componentName2.getClassName()));
    }

    public static boolean r(ComponentInfo componentInfo, ComponentName componentName) {
        return q(u(componentInfo), componentName);
    }

    public static boolean s(ComponentInfo componentInfo, ComponentInfo componentInfo2) {
        if (componentInfo != null && componentInfo2 != null) {
            String str = componentInfo.packageName;
            String str2 = componentInfo2.packageName;
            String strH = h(str, componentInfo.name);
            String strH2 = h(componentInfo2.packageName, componentInfo2.name);
            if (str.equals(str2) && strH.equals(strH2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean t(Intent intent, Intent intent2) {
        if (intent == null || intent2 == null) {
            return true;
        }
        if (!P.a(intent.getAction(), intent2.getAction()) || !P.a(intent.getData(), intent2.getData()) || !P.a(intent.getType(), intent2.getType())) {
            return false;
        }
        String packageName = intent.getPackage();
        if (packageName == null && intent.getComponent() != null) {
            packageName = intent.getComponent().getPackageName();
        }
        String packageName2 = intent2.getPackage();
        if (packageName2 == null && intent2.getComponent() != null) {
            packageName2 = intent2.getComponent().getPackageName();
        }
        return P.a(packageName, packageName2) && P.a(intent.getComponent(), intent2.getComponent()) && P.a(intent.getCategories(), intent2.getCategories());
    }

    public static ComponentName u(ComponentInfo componentInfo) {
        return new ComponentName(componentInfo.packageName, componentInfo.name);
    }

    public static ComponentName v(ComponentInfo componentInfo, String str) {
        return str == null ? u(componentInfo) : new ComponentName(componentInfo.packageName, E0.a(new StringBuilder(), componentInfo.name, com.prism.gaia.server.accounts.b.f166434b0, str));
    }
}
