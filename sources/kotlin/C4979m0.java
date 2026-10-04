package kotlin;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@dd.j(name = "TuplesKt")
public final class C4979m0 {
    @NotNull
    public static final <A, B> Pair<A, B> a(A a10, B b10) {
        return new Pair<>(a10, b10);
    }

    @NotNull
    public static final <T> List<T> b(@NotNull Pair<? extends T, ? extends T> pair) {
        kotlin.jvm.internal.G.p(pair, "<this>");
        return kotlin.collections.I.Q(pair.f217467a, pair.f217468b);
    }

    @NotNull
    public static final <T> List<T> c(@NotNull Triple<? extends T, ? extends T, ? extends T> triple) {
        kotlin.jvm.internal.G.p(triple, "<this>");
        return kotlin.collections.I.Q(triple.f217480a, triple.f217481b, triple.f217482c);
    }
}
