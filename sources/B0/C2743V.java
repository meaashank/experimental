package b0;

import android.graphics.Paint;
import android.graphics.Rect;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: b0.V, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(29)
public final class C2743V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2743V f120639a = new C2743V();

    @dd.o
    @InterfaceC4345t
    public static final void a(@NotNull Paint paint, @NotNull CharSequence charSequence, int i10, int i11, @NotNull Rect rect) {
        paint.getTextBounds(charSequence, i10, i11, rect);
    }
}
