package kotlin.time;

import kotlin.InterfaceC4887e0;
import kotlin.O0;
import kotlin.time.E;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.time.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.9")
@O0(markerClass = {n.class})
public interface InterfaceC5040g extends E, Comparable<InterfaceC5040g> {

    /* JADX INFO: renamed from: kotlin.time.g$a */
    public static final class a {
        public static int a(@NotNull InterfaceC5040g interfaceC5040g, @NotNull InterfaceC5040g other) {
            kotlin.jvm.internal.G.p(other, "other");
            long jP = interfaceC5040g.P(other);
            C5041h.f218418b.getClass();
            return C5041h.k(jP, C5041h.f218419c);
        }

        public static boolean b(@NotNull InterfaceC5040g interfaceC5040g) {
            return E.a.a(interfaceC5040g);
        }

        public static boolean c(@NotNull InterfaceC5040g interfaceC5040g) {
            return E.a.b(interfaceC5040g);
        }

        @NotNull
        public static InterfaceC5040g d(@NotNull InterfaceC5040g interfaceC5040g, long j10) {
            return interfaceC5040g.o(C5041h.l0(j10));
        }
    }

    int J3(@NotNull InterfaceC5040g interfaceC5040g);

    long P(@NotNull InterfaceC5040g interfaceC5040g);

    boolean equals(@Nullable Object obj);

    int hashCode();

    @Override // kotlin.time.E
    @NotNull
    InterfaceC5040g o(long j10);

    @Override // kotlin.time.E
    @NotNull
    InterfaceC5040g q(long j10);
}
