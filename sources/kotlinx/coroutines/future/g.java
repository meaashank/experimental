package kotlinx.coroutines.future;

import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import kotlin.C4885d0;
import kotlin.L0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class g<T> implements BiFunction<T, Throwable, L0> {

    @dd.g
    @Nullable
    public volatile kotlin.coroutines.e<? super T> cont;

    public g(@Nullable kotlin.coroutines.e<? super T> eVar) {
        this.cont = eVar;
    }

    public void a(@Nullable T t10, @Nullable Throwable th) {
        Throwable cause;
        kotlin.coroutines.e<? super T> eVar = this.cont;
        if (eVar == null) {
            return;
        }
        if (th == null) {
            eVar.resumeWith(t10);
            return;
        }
        CompletionException completionExceptionA = d.a(th) ? e.a(th) : null;
        if (completionExceptionA != null && (cause = completionExceptionA.getCause()) != null) {
            th = cause;
        }
        eVar.resumeWith(C4885d0.a(th));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ L0 apply(Object obj, Throwable th) {
        a(obj, th);
        return L0.f217464a;
    }
}
