package wb;

import androidx.annotation.NonNull;
import bolts.CancellationToken;
import bolts.CancellationTokenSource;
import bolts.Continuation;
import bolts.ExecutorException;
import bolts.Task;
import bolts.TaskCompletionSource;
import com.prism.gaia.server.content.j;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import ub.InterfaceC5664b;
import ub.InterfaceC5665c;
import vb.C5724e;

/* JADX INFO: renamed from: wb.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractCallableC5772a<T> implements Callable<T> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f240176o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f240177p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f240178q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f240179r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f240180s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f240181t = 3;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f240182u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f240183v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f240184w = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f240186b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Task<T> f240188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CancellationTokenSource f240189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f240190f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f240193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Executor f240194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Executor f240195k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f240191g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f240192h = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Set<InterfaceC5665c<T>> f240196l = new HashSet(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Set<InterfaceC5664b> f240197m = new HashSet(2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Set<ub.d> f240198n = new HashSet(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wb.e f240187c = wb.e.d();

    /* JADX INFO: renamed from: wb.a$a, reason: collision with other inner class name */
    public class C0902a implements Continuation<T, Task<Void>> {

        /* JADX INFO: renamed from: wb.a$a$a, reason: collision with other inner class name */
        public class CallableC0903a implements Callable<Void> {
            public CallableC0903a() {
            }

            public Void a() throws Exception {
                try {
                    AbstractCallableC5772a.this.G();
                    return null;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    throw new Error(e10);
                }
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Void call() throws Exception {
                a();
                return null;
            }
        }

        /* JADX INFO: renamed from: wb.a$a$b */
        public class b implements Callable<Void> {
            public b() {
            }

            public Void a() throws Exception {
                try {
                    AbstractCallableC5772a.this.J();
                    return null;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    throw new Error(e10);
                }
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Void call() throws Exception {
                a();
                return null;
            }
        }

        public C0902a() {
        }

        @Override // bolts.Continuation
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> then(Task<T> task) throws Exception {
            if (task.isFaulted() || task.isCancelled()) {
                AbstractCallableC5772a abstractCallableC5772a = AbstractCallableC5772a.this;
                Executor executor = abstractCallableC5772a.f240194j;
                if (executor != null) {
                    return Task.call(new CallableC0903a(), executor);
                }
                try {
                    abstractCallableC5772a.G();
                    return null;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    throw new Error(e10);
                }
            }
            AbstractCallableC5772a abstractCallableC5772a2 = AbstractCallableC5772a.this;
            Executor executor2 = abstractCallableC5772a2.f240194j;
            if (executor2 != null) {
                return Task.call(new b(), executor2);
            }
            try {
                abstractCallableC5772a2.J();
                return null;
            } catch (Exception e11) {
                e11.printStackTrace();
                throw new Error(e11);
            }
        }
    }

    /* JADX INFO: renamed from: wb.a$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f240202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f240203b;

        public b(long j10, long j11) {
            this.f240202a = j10;
            this.f240203b = j11;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList(AbstractCallableC5772a.this.f240197m);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((InterfaceC5664b) obj).onProgress(this.f240202a, this.f240203b);
            }
        }
    }

    /* JADX INFO: renamed from: wb.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList(AbstractCallableC5772a.this.f240198n);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                AbstractCallableC5772a abstractCallableC5772a = AbstractCallableC5772a.this;
                ((ub.d) obj).onStateChanged(abstractCallableC5772a.f240185a, abstractCallableC5772a.f240190f);
            }
        }
    }

    /* JADX INFO: renamed from: wb.a$d */
    public static class d<TResult> implements Runnable, Comparable<Runnable> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static AtomicInteger f240206f = new AtomicInteger(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TaskCompletionSource<TResult> f240207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CancellationToken f240208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Callable<TResult> f240209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f240210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f240211e = f240206f.addAndGet(1);

        public d(TaskCompletionSource<TResult> taskCompletionSource, CancellationToken cancellationToken, Callable<TResult> callable, int i10) {
            this.f240207a = taskCompletionSource;
            this.f240208b = cancellationToken;
            this.f240209c = callable;
            this.f240210d = i10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NonNull Runnable runnable) {
            if (!(runnable instanceof d)) {
                return 0;
            }
            d dVar = (d) runnable;
            int i10 = dVar.f240210d - this.f240210d;
            return i10 != 0 ? i10 : this.f240211e - dVar.f240211e;
        }

        @Override // java.lang.Runnable
        public void run() {
            CancellationToken cancellationToken = this.f240208b;
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                this.f240207a.setCancelled();
                return;
            }
            try {
                this.f240207a.setResult(this.f240209c.call());
            } catch (CancellationException unused) {
                this.f240207a.setCancelled();
            } catch (Exception e10) {
                this.f240207a.setError(e10);
            }
        }
    }

    /* JADX INFO: renamed from: wb.a$e */
    public interface e {
        int onWeight();
    }

    public AbstractCallableC5772a(String str, Object obj) {
        this.f240185a = str;
        this.f240186b = obj;
    }

    public static <TResult> Task<TResult> l(Callable<TResult> callable, Executor executor, CancellationToken cancellationToken, int i10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            executor.execute(new d(taskCompletionSource, cancellationToken, callable, i10));
        } catch (Exception e10) {
            taskCompletionSource.setError(new ExecutorException(e10));
        }
        return taskCompletionSource.getTask();
    }

    public int A() {
        e eVar = this.f240193i;
        if (eVar != null) {
            return eVar.onWeight();
        }
        return 0;
    }

    public final boolean B() {
        CancellationTokenSource cancellationTokenSource = this.f240189e;
        return cancellationTokenSource != null && cancellationTokenSource.isCancellationRequested();
    }

    public final boolean C() {
        return y() == 3;
    }

    public boolean D() {
        return this.f240192h;
    }

    public final boolean E() {
        return y() == 2;
    }

    public final AbstractCallableC5772a<T> F(Executor executor) {
        this.f240194j = executor;
        return this;
    }

    public void G() {
        Throwable thV = v();
        if (thV == null || this.f240196l.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f240196l);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            InterfaceC5665c interfaceC5665c = (InterfaceC5665c) obj;
            if (thV instanceof QCloudClientException) {
                interfaceC5665c.onFailure((QCloudClientException) thV, null);
            } else if (thV instanceof QCloudServiceException) {
                interfaceC5665c.onFailure(null, (QCloudServiceException) thV);
            } else {
                interfaceC5665c.onFailure(new QCloudClientException(thV.getCause() == null ? thV : thV.getCause()), null);
            }
        }
    }

    public void H(long j10, long j11) {
        if (this.f240197m.size() > 0) {
            p(new b(j10, j11));
        }
    }

    public void I(int i10) {
        R(i10);
        if (this.f240198n.size() > 0) {
            p(new c());
        }
    }

    public void J() {
        if (this.f240196l.size() > 0) {
            ArrayList arrayList = new ArrayList(this.f240196l);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((InterfaceC5665c) obj).onSuccess(x());
            }
        }
    }

    public final void K() {
        this.f240196l.clear();
        this.f240197m.clear();
    }

    public final AbstractCallableC5772a<T> L(InterfaceC5664b interfaceC5664b) {
        if (interfaceC5664b != null) {
            this.f240197m.remove(interfaceC5664b);
        }
        return this;
    }

    public final AbstractCallableC5772a<T> M(InterfaceC5665c<T> interfaceC5665c) {
        if (interfaceC5665c != null) {
            this.f240196l.remove(interfaceC5665c);
        }
        return this;
    }

    public final AbstractCallableC5772a<T> N(ub.d dVar) {
        if (dVar != null) {
            this.f240198n.remove(dVar);
        }
        return this;
    }

    public AbstractCallableC5772a<T> O(Executor executor, CancellationTokenSource cancellationTokenSource) {
        return P(executor, cancellationTokenSource, 2);
    }

    public AbstractCallableC5772a<T> P(Executor executor, CancellationTokenSource cancellationTokenSource, int i10) {
        this.f240187c.a(this);
        I(1);
        this.f240195k = executor;
        this.f240189e = cancellationTokenSource;
        if (i10 <= 0) {
            i10 = 2;
        }
        Task<T> taskL = l(this, executor, cancellationTokenSource != null ? cancellationTokenSource.getToken() : null, i10);
        this.f240188d = taskL;
        taskL.continueWithTask(new C0902a());
        return this;
    }

    public void Q(e eVar) {
        this.f240193i = eVar;
    }

    public final synchronized void R(int i10) {
        this.f240190f = i10;
    }

    public void S(boolean z10) {
        this.f240192h = z10;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        try {
            C5724e.b(wb.e.f240235b, "[Task] %s start testExecute", this.f240185a);
            I(2);
            T tO = o();
            C5724e.b(wb.e.f240235b, "[Task] %s complete", this.f240185a);
            I(3);
            this.f240187c.e(this);
            return tO;
        } catch (Throwable th) {
            C5724e.b(wb.e.f240235b, "[Task] %s complete", this.f240185a);
            I(3);
            this.f240187c.e(this);
            throw th;
        }
    }

    public final AbstractCallableC5772a<T> f(InterfaceC5664b interfaceC5664b) {
        if (interfaceC5664b != null) {
            this.f240197m.add(interfaceC5664b);
        }
        return this;
    }

    public final AbstractCallableC5772a<T> g(List<InterfaceC5664b> list) {
        if (list != null) {
            this.f240197m.addAll(list);
        }
        return this;
    }

    public final AbstractCallableC5772a<T> h(InterfaceC5665c<T> interfaceC5665c) {
        if (interfaceC5665c != null) {
            this.f240196l.add(interfaceC5665c);
        }
        return this;
    }

    public final AbstractCallableC5772a<T> i(List<InterfaceC5665c<T>> list) {
        if (list != null) {
            this.f240196l.addAll(list);
        }
        return this;
    }

    public final AbstractCallableC5772a<T> j(ub.d dVar) {
        if (dVar != null) {
            this.f240198n.add(dVar);
        }
        return this;
    }

    public final AbstractCallableC5772a<T> k(List<ub.d> list) {
        if (list != null) {
            this.f240198n.addAll(list);
        }
        return this;
    }

    public void m() {
        C5724e.b(wb.e.f240235b, "[Call] %s cancel", this);
        CancellationTokenSource cancellationTokenSource = this.f240189e;
        if (cancellationTokenSource != null) {
            cancellationTokenSource.cancel();
        }
    }

    public final Task<T> n() {
        return this.f240188d;
    }

    public abstract T o() throws QCloudServiceException, QCloudClientException;

    public final void p(Runnable runnable) {
        Executor executor = this.f240194j;
        if (executor != null) {
            executor.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public final T q() throws QCloudServiceException, QCloudClientException {
        r();
        Exception excV = v();
        if (excV == null) {
            return x();
        }
        if (excV instanceof QCloudClientException) {
            throw ((QCloudClientException) excV);
        }
        if (excV instanceof QCloudServiceException) {
            throw ((QCloudServiceException) excV);
        }
        throw new QCloudClientException(excV);
    }

    public final void r() {
        this.f240187c.a(this);
        I(1);
        this.f240188d = Task.call(this);
    }

    public final List<InterfaceC5664b> s() {
        return new ArrayList(this.f240197m);
    }

    public final List<InterfaceC5665c<T>> t() {
        return new ArrayList(this.f240196l);
    }

    public final List<ub.d> u() {
        return new ArrayList(this.f240198n);
    }

    public Exception v() {
        if (this.f240188d.isFaulted()) {
            return this.f240188d.getError();
        }
        if (this.f240188d.isCancelled()) {
            return new QCloudClientException(j.f167256W);
        }
        return null;
    }

    public final String w() {
        return this.f240185a;
    }

    public T x() {
        return this.f240188d.getResult();
    }

    public final synchronized int y() {
        return this.f240190f;
    }

    public final Object z() {
        return this.f240186b;
    }
}
