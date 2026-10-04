package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1802q {
    void a(int i10, int i11, int i12, int i13);

    void b();

    void c();

    void d(@NotNull CursorAnchorInfo cursorAnchorInfo);

    void e(int i10, @NotNull ExtractedText extractedText);

    void f();

    void g();

    void h();

    void i();

    void sendKeyEvent(@NotNull KeyEvent keyEvent);
}
