package kotlinx.coroutines;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC5117w<T> extends S<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.w$a */
    public static final class a {
        public static <T, R> R b(@NotNull InterfaceC5117w<T> interfaceC5117w, R r10, @NotNull ed.p<? super R, ? super i.b, ? extends R> pVar) {
            return (R) i.b.a.a(interfaceC5117w, r10, pVar);
        }

        @Nullable
        public static <T, E extends i.b> E c(@NotNull InterfaceC5117w<T> interfaceC5117w, @NotNull i.c<E> cVar) {
            return (E) i.b.a.b(interfaceC5117w, cVar);
        }

        @NotNull
        public static <T> kotlin.coroutines.i d(@NotNull InterfaceC5117w<T> interfaceC5117w, @NotNull i.c<?> cVar) {
            return i.b.a.c(interfaceC5117w, cVar);
        }

        @NotNull
        public static <T> kotlin.coroutines.i e(@NotNull InterfaceC5117w<T> interfaceC5117w, @NotNull kotlin.coroutines.i iVar) {
            return i.b.a.d(interfaceC5117w, iVar);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static <T> A0 f(@NotNull InterfaceC5117w<T> interfaceC5117w, @NotNull A0 a02) {
            return a02;
        }
    }

    boolean P(T t10);

    boolean b(@NotNull Throwable th);
}
