package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import e.InterfaceC4345t;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(34)
public final class C1788j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1788j f94104a = new C1788j();

    public static void a(IntConsumer intConsumer, int i10) {
        intConsumer.accept(i10);
    }

    public static final void c(IntConsumer intConsumer, int i10) {
        intConsumer.accept(i10);
    }

    @InterfaceC4345t
    public final void b(@NotNull c1 c1Var, @NotNull HandwritingGesture handwritingGesture, @Nullable Executor executor, @Nullable final IntConsumer intConsumer) {
        final int iC = c1Var.c(handwritingGesture);
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.compose.foundation.text.input.internal.i
                @Override // java.lang.Runnable
                public final void run() {
                    intConsumer.accept(iC);
                }
            });
        } else {
            intConsumer.accept(iC);
        }
    }

    @InterfaceC4345t
    public final boolean d(@NotNull c1 c1Var, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @Nullable CancellationSignal cancellationSignal) {
        return c1Var.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
    }
}
