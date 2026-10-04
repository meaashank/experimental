package androidx.compose.ui.focus;

import androidx.compose.ui.p;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC4982o(message = "Use FocusRequesterModifierNode instead")
public interface D extends p.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull D d10, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.a(d10, lVar);
        }

        @Deprecated
        public static boolean b(@NotNull D d10, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.b(d10, lVar);
        }

        @Deprecated
        public static <R> R c(@NotNull D d10, R r10, @NotNull ed.p<? super R, ? super p.c, ? extends R> pVar) {
            return pVar.invoke(r10, d10);
        }

        @Deprecated
        public static <R> R d(@NotNull D d10, R r10, @NotNull ed.p<? super p.c, ? super R, ? extends R> pVar) {
            return pVar.invoke(d10, r10);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.p e(@NotNull D d10, @NotNull androidx.compose.ui.p pVar) {
            return androidx.compose.ui.o.a(d10, pVar);
        }
    }

    @NotNull
    FocusRequester u0();
}
