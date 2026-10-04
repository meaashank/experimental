package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.r;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class i<E> extends a<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f99620g = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f99621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public Object[] f99622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f99623f;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public i(@NotNull Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f99621d = i12;
        Object[] objArr2 = new Object[i12];
        this.f99622e = objArr2;
        ?? r52 = i10 == i11 ? 1 : 0;
        this.f99623f = r52;
        objArr2[0] = objArr;
        i(i10 - r52, 1);
    }

    public final E h() {
        int i10 = this.f99595a & 31;
        Object obj = this.f99622e[this.f99621d - 1];
        G.n(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[i10];
    }

    public final void i(int i10, int i11) {
        int i12 = (this.f99621d - i11) * 5;
        while (i11 < this.f99621d) {
            Object[] objArr = this.f99622e;
            Object obj = objArr[i11 - 1];
            G.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[j.a(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    public final void j(int i10) {
        int i11 = 0;
        while (j.a(this.f99595a, i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            i(this.f99595a, ((this.f99621d - 1) - (i11 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void m(@NotNull Object[] objArr, int i10, int i11, int i12) {
        this.f99595a = i10;
        this.f99596b = i11;
        this.f99621d = i12;
        if (this.f99622e.length < i12) {
            this.f99622e = new Object[i12];
        }
        this.f99622e[0] = objArr;
        ?? r02 = i10 == i11 ? 1 : 0;
        this.f99623f = r02;
        i(i10 - r02, 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eH = h();
        int i10 = this.f99595a + 1;
        this.f99595a = i10;
        if (i10 == this.f99596b) {
            this.f99623f = true;
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
        this.f99595a--;
        if (this.f99623f) {
            this.f99623f = false;
            return h();
        }
        j(31);
        return h();
    }
}
