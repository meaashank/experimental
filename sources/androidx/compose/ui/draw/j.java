package androidx.compose.ui.draw;

import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface j extends p.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull j jVar, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.a(jVar, lVar);
        }

        @Deprecated
        public static boolean b(@NotNull j jVar, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.b(jVar, lVar);
        }

        @Deprecated
        public static <R> R c(@NotNull j jVar, R r10, @NotNull ed.p<? super R, ? super p.c, ? extends R> pVar) {
            return pVar.invoke(r10, jVar);
        }

        @Deprecated
        public static <R> R d(@NotNull j jVar, R r10, @NotNull ed.p<? super p.c, ? super R, ? extends R> pVar) {
            return pVar.invoke(jVar, r10);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.p e(@NotNull j jVar, @NotNull androidx.compose.ui.p pVar) {
            return androidx.compose.ui.o.a(jVar, pVar);
        }
    }

    void N(@NotNull androidx.compose.ui.graphics.drawscope.d dVar);
}
