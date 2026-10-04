package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.core.app.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class AbstractServiceC2394q extends Service {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f111088h = "JobIntentService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f111089i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f111090j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HashMap<ComponentName, h> f111091k = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f111092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f111093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f111094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f111095d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f111096e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f111097f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<d> f111098g;

    /* JADX INFO: renamed from: androidx.core.app.q$a */
    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        public Void a(Void... voidArr) {
            while (true) {
                e eVarA = AbstractServiceC2394q.this.a();
                if (eVarA == null) {
                    return null;
                }
                AbstractServiceC2394q.this.h(eVarA.getIntent());
                eVarA.k();
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r12) {
            AbstractServiceC2394q.this.j();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            AbstractServiceC2394q.this.j();
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
            a(voidArr);
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.q$b */
    public interface b {
        IBinder a();

        e dequeueWork();
    }

    /* JADX INFO: renamed from: androidx.core.app.q$c */
    public static final class c extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Context f111100d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final PowerManager.WakeLock f111101e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final PowerManager.WakeLock f111102f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f111103g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f111104h;

        public c(Context context, ComponentName componentName) {
            super(componentName);
            this.f111100d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService(Y7.a.f79330e);
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f111101e = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f111102f = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.AbstractServiceC2394q.h
        public void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f111117a);
            if (this.f111100d.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.f111103g) {
                            this.f111103g = true;
                            if (!this.f111104h) {
                                this.f111101e.acquire(60000L);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // androidx.core.app.AbstractServiceC2394q.h
        public void c() {
            synchronized (this) {
                try {
                    if (this.f111104h) {
                        if (this.f111103g) {
                            this.f111101e.acquire(60000L);
                        }
                        this.f111104h = false;
                        this.f111102f.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.AbstractServiceC2394q.h
        public void d() {
            synchronized (this) {
                try {
                    if (!this.f111104h) {
                        this.f111104h = true;
                        this.f111102f.acquire(600000L);
                        this.f111101e.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.AbstractServiceC2394q.h
        public void e() {
            synchronized (this) {
                this.f111103g = false;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.q$d */
    public final class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f111105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f111106b;

        public d(Intent intent, int i10) {
            this.f111105a = intent;
            this.f111106b = i10;
        }

        @Override // androidx.core.app.AbstractServiceC2394q.e
        public Intent getIntent() {
            return this.f111105a;
        }

        @Override // androidx.core.app.AbstractServiceC2394q.e
        public void k() {
            AbstractServiceC2394q.this.stopSelf(this.f111106b);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.q$e */
    public interface e {
        Intent getIntent();

        void k();
    }

    /* JADX INFO: renamed from: androidx.core.app.q$f */
    @e.T(26)
    public static final class f extends JobServiceEngine implements b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f111108d = "JobServiceEngineImpl";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final boolean f111109e = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractServiceC2394q f111110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f111111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public JobParameters f111112c;

        /* JADX INFO: renamed from: androidx.core.app.q$f$a */
        public final class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final JobWorkItem f111113a;

            public a(JobWorkItem jobWorkItem) {
                this.f111113a = jobWorkItem;
            }

            @Override // androidx.core.app.AbstractServiceC2394q.e
            public Intent getIntent() {
                return this.f111113a.getIntent();
            }

            @Override // androidx.core.app.AbstractServiceC2394q.e
            public void k() {
                synchronized (f.this.f111111b) {
                    try {
                        JobParameters jobParameters = f.this.f111112c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f111113a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public f(AbstractServiceC2394q abstractServiceC2394q) {
            super(abstractServiceC2394q);
            this.f111111b = new Object();
            this.f111110a = abstractServiceC2394q;
        }

        @Override // androidx.core.app.AbstractServiceC2394q.b
        public IBinder a() {
            return getBinder();
        }

        @Override // androidx.core.app.AbstractServiceC2394q.b
        public e dequeueWork() {
            synchronized (this.f111111b) {
                try {
                    JobParameters jobParameters = this.f111112c;
                    if (jobParameters == null) {
                        return null;
                    }
                    JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f111110a.getClassLoader());
                    return new a(jobWorkItemDequeueWork);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f111112c = jobParameters;
            this.f111110a.e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean zB = this.f111110a.b();
            synchronized (this.f111111b) {
                this.f111112c = null;
            }
            return zB;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.q$g */
    @e.T(26)
    public static final class g extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final JobInfo f111115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final JobScheduler f111116e;

        public g(Context context, ComponentName componentName, int i10) {
            super(componentName);
            b(i10);
            this.f111115d = new JobInfo.Builder(i10, componentName).setOverrideDeadline(0L).build();
            this.f111116e = (JobScheduler) context.getApplicationContext().getSystemService(K7.a.f58426e);
        }

        @Override // androidx.core.app.AbstractServiceC2394q.h
        public void a(Intent intent) {
            this.f111116e.enqueue(this.f111115d, C2399w.a(intent));
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.q$h */
    public static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f111117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f111118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f111119c;

        public h(ComponentName componentName) {
            this.f111117a = componentName;
        }

        public abstract void a(Intent intent);

        public void b(int i10) {
            if (!this.f111118b) {
                this.f111118b = true;
                this.f111119c = i10;
            } else {
                if (this.f111119c == i10) {
                    return;
                }
                StringBuilder sbA = android.support.v4.media.a.a("Given job ID ", i10, " is different than previous ");
                sbA.append(this.f111119c);
                throw new IllegalArgumentException(sbA.toString());
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public AbstractServiceC2394q() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f111098g = null;
        } else {
            this.f111098g = new ArrayList<>();
        }
    }

    public static void c(@NonNull Context context, @NonNull ComponentName componentName, int i10, @NonNull Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f111090j) {
            h hVarF = f(context, componentName, true, i10);
            hVarF.b(i10);
            hVarF.a(intent);
        }
    }

    public static void d(@NonNull Context context, @NonNull Class<?> cls, int i10, @NonNull Intent intent) {
        c(context, new ComponentName(context, cls), i10, intent);
    }

    public static h f(Context context, ComponentName componentName, boolean z10, int i10) {
        h cVar;
        HashMap<ComponentName, h> map = f111091k;
        h hVar = map.get(componentName);
        if (hVar != null) {
            return hVar;
        }
        if (Build.VERSION.SDK_INT < 26) {
            cVar = new c(context, componentName);
        } else {
            if (!z10) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            cVar = new g(context, componentName, i10);
        }
        map.put(componentName, cVar);
        return cVar;
    }

    public e a() {
        b bVar = this.f111092a;
        if (bVar != null) {
            return bVar.dequeueWork();
        }
        synchronized (this.f111098g) {
            try {
                if (this.f111098g.size() <= 0) {
                    return null;
                }
                return this.f111098g.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        a aVar = this.f111094c;
        if (aVar != null) {
            aVar.cancel(this.f111095d);
        }
        this.f111096e = true;
        return true;
    }

    public void e(boolean z10) {
        if (this.f111094c == null) {
            this.f111094c = new a();
            h hVar = this.f111093b;
            if (hVar != null && z10) {
                hVar.d();
            }
            this.f111094c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean g() {
        return this.f111096e;
    }

    public abstract void h(@NonNull Intent intent);

    public boolean i() {
        return true;
    }

    public void j() {
        ArrayList<d> arrayList = this.f111098g;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f111094c = null;
                    ArrayList<d> arrayList2 = this.f111098g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        e(false);
                    } else if (!this.f111097f) {
                        this.f111093b.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void k(boolean z10) {
        this.f111095d = z10;
    }

    @Override // android.app.Service
    public IBinder onBind(@NonNull Intent intent) {
        b bVar = this.f111092a;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f111092a = new f(this);
            this.f111093b = null;
        } else {
            this.f111092a = null;
            this.f111093b = f(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.f111098g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f111097f = true;
                this.f111093b.c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i10, int i11) {
        if (this.f111098g == null) {
            return 2;
        }
        this.f111093b.e();
        synchronized (this.f111098g) {
            ArrayList<d> arrayList = this.f111098g;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i11));
            e(true);
        }
        return 3;
    }
}
