package I2;

import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebResourceRequestBoundaryInterface f50921a;

    public F0(@NonNull WebResourceRequestBoundaryInterface webResourceRequestBoundaryInterface) {
        this.f50921a = webResourceRequestBoundaryInterface;
    }

    public boolean a() {
        return this.f50921a.isRedirect();
    }
}
