package androidx.compose.runtime.collection;

import android.util.SparseArray;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class b<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99561b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SparseArray<E> f99562a;

    public b(SparseArray<E> sparseArray) {
        this.f99562a = sparseArray;
    }

    public final void a() {
        this.f99562a.clear();
    }

    public final boolean b(int i10) {
        return this.f99562a.indexOfKey(i10) >= 0;
    }

    @Nullable
    public final E c(int i10) {
        return this.f99562a.get(i10);
    }

    public final E d(int i10, E e10) {
        return this.f99562a.get(i10, e10);
    }

    public final int e() {
        return this.f99562a.size();
    }

    public final void f(int i10) {
        this.f99562a.remove(i10);
    }

    public final void g(int i10, E e10) {
        this.f99562a.put(i10, e10);
    }

    public b(int i10) {
        this(new SparseArray(i10));
    }

    public /* synthetic */ b(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
