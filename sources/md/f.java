package md;

import java.lang.Comparable;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.1")
public interface f<T extends Comparable<? super T>> extends g<T> {

    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@NotNull f<T> fVar, @NotNull T value) {
            G.p(value, "value");
            return fVar.g(fVar.b(), value) && fVar.g(value, fVar.h());
        }

        public static <T extends Comparable<? super T>> boolean b(@NotNull f<T> fVar) {
            return !fVar.g(fVar.b(), fVar.h());
        }
    }

    @Override // md.g
    boolean contains(@NotNull T t10);

    boolean g(@NotNull T t10, @NotNull T t11);

    @Override // md.g
    boolean isEmpty();
}
