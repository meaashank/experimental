package androidx.compose.runtime;

import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,313:1\n1#2:314\n1225#3,6:315\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n310#1:315,6\n*E\n"})
public final /* synthetic */ class M1 {
    public static final <T> T a(@NotNull X1<? extends T> x12, @Nullable Object obj, @NotNull kotlin.reflect.n<?> nVar) {
        return x12.getValue();
    }

    @androidx.compose.runtime.snapshots.C
    @NotNull
    public static final <T> SnapshotStateList<T> b() {
        return new SnapshotStateList<>();
    }

    @androidx.compose.runtime.snapshots.C
    @NotNull
    public static final <T> SnapshotStateList<T> c(@NotNull T... tArr) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(kotlin.collections.B.dz(tArr));
        return snapshotStateList;
    }

    @androidx.compose.runtime.snapshots.C
    @NotNull
    public static final <K, V> androidx.compose.runtime.snapshots.x<K, V> d() {
        return new androidx.compose.runtime.snapshots.x<>();
    }

    @androidx.compose.runtime.snapshots.C
    @NotNull
    public static final <K, V> androidx.compose.runtime.snapshots.x<K, V> e(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        androidx.compose.runtime.snapshots.x<K, V> xVar = new androidx.compose.runtime.snapshots.x<>();
        xVar.putAll(kotlin.collections.n0.H0(pairArr));
        return xVar;
    }

    @androidx.compose.runtime.snapshots.C
    @NotNull
    public static final <T> L0<T> f(T t10, @NotNull H1<T> h12) {
        return ActualAndroid_androidKt.e(t10, h12);
    }

    public static L0 g(Object obj, H1 h12, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            h12 = L1.c();
        }
        return ActualAndroid_androidKt.e(obj, h12);
    }

    @InterfaceC1917i
    @NotNull
    public static final <T> X1<T> h(T t10, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
        if (C1968u.c0()) {
            C1968u.p0(-1058319986, i10, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:309)");
        }
        Object objA0 = interfaceC1946s.a0();
        InterfaceC1946s.f99968a.getClass();
        if (objA0 == InterfaceC1946s.a.f99970b) {
            objA0 = g(t10, null, 2, null);
            interfaceC1946s.S(objA0);
        }
        L0 l02 = (L0) objA0;
        l02.setValue(t10);
        if (C1968u.c0()) {
            C1968u.o0();
        }
        return l02;
    }

    public static final <T> void i(@NotNull L0<T> l02, @Nullable Object obj, @NotNull kotlin.reflect.n<?> nVar, T t10) {
        l02.setValue(t10);
    }

    @NotNull
    public static final <T> SnapshotStateList<T> j(@NotNull Collection<? extends T> collection) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }

    @NotNull
    public static final <K, V> androidx.compose.runtime.snapshots.x<K, V> k(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        androidx.compose.runtime.snapshots.x<K, V> xVar = new androidx.compose.runtime.snapshots.x<>();
        xVar.putAll(kotlin.collections.n0.B0(iterable));
        return xVar;
    }
}
