package androidx.lifecycle;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class C {
    @NotNull
    public static final LifecycleCoroutineScope a(@NotNull B b10) {
        kotlin.jvm.internal.G.p(b10, "<this>");
        return LifecycleKt.a(b10.getLifecycle());
    }
}
