package z3;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.s;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: z3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5853a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f241208a = "FactoryPools";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f241209b = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g<Object> f241210c = new C0913a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: z3.a$b */
    public class b<T> implements d<List<T>> {
        @Override // z3.C5853a.d
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: z3.a$c */
    public class c<T> implements g<List<T>> {
        @Override // z3.C5853a.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull List<T> list) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: z3.a$d */
    public interface d<T> {
        T create();
    }

    /* JADX INFO: renamed from: z3.a$e */
    public static final class e<T> implements s.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d<T> f241211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g<T> f241212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s.a<T> f241213c;

        public e(@NonNull s.a<T> aVar, @NonNull d<T> dVar, @NonNull g<T> gVar) {
            this.f241213c = aVar;
            this.f241211a = dVar;
            this.f241212b = gVar;
        }

        @Override // androidx.core.util.s.a
        public T a() {
            T tA = this.f241213c.a();
            if (tA == null) {
                tA = this.f241211a.create();
                if (Log.isLoggable(C5853a.f241208a, 2)) {
                    Log.v(C5853a.f241208a, "Created new " + tA.getClass());
                }
            }
            if (tA instanceof f) {
                ((f) tA).e().b(false);
            }
            return tA;
        }

        @Override // androidx.core.util.s.a
        public boolean b(@NonNull T t10) {
            if (t10 instanceof f) {
                ((f) t10).e().b(true);
            }
            this.f241212b.a(t10);
            return this.f241213c.b(t10);
        }
    }

    /* JADX INFO: renamed from: z3.a$f */
    public interface f {
        @NonNull
        AbstractC5855c e();
    }

    /* JADX INFO: renamed from: z3.a$g */
    public interface g<T> {
        void a(@NonNull T t10);
    }

    @NonNull
    public static <T extends f> s.a<T> a(@NonNull s.a<T> aVar, @NonNull d<T> dVar) {
        return new e(aVar, dVar, f241210c);
    }

    @NonNull
    public static <T> s.a<T> b(@NonNull s.a<T> aVar, @NonNull d<T> dVar, @NonNull g<T> gVar) {
        return new e(aVar, dVar, gVar);
    }

    @NonNull
    public static <T> g<T> c() {
        return (g<T>) f241210c;
    }

    @NonNull
    public static <T extends f> s.a<T> d(int i10, @NonNull d<T> dVar) {
        return a(new s.b(i10), dVar);
    }

    @NonNull
    public static <T extends f> s.a<T> e(int i10, @NonNull d<T> dVar) {
        return a(new s.c(i10), dVar);
    }

    @NonNull
    public static <T extends f> s.a<T> f(int i10, @NonNull d<T> dVar, @NonNull g<T> gVar) {
        return new e(new s.c(i10), dVar, gVar);
    }

    @NonNull
    public static <T> s.a<List<T>> g() {
        return h(20);
    }

    @NonNull
    public static <T> s.a<List<T>> h(int i10) {
        return new e(new s.c(i10), new b(), new c());
    }

    /* JADX INFO: renamed from: z3.a$a, reason: collision with other inner class name */
    public class C0913a implements g<Object> {
        @Override // z3.C5853a.g
        public void a(@NonNull Object obj) {
        }
    }
}
