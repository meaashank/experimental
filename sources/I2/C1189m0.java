package I2;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;

/* JADX INFO: renamed from: I2.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1189m0 implements H2.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProfileBoundaryInterface f51021b;

    public C1189m0(ProfileBoundaryInterface profileBoundaryInterface) {
        this.f51021b = profileBoundaryInterface;
    }

    @Override // H2.d
    @NonNull
    public GeolocationPermissions a() throws IllegalStateException {
        if (H0.f50954c0.d()) {
            return this.f51021b.getGeoLocationPermissions();
        }
        throw H0.a();
    }

    @Override // H2.d
    @NonNull
    public CookieManager getCookieManager() throws IllegalStateException {
        if (H0.f50954c0.d()) {
            return this.f51021b.getCookieManager();
        }
        throw H0.a();
    }

    @Override // H2.d
    @NonNull
    public String getName() {
        if (H0.f50954c0.d()) {
            return this.f51021b.getName();
        }
        throw H0.a();
    }

    @Override // H2.d
    @NonNull
    public ServiceWorkerController getServiceWorkerController() throws IllegalStateException {
        if (H0.f50954c0.d()) {
            return this.f51021b.getServiceWorkerController();
        }
        throw H0.a();
    }

    @Override // H2.d
    @NonNull
    public WebStorage getWebStorage() throws IllegalStateException {
        if (H0.f50954c0.d()) {
            return this.f51021b.getWebStorage();
        }
        throw H0.a();
    }

    public C1189m0() {
        this.f51021b = null;
    }
}
