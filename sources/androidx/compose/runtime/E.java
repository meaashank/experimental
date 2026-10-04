package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nCompositionLocalMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
public final class E {
    public static final <T> boolean a(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap, @NotNull A<T> a10) {
        kotlin.jvm.internal.G.n(a10, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return persistentCompositionLocalMap.containsKey(a10);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    @NotNull
    public static final PersistentCompositionLocalMap b(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap, @NotNull ed.l<? super Map<A<Object>, i2<Object>>, kotlin.L0> lVar) {
        PersistentMap.Builder<A<Object>, i2<Object>> builder = persistentCompositionLocalMap.builder();
        lVar.invoke(builder);
        return builder.build2();
    }

    public static final <T> T c(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap, @NotNull A<T> a10) {
        kotlin.jvm.internal.G.n(a10, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        i2 i2VarC = persistentCompositionLocalMap.get(a10);
        if (i2VarC == null) {
            i2VarC = a10.c();
        }
        return (T) i2VarC.b(persistentCompositionLocalMap);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    @NotNull
    public static final PersistentCompositionLocalMap d(@NotNull C1888b1<?>[] c1888b1Arr, @NotNull PersistentCompositionLocalMap persistentCompositionLocalMap, @NotNull PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentCompositionLocalHashMap persistentCompositionLocalHashMapB = androidx.compose.runtime.internal.q.b();
        persistentCompositionLocalHashMapB.getClass();
        PersistentCompositionLocalHashMap.Builder builder = new PersistentCompositionLocalHashMap.Builder(persistentCompositionLocalHashMapB);
        for (C1888b1<?> c1888b1 : c1888b1Arr) {
            A<?> a10 = c1888b1.f99416a;
            kotlin.jvm.internal.G.n(a10, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            AbstractC1885a1 abstractC1885a1 = (AbstractC1885a1) a10;
            if (c1888b1.f99423h || !a(persistentCompositionLocalMap, abstractC1885a1)) {
                builder.put(abstractC1885a1, abstractC1885a1.d(c1888b1, (i2) persistentCompositionLocalMap2.get(abstractC1885a1)));
            }
        }
        return builder.build2();
    }

    public static /* synthetic */ PersistentCompositionLocalMap e(C1888b1[] c1888b1Arr, PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            persistentCompositionLocalMap2 = androidx.compose.runtime.internal.q.b();
        }
        return d(c1888b1Arr, persistentCompositionLocalMap, persistentCompositionLocalMap2);
    }
}
