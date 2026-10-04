package androidx.compose.ui.draw;

import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface h extends j {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull h hVar, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.a(hVar, lVar);
        }

        @Deprecated
        public static boolean b(@NotNull h hVar, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.b(hVar, lVar);
        }

        @Deprecated
        public static <R> R c(@NotNull h hVar, R r10, @NotNull ed.p<? super R, ? super p.c, ? extends R> pVar) {
            return pVar.invoke(r10, hVar);
        }

        @Deprecated
        public static <R> R d(@NotNull h hVar, R r10, @NotNull ed.p<? super p.c, ? super R, ? extends R> pVar) {
            return pVar.invoke(hVar, r10);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.p e(@NotNull h hVar, @NotNull androidx.compose.ui.p pVar) {
            return androidx.compose.ui.o.a(hVar, pVar);
        }
    }

    void b1(@NotNull c cVar);
}
