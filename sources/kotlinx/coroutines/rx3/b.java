package kotlinx.coroutines.rx3;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import kotlin.C4987s;
import kotlinx.coroutines.I;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static final void a(@NotNull Throwable th, @NotNull kotlin.coroutines.i iVar) throws IllegalAccessException, InvocationTargetException {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            Ic.a.Y(th);
        } catch (Throwable th2) {
            C4987s.a(th, th2);
            I.b(iVar, th);
        }
    }
}
