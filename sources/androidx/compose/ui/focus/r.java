package androidx.compose.ui.focus;

import androidx.compose.ui.p;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC4982o(message = "Use Modifier.focusProperties() instead")
public interface r extends p.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull r rVar, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.a(rVar, lVar);
        }

        @Deprecated
        public static boolean b(@NotNull r rVar, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.b(rVar, lVar);
        }

        @Deprecated
        public static <R> R c(@NotNull r rVar, R r10, @NotNull ed.p<? super R, ? super p.c, ? extends R> pVar) {
            return pVar.invoke(r10, rVar);
        }

        @Deprecated
        public static <R> R d(@NotNull r rVar, R r10, @NotNull ed.p<? super p.c, ? super R, ? extends R> pVar) {
            return pVar.invoke(rVar, r10);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.p e(@NotNull r rVar, @NotNull androidx.compose.ui.p pVar) {
            return androidx.compose.ui.o.a(rVar, pVar);
        }
    }

    void h1(@NotNull p pVar);
}
