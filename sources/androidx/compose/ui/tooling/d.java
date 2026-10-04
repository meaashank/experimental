package androidx.compose.ui.tooling;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Set<androidx.compose.runtime.tooling.b> f105352b = Collections.newSetFromMap(new WeakHashMap());

    @Override // androidx.compose.ui.tooling.c
    @NotNull
    public Set<androidx.compose.runtime.tooling.b> a() {
        return this.f105352b;
    }
}
