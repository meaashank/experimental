package androidx.work.impl;

import T2.r;
import U2.a;
import U2.m;
import U2.p;
import U2.q;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.C1979x1;
import androidx.core.os.C2403b;
import androidx.lifecycle.K;
import androidx.work.Configuration;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.WorkRequest;
import androidx.work.WorkerParameters;
import androidx.work.i;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.l;
import androidx.work.n;
import androidx.work.o;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p.InterfaceC5376a;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class k extends o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f120485l = 22;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f120486m = 23;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f120487n = "androidx.work.multiprocess.RemoteWorkManagerClient";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f120491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Configuration f120492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WorkDatabase f120493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V2.a f120494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<e> f120495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f120496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public U2.i f120497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f120498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f120499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile W2.e f120500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f120484k = androidx.work.i.f("WorkManagerImpl");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static k f120488o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static k f120489p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f120490q = new Object();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.work.impl.utils.futures.a f120501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ U2.i f120502b;

        public a(final androidx.work.impl.utils.futures.a val$future, final U2.i val$preferenceUtils) {
            this.f120501a = val$future;
            this.f120502b = val$preferenceUtils;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f120501a.p(Long.valueOf(this.f120502b.a()));
            } catch (Throwable th) {
                this.f120501a.q(th);
            }
        }
    }

    public class b implements InterfaceC5376a<List<r.c>, WorkInfo> {
        public b() {
        }

        @Override // p.InterfaceC5376a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WorkInfo apply(List<r.c> input) {
            if (input == null || input.size() <= 0) {
                return null;
            }
            return input.get(0).a();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public k(@NonNull Context context, @NonNull Configuration configuration, @NonNull V2.a workTaskExecutor) {
        this(context, configuration, workTaskExecutor, context.getResources().getBoolean(l.a.f120560d));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void A(@NonNull Context context, @NonNull Configuration configuration) {
        synchronized (f120490q) {
            try {
                k kVar = f120488o;
                if (kVar != null && f120489p != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (kVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f120489p == null) {
                        f120489p = new k(applicationContext, configuration, new V2.b(configuration.f120194b));
                    }
                    f120488o = f120489p;
                }
            } finally {
            }
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Deprecated
    public static k G() {
        synchronized (f120490q) {
            try {
                k kVar = f120488o;
                if (kVar != null) {
                    return kVar;
                }
                return f120489p;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static k H(@NonNull Context context) {
        k kVarG;
        synchronized (f120490q) {
            try {
                kVarG = G();
                if (kVarG == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof Configuration.b)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    A(applicationContext, ((Configuration.b) applicationContext).a());
                    kVarG = H(applicationContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVarG;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void S(@Nullable k delegate) {
        synchronized (f120490q) {
            f120488o = delegate;
        }
    }

    @Override // androidx.work.o
    @NonNull
    public androidx.work.j B() {
        U2.l lVar = new U2.l(this);
        this.f120494d.d(lVar);
        return lVar.f68435b;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public List<e> C(@NonNull Context context, @NonNull Configuration configuration, @NonNull V2.a taskExecutor) {
        return Arrays.asList(f.a(context, this), new M2.b(context, configuration, taskExecutor, this));
    }

    @NonNull
    public g D(@NonNull String uniqueWorkName, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @NonNull PeriodicWorkRequest periodicWork) {
        return new g(this, uniqueWorkName, existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP ? ExistingWorkPolicy.KEEP : ExistingWorkPolicy.REPLACE, Collections.singletonList(periodicWork), null);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Context E() {
        return this.f120491a;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Configuration F() {
        return this.f120492b;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public U2.i I() {
        return this.f120497g;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public d J() {
        return this.f120496f;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public W2.e K() {
        if (this.f120500j == null) {
            synchronized (f120490q) {
                try {
                    if (this.f120500j == null) {
                        Y();
                        if (this.f120500j == null && !TextUtils.isEmpty(this.f120492b.f120199g)) {
                            throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f120500j;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public List<e> L() {
        return this.f120495e;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkDatabase M() {
        return this.f120493c;
    }

    public K<List<WorkInfo>> N(@NonNull List<String> workSpecIds) {
        return U2.g.a(this.f120493c.c0().r(workSpecIds), r.f68218u, this.f120494d);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public V2.a O() {
        return this.f120494d;
    }

    public final void P(@NonNull Context context, @NonNull Configuration configuration, @NonNull V2.a workTaskExecutor, @NonNull WorkDatabase workDatabase, @NonNull List<e> schedulers, @NonNull d processor) {
        Context applicationContext = context.getApplicationContext();
        this.f120491a = applicationContext;
        this.f120492b = configuration;
        this.f120494d = workTaskExecutor;
        this.f120493c = workDatabase;
        this.f120495e = schedulers;
        this.f120496f = processor;
        this.f120497g = new U2.i(workDatabase);
        this.f120498h = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f120494d.d(new ForceStopRunnable(applicationContext, this));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void Q() {
        synchronized (f120490q) {
            try {
                this.f120498h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f120499i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f120499i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void R() {
        O2.l.a(E());
        M().c0().z();
        f.b(F(), M(), L());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void T(@NonNull BroadcastReceiver.PendingResult rescheduleReceiverResult) {
        synchronized (f120490q) {
            try {
                this.f120499i = rescheduleReceiverResult;
                if (this.f120498h) {
                    rescheduleReceiverResult.finish();
                    this.f120499i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void U(@NonNull String workSpecId) {
        V(workSpecId, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void V(@NonNull String workSpecId, @Nullable WorkerParameters.a runtimeExtras) {
        this.f120494d.d(new U2.o(this, workSpecId, runtimeExtras));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void W(@NonNull String workSpecId) {
        this.f120494d.d(new q(this, workSpecId, true));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void X(@NonNull String workSpecId) {
        this.f120494d.d(new q(this, workSpecId, false));
    }

    public final void Y() {
        try {
            this.f120500j = (W2.e) Class.forName(f120487n).getConstructor(Context.class, k.class).newInstance(this.f120491a, this);
        } catch (Throwable th) {
            androidx.work.i.c().a(f120484k, "Unable to initialize multi-process support", th);
        }
    }

    @Override // androidx.work.o
    @NonNull
    public n b(@NonNull String uniqueWorkName, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<OneTimeWorkRequest> work) {
        if (work.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new g(this, uniqueWorkName, existingWorkPolicy, work, null);
    }

    @Override // androidx.work.o
    @NonNull
    public n d(@NonNull List<OneTimeWorkRequest> work) {
        if (work.isEmpty()) {
            throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
        }
        return new g(this, work);
    }

    @Override // androidx.work.o
    @NonNull
    public androidx.work.j e() {
        a.d dVar = new a.d(this);
        this.f120494d.d(dVar);
        return dVar.f68403a;
    }

    @Override // androidx.work.o
    @NonNull
    public androidx.work.j f(@NonNull final String tag) {
        a.b bVar = new a.b(this, tag);
        this.f120494d.d(bVar);
        return bVar.f68403a;
    }

    @Override // androidx.work.o
    @NonNull
    public androidx.work.j g(@NonNull String uniqueWorkName) {
        a.c cVar = new a.c(this, uniqueWorkName, true);
        this.f120494d.d(cVar);
        return cVar.f68403a;
    }

    @Override // androidx.work.o
    @NonNull
    public androidx.work.j h(@NonNull UUID id2) {
        a.C0115a c0115a = new a.C0115a(this, id2);
        this.f120494d.d(c0115a);
        return c0115a.f68403a;
    }

    @Override // androidx.work.o
    @NonNull
    public PendingIntent i(@NonNull UUID id2) {
        return PendingIntent.getService(this.f120491a, 0, androidx.work.impl.foreground.a.b(this.f120491a, id2.toString()), C2403b.i() ? 167772160 : C1979x1.f100279m);
    }

    @Override // androidx.work.o
    @NonNull
    public androidx.work.j k(@NonNull List<? extends WorkRequest> requests) {
        if (requests.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new g(this, requests).c();
    }

    @Override // androidx.work.o
    @NonNull
    public androidx.work.j l(@NonNull String uniqueWorkName, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @NonNull PeriodicWorkRequest periodicWork) {
        return D(uniqueWorkName, existingPeriodicWorkPolicy, periodicWork).c();
    }

    @Override // androidx.work.o
    @NonNull
    public androidx.work.j n(@NonNull String uniqueWorkName, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<OneTimeWorkRequest> work) {
        return new g(this, uniqueWorkName, existingWorkPolicy, work, null).c();
    }

    @Override // androidx.work.o
    @NonNull
    public ListenableFuture<Long> q() {
        androidx.work.impl.utils.futures.a aVarU = androidx.work.impl.utils.futures.a.u();
        this.f120494d.d(new a(aVarU, this.f120497g));
        return aVarU;
    }

    @Override // androidx.work.o
    @NonNull
    public K<Long> r() {
        return this.f120497g.b();
    }

    @Override // androidx.work.o
    @NonNull
    public ListenableFuture<WorkInfo> s(@NonNull UUID id2) {
        p.b bVar = new p.b(this, id2);
        this.f120494d.b().execute(bVar);
        return bVar.f68445a;
    }

    @Override // androidx.work.o
    @NonNull
    public K<WorkInfo> t(@NonNull UUID id2) {
        return U2.g.a(this.f120493c.c0().r(Collections.singletonList(id2.toString())), new b(), this.f120494d);
    }

    @Override // androidx.work.o
    @NonNull
    public ListenableFuture<List<WorkInfo>> u(@NonNull WorkQuery workQuery) {
        p.e eVar = new p.e(this, workQuery);
        this.f120494d.b().execute(eVar);
        return eVar.f68445a;
    }

    @Override // androidx.work.o
    @NonNull
    public ListenableFuture<List<WorkInfo>> v(@NonNull String tag) {
        p.c cVar = new p.c(this, tag);
        this.f120494d.b().execute(cVar);
        return cVar.f68445a;
    }

    @Override // androidx.work.o
    @NonNull
    public K<List<WorkInfo>> w(@NonNull String tag) {
        return U2.g.a(this.f120493c.c0().n(tag), r.f68218u, this.f120494d);
    }

    @Override // androidx.work.o
    @NonNull
    public ListenableFuture<List<WorkInfo>> x(@NonNull String uniqueWorkName) {
        p.d dVar = new p.d(this, uniqueWorkName);
        this.f120494d.b().execute(dVar);
        return dVar.f68445a;
    }

    @Override // androidx.work.o
    @NonNull
    public K<List<WorkInfo>> y(@NonNull String uniqueWorkName) {
        return U2.g.a(this.f120493c.c0().m(uniqueWorkName), r.f68218u, this.f120494d);
    }

    @Override // androidx.work.o
    @NonNull
    public K<List<WorkInfo>> z(@NonNull WorkQuery workQuery) {
        return U2.g.a(this.f120493c.Y().b(m.b(workQuery)), r.f68218u, this.f120494d);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public k(@NonNull Context context, @NonNull Configuration configuration, @NonNull V2.a workTaskExecutor, boolean useTestDatabase) {
        this(context, configuration, workTaskExecutor, WorkDatabase.S(context.getApplicationContext(), workTaskExecutor.b(), useTestDatabase));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public k(@NonNull Context context, @NonNull Configuration configuration, @NonNull V2.a workTaskExecutor, @NonNull WorkDatabase database) {
        Context applicationContext = context.getApplicationContext();
        androidx.work.i.e(new i.a(configuration.f120200h));
        List<e> listC = C(applicationContext, configuration, workTaskExecutor);
        P(context, configuration, workTaskExecutor, database, listC, new d(context, configuration, workTaskExecutor, database, listC));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public k(@NonNull Context context, @NonNull Configuration configuration, @NonNull V2.a workTaskExecutor, @NonNull WorkDatabase workDatabase, @NonNull List<e> schedulers, @NonNull d processor) {
        P(context, configuration, workTaskExecutor, workDatabase, schedulers, processor);
    }
}
