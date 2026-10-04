package kotlinx.coroutines;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC5123z extends A0 {

    /* JADX INFO: renamed from: kotlinx.coroutines.z$a */
    public static final class a {
        public static <R> R b(@NotNull InterfaceC5123z interfaceC5123z, R r10, @NotNull ed.p<? super R, ? super i.b, ? extends R> pVar) {
            return (R) i.b.a.a(interfaceC5123z, r10, pVar);
        }

        @Nullable
        public static <E extends i.b> E c(@NotNull InterfaceC5123z interfaceC5123z, @NotNull i.c<E> cVar) {
            return (E) i.b.a.b(interfaceC5123z, cVar);
        }

        @NotNull
        public static kotlin.coroutines.i d(@NotNull InterfaceC5123z interfaceC5123z, @NotNull i.c<?> cVar) {
            return i.b.a.c(interfaceC5123z, cVar);
        }

        @NotNull
        public static kotlin.coroutines.i e(@NotNull InterfaceC5123z interfaceC5123z, @NotNull kotlin.coroutines.i iVar) {
            return i.b.a.d(interfaceC5123z, iVar);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static A0 f(@NotNull InterfaceC5123z interfaceC5123z, @NotNull A0 a02) {
            return a02;
        }
    }

    boolean b(@NotNull Throwable th);

    boolean k();
}
