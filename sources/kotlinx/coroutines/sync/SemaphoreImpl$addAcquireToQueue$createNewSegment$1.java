package kotlinx.coroutines.sync;

import ed.p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class SemaphoreImpl$addAcquireToQueue$createNewSegment$1 extends FunctionReferenceImpl implements p<Long, c, c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SemaphoreImpl$addAcquireToQueue$createNewSegment$1 f220781a = new SemaphoreImpl$addAcquireToQueue$createNewSegment$1();

    public SemaphoreImpl$addAcquireToQueue$createNewSegment$1() {
        super(2, SemaphoreKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @NotNull
    public final c e(long j10, @Nullable c cVar) {
        return SemaphoreKt.j(j10, cVar);
    }

    @Override // ed.p
    public c invoke(Long l10, c cVar) {
        return SemaphoreKt.j(l10.longValue(), cVar);
    }
}
