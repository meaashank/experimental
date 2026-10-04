package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nAnchoredDraggable.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.jvm.kt\nandroidx/compose/foundation/gestures/AnchoredDragFinishedSignal\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,28:1\n26#2:29\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.jvm.kt\nandroidx/compose/foundation/gestures/AnchoredDragFinishedSignal\n*L\n24#1:29\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class AnchoredDragFinishedSignal extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f89120a = 0;

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
