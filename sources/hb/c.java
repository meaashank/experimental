package Hb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import com.tonyodev.fetch2.NetworkType;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t7.C5617a;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nNetworkInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkInfoProvider.kt\ncom/tonyodev/fetch2/provider/NetworkInfoProvider\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,145:1\n32#2,2:146\n*S KotlinDebug\n*F\n+ 1 NetworkInfoProvider.kt\ncom/tonyodev/fetch2/provider/NetworkInfoProvider\n*L\n69#1:146,2\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f50737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f50738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object f50739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final HashSet<a> f50740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final ConnectivityManager f50741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BroadcastReceiver f50742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f50743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Object f50744h;

    public interface a {
        void onNetworkChanged();
    }

    public static final class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            G.p(network, "network");
            c.this.d();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            G.p(network, "network");
            c.this.d();
        }
    }

    /* JADX INFO: renamed from: Hb.c$c, reason: collision with other inner class name */
    public static final class C0047c extends BroadcastReceiver {
        public C0047c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            c.this.d();
        }
    }

    public c(@NotNull Context context, @Nullable String str) {
        G.p(context, "context");
        this.f50737a = context;
        this.f50738b = str;
        this.f50739c = new Object();
        this.f50740d = new HashSet<>();
        Object systemService = context.getSystemService(C5617a.f239212e);
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        this.f50741e = connectivityManager;
        C0047c c0047c = new C0047c();
        this.f50742f = c0047c;
        int i10 = Build.VERSION.SDK_INT;
        if (connectivityManager != null) {
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(0).addTransportType(1).addTransportType(3).build();
            b bVar = new b();
            this.f50744h = bVar;
            connectivityManager.registerNetworkCallback(networkRequestBuild, bVar);
            return;
        }
        try {
            if (i10 >= 33) {
                context.registerReceiver(c0047c, new IntentFilter(q4.c.f226807e), 2);
            } else {
                context.registerReceiver(c0047c, new IntentFilter(q4.c.f226807e));
            }
            this.f50743g = true;
        } catch (Exception unused) {
        }
    }

    public final boolean b() {
        String str = this.f50738b;
        if (str == null) {
            return Jb.b.a(this.f50737a);
        }
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            G.n(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(20000);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.connect();
            return httpURLConnection.getResponseCode() != -1;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean c(@NotNull NetworkType networkType) {
        G.p(networkType, "networkType");
        if (networkType == NetworkType.WIFI_ONLY && Jb.b.c(this.f50737a)) {
            return true;
        }
        if (networkType != NetworkType.UNMETERED || Jb.b.b(this.f50737a)) {
            return networkType == NetworkType.ALL && Jb.b.a(this.f50737a);
        }
        return true;
    }

    public final void d() {
        synchronized (this.f50739c) {
            Iterator<a> it = this.f50740d.iterator();
            G.o(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().onNetworkChanged();
            }
        }
    }

    public final void e(@NotNull a networkChangeListener) {
        G.p(networkChangeListener, "networkChangeListener");
        synchronized (this.f50739c) {
            this.f50740d.add(networkChangeListener);
        }
    }

    public final void f() {
        synchronized (this.f50739c) {
            this.f50740d.clear();
            if (this.f50743g) {
                try {
                    this.f50737a.unregisterReceiver(this.f50742f);
                } catch (Exception unused) {
                }
            }
            ConnectivityManager connectivityManager = this.f50741e;
            if (connectivityManager != null) {
                Object obj = this.f50744h;
                if (obj instanceof ConnectivityManager.NetworkCallback) {
                    connectivityManager.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) obj);
                }
            }
        }
    }

    public final void g(@NotNull a networkChangeListener) {
        G.p(networkChangeListener, "networkChangeListener");
        synchronized (this.f50739c) {
            this.f50740d.remove(networkChangeListener);
        }
    }
}
