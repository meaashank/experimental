package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.r;
import androidx.compose.runtime.snapshots.x;
import kotlin.Pair;
import kotlin.collections.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class o extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f102636c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final x<c<?>, Object> f102637b;

    /* JADX WARN: Multi-variable type inference failed */
    public o(@NotNull Pair<? extends c<?>, ? extends Object> pair, @NotNull Pair<? extends c<?>, ? extends Object>... pairArr) {
        x<c<?>, Object> xVar = new x<>();
        this.f102637b = xVar;
        xVar.put(pair.f217467a, pair.f217468b);
        xVar.putAll(n0.H0(pairArr));
    }

    @Override // androidx.compose.ui.modifier.h
    public boolean a(@NotNull c<?> cVar) {
        return this.f102637b.containsKey(cVar);
    }

    @Override // androidx.compose.ui.modifier.h
    @Nullable
    public <T> T b(@NotNull c<T> cVar) {
        T t10 = (T) this.f102637b.get(cVar);
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    @Override // androidx.compose.ui.modifier.h
    public <T> void c(@NotNull c<T> cVar, T t10) {
        this.f102637b.put(cVar, t10);
    }
}
