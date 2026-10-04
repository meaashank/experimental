package H2;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import androidx.annotation.NonNull;
import e.InterfaceC4330d;

/* JADX INFO: loaded from: classes2.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f45452a = "Default";

    @NonNull
    @InterfaceC4330d
    GeolocationPermissions a();

    @NonNull
    @InterfaceC4330d
    CookieManager getCookieManager();

    @NonNull
    @InterfaceC4330d
    String getName();

    @NonNull
    @InterfaceC4330d
    ServiceWorkerController getServiceWorkerController();

    @NonNull
    @InterfaceC4330d
    WebStorage getWebStorage();
}
