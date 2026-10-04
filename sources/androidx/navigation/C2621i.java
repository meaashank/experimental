package androidx.navigation;

import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.navigation.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2621i {
    @NotNull
    public static final C2620h a(@NotNull String name, @NotNull ed.l<? super C2627o, L0> builder) {
        kotlin.jvm.internal.G.p(name, "name");
        kotlin.jvm.internal.G.p(builder, "builder");
        C2627o c2627o = new C2627o();
        builder.invoke(c2627o);
        return new C2620h(name, c2627o.f115289a.build());
    }
}
