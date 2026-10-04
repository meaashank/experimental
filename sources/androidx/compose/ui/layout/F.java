package androidx.compose.ui.layout;

import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface F extends p.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull F f10, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.a(f10, lVar);
        }

        @Deprecated
        public static boolean b(@NotNull F f10, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.b(f10, lVar);
        }

        @Deprecated
        public static <R> R c(@NotNull F f10, R r10, @NotNull ed.p<? super R, ? super p.c, ? extends R> pVar) {
            return pVar.invoke(r10, f10);
        }

        @Deprecated
        public static <R> R d(@NotNull F f10, R r10, @NotNull ed.p<? super p.c, ? super R, ? extends R> pVar) {
            return pVar.invoke(f10, r10);
        }

        @Deprecated
        public static int e(@NotNull F f10, @NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
            return MeasuringIntrinsics.f102482a.a(f10, interfaceC2185u, interfaceC2183s, i10);
        }

        @Deprecated
        public static int f(@NotNull F f10, @NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
            return MeasuringIntrinsics.f102482a.b(f10, interfaceC2185u, interfaceC2183s, i10);
        }

        @Deprecated
        public static int g(@NotNull F f10, @NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
            return MeasuringIntrinsics.f102482a.c(f10, interfaceC2185u, interfaceC2183s, i10);
        }

        @Deprecated
        public static int h(@NotNull F f10, @NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
            return MeasuringIntrinsics.f102482a.d(f10, interfaceC2185u, interfaceC2183s, i10);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.p i(@NotNull F f10, @NotNull androidx.compose.ui.p pVar) {
            return androidx.compose.ui.o.a(f10, pVar);
        }
    }

    int U(@NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10);

    int X(@NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10);

    int d0(@NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10);

    @NotNull
    T g(@NotNull V v10, @NotNull O o10, long j10);

    int k0(@NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10);
}
