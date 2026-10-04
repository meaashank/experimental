package R2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a extends c<Boolean> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f67697i = androidx.work.i.f("BatteryChrgTracker");

    public a(@NonNull Context context, @NonNull V2.a taskExecutor) {
        super(context, taskExecutor);
    }

    @Override // R2.c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // R2.c
    public void h(Context context, @NonNull Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        androidx.work.i.c().a(f67697i, String.format("Received %s", action), new Throwable[0]);
        switch (action) {
            case "android.intent.action.ACTION_POWER_DISCONNECTED":
                d(Boolean.FALSE);
                break;
            case "android.os.action.DISCHARGING":
                d(Boolean.FALSE);
                break;
            case "android.os.action.CHARGING":
                d(Boolean.TRUE);
                break;
            case "android.intent.action.ACTION_POWER_CONNECTED":
                d(Boolean.TRUE);
                break;
        }
    }

    @Override // R2.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent intentRegisterReceiver = this.f67705b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(j(intentRegisterReceiver));
        }
        androidx.work.i.c().b(f67697i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    public final boolean j(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }
}
