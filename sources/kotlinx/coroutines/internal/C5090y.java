package kotlinx.coroutines.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5090y<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f220367a = AtomicReferenceFieldUpdater.newUpdater(C5090y.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public C5090y(boolean z10) {
        this._cur$volatile = new C5091z(8, z10);
    }

    public final boolean a(@NotNull E e10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220367a;
        while (true) {
            C5091z c5091z = (C5091z) atomicReferenceFieldUpdater.get(this);
            int iA = c5091z.a(e10);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                androidx.concurrent.futures.c.a(f220367a, this, c5091z, c5091z.r());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220367a;
        while (true) {
            C5091z c5091z = (C5091z) atomicReferenceFieldUpdater.get(this);
            if (c5091z.d()) {
                return;
            } else {
                androidx.concurrent.futures.c.a(f220367a, this, c5091z, c5091z.r());
            }
        }
    }

    public final int c() {
        return ((C5091z) f220367a.get(this)).g();
    }

    public final /* synthetic */ Object d() {
        return this._cur$volatile;
    }

    public final boolean f() {
        return ((C5091z) f220367a.get(this)).l();
    }

    public final boolean g() {
        return ((C5091z) f220367a.get(this)).m();
    }

    public final /* synthetic */ void h(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ed.l<Object, L0> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @NotNull
    public final <R> List<R> i(@NotNull ed.l<? super E, ? extends R> lVar) {
        return ((C5091z) f220367a.get(this)).p(lVar);
    }

    @Nullable
    public final E j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220367a;
        while (true) {
            C5091z c5091z = (C5091z) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) c5091z.s();
            if (e10 != C5091z.f220383t) {
                return e10;
            }
            androidx.concurrent.futures.c.a(f220367a, this, c5091z, c5091z.r());
        }
    }

    public final /* synthetic */ void k(Object obj) {
        this._cur$volatile = obj;
    }
}
