package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.r;
import androidx.compose.ui.layout.Z;
import java.util.Collection;
import java.util.List;
import k0.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@q
@r(parameters = 0)
public final class g extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f105375l = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Object f105376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final List<Z> f105377k;

    public g(@Nullable Object obj, @NotNull Object obj2, @NotNull v vVar, @NotNull Collection<? extends Object> collection, @NotNull List<Z> list, @NotNull Collection<? extends e> collection2) {
        super(obj, null, null, null, vVar, collection, collection2, false);
        this.f105376j = obj2;
        this.f105377k = list;
    }

    @Override // androidx.compose.ui.tooling.data.e
    @NotNull
    public List<Z> g() {
        return this.f105377k;
    }

    @NotNull
    public final Object k() {
        return this.f105376j;
    }
}
