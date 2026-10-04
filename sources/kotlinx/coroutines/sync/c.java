package kotlinx.coroutines.sync;

import com.google.common.util.concurrent.r;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.i;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.internal.N;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,392:1\n366#1,2:393\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n379#1:393,2\n*E\n"})
public final class c extends N<c> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f220794e;

    public c(long j10, @Nullable c cVar, int i10) {
        super(j10, cVar, i10);
        this.f220794e = new AtomicReferenceArray(SemaphoreKt.f220789f);
    }

    public final boolean D(int i10, @Nullable Object obj, @Nullable Object obj2) {
        return r.a(this.f220794e, i10, obj, obj2);
    }

    @Nullable
    public final Object E(int i10) {
        return this.f220794e.get(i10);
    }

    public final /* synthetic */ AtomicReferenceArray F() {
        return this.f220794e;
    }

    @Nullable
    public final Object G(int i10, @Nullable Object obj) {
        return this.f220794e.getAndSet(i10, obj);
    }

    public final void H(int i10, @Nullable Object obj) {
        this.f220794e.set(i10, obj);
    }

    @NotNull
    public String toString() {
        return "SemaphoreSegment[id=" + this.f220301c + ", hashCode=" + hashCode() + ']';
    }

    @Override // kotlinx.coroutines.internal.N
    public int y() {
        return SemaphoreKt.f220789f;
    }

    @Override // kotlinx.coroutines.internal.N
    public void z(int i10, @Nullable Throwable th, @NotNull i iVar) {
        this.f220794e.set(i10, SemaphoreKt.f220788e);
        A();
    }
}
