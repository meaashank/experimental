package androidx.compose.foundation.lazy;

import androidx.compose.foundation.L;
import androidx.compose.runtime.InterfaceC1946s;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@B
public interface x {

    public static final class a {
        @Deprecated
        public static void b(@NotNull x xVar, @Nullable Object obj, @Nullable Object obj2, @NotNull ed.q<? super c, ? super InterfaceC1946s, ? super Integer, L0> qVar) {
            LazyListScope$CC.b(xVar, obj, obj2, qVar);
            throw null;
        }

        @Deprecated
        public static void e(@NotNull x xVar, int i10, @Nullable ed.l<? super Integer, ? extends Object> lVar, @NotNull ed.l<? super Integer, ? extends Object> lVar2, @NotNull ed.r<? super c, ? super Integer, ? super InterfaceC1946s, ? super Integer, L0> rVar) {
            LazyListScope$CC.c(xVar, i10, lVar, lVar2, rVar);
            throw null;
        }
    }

    @L
    void a(@Nullable Object obj, @Nullable Object obj2, @NotNull ed.q<? super c, ? super InterfaceC1946s, ? super Integer, L0> qVar);

    void b(@Nullable Object obj, @Nullable Object obj2, @NotNull ed.q<? super c, ? super InterfaceC1946s, ? super Integer, L0> qVar);

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ void c(Object obj, ed.q qVar);

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ void e(int i10, ed.l lVar, ed.r rVar);

    void f(int i10, @Nullable ed.l<? super Integer, ? extends Object> lVar, @NotNull ed.l<? super Integer, ? extends Object> lVar2, @NotNull ed.r<? super c, ? super Integer, ? super InterfaceC1946s, ? super Integer, L0> rVar);
}
