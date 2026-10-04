package b0;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nStaticLayoutFactory.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticLayoutFactory.android.kt\nandroidx/compose/ui/text/android/StaticLayoutParams\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n1#2:354\n*E\n"})
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CharSequence f120658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f120659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f120660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TextPaint f120661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f120662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TextDirectionHeuristic f120663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Layout.Alignment f120664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f120665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final TextUtils.TruncateAt f120666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f120667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f120668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f120669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f120670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f120671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f120672o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f120673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f120674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f120675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f120676s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final int[] f120677t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final int[] f120678u;

    public o0(@NotNull CharSequence charSequence, int i10, int i11, @NotNull TextPaint textPaint, int i12, @NotNull TextDirectionHeuristic textDirectionHeuristic, @NotNull Layout.Alignment alignment, int i13, @Nullable TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, @Nullable int[] iArr, @Nullable int[] iArr2) {
        this.f120658a = charSequence;
        this.f120659b = i10;
        this.f120660c = i11;
        this.f120661d = textPaint;
        this.f120662e = i12;
        this.f120663f = textDirectionHeuristic;
        this.f120664g = alignment;
        this.f120665h = i13;
        this.f120666i = truncateAt;
        this.f120667j = i14;
        this.f120668k = f10;
        this.f120669l = f11;
        this.f120670m = i15;
        this.f120671n = z10;
        this.f120672o = z11;
        this.f120673p = i16;
        this.f120674q = i17;
        this.f120675r = i18;
        this.f120676s = i19;
        this.f120677t = iArr;
        this.f120678u = iArr2;
        if (i10 < 0 || i10 > i11) {
            throw new IllegalArgumentException("invalid start value");
        }
        int length = charSequence.length();
        if (i11 < 0 || i11 > length) {
            throw new IllegalArgumentException("invalid end value");
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("invalid maxLines value");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("invalid width value");
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value");
        }
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("invalid lineSpacingMultiplier value");
        }
    }

    @NotNull
    public final Layout.Alignment a() {
        return this.f120664g;
    }

    public final int b() {
        return this.f120673p;
    }

    @Nullable
    public final TextUtils.TruncateAt c() {
        return this.f120666i;
    }

    public final int d() {
        return this.f120667j;
    }

    public final int e() {
        return this.f120660c;
    }

    public final int f() {
        return this.f120676s;
    }

    public final boolean g() {
        return this.f120671n;
    }

    public final int h() {
        return this.f120670m;
    }

    @Nullable
    public final int[] i() {
        return this.f120677t;
    }

    public final int j() {
        return this.f120674q;
    }

    public final int k() {
        return this.f120675r;
    }

    public final float l() {
        return this.f120669l;
    }

    public final float m() {
        return this.f120668k;
    }

    public final int n() {
        return this.f120665h;
    }

    @NotNull
    public final TextPaint o() {
        return this.f120661d;
    }

    @Nullable
    public final int[] p() {
        return this.f120678u;
    }

    public final int q() {
        return this.f120659b;
    }

    @NotNull
    public final CharSequence r() {
        return this.f120658a;
    }

    @NotNull
    public final TextDirectionHeuristic s() {
        return this.f120663f;
    }

    public final boolean t() {
        return this.f120672o;
    }

    public final int u() {
        return this.f120662e;
    }

    public /* synthetic */ o0(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2, int i20, C4969v c4969v) {
        this(charSequence, (i20 & 2) != 0 ? 0 : i10, i11, textPaint, i12, textDirectionHeuristic, alignment, i13, truncateAt, i14, f10, f11, i15, z10, z11, i16, i17, i18, i19, iArr, iArr2);
    }
}
