package kotlin;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class J extends I {
    @Xc.f
    public static final <T> T d(G<? extends T> g10, Object obj, kotlin.reflect.n<?> property) {
        kotlin.jvm.internal.G.p(g10, "<this>");
        kotlin.jvm.internal.G.p(property, "property");
        return g10.getValue();
    }

    @NotNull
    public static final <T> G<T> e(T t10) {
        return new InitializedLazyImpl(t10);
    }
}
