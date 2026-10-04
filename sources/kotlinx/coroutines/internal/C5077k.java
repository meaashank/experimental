package kotlinx.coroutines.internal;

import java.util.Iterator;
import kotlin.C4987s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5077k {
    public static final void a(@NotNull kotlin.coroutines.i iVar, @NotNull Throwable th) {
        Iterator<kotlinx.coroutines.H> it = C5076j.b().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(iVar, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                C5076j.c(kotlinx.coroutines.I.c(th, th2));
            }
        }
        try {
            C4987s.a(th, new DiagnosticCoroutineContextException(iVar));
        } catch (Throwable unused2) {
        }
        C5076j.c(th);
    }
}
