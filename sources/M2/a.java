package M2;

import T2.r;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.i;
import androidx.work.m;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f58787d = i.f("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f58788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f58789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Runnable> f58790c = new HashMap();

    /* JADX INFO: renamed from: M2.a$a, reason: collision with other inner class name */
    public class RunnableC0074a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f58791a;

        public RunnableC0074a(final r val$workSpec) {
            this.f58791a = val$workSpec;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.c().a(a.f58787d, String.format("Scheduling work %s", this.f58791a.f68219a), new Throwable[0]);
            a.this.f58788a.e(this.f58791a);
        }
    }

    public a(@NonNull b scheduler, @NonNull m runnableScheduler) {
        this.f58788a = scheduler;
        this.f58789b = runnableScheduler;
    }

    public void a(@NonNull final r workSpec) {
        Runnable runnableRemove = this.f58790c.remove(workSpec.f68219a);
        if (runnableRemove != null) {
            this.f58789b.a(runnableRemove);
        }
        RunnableC0074a runnableC0074a = new RunnableC0074a(workSpec);
        this.f58790c.put(workSpec.f68219a, runnableC0074a);
        this.f58789b.b(workSpec.a() - System.currentTimeMillis(), runnableC0074a);
    }

    public void b(@NonNull String workSpecId) {
        Runnable runnableRemove = this.f58790c.remove(workSpecId);
        if (runnableRemove != null) {
            this.f58789b.a(runnableRemove);
        }
    }
}
