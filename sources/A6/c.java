package A6;

import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;

/* JADX INFO: loaded from: classes5.dex */
public class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2355a = l0.b(c.class.getSimpleName());

    @Override // A6.h
    public boolean a(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService(Y7.a.f79330e);
        if (powerManager != null) {
            return powerManager.isIgnoringBatteryOptimizations(context.getPackageName());
        }
        return false;
    }

    @Override // A6.h
    public boolean b(Context context) {
        return true;
    }

    @Override // A6.h
    public boolean c(Context context) {
        return !C3841e.D() || context.getApplicationInfo().targetSdkVersion < 33 || context.checkPermission("android.permission.POST_NOTIFICATIONS", Process.myPid(), Process.myUid()) == 0;
    }

    @Override // A6.h
    public void d(String str) {
        I.a(f2355a, str);
    }
}
