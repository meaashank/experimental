package v;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public abstract class s implements q, ServiceConnection {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f239749f = "PostMessageServConn";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f239750a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICustomTabsCallback f239751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public IPostMessageService f239752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f239753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f239754e;

    public s(@NonNull androidx.browser.customtabs.c cVar) {
        IBinder iBinderC = cVar.c();
        if (iBinderC == null) {
            throw new IllegalArgumentException("Provided session must have binder.");
        }
        this.f239751b = ICustomTabsCallback.Stub.asInterface(iBinderC);
    }

    @Override // v.q
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean a(@Nullable Bundle bundle) {
        return g(bundle);
    }

    @Override // v.q
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void b(@NonNull Context context) {
        m(context);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean c(@NonNull Context context) {
        String str = this.f239753d;
        if (str != null) {
            return d(context, str);
        }
        throw new IllegalStateException("setPackageName must be called before bindSessionToPostMessageService.");
    }

    public boolean d(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent();
        intent.setClassName(str, r.class.getName());
        boolean zBindService = context.bindService(intent, this, 1);
        if (!zBindService) {
            Log.w(f239749f, "Could not bind to PostMessageService in client.");
        }
        return zBindService;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void e(@NonNull Context context) {
        if (f()) {
            m(context);
        }
    }

    public final boolean f() {
        return this.f239752c != null;
    }

    public final boolean g(@Nullable Bundle bundle) {
        this.f239754e = true;
        return h(bundle);
    }

    public final boolean h(@Nullable Bundle bundle) {
        if (this.f239752c == null) {
            return false;
        }
        synchronized (this.f239750a) {
            try {
                try {
                    this.f239752c.onMessageChannelReady(this.f239751b, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public void i() {
        if (this.f239754e) {
            h(null);
        }
    }

    public final boolean k(@NonNull String str, @Nullable Bundle bundle) {
        if (this.f239752c == null) {
            return false;
        }
        synchronized (this.f239750a) {
            try {
                try {
                    this.f239752c.onPostMessage(this.f239751b, str, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void l(@NonNull String str) {
        this.f239753d = str;
    }

    public void m(@NonNull Context context) {
        if (f()) {
            context.unbindService(this);
            this.f239752c = null;
        }
    }

    @Override // v.q
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean onPostMessage(@NonNull String str, @Nullable Bundle bundle) {
        return k(str, bundle);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.f239752c = IPostMessageService.Stub.asInterface(iBinder);
        i();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
        this.f239752c = null;
    }

    public void j() {
    }
}
