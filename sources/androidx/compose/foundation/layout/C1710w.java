package androidx.compose.foundation.layout;

import fd.InterfaceC4418a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1710w implements Iterator<androidx.compose.ui.layout.O>, InterfaceC4418a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f90960f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.p<Integer, Q, List<androidx.compose.ui.layout.O>> f90962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<androidx.compose.ui.layout.O> f90963c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f90964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f90965e;

    /* JADX WARN: Multi-variable type inference failed */
    public C1710w(int i10, @NotNull ed.p<? super Integer, ? super Q, ? extends List<? extends androidx.compose.ui.layout.O>> pVar) {
        this.f90961a = i10;
        this.f90962b = pVar;
    }

    public static /* synthetic */ androidx.compose.ui.layout.O e(C1710w c1710w, Q q10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q10 = new Q(0, 0, 0.0f, 0.0f, 15, null);
        }
        return c1710w.d(q10);
    }

    @NotNull
    public final List<androidx.compose.ui.layout.O> b() {
        return this.f90963c;
    }

    @NotNull
    public final androidx.compose.ui.layout.O d(@NotNull Q q10) {
        if (this.f90965e < this.f90963c.size()) {
            androidx.compose.ui.layout.O o10 = this.f90963c.get(this.f90965e);
            this.f90965e++;
            return o10;
        }
        int i10 = this.f90964d;
        if (i10 >= this.f90961a) {
            throw new IndexOutOfBoundsException("No item returned at index call. Index: " + this.f90964d);
        }
        List<androidx.compose.ui.layout.O> listInvoke = this.f90962b.invoke(Integer.valueOf(i10), q10);
        this.f90964d++;
        if (listInvoke.isEmpty()) {
            return e(this, null, 1, null);
        }
        androidx.compose.ui.layout.O o11 = (androidx.compose.ui.layout.O) kotlin.collections.U.G2(listInvoke);
        this.f90963c.addAll(listInvoke);
        this.f90965e++;
        return o11;
    }

    @NotNull
    public androidx.compose.ui.layout.O f() {
        return e(this, null, 1, null);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f90965e < this.f90963c.size() || this.f90964d < this.f90961a;
    }

    @Override // java.util.Iterator
    public androidx.compose.ui.layout.O next() {
        return e(this, null, 1, null);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
