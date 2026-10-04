package e0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.compose.runtime.internal.r;
import e.InterfaceC4348w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f199952m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f199953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f199954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f199955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f199956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f199957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f199958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f199959g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f199960h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f199961i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f199962j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f199963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f199964l;

    public h(float f10, int i10, int i11, boolean z10, boolean z11, @InterfaceC4348w(from = -1.0d, to = 1.0d) float f11) {
        this.f199953a = f10;
        this.f199954b = i10;
        this.f199955c = i11;
        this.f199956d = z10;
        this.f199957e = z11;
        this.f199958f = f11;
        if ((0.0f > f11 || f11 > 1.0f) && f11 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    public static /* synthetic */ h c(h hVar, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z10 = hVar.f199956d;
        }
        return hVar.b(i10, i11, z10);
    }

    public final void a(Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int iCeil = (int) Math.ceil(this.f199953a);
        int iA = iCeil - i.a(fontMetricsInt);
        float fAbs = this.f199958f;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
        }
        if (iA <= 0) {
            dCeil = Math.ceil(iA * fAbs);
        } else {
            dCeil = Math.ceil((1.0f - fAbs) * iA);
        }
        int i10 = (int) dCeil;
        int i11 = fontMetricsInt.descent;
        int i12 = i10 + i11;
        this.f199961i = i12;
        int i13 = i12 - iCeil;
        this.f199960h = i13;
        if (this.f199956d) {
            i13 = fontMetricsInt.ascent;
        }
        this.f199959g = i13;
        if (this.f199957e) {
            i12 = i11;
        }
        this.f199962j = i12;
        this.f199963k = fontMetricsInt.ascent - i13;
        this.f199964l = i12 - i11;
    }

    @NotNull
    public final h b(int i10, int i11, boolean z10) {
        return new h(this.f199953a, i10, i11, z10, this.f199957e, this.f199958f);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@NotNull CharSequence charSequence, int i10, int i11, int i12, int i13, @NotNull Paint.FontMetricsInt fontMetricsInt) {
        if (i.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z10 = i10 == this.f199954b;
        boolean z11 = i11 == this.f199955c;
        if (z10 && z11 && this.f199956d && this.f199957e) {
            return;
        }
        if (this.f199959g == Integer.MIN_VALUE) {
            a(fontMetricsInt);
        }
        fontMetricsInt.ascent = z10 ? this.f199959g : this.f199960h;
        fontMetricsInt.descent = z11 ? this.f199962j : this.f199961i;
    }

    public final int d() {
        return this.f199963k;
    }

    public final int e() {
        return this.f199964l;
    }

    public final float f() {
        return this.f199953a;
    }

    public final boolean g() {
        return this.f199957e;
    }
}
