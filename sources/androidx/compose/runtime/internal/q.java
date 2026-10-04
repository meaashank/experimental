package androidx.compose.runtime.internal;

import androidx.compose.runtime.A;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.i2;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import kotlin.Pair;
import kotlin.collections.n0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nPersistentCompositionLocalMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentCompositionLocalMap.kt\nandroidx/compose/runtime/internal/PersistentCompositionLocalMapKt\n+ 2 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n*L\n1#1,85:1\n82#2:86\n*S KotlinDebug\n*F\n+ 1 PersistentCompositionLocalMap.kt\nandroidx/compose/runtime/internal/PersistentCompositionLocalMapKt\n*L\n84#1:86\n*E\n"})
public final class q {
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    @NotNull
    public static final PersistentCompositionLocalMap a(@NotNull Pair<? extends A<Object>, ? extends i2<Object>>... pairArr) {
        PersistentCompositionLocalHashMap.f99931i.getClass();
        PersistentCompositionLocalHashMap persistentCompositionLocalHashMap = PersistentCompositionLocalHashMap.f99933k;
        persistentCompositionLocalHashMap.getClass();
        PersistentCompositionLocalHashMap.Builder builder = new PersistentCompositionLocalHashMap.Builder(persistentCompositionLocalHashMap);
        n0.y0(builder, pairArr);
        return builder.build2();
    }

    @NotNull
    public static final PersistentCompositionLocalHashMap b() {
        PersistentCompositionLocalHashMap.f99931i.getClass();
        return PersistentCompositionLocalHashMap.f99933k;
    }
}
