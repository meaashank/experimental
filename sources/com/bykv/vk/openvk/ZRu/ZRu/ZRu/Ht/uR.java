package com.bykv.vk.openvk.ZRu.ZRu.ZRu.Ht;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.ZRu.ZRu.ZRu.Ht.NOt;

/* JADX INFO: loaded from: classes2.dex */
public class uR extends TextureView implements TextureView.SurfaceTextureListener, NOt {
    private NOt.ZRu NOt;
    private ZRu ZRu;

    public uR(Context context) {
        this(context, null);
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.Ht.NOt
    public void ZRu(ZRu zRu) {
        this.ZRu = zRu;
        setSurfaceTextureListener(this);
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.Ht.NOt
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.Ht.NOt
    public View getView() {
        return this;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        ZRu zRu = this.ZRu;
        if (zRu != null) {
            zRu.ZRu(surfaceTexture, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ZRu zRu = this.ZRu;
        if (zRu != null) {
            return zRu.ZRu(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public void setWindowVisibilityChangedListener(NOt.ZRu zRu) {
        this.NOt = zRu;
    }

    public uR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.Ht.NOt
    public void ZRu(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }
}
