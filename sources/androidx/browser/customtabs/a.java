package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.b;
import java.util.ArrayList;
import java.util.List;
import v.C5668b;
import v.e;
import v.f;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f86573d = "CustomTabsClient";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICustomTabsService f86574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f86575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f86576c;

    /* JADX INFO: renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    public class C0167a extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f86577b;

        public C0167a(Context context) {
            this.f86577b = context;
        }

        @Override // v.f
        public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull a aVar) {
            aVar.n(0L);
            this.f86577b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public class b extends ICustomTabsCallback.Stub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Handler f86578a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C5668b f86579b;

        /* JADX INFO: renamed from: androidx.browser.customtabs.a$b$a, reason: collision with other inner class name */
        public class RunnableC0168a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f86581a;

            public RunnableC0168a(Bundle bundle) {
                this.f86581a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f86579b.onUnminimized(this.f86581a);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.a$b$b, reason: collision with other inner class name */
        public class RunnableC0169b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f86583a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bundle f86584b;

            public RunnableC0169b(int i10, Bundle bundle) {
                this.f86583a = i10;
                this.f86584b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f86579b.onNavigationEvent(this.f86583a, this.f86584b);
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f86586a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bundle f86587b;

            public c(String str, Bundle bundle) {
                this.f86586a = str;
                this.f86587b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f86579b.extraCallback(this.f86586a, this.f86587b);
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f86589a;

            public d(Bundle bundle) {
                this.f86589a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f86579b.onMessageChannelReady(this.f86589a);
            }
        }

        public class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f86591a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bundle f86592b;

            public e(String str, Bundle bundle) {
                this.f86591a = str;
                this.f86592b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f86579b.onPostMessage(this.f86591a, this.f86592b);
            }
        }

        public class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f86594a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Uri f86595b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f86596c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Bundle f86597d;

            public f(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f86594a = i10;
                this.f86595b = uri;
                this.f86596c = z10;
                this.f86597d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f86579b.onRelationshipValidationResult(this.f86594a, this.f86595b, this.f86596c, this.f86597d);
            }
        }

        public class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f86599a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f86600b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f86601c;

            public g(int i10, int i11, Bundle bundle) {
                this.f86599a = i10;
                this.f86600b = i11;
                this.f86601c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f86579b.onActivityResized(this.f86599a, this.f86600b, this.f86601c);
            }
        }

        public class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f86603a;

            public h(Bundle bundle) {
                this.f86603a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f86579b.onWarmupCompleted(this.f86603a);
            }
        }

        public class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f86605a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f86606b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f86607c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f86608d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f86609e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Bundle f86610f;

            public i(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
                this.f86605a = i10;
                this.f86606b = i11;
                this.f86607c = i12;
                this.f86608d = i13;
                this.f86609e = i14;
                this.f86610f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f86579b.onActivityLayout(this.f86605a, this.f86606b, this.f86607c, this.f86608d, this.f86609e, this.f86610f);
            }
        }

        public class j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f86612a;

            public j(Bundle bundle) {
                this.f86612a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f86579b.onMinimized(this.f86612a);
            }
        }

        public b(C5668b c5668b) {
            this.f86579b = c5668b;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(String str, Bundle bundle) throws RemoteException {
            if (this.f86579b == null) {
                return;
            }
            this.f86578a.post(new c(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public Bundle extraCallbackWithResult(@NonNull String str, @Nullable Bundle bundle) throws RemoteException {
            C5668b c5668b = this.f86579b;
            if (c5668b == null) {
                return null;
            }
            return c5668b.extraCallbackWithResult(str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityLayout(int i10, int i11, int i12, int i13, int i14, @NonNull Bundle bundle) throws RemoteException {
            if (this.f86579b == null) {
                return;
            }
            this.f86578a.post(new i(i10, i11, i12, i13, i14, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityResized(int i10, int i11, @Nullable Bundle bundle) throws RemoteException {
            if (this.f86579b == null) {
                return;
            }
            this.f86578a.post(new g(i10, i11, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) throws RemoteException {
            if (this.f86579b == null) {
                return;
            }
            this.f86578a.post(new d(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMinimized(@NonNull Bundle bundle) throws RemoteException {
            if (this.f86579b == null) {
                return;
            }
            this.f86578a.post(new j(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i10, Bundle bundle) {
            if (this.f86579b == null) {
                return;
            }
            this.f86578a.post(new RunnableC0169b(i10, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) throws RemoteException {
            if (this.f86579b == null) {
                return;
            }
            this.f86578a.post(new e(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, @Nullable Bundle bundle) throws RemoteException {
            if (this.f86579b == null) {
                return;
            }
            this.f86578a.post(new f(i10, uri, z10, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onUnminimized(@NonNull Bundle bundle) throws RemoteException {
            if (this.f86579b == null) {
                return;
            }
            this.f86578a.post(new RunnableC0168a(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onWarmupCompleted(@NonNull Bundle bundle) throws RemoteException {
            if (this.f86579b == null) {
                return;
            }
            this.f86578a.post(new h(bundle));
        }
    }

    public a(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
        this.f86574a = iCustomTabsService;
        this.f86575b = componentName;
        this.f86576c = context;
    }

    public static boolean b(@NonNull Context context, @Nullable String str, @NonNull f fVar) {
        fVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent(e.f239707c);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, fVar, 33);
    }

    public static boolean c(@NonNull Context context, @Nullable String str, @NonNull f fVar) {
        fVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent(e.f239707c);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, fVar, 1);
    }

    public static boolean d(@NonNull Context context, @NonNull String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return b(applicationContext, str, new C0167a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static PendingIntent f(Context context, int i10) {
        return PendingIntent.getActivity(context, i10, new Intent(), 67108864);
    }

    @Nullable
    public static String h(@NonNull Context context, @Nullable List<String> list) {
        return i(context, list, false);
    }

    @Nullable
    public static String i(@NonNull Context context, @Nullable List<String> list, boolean z10) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(R3.a.f67725c));
        if (!z10 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent(e.f239707c);
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w(f86573d, "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static b.d j(@NonNull Context context, @Nullable C5668b c5668b, int i10) {
        return new b.d(c5668b, f(context, i10));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public androidx.browser.customtabs.b a(@NonNull b.d dVar) {
        return m(dVar.a(), dVar.b());
    }

    public final ICustomTabsCallback.Stub e(@Nullable C5668b c5668b) {
        return new b(c5668b);
    }

    @Nullable
    public Bundle g(@NonNull String str, @Nullable Bundle bundle) {
        try {
            return this.f86574a.extraCommand(str, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Nullable
    public androidx.browser.customtabs.b k(@Nullable C5668b c5668b) {
        return m(c5668b, null);
    }

    @Nullable
    public androidx.browser.customtabs.b l(@Nullable C5668b c5668b, int i10) {
        return m(c5668b, f(this.f86576c, i10));
    }

    @Nullable
    public final androidx.browser.customtabs.b m(@Nullable C5668b c5668b, @Nullable PendingIntent pendingIntent) {
        boolean zNewSession;
        b bVar = new b(c5668b);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(CustomTabsIntent.f86527e, pendingIntent);
                zNewSession = this.f86574a.newSessionWithExtras(bVar, bundle);
            } else {
                zNewSession = this.f86574a.newSession(bVar);
            }
            if (zNewSession) {
                return new androidx.browser.customtabs.b(this.f86574a, bVar, this.f86575b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean n(long j10) {
        try {
            return this.f86574a.warmup(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
