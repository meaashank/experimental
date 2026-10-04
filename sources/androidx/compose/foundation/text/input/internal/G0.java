package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface G0 {
    void a(int i10, int i11, int i12, int i13);

    void b();

    void c();

    void d(@NotNull CursorAnchorInfo cursorAnchorInfo);

    void e(int i10, @NotNull ExtractedText extractedText);

    void f();

    void g();

    boolean isActive();
}
