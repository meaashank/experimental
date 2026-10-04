package k3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.f0;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public class l<A, B> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f214398b = 250;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3.j<b<A>, B> f214399a;

    public class a extends y3.j<b<A>, B> {
        public a(long j10) {
            super(j10);
        }

        @Override // y3.j
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void n(@NonNull b<A> bVar, @Nullable B b10) {
            bVar.c();
        }
    }

    @f0
    public static final class b<A> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Queue<b<?>> f214401d = y3.o.g(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f214402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f214403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public A f214404c;

        public static <A> b<A> a(A a10, int i10, int i11) {
            b<A> bVar;
            Queue<b<?>> queue = f214401d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a10, i10, i11);
            return bVar;
        }

        public final void b(A a10, int i10, int i11) {
            this.f214404c = a10;
            this.f214403b = i10;
            this.f214402a = i11;
        }

        public void c() {
            Queue<b<?>> queue = f214401d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f214403b == bVar.f214403b && this.f214402a == bVar.f214402a && this.f214404c.equals(bVar.f214404c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f214404c.hashCode() + (((this.f214402a * 31) + this.f214403b) * 31);
        }
    }

    public l() {
        this(250L);
    }

    public void a() {
        this.f214399a.b();
    }

    @Nullable
    public B b(A a10, int i10, int i11) {
        b<A> bVarA = b.a(a10, i10, i11);
        B bK = this.f214399a.k(bVarA);
        bVarA.c();
        return bK;
    }

    public void c(A a10, int i10, int i11, B b10) {
        this.f214399a.o(b.a(a10, i10, i11), b10);
    }

    public l(long j10) {
        this.f214399a = new a(j10);
    }
}
