package kotlinx.coroutines.selects;

import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class m {
    @Nullable
    public static final <R> Object a(@NotNull ed.l<? super b<? super R>, L0> lVar, @NotNull kotlin.coroutines.e<? super R> eVar) {
        n nVar = new n(eVar.getContext());
        lVar.invoke(nVar);
        return nVar.w(eVar);
    }

    public static final <R> Object b(ed.l<? super b<? super R>, L0> lVar, kotlin.coroutines.e<? super R> eVar) {
        throw null;
    }
}
