package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.r;
import fd.InterfaceC4423f;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class f<T> extends a<T> implements ListIterator<T>, InterfaceC4423f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f99609h = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PersistentVectorBuilder<T> f99610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f99611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public i<? extends T> f99612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f99613g;

    public f(@NotNull PersistentVectorBuilder<T> persistentVectorBuilder, int i10) {
        super(i10, persistentVectorBuilder.getSize());
        this.f99610d = persistentVectorBuilder;
        this.f99611e = persistentVectorBuilder.i();
        this.f99613g = -1;
        m();
    }

    private final void j() {
        this.f99596b = this.f99610d.getSize();
        this.f99611e = this.f99610d.i();
        this.f99613g = -1;
        m();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator
    public void add(T t10) {
        h();
        this.f99610d.add(this.f99595a, t10);
        this.f99595a++;
        j();
    }

    public final void h() {
        if (this.f99611e != this.f99610d.i()) {
            throw new ConcurrentModificationException();
        }
    }

    public final void i() {
        if (this.f99613g == -1) {
            throw new IllegalStateException();
        }
    }

    public final void m() {
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f99610d;
        Object[] objArr = persistentVectorBuilder.f99590f;
        if (objArr == null) {
            this.f99612f = null;
            return;
        }
        int iD = j.d(persistentVectorBuilder.getSize());
        int i10 = this.f99595a;
        if (i10 > iD) {
            i10 = iD;
        }
        int i11 = (this.f99610d.f99588d / 5) + 1;
        i<? extends T> iVar = this.f99612f;
        if (iVar == null) {
            this.f99612f = new i<>(objArr, i10, iD, i11);
        } else {
            G.m(iVar);
            iVar.m(objArr, i10, iD, i11);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public T next() {
        h();
        b();
        int i10 = this.f99595a;
        this.f99613g = i10;
        i<? extends T> iVar = this.f99612f;
        if (iVar == null) {
            Object[] objArr = this.f99610d.f99591g;
            this.f99595a = i10 + 1;
            return (T) objArr[i10];
        }
        if (iVar.hasNext()) {
            this.f99595a++;
            return iVar.next();
        }
        Object[] objArr2 = this.f99610d.f99591g;
        int i11 = this.f99595a;
        this.f99595a = i11 + 1;
        return (T) objArr2[i11 - iVar.f99596b];
    }

    @Override // java.util.ListIterator
    public T previous() {
        h();
        d();
        int i10 = this.f99595a;
        this.f99613g = i10 - 1;
        i<? extends T> iVar = this.f99612f;
        if (iVar == null) {
            Object[] objArr = this.f99610d.f99591g;
            int i11 = i10 - 1;
            this.f99595a = i11;
            return (T) objArr[i11];
        }
        int i12 = iVar.f99596b;
        if (i10 <= i12) {
            this.f99595a = i10 - 1;
            return iVar.previous();
        }
        Object[] objArr2 = this.f99610d.f99591g;
        int i13 = i10 - 1;
        this.f99595a = i13;
        return (T) objArr2[i13 - i12];
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        h();
        i();
        this.f99610d.b(this.f99613g);
        int i10 = this.f99613g;
        if (i10 < this.f99595a) {
            this.f99595a = i10;
        }
        j();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator
    public void set(T t10) {
        h();
        i();
        this.f99610d.set(this.f99613g, t10);
        this.f99611e = this.f99610d.i();
        m();
    }
}
