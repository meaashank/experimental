package androidx.compose.ui.layout;

import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface z0 extends p.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull z0 z0Var, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.a(z0Var, lVar);
        }

        @Deprecated
        public static boolean b(@NotNull z0 z0Var, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.b(z0Var, lVar);
        }

        @Deprecated
        public static <R> R c(@NotNull z0 z0Var, R r10, @NotNull ed.p<? super R, ? super p.c, ? extends R> pVar) {
            return pVar.invoke(r10, z0Var);
        }

        @Deprecated
        public static <R> R d(@NotNull z0 z0Var, R r10, @NotNull ed.p<? super p.c, ? super R, ? extends R> pVar) {
            return pVar.invoke(z0Var, r10);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.p e(@NotNull z0 z0Var, @NotNull androidx.compose.ui.p pVar) {
            return androidx.compose.ui.o.a(z0Var, pVar);
        }
    }

    void N1(@NotNull x0 x0Var);
}
