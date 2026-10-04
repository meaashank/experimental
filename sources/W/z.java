package w;

import android.app.Notification;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.T;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f240026c = "android.support.customtabs.trusted.PLATFORM_TAG";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f240027d = "android.support.customtabs.trusted.PLATFORM_ID";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f240028e = "android.support.customtabs.trusted.NOTIFICATION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f240029f = "android.support.customtabs.trusted.CHANNEL_NAME";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f240030g = "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f240031h = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ITrustedWebActivityService f240032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f240033b;

    public class a extends ITrustedWebActivityCallback.Stub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f240034a;

        public a(r rVar) {
            this.f240034a = rVar;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
        public void onExtraCallback(String str, Bundle bundle) throws RemoteException {
            this.f240034a.a(str, bundle);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable[] f240035a;

        public b(Parcelable[] parcelableArr) {
            this.f240035a = parcelableArr;
        }

        public static b a(Bundle bundle) {
            z.c(bundle, z.f240030g);
            return new b(bundle.getParcelableArray(z.f240030g));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(z.f240030g, this.f240035a);
            return bundle;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f240036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f240037b;

        public c(String str, int i10) {
            this.f240036a = str;
            this.f240037b = i10;
        }

        public static c a(Bundle bundle) {
            z.c(bundle, z.f240026c);
            z.c(bundle, z.f240027d);
            return new c(bundle.getString(z.f240026c), bundle.getInt(z.f240027d));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(z.f240026c, this.f240036a);
            bundle.putInt(z.f240027d, this.f240037b);
            return bundle;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f240038a;

        public d(String str) {
            this.f240038a = str;
        }

        public static d a(Bundle bundle) {
            z.c(bundle, z.f240029f);
            return new d(bundle.getString(z.f240029f));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(z.f240029f, this.f240038a);
            return bundle;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f240039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f240040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Notification f240041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f240042d;

        public e(String str, int i10, Notification notification, String str2) {
            this.f240039a = str;
            this.f240040b = i10;
            this.f240041c = notification;
            this.f240042d = str2;
        }

        public static e a(Bundle bundle) {
            z.c(bundle, z.f240026c);
            z.c(bundle, z.f240027d);
            z.c(bundle, z.f240028e);
            z.c(bundle, z.f240029f);
            return new e(bundle.getString(z.f240026c), bundle.getInt(z.f240027d), (Notification) bundle.getParcelable(z.f240028e), bundle.getString(z.f240029f));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(z.f240026c, this.f240039a);
            bundle.putInt(z.f240027d, this.f240040b);
            bundle.putParcelable(z.f240028e, this.f240041c);
            bundle.putString(z.f240029f, this.f240042d);
            return bundle;
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f240043a;

        public f(boolean z10) {
            this.f240043a = z10;
        }

        public static f a(Bundle bundle) {
            z.c(bundle, z.f240031h);
            return new f(bundle.getBoolean(z.f240031h));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(z.f240031h, this.f240043a);
            return bundle;
        }
    }

    public z(@NonNull ITrustedWebActivityService iTrustedWebActivityService, @NonNull ComponentName componentName) {
        this.f240032a = iTrustedWebActivityService;
        this.f240033b = componentName;
    }

    public static void c(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException(y.a("Bundle must contain ", str));
        }
    }

    @Nullable
    public static ITrustedWebActivityCallback j(@Nullable r rVar) {
        if (rVar == null) {
            return null;
        }
        return new a(rVar);
    }

    public boolean a(@NonNull String str) throws RemoteException {
        return f.a(this.f240032a.areNotificationsEnabled(new d(str).b())).f240043a;
    }

    public void b(@NonNull String str, int i10) throws RemoteException {
        this.f240032a.cancelNotification(new c(str, i10).b());
    }

    @NonNull
    @T(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable[] d() throws RemoteException {
        return b.a(this.f240032a.getActiveNotifications()).f240035a;
    }

    @NonNull
    public ComponentName e() {
        return this.f240033b;
    }

    @Nullable
    public Bitmap f() throws RemoteException {
        return (Bitmap) this.f240032a.getSmallIconBitmap().getParcelable(x.f240019f);
    }

    public int g() throws RemoteException {
        return this.f240032a.getSmallIconId();
    }

    public boolean h(@NonNull String str, int i10, @NonNull Notification notification, @NonNull String str2) throws RemoteException {
        return f.a(this.f240032a.notifyNotificationWithChannel(new e(str, i10, notification, str2).b())).f240043a;
    }

    @Nullable
    public Bundle i(@NonNull String str, @NonNull Bundle bundle, @Nullable r rVar) throws RemoteException {
        ITrustedWebActivityCallback iTrustedWebActivityCallbackJ = j(rVar);
        return this.f240032a.extraCommand(str, bundle, iTrustedWebActivityCallbackJ == null ? null : iTrustedWebActivityCallbackJ.asBinder());
    }
}
