package b0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: b0.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(30)
public final class C2725C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2725C f120564a = new C2725C();

    @InterfaceC4345t
    public final boolean a(@NotNull Canvas canvas, float f10, float f11, float f12, float f13) {
        return canvas.quickReject(f10, f11, f12, f13);
    }

    @InterfaceC4345t
    public final boolean b(@NotNull Canvas canvas, @NotNull Path path) {
        return canvas.quickReject(path);
    }

    @InterfaceC4345t
    public final boolean c(@NotNull Canvas canvas, @NotNull RectF rectF) {
        return canvas.quickReject(rectF);
    }
}
