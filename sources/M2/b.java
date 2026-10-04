package M2;

import P2.c;
import P2.d;
import T2.r;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.WorkInfo;
import androidx.work.i;
import androidx.work.impl.e;
import androidx.work.impl.k;
import e.f0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class b implements e, c, androidx.work.impl.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f58793i = i.f("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f58794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f58795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f58796c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f58798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f58799f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f58801h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<r> f58797d = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f58800g = new Object();

    public b(@NonNull Context context, @NonNull Configuration configuration, @NonNull V2.a taskExecutor, @NonNull k workManagerImpl) {
        this.f58794a = context;
        this.f58795b = workManagerImpl;
        this.f58796c = new d(context, taskExecutor, this);
        this.f58798e = new a(this, configuration.f120197e);
    }

    @Override // P2.c
    public void a(@NonNull List<String> workSpecIds) {
        for (String str : workSpecIds) {
            i.c().a(f58793i, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f58795b.X(str);
        }
    }

    @Override // androidx.work.impl.e
    public boolean b() {
        return false;
    }

    @Override // androidx.work.impl.b
    public void c(@NonNull String workSpecId, boolean needsReschedule) {
        i(workSpecId);
    }

    @Override // androidx.work.impl.e
    public void d(@NonNull String workSpecId) {
        if (this.f58801h == null) {
            g();
        }
        if (!this.f58801h.booleanValue()) {
            i.c().d(f58793i, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        i.c().a(f58793i, String.format("Cancelling work ID %s", workSpecId), new Throwable[0]);
        a aVar = this.f58798e;
        if (aVar != null) {
            aVar.b(workSpecId);
        }
        this.f58795b.X(workSpecId);
    }

    @Override // androidx.work.impl.e
    public void e(@NonNull r... workSpecs) {
        if (this.f58801h == null) {
            g();
        }
        if (!this.f58801h.booleanValue()) {
            i.c().d(f58793i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (r rVar : workSpecs) {
            long jA = rVar.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (rVar.f68220b == WorkInfo.State.ENQUEUED) {
                if (jCurrentTimeMillis < jA) {
                    a aVar = this.f58798e;
                    if (aVar != null) {
                        aVar.a(rVar);
                    }
                } else if (rVar.b()) {
                    int i10 = Build.VERSION.SDK_INT;
                    Constraints constraints = rVar.f68228j;
                    if (constraints.f120211c) {
                        i.c().a(f58793i, String.format("Ignoring WorkSpec %s, Requires device idle.", rVar), new Throwable[0]);
                    } else if (i10 < 24 || !constraints.e()) {
                        hashSet.add(rVar);
                        hashSet2.add(rVar.f68219a);
                    } else {
                        i.c().a(f58793i, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", rVar), new Throwable[0]);
                    }
                } else {
                    i.c().a(f58793i, String.format("Starting work for %s", rVar.f68219a), new Throwable[0]);
                    this.f58795b.U(rVar.f68219a);
                }
            }
        }
        synchronized (this.f58800g) {
            try {
                if (!hashSet.isEmpty()) {
                    i.c().a(f58793i, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.f58797d.addAll(hashSet);
                    this.f58796c.d(this.f58797d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // P2.c
    public void f(@NonNull List<String> workSpecIds) {
        for (String str : workSpecIds) {
            i.c().a(f58793i, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f58795b.U(str);
        }
    }

    public final void g() {
        this.f58801h = Boolean.valueOf(U2.k.b(this.f58794a, this.f58795b.F()));
    }

    public final void h() {
        if (this.f58799f) {
            return;
        }
        this.f58795b.J().d(this);
        this.f58799f = true;
    }

    public final void i(@NonNull String workSpecId) {
        synchronized (this.f58800g) {
            try {
                Iterator<r> it = this.f58797d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r next = it.next();
                    if (next.f68219a.equals(workSpecId)) {
                        i.c().a(f58793i, String.format("Stopping tracking for %s", workSpecId), new Throwable[0]);
                        this.f58797d.remove(next);
                        this.f58796c.d(this.f58797d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @f0
    public void j(@NonNull a delayedWorkTracker) {
        this.f58798e = delayedWorkTracker;
    }

    @f0
    public b(@NonNull Context context, @NonNull k workManagerImpl, @NonNull d workConstraintsTracker) {
        this.f58794a = context;
        this.f58795b = workManagerImpl;
        this.f58796c = workConstraintsTracker;
    }
}
