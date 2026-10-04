package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import kotlin.InterfaceC4887e0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.sequences.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@kotlin.coroutines.k
@InterfaceC4887e0(version = "1.3")
public abstract class AbstractC5002o<T> {
    @Nullable
    public abstract Object b(T t10, @NotNull kotlin.coroutines.e<? super L0> eVar);

    @Nullable
    public final Object d(@NotNull Iterable<? extends T> iterable, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return L0.f217464a;
        }
        Object objE = e(iterable.iterator(), eVar);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : L0.f217464a;
    }

    @Nullable
    public abstract Object e(@NotNull Iterator<? extends T> it, @NotNull kotlin.coroutines.e<? super L0> eVar);

    @Nullable
    public final Object f(@NotNull InterfaceC5000m<? extends T> interfaceC5000m, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objE = e(interfaceC5000m.iterator(), eVar);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : L0.f217464a;
    }
}
