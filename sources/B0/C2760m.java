package b0;

import android.graphics.Canvas;
import android.graphics.Paint;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: b0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(23)
public final class C2760m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2760m f120656a = new C2760m();

    @InterfaceC4345t
    public final void a(@NotNull Canvas canvas, @NotNull CharSequence charSequence, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, @NotNull Paint paint) {
        canvas.drawTextRun(charSequence, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    @InterfaceC4345t
    public final void b(@NotNull Canvas canvas, @NotNull char[] cArr, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, @NotNull Paint paint) {
        canvas.drawTextRun(cArr, i10, i11, i12, i13, f10, f11, z10, paint);
    }
}
