package d4;

import android.content.ClipData;
import android.content.ClipboardManager;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public static final void a(@NotNull ClipboardManager clipboardManager, @NotNull String text) {
        G.p(clipboardManager, "<this>");
        G.p(text, "text");
        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", text));
    }
}
