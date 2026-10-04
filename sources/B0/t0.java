package b0;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout_androidKt\n+ 2 InlineClassUtils.android.kt\nandroidx/compose/ui/text/android/InlineClassUtils_androidKt\n*L\n1#1,1155:1\n25#2:1156\n*S KotlinDebug\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout_androidKt\n*L\n986#1:1156\n*E\n"})
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q0 f120705a = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f120706b = a(0, 0);

    public static final long a(int i10, int i11) {
        return (((long) i11) & ZipKt.f225990j) | (((long) i10) << 32);
    }

    public static final Paint.FontMetricsInt h(r0 r0Var, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, e0.h[] hVarArr) {
        int i10 = r0Var.f120693h - 1;
        if (r0Var.f120692g.getLineStart(i10) != r0Var.f120692g.getLineEnd(i10) || hVarArr == null || hVarArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        e0.h hVar = (e0.h) kotlin.collections.B.jc(hVarArr);
        spannableString.setSpan(hVar.b(0, spannableString.length(), (i10 == 0 || !hVar.f199957e) ? hVar.f199957e : false), 0, spannableString.length(), 33);
        StaticLayout staticLayoutB = k0.b(k0.f120649a, spannableString, textPaint, Integer.MAX_VALUE, 0, spannableString.length(), textDirectionHeuristic, null, 0, null, 0, 0.0f, 0.0f, 0, r0Var.f120687b, r0Var.f120688c, 0, 0, 0, 0, null, null, 2072512, null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = staticLayoutB.getLineAscent(0);
        fontMetricsInt.descent = staticLayoutB.getLineDescent(0);
        fontMetricsInt.top = staticLayoutB.getLineTop(0);
        fontMetricsInt.bottom = staticLayoutB.getLineBottom(0);
        return fontMetricsInt;
    }

    public static final long i(e0.h[] hVarArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (e0.h hVar : hVarArr) {
            int i10 = hVar.f199963k;
            if (i10 < 0) {
                iMax = Math.max(iMax, Math.abs(i10));
            }
            int i11 = hVar.f199964l;
            if (i11 < 0) {
                iMax2 = Math.max(iMax, Math.abs(i11));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? f120706b : a(iMax, iMax2);
    }

    public static final e0.h[] j(r0 r0Var) {
        if (!(r0Var.f120692g.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = r0Var.f120692g.getText();
        kotlin.jvm.internal.G.n(text, "null cannot be cast to non-null type android.text.Spanned");
        if (!C2745X.a((Spanned) text, e0.h.class) && r0Var.f120692g.getText().length() > 0) {
            return null;
        }
        CharSequence text2 = r0Var.f120692g.getText();
        kotlin.jvm.internal.G.n(text2, "null cannot be cast to non-null type android.text.Spanned");
        return (e0.h[]) ((Spanned) text2).getSpans(0, r0Var.f120692g.getText().length(), e0.h.class);
    }

    @NotNull
    public static final TextDirectionHeuristic k(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }

    public static final long l(r0 r0Var) {
        if (r0Var.f120687b || r0Var.U()) {
            return f120706b;
        }
        TextPaint paint = r0Var.f120692g.getPaint();
        CharSequence text = r0Var.f120692g.getText();
        Rect rectC = C2744W.c(paint, text, r0Var.f120692g.getLineStart(0), r0Var.f120692g.getLineEnd(0));
        int lineAscent = r0Var.f120692g.getLineAscent(0);
        int i10 = rectC.top;
        int topPadding = i10 < lineAscent ? lineAscent - i10 : r0Var.f120692g.getTopPadding();
        int i11 = r0Var.f120693h;
        if (i11 != 1) {
            int i12 = i11 - 1;
            rectC = C2744W.c(paint, text, r0Var.f120692g.getLineStart(i12), r0Var.f120692g.getLineEnd(i12));
        }
        int lineDescent = r0Var.f120692g.getLineDescent(r0Var.f120693h - 1);
        int i13 = rectC.bottom;
        int bottomPadding = i13 > lineDescent ? i13 - lineDescent : r0Var.f120692g.getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f120706b : a(topPadding, bottomPadding);
    }

    public static final boolean m(@NotNull Layout layout, int i10) {
        return layout.getEllipsisCount(i10) > 0;
    }
}
