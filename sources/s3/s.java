package s3;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import e.InterfaceC4326A;
import e.T;
import e.f0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import s3.InterfaceC5571b;
import t7.C5617a;
import y3.C5819h;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile s f238514d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f238515e = "ConnectivityMonitor";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f238516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC4326A("this")
    public final Set<InterfaceC5571b.a> f238517b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @InterfaceC4326A("this")
    public boolean f238518c;

    public class a implements C5819h.b<ConnectivityManager> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f238519a;

        public a(Context context) {
            this.f238519a = context;
        }

        @Override // y3.C5819h.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f238519a.getSystemService(C5617a.f239212e);
        }
    }

    public class b implements InterfaceC5571b.a {
        public b() {
        }

        @Override // s3.InterfaceC5571b.a
        public void a(boolean z10) {
            ArrayList arrayList;
            y3.o.b();
            synchronized (s.this) {
                arrayList = new ArrayList(s.this.f238517b);
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((InterfaceC5571b.a) obj).a(z10);
            }
        }
    }

    public interface c {
        boolean a();

        void unregister();
    }

    @T(24)
    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f238522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC5571b.a f238523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C5819h.b<ConnectivityManager> f238524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ConnectivityManager.NetworkCallback f238525d = new a();

        public class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: s3.s$d$a$a, reason: collision with other inner class name */
            public class RunnableC0883a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f238527a;

                public RunnableC0883a(boolean z10) {
                    this.f238527a = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f238527a);
                }
            }

            public a() {
            }

            public void a(boolean z10) {
                y3.o.b();
                d dVar = d.this;
                boolean z11 = dVar.f238522a;
                dVar.f238522a = z10;
                if (z11 != z10) {
                    dVar.f238523b.a(z10);
                }
            }

            public final void b(boolean z10) {
                y3.o.y(new RunnableC0883a(z10));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@NonNull Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@NonNull Network network) {
                b(false);
            }
        }

        public d(C5819h.b<ConnectivityManager> bVar, InterfaceC5571b.a aVar) {
            this.f238524c = bVar;
            this.f238523b = aVar;
        }

        @Override // s3.s.c
        @SuppressLint({"MissingPermission"})
        public boolean a() {
            this.f238522a = this.f238524c.get().getActiveNetwork() != null;
            try {
                this.f238524c.get().registerDefaultNetworkCallback(this.f238525d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }

        @Override // s3.s.c
        public void unregister() {
            this.f238524c.get().unregisterNetworkCallback(this.f238525d);
        }
    }

    public static final class e implements c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Executor f238529g = AsyncTask.SERIAL_EXECUTOR;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f238530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC5571b.a f238531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C5819h.b<ConnectivityManager> f238532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f238533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f238534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final BroadcastReceiver f238535f = new a();

        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(@NonNull Context context, Intent intent) {
                e.this.d();
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f238533d = eVar.b();
                try {
                    e eVar2 = e.this;
                    eVar2.f238530a.registerReceiver(eVar2.f238535f, new IntentFilter(q4.c.f226807e));
                    e.this.f238534e = true;
                } catch (SecurityException e10) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e10);
                    }
                    e.this.f238534e = false;
                }
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (e.this.f238534e) {
                    e.this.f238534e = false;
                    e eVar = e.this;
                    eVar.f238530a.unregisterReceiver(eVar.f238535f);
                }
            }
        }

        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10 = e.this.f238533d;
                e eVar = e.this;
                eVar.f238533d = eVar.b();
                if (z10 != e.this.f238533d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.f238533d);
                    }
                    e eVar2 = e.this;
                    eVar2.c(eVar2.f238533d);
                }
            }
        }

        /* JADX INFO: renamed from: s3.s$e$e, reason: collision with other inner class name */
        public class RunnableC0884e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f238540a;

            public RunnableC0884e(boolean z10) {
                this.f238540a = z10;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f238531b.a(this.f238540a);
            }
        }

        public e(Context context, C5819h.b<ConnectivityManager> bVar, InterfaceC5571b.a aVar) {
            this.f238530a = context.getApplicationContext();
            this.f238532c = bVar;
            this.f238531b = aVar;
        }

        @Override // s3.s.c
        public boolean a() {
            f238529g.execute(new b());
            return true;
        }

        @SuppressLint({"MissingPermission"})
        public boolean b() {
            try {
                NetworkInfo activeNetworkInfo = this.f238532c.get().getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e10) {
                if (!Log.isLoggable("ConnectivityMonitor", 5)) {
                    return true;
                }
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e10);
                return true;
            }
        }

        public void c(boolean z10) {
            y3.o.y(new RunnableC0884e(z10));
        }

        public void d() {
            f238529g.execute(new d());
        }

        @Override // s3.s.c
        public void unregister() {
            f238529g.execute(new c());
        }
    }

    public s(@NonNull Context context) {
        C5819h.a aVar = new C5819h.a(new a(context));
        b bVar = new b();
        this.f238516a = Build.VERSION.SDK_INT >= 24 ? new d(aVar, bVar) : new e(context, aVar, bVar);
    }

    public static s a(@NonNull Context context) {
        if (f238514d == null) {
            synchronized (s.class) {
                try {
                    if (f238514d == null) {
                        f238514d = new s(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f238514d;
    }

    @f0
    public static void e() {
        f238514d = null;
    }

    @InterfaceC4326A("this")
    public final void b() {
        if (this.f238518c || this.f238517b.isEmpty()) {
            return;
        }
        this.f238518c = this.f238516a.a();
    }

    @InterfaceC4326A("this")
    public final void c() {
        if (this.f238518c && this.f238517b.isEmpty()) {
            this.f238516a.unregister();
            this.f238518c = false;
        }
    }

    public synchronized void d(InterfaceC5571b.a aVar) {
        this.f238517b.add(aVar);
        b();
    }

    public synchronized void f(InterfaceC5571b.a aVar) {
        this.f238517b.remove(aVar);
        c();
    }
}
