package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.IBinder;
import androidx.annotation.NonNull;
import e.InterfaceC4345t;
import e.T;

/* JADX INFO: loaded from: classes.dex */
public final class z extends Service {

    @T(24)
    public static class a {
        @InterfaceC4345t
        public static int a() {
            return 512;
        }
    }

    @NonNull
    public static ServiceInfo a(@NonNull Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) z.class), Build.VERSION.SDK_INT >= 24 ? a.a() | 128 : 640);
    }

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@NonNull Intent intent) {
        throw new UnsupportedOperationException();
    }
}
