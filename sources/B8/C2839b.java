package b8;

import X6.s;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.IInterface;
import android.text.TextUtils;
import c7.AbstractC2950b;
import c7.m;
import c7.n;
import com.android.launcher3.IconCache;
import com.prism.gaia.client.GaiaContext;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import v8.C5714x;

/* JADX INFO: renamed from: b8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@TargetApi(17)
public class C2839b extends AbstractC2950b<IInterface> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f125932i = "asdf-".concat(C2839b.class.getSimpleName());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f125933j = "android.app.searchable";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f125934k = "android.app.default_searchable";

    /* JADX INFO: renamed from: b8.b$a */
    public static class a extends m {
        public a() {
        }

        public static Object u0(ComponentName componentName, ActivityInfo activityInfo, boolean z10) throws Exception {
            ApplicationInfo applicationInfo;
            Bundle bundle = activityInfo.metaData;
            int i10 = bundle == null ? 0 : bundle.getInt(C2839b.f125933j, 0);
            if (i10 != 0) {
                return w0(componentName, activityInfo, i10);
            }
            if (!z10) {
                return null;
            }
            String string = bundle == null ? null : bundle.getString(C2839b.f125934k);
            if (TextUtils.isEmpty(string) && (applicationInfo = activityInfo.applicationInfo) != null) {
                Bundle bundle2 = applicationInfo.metaData;
                string = bundle2 == null ? null : bundle2.getString(C2839b.f125934k);
            }
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            String packageName = componentName.getPackageName();
            if (string.startsWith(IconCache.EMPTY_CLASS_NAME)) {
                string = componentName.getPackageName() + string;
            }
            ComponentName componentName2 = new ComponentName(packageName, string);
            ActivityInfo activityInfoX0 = x0(componentName2);
            if (activityInfoX0 != null) {
                return u0(componentName2, activityInfoX0, false);
            }
            String unused = C2839b.f125932i;
            return null;
        }

        public static Context v0() {
            Application application = s.u6().f78659s;
            return application != null ? application : GaiaContext.j().n();
        }

        public static Object w0(ComponentName componentName, ActivityInfo activityInfo, int i10) throws Exception {
            Resources resourcesF = GaiaContext.j().f(activityInfo.applicationInfo);
            if (resourcesF == null) {
                String unused = C2839b.f125932i;
                return null;
            }
            Context contextV0 = v0();
            if (contextV0 == null) {
                return null;
            }
            XmlResourceParser xml = resourcesF.getXml(i10);
            try {
                Method declaredMethod = Class.forName("android.app.SearchableInfo").getDeclaredMethod("getActivityMetaData", Context.class, XmlPullParser.class, ComponentName.class);
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(null, contextV0, xml, componentName);
            } finally {
                xml.close();
            }
        }

        public static ActivityInfo x0(ComponentName componentName) {
            if (!C5714x.j().Q(componentName.getPackageName())) {
                return null;
            }
            try {
                return GaiaContext.j().n().getPackageManager().getActivityInfo(componentName, 128);
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // c7.m
        public String A() {
            return "getSearchableInfo";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            ComponentName componentName = (ComponentName) objArr[0];
            if (componentName == null) {
                return method.invoke(obj, objArr);
            }
            ActivityInfo activityInfoX0 = x0(componentName);
            if (activityInfoX0 == null) {
                return method.invoke(obj, objArr);
            }
            try {
                Object objU0 = u0(componentName, activityInfoX0, true);
                String unused = C2839b.f125932i;
                return objU0;
            } catch (Throwable unused2) {
                String unused3 = C2839b.f125932i;
                return null;
            }
        }

        public a(C2840c c2840c) {
        }
    }

    public C2839b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        f(new n("launchLegacyAssist"));
        f(new a());
    }
}
