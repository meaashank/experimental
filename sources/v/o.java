package v;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.IEngagementSignalsCallback;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import e.D;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f239745b = "EngagementSigsCallbkRmt";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IEngagementSignalsCallback f239746a;

    public o(@NonNull IEngagementSignalsCallback iEngagementSignalsCallback) {
        this.f239746a = iEngagementSignalsCallback;
    }

    @NonNull
    public static o a(@NonNull IBinder iBinder) {
        return new o(IEngagementSignalsCallback.Stub.asInterface(iBinder));
    }

    @Override // v.n
    public void onGreatestScrollPercentageIncreased(@D(from = 1, to = 100) int i10, @NonNull Bundle bundle) {
        try {
            this.f239746a.onGreatestScrollPercentageIncreased(i10, bundle);
        } catch (RemoteException unused) {
            Log.e(f239745b, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // v.n
    public void onSessionEnded(boolean z10, @NonNull Bundle bundle) {
        try {
            this.f239746a.onSessionEnded(z10, bundle);
        } catch (RemoteException unused) {
            Log.e(f239745b, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // v.n
    public void onVerticalScrollEvent(boolean z10, @NonNull Bundle bundle) {
        try {
            this.f239746a.onVerticalScrollEvent(z10, bundle);
        } catch (RemoteException unused) {
            Log.e(f239745b, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }
}
