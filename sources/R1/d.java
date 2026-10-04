package R1;

import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import ed.l;
import kotlin.L0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@dd.j(name = "InitializerViewModelFactoryKt")
public final class d {
    public static final <VM extends k0> void a(c cVar, l<? super a, ? extends VM> initializer) {
        G.p(cVar, "<this>");
        G.p(initializer, "initializer");
        G.P();
        throw null;
    }

    @NotNull
    public static final m0.c b(@NotNull l<? super c, L0> builder) {
        G.p(builder, "builder");
        c cVar = new c();
        builder.invoke(cVar);
        return cVar.b();
    }
}
