package androidx.collection;

import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import y3.C5813b;

/* JADX INFO: renamed from: androidx.collection.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1524c {
    @NotNull
    public static final <K, V> C1520a<K, V> a() {
        return new C1520a<>();
    }

    @NotNull
    public static final <K, V> C1520a<K, V> b(@NotNull Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.G.p(pairs, "pairs");
        C5813b c5813b = (C1520a<K, V>) new C1520a(pairs.length);
        for (Pair<? extends K, ? extends V> pair : pairs) {
            c5813b.put(pair.f217467a, pair.f217468b);
        }
        return c5813b;
    }
}
