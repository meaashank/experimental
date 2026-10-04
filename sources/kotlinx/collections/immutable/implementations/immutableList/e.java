package kotlinx.collections.immutable.implementations.immutableList;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e<T> extends a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final T[] f218525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final i<T> f218526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Object[] root, @NotNull T[] tail, int i10, int i11, int i12) {
        super(i10, i11);
        G.p(root, "root");
        G.p(tail, "tail");
        this.f218525c = tail;
        int iD = j.d(i11);
        this.f218526d = new i<>(root, i10 > iD ? iD : i10, iD, i12);
    }

    @Override // kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public T next() {
        b();
        if (this.f218526d.hasNext()) {
            this.f218517a++;
            return this.f218526d.next();
        }
        T[] tArr = this.f218525c;
        int i10 = this.f218517a;
        this.f218517a = i10 + 1;
        return tArr[i10 - this.f218526d.f218518b];
    }

    @Override // java.util.ListIterator
    public T previous() {
        d();
        int i10 = this.f218517a;
        i<T> iVar = this.f218526d;
        int i11 = iVar.f218518b;
        if (i10 <= i11) {
            this.f218517a = i10 - 1;
            return iVar.previous();
        }
        T[] tArr = this.f218525c;
        int i12 = i10 - 1;
        this.f218517a = i12;
        return tArr[i12 - i11];
    }
}
