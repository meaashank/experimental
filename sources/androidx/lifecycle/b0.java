package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements InterfaceC2611y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SavedStateHandlesProvider f114178a;

    public b0(@NotNull SavedStateHandlesProvider provider) {
        kotlin.jvm.internal.G.p(provider, "provider");
        this.f114178a = provider;
    }

    @Override // androidx.lifecycle.InterfaceC2611y
    public void onStateChanged(@NotNull B source, @NotNull Lifecycle.Event event) {
        kotlin.jvm.internal.G.p(source, "source");
        kotlin.jvm.internal.G.p(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            source.getLifecycle().g(this);
            this.f114178a.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
