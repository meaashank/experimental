package e0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public class m extends MetricAffectingSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f199992b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f199993a;

    public m(float f10) {
        this.f199993a = f10;
    }

    public final float a() {
        return this.f199993a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f199993a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f199993a);
    }
}
