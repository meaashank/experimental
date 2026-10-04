package kotlinx.coroutines.selects;

import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC5107q0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5107q0
    public static final <R> void a(@NotNull b<? super R> bVar, long j10, @NotNull ed.l<? super kotlin.coroutines.e<? super R>, ? extends Object> lVar) {
        bVar.c(new OnTimeout(j10).b(), lVar);
    }

    @InterfaceC5107q0
    public static final <R> void b(@NotNull b<? super R> bVar, long j10, @NotNull ed.l<? super kotlin.coroutines.e<? super R>, ? extends Object> lVar) {
        a(bVar, DelayKt.e(j10), lVar);
    }
}
