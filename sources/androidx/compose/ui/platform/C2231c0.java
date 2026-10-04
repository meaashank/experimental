package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import androidx.compose.ui.text.AnnotatedString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.platform.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2231c0 {
    @Nullable
    public static Z a(InterfaceC2234d0 interfaceC2234d0) {
        return null;
    }

    @NotNull
    public static ClipboardManager b(InterfaceC2234d0 interfaceC2234d0) {
        throw new UnsupportedOperationException("This platform does not offer a native Clipboard");
    }

    public static boolean c(InterfaceC2234d0 interfaceC2234d0) {
        AnnotatedString text = interfaceC2234d0.getText();
        return text != null && text.length() > 0;
    }

    public static void d(InterfaceC2234d0 interfaceC2234d0, @Nullable Z z10) {
    }
}
