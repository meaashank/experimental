package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlinx.coroutines.A0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nLifecycleController.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.jvm.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,71:1\n57#1,3:72\n57#1,3:75\n*S KotlinDebug\n*F\n+ 1 LifecycleController.jvm.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:72,3\n36#1:75,3\n*E\n"})
@e.I
public final class C2609w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lifecycle f114380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lifecycle.State f114381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C2600m f114382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC2611y f114383d;

    public C2609w(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State minState, @NotNull C2600m dispatchQueue, @NotNull final A0 parentJob) {
        kotlin.jvm.internal.G.p(lifecycle, "lifecycle");
        kotlin.jvm.internal.G.p(minState, "minState");
        kotlin.jvm.internal.G.p(dispatchQueue, "dispatchQueue");
        kotlin.jvm.internal.G.p(parentJob, "parentJob");
        this.f114380a = lifecycle;
        this.f114381b = minState;
        this.f114382c = dispatchQueue;
        InterfaceC2611y interfaceC2611y = new InterfaceC2611y() { // from class: androidx.lifecycle.v
            @Override // androidx.lifecycle.InterfaceC2611y
            public final void onStateChanged(B b10, Lifecycle.Event event) {
                C2609w.d(this.f114378a, parentJob, b10, event);
            }
        };
        this.f114383d = interfaceC2611y;
        if (lifecycle.d() != Lifecycle.State.DESTROYED) {
            lifecycle.c(interfaceC2611y);
        } else {
            A0.a.b(parentJob, null, 1, null);
            b();
        }
    }

    public static final void d(C2609w this$0, A0 parentJob, B source, Lifecycle.Event event) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(parentJob, "$parentJob");
        kotlin.jvm.internal.G.p(source, "source");
        kotlin.jvm.internal.G.p(event, "<anonymous parameter 1>");
        if (source.getLifecycle().d() == Lifecycle.State.DESTROYED) {
            A0.a.b(parentJob, null, 1, null);
            this$0.b();
        } else if (source.getLifecycle().d().compareTo(this$0.f114381b) < 0) {
            this$0.f114382c.f114355a = true;
        } else {
            this$0.f114382c.i();
        }
    }

    @e.I
    public final void b() {
        this.f114380a.g(this.f114383d);
        this.f114382c.g();
    }

    public final void c(A0 a02) {
        A0.a.b(a02, null, 1, null);
        b();
    }
}
