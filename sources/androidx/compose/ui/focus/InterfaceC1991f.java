package androidx.compose.ui.focus;

import androidx.compose.ui.p;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.focus.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC4982o(message = "Use FocusEventModifierNode instead")
public interface InterfaceC1991f extends p.c {

    /* JADX INFO: renamed from: androidx.compose.ui.focus.f$a */
    public static final class a {
        @Deprecated
        public static boolean a(@NotNull InterfaceC1991f interfaceC1991f, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.a(interfaceC1991f, lVar);
        }

        @Deprecated
        public static boolean b(@NotNull InterfaceC1991f interfaceC1991f, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.b(interfaceC1991f, lVar);
        }

        @Deprecated
        public static <R> R c(@NotNull InterfaceC1991f interfaceC1991f, R r10, @NotNull ed.p<? super R, ? super p.c, ? extends R> pVar) {
            return pVar.invoke(r10, interfaceC1991f);
        }

        @Deprecated
        public static <R> R d(@NotNull InterfaceC1991f interfaceC1991f, R r10, @NotNull ed.p<? super p.c, ? super R, ? extends R> pVar) {
            return pVar.invoke(interfaceC1991f, r10);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.p e(@NotNull InterfaceC1991f interfaceC1991f, @NotNull androidx.compose.ui.p pVar) {
            return androidx.compose.ui.o.a(interfaceC1991f, pVar);
        }
    }

    void a0(@NotNull H h10);
}
