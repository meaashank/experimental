package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5122y0 extends B0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f220808f = AtomicIntegerFieldUpdater.newUpdater(C5122y0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final InterfaceC5118w0 f220809e;

    public C5122y0(@NotNull InterfaceC5118w0 interfaceC5118w0) {
        this.f220809e = interfaceC5118w0;
    }

    public final /* synthetic */ int I() {
        return this._invoked$volatile;
    }

    public final /* synthetic */ void K(int i10) {
        this._invoked$volatile = i10;
    }

    @Override // kotlinx.coroutines.InterfaceC5118w0
    public void a(@Nullable Throwable th) {
        if (f220808f.compareAndSet(this, 0, 1)) {
            this.f220809e.a(th);
        }
    }
}
