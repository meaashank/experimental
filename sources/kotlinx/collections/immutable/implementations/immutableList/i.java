package kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i<E> extends a<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f218535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public Object[] f218536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f218537e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public i(@NotNull Object[] root, int i10, int i11, int i12) {
        super(i10, i11);
        G.p(root, "root");
        this.f218535c = i12;
        Object[] objArr = new Object[i12];
        this.f218536d = objArr;
        ?? r52 = i10 == i11 ? 1 : 0;
        this.f218537e = r52;
        objArr[0] = root;
        i(i10 - r52, 1);
    }

    private final E h() {
        int i10 = this.f218517a & 31;
        Object obj = this.f218536d[this.f218535c - 1];
        G.n(obj, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[i10];
    }

    private final void i(int i10, int i11) {
        int i12 = (this.f218535c - i11) * 5;
        while (i11 < this.f218535c) {
            Object[] objArr = this.f218536d;
            Object obj = objArr[i11 - 1];
            G.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[j.a(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    private final void j(int i10) {
        int i11 = 0;
        while (j.a(this.f218517a, i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            i(this.f218517a, ((this.f218535c - 1) - (i11 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void m(@NotNull Object[] root, int i10, int i11, int i12) {
        G.p(root, "root");
        this.f218517a = i10;
        this.f218518b = i11;
        this.f218535c = i12;
        if (this.f218536d.length < i12) {
            this.f218536d = new Object[i12];
        }
        this.f218536d[0] = root;
        ?? r02 = i10 == i11 ? 1 : 0;
        this.f218537e = r02;
        i(i10 - r02, 1);
    }

    @Override // kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eH = h();
        int i10 = this.f218517a + 1;
        this.f218517a = i10;
        if (i10 == this.f218518b) {
            this.f218537e = true;
            return eH;
        }
        j(0);
        return eH;
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f218517a--;
        if (this.f218537e) {
            this.f218537e = false;
            return h();
        }
        j(31);
        return h();
    }
}
