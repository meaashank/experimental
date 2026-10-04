package b0;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: b0.W, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2744W {
    public static final void a(Rect rect, Rect rect2) {
        rect.right = rect2.width() + rect.right;
        rect.top = Math.min(rect.top, rect2.top);
        rect.bottom = Math.max(rect.bottom, rect2.bottom);
    }

    public static final void b(Paint paint, CharSequence charSequence, int i10, int i11, Rect rect) {
        if (Build.VERSION.SDK_INT >= 29) {
            C2743V.a(paint, charSequence, i10, i11, rect);
        } else {
            paint.getTextBounds(charSequence.toString(), i10, i11, rect);
        }
    }

    @NotNull
    public static final Rect c(@NotNull TextPaint textPaint, @NotNull CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (C2745X.b(spanned, MetricAffectingSpan.class, i10, i11)) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i10 < i11) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i10, i11, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i10, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    b(textPaint2, charSequence, i10, iNextSpanTransition, rect2);
                    a(rect, rect2);
                    i10 = iNextSpanTransition;
                }
                return rect;
            }
        }
        return d(textPaint, charSequence, i10, i11);
    }

    @e.f0
    @NotNull
    public static final Rect d(@NotNull Paint paint, @NotNull CharSequence charSequence, int i10, int i11) {
        Rect rect = new Rect();
        b(paint, charSequence, i10, i11, rect);
        return rect;
    }
}
