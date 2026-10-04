package Ed;

import Bd.f;
import com.prism.gaia.server.content.j;
import ed.InterfaceC4376a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.L0;
import kotlin.collections.U;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d f33881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f33882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Ed.a f33884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<Ed.a> f33885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33886f;

    public static final class a extends Ed.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final CountDownLatch f33887e;

        public a() {
            super(G.C(f.f17499i, " awaitIdle"), false);
            this.f33887e = new CountDownLatch(1);
        }

        @Override // Ed.a
        public long f() {
            this.f33887e.countDown();
            return -1L;
        }

        @NotNull
        public final CountDownLatch i() {
            return this.f33887e;
        }
    }

    public static final class b extends Ed.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f33888e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f33889f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4376a<L0> f33890g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, boolean z10, InterfaceC4376a<L0> interfaceC4376a) {
            super(str, z10);
            this.f33888e = str;
            this.f33889f = z10;
            this.f33890g = interfaceC4376a;
        }

        @Override // Ed.a
        public long f() {
            this.f33890g.invoke();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: Ed.c$c, reason: collision with other inner class name */
    public static final class C0027c extends Ed.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f33891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4376a<Long> f33892f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0027c(String str, InterfaceC4376a<Long> interfaceC4376a) {
            super(str, false, 2, null);
            this.f33891e = str;
            this.f33892f = interfaceC4376a;
        }

        @Override // Ed.a
        public long f() {
            return this.f33892f.invoke().longValue();
        }
    }

    public c(@NotNull d taskRunner, @NotNull String name) {
        G.p(taskRunner, "taskRunner");
        G.p(name, "name");
        this.f33881a = taskRunner;
        this.f33882b = name;
        this.f33885e = new ArrayList();
    }

    public static /* synthetic */ void d(c cVar, String name, long j10, boolean z10, InterfaceC4376a block, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        G.p(name, "name");
        G.p(block, "block");
        cVar.m(new b(name, z10, block), j10);
    }

    public static /* synthetic */ void o(c cVar, Ed.a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        cVar.m(aVar, j10);
    }

    public static /* synthetic */ void p(c cVar, String name, long j10, InterfaceC4376a block, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        G.p(name, "name");
        G.p(block, "block");
        cVar.m(new C0027c(name, block), j10);
    }

    public final void a() {
        if (f.f17498h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f33881a) {
            if (b()) {
                this.f33881a.i(this);
            }
        }
    }

    public final boolean b() {
        Ed.a aVar = this.f33884d;
        if (aVar != null) {
            G.m(aVar);
            if (aVar.f33878b) {
                this.f33886f = true;
            }
        }
        int size = this.f33885e.size() - 1;
        boolean z10 = false;
        if (size < 0) {
            return false;
        }
        while (true) {
            int i10 = size - 1;
            if (this.f33885e.get(size).f33878b) {
                Ed.a aVar2 = this.f33885e.get(size);
                d.f33893h.getClass();
                if (d.f33895j.isLoggable(Level.FINE)) {
                    Ed.b.c(aVar2, this, j.f167256W);
                }
                this.f33885e.remove(size);
                z10 = true;
            }
            if (i10 < 0) {
                return z10;
            }
            size = i10;
        }
    }

    public final void c(@NotNull String name, long j10, boolean z10, @NotNull InterfaceC4376a<L0> block) {
        G.p(name, "name");
        G.p(block, "block");
        m(new b(name, z10, block), j10);
    }

    @Nullable
    public final Ed.a e() {
        return this.f33884d;
    }

    public final boolean f() {
        return this.f33886f;
    }

    @NotNull
    public final List<Ed.a> g() {
        return this.f33885e;
    }

    @NotNull
    public final String h() {
        return this.f33882b;
    }

    @NotNull
    public final List<Ed.a> i() {
        List<Ed.a> listA6;
        synchronized (this.f33881a) {
            listA6 = U.a6(this.f33885e);
        }
        return listA6;
    }

    public final boolean j() {
        return this.f33883c;
    }

    @NotNull
    public final d k() {
        return this.f33881a;
    }

    @NotNull
    public final CountDownLatch l() {
        synchronized (this.f33881a) {
            if (this.f33884d == null && this.f33885e.isEmpty()) {
                return new CountDownLatch(0);
            }
            Ed.a aVar = this.f33884d;
            if (aVar instanceof a) {
                return ((a) aVar).f33887e;
            }
            for (Ed.a aVar2 : this.f33885e) {
                if (aVar2 instanceof a) {
                    return ((a) aVar2).f33887e;
                }
            }
            a aVar3 = new a();
            if (q(aVar3, 0L, false)) {
                this.f33881a.i(this);
            }
            return aVar3.f33887e;
        }
    }

    public final void m(@NotNull Ed.a task, long j10) {
        G.p(task, "task");
        synchronized (this.f33881a) {
            if (!this.f33883c) {
                if (q(task, j10, false)) {
                    this.f33881a.i(this);
                }
            } else if (task.f33878b) {
                d.f33893h.getClass();
                if (d.f33895j.isLoggable(Level.FINE)) {
                    Ed.b.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                d.f33893h.getClass();
                if (d.f33895j.isLoggable(Level.FINE)) {
                    Ed.b.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final void n(@NotNull String name, long j10, @NotNull InterfaceC4376a<Long> block) {
        G.p(name, "name");
        G.p(block, "block");
        m(new C0027c(name, block), j10);
    }

    public final boolean q(@NotNull Ed.a task, long j10, boolean z10) {
        G.p(task, "task");
        task.e(this);
        long jNanoTime = this.f33881a.f33896a.nanoTime();
        long j11 = jNanoTime + j10;
        int iIndexOf = this.f33885e.indexOf(task);
        if (iIndexOf != -1) {
            if (task.f33880d <= j11) {
                d.f33893h.getClass();
                if (d.f33895j.isLoggable(Level.FINE)) {
                    Ed.b.c(task, this, "already scheduled");
                }
                return false;
            }
            this.f33885e.remove(iIndexOf);
        }
        task.f33880d = j11;
        d.f33893h.getClass();
        if (d.f33895j.isLoggable(Level.FINE)) {
            Ed.b.c(task, this, z10 ? G.C("run again after ", Ed.b.b(j11 - jNanoTime)) : G.C("scheduled after ", Ed.b.b(j11 - jNanoTime)));
        }
        Iterator<Ed.a> it = this.f33885e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().f33880d - jNanoTime > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f33885e.size();
        }
        this.f33885e.add(size, task);
        return size == 0;
    }

    public final void r(@Nullable Ed.a aVar) {
        this.f33884d = aVar;
    }

    public final void s(boolean z10) {
        this.f33886f = z10;
    }

    public final void t(boolean z10) {
        this.f33883c = z10;
    }

    @NotNull
    public String toString() {
        return this.f33882b;
    }

    public final void u() {
        if (f.f17498h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f33881a) {
            this.f33883c = true;
            if (b()) {
                this.f33881a.i(this);
            }
        }
    }
}
