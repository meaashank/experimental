package H2;

import I2.AbstractC1164a;
import I2.F0;
import I2.H0;
import I2.I0;
import android.webkit.WebResourceRequest;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class r {
    public static F0 a(WebResourceRequest webResourceRequest) {
        return I0.a.f50987a.k(webResourceRequest);
    }

    public static boolean b(@NonNull WebResourceRequest webResourceRequest) {
        AbstractC1164a.c cVar = H0.f50978u;
        if (cVar.c()) {
            return webResourceRequest.isRedirect();
        }
        if (cVar.d()) {
            return I0.a.f50987a.k(webResourceRequest).f50921a.isRedirect();
        }
        throw H0.a();
    }
}
