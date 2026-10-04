package I2;

import I2.I0;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: renamed from: I2.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1191n0 implements ProfileStore {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ProfileStore f51022b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileStoreBoundaryInterface f51023a;

    public C1191n0(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f51023a = profileStoreBoundaryInterface;
    }

    @NonNull
    public static ProfileStore a() {
        if (f51022b == null) {
            f51022b = new C1191n0(I0.b.f50988a.getProfileStore());
        }
        return f51022b;
    }

    @Override // androidx.webkit.ProfileStore
    public boolean deleteProfile(@NonNull String str) throws IllegalStateException {
        if (H0.f50954c0.d()) {
            return this.f51023a.deleteProfile(str);
        }
        throw H0.a();
    }

    @Override // androidx.webkit.ProfileStore
    @NonNull
    public List<String> getAllProfileNames() {
        if (H0.f50954c0.d()) {
            return this.f51023a.getAllProfileNames();
        }
        throw H0.a();
    }

    @Override // androidx.webkit.ProfileStore
    @NonNull
    public H2.d getOrCreateProfile(@NonNull String str) {
        if (H0.f50954c0.d()) {
            return new C1189m0((ProfileBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(ProfileBoundaryInterface.class, this.f51023a.getOrCreateProfile(str)));
        }
        throw H0.a();
    }

    @Override // androidx.webkit.ProfileStore
    @Nullable
    public H2.d getProfile(@NonNull String str) {
        if (!H0.f50954c0.d()) {
            throw H0.a();
        }
        InvocationHandler profile = this.f51023a.getProfile(str);
        if (profile != null) {
            return new C1189m0((ProfileBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(ProfileBoundaryInterface.class, profile));
        }
        return null;
    }

    public C1191n0() {
        this.f51023a = null;
    }
}
