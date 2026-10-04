package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class g1 implements InterfaceC5118w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f220259d = AtomicIntegerFieldUpdater.newUpdater(g1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final A0 f220260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread f220261b = Thread.currentThread();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public InterfaceC5058e0 f220262c;

    public g1(@NotNull A0 a02) {
        this.f220260a = a02;
    }

    @Override // kotlinx.coroutines.InterfaceC5118w0
    public void a(@Nullable Throwable th) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f220259d;
        do {
            i10 = atomicIntegerFieldUpdater2.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                e(i10);
                throw null;
            }
            atomicIntegerFieldUpdater = f220259d;
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 2));
        this.f220261b.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void b() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f220259d;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        e(i10);
                        throw null;
                    }
                }
            } else if (f220259d.compareAndSet(this, i10, 1)) {
                InterfaceC5058e0 interfaceC5058e0 = this.f220262c;
                if (interfaceC5058e0 != null) {
                    interfaceC5058e0.dispose();
                    return;
                }
                return;
            }
        }
    }

    public final /* synthetic */ int c() {
        return this._state$volatile;
    }

    public final Void e(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    public final /* synthetic */ void f(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, ed.l<? super Integer, kotlin.L0> lVar) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    public final /* synthetic */ void g(int i10) {
        this._state$volatile = i10;
    }

    public final void h() {
        int i10;
        this.f220262c = JobKt__JobKt.A(this.f220260a, true, true, this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f220259d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2 || i10 == 3) {
                    return;
                }
                e(i10);
                throw null;
            }
        } while (!f220259d.compareAndSet(this, i10, 0));
    }
}
