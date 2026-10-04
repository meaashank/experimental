package v;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.collection.U0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f239707c = "android.support.customtabs.action.CustomTabsService";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f239708d = "androidx.browser.customtabs.category.NavBarColorCustomization";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f239709e = "androidx.browser.customtabs.category.ColorSchemeCustomization";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f239710f = "androidx.browser.trusted.category.TrustedWebActivities";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f239711g = "androidx.browser.trusted.category.WebShareTargetV2";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f239712h = "androidx.browser.trusted.category.ImmersiveMode";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f239713i = "android.support.customtabs.otherurls.URL";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f239714j = "androidx.browser.customtabs.SUCCESS";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f239715k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f239716l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f239717m = -2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f239718n = -3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f239719o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f239720p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f239721q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f239722r = "CustomTabsService";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U0<IBinder, IBinder.DeathRecipient> f239723a = new U0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ICustomTabsService.Stub f239724b = new a();

    public class a extends ICustomTabsService.Stub {
        public a() {
        }

        public final boolean T5(@NonNull ICustomTabsCallback iCustomTabsCallback, @Nullable PendingIntent pendingIntent) {
            final androidx.browser.customtabs.c cVar = new androidx.browser.customtabs.c(iCustomTabsCallback, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: v.d
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        e.this.a(cVar);
                    }
                };
                synchronized (e.this.f239723a) {
                    iCustomTabsCallback.asBinder().linkToDeath(deathRecipient, 0);
                    e.this.f239723a.put(iCustomTabsCallback.asBinder(), deathRecipient);
                }
                return e.this.e(cVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.customtabs.ICustomTabsService
        public Bundle extraCommand(@NonNull String str, @Nullable Bundle bundle) {
            return e.this.b(str, bundle);
        }

        @Nullable
        public final PendingIntent h2(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(CustomTabsIntent.f86527e);
            bundle.remove(CustomTabsIntent.f86527e);
            return pendingIntent;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, @NonNull Bundle bundle) {
            e eVar = e.this;
            new androidx.browser.customtabs.c(iCustomTabsCallback, h2(bundle));
            eVar.getClass();
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(@Nullable ICustomTabsCallback iCustomTabsCallback, @Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list) {
            return e.this.d(new androidx.browser.customtabs.c(iCustomTabsCallback, h2(bundle)), uri, bundle, list);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(@NonNull ICustomTabsCallback iCustomTabsCallback) {
            return T5(iCustomTabsCallback, null);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(@NonNull ICustomTabsCallback iCustomTabsCallback, @Nullable Bundle bundle) {
            return T5(iCustomTabsCallback, h2(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull String str, @Nullable Bundle bundle) {
            return e.this.f(new androidx.browser.customtabs.c(iCustomTabsCallback, h2(bundle)), str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull Uri uri, int i10, @Nullable Bundle bundle) {
            return e.this.g(new androidx.browser.customtabs.c(iCustomTabsCallback, h2(bundle)), uri, i10, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull Uri uri) {
            return e.this.i(new androidx.browser.customtabs.c(iCustomTabsCallback, null), uri, null, new Bundle());
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull Uri uri, @NonNull Bundle bundle) {
            return e.this.i(new androidx.browser.customtabs.c(iCustomTabsCallback, h2(bundle)), uri, v5(bundle), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean setEngagementSignalsCallback(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull IBinder iBinder, @NonNull Bundle bundle) {
            o.a(iBinder);
            e eVar = e.this;
            new androidx.browser.customtabs.c(iCustomTabsCallback, h2(bundle));
            eVar.getClass();
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(@NonNull ICustomTabsCallback iCustomTabsCallback, @Nullable Bundle bundle) {
            return e.this.k(new androidx.browser.customtabs.c(iCustomTabsCallback, h2(bundle)), bundle);
        }

        @Nullable
        public final Uri v5(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            return Build.VERSION.SDK_INT >= 33 ? (Uri) C5667a.a(bundle, androidx.browser.customtabs.b.f86615g, Uri.class) : (Uri) bundle.getParcelable(androidx.browser.customtabs.b.f86615g);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(@NonNull ICustomTabsCallback iCustomTabsCallback, int i10, @NonNull Uri uri, @Nullable Bundle bundle) {
            return e.this.l(new androidx.browser.customtabs.c(iCustomTabsCallback, h2(bundle)), i10, uri, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long j10) {
            return e.this.m(j10);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public boolean a(@NonNull androidx.browser.customtabs.c cVar) {
        try {
            synchronized (this.f239723a) {
                try {
                    IBinder iBinderC = cVar.c();
                    if (iBinderC == null) {
                        return false;
                    }
                    iBinderC.unlinkToDeath(this.f239723a.get(iBinderC), 0);
                    this.f239723a.remove(iBinderC);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    @Nullable
    public abstract Bundle b(@NonNull String str, @Nullable Bundle bundle);

    public boolean c(@NonNull androidx.browser.customtabs.c cVar, @NonNull Bundle bundle) {
        return false;
    }

    public abstract boolean d(@NonNull androidx.browser.customtabs.c cVar, @Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list);

    public abstract boolean e(@NonNull androidx.browser.customtabs.c cVar);

    public abstract int f(@NonNull androidx.browser.customtabs.c cVar, @NonNull String str, @Nullable Bundle bundle);

    public abstract boolean g(@NonNull androidx.browser.customtabs.c cVar, @NonNull Uri uri, int i10, @Nullable Bundle bundle);

    public abstract boolean h(@NonNull androidx.browser.customtabs.c cVar, @NonNull Uri uri);

    public boolean i(@NonNull androidx.browser.customtabs.c cVar, @NonNull Uri uri, @Nullable Uri uri2, @NonNull Bundle bundle) {
        return h(cVar, uri);
    }

    public boolean j(@NonNull androidx.browser.customtabs.c cVar, @NonNull n nVar, @NonNull Bundle bundle) {
        return false;
    }

    public abstract boolean k(@NonNull androidx.browser.customtabs.c cVar, @Nullable Bundle bundle);

    public abstract boolean l(@NonNull androidx.browser.customtabs.c cVar, int i10, @NonNull Uri uri, @Nullable Bundle bundle);

    public abstract boolean m(long j10);

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.f239724b;
    }
}
