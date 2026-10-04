package kotlinx.coroutines.selects;

import ed.p;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlinx.coroutines.InterfaceC5107q0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface b<R> {

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static <R, P, Q> void a(@NotNull b<? super R> bVar, @NotNull g<? super P, ? extends Q> gVar, @NotNull p<? super Q, ? super kotlin.coroutines.e<? super R>, ? extends Object> pVar) {
            bVar.i(gVar, null, pVar);
        }

        @Xc.i
        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @InterfaceC4852c0(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
        @InterfaceC5107q0
        public static <R> void b(@NotNull b<? super R> bVar, long j10, @NotNull ed.l<? super kotlin.coroutines.e<? super R>, ? extends Object> lVar) {
            kotlinx.coroutines.selects.a.a(bVar, j10, lVar);
        }
    }

    void c(@NotNull c cVar, @NotNull ed.l<? super kotlin.coroutines.e<? super R>, ? extends Object> lVar);

    <Q> void d(@NotNull e<? extends Q> eVar, @NotNull p<? super Q, ? super kotlin.coroutines.e<? super R>, ? extends Object> pVar);

    @Xc.i
    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @InterfaceC4852c0(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    @InterfaceC5107q0
    void e(long j10, @NotNull ed.l<? super kotlin.coroutines.e<? super R>, ? extends Object> lVar);

    <P, Q> void h(@NotNull g<? super P, ? extends Q> gVar, @NotNull p<? super Q, ? super kotlin.coroutines.e<? super R>, ? extends Object> pVar);

    <P, Q> void i(@NotNull g<? super P, ? extends Q> gVar, P p10, @NotNull p<? super Q, ? super kotlin.coroutines.e<? super R>, ? extends Object> pVar);
}
