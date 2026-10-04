package w;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ITrustedWebActivityCallback f239993a;

    public s(@NonNull ITrustedWebActivityCallback iTrustedWebActivityCallback) {
        this.f239993a = iTrustedWebActivityCallback;
    }

    @Nullable
    public static s a(@Nullable IBinder iBinder) {
        ITrustedWebActivityCallback iTrustedWebActivityCallbackAsInterface = iBinder == null ? null : ITrustedWebActivityCallback.Stub.asInterface(iBinder);
        if (iTrustedWebActivityCallbackAsInterface == null) {
            return null;
        }
        return new s(iTrustedWebActivityCallbackAsInterface);
    }

    public void b(@NonNull String str, @NonNull Bundle bundle) throws RemoteException {
        this.f239993a.onExtraCallback(str, bundle);
    }
}
