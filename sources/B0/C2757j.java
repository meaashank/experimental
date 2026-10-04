package b0;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(33)
public final class C2757j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2757j f120645a = new C2757j();

    @dd.o
    @InterfaceC4345t
    @NotNull
    public static final BoringLayout a(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, int i10, @NotNull Layout.Alignment alignment, float f10, float f11, @NotNull BoringLayout.Metrics metrics, boolean z10, boolean z11, @Nullable TextUtils.TruncateAt truncateAt, int i11) {
        return C2756i.a(charSequence, textPaint, i10, alignment, f10, f11, metrics, z10, truncateAt, i11, z11);
    }

    @dd.o
    @InterfaceC4345t
    @Nullable
    public static final BoringLayout.Metrics c(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, @NotNull TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    @dd.o
    @InterfaceC4345t
    public static final boolean d(@NotNull BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }
}
