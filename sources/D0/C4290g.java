package d0;

import android.os.Build;
import android.text.TextPaint;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: d0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4290g {
    @NotNull
    public static final InterfaceC4289f a(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint) {
        return Build.VERSION.SDK_INT >= 29 ? new C4287d(charSequence, textPaint) : new C4288e(charSequence);
    }
}
