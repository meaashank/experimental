package b0;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2759l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2759l f120652a = new C2759l();

    @dd.o
    @InterfaceC4345t
    @NotNull
    public static final BoringLayout a(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, int i10, @NotNull Layout.Alignment alignment, float f10, float f11, @NotNull BoringLayout.Metrics metrics, boolean z10, @Nullable TextUtils.TruncateAt truncateAt, int i11) {
        return new BoringLayout(charSequence, textPaint, i10, alignment, f10, f11, metrics, z10, truncateAt, i11);
    }

    @dd.o
    @InterfaceC4345t
    @Nullable
    public static final BoringLayout.Metrics c(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, @NotNull TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }
}
