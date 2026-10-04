package y3;

/* JADX INFO: renamed from: y3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5819h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: y3.h$a */
    public class a<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile T f241067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f241068b;

        public a(b bVar) {
            this.f241068b = bVar;
        }

        @Override // y3.C5819h.b
        public T get() {
            if (this.f241067a == null) {
                synchronized (this) {
                    try {
                        if (this.f241067a == null) {
                            T t10 = (T) this.f241068b.get();
                            m.f(t10, "Argument must not be null");
                            this.f241067a = t10;
                        }
                    } finally {
                    }
                }
            }
            return this.f241067a;
        }
    }

    /* JADX INFO: renamed from: y3.h$b */
    public interface b<T> {
        T get();
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}
