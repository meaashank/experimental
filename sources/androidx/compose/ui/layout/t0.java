package androidx.compose.ui.layout;

import androidx.compose.ui.p;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface t0 extends p.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull t0 t0Var, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.a(t0Var, lVar);
        }

        @Deprecated
        public static boolean b(@NotNull t0 t0Var, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.b(t0Var, lVar);
        }

        @Deprecated
        public static <R> R c(@NotNull t0 t0Var, R r10, @NotNull ed.p<? super R, ? super p.c, ? extends R> pVar) {
            return pVar.invoke(r10, t0Var);
        }

        @Deprecated
        public static <R> R d(@NotNull t0 t0Var, R r10, @NotNull ed.p<? super p.c, ? super R, ? extends R> pVar) {
            return pVar.invoke(t0Var, r10);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.p e(@NotNull t0 t0Var, @NotNull androidx.compose.ui.p pVar) {
            return androidx.compose.ui.o.a(t0Var, pVar);
        }
    }

    @Nullable
    Object h0(@NotNull InterfaceC4814e interfaceC4814e, @Nullable Object obj);
}
