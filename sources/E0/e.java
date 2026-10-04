package e0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class e extends MetricAffectingSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f199946b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f199947a;

    public e(float f10) {
        this.f199947a = f10;
    }

    public final float a() {
        return this.f199947a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f199947a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f199947a);
    }
}
