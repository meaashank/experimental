package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, k0> f114372a = new LinkedHashMap();

    public final void a() {
        Iterator<k0> it = this.f114372a.values().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        this.f114372a.clear();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final k0 b(@NotNull String key) {
        kotlin.jvm.internal.G.p(key, "key");
        return this.f114372a.get(key);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Set<String> c() {
        return new HashSet(this.f114372a.keySet());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void d(@NotNull String key, @NotNull k0 viewModel) {
        kotlin.jvm.internal.G.p(key, "key");
        kotlin.jvm.internal.G.p(viewModel, "viewModel");
        k0 k0VarPut = this.f114372a.put(key, viewModel);
        if (k0VarPut != null) {
            k0VarPut.e();
        }
    }
}
