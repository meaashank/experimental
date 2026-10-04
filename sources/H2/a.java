package H2;

import I2.C1177g0;
import I2.H0;
import I2.I0;
import android.webkit.CookieManager;
import androidx.annotation.NonNull;
import e.InterfaceC4330d;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4330d
public class a {
    public static C1177g0 a(CookieManager cookieManager) {
        return I0.a.f50987a.a(cookieManager);
    }

    @NonNull
    public static List<String> b(@NonNull CookieManager cookieManager, @NonNull String str) {
        if (H0.f50948Z.d()) {
            return I0.a.f50987a.a(cookieManager).f51015a.getCookieInfo(str);
        }
        throw H0.a();
    }
}
