package com.prism.gaia.gserver;

import U6.j;
import U6.o;
import android.annotation.TargetApi;
import android.app.Service;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.widget.Toast;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(21)
public class UnhideGuestService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f164884a = "asdf-".concat("UnhideGuestService");

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        j.M(i10);
        int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", com.prism.fusionadsdkbase.a.f162364a);
        if (intExtra == -1) {
            Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
            intent2.addFlags(268468224);
            try {
                startActivity(intent2);
            } catch (Exception unused) {
            }
        } else if (intExtra != 0) {
            PackageManager packageManager = getPackageManager();
            ApplicationInfo applicationInfo = getApplicationInfo();
            Toast.makeText(getApplicationContext(), applicationInfo != null ? getString(o.n.f72107O4, applicationInfo.loadLabel(packageManager)) : "", 1).show();
        }
        stopSelf(i11);
        return 2;
    }
}
