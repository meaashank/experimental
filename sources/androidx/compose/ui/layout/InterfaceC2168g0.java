package androidx.compose.ui.layout;

import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.layout.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2168g0 extends p.c {

    /* JADX INFO: renamed from: androidx.compose.ui.layout.g0$a */
    public static final class a {
        @Deprecated
        public static boolean a(@NotNull InterfaceC2168g0 interfaceC2168g0, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.a(interfaceC2168g0, lVar);
        }

        @Deprecated
        public static boolean b(@NotNull InterfaceC2168g0 interfaceC2168g0, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.b(interfaceC2168g0, lVar);
        }

        @Deprecated
        public static <R> R c(@NotNull InterfaceC2168g0 interfaceC2168g0, R r10, @NotNull ed.p<? super R, ? super p.c, ? extends R> pVar) {
            return pVar.invoke(r10, interfaceC2168g0);
        }

        @Deprecated
        public static <R> R d(@NotNull InterfaceC2168g0 interfaceC2168g0, R r10, @NotNull ed.p<? super p.c, ? super R, ? extends R> pVar) {
            return pVar.invoke(interfaceC2168g0, r10);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.p e(@NotNull InterfaceC2168g0 interfaceC2168g0, @NotNull androidx.compose.ui.p pVar) {
            return androidx.compose.ui.o.a(interfaceC2168g0, pVar);
        }
    }

    void n0(@NotNull InterfaceC2188x interfaceC2188x);
}
