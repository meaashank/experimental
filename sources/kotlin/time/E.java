package kotlin.time;

import kotlin.InterfaceC4887e0;
import kotlin.O0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.9")
@O0(markerClass = {n.class})
public interface E {

    public static final class a {
        public static boolean a(@NotNull E e10) {
            return C5041h.S(e10.a());
        }

        public static boolean b(@NotNull E e10) {
            return !C5041h.S(e10.a());
        }

        @NotNull
        public static E c(@NotNull E e10, long j10) {
            return e10.o(C5041h.l0(j10));
        }

        @NotNull
        public static E d(@NotNull E e10, long j10) {
            return new C5037d(e10, j10);
        }
    }

    long a();

    boolean b();

    boolean c();

    @NotNull
    E o(long j10);

    @NotNull
    E q(long j10);
}
