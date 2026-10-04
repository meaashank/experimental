package b0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import d0.C4292i;
import e0.C4352a;
import kotlin.jvm.internal.C4969v;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1155:1\n1#2:1156\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class r0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f120685s = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TextPaint f120686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f120687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f120688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C2738P f120689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f120690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public C4292i f120691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Layout f120692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f120693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f120694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f120695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f120696k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f120697l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f120698m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final Paint.FontMetricsInt f120699n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f120700o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final e0.h[] f120701p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Rect f120702q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public C2736N f120703r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    public r0(@NotNull CharSequence charSequence, float f10, @NotNull TextPaint textPaint, int i10, @Nullable TextUtils.TruncateAt truncateAt, int i11, float f11, @e.P float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, @Nullable int[] iArr, @Nullable int[] iArr2, @NotNull C2738P c2738p) {
        TextPaint textPaint2;
        int i18;
        boolean z12;
        TextDirectionHeuristic textDirectionHeuristic;
        boolean z13;
        Layout layoutA;
        this.f120686a = textPaint;
        this.f120687b = z10;
        this.f120688c = z11;
        this.f120689d = c2738p;
        this.f120702q = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicK = t0.k(i11);
        Layout.Alignment alignmentA = p0.f120679a.a(i10);
        boolean z14 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, C4352a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = c2738p.a();
            double d10 = f10;
            int iCeil = (int) Math.ceil(d10);
            if (metricsA == null || c2738p.b() > f10 || z14) {
                this.f120698m = false;
                int iCeil2 = (int) Math.ceil(d10);
                textPaint2 = textPaint;
                i18 = i12;
                z12 = false;
                textDirectionHeuristic = textDirectionHeuristicK;
                z13 = true;
                layoutA = k0.f120649a.a(charSequence, textPaint2, iCeil, 0, charSequence.length(), textDirectionHeuristic, alignmentA, i18, truncateAt, iCeil2, f11, f12, i17, z10, z11, i13, i14, i15, i16, iArr, iArr2);
            } else {
                this.f120698m = true;
                textPaint2 = textPaint;
                i18 = i12;
                layoutA = C2758k.f120647a.a(charSequence, textPaint, iCeil, metricsA, alignmentA, z10, z11, truncateAt, iCeil);
                textDirectionHeuristic = textDirectionHeuristicK;
                z13 = true;
                z12 = false;
            }
            this.f120692g = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i18);
            this.f120693h = iMin;
            int i19 = iMin - 1;
            this.f120690e = (iMin >= i18 && (layoutA.getEllipsisCount(i19) > 0 || layoutA.getLineEnd(i19) != charSequence.length())) ? z13 : z12;
            long jL = t0.l(this);
            e0.h[] hVarArrJ = t0.j(this);
            this.f120701p = hVarArrJ;
            long jI = hVarArrJ != null ? t0.i(hVarArrJ) : t0.f120706b;
            this.f120694i = Math.max((int) (jL >> 32), (int) (jI >> 32));
            this.f120695j = Math.max((int) (jL & ZipKt.f225990j), (int) (jI & ZipKt.f225990j));
            Paint.FontMetricsInt fontMetricsIntH = t0.h(this, textPaint2, textDirectionHeuristic, hVarArrJ);
            this.f120700o = fontMetricsIntH != null ? fontMetricsIntH.bottom - ((int) y(i19)) : z12;
            this.f120699n = fontMetricsIntH;
            this.f120696k = e0.d.b(layoutA, i19, null, 2, null);
            this.f120697l = e0.d.d(layoutA, i19, null, 2, null);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static /* synthetic */ float K(r0 r0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return r0Var.J(i10, z10);
    }

    public static /* synthetic */ float N(r0 r0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return r0Var.M(i10, z10);
    }

    public final float A(int i10) {
        return this.f120692g.getLineRight(i10) + (i10 == this.f120693h + (-1) ? this.f120697l : 0.0f);
    }

    public final int B(int i10) {
        return this.f120692g.getLineStart(i10);
    }

    public final float C(int i10) {
        return this.f120692g.getLineTop(i10) + (i10 == 0 ? 0 : this.f120694i);
    }

    public final int D(int i10) {
        if (this.f120692g.getEllipsisStart(i10) == 0) {
            return m().f(i10);
        }
        return this.f120692g.getEllipsisStart(i10) + this.f120692g.getLineStart(i10);
    }

    public final float E(int i10) {
        return this.f120692g.getLineWidth(i10);
    }

    public final float F() {
        return this.f120689d.b();
    }

    public final float G() {
        return this.f120689d.c();
    }

    public final int H(int i10, float f10) {
        return this.f120692g.getOffsetForHorizontal(i10, (i(i10) * (-1)) + f10);
    }

    public final int I(int i10) {
        return this.f120692g.getParagraphDirection(i10);
    }

    public final float J(int i10, boolean z10) {
        return i(this.f120692g.getLineForOffset(i10)) + m().c(i10, true, z10);
    }

    @Nullable
    public final int[] L(@NotNull RectF rectF, int i10, @NotNull ed.p<? super RectF, ? super RectF, Boolean> pVar) {
        return Build.VERSION.SDK_INT >= 34 ? C2753f.f120643a.c(this, rectF, i10, pVar) : s0.d(this, this.f120692g, m(), rectF, i10, pVar);
    }

    public final float M(int i10, boolean z10) {
        return i(this.f120692g.getLineForOffset(i10)) + m().c(i10, false, z10);
    }

    public final void O(int i10, int i11, @NotNull Path path) {
        this.f120692g.getSelectionPath(i10, i11, path);
        if (this.f120694i == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, this.f120694i);
    }

    @NotNull
    public final CharSequence P() {
        return this.f120692g.getText();
    }

    @NotNull
    public final TextPaint Q() {
        return this.f120686a;
    }

    public final int R() {
        return this.f120694i;
    }

    @NotNull
    public final C4292i T() {
        C4292i c4292i = this.f120691f;
        if (c4292i != null) {
            return c4292i;
        }
        C4292i c4292i2 = new C4292i(this.f120692g.getText(), 0, this.f120692g.getText().length(), this.f120686a.getTextLocale());
        this.f120691f = c4292i2;
        return c4292i2;
    }

    public final boolean U() {
        if (this.f120698m) {
            C2758k c2758k = C2758k.f120647a;
            Layout layout = this.f120692g;
            kotlin.jvm.internal.G.n(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return c2758k.c((BoringLayout) layout);
        }
        k0 k0Var = k0.f120649a;
        Layout layout2 = this.f120692g;
        kotlin.jvm.internal.G.n(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        boolean z10 = this.f120688c;
        k0Var.getClass();
        return k0.f120650b.a((StaticLayout) layout2, z10);
    }

    public final boolean V(int i10) {
        return t0.m(this.f120692g, i10);
    }

    public final boolean W(int i10) {
        return this.f120692g.isRtlCharAt(i10);
    }

    public final void X(@NotNull Canvas canvas) {
        if (canvas.getClipBounds(this.f120702q)) {
            int i10 = this.f120694i;
            if (i10 != 0) {
                canvas.translate(0.0f, i10);
            }
            q0 q0Var = t0.f120705a;
            q0Var.f120684a = canvas;
            this.f120692g.draw(q0Var);
            int i11 = this.f120694i;
            if (i11 != 0) {
                canvas.translate(0.0f, (-1) * i11);
            }
        }
    }

    public final void a(int i10, int i11, @NotNull float[] fArr, int i12) {
        float fA;
        float fA2;
        r0 r0Var = this;
        int length = r0Var.f120692g.getText().length();
        if (i10 < 0) {
            throw new IllegalArgumentException("startOffset must be > 0");
        }
        if (i10 >= length) {
            throw new IllegalArgumentException("startOffset must be less than text length");
        }
        if (i11 <= i10) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset");
        }
        if (i11 > length) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if (fArr.length - i12 < (i11 - i10) * 4) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int lineForOffset = r0Var.f120692g.getLineForOffset(i10);
        int lineForOffset2 = r0Var.f120692g.getLineForOffset(i11 - 1);
        C2731I c2731i = new C2731I(r0Var);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        int i13 = lineForOffset;
        int i14 = i12;
        while (true) {
            int lineStart = r0Var.f120692g.getLineStart(i13);
            int iV = r0Var.v(i13);
            int iMax = Math.max(i10, lineStart);
            int iMin = Math.min(i11, iV);
            float fC = r0Var.C(i13);
            float fQ = r0Var.q(i13);
            boolean z10 = false;
            boolean z11 = r0Var.f120692g.getParagraphDirection(i13) == 1;
            while (iMax < iMin) {
                boolean zIsRtlCharAt = r0Var.f120692g.isRtlCharAt(iMax);
                if (z11 && !zIsRtlCharAt) {
                    fA = c2731i.a(iMax, z10, z10, true);
                    fA2 = c2731i.a(iMax + 1, true, true, true);
                    z10 = false;
                } else if (z11 && zIsRtlCharAt) {
                    z10 = false;
                    float fA3 = c2731i.a(iMax, false, false, false);
                    fA = c2731i.a(iMax + 1, true, true, false);
                    fA2 = fA3;
                } else {
                    z10 = false;
                    if (z11 || !zIsRtlCharAt) {
                        fA = c2731i.a(iMax, false, false, false);
                        fA2 = c2731i.a(iMax + 1, true, true, false);
                    } else {
                        fA2 = c2731i.a(iMax, false, false, true);
                        fA = c2731i.a(iMax + 1, true, true, true);
                    }
                }
                fArr[i14] = fA;
                fArr[i14 + 1] = fC;
                fArr[i14 + 2] = fA2;
                fArr[i14 + 3] = fQ;
                i14 += 4;
                iMax++;
                r0Var = this;
            }
            if (i13 == lineForOffset2) {
                return;
            }
            i13++;
            r0Var = this;
        }
    }

    public final void b(int i10, @NotNull float[] fArr) {
        float fA;
        float fA2;
        int lineStart = this.f120692g.getLineStart(i10);
        int iV = v(i10);
        if (fArr.length < (iV - lineStart) * 2) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        C2731I c2731i = new C2731I(this);
        boolean z10 = this.f120692g.getParagraphDirection(i10) == 1;
        int i11 = 0;
        while (lineStart < iV) {
            boolean zIsRtlCharAt = this.f120692g.isRtlCharAt(lineStart);
            if (z10 && !zIsRtlCharAt) {
                fA = c2731i.a(lineStart, false, false, true);
                fA2 = c2731i.a(lineStart + 1, true, true, true);
            } else if (z10 && zIsRtlCharAt) {
                fA2 = c2731i.a(lineStart, false, false, false);
                fA = c2731i.a(lineStart + 1, true, true, false);
            } else if (zIsRtlCharAt) {
                fA2 = c2731i.a(lineStart, false, false, true);
                fA = c2731i.a(lineStart + 1, true, true, true);
            } else {
                fA = c2731i.a(lineStart, false, false, false);
                fA2 = c2731i.a(lineStart + 1, true, true, false);
            }
            fArr[i11] = fA;
            fArr[i11 + 1] = fA2;
            i11 += 2;
            lineStart++;
        }
    }

    public final int c() {
        return this.f120695j;
    }

    @NotNull
    public final RectF e(int i10) {
        float fM;
        float fM2;
        float fJ;
        float fJ2;
        int lineForOffset = this.f120692g.getLineForOffset(i10);
        float fC = C(lineForOffset);
        float fQ = q(lineForOffset);
        boolean z10 = this.f120692g.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = this.f120692g.isRtlCharAt(i10);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                fJ = M(i10, false);
                fJ2 = M(i10 + 1, true);
            } else if (zIsRtlCharAt) {
                fJ = J(i10, false);
                fJ2 = J(i10 + 1, true);
            } else {
                fM = M(i10, false);
                fM2 = M(i10 + 1, true);
            }
            float f10 = fJ;
            fM = fJ2;
            fM2 = f10;
        } else {
            fM = J(i10, false);
            fM2 = J(i10 + 1, true);
        }
        return new RectF(fM, fC, fM2, fQ);
    }

    public final boolean f() {
        return this.f120690e;
    }

    public final boolean g() {
        return this.f120688c;
    }

    public final int h() {
        return (this.f120690e ? this.f120692g.getLineBottom(this.f120693h - 1) : this.f120692g.getHeight()) + this.f120694i + this.f120695j + this.f120700o;
    }

    public final float i(int i10) {
        if (i10 == this.f120693h - 1) {
            return this.f120696k + this.f120697l;
        }
        return 0.0f;
    }

    public final boolean j() {
        return this.f120687b;
    }

    @NotNull
    public final Layout k() {
        return this.f120692g;
    }

    public final C2736N m() {
        C2736N c2736n = this.f120703r;
        if (c2736n != null) {
            kotlin.jvm.internal.G.m(c2736n);
            return c2736n;
        }
        C2736N c2736n2 = new C2736N(this.f120692g);
        this.f120703r = c2736n2;
        return c2736n2;
    }

    @NotNull
    public final C2738P n() {
        return this.f120689d;
    }

    public final float o(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        return (i10 != this.f120693h + (-1) || (fontMetricsInt = this.f120699n) == null) ? this.f120692g.getLineAscent(i10) : fontMetricsInt.ascent;
    }

    public final float p(int i10) {
        return this.f120694i + ((i10 != this.f120693h + (-1) || this.f120699n == null) ? this.f120692g.getLineBaseline(i10) : C(i10) - this.f120699n.ascent);
    }

    public final float q(int i10) {
        if (i10 != this.f120693h - 1 || this.f120699n == null) {
            return this.f120694i + this.f120692g.getLineBottom(i10) + (i10 == this.f120693h + (-1) ? this.f120695j : 0);
        }
        return this.f120692g.getLineBottom(i10 - 1) + this.f120699n.bottom;
    }

    public final int r() {
        return this.f120693h;
    }

    public final float s(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        return (i10 != this.f120693h + (-1) || (fontMetricsInt = this.f120699n) == null) ? this.f120692g.getLineDescent(i10) : fontMetricsInt.descent;
    }

    public final int t(int i10) {
        return this.f120692g.getEllipsisCount(i10);
    }

    public final int u(int i10) {
        return this.f120692g.getEllipsisStart(i10);
    }

    public final int v(int i10) {
        return this.f120692g.getEllipsisStart(i10) == 0 ? this.f120692g.getLineEnd(i10) : this.f120692g.getText().length();
    }

    public final int w(int i10) {
        return this.f120692g.getLineForOffset(i10);
    }

    public final int x(int i10) {
        return this.f120692g.getLineForVertical(i10 - this.f120694i);
    }

    public final float y(int i10) {
        return q(i10) - C(i10);
    }

    public final float z(int i10) {
        return this.f120692g.getLineLeft(i10) + (i10 == this.f120693h + (-1) ? this.f120696k : 0.0f);
    }

    @e.f0
    public static /* synthetic */ void S() {
    }

    @e.f0
    public static /* synthetic */ void d() {
    }

    @e.f0
    public static /* synthetic */ void l() {
    }

    public /* synthetic */ r0(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, C2738P c2738p, int i18, C4969v c4969v) {
        CharSequence charSequence2;
        TextPaint textPaint2;
        C2738P c2738p2;
        int i19 = (i18 & 8) != 0 ? 0 : i10;
        TextUtils.TruncateAt truncateAt2 = (i18 & 16) != 0 ? null : truncateAt;
        int i20 = (i18 & 32) != 0 ? 2 : i11;
        float f13 = (i18 & 64) != 0 ? 1.0f : f11;
        float f14 = (i18 & 128) != 0 ? 0.0f : f12;
        boolean z12 = (i18 & 256) != 0 ? false : z10;
        boolean z13 = (i18 & 512) != 0 ? true : z11;
        int i21 = (i18 & 1024) != 0 ? Integer.MAX_VALUE : i12;
        int i22 = (i18 & 2048) != 0 ? 0 : i13;
        int i23 = (i18 & 4096) != 0 ? 0 : i14;
        int i24 = (i18 & 8192) != 0 ? 0 : i15;
        int i25 = (i18 & 16384) != 0 ? 0 : i16;
        int i26 = (32768 & i18) != 0 ? 0 : i17;
        int[] iArr3 = (65536 & i18) != 0 ? null : iArr;
        int[] iArr4 = (131072 & i18) != 0 ? null : iArr2;
        if ((i18 & 262144) != 0) {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            c2738p2 = new C2738P(charSequence2, textPaint2, i20);
        } else {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            c2738p2 = c2738p;
        }
        this(charSequence2, f10, textPaint2, i19, truncateAt2, i20, f13, f14, z12, z13, i21, i22, i23, i24, i25, i26, iArr3, iArr4, c2738p2);
    }
}
