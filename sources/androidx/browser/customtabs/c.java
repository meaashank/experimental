package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import v.C5668b;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f86630d = "CustomTabsSessionToken";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ICustomTabsCallback f86631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final PendingIntent f86632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final C5668b f86633c;

    public class a extends C5668b {
        public a() {
        }

        @Override // v.C5668b
        public void extraCallback(@NonNull String str, @Nullable Bundle bundle) {
            try {
                c.this.f86631a.extraCallback(str, bundle);
            } catch (RemoteException unused) {
                Log.e(c.f86630d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // v.C5668b
        @NonNull
        public Bundle extraCallbackWithResult(@NonNull String str, @Nullable Bundle bundle) {
            try {
                return c.this.f86631a.extraCallbackWithResult(str, bundle);
            } catch (RemoteException unused) {
                Log.e(c.f86630d, "RemoteException during ICustomTabsCallback transaction");
                return null;
            }
        }

        @Override // v.C5668b
        public void onActivityLayout(int i10, int i11, int i12, int i13, int i14, @NonNull Bundle bundle) {
            try {
                c.this.f86631a.onActivityLayout(i10, i11, i12, i13, i14, bundle);
            } catch (RemoteException unused) {
                Log.e(c.f86630d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // v.C5668b
        public void onActivityResized(int i10, int i11, @NonNull Bundle bundle) {
            try {
                c.this.f86631a.onActivityResized(i10, i11, bundle);
            } catch (RemoteException unused) {
                Log.e(c.f86630d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // v.C5668b
        public void onMessageChannelReady(@Nullable Bundle bundle) {
            try {
                c.this.f86631a.onMessageChannelReady(bundle);
            } catch (RemoteException unused) {
                Log.e(c.f86630d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // v.C5668b
        public void onMinimized(@NonNull Bundle bundle) {
            try {
                c.this.f86631a.onMinimized(bundle);
            } catch (RemoteException unused) {
                Log.e(c.f86630d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // v.C5668b
        public void onNavigationEvent(int i10, @Nullable Bundle bundle) {
            try {
                c.this.f86631a.onNavigationEvent(i10, bundle);
            } catch (RemoteException unused) {
                Log.e(c.f86630d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // v.C5668b
        public void onPostMessage(@NonNull String str, @Nullable Bundle bundle) {
            try {
                c.this.f86631a.onPostMessage(str, bundle);
            } catch (RemoteException unused) {
                Log.e(c.f86630d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // v.C5668b
        public void onRelationshipValidationResult(int i10, @NonNull Uri uri, boolean z10, @Nullable Bundle bundle) {
            try {
                c.this.f86631a.onRelationshipValidationResult(i10, uri, z10, bundle);
            } catch (RemoteException unused) {
                Log.e(c.f86630d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // v.C5668b
        public void onUnminimized(@NonNull Bundle bundle) {
            try {
                c.this.f86631a.onUnminimized(bundle);
            } catch (RemoteException unused) {
                Log.e(c.f86630d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // v.C5668b
        public void onWarmupCompleted(@NonNull Bundle bundle) {
            try {
                c.this.f86631a.onWarmupCompleted(bundle);
            } catch (RemoteException unused) {
                Log.e(c.f86630d, "RemoteException during ICustomTabsCallback transaction");
            }
        }
    }

    public static class b extends ICustomTabsCallback.Stub {
        @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityLayout(int i10, int i11, int i12, int i13, int i14, @NonNull Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityResized(int i10, int i11, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMinimized(@NonNull Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i10, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onUnminimized(@NonNull Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onWarmupCompleted(Bundle bundle) {
        }
    }

    public c(@Nullable ICustomTabsCallback iCustomTabsCallback, @Nullable PendingIntent pendingIntent) {
        if (iCustomTabsCallback == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f86631a = iCustomTabsCallback;
        this.f86632b = pendingIntent;
        this.f86633c = iCustomTabsCallback == null ? null : new a();
    }

    @NonNull
    public static c a() {
        return new c(new b(), null);
    }

    @Nullable
    public static c f(@NonNull Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        IBinder binder = extras.getBinder(CustomTabsIntent.f86525d);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(CustomTabsIntent.f86527e);
        if (binder == null && pendingIntent == null) {
            return null;
        }
        return new c(binder != null ? ICustomTabsCallback.Stub.asInterface(binder) : null, pendingIntent);
    }

    @Nullable
    public C5668b b() {
        return this.f86633c;
    }

    @Nullable
    public IBinder c() {
        ICustomTabsCallback iCustomTabsCallback = this.f86631a;
        if (iCustomTabsCallback == null) {
            return null;
        }
        return iCustomTabsCallback.asBinder();
    }

    public final IBinder d() {
        ICustomTabsCallback iCustomTabsCallback = this.f86631a;
        if (iCustomTabsCallback != null) {
            return iCustomTabsCallback.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    @Nullable
    public PendingIntent e() {
        return this.f86632b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            PendingIntent pendingIntentE = cVar.e();
            PendingIntent pendingIntent = this.f86632b;
            if ((pendingIntent == null) == (pendingIntentE == null)) {
                return pendingIntent != null ? pendingIntent.equals(pendingIntentE) : d().equals(cVar.d());
            }
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean g() {
        return this.f86631a != null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean h() {
        return this.f86632b != null;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f86632b;
        return pendingIntent != null ? pendingIntent.hashCode() : d().hashCode();
    }

    public boolean i(@NonNull androidx.browser.customtabs.b bVar) {
        return bVar.f86618c.asBinder().equals(this.f86631a);
    }
}
