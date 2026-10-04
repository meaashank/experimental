package b0;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: b0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(29)
public final class C2772y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2772y f120708a = new C2772y();

    @InterfaceC4345t
    public final void a(@NotNull Canvas canvas) {
        canvas.disableZ();
    }

    @InterfaceC4345t
    public final void b(@NotNull Canvas canvas, int i10, @NotNull BlendMode blendMode) {
        canvas.drawColor(i10, blendMode);
    }

    @InterfaceC4345t
    public final void c(@NotNull Canvas canvas, long j10) {
        canvas.drawColor(j10);
    }

    @InterfaceC4345t
    public final void d(@NotNull Canvas canvas, long j10, @NotNull BlendMode blendMode) {
        canvas.drawColor(j10, blendMode);
    }

    @InterfaceC4345t
    public final void e(@NotNull Canvas canvas, @NotNull RectF rectF, float f10, float f11, @NotNull RectF rectF2, float f12, float f13, @NotNull Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f10, f11, rectF2, f12, f13, paint);
    }

    @InterfaceC4345t
    public final void f(@NotNull Canvas canvas, @NotNull RectF rectF, @NotNull float[] fArr, @NotNull RectF rectF2, @NotNull float[] fArr2, @NotNull Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    @InterfaceC4345t
    public final void g(@NotNull Canvas canvas, @NotNull RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    @InterfaceC4345t
    public final void h(@NotNull Canvas canvas, @NotNull MeasuredText measuredText, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, @NotNull Paint paint) {
        canvas.drawTextRun(measuredText, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    @InterfaceC4345t
    public final void i(@NotNull Canvas canvas) {
        canvas.enableZ();
    }
}
