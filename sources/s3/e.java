package s3;

import B0.C0920d;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import s3.InterfaceC5571b;

/* JADX INFO: loaded from: classes2.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f238486a = "ConnectivityMonitor";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f238487b = "android.permission.ACCESS_NETWORK_STATE";

    @Override // s3.c
    @NonNull
    public InterfaceC5571b a(@NonNull Context context, @NonNull InterfaceC5571b.a aVar) {
        boolean z10 = C0920d.checkSelfPermission(context, f238487b) == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z10 ? new d(context, aVar) : new n();
    }
}
