package androidx.compose.ui.layout;

import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.layout.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2176k0 extends p.c {

    /* JADX INFO: renamed from: androidx.compose.ui.layout.k0$a */
    public static final class a {
        @Deprecated
        public static boolean a(@NotNull InterfaceC2176k0 interfaceC2176k0, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.a(interfaceC2176k0, lVar);
        }

        @Deprecated
        public static boolean b(@NotNull InterfaceC2176k0 interfaceC2176k0, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.b(interfaceC2176k0, lVar);
        }

        @Deprecated
        public static <R> R c(@NotNull InterfaceC2176k0 interfaceC2176k0, R r10, @NotNull ed.p<? super R, ? super p.c, ? extends R> pVar) {
            return pVar.invoke(r10, interfaceC2176k0);
        }

        @Deprecated
        public static <R> R d(@NotNull InterfaceC2176k0 interfaceC2176k0, R r10, @NotNull ed.p<? super p.c, ? super R, ? extends R> pVar) {
            return pVar.invoke(interfaceC2176k0, r10);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.p e(@NotNull InterfaceC2176k0 interfaceC2176k0, @NotNull androidx.compose.ui.p pVar) {
            return androidx.compose.ui.o.a(interfaceC2176k0, pVar);
        }
    }

    void D(@NotNull InterfaceC2188x interfaceC2188x);
}
