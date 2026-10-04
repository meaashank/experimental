package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n204#1:208\n204#1:209\n204#1:210\n1#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:208\n175#1:209\n188#1:210\n*E\n"})
public final class v0<T> extends AbstractC4859d<T> implements RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object[] f217658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f217659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f217660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f217661f;

    @kotlin.jvm.internal.V({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,206:1\n204#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:207\n*E\n"})
    public static final class a extends AbstractC4857c<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f217662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f217663d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ v0<T> f217664e;

        public a(v0<T> v0Var) {
            this.f217664e = v0Var;
            this.f217662c = v0Var.getSize();
            this.f217663d = v0Var.f217660e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.AbstractC4857c
        public void b() {
            if (this.f217662c == 0) {
                this.f217599a = 2;
                return;
            }
            e(this.f217664e.f217658c[this.f217663d]);
            this.f217663d = (this.f217663d + 1) % this.f217664e.f217659d;
            this.f217662c--;
        }
    }

    public v0(@NotNull Object[] buffer, int i10) {
        kotlin.jvm.internal.G.p(buffer, "buffer");
        this.f217658c = buffer;
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("ring buffer filled size should not be negative but it is ", i10).toString());
        }
        if (i10 <= buffer.length) {
            this.f217659d = buffer.length;
            this.f217661f = i10;
        } else {
            StringBuilder sbA = android.support.v4.media.a.a("ring buffer filled size: ", i10, " cannot be larger than the buffer size: ");
            sbA.append(buffer.length);
            throw new IllegalArgumentException(sbA.toString().toString());
        }
    }

    @Override // kotlin.collections.AbstractC4859d, java.util.List
    public T get(int i10) {
        AbstractC4859d.f217603a.b(i10, getSize());
        return (T) this.f217658c[(this.f217660e + i10) % this.f217659d];
    }

    @Override // kotlin.collections.AbstractC4859d, kotlin.collections.AbstractC4855b
    public int getSize() {
        return this.f217661f;
    }

    @Override // kotlin.collections.AbstractC4859d, kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final void o(T t10) {
        if (v()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f217658c[(getSize() + this.f217660e) % this.f217659d] = t10;
        this.f217661f = getSize() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final v0<T> q(int i10) {
        Object[] array;
        int i11 = this.f217659d;
        int i12 = i11 + (i11 >> 1) + 1;
        if (i12 <= i10) {
            i10 = i12;
        }
        if (this.f217660e == 0) {
            array = Arrays.copyOf(this.f217658c, i10);
            kotlin.jvm.internal.G.o(array, "copyOf(...)");
        } else {
            array = toArray(new Object[i10]);
        }
        return new v0<>(array, getSize());
    }

    public final int t(int i10, int i11) {
        return (i10 + i11) % this.f217659d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractC4855b, java.util.Collection
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[getSize()]);
    }

    public final boolean v() {
        return getSize() == this.f217659d;
    }

    public final void w(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("n shouldn't be negative but it is ", i10).toString());
        }
        if (i10 > getSize()) {
            StringBuilder sbA = android.support.v4.media.a.a("n shouldn't be greater than the buffer size: n = ", i10, ", size = ");
            sbA.append(getSize());
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        if (i10 > 0) {
            int i11 = this.f217660e;
            int i12 = this.f217659d;
            int i13 = (i11 + i10) % i12;
            if (i11 > i13) {
                C4875q.M1(this.f217658c, null, i11, i12);
                C4875q.M1(this.f217658c, null, 0, i13);
            } else {
                C4875q.M1(this.f217658c, null, i11, i13);
            }
            this.f217660e = i13;
            this.f217661f = getSize() - i10;
        }
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        kotlin.jvm.internal.G.p(array, "array");
        if (array.length < getSize()) {
            array = (T[]) Arrays.copyOf(array, getSize());
            kotlin.jvm.internal.G.o(array, "copyOf(...)");
        }
        int size = getSize();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f217660e; i11 < size && i12 < this.f217659d; i12++) {
            array[i11] = this.f217658c[i12];
            i11++;
        }
        while (i11 < size) {
            array[i11] = this.f217658c[i10];
            i11++;
            i10++;
        }
        H.o(size, array);
        return array;
    }

    public v0(int i10) {
        this(new Object[i10], 0);
    }
}
