package com.prism.commons.ipc;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.commons.ipc.a;
import com.prism.commons.provider.ProviderCall;
import com.prism.commons.utils.C3839c;
import e6.t;
import g6.C4455a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import p6.InterfaceC5394a;
import p6.g;
import p6.i;

/* JADX INFO: loaded from: classes5.dex */
public class MainProcessGServiceProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f161968a = "MainProcessGServiceProvider";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f161969b = ".provider.MainProcessGServiceProvider";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f161970c = "checkInit";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f161971d = "BundleKey@_g_service_provider_binder_";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f161972e = new a(UUID.randomUUID().toString());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f161973f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile MainProcessGServiceProvider f161974g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map<String, InterfaceC5394a> f161975h = new LinkedHashMap();

    public static class a extends a.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f161976c;

        @Override // com.prism.commons.ipc.a
        public IBinder C5(String str) throws RemoteException {
            return MainProcessGServiceProvider.e(str);
        }

        @Override // com.prism.commons.ipc.a
        public String V4() {
            return this.f161976c;
        }

        public a(String str) {
            this.f161976c = str;
        }
    }

    public static /* synthetic */ void a() {
        Log.d(f161968a, "initServices()");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator<InterfaceC5394a> it = f161975h.values().iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        Log.d(f161968a, "initServices() finished in " + (System.currentTimeMillis() - jCurrentTimeMillis) + "(ms)");
    }

    public static void b(InterfaceC5394a interfaceC5394a) {
        f161975h.put(interfaceC5394a.b(), interfaceC5394a);
    }

    public static com.prism.commons.ipc.a c(Context context) {
        if (i.b(context)) {
            return f161972e;
        }
        Bundle bundleB = ProviderCall.b(context, f(context), "checkInit", null, null);
        if (bundleB != null) {
            return a.b.U0(C3839c.a(bundleB.getBinder(f161971d)));
        }
        Log.w(f161968a, "chkProviderInit: null response");
        return null;
    }

    @Nullable
    public static MainProcessGServiceProvider d() {
        return f161974g;
    }

    public static IBinder e(String str) {
        InterfaceC5394a interfaceC5394a = f161975h.get(str);
        if (interfaceC5394a == null) {
            return null;
        }
        return interfaceC5394a.c();
    }

    public static String f(Context context) {
        String str = i.f226368a;
        if (str != null) {
            return str.concat(f161969b);
        }
        return context.getPackageName() + f161969b;
    }

    public static void g(Context context) {
        if (f161973f) {
            return;
        }
        synchronized (MainProcessGServiceProvider.class) {
            if (f161973f) {
                return;
            }
            try {
                h(context);
            } catch (Throwable unused) {
            }
            f161973f = true;
        }
    }

    public static void h(Context context) {
        Log.d(f161968a, "initLocked()");
        b(t.T5());
        C4455a.b().a().execute(new g());
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if ("checkInit".equals(str)) {
            bundle2.putBinder(f161971d, f161972e);
        }
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        f161974g = this;
        g(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
