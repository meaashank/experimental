package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.SurfaceHolder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SurfaceHolderCallbackC1649d extends BaseAndroidExternalSurfaceState implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f89070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f89071g;

    public SurfaceHolderCallbackC1649d(@NotNull kotlinx.coroutines.L l10) {
        super(l10);
        this.f89070f = -1;
        this.f89071g = -1;
    }

    public final int j() {
        return this.f89071g;
    }

    public final int k() {
        return this.f89070f;
    }

    public final void l(int i10) {
        this.f89071g = i10;
    }

    public final void m(int i10) {
        this.f89070f = i10;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NotNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        if (this.f89070f == i11 && this.f89071g == i12) {
            return;
        }
        this.f89070f = i11;
        this.f89071g = i12;
        f(surfaceHolder.getSurface(), i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NotNull SurfaceHolder surfaceHolder) {
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        this.f89070f = surfaceFrame.width();
        this.f89071g = surfaceFrame.height();
        g(surfaceHolder.getSurface(), this.f89070f, this.f89071g);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NotNull SurfaceHolder surfaceHolder) {
        h(surfaceHolder.getSurface());
    }
}
