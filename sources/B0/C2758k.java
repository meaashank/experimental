package b0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nBoringLayoutFactory.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoringLayoutFactory.android.kt\nandroidx/compose/ui/text/android/BoringLayoutFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n1#2:224\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C2758k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2758k f120647a = new C2758k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f120648b = 0;

    @NotNull
    public final BoringLayout a(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, int i10, @NotNull BoringLayout.Metrics metrics, @NotNull Layout.Alignment alignment, boolean z10, boolean z11, @Nullable TextUtils.TruncateAt truncateAt, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("negative width");
        }
        if (i11 >= 0) {
            return Build.VERSION.SDK_INT >= 33 ? C2757j.a(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10, z11, truncateAt, i11) : C2759l.a(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10, truncateAt, i11);
        }
        throw new IllegalArgumentException("negative ellipsized width");
    }

    public final boolean c(@NotNull BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return C2757j.d(boringLayout);
        }
        return false;
    }

    @Nullable
    public final BoringLayout.Metrics d(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, @NotNull TextDirectionHeuristic textDirectionHeuristic) {
        return Build.VERSION.SDK_INT >= 33 ? C2757j.c(charSequence, textPaint, textDirectionHeuristic) : C2759l.c(charSequence, textPaint, textDirectionHeuristic);
    }
}
