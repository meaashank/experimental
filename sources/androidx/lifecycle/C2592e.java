package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2592e implements InterfaceC2611y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC2603p[] f114322a;

    public C2592e(@NotNull InterfaceC2603p[] generatedAdapters) {
        kotlin.jvm.internal.G.p(generatedAdapters, "generatedAdapters");
        this.f114322a = generatedAdapters;
    }

    @Override // androidx.lifecycle.InterfaceC2611y
    public void onStateChanged(@NotNull B source, @NotNull Lifecycle.Event event) {
        kotlin.jvm.internal.G.p(source, "source");
        kotlin.jvm.internal.G.p(event, "event");
        O o10 = new O();
        for (InterfaceC2603p interfaceC2603p : this.f114322a) {
            interfaceC2603p.a(source, event, false, o10);
        }
        for (InterfaceC2603p interfaceC2603p2 : this.f114322a) {
            interfaceC2603p2.a(source, event, true, o10);
        }
    }
}
