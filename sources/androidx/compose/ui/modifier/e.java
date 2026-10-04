package androidx.compose.ui.modifier;

import androidx.compose.runtime.T1;
import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T1
public interface e extends p.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull e eVar, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.a(eVar, lVar);
        }

        @Deprecated
        public static boolean b(@NotNull e eVar, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.b(eVar, lVar);
        }

        @Deprecated
        public static <R> R c(@NotNull e eVar, R r10, @NotNull ed.p<? super R, ? super p.c, ? extends R> pVar) {
            return pVar.invoke(r10, eVar);
        }

        @Deprecated
        public static <R> R d(@NotNull e eVar, R r10, @NotNull ed.p<? super p.c, ? super R, ? extends R> pVar) {
            return pVar.invoke(eVar, r10);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.p e(@NotNull e eVar, @NotNull androidx.compose.ui.p pVar) {
            return androidx.compose.ui.o.a(eVar, pVar);
        }
    }

    void a2(@NotNull n nVar);
}
