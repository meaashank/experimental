package f7;

import android.os.IInterface;
import c7.AbstractC2950b;
import c7.InterfaceC2949a;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC2949a(c.class)
public class b extends AbstractC2950b<IInterface> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f200617i = "AccountManagerProxyFactory";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f200618j = {"cache_key.system_server.account_user_data", "cache_key.system_server.accounts_data"};

    public b(IInterface iInterface) {
        super(iInterface);
    }

    public static void s() {
        try {
            Method method = Class.forName("android.app.PropertyInvalidatedCache").getMethod("disableForCurrentProcess", String.class);
            for (String str : f200618j) {
                try {
                    method.invoke(null, str);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // c7.AbstractC2950b
    public void r() {
        s();
    }
}
