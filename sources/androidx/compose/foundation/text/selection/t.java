package androidx.compose.foundation.text.selection;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nSelectionHandles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,169:1\n149#2:170\n149#2:171\n*S KotlinDebug\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n*L\n36#1:170\n37#1:171\n*E\n"})
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f95016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f95017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final SemanticsPropertyKey<s> f95018c = new SemanticsPropertyKey<>("SelectionHandleInfo", null, 2, null);

    static {
        float f10 = 25;
        f95016a = f10;
        f95017b = f10;
    }

    public static final long a(long j10) {
        return P.h.a(P.g.p(j10), P.g.r(j10) - 1.0f);
    }

    public static final float b() {
        return f95017b;
    }

    public static final float c() {
        return f95016a;
    }

    @NotNull
    public static final SemanticsPropertyKey<s> d() {
        return f95018c;
    }

    public static final boolean e(@NotNull ResolvedTextDirection resolvedTextDirection, boolean z10) {
        if (resolvedTextDirection != ResolvedTextDirection.Ltr || z10) {
            return resolvedTextDirection == ResolvedTextDirection.Rtl && z10;
        }
        return true;
    }

    public static final boolean f(boolean z10, @NotNull ResolvedTextDirection resolvedTextDirection, boolean z11) {
        return z10 ? e(resolvedTextDirection, z11) : !e(resolvedTextDirection, z11);
    }
}
