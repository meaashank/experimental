package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.C2646i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2640c<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Executor f116556h = new ExecutorC0323c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f116557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsyncDifferConfig<T> f116558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Executor f116559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<b<T>> f116560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public List<T> f116561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public List<T> f116562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f116563g;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f116564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f116565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f116566c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Runnable f116567d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.c$a$a, reason: collision with other inner class name */
        public class C0322a extends C2646i.b {
            public C0322a() {
            }

            @Override // androidx.recyclerview.widget.C2646i.b
            public boolean a(int i10, int i11) {
                Object obj = a.this.f116564a.get(i10);
                Object obj2 = a.this.f116565b.get(i11);
                if (obj != null && obj2 != null) {
                    return C2640c.this.f116558b.f116268c.a((T) obj, (T) obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.C2646i.b
            public boolean b(int i10, int i11) {
                Object obj = a.this.f116564a.get(i10);
                Object obj2 = a.this.f116565b.get(i11);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : C2640c.this.f116558b.f116268c.b((T) obj, (T) obj2);
            }

            @Override // androidx.recyclerview.widget.C2646i.b
            @Nullable
            public Object c(int i10, int i11) {
                Object obj = a.this.f116564a.get(i10);
                Object obj2 = a.this.f116565b.get(i11);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                C2640c.this.f116558b.f116268c.getClass();
                return null;
            }

            @Override // androidx.recyclerview.widget.C2646i.b
            public int d() {
                return a.this.f116565b.size();
            }

            @Override // androidx.recyclerview.widget.C2646i.b
            public int e() {
                return a.this.f116564a.size();
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.c$a$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C2646i.e f116570a;

            public b(C2646i.e eVar) {
                this.f116570a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                C2640c c2640c = C2640c.this;
                if (c2640c.f116563g == aVar.f116566c) {
                    c2640c.c(aVar.f116565b, this.f116570a, aVar.f116567d);
                }
            }
        }

        public a(List list, List list2, int i10, Runnable runnable) {
            this.f116564a = list;
            this.f116565b = list2;
            this.f116566c = i10;
            this.f116567d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2640c.this.f116559c.execute(new b(C2646i.c(new C0322a(), true)));
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$b */
    public interface b<T> {
        void a(@NonNull List<T> list, @NonNull List<T> list2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    public static class ExecutorC0323c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f116572a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.f116572a.post(runnable);
        }
    }

    public C2640c(@NonNull RecyclerView.Adapter adapter, @NonNull C2646i.f<T> fVar) {
        this(new C2639b(adapter), new AsyncDifferConfig.Builder(fVar).build());
    }

    public void a(@NonNull b<T> bVar) {
        this.f116560d.add(bVar);
    }

    @NonNull
    public List<T> b() {
        return this.f116562f;
    }

    public void c(@NonNull List<T> list, @NonNull C2646i.e eVar, @Nullable Runnable runnable) {
        List<T> list2 = this.f116562f;
        this.f116561e = list;
        this.f116562f = Collections.unmodifiableList(list);
        eVar.d(this.f116557a);
        d(list2, runnable);
    }

    public final void d(@NonNull List<T> list, @Nullable Runnable runnable) {
        Iterator<b<T>> it = this.f116560d.iterator();
        while (it.hasNext()) {
            it.next().a(list, this.f116562f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void e(@NonNull b<T> bVar) {
        this.f116560d.remove(bVar);
    }

    public void f(@Nullable List<T> list) {
        g(list, null);
    }

    public void g(@Nullable List<T> list, @Nullable Runnable runnable) {
        int i10 = this.f116563g + 1;
        this.f116563g = i10;
        List<T> list2 = this.f116561e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f116562f;
        if (list == null) {
            int size = list2.size();
            this.f116561e = null;
            this.f116562f = Collections.EMPTY_LIST;
            this.f116557a.c(0, size);
            d(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f116558b.f116267b.execute(new a(list2, list, i10, runnable));
            return;
        }
        this.f116561e = list;
        this.f116562f = Collections.unmodifiableList(list);
        this.f116557a.b(0, list.size());
        d(list3, runnable);
    }

    public C2640c(@NonNull t tVar, @NonNull AsyncDifferConfig<T> asyncDifferConfig) {
        this.f116560d = new CopyOnWriteArrayList();
        this.f116562f = Collections.EMPTY_LIST;
        this.f116557a = tVar;
        this.f116558b = asyncDifferConfig;
        Executor executor = asyncDifferConfig.f116266a;
        if (executor != null) {
            this.f116559c = executor;
        } else {
            this.f116559c = f116556h;
        }
    }
}
