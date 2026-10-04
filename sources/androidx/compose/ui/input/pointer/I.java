package androidx.compose.ui.input.pointer;

import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface I extends p.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull I i10, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.a(i10, lVar);
        }

        @Deprecated
        public static boolean b(@NotNull I i10, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.b(i10, lVar);
        }

        @Deprecated
        public static <R> R c(@NotNull I i10, R r10, @NotNull ed.p<? super R, ? super p.c, ? extends R> pVar) {
            return pVar.invoke(r10, i10);
        }

        @Deprecated
        public static <R> R d(@NotNull I i10, R r10, @NotNull ed.p<? super p.c, ? super R, ? extends R> pVar) {
            return pVar.invoke(i10, r10);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.p e(@NotNull I i10, @NotNull androidx.compose.ui.p pVar) {
            return androidx.compose.ui.o.a(i10, pVar);
        }
    }

    @NotNull
    G g2();
}
