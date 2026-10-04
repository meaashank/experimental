package kotlinx.collections.immutable.implementations.immutableList;

import kotlinx.collections.immutable.PersistentList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f218538a = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f218539b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f218540c = 31;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f218541d = 33;

    public static final int a(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    @NotNull
    public static final <E> PersistentList<E> b() {
        h.f218532d.getClass();
        return h.f218533e;
    }

    @NotNull
    public static final Object[] c(@Nullable Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final int d(int i10) {
        return (i10 - 1) & (-32);
    }
}
