package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.r;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class b<T> extends a<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f99597e = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final T[] f99598d;

    public b(@NotNull T[] tArr, int i10, int i11) {
        super(i10, i11);
        this.f99598d = tArr;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.f99598d;
        int i10 = this.f99595a;
        this.f99595a = i10 + 1;
        return tArr[i10];
    }

    @Override // java.util.ListIterator
    public T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.f99598d;
        int i10 = this.f99595a - 1;
        this.f99595a = i10;
        return tArr[i10];
    }
}
