package b0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: b0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(26)
public final class C2766s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2766s f120704a = new C2766s();

    @InterfaceC4345t
    public final boolean a(@NotNull Canvas canvas, @NotNull Path path) {
        return canvas.clipOutPath(path);
    }

    @InterfaceC4345t
    public final boolean b(@NotNull Canvas canvas, float f10, float f11, float f12, float f13) {
        return canvas.clipOutRect(f10, f11, f12, f13);
    }

    @InterfaceC4345t
    public final boolean c(@NotNull Canvas canvas, int i10, int i11, int i12, int i13) {
        return canvas.clipOutRect(i10, i11, i12, i13);
    }

    @InterfaceC4345t
    public final boolean d(@NotNull Canvas canvas, @NotNull Rect rect) {
        return canvas.clipOutRect(rect);
    }

    @InterfaceC4345t
    public final boolean e(@NotNull Canvas canvas, @NotNull RectF rectF) {
        return canvas.clipOutRect(rectF);
    }
}
