package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class e<T> extends a<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f99606f = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final T[] f99607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final i<T> f99608e;

    public e(@NotNull Object[] objArr, @NotNull T[] tArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f99607d = tArr;
        int iD = j.d(i11);
        this.f99608e = new i<>(objArr, i10 > iD ? iD : i10, iD, i12);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public T next() {
        b();
        if (this.f99608e.hasNext()) {
            this.f99595a++;
            return this.f99608e.next();
        }
        T[] tArr = this.f99607d;
        int i10 = this.f99595a;
        this.f99595a = i10 + 1;
        return tArr[i10 - this.f99608e.f99596b];
    }

    @Override // java.util.ListIterator
    public T previous() {
        d();
        int i10 = this.f99595a;
        i<T> iVar = this.f99608e;
        int i11 = iVar.f99596b;
        if (i10 <= i11) {
            this.f99595a = i10 - 1;
            return iVar.previous();
        }
        T[] tArr = this.f99607d;
        int i12 = i10 - 1;
        this.f99595a = i12;
        return tArr[i12 - i11];
    }
}
