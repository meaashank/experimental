package K2;

import K2.j;
import K2.k;
import K2.n;
import android.app.Activity;
import android.util.Log;
import androidx.core.util.InterfaceC2427d;
import androidx.window.embedding.EmbeddingRule;
import e.InterfaceC4326A;
import e.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.window.core.d
public final class n implements i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static volatile n f58353f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f58355h = "EmbeddingBackend";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC4326A("globalLock")
    @f0
    @Nullable
    public k f58356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<c> f58357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final b f58358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArraySet<EmbeddingRule> f58359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f58352e = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final ReentrantLock f58354g = new ReentrantLock();

    public static final class a {
        public a() {
        }

        @NotNull
        public final n a() {
            if (n.f58353f == null) {
                ReentrantLock reentrantLock = n.f58354g;
                reentrantLock.lock();
                try {
                    if (n.f58353f == null) {
                        n.f58353f = new n(n.f58352e.b());
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            n nVar = n.f58353f;
            G.m(nVar);
            return nVar;
        }

        public final k b() {
            j jVar = null;
            try {
                j.a aVar = j.f58345c;
                if (c(aVar.b()) && aVar.c()) {
                    jVar = new j();
                }
            } catch (Throwable th) {
                Log.d(n.f58355h, G.C("Failed to load embedding extension: ", th));
            }
            if (jVar == null) {
                Log.d(n.f58355h, "No supported embedding extension found");
            }
            return jVar;
        }

        @f0
        public final boolean c(@Nullable Integer num) {
            return num != null && num.intValue() >= 1;
        }

        public a(C4969v c4969v) {
        }
    }

    public final class b implements k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public List<r> f58360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f58361b;

        public b(n this$0) {
            G.p(this$0, "this$0");
            this.f58361b = this$0;
        }

        @Override // K2.k.a
        public void a(@NotNull List<r> splitInfo) {
            G.p(splitInfo, "splitInfo");
            this.f58360a = splitInfo;
            Iterator<c> it = this.f58361b.f58357b.iterator();
            while (it.hasNext()) {
                it.next().b(splitInfo);
            }
        }

        @Nullable
        public final List<r> b() {
            return this.f58360a;
        }

        public final void c(@Nullable List<r> list) {
            this.f58360a = list;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Activity f58362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Executor f58363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final InterfaceC2427d<List<r>> f58364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public List<r> f58365d;

        public c(@NotNull Activity activity, @NotNull Executor executor, @NotNull InterfaceC2427d<List<r>> callback) {
            G.p(activity, "activity");
            G.p(executor, "executor");
            G.p(callback, "callback");
            this.f58362a = activity;
            this.f58363b = executor;
            this.f58364c = callback;
        }

        public static final void c(c this$0, List splitsWithActivity) {
            G.p(this$0, "this$0");
            G.p(splitsWithActivity, "$splitsWithActivity");
            this$0.f58364c.accept(splitsWithActivity);
        }

        public final void b(@NotNull List<r> splitInfoList) {
            G.p(splitInfoList, "splitInfoList");
            final ArrayList arrayList = new ArrayList();
            for (Object obj : splitInfoList) {
                if (((r) obj).a(this.f58362a)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.equals(this.f58365d)) {
                return;
            }
            this.f58365d = arrayList;
            this.f58363b.execute(new Runnable() { // from class: K2.o
                @Override // java.lang.Runnable
                public final void run() {
                    n.c.c(this.f58366a, arrayList);
                }
            });
        }

        @NotNull
        public final InterfaceC2427d<List<r>> d() {
            return this.f58364c;
        }
    }

    @f0
    public n(@Nullable k kVar) {
        this.f58356a = kVar;
        b bVar = new b(this);
        this.f58358c = bVar;
        this.f58357b = new CopyOnWriteArrayList<>();
        k kVar2 = this.f58356a;
        if (kVar2 != null) {
            kVar2.b(bVar);
        }
        this.f58359d = new CopyOnWriteArraySet<>();
    }

    @Override // K2.i
    public void a(@NotNull Set<? extends EmbeddingRule> rules) {
        G.p(rules, "rules");
        this.f58359d.clear();
        this.f58359d.addAll(rules);
        k kVar = this.f58356a;
        if (kVar == null) {
            return;
        }
        kVar.a(this.f58359d);
    }

    @Override // K2.i
    @NotNull
    public Set<EmbeddingRule> b() {
        return this.f58359d;
    }

    @Override // K2.i
    public void c(@NotNull Activity activity, @NotNull Executor executor, @NotNull InterfaceC2427d<List<r>> callback) {
        G.p(activity, "activity");
        G.p(executor, "executor");
        G.p(callback, "callback");
        ReentrantLock reentrantLock = f58354g;
        reentrantLock.lock();
        try {
            if (this.f58356a == null) {
                Log.v(f58355h, "Extension not loaded, skipping callback registration.");
                callback.accept(EmptyList.f217510a);
                return;
            }
            c cVar = new c(activity, executor, callback);
            this.f58357b.add(cVar);
            List<r> list = this.f58358c.f58360a;
            if (list != null) {
                G.m(list);
                cVar.b(list);
            } else {
                cVar.b(EmptyList.f217510a);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r4.f58357b.remove(r2);
     */
    @Override // K2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(@org.jetbrains.annotations.NotNull androidx.core.util.InterfaceC2427d<java.util.List<K2.r>> r5) {
        /*
            r4 = this;
            java.lang.String r0 = "consumer"
            kotlin.jvm.internal.G.p(r5, r0)
            java.util.concurrent.locks.ReentrantLock r0 = K2.n.f58354g
            r0.lock()
            java.util.concurrent.CopyOnWriteArrayList<K2.n$c> r1 = r4.f58357b     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2a
        L10:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2a
            K2.n$c r2 = (K2.n.c) r2     // Catch: java.lang.Throwable -> L2a
            androidx.core.util.d<java.util.List<K2.r>> r3 = r2.f58364c     // Catch: java.lang.Throwable -> L2a
            boolean r3 = kotlin.jvm.internal.G.g(r3, r5)     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L10
            java.util.concurrent.CopyOnWriteArrayList<K2.n$c> r5 = r4.f58357b     // Catch: java.lang.Throwable -> L2a
            r5.remove(r2)     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r5 = move-exception
            goto L30
        L2c:
            r0.unlock()
            return
        L30:
            r0.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.n.d(androidx.core.util.d):void");
    }

    @Override // K2.i
    public boolean e() {
        return this.f58356a != null;
    }

    @Override // K2.i
    public void f(@NotNull EmbeddingRule rule) {
        G.p(rule, "rule");
        if (this.f58359d.contains(rule)) {
            this.f58359d.remove(rule);
            k kVar = this.f58356a;
            if (kVar == null) {
                return;
            }
            kVar.a(this.f58359d);
        }
    }

    @Override // K2.i
    public void g(@NotNull EmbeddingRule rule) {
        G.p(rule, "rule");
        if (this.f58359d.contains(rule)) {
            return;
        }
        this.f58359d.add(rule);
        k kVar = this.f58356a;
        if (kVar == null) {
            return;
        }
        kVar.a(this.f58359d);
    }

    @Nullable
    public final k k() {
        return this.f58356a;
    }

    @NotNull
    public final CopyOnWriteArrayList<c> l() {
        return this.f58357b;
    }

    public final void n(@Nullable k kVar) {
        this.f58356a = kVar;
    }

    @f0
    public static /* synthetic */ void m() {
    }
}
