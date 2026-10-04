package d0;

import android.text.TextPaint;
import androidx.compose.runtime.internal.r;
import e.T;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: d0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T(29)
@r(parameters = 0)
public final class C4287d extends AbstractC4285b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f194544f = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CharSequence f194545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TextPaint f194546e;

    public C4287d(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint) {
        this.f194545d = charSequence;
        this.f194546e = textPaint;
    }

    @Override // d0.AbstractC4285b
    public int e(int i10) {
        TextPaint textPaint = this.f194546e;
        CharSequence charSequence = this.f194545d;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 0);
    }

    @Override // d0.AbstractC4285b
    public int f(int i10) {
        TextPaint textPaint = this.f194546e;
        CharSequence charSequence = this.f194545d;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 2);
    }
}
