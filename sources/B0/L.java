package B0;

import A0.a;
import A0.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.f0;

/* JADX INFO: loaded from: classes2.dex */
public class L implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public androidx.concurrent.futures.d<Integer> f12263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f12264c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    @f0
    public A0.b f12262a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12265d = false;

    public class a extends a.b {
        public a() {
        }

        @Override // A0.a
        public void C3(boolean z10, boolean z11) throws RemoteException {
            if (!z10) {
                L.this.f12263b.set(0);
                Log.e(F.f12251a, "Unable to retrieve the permission revocation setting from the backport");
            } else if (z11) {
                L.this.f12263b.set(3);
            } else {
                L.this.f12263b.set(2);
            }
        }
    }

    public L(@NonNull Context context) {
        this.f12264c = context;
    }

    public void a(@NonNull androidx.concurrent.futures.d<Integer> dVar) {
        if (this.f12265d) {
            throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
        }
        this.f12265d = true;
        this.f12263b = dVar;
        this.f12264c.bindService(new Intent(K.f12259b).setPackage(F.b(this.f12264c.getPackageManager())), this, 1);
    }

    public void b() {
        if (!this.f12265d) {
            throw new IllegalStateException("bindService must be called before unbind");
        }
        this.f12265d = false;
        this.f12264c.unbindService(this);
    }

    public final A0.a c() {
        return new a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        A0.b bVarU0 = b.AbstractBinderC0002b.U0(iBinder);
        this.f12262a = bVarU0;
        try {
            bVarU0.B1(new a());
        } catch (RemoteException unused) {
            this.f12263b.set(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f12262a = null;
    }
}
