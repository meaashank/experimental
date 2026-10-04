package androidx.collection;

import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.collection.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nCircularArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,271:1\n46#2,5:272\n46#2,5:277\n26#3:282\n26#3:283\n26#3:284\n26#3:285\n26#3:286\n26#3:287\n26#3:288\n*S KotlinDebug\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n*L\n39#1:272,5\n40#1:277,5\n105#1:282\n123#1:283\n153#1:284\n188#1:285\n222#1:286\n236#1:287\n250#1:288\n*E\n"})
public final class C1534h<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public E[] f86965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86968d;

    @dd.k
    public C1534h() {
        this(0, 1, null);
    }

    public final void a(E e10) {
        int i10 = (this.f86966b - 1) & this.f86968d;
        this.f86966b = i10;
        this.f86965a[i10] = e10;
        if (i10 == this.f86967c) {
            d();
        }
    }

    public final void b(E e10) {
        E[] eArr = this.f86965a;
        int i10 = this.f86967c;
        eArr[i10] = e10;
        int i11 = this.f86968d & (i10 + 1);
        this.f86967c = i11;
        if (i11 == this.f86966b) {
            d();
        }
    }

    public final void c() {
        l(m());
    }

    public final void d() {
        E[] eArr = this.f86965a;
        int length = eArr.length;
        int i10 = this.f86966b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i12];
        C4875q.B0(eArr, eArr2, 0, i10, length);
        C4875q.B0(this.f86965a, eArr2, i11, 0, this.f86966b);
        this.f86965a = eArr2;
        this.f86966b = 0;
        this.f86967c = length;
        this.f86968d = i12 - 1;
    }

    public final E e(int i10) {
        if (i10 < 0 || i10 >= m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E e10 = this.f86965a[this.f86968d & (this.f86966b + i10)];
        kotlin.jvm.internal.G.m(e10);
        return e10;
    }

    public final E f() {
        int i10 = this.f86966b;
        if (i10 == this.f86967c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E e10 = this.f86965a[i10];
        kotlin.jvm.internal.G.m(e10);
        return e10;
    }

    public final E g() {
        int i10 = this.f86966b;
        int i11 = this.f86967c;
        if (i10 == i11) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E e10 = this.f86965a[(i11 - 1) & this.f86968d];
        kotlin.jvm.internal.G.m(e10);
        return e10;
    }

    public final boolean h() {
        return this.f86966b == this.f86967c;
    }

    public final E i() {
        int i10 = this.f86966b;
        if (i10 == this.f86967c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.f86965a;
        E e10 = eArr[i10];
        eArr[i10] = null;
        this.f86966b = (i10 + 1) & this.f86968d;
        return e10;
    }

    public final E j() {
        int i10 = this.f86966b;
        int i11 = this.f86967c;
        if (i10 == i11) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f86968d & (i11 - 1);
        E[] eArr = this.f86965a;
        E e10 = eArr[i12];
        eArr[i12] = null;
        this.f86967c = i12;
        return e10;
    }

    public final void k(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f86967c;
        int i12 = i10 < i11 ? i11 - i10 : 0;
        for (int i13 = i12; i13 < i11; i13++) {
            this.f86965a[i13] = null;
        }
        int i14 = this.f86967c;
        int i15 = i14 - i12;
        int i16 = i10 - i15;
        this.f86967c = i14 - i15;
        if (i16 > 0) {
            int length = this.f86965a.length;
            this.f86967c = length;
            int i17 = length - i16;
            for (int i18 = i17; i18 < length; i18++) {
                this.f86965a[i18] = null;
            }
            this.f86967c = i17;
        }
    }

    public final void l(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.f86965a.length;
        int i11 = this.f86966b;
        if (i10 < length - i11) {
            length = i11 + i10;
        }
        while (i11 < length) {
            this.f86965a[i11] = null;
            i11++;
        }
        int i12 = this.f86966b;
        int i13 = length - i12;
        int i14 = i10 - i13;
        this.f86966b = this.f86968d & (i12 + i13);
        if (i14 > 0) {
            for (int i15 = 0; i15 < i14; i15++) {
                this.f86965a[i15] = null;
            }
            this.f86966b = i14;
        }
    }

    public final int m() {
        return (this.f86967c - this.f86966b) & this.f86968d;
    }

    @dd.k
    public C1534h(int i10) {
        if (!(i10 >= 1)) {
            A.f.c("capacity must be >= 1");
            throw null;
        }
        if (!(i10 <= 1073741824)) {
            A.f.c("capacity must be <= 2^30");
            throw null;
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f86968d = i10 - 1;
        this.f86965a = (E[]) new Object[i10];
    }

    public /* synthetic */ C1534h(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
