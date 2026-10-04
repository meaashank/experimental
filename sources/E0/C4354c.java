package e0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.compose.runtime.internal.r;
import b0.t0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class C4354c implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f199943a = 0;

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(@Nullable Canvas canvas, @Nullable Paint paint, int i10, int i11, int i12, int i13, int i14, @Nullable CharSequence charSequence, int i15, int i16, boolean z10, @Nullable Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i15)) != layout.getLineCount() - 1 || !t0.m(layout, lineForOffset)) {
            return;
        }
        float fC = d.c(layout, lineForOffset, paint) + d.a(layout, lineForOffset, paint);
        if (fC == 0.0f) {
            return;
        }
        G.m(canvas);
        canvas.translate(fC, 0.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return 0;
    }
}
