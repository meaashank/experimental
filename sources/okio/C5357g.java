package okio;

import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@dd.j(name = "-InflaterSourceExtensions")
public final class C5357g {
    @NotNull
    public static final A a(@NotNull e0 e0Var, @NotNull Inflater inflater) {
        kotlin.jvm.internal.G.p(e0Var, "<this>");
        kotlin.jvm.internal.G.p(inflater, "inflater");
        return new A(e0Var, inflater);
    }

    public static /* synthetic */ A b(e0 e0Var, Inflater inflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inflater = new Inflater();
        }
        kotlin.jvm.internal.G.p(e0Var, "<this>");
        kotlin.jvm.internal.G.p(inflater, "inflater");
        return new A(e0Var, inflater);
    }
}
