package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f218700b = AtomicIntegerFieldUpdater.newUpdater(B.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public final Throwable f218701a;

    public B(@NotNull Throwable th, boolean z10) {
        this.f218701a = th;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final boolean a() {
        return f218700b.get(this) != 0;
    }

    public final /* synthetic */ int b() {
        return this._handled$volatile;
    }

    public final boolean d() {
        return f218700b.compareAndSet(this, 0, 1);
    }

    public final /* synthetic */ void e(int i10) {
        this._handled$volatile = i10;
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '[' + this.f218701a + ']';
    }

    public /* synthetic */ B(Throwable th, boolean z10, int i10, C4969v c4969v) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }
}
