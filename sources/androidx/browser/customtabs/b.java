package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.IEngagementSignalsCallback;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.c;
import e.f0;
import java.util.List;
import java.util.concurrent.Executor;
import v.C5668b;
import v.n;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f86614f = "CustomTabsSession";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f86615g = "target_origin";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f86616a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICustomTabsService f86617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ICustomTabsCallback f86618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComponentName f86619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final PendingIntent f86620e;

    public class a extends IEngagementSignalsCallback.Stub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f86621a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f86622b;

        public a(n nVar) {
            this.f86622b = nVar;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(final int i10, final Bundle bundle) {
            Handler handler = this.f86621a;
            final n nVar = this.f86622b;
            handler.post(new Runnable() { // from class: v.h
                @Override // java.lang.Runnable
                public final void run() {
                    nVar.onGreatestScrollPercentageIncreased(i10, bundle);
                }
            });
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(final boolean z10, final Bundle bundle) {
            Handler handler = this.f86621a;
            final n nVar = this.f86622b;
            handler.post(new Runnable() { // from class: v.g
                @Override // java.lang.Runnable
                public final void run() {
                    nVar.onSessionEnded(z10, bundle);
                }
            });
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(final boolean z10, final Bundle bundle) {
            Handler handler = this.f86621a;
            final n nVar = this.f86622b;
            handler.post(new Runnable() { // from class: v.i
                @Override // java.lang.Runnable
                public final void run() {
                    nVar.onVerticalScrollEvent(z10, bundle);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.b$b, reason: collision with other inner class name */
    public class BinderC0170b extends IEngagementSignalsCallback.Stub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f86624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Executor f86625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f86626c;

        public BinderC0170b(Executor executor, n nVar) {
            this.f86625b = executor;
            this.f86626c = nVar;
            this.f86624a = executor;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(final int i10, final Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.f86624a;
                final n nVar = this.f86626c;
                executor.execute(new Runnable() { // from class: v.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        nVar.onGreatestScrollPercentageIncreased(i10, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(final boolean z10, final Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.f86624a;
                final n nVar = this.f86626c;
                executor.execute(new Runnable() { // from class: v.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        nVar.onSessionEnded(z10, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(final boolean z10, final Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.f86624a;
                final n nVar = this.f86626c;
                executor.execute(new Runnable() { // from class: v.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        nVar.onVerticalScrollEvent(z10, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    public static class c extends ICustomTabsService.Stub {
        @Override // android.support.customtabs.ICustomTabsService
        public Bundle extraCommand(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(ICustomTabsCallback iCustomTabsCallback) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i10, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean setEngagementSignalsCallback(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i10, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long j10) throws RemoteException {
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final C5668b f86628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final PendingIntent f86629b;

        public d(@Nullable C5668b c5668b, @Nullable PendingIntent pendingIntent) {
            this.f86628a = c5668b;
            this.f86629b = pendingIntent;
        }

        @Nullable
        public C5668b a() {
            return this.f86628a;
        }

        @Nullable
        public PendingIntent b() {
            return this.f86629b;
        }
    }

    public b(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName, @Nullable PendingIntent pendingIntent) {
        this.f86617b = iCustomTabsService;
        this.f86618c = iCustomTabsCallback;
        this.f86619d = componentName;
        this.f86620e = pendingIntent;
    }

    @NonNull
    @f0
    public static b e(@NonNull ComponentName componentName) {
        return new b(new c(), new c.b(), componentName, null);
    }

    public final void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f86620e;
        if (pendingIntent != null) {
            bundle.putParcelable(CustomTabsIntent.f86527e, pendingIntent);
        }
    }

    public final Bundle b(@Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    public final IEngagementSignalsCallback.Stub c(@NonNull n nVar) {
        return new a(nVar);
    }

    public final IEngagementSignalsCallback.Stub d(@NonNull n nVar, @NonNull Executor executor) {
        return new BinderC0170b(executor, nVar);
    }

    @Nullable
    public final Bundle f(@Nullable Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable(f86615g, uri);
        }
        if (this.f86620e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    public IBinder g() {
        return this.f86618c.asBinder();
    }

    public ComponentName h() {
        return this.f86619d;
    }

    @Nullable
    public PendingIntent i() {
        return this.f86620e;
    }

    public boolean j(@NonNull Bundle bundle) throws RemoteException {
        try {
            return this.f86617b.isEngagementSignalsApiAvailable(this.f86618c, b(bundle));
        } catch (SecurityException e10) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
        }
    }

    public boolean k(@Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list) {
        try {
            return this.f86617b.mayLaunchUrl(this.f86618c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int l(@NonNull String str, @Nullable Bundle bundle) {
        int iPostMessage;
        Bundle bundleB = b(bundle);
        synchronized (this.f86616a) {
            try {
                try {
                    iPostMessage = this.f86617b.postMessage(this.f86618c, str, bundleB);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iPostMessage;
    }

    public boolean m(@NonNull Uri uri, int i10, @Nullable Bundle bundle) {
        try {
            return this.f86617b.receiveFile(this.f86618c, uri, i10, b(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean n(@NonNull Uri uri) {
        return o(uri, null, new Bundle());
    }

    public boolean o(@NonNull Uri uri, @Nullable Uri uri2, @NonNull Bundle bundle) {
        try {
            Bundle bundleF = f(uri2);
            if (bundleF == null) {
                return this.f86617b.requestPostMessageChannel(this.f86618c, uri);
            }
            bundle.putAll(bundleF);
            return this.f86617b.requestPostMessageChannelWithExtras(this.f86618c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean p(@NonNull Bitmap bitmap, @NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.f86569z, bitmap);
        bundle.putString(CustomTabsIntent.f86491A, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.f86563w, bundle);
        a(bundle);
        try {
            return this.f86617b.updateVisuals(this.f86618c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean q(@NonNull Executor executor, @NonNull n nVar, @NonNull Bundle bundle) throws RemoteException {
        try {
            return this.f86617b.setEngagementSignalsCallback(this.f86618c, new BinderC0170b(executor, nVar).asBinder(), b(bundle));
        } catch (SecurityException e10) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
        }
    }

    public boolean r(@NonNull n nVar, @NonNull Bundle bundle) throws RemoteException {
        try {
            return this.f86617b.setEngagementSignalsCallback(this.f86618c, new a(nVar).asBinder(), b(bundle));
        } catch (SecurityException e10) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
        }
    }

    public boolean s(@Nullable PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.f86557t, pendingIntent);
        a(bundle);
        try {
            return this.f86617b.updateVisuals(this.f86618c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean t(@Nullable RemoteViews remoteViews, @Nullable int[] iArr, @Nullable PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.f86507M, remoteViews);
        bundle.putIntArray(CustomTabsIntent.f86508N, iArr);
        bundle.putParcelable(CustomTabsIntent.f86509O, pendingIntent);
        a(bundle);
        try {
            return this.f86617b.updateVisuals(this.f86618c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public boolean u(int i10, @NonNull Bitmap bitmap, @NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(CustomTabsIntent.f86570z0, i10);
        bundle.putParcelable(CustomTabsIntent.f86569z, bitmap);
        bundle.putString(CustomTabsIntent.f86491A, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.f86563w, bundle);
        a(bundle2);
        try {
            return this.f86617b.updateVisuals(this.f86618c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean v(int i10, @NonNull Uri uri, @Nullable Bundle bundle) {
        if (i10 >= 1 && i10 <= 2) {
            try {
                return this.f86617b.validateRelationship(this.f86618c, i10, uri, b(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
