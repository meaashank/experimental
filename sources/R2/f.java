package R2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import e.T;
import e.f0;
import t7.C5617a;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class f extends d<P2.b> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f67711j = androidx.work.i.f("NetworkStateTracker");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f67712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @T(24)
    public b f67713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f67714i;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals(q4.c.f226807e)) {
                return;
            }
            androidx.work.i.c().a(f.f67711j, "Network broadcast received", new Throwable[0]);
            f fVar = f.this;
            fVar.d(fVar.g());
        }
    }

    @T(24)
    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities capabilities) {
            androidx.work.i.c().a(f.f67711j, String.format("Network capabilities changed: %s", capabilities), new Throwable[0]);
            f fVar = f.this;
            fVar.d(fVar.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            androidx.work.i.c().a(f.f67711j, "Network connection lost", new Throwable[0]);
            f fVar = f.this;
            fVar.d(fVar.g());
        }
    }

    public f(@NonNull Context context, @NonNull V2.a taskExecutor) {
        super(context, taskExecutor);
        this.f67712g = (ConnectivityManager) this.f67705b.getSystemService(C5617a.f239212e);
        if (j()) {
            this.f67713h = new b();
        } else {
            this.f67714i = new a();
        }
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // R2.d
    public void e() {
        if (!j()) {
            androidx.work.i.c().a(f67711j, "Registering broadcast receiver", new Throwable[0]);
            this.f67705b.registerReceiver(this.f67714i, new IntentFilter(q4.c.f226807e));
            return;
        }
        try {
            androidx.work.i.c().a(f67711j, "Registering network callback", new Throwable[0]);
            this.f67712g.registerDefaultNetworkCallback(this.f67713h);
        } catch (IllegalArgumentException | SecurityException e10) {
            androidx.work.i.c().b(f67711j, "Received exception while registering network callback", e10);
        }
    }

    @Override // R2.d
    public void f() {
        if (!j()) {
            androidx.work.i.c().a(f67711j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f67705b.unregisterReceiver(this.f67714i);
            return;
        }
        try {
            androidx.work.i.c().a(f67711j, "Unregistering network callback", new Throwable[0]);
            this.f67712g.unregisterNetworkCallback(this.f67713h);
        } catch (IllegalArgumentException | SecurityException e10) {
            androidx.work.i.c().b(f67711j, "Received exception while unregistering network callback", e10);
        }
    }

    public P2.b g() {
        NetworkInfo activeNetworkInfo = this.f67712g.getActiveNetworkInfo();
        boolean z10 = false;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zI = i();
        boolean zIsActiveNetworkMetered = this.f67712g.isActiveNetworkMetered();
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z10 = true;
        }
        return new P2.b(z11, zI, zIsActiveNetworkMetered, z10);
    }

    @Override // R2.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public P2.b b() {
        return g();
    }

    @f0
    public boolean i() {
        try {
            NetworkCapabilities networkCapabilities = this.f67712g.getNetworkCapabilities(this.f67712g.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException e10) {
            androidx.work.i.c().b(f67711j, "Unable to validate active network", e10);
            return false;
        }
    }
}
