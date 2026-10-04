package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f99624a = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99625b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f99626c = 31;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f99627d = 33;

    public static final int a(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    @NotNull
    public static final <E> PersistentList<E> b() {
        h.f99616e.getClass();
        return h.f99618g;
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
