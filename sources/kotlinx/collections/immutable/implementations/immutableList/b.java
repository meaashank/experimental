package kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b<T> extends a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final T[] f218519c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull T[] buffer, int i10, int i11) {
        super(i10, i11);
        G.p(buffer, "buffer");
        this.f218519c = buffer;
    }

    @Override // kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.f218519c;
        int i10 = this.f218517a;
        this.f218517a = i10 + 1;
        return tArr[i10];
    }

    @Override // java.util.ListIterator
    public T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.f218519c;
        int i10 = this.f218517a - 1;
        this.f218517a = i10;
        return tArr[i10];
    }
}
