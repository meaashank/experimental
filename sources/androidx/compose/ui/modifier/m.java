package androidx.compose.ui.modifier;

import androidx.compose.runtime.T1;
import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T1
public interface m<T> extends p.c {

    public static final class a {
        @Deprecated
        public static <T> boolean a(@NotNull m<T> mVar, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.a(mVar, lVar);
        }

        @Deprecated
        public static <T> boolean b(@NotNull m<T> mVar, @NotNull ed.l<? super p.c, Boolean> lVar) {
            return androidx.compose.ui.q.b(mVar, lVar);
        }

        @Deprecated
        public static <T, R> R c(@NotNull m<T> mVar, R r10, @NotNull ed.p<? super R, ? super p.c, ? extends R> pVar) {
            return pVar.invoke(r10, mVar);
        }

        @Deprecated
        public static <T, R> R d(@NotNull m<T> mVar, R r10, @NotNull ed.p<? super p.c, ? super R, ? extends R> pVar) {
            return pVar.invoke(mVar, r10);
        }

        @Deprecated
        @NotNull
        public static <T> androidx.compose.ui.p e(@NotNull m<T> mVar, @NotNull androidx.compose.ui.p pVar) {
            return androidx.compose.ui.o.a(mVar, pVar);
        }
    }

    @NotNull
    p<T> getKey();

    T getValue();
}
