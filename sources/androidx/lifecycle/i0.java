package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 implements InterfaceC2611y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC2603p f114347a;

    public i0(@NotNull InterfaceC2603p generatedAdapter) {
        kotlin.jvm.internal.G.p(generatedAdapter, "generatedAdapter");
        this.f114347a = generatedAdapter;
    }

    @Override // androidx.lifecycle.InterfaceC2611y
    public void onStateChanged(@NotNull B source, @NotNull Lifecycle.Event event) {
        kotlin.jvm.internal.G.p(source, "source");
        kotlin.jvm.internal.G.p(event, "event");
        this.f114347a.a(source, event, false, null);
        this.f114347a.a(source, event, true, null);
    }
}
