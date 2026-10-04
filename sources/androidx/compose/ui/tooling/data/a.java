package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.r;
import java.util.Collection;
import java.util.List;
import k0.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@q
@r(parameters = 0)
public final class a extends e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f105353k = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final List<i> f105354j;

    public a(@Nullable Object obj, @Nullable String str, @NotNull v vVar, @Nullable o oVar, @Nullable Object obj2, @NotNull List<i> list, @NotNull Collection<? extends Object> collection, @NotNull Collection<? extends e> collection2, boolean z10) {
        super(obj, str, oVar, obj2, vVar, collection, collection2, z10);
        this.f105354j = list;
    }

    @Override // androidx.compose.ui.tooling.data.e
    @NotNull
    public List<i> i() {
        return this.f105354j;
    }
}
