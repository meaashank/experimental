package androidx.compose.foundation;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC1647b extends BaseAndroidExternalSurfaceState implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f88916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Matrix f88917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Surface f88918h;

    public TextureViewSurfaceTextureListenerC1647b(@NotNull kotlinx.coroutines.L l10) {
        super(l10);
        k0.x.f214338b.getClass();
        this.f88916f = k0.x.f214339c;
        this.f88917g = new Matrix();
    }

    @NotNull
    public final Matrix j() {
        return this.f88917g;
    }

    public final long k() {
        return this.f88916f;
    }

    public final void l(long j10) {
        this.f88916f = j10;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surfaceTexture, int i10, int i11) {
        long j10 = this.f88916f;
        k0.x.f214338b.getClass();
        if (!k0.x.h(j10, k0.x.f214339c)) {
            long j11 = this.f88916f;
            int i12 = (int) (j11 >> 32);
            i11 = (int) (j11 & ZipKt.f225990j);
            surfaceTexture.setDefaultBufferSize(i12, i11);
            i10 = i12;
        }
        Surface surface = new Surface(surfaceTexture);
        this.f88918h = surface;
        g(surface, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surfaceTexture) {
        Surface surface = this.f88918h;
        kotlin.jvm.internal.G.m(surface);
        h(surface);
        this.f88918h = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surfaceTexture, int i10, int i11) {
        long j10 = this.f88916f;
        k0.x.f214338b.getClass();
        if (!k0.x.h(j10, k0.x.f214339c)) {
            long j11 = this.f88916f;
            int i12 = (int) (j11 >> 32);
            i11 = (int) (j11 & ZipKt.f225990j);
            surfaceTexture.setDefaultBufferSize(i12, i11);
            i10 = i12;
        }
        Surface surface = this.f88918h;
        kotlin.jvm.internal.G.m(surface);
        f(surface, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surfaceTexture) {
    }
}
