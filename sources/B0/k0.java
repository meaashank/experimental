package b0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import e.InterfaceC4348w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC2733K
@androidx.compose.runtime.internal.r(parameters = 0)
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k0 f120649a = new k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final m0 f120650b = new C2746Y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f120651c = 8;

    public static StaticLayout b(k0 k0Var, CharSequence charSequence, TextPaint textPaint, int i10, int i11, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2, int i20, Object obj) {
        TextDirectionHeuristic textDirectionHeuristic2;
        Layout.Alignment alignment2;
        int[] iArr3;
        k0 k0Var2;
        CharSequence charSequence2;
        TextPaint textPaint2;
        int i21;
        int i22 = (i20 & 8) != 0 ? 0 : i11;
        int length = (i20 & 16) != 0 ? charSequence.length() : i12;
        if ((i20 & 32) != 0) {
            C2734L.f120593a.getClass();
            textDirectionHeuristic2 = C2734L.f120591R;
        } else {
            textDirectionHeuristic2 = textDirectionHeuristic;
        }
        if ((i20 & 64) != 0) {
            C2734L.f120593a.getClass();
            alignment2 = C2734L.f120590Q;
        } else {
            alignment2 = alignment;
        }
        int i23 = (i20 & 128) != 0 ? Integer.MAX_VALUE : i13;
        TextUtils.TruncateAt truncateAt2 = (i20 & 256) != 0 ? null : truncateAt;
        int i24 = (i20 & 512) != 0 ? i10 : i14;
        float f12 = (i20 & 1024) != 0 ? 1.0f : f10;
        float f13 = (i20 & 2048) != 0 ? 0.0f : f11;
        int i25 = (i20 & 4096) != 0 ? 0 : i15;
        boolean z12 = (i20 & 8192) != 0 ? false : z10;
        boolean z13 = (i20 & 16384) != 0 ? true : z11;
        int i26 = (32768 & i20) != 0 ? 0 : i16;
        int i27 = (65536 & i20) != 0 ? 0 : i17;
        int i28 = (131072 & i20) != 0 ? 0 : i18;
        int i29 = (262144 & i20) != 0 ? 0 : i19;
        int[] iArr4 = (524288 & i20) != 0 ? null : iArr;
        if ((i20 & 1048576) != 0) {
            iArr3 = null;
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            i21 = i10;
            k0Var2 = k0Var;
        } else {
            iArr3 = iArr2;
            k0Var2 = k0Var;
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            i21 = i10;
        }
        return k0Var2.a(charSequence2, textPaint2, i21, i22, length, textDirectionHeuristic2, alignment2, i23, truncateAt2, i24, f12, f13, i25, z12, z13, i26, i27, i28, i29, iArr4, iArr3);
    }

    @NotNull
    public final StaticLayout a(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, int i10, int i11, int i12, @NotNull TextDirectionHeuristic textDirectionHeuristic, @NotNull Layout.Alignment alignment, @e.D(from = 0) int i13, @Nullable TextUtils.TruncateAt truncateAt, @e.D(from = 0) int i14, @InterfaceC4348w(from = 0.0d) float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return f120650b.b(new o0(charSequence, i11, i12, textPaint, i10, textDirectionHeuristic, alignment, i13, truncateAt, i14, f10, f11, i15, z10, z11, i16, i17, i18, i19, iArr, iArr2));
    }

    public final boolean c(@NotNull StaticLayout staticLayout, boolean z10) {
        return f120650b.a(staticLayout, z10);
    }
}
