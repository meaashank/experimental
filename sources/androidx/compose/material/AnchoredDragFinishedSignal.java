package androidx.compose.material;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAnchoredDraggable.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.jvm.kt\nandroidx/compose/material/AnchoredDragFinishedSignal\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,27:1\n26#2:28\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.jvm.kt\nandroidx/compose/material/AnchoredDragFinishedSignal\n*L\n23#1:28\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class AnchoredDragFinishedSignal extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f95129a = 0;

    public AnchoredDragFinishedSignal() {
        super("Anchored drag finished");
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
