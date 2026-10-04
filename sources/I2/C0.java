package I2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class C0 implements WebMessagePayloadBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f50915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final byte[] f50916c;

    public C0(@Nullable String str) {
        this.f50914a = 0;
        this.f50915b = str;
        this.f50916c = null;
    }

    public final void a(int i10) {
        if (this.f50914a == i10) {
            return;
        }
        StringBuilder sbA = android.support.v4.media.a.a("Expected ", i10, ", but type is ");
        sbA.append(this.f50914a);
        throw new IllegalStateException(sbA.toString());
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    @NonNull
    public byte[] getAsArrayBuffer() {
        a(1);
        byte[] bArr = this.f50916c;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    @Nullable
    public String getAsString() {
        a(0);
        return this.f50915b;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public int getType() {
        return this.f50914a;
    }

    public C0(@NonNull byte[] bArr) {
        this.f50914a = 1;
        this.f50915b = null;
        this.f50916c = bArr;
    }
}
