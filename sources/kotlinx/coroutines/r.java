package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f220432c = AtomicIntegerFieldUpdater.newUpdater(r.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public r(@NotNull kotlin.coroutines.e<?> eVar, @Nullable Throwable th, boolean z10) {
        if (th == null) {
            th = new CancellationException("Continuation " + eVar + " was cancelled normally");
        }
        super(th, z10);
        this._resumed$volatile = 0;
    }

    public final /* synthetic */ int f() {
        return this._resumed$volatile;
    }

    public final boolean h() {
        return f220432c.compareAndSet(this, 0, 1);
    }

    public final /* synthetic */ void i(int i10) {
        this._resumed$volatile = i10;
    }
}
