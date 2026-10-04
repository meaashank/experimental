package R2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class c<T> extends d<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f67700h = androidx.work.i.f("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BroadcastReceiver f67701g;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(@NonNull Context context, @NonNull V2.a taskExecutor) {
        super(context, taskExecutor);
        this.f67701g = new a();
    }

    @Override // R2.d
    public void e() {
        androidx.work.i.c().a(f67700h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f67705b.registerReceiver(this.f67701g, g());
    }

    @Override // R2.d
    public void f() {
        androidx.work.i.c().a(f67700h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f67705b.unregisterReceiver(this.f67701g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, @NonNull Intent intent);
}
