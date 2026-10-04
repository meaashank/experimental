package md;

import java.lang.Comparable;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface g<T extends Comparable<? super T>> {

    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@NotNull g<T> gVar, @NotNull T value) {
            G.p(value, "value");
            return value.compareTo(gVar.b()) >= 0 && value.compareTo(gVar.h()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean b(@NotNull g<T> gVar) {
            return gVar.b().compareTo(gVar.h()) > 0;
        }
    }

    @NotNull
    T b();

    boolean contains(@NotNull T t10);

    @NotNull
    T h();

    boolean isEmpty();
}
