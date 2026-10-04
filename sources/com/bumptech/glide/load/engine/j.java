package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.s;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.load.engine.n;
import e.InterfaceC4326A;
import e.f0;
import g3.InterfaceC4444b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import y3.C5817f;
import z3.AbstractC5855c;
import z3.C5853a;

/* JADX INFO: loaded from: classes2.dex */
public class j<R> implements DecodeJob.b<R>, C5853a.f {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c f139702z = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f139703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5855c f139704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n.a f139705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s.a<j<?>> f139706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f139707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f139708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GlideExecutor f139709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GlideExecutor f139710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GlideExecutor f139711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final GlideExecutor f139712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f139713k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC4444b f139714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f139715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f139716n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f139717o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f139718p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public s<?> f139719q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DataSource f139720r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f139721s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GlideException f139722t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f139723u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n<?> f139724v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public DecodeJob<R> f139725w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile boolean f139726x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f139727y;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.request.i f139728a;

        public a(com.bumptech.glide.request.i iVar) {
            this.f139728a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f139728a.h()) {
                synchronized (j.this) {
                    try {
                        if (j.this.f139703a.c(this.f139728a)) {
                            j.this.f(this.f139728a);
                        }
                        j.this.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.request.i f139730a;

        public b(com.bumptech.glide.request.i iVar) {
            this.f139730a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f139730a.h()) {
                synchronized (j.this) {
                    try {
                        if (j.this.f139703a.c(this.f139730a)) {
                            j.this.f139724v.c();
                            j.this.g(this.f139730a);
                            j.this.s(this.f139730a);
                        }
                        j.this.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @f0
    public static class c {
        public <R> n<R> a(s<R> sVar, boolean z10, InterfaceC4444b interfaceC4444b, n.a aVar) {
            return new n<>(sVar, z10, true, interfaceC4444b, aVar);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.request.i f139732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f139733b;

        public d(com.bumptech.glide.request.i iVar, Executor executor) {
            this.f139732a = iVar;
            this.f139733b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f139732a.equals(((d) obj).f139732a);
            }
            return false;
        }

        public int hashCode() {
            return this.f139732a.hashCode();
        }
    }

    public static final class e implements Iterable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<d> f139734a;

        public e() {
            this(new ArrayList(2));
        }

        public static d h(com.bumptech.glide.request.i iVar) {
            return new d(iVar, C5817f.f241065b);
        }

        public void b(com.bumptech.glide.request.i iVar, Executor executor) {
            this.f139734a.add(new d(iVar, executor));
        }

        public boolean c(com.bumptech.glide.request.i iVar) {
            return this.f139734a.contains(h(iVar));
        }

        public void clear() {
            this.f139734a.clear();
        }

        public e g() {
            return new e(new ArrayList(this.f139734a));
        }

        public void i(com.bumptech.glide.request.i iVar) {
            this.f139734a.remove(h(iVar));
        }

        public boolean isEmpty() {
            return this.f139734a.isEmpty();
        }

        @Override // java.lang.Iterable
        @NonNull
        public Iterator<d> iterator() {
            return this.f139734a.iterator();
        }

        public int size() {
            return this.f139734a.size();
        }

        public e(List<d> list) {
            this.f139734a = list;
        }
    }

    public j(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, k kVar, n.a aVar, s.a<j<?>> aVar2) {
        this(glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, kVar, aVar, aVar2, f139702z);
    }

    private synchronized void r() {
        if (this.f139714l == null) {
            throw new IllegalArgumentException();
        }
        this.f139703a.clear();
        this.f139714l = null;
        this.f139724v = null;
        this.f139719q = null;
        this.f139723u = false;
        this.f139726x = false;
        this.f139721s = false;
        this.f139727y = false;
        this.f139725w.D(false);
        this.f139725w = null;
        this.f139722t = null;
        this.f139720r = null;
        this.f139706d.b(this);
    }

    public synchronized void a(com.bumptech.glide.request.i iVar, Executor executor) {
        try {
            this.f139704b.c();
            this.f139703a.b(iVar, executor);
            if (this.f139721s) {
                k(1);
                executor.execute(new b(iVar));
            } else if (this.f139723u) {
                k(1);
                executor.execute(new a(iVar));
            } else {
                y3.m.b(!this.f139726x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.b
    public void b(GlideException glideException) {
        synchronized (this) {
            this.f139722t = glideException;
        }
        o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.DecodeJob.b
    public void c(s<R> sVar, DataSource dataSource, boolean z10) {
        synchronized (this) {
            this.f139719q = sVar;
            this.f139720r = dataSource;
            this.f139727y = z10;
        }
        p();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.b
    public void d(DecodeJob<?> decodeJob) {
        j().execute(decodeJob);
    }

    @Override // z3.C5853a.f
    @NonNull
    public AbstractC5855c e() {
        return this.f139704b;
    }

    @InterfaceC4326A("this")
    public void f(com.bumptech.glide.request.i iVar) {
        try {
            iVar.b(this.f139722t);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    @InterfaceC4326A("this")
    public void g(com.bumptech.glide.request.i iVar) {
        try {
            iVar.c(this.f139724v, this.f139720r, this.f139727y);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    public void h() {
        if (n()) {
            return;
        }
        this.f139726x = true;
        this.f139725w.b();
        this.f139708f.b(this, this.f139714l);
    }

    public void i() {
        n<?> nVar;
        synchronized (this) {
            try {
                this.f139704b.c();
                y3.m.b(n(), "Not yet complete!");
                int iDecrementAndGet = this.f139713k.decrementAndGet();
                y3.m.b(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    nVar = this.f139724v;
                    r();
                } else {
                    nVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (nVar != null) {
            nVar.f();
        }
    }

    public final GlideExecutor j() {
        return this.f139716n ? this.f139711i : this.f139717o ? this.f139712j : this.f139710h;
    }

    public synchronized void k(int i10) {
        n<?> nVar;
        y3.m.b(n(), "Not yet complete!");
        if (this.f139713k.getAndAdd(i10) == 0 && (nVar = this.f139724v) != null) {
            nVar.c();
        }
    }

    @f0
    public synchronized j<R> l(InterfaceC4444b interfaceC4444b, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f139714l = interfaceC4444b;
        this.f139715m = z10;
        this.f139716n = z11;
        this.f139717o = z12;
        this.f139718p = z13;
        return this;
    }

    public synchronized boolean m() {
        return this.f139726x;
    }

    public final boolean n() {
        return this.f139723u || this.f139721s || this.f139726x;
    }

    public void o() {
        synchronized (this) {
            try {
                this.f139704b.c();
                if (this.f139726x) {
                    r();
                    return;
                }
                if (this.f139703a.f139734a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f139723u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f139723u = true;
                InterfaceC4444b interfaceC4444b = this.f139714l;
                e eVarG = this.f139703a.g();
                k(eVarG.f139734a.size() + 1);
                this.f139708f.a(this, interfaceC4444b, null);
                for (d dVar : eVarG.f139734a) {
                    dVar.f139733b.execute(new a(dVar.f139732a));
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void p() {
        synchronized (this) {
            try {
                this.f139704b.c();
                if (this.f139726x) {
                    this.f139719q.a();
                    r();
                    return;
                }
                if (this.f139703a.f139734a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f139721s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f139724v = this.f139707e.a(this.f139719q, this.f139715m, this.f139714l, this.f139705c);
                this.f139721s = true;
                e eVarG = this.f139703a.g();
                k(eVarG.f139734a.size() + 1);
                this.f139708f.a(this, this.f139714l, this.f139724v);
                for (d dVar : eVarG.f139734a) {
                    dVar.f139733b.execute(new b(dVar.f139732a));
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean q() {
        return this.f139718p;
    }

    public synchronized void s(com.bumptech.glide.request.i iVar) {
        try {
            this.f139704b.c();
            this.f139703a.i(iVar);
            if (this.f139703a.f139734a.isEmpty()) {
                h();
                if (this.f139721s || this.f139723u) {
                    if (this.f139713k.get() == 0) {
                        r();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(DecodeJob<R> decodeJob) {
        try {
            this.f139725w = decodeJob;
            (decodeJob.K() ? this.f139709g : j()).execute(decodeJob);
        } catch (Throwable th) {
            throw th;
        }
    }

    @f0
    public j(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, k kVar, n.a aVar, s.a<j<?>> aVar2, c cVar) {
        this.f139703a = new e();
        this.f139704b = new AbstractC5855c.C0914c();
        this.f139713k = new AtomicInteger();
        this.f139709g = glideExecutor;
        this.f139710h = glideExecutor2;
        this.f139711i = glideExecutor3;
        this.f139712j = glideExecutor4;
        this.f139708f = kVar;
        this.f139705c = aVar;
        this.f139706d = aVar2;
        this.f139707e = cVar;
    }
}
