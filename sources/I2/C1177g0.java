package I2;

import androidx.annotation.NonNull;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;

/* JADX INFO: renamed from: I2.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1177g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebViewCookieManagerBoundaryInterface f51015a;

    public C1177g0(@NonNull WebViewCookieManagerBoundaryInterface webViewCookieManagerBoundaryInterface) {
        this.f51015a = webViewCookieManagerBoundaryInterface;
    }

    @NonNull
    public List<String> a(@NonNull String str) {
        return this.f51015a.getCookieInfo(str);
    }
}
