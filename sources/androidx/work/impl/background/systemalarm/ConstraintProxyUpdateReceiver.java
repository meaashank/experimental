package androidx.work.impl.background.systemalarm;

import U2.h;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.i;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.k;

/* JADX INFO: loaded from: classes2.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f120311a = i.f("ConstrntProxyUpdtRecvr");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f120312b = "androidx.work.impl.background.systemalarm.UpdateProxies";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f120313c = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f120314d = "KEY_BATTERY_CHARGING_PROXY_ENABLED";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f120315e = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f120316f = "KEY_NETWORK_STATE_PROXY_ENABLED";

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f120317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f120318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f120319c;

        public a(final Intent val$intent, final Context val$context, final BroadcastReceiver.PendingResult val$pendingResult) {
            this.f120317a = val$intent;
            this.f120318b = val$context;
            this.f120319c = val$pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f120317a.getBooleanExtra(ConstraintProxyUpdateReceiver.f120313c, false);
                boolean booleanExtra2 = this.f120317a.getBooleanExtra(ConstraintProxyUpdateReceiver.f120314d, false);
                boolean booleanExtra3 = this.f120317a.getBooleanExtra(ConstraintProxyUpdateReceiver.f120315e, false);
                boolean booleanExtra4 = this.f120317a.getBooleanExtra(ConstraintProxyUpdateReceiver.f120316f, false);
                i.c().a(ConstraintProxyUpdateReceiver.f120311a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                h.c(this.f120318b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                h.c(this.f120318b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                h.c(this.f120318b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                h.c(this.f120318b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f120319c.finish();
            }
        }
    }

    public static Intent a(Context context, boolean batteryNotLowProxyEnabled, boolean batteryChargingProxyEnabled, boolean storageNotLowProxyEnabled, boolean networkStateProxyEnabled) {
        Intent intent = new Intent(f120312b);
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra(f120313c, batteryNotLowProxyEnabled).putExtra(f120314d, batteryChargingProxyEnabled).putExtra(f120315e, storageNotLowProxyEnabled).putExtra(f120316f, networkStateProxyEnabled);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull final Context context, @Nullable final Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (f120312b.equals(action)) {
            k.H(context).O().d(new a(intent, context, goAsync()));
        } else {
            i.c().a(f120311a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
