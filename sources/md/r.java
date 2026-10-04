package md;

import java.lang.Comparable;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC5043v;
import kotlin.O0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.9")
@O0(markerClass = {InterfaceC5043v.class})
public interface r<T extends Comparable<? super T>> {

    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@NotNull r<T> rVar, @NotNull T value) {
            G.p(value, "value");
            return value.compareTo(rVar.b()) >= 0 && value.compareTo(rVar.i()) < 0;
        }

        public static <T extends Comparable<? super T>> boolean b(@NotNull r<T> rVar) {
            return rVar.b().compareTo(rVar.i()) >= 0;
        }
    }

    @NotNull
    T b();

    boolean contains(@NotNull T t10);

    @NotNull
    T i();

    boolean isEmpty();
}
