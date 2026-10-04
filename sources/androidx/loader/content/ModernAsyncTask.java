package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ModernAsyncTask<Params, Progress, Result> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f114387f = "AsyncTask";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f114388g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f114389h = 128;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f114390i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ThreadFactory f114391j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final BlockingQueue<Runnable> f114392k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Executor f114393l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f114394m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f114395n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static f f114396o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static volatile Executor f114397p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<Params, Result> f114398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FutureTask<Result> f114399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Status f114400c = Status.PENDING;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f114401d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f114402e = new AtomicBoolean();

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f114403a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f114403a.getAndIncrement());
        }
    }

    public class b extends g<Params, Result> {
        public b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            ModernAsyncTask.this.f114402e.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) ModernAsyncTask.this.b(this.f114409a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    public class c extends FutureTask<Result> {
        public c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                ModernAsyncTask.this.u(get());
            } catch (InterruptedException e10) {
                Log.w(ModernAsyncTask.f114387f, e10);
            } catch (CancellationException unused) {
                ModernAsyncTask.this.u(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f114406a;

        static {
            int[] iArr = new int[Status.values().length];
            f114406a = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f114406a[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class e<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ModernAsyncTask f114407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Data[] f114408b;

        public e(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.f114407a = modernAsyncTask;
            this.f114408b = dataArr;
        }
    }

    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i10 = message.what;
            if (i10 == 1) {
                eVar.f114407a.f(eVar.f114408b[0]);
            } else {
                if (i10 != 2) {
                    return;
                }
                eVar.f114407a.getClass();
            }
        }
    }

    public static abstract class g<Params, Result> implements Callable<Result> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Params[] f114409a;
    }

    static {
        a aVar = new a();
        f114391j = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f114392k = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f114393l = threadPoolExecutor;
        f114397p = threadPoolExecutor;
    }

    public ModernAsyncTask() {
        b bVar = new b();
        this.f114398a = bVar;
        this.f114399b = new c(bVar);
    }

    public static void d(Runnable runnable) {
        f114397p.execute(runnable);
    }

    public static Handler i() {
        f fVar;
        synchronized (ModernAsyncTask.class) {
            try {
                if (f114396o == null) {
                    f114396o = new f();
                }
                fVar = f114396o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void w(Executor executor) {
        f114397p = executor;
    }

    public final boolean a(boolean z10) {
        this.f114401d.set(true);
        return this.f114399b.cancel(z10);
    }

    public abstract Result b(Params... paramsArr);

    public final ModernAsyncTask<Params, Progress, Result> c(Params... paramsArr) {
        e(f114397p, paramsArr);
        return this;
    }

    public final ModernAsyncTask<Params, Progress, Result> e(Executor executor, Params... paramsArr) {
        if (this.f114400c == Status.PENDING) {
            this.f114400c = Status.RUNNING;
            this.f114398a.f114409a = paramsArr;
            executor.execute(this.f114399b);
            return this;
        }
        int i10 = d.f114406a[this.f114400c.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    public void f(Result result) {
        if (this.f114401d.get()) {
            n(result);
        } else {
            o(result);
        }
        this.f114400c = Status.FINISHED;
    }

    public final Result g() throws ExecutionException, InterruptedException {
        return this.f114399b.get();
    }

    public final Result h(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f114399b.get(j10, timeUnit);
    }

    public final Status j() {
        return this.f114400c;
    }

    public final boolean k() {
        return this.f114401d.get();
    }

    public void m() {
    }

    public void n(Result result) {
    }

    public void o(Result result) {
    }

    public void q() {
    }

    public void s(Progress... progressArr) {
    }

    public Result t(Result result) {
        i().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    public void u(Result result) {
        if (this.f114402e.get()) {
            return;
        }
        t(result);
    }

    public final void v(Progress... progressArr) {
        if (this.f114401d.get()) {
            return;
        }
        i().obtainMessage(2, new e(this, progressArr)).sendToTarget();
    }
}
