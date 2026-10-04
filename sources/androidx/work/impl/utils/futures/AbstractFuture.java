package androidx.work.impl.utils.futures;

import C4.q;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.changelist.j;
import androidx.compose.runtime.snapshots.z;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class AbstractFuture<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f120515d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f120516e = Logger.getLogger(AbstractFuture.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f120517f = 1000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f120518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f120519h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public volatile Object f120520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public volatile d f120521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public volatile h f120522c;

    public static final class Failure {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Failure f120523b = new Failure(new AnonymousClass1("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f120524a;

        /* JADX INFO: renamed from: androidx.work.impl.utils.futures.AbstractFuture$Failure$1, reason: invalid class name */
        public class AnonymousClass1 extends Throwable {
            public AnonymousClass1(String message) {
                super(message);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public Failure(Throwable exception) {
            AbstractFuture.d(exception);
            this.f120524a = exception;
        }
    }

    public static abstract class b {
        public b() {
        }

        public abstract boolean a(AbstractFuture<?> future, d expect, d update);

        public abstract boolean b(AbstractFuture<?> future, Object expect, Object update);

        public abstract boolean c(AbstractFuture<?> future, h expect, h update);

        public abstract void d(h waiter, h newValue);

        public abstract void e(h waiter, Thread newValue);

        public b(a aVar) {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f120525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f120526d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f120527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Throwable f120528b;

        static {
            if (AbstractFuture.f120515d) {
                f120526d = null;
                f120525c = null;
            } else {
                f120526d = new c(false, null);
                f120525c = new c(true, null);
            }
        }

        public c(boolean wasInterrupted, @Nullable Throwable cause) {
            this.f120527a = wasInterrupted;
            this.f120528b = cause;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f120529d = new d(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f120530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f120531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public d f120532c;

        public d(Runnable task, Executor executor) {
            this.f120530a = task;
            this.f120531b = executor;
        }
    }

    public static final class e extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f120533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f120534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, h> f120535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, d> f120536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> f120537e;

        public e(AtomicReferenceFieldUpdater<h, Thread> waiterThreadUpdater, AtomicReferenceFieldUpdater<h, h> waiterNextUpdater, AtomicReferenceFieldUpdater<AbstractFuture, h> waitersUpdater, AtomicReferenceFieldUpdater<AbstractFuture, d> listenersUpdater, AtomicReferenceFieldUpdater<AbstractFuture, Object> valueUpdater) {
            this.f120533a = waiterThreadUpdater;
            this.f120534b = waiterNextUpdater;
            this.f120535c = waitersUpdater;
            this.f120536d = listenersUpdater;
            this.f120537e = valueUpdater;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public boolean a(AbstractFuture<?> future, d expect, d update) {
            return androidx.concurrent.futures.c.a(this.f120536d, future, expect, update);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public boolean b(AbstractFuture<?> future, Object expect, Object update) {
            return androidx.concurrent.futures.c.a(this.f120537e, future, expect, update);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public boolean c(AbstractFuture<?> future, h expect, h update) {
            return androidx.concurrent.futures.c.a(this.f120535c, future, expect, update);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public void d(h waiter, h newValue) {
            this.f120534b.lazySet(waiter, newValue);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public void e(h waiter, Thread newValue) {
            this.f120533a.lazySet(waiter, newValue);
        }
    }

    public static final class f<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractFuture<V> f120538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ListenableFuture<? extends V> f120539b;

        public f(AbstractFuture<V> owner, ListenableFuture<? extends V> future) {
            this.f120538a = owner;
            this.f120539b = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f120538a.f120520a != this) {
                return;
            }
            if (AbstractFuture.f120518g.b(this.f120538a, this, AbstractFuture.i(this.f120539b))) {
                AbstractFuture.f(this.f120538a);
            }
        }
    }

    public static final class g extends b {
        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public boolean a(AbstractFuture<?> future, d expect, d update) {
            synchronized (future) {
                try {
                    if (future.f120521b != expect) {
                        return false;
                    }
                    future.f120521b = update;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public boolean b(AbstractFuture<?> future, Object expect, Object update) {
            synchronized (future) {
                try {
                    if (future.f120520a != expect) {
                        return false;
                    }
                    future.f120520a = update;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public boolean c(AbstractFuture<?> future, h expect, h update) {
            synchronized (future) {
                try {
                    if (future.f120522c != expect) {
                        return false;
                    }
                    future.f120522c = update;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public void d(h waiter, h newValue) {
            waiter.f120542b = newValue;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public void e(h waiter, Thread newValue) {
            waiter.f120541a = newValue;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f120540c = new h();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public volatile Thread f120541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public volatile h f120542b;

        public h(boolean unused) {
        }

        public void a(h next) {
            AbstractFuture.f120518g.d(this, next);
        }

        public void b() {
            Thread thread = this.f120541a;
            if (thread != null) {
                this.f120541a = null;
                LockSupport.unpark(thread);
            }
        }

        public h() {
            AbstractFuture.f120518g.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, h.class, a7.c.f84756a), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, d.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f120518g = gVar;
        if (th != null) {
            f120516e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f120519h = new Object();
    }

    private void a(StringBuilder builder) {
        try {
            Object objJ = j(this);
            builder.append("SUCCESS, result=[");
            builder.append(s(objJ));
            builder.append("]");
        } catch (CancellationException unused) {
            builder.append("CANCELLED");
        } catch (RuntimeException e10) {
            builder.append("UNKNOWN, cause=[");
            builder.append(e10.getClass());
            builder.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            builder.append("FAILURE, cause=[");
            builder.append(e11.getCause());
            builder.append("]");
        }
    }

    private static CancellationException c(@Nullable String message, @Nullable Throwable cause) {
        CancellationException cancellationException = new CancellationException(message);
        cancellationException.initCause(cause);
        return cancellationException;
    }

    @NonNull
    public static <T> T d(@Nullable T reference) {
        reference.getClass();
        return reference;
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
    public static void f(AbstractFuture<?> abstractFuture) {
        d dVar = null;
        while (true) {
            abstractFuture.n();
            d dVarE = abstractFuture.e(dVar);
            while (dVarE != null) {
                dVar = dVarE.f120532c;
                Runnable runnable = dVarE.f120530a;
                if (runnable instanceof f) {
                    f fVar = (f) runnable;
                    abstractFuture = fVar.f120538a;
                    if (abstractFuture.f120520a == fVar) {
                        if (f120518g.b(abstractFuture, fVar, i(fVar.f120539b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, dVarE.f120531b);
                }
                dVarE = dVar;
            }
            return;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f120516e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f120528b);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f120524a);
        }
        if (obj == f120519h) {
            return null;
        }
        return obj;
    }

    public static Object i(ListenableFuture<?> future) {
        if (future instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) future).f120520a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f120527a ? cVar.f120528b != null ? new c(false, cVar.f120528b) : c.f120526d : obj;
        }
        boolean zIsCancelled = future.isCancelled();
        if ((!f120515d) && zIsCancelled) {
            return c.f120526d;
        }
        try {
            Object objJ = j(future);
            return objJ == null ? f120519h : objJ;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + future, e10));
        } catch (ExecutionException e11) {
            return new Failure(e11.getCause());
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    private static <V> V j(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    private void n() {
        h hVar;
        do {
            hVar = this.f120522c;
        } while (!f120518g.c(this, hVar, h.f120540c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f120542b;
        }
    }

    private String s(Object o10) {
        return o10 == this ? "this future" : String.valueOf(o10);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable listener, Executor executor) {
        listener.getClass();
        executor.getClass();
        d dVar = this.f120521b;
        if (dVar != d.f120529d) {
            d dVar2 = new d(listener, executor);
            do {
                dVar2.f120532c = dVar;
                if (f120518g.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.f120521b;
                }
            } while (dVar != d.f120529d);
        }
        g(listener, executor);
    }

    public void b() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f120520a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.f
            r3 = r3 | r4
            if (r3 == 0) goto L5b
            boolean r3 = androidx.work.impl.utils.futures.AbstractFuture.f120515d
            if (r3 == 0) goto L1f
            androidx.work.impl.utils.futures.AbstractFuture$c r3 = new androidx.work.impl.utils.futures.AbstractFuture$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            androidx.work.impl.utils.futures.AbstractFuture$c r3 = androidx.work.impl.utils.futures.AbstractFuture.c.f120525c
            goto L26
        L24:
            androidx.work.impl.utils.futures.AbstractFuture$c r3 = androidx.work.impl.utils.futures.AbstractFuture.c.f120526d
        L26:
            r4 = r7
            r5 = r2
        L28:
            androidx.work.impl.utils.futures.AbstractFuture$b r6 = androidx.work.impl.utils.futures.AbstractFuture.f120518g
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L54
            f(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.f
            if (r4 == 0) goto L53
            androidx.work.impl.utils.futures.AbstractFuture$f r0 = (androidx.work.impl.utils.futures.AbstractFuture.f) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.f120539b
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture
            if (r4 == 0) goto L50
            r4 = r0
            androidx.work.impl.utils.futures.AbstractFuture r4 = (androidx.work.impl.utils.futures.AbstractFuture) r4
            java.lang.Object r0 = r4.f120520a
            if (r0 != 0) goto L48
            r5 = r1
            goto L49
        L48:
            r5 = r2
        L49:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.f
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r1
            goto L28
        L50:
            r0.cancel(r8)
        L53:
            return r1
        L54:
            java.lang.Object r0 = r4.f120520a
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.f
            if (r6 != 0) goto L28
            return r5
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.cancel(boolean):boolean");
    }

    public final d e(d onto) {
        d dVar;
        do {
            dVar = this.f120521b;
        } while (!f120518g.a(this, dVar, d.f120529d));
        d dVar2 = onto;
        d dVar3 = dVar;
        while (dVar3 != null) {
            d dVar4 = dVar3.f120532c;
            dVar3.f120532c = dVar2;
            dVar2 = dVar3;
            dVar3 = dVar4;
        }
        return dVar2;
    }

    @Override // java.util.concurrent.Future
    public final V get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = unit.toNanos(timeout);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f120520a;
        if ((obj != null) && (!(obj instanceof f))) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f120522c;
            if (hVar != h.f120540c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f120518g.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f120520a;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(hVar2);
                    } else {
                        hVar = this.f120522c;
                    }
                } while (hVar != h.f120540c);
            }
            return h(this.f120520a);
        }
        while (nanos > 0) {
            Object obj3 = this.f120520a;
            if ((obj3 != null) && (!(obj3 instanceof f))) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = unit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbA = z.a("Waited ", timeout, q.f17581a);
        sbA.append(unit.toString().toLowerCase(locale));
        String string3 = sbA.toString();
        if (nanos + 1000 < 0) {
            String strA = j.a(string3, " (plus ");
            long j10 = -nanos;
            long jConvert = unit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - unit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strA2 = strA + jConvert + q.f17581a + lowerCase;
                if (z10) {
                    strA2 = j.a(strA2, ",");
                }
                strA = j.a(strA2, q.f17581a);
            }
            if (z10) {
                strA = strA + nanos2 + " nanoseconds ";
            }
            string3 = j.a(strA, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(j.a(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(androidx.concurrent.futures.a.a(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f120520a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f120520a != null);
    }

    public void k() {
    }

    public final void l(@Nullable Future<?> related) {
        if ((related != null) && (this.f120520a instanceof c)) {
            related.cancel(t());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public String m() {
        Object obj = this.f120520a;
        if (obj instanceof f) {
            return android.support.v4.media.e.a(new StringBuilder("setFuture=["), s(((f) obj).f120539b), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void o(h node) {
        node.f120541a = null;
        while (true) {
            h hVar = this.f120522c;
            if (hVar == h.f120540c) {
                return;
            }
            h hVar2 = null;
            while (hVar != null) {
                h hVar3 = hVar.f120542b;
                if (hVar.f120541a != null) {
                    hVar2 = hVar;
                } else if (hVar2 != null) {
                    hVar2.f120542b = hVar3;
                    if (hVar2.f120541a == null) {
                        break;
                    }
                } else if (!f120518g.c(this, hVar, hVar3)) {
                    break;
                }
                hVar = hVar3;
            }
            return;
        }
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
    public boolean p(@Nullable V v10) {
        if (v10 == null) {
            v10 = (V) f120519h;
        }
        if (!f120518g.b(this, null, v10)) {
            return false;
        }
        f(this);
        return true;
    }

    public boolean q(Throwable throwable) {
        throwable.getClass();
        if (!f120518g.b(this, null, new Failure(throwable))) {
            return false;
        }
        f(this);
        return true;
    }

    public boolean r(ListenableFuture<? extends V> future) {
        Failure failure;
        future.getClass();
        Object obj = this.f120520a;
        if (obj == null) {
            if (future.isDone()) {
                if (!f120518g.b(this, null, i(future))) {
                    return false;
                }
                f(this);
                return true;
            }
            f fVar = new f(this, future);
            if (f120518g.b(this, null, fVar)) {
                try {
                    future.addListener(fVar, DirectExecutor.INSTANCE);
                } catch (Throwable th) {
                    try {
                        failure = new Failure(th);
                    } catch (Throwable unused) {
                        failure = Failure.f120523b;
                    }
                    f120518g.b(this, fVar, failure);
                }
                return true;
            }
            obj = this.f120520a;
        }
        if (obj instanceof c) {
            future.cancel(((c) obj).f120527a);
        }
        return false;
    }

    public final boolean t() {
        Object obj = this.f120520a;
        return (obj instanceof c) && ((c) obj).f120527a;
    }

    public String toString() {
        String strM;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f120520a instanceof c) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strM = m();
            } catch (RuntimeException e10) {
                strM = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strM != null && !strM.isEmpty()) {
                androidx.concurrent.futures.b.a(sb2, "PENDING, info=[", strM, "]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f120520a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return h(obj2);
            }
            h hVar = this.f120522c;
            if (hVar != h.f120540c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f120518g.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f120520a;
                            } else {
                                o(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return h(obj);
                    }
                    hVar = this.f120522c;
                } while (hVar != h.f120540c);
            }
            return h(this.f120520a);
        }
        throw new InterruptedException();
    }
}
