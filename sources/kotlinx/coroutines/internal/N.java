package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.internal.N;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n1#1,265:1\n248#2,4:266\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n*L\n221#1:266,4\n*E\n"})
public abstract class N<S extends N<S>> extends AbstractC5073g<S> implements N0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f220300d = AtomicIntegerFieldUpdater.newUpdater(N.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    public final long f220301c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public N(long j10, @Nullable S s10, int i10) {
        super(s10);
        this.f220301c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    public final void A() {
        if (f220300d.incrementAndGet(this) == y()) {
            q();
        }
    }

    public final /* synthetic */ void B(int i10) {
        this.cleanedAndPointers$volatile = i10;
    }

    public final boolean C() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f220300d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == y() && !n()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }

    @Override // kotlinx.coroutines.internal.AbstractC5073g
    public boolean m() {
        return f220300d.get(this) == y() && !n();
    }

    public final boolean v() {
        return f220300d.addAndGet(this, -65536) == y() && !n();
    }

    public final /* synthetic */ int w() {
        return this.cleanedAndPointers$volatile;
    }

    public abstract int y();

    public abstract void z(int i10, @Nullable Throwable th, @NotNull kotlin.coroutines.i iVar);
}
