package w;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.U;
import com.google.common.util.concurrent.ListenableFuture;
import e.I;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: w.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5729B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f239961c = "TWAConnectionPool";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f239962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Uri, ServiceConnectionC5731b> f239963b = new HashMap();

    /* JADX INFO: renamed from: w.B$a */
    public static class a extends AsyncTask<Void, Void, Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f239964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Intent f239965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ServiceConnectionC5731b f239966c;

        public a(Context context, Intent intent, ServiceConnectionC5731b serviceConnectionC5731b) {
            this.f239964a = context.getApplicationContext();
            this.f239965b = intent;
            this.f239966c = serviceConnectionC5731b;
        }

        @Override // android.os.AsyncTask
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exception doInBackground(Void... voidArr) {
            try {
                if (this.f239964a.bindService(this.f239965b, this.f239966c, U.f113740I)) {
                    return null;
                }
                this.f239964a.unbindService(this.f239966c);
                return new IllegalStateException("Could not bind to the service");
            } catch (SecurityException e10) {
                Log.w(C5729B.f239961c, "SecurityException while binding.", e10);
                return e10;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Exception exc) {
            if (exc != null) {
                this.f239966c.b(exc);
            }
        }
    }

    public C5729B(@NonNull Context context) {
        this.f239962a = context.getApplicationContext();
    }

    @NonNull
    public static C5729B c(@NonNull Context context) {
        return new C5729B(context);
    }

    @NonNull
    @I
    public ListenableFuture<z> b(@NonNull final Uri uri, @NonNull Set<n> set, @NonNull Executor executor) {
        ServiceConnectionC5731b serviceConnectionC5731b = this.f239963b.get(uri);
        if (serviceConnectionC5731b != null) {
            return serviceConnectionC5731b.c();
        }
        Intent intentD = d(this.f239962a, uri, set, true);
        if (intentD == null) {
            return c.a(new IllegalArgumentException("No service exists for scope"));
        }
        ServiceConnectionC5731b serviceConnectionC5731b2 = new ServiceConnectionC5731b(new Runnable() { // from class: w.A
            @Override // java.lang.Runnable
            public final void run() {
                this.f239959a.f239963b.remove(uri);
            }
        });
        this.f239963b.put(uri, serviceConnectionC5731b2);
        new a(this.f239962a, intentD, serviceConnectionC5731b2).executeOnExecutor(executor, new Void[0]);
        return serviceConnectionC5731b2.c();
    }

    @Nullable
    public final Intent d(Context context, Uri uri, Set<n> set, boolean z10) {
        if (set == null || set.size() == 0) {
            return null;
        }
        Intent intent = new Intent();
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        String str = null;
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            Iterator<n> it2 = set.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (l.d(str2, context.getPackageManager(), it2.next().f239989a)) {
                        str = str2;
                        break;
                    }
                }
            }
        }
        if (str == null) {
            if (z10) {
                Log.w(f239961c, "No TWA candidates for " + uri + " have been registered.");
            }
            return null;
        }
        Intent intent2 = new Intent();
        intent2.setPackage(str);
        intent2.setAction(x.f240017d);
        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 131072);
        if (resolveInfoResolveService == null) {
            if (z10) {
                Log.w(f239961c, "Could not find TWAService for ".concat(str));
            }
            return null;
        }
        if (z10) {
            Log.i(f239961c, "Found " + resolveInfoResolveService.serviceInfo.name + " to handle request for " + uri);
        }
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(str, resolveInfoResolveService.serviceInfo.name));
        return intent3;
    }

    @I
    public boolean e(@NonNull Uri uri, @NonNull Set<n> set) {
        return (this.f239963b.get(uri) == null && d(this.f239962a, uri, set, false) == null) ? false : true;
    }

    public void f() {
        Iterator<ServiceConnectionC5731b> it = this.f239963b.values().iterator();
        while (it.hasNext()) {
            this.f239962a.unbindService(it.next());
        }
        this.f239963b.clear();
    }
}
