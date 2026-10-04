package C4;

import C4.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class k {
    @Nullable
    public static final <T> T a(@NotNull j<? extends T> jVar) {
        G.p(jVar, "<this>");
        if (jVar instanceof j.c) {
            return ((j.c) jVar).f17561c;
        }
        if (jVar.equals(j.b.f17558c)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
