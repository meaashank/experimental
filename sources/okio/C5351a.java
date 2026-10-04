package okio;

import java.util.zip.Deflater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@dd.j(name = "-DeflaterSinkExtensions")
public final class C5351a {
    @NotNull
    public static final C5365o a(@NotNull c0 c0Var, @NotNull Deflater deflater) {
        kotlin.jvm.internal.G.p(c0Var, "<this>");
        kotlin.jvm.internal.G.p(deflater, "deflater");
        return new C5365o(c0Var, deflater);
    }

    public static /* synthetic */ C5365o b(c0 c0Var, Deflater deflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deflater = new Deflater();
        }
        kotlin.jvm.internal.G.p(c0Var, "<this>");
        kotlin.jvm.internal.G.p(deflater, "deflater");
        return new C5365o(c0Var, deflater);
    }
}
