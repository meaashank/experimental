package androidx.activity;

import android.window.BackEvent;
import e.InterfaceC4345t;
import e.T;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.activity.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T(34)
public final class C1476c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1476c f84916a = new C1476c();

    @InterfaceC4345t
    @NotNull
    public final BackEvent a(float f10, float f11, float f12, int i10) {
        return new BackEvent(f10, f11, f12, i10);
    }

    @InterfaceC4345t
    public final float b(@NotNull BackEvent backEvent) {
        kotlin.jvm.internal.G.p(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    @InterfaceC4345t
    public final int c(@NotNull BackEvent backEvent) {
        kotlin.jvm.internal.G.p(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    @InterfaceC4345t
    public final float d(@NotNull BackEvent backEvent) {
        kotlin.jvm.internal.G.p(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    @InterfaceC4345t
    public final float e(@NotNull BackEvent backEvent) {
        kotlin.jvm.internal.G.p(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
