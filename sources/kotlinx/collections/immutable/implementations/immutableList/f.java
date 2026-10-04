package kotlinx.collections.immutable.implementations.immutableList;

import fd.InterfaceC4423f;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class f<T> extends a<T> implements ListIterator<T>, InterfaceC4423f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PersistentVectorBuilder<T> f218527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f218528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public i<? extends T> f218529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f218530f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull PersistentVectorBuilder<T> builder, int i10) {
        super(i10, builder.getSize());
        G.p(builder, "builder");
        this.f218527c = builder;
        this.f218528d = builder.i();
        this.f218530f = -1;
        m();
    }

    private final void h() {
        if (this.f218528d != this.f218527c.i()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if (this.f218530f == -1) {
            throw new IllegalStateException();
        }
    }

    private final void j() {
        this.f218518b = this.f218527c.getSize();
        this.f218528d = this.f218527c.i();
        this.f218530f = -1;
        m();
    }

    private final void m() {
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f218527c;
        Object[] objArr = persistentVectorBuilder.f218513f;
        if (objArr == null) {
            this.f218529e = null;
            return;
        }
        int iD = j.d(persistentVectorBuilder.getSize());
        int i10 = this.f218517a;
        if (i10 > iD) {
            i10 = iD;
        }
        int i11 = (this.f218527c.f218511d / 5) + 1;
        i<? extends T> iVar = this.f218529e;
        if (iVar == null) {
            this.f218529e = new i<>(objArr, i10, iD, i11);
        } else {
            G.m(iVar);
            iVar.m(objArr, i10, iD, i11);
        }
    }

    @Override // kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator
    public void add(T t10) {
        h();
        this.f218527c.add(this.f218517a, t10);
        this.f218517a++;
        j();
    }

    @Override // kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public T next() {
        h();
        b();
        int i10 = this.f218517a;
        this.f218530f = i10;
        i<? extends T> iVar = this.f218529e;
        if (iVar == null) {
            Object[] objArr = this.f218527c.f218514g;
            this.f218517a = i10 + 1;
            return (T) objArr[i10];
        }
        if (iVar.hasNext()) {
            this.f218517a++;
            return iVar.next();
        }
        Object[] objArr2 = this.f218527c.f218514g;
        int i11 = this.f218517a;
        this.f218517a = i11 + 1;
        return (T) objArr2[i11 - iVar.f218518b];
    }

    @Override // java.util.ListIterator
    public T previous() {
        h();
        d();
        int i10 = this.f218517a;
        this.f218530f = i10 - 1;
        i<? extends T> iVar = this.f218529e;
        if (iVar == null) {
            Object[] objArr = this.f218527c.f218514g;
            int i11 = i10 - 1;
            this.f218517a = i11;
            return (T) objArr[i11];
        }
        int i12 = iVar.f218518b;
        if (i10 <= i12) {
            this.f218517a = i10 - 1;
            return iVar.previous();
        }
        Object[] objArr2 = this.f218527c.f218514g;
        int i13 = i10 - 1;
        this.f218517a = i13;
        return (T) objArr2[i13 - i12];
    }

    @Override // kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        h();
        i();
        this.f218527c.b(this.f218530f);
        int i10 = this.f218530f;
        if (i10 < this.f218517a) {
            this.f218517a = i10;
        }
        j();
    }

    @Override // kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator
    public void set(T t10) {
        h();
        i();
        this.f218527c.set(this.f218530f, t10);
        this.f218528d = this.f218527c.i();
        m();
    }
}
