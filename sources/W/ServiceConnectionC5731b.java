package w;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import e.I;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: w.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ServiceConnectionC5731b implements ServiceConnection {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f239968g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f239969h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f239970i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f239971j = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Runnable f239972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final a f239973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f239974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public z f239975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public List<CallbackToFutureAdapter.a<z>> f239976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Exception f239977f;

    /* JADX INFO: renamed from: w.b$a */
    public static class a {
        @NonNull
        public z a(ComponentName componentName, IBinder iBinder) {
            return new z(ITrustedWebActivityService.Stub.asInterface(iBinder), componentName);
        }
    }

    @I
    public ServiceConnectionC5731b(@NonNull Runnable runnable) {
        this(runnable, new a());
    }

    public static /* synthetic */ Object a(ServiceConnectionC5731b serviceConnectionC5731b, CallbackToFutureAdapter.a aVar) throws Exception {
        int i10 = serviceConnectionC5731b.f239974c;
        if (i10 == 0) {
            serviceConnectionC5731b.f239976e.add(aVar);
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    throw new IllegalStateException("Service has been disconnected.");
                }
                if (i10 != 3) {
                    throw new IllegalStateException("Connection state is invalid");
                }
                throw serviceConnectionC5731b.f239977f;
            }
            z zVar = serviceConnectionC5731b.f239975d;
            if (zVar == null) {
                throw new IllegalStateException("ConnectionHolder state is incorrect.");
            }
            aVar.c(zVar);
        }
        return "ConnectionHolder, state = " + serviceConnectionC5731b.f239974c;
    }

    @I
    public void b(@NonNull Exception exc) {
        Iterator<CallbackToFutureAdapter.a<z>> it = this.f239976e.iterator();
        while (it.hasNext()) {
            it.next().f(exc);
        }
        this.f239976e.clear();
        this.f239972a.run();
        this.f239974c = 3;
        this.f239977f = exc;
    }

    @NonNull
    @I
    public ListenableFuture<z> c() {
        return CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b() { // from class: w.a
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object attachCompleter(CallbackToFutureAdapter.a aVar) {
                return ServiceConnectionC5731b.a(this.f239967a, aVar);
            }
        });
    }

    @Override // android.content.ServiceConnection
    @I
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f239975d = this.f239973b.a(componentName, iBinder);
        Iterator<CallbackToFutureAdapter.a<z>> it = this.f239976e.iterator();
        while (it.hasNext()) {
            it.next().c(this.f239975d);
        }
        this.f239976e.clear();
        this.f239974c = 1;
    }

    @Override // android.content.ServiceConnection
    @I
    public void onServiceDisconnected(ComponentName componentName) {
        this.f239975d = null;
        this.f239972a.run();
        this.f239974c = 2;
    }

    @I
    public ServiceConnectionC5731b(@NonNull Runnable runnable, @NonNull a aVar) {
        this.f239974c = 0;
        this.f239976e = new ArrayList();
        this.f239972a = runnable;
        this.f239973b = aVar;
    }
}
