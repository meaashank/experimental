package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface c1 {
    void a(int i10);

    void b(@NotNull ed.l<? super I, kotlin.L0> lVar);

    int c(@NotNull HandwritingGesture handwritingGesture);

    boolean d(@NotNull androidx.compose.foundation.content.f fVar);

    @NotNull
    androidx.compose.foundation.text.input.l getText();

    boolean previewHandwritingGesture(@NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @Nullable CancellationSignal cancellationSignal);

    void requestCursorUpdates(int i10);

    void sendKeyEvent(@NotNull KeyEvent keyEvent);
}
