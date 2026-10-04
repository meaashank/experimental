package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.AbstractC5093j0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlinx.coroutines.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC5095k0 extends AbstractC5066i0 {
    @NotNull
    public abstract Thread b4();

    public void c4(long j10, @NotNull AbstractC5093j0.c cVar) {
        P.f218782i.s4(j10, cVar);
    }

    public final void d4() {
        kotlin.L0 l02;
        Thread threadB4 = b4();
        if (Thread.currentThread() != threadB4) {
            AbstractC5051b abstractC5051b = C5053c.f218833a;
            if (abstractC5051b != null) {
                abstractC5051b.g(threadB4);
                l02 = kotlin.L0.f217464a;
            } else {
                l02 = null;
            }
            if (l02 == null) {
                LockSupport.unpark(threadB4);
            }
        }
    }
}
