package T7;

import android.os.Build;
import android.os.IInterface;
import c7.AbstractC2950b;
import c7.C;
import c7.InterfaceC2949a;
import c7.m;
import com.prism.commons.utils.C3841e;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC2949a(a.class)
public class d extends AbstractC2950b<IInterface> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f68353i = "NotificationManagerProxyFactory";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f68354j = {"getNotificationChannels", "getNotificationChannelGroups"};

    public d(IInterface iInterface) {
        super(iInterface);
    }

    public static void s() {
        boolean zQ;
        try {
            zQ = m.Q();
        } catch (Throwable unused) {
            zQ = true;
        }
        if (zQ) {
            try {
                Method method = Class.forName("android.app.PropertyInvalidatedCache").getMethod("disableForCurrentProcess", String.class);
                for (String str : f68354j) {
                    try {
                        method.invoke(null, str);
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable unused3) {
            }
        }
    }

    @Override // c7.AbstractC2950b
    public void r() {
        s();
        f(new C("cancelToast"));
        if (C3841e.p()) {
            f(new C("removeAutomaticZenRules"));
            f(new C("getImportance"));
            f(new C("getPackageImportance"));
            f(new C("areNotificationsEnabled"));
            f(new C("setNotificationPolicy"));
            f(new C("getNotificationPolicy"));
            f(new C("isNotificationPolicyAccessGrantedForPackage"));
            f(new C("getNotificationDelegate"));
            b.u(this);
        }
        if (C3841e.w()) {
            f(new C("getNotificationDelegate"));
        }
        if (C3841e.f162085a.equalsIgnoreCase(Build.BRAND) || C3841e.f162085a.equalsIgnoreCase(Build.MANUFACTURER)) {
            f(new C("removeEdgeNotification"));
        }
    }
}
