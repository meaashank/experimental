package b0;

import android.text.Layout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: b0.M, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2735M {
    public static final int a(@NotNull Layout layout, @e.D(from = 0) int i10, boolean z10) {
        if (i10 <= 0) {
            return 0;
        }
        if (i10 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i10);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i10 || lineEnd == i10) {
            if (lineStart == i10) {
                if (z10) {
                    return lineForOffset - 1;
                }
            } else if (!z10) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }
}
