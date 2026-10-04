package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public final class c0 implements InterfaceC2611y, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f114180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a0 f114181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f114182c;

    public c0(@NotNull String key, @NotNull a0 handle) {
        kotlin.jvm.internal.G.p(key, "key");
        kotlin.jvm.internal.G.p(handle, "handle");
        this.f114180a = key;
        this.f114181b = handle;
    }

    public final void a(@NotNull androidx.savedstate.d registry, @NotNull Lifecycle lifecycle) {
        kotlin.jvm.internal.G.p(registry, "registry");
        kotlin.jvm.internal.G.p(lifecycle, "lifecycle");
        if (this.f114182c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f114182c = true;
        lifecycle.c(this);
        registry.j(this.f114180a, this.f114181b.f114174e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @NotNull
    public final a0 d() {
        return this.f114181b;
    }

    public final boolean m() {
        return this.f114182c;
    }

    @Override // androidx.lifecycle.InterfaceC2611y
    public void onStateChanged(@NotNull B source, @NotNull Lifecycle.Event event) {
        kotlin.jvm.internal.G.p(source, "source");
        kotlin.jvm.internal.G.p(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f114182c = false;
            source.getLifecycle().g(this);
        }
    }
}
