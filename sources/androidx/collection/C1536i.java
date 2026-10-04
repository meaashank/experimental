package androidx.collection;

import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.collection.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nCircularIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,214:1\n46#2,5:215\n46#2,5:220\n26#3:225\n26#3:226\n26#3:227\n26#3:228\n26#3:229\n26#3:230\n26#3:231\n*S KotlinDebug\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n*L\n38#1:215,5\n39#1:220,5\n101#1:225\n114#1:226\n140#1:227\n157#1:228\n170#1:229\n182#1:230\n194#1:231\n*E\n"})
public final class C1536i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public int[] f86969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86972d;

    @dd.k
    public C1536i() {
        this(0, 1, null);
    }

    public final void a(int i10) {
        int i11 = (this.f86970b - 1) & this.f86972d;
        this.f86970b = i11;
        this.f86969a[i11] = i10;
        if (i11 == this.f86971c) {
            d();
        }
    }

    public final void b(int i10) {
        int[] iArr = this.f86969a;
        int i11 = this.f86971c;
        iArr[i11] = i10;
        int i12 = this.f86972d & (i11 + 1);
        this.f86971c = i12;
        if (i12 == this.f86970b) {
            d();
        }
    }

    public final void c() {
        this.f86971c = this.f86970b;
    }

    public final void d() {
        int[] iArr = this.f86969a;
        int length = iArr.length;
        int i10 = this.f86970b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i12];
        C4875q.z0(iArr, iArr2, 0, i10, length);
        C4875q.z0(this.f86969a, iArr2, i11, 0, this.f86970b);
        this.f86969a = iArr2;
        this.f86970b = 0;
        this.f86971c = length;
        this.f86972d = i12 - 1;
    }

    public final int e(int i10) {
        if (i10 < 0 || i10 >= m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f86969a[this.f86972d & (this.f86970b + i10)];
    }

    public final int f() {
        int i10 = this.f86970b;
        if (i10 != this.f86971c) {
            return this.f86969a[i10];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int g() {
        int i10 = this.f86970b;
        int i11 = this.f86971c;
        if (i10 != i11) {
            return this.f86969a[(i11 - 1) & this.f86972d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final boolean h() {
        return this.f86970b == this.f86971c;
    }

    public final int i() {
        int i10 = this.f86970b;
        if (i10 == this.f86971c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f86969a[i10];
        this.f86970b = (i10 + 1) & this.f86972d;
        return i11;
    }

    public final int j() {
        int i10 = this.f86970b;
        int i11 = this.f86971c;
        if (i10 == i11) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f86972d & (i11 - 1);
        int i13 = this.f86969a[i12];
        this.f86971c = i12;
        return i13;
    }

    public final void k(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f86971c = this.f86972d & (this.f86971c - i10);
    }

    public final void l(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f86970b = this.f86972d & (this.f86970b + i10);
    }

    public final int m() {
        return (this.f86971c - this.f86970b) & this.f86972d;
    }

    @dd.k
    public C1536i(int i10) {
        if (!(i10 >= 1)) {
            A.f.c("capacity must be >= 1");
            throw null;
        }
        if (!(i10 <= 1073741824)) {
            A.f.c("capacity must be <= 2^30");
            throw null;
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f86972d = i10 - 1;
        this.f86969a = new int[i10];
    }

    public /* synthetic */ C1536i(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
