package E9;

import A6.l;
import U6.b;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.utils.ComponentUtils;

/* JADX INFO: loaded from: classes6.dex */
public class c {
    public static boolean a(Intent intent) {
        return intent.getBooleanExtra(b.c.f68622k, false);
    }

    public static boolean b(ServiceInfo serviceInfo) {
        return U6.c.Q(ComponentUtils.g(serviceInfo));
    }

    public static d c(Intent intent) {
        try {
            return new d((Intent) intent.getParcelableExtra(b.c.f68628q), intent.getStringExtra(b.c.f68634w), (ServiceInfo) intent.getParcelableExtra(b.c.f68637z), intent.getIntExtra(b.c.f68621j, -1), intent.getExtras().getBinder(b.c.f68636y), intent.getExtras().getBinder(b.c.f68612a));
        } catch (Exception unused) {
            return null;
        }
    }

    public static Intent d(Intent intent, String str, ServiceInfo serviceInfo, boolean z10, int i10, int i11, IBinder iBinder, IBinder iBinder2) {
        int iC = l.c(serviceInfo);
        boolean zJ0 = U6.c.j0(z10, iC);
        Intent intent2 = new Intent();
        intent2.setClassName(ComponentUtils.i(serviceInfo), U6.c.w(i10, iC));
        intent2.setType(ComponentUtils.u(serviceInfo).flattenToString());
        if (C3841e.G()) {
            intent.removeLaunchSecurityProtection();
        }
        intent2.putExtra(b.c.f68628q, intent);
        intent2.putExtra(b.c.f68634w, str);
        intent2.putExtra(b.c.f68637z, serviceInfo);
        intent2.putExtra(b.c.f68621j, i10);
        intent2.putExtra(b.c.f68622k, zJ0);
        if (zJ0) {
            if (iC == 0) {
                iC = -1;
            }
            intent2.putExtra(b.c.f68600B, iC);
        }
        Bundle bundle = new Bundle();
        bundle.putBinder(b.c.f68636y, iBinder);
        bundle.putBinder(b.c.f68612a, iBinder2);
        intent2.putExtras(bundle);
        return intent2;
    }

    public static Intent e(int i10) {
        return f(GaiaContext.j().X(), GaiaContext.f164212y.v(), i10);
    }

    public static Intent f(int i10, String str, int i11) {
        if (i10 < 0) {
            return null;
        }
        Intent intent = new Intent();
        intent.setClassName(str, U6.c.w(i10, i11));
        return intent;
    }
}
