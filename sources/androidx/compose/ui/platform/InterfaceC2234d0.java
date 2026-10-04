package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import androidx.compose.ui.text.AnnotatedString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.platform.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2234d0 {
    boolean a();

    @NotNull
    ClipboardManager b();

    void c(@Nullable Z z10);

    @Nullable
    Z d();

    void e(@NotNull AnnotatedString annotatedString);

    @Nullable
    AnnotatedString getText();
}
