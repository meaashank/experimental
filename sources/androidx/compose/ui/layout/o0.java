package androidx.compose.ui.layout;

import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface o0 extends p.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull o0 o0Var, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.a(o0Var, lVar);
        }

        @Deprecated
        public static boolean b(@NotNull o0 o0Var, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.b(o0Var, lVar);
        }

        @Deprecated
        public static <R> R c(@NotNull o0 o0Var, R r10, @NotNull ed.p<? super R, ? super p.c, ? extends R> pVar) {
            return pVar.invoke(r10, o0Var);
        }

        @Deprecated
        public static <R> R d(@NotNull o0 o0Var, R r10, @NotNull ed.p<? super p.c, ? super R, ? extends R> pVar) {
            return pVar.invoke(o0Var, r10);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.p e(@NotNull o0 o0Var, @NotNull androidx.compose.ui.p pVar) {
            return androidx.compose.ui.o.a(o0Var, pVar);
        }
    }

    void c0(long j10);
}
