package O7;

import android.os.IInterface;
import c7.AbstractC2950b;
import c7.G;
import c7.InterfaceC2949a;
import c7.x;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC2949a(c.class)
public class b extends AbstractC2950b<IInterface> {
    public b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        g(new x());
        f(new G("requestGeofence"));
        f(new G("removeGeofence"));
        f(new G("addNmeaListener"));
        f(new G("removeNmeaListener"));
        f(new G("addTestProvider"));
        f(new G("removeTestProvider"));
        f(new G("setTestProviderLocation"));
        f(new G("setTestProviderEnabled"));
        f(new G("setTestProviderStatus"));
        f(new G("clearTestProviderLocation"));
        f(new G("clearTestProviderEnabled"));
        f(new G("clearTestProviderStatus"));
    }
}
