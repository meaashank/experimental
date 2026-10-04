package kotlinx.coroutines;

import java.lang.reflect.InvocationTargetException;
import kotlin.collections.C4871m;
import kotlinx.coroutines.internal.C5085t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,540:1\n1#2:541\n*E\n"})
public abstract class AbstractC5066i0 extends CoroutineDispatcher {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f220265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f220266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public C4871m<Y<?>> f220267e;

    public static /* synthetic */ void d3(AbstractC5066i0 abstractC5066i0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC5066i0.Z2(z10);
    }

    public static /* synthetic */ void x3(AbstractC5066i0 abstractC5066i0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC5066i0.v3(z10);
    }

    public boolean J3() {
        return X3();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public final CoroutineDispatcher R2(int i10) {
        C5085t.a(i10);
        return this;
    }

    public final boolean U3() {
        return this.f220265c >= 4294967296L;
    }

    public final boolean X3() {
        C4871m<Y<?>> c4871m = this.f220267e;
        if (c4871m != null) {
            return c4871m.isEmpty();
        }
        return true;
    }

    public long Y3() {
        return !Z3() ? Long.MAX_VALUE : 0L;
    }

    public final void Z2(boolean z10) {
        long jK3 = this.f220265c - k3(z10);
        this.f220265c = jK3;
        if (jK3 <= 0 && this.f220266d) {
            shutdown();
        }
    }

    public final boolean Z3() throws IllegalAccessException, InvocationTargetException {
        Y<?> yE;
        C4871m<Y<?>> c4871m = this.f220267e;
        if (c4871m == null || (yE = c4871m.E()) == null) {
            return false;
        }
        yE.run();
        return true;
    }

    public boolean a4() {
        return false;
    }

    public final boolean isActive() {
        return this.f220265c > 0;
    }

    public final long k3(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public final void m3(@NotNull Y<?> y10) {
        C4871m<Y<?>> c4871m = this.f220267e;
        if (c4871m == null) {
            c4871m = new C4871m<>();
            this.f220267e = c4871m;
        }
        c4871m.addLast(y10);
    }

    public long q3() {
        C4871m<Y<?>> c4871m = this.f220267e;
        return (c4871m == null || c4871m.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public void shutdown() {
    }

    public final void v3(boolean z10) {
        this.f220265c = k3(z10) + this.f220265c;
        if (z10) {
            return;
        }
        this.f220266d = true;
    }
}
