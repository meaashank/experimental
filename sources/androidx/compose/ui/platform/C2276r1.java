package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.platform.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2276r1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f103922c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SemanticsNode f103923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Rect f103924b;

    public C2276r1(@NotNull SemanticsNode semanticsNode, @NotNull Rect rect) {
        this.f103923a = semanticsNode;
        this.f103924b = rect;
    }

    @NotNull
    public final Rect a() {
        return this.f103924b;
    }

    @NotNull
    public final SemanticsNode b() {
        return this.f103923a;
    }
}
