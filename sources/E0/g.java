package e0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class g implements LineHeightSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f199950b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f199951a;

    public g(float f10) {
        this.f199951a = f10;
    }

    public final float a() {
        return this.f199951a;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@NotNull CharSequence charSequence, int i10, int i11, int i12, int i13, @NotNull Paint.FontMetricsInt fontMetricsInt) {
        int iA = i.a(fontMetricsInt);
        if (iA <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.f199951a);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / iA)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}
