package b0;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b0.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(31)
public final class C2729G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2729G f120565a = new C2729G();

    @InterfaceC4345t
    public final void a(@NotNull Canvas canvas, @NotNull int[] iArr, int i10, @NotNull float[] fArr, int i11, int i12, @NotNull Font font, @NotNull Paint paint) {
        canvas.drawGlyphs(iArr, i10, fArr, i11, i12, font, paint);
    }

    @InterfaceC4345t
    public final void b(@NotNull Canvas canvas, @NotNull NinePatch ninePatch, @NotNull Rect rect, @Nullable Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    @InterfaceC4345t
    public final void c(@NotNull Canvas canvas, @NotNull NinePatch ninePatch, @NotNull RectF rectF, @Nullable Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
