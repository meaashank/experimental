package androidx.compose.ui.semantics;

import androidx.compose.ui.p;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface n extends p.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull n nVar, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.a(nVar, lVar);
        }

        @Deprecated
        public static boolean b(@NotNull n nVar, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.b(nVar, lVar);
        }

        @Deprecated
        public static <R> R c(@NotNull n nVar, R r10, @NotNull ed.p<? super R, ? super p.c, ? extends R> pVar) {
            return pVar.invoke(r10, nVar);
        }

        @Deprecated
        public static <R> R d(@NotNull n nVar, R r10, @NotNull ed.p<? super p.c, ? super R, ? extends R> pVar) {
            return pVar.invoke(nVar, r10);
        }

        @Deprecated
        public static int e(@NotNull n nVar) {
            return -1;
        }

        @InterfaceC4982o(message = "SemanticsModifier.id is now unused and has been set to a fixed value. Retrieve the id from LayoutInfo instead.", replaceWith = @InterfaceC4852c0(expression = "", imports = {}))
        public static /* synthetic */ void f() {
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.p g(@NotNull n nVar, @NotNull androidx.compose.ui.p pVar) {
            return androidx.compose.ui.o.a(nVar, pVar);
        }
    }

    int getId();

    @NotNull
    l v2();
}
