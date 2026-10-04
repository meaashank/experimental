package I2;

import H2.t;
import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.VisualStateCallbackBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class y0 implements VisualStateCallbackBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t.a f51053a;

    public y0(@NonNull t.a aVar) {
        this.f51053a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.VisualStateCallbackBoundaryInterface
    public void onComplete(long j10) {
        this.f51053a.onComplete(j10);
    }
}
