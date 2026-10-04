package com.bykv.vk.openvk.ZRu.ZRu.NOt.uR;

import U6.b;
import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import e.T;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public class NOt extends com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.ZRu {
    private final Object Ht;
    private volatile boolean Mm;
    private final MediaPlayer NOt;
    private Surface TFq;
    private final ZRu mZ;
    private com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.ZRu uR;

    public static class ZRu implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
        private final WeakReference<NOt> ZRu;

        public ZRu(NOt nOt) {
            this.ZRu = new WeakReference<>(nOt);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
            try {
                NOt nOt = this.ZRu.get();
                if (nOt != null) {
                    nOt.ZRu(i10);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                NOt nOt = this.ZRu.get();
                if (nOt != null) {
                    nOt.mZ();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                NOt nOt = this.ZRu.get();
                if (nOt != null) {
                    return nOt.ZRu(i10, i11);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                NOt nOt = this.ZRu.get();
                if (nOt != null) {
                    return nOt.NOt(i10, i11);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                NOt nOt = this.ZRu.get();
                if (nOt != null) {
                    nOt.NOt();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                NOt nOt = this.ZRu.get();
                if (nOt != null) {
                    nOt.uR();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                NOt nOt = this.ZRu.get();
                if (nOt != null) {
                    nOt.ZRu(i10, i11, 1, 1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public NOt() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.Ht = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.NOt = mediaPlayer;
        }
        ZRu(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable unused) {
        }
        this.mZ = new ZRu(this);
        yBV();
    }

    private void WMI() {
        try {
            Surface surface = this.TFq;
            if (surface != null) {
                surface.release();
                this.TFq = null;
            }
        } catch (Throwable unused) {
        }
    }

    private void ZRu(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object objNewInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.ZRu(), null, null);
            Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            try {
                declaredField.set(objNewInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, objNewInstance, null);
            } catch (Throwable unused) {
                declaredField.setAccessible(false);
            }
        } catch (Throwable unused2) {
        }
    }

    private void oK() {
        com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.ZRu zRu = this.uR;
        if (zRu != null) {
            try {
                zRu.close();
            } catch (Throwable unused) {
            }
            this.uR = null;
        }
    }

    private void yBV() {
        this.NOt.setOnPreparedListener(this.mZ);
        this.NOt.setOnBufferingUpdateListener(this.mZ);
        this.NOt.setOnCompletionListener(this.mZ);
        this.NOt.setOnSeekCompleteListener(this.mZ);
        this.NOt.setOnVideoSizeChangedListener(this.mZ);
        this.NOt.setOnErrorListener(this.mZ);
        this.NOt.setOnInfoListener(this.mZ);
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public void FA() {
        MediaPlayer mediaPlayer = this.NOt;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public void Ht() throws Throwable {
        this.NOt.stop();
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public void Mm() throws Throwable {
        this.NOt.pause();
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public void NOt(boolean z10) throws Throwable {
        this.NOt.setScreenOnWhilePlaying(z10);
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public void TFq() throws Throwable {
        this.NOt.start();
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public long Vor() {
        try {
            return this.NOt.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public void ZH() throws Throwable {
        synchronized (this.Ht) {
            try {
                if (!this.Mm) {
                    this.NOt.release();
                    this.Mm = true;
                    WMI();
                    oK();
                    ZRu();
                    yBV();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public long aT() {
        try {
            return this.NOt.getDuration();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public int edo() {
        MediaPlayer mediaPlayer = this.NOt;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    public void finalize() throws Throwable {
        super.finalize();
        WMI();
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public void lp() throws Throwable {
        try {
            this.NOt.reset();
        } catch (Throwable unused) {
        }
        oK();
        ZRu();
        yBV();
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public void mZ(boolean z10) throws Throwable {
        this.NOt.setLooping(z10);
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public int sAl() {
        MediaPlayer mediaPlayer = this.NOt;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public void uR(boolean z10) throws Throwable {
        MediaPlayer mediaPlayer = this.NOt;
        if (mediaPlayer == null) {
            return;
        }
        if (z10) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public void ZRu(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.Ht) {
            try {
                if (!this.Mm && surfaceHolder != null && surfaceHolder.getSurface() != null && this.ZRu) {
                    this.NOt.setDisplay(surfaceHolder);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    @TargetApi(14)
    public void ZRu(Surface surface) {
        WMI();
        this.TFq = surface;
        this.NOt.setSurface(surface);
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    @T(api = 23)
    public void ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.NOt nOt) throws Throwable {
        this.NOt.setPlaybackParams(this.NOt.getPlaybackParams().setSpeed(nOt.ZRu()));
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public void ZRu(String str) throws Throwable {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase(b.h.f68653a)) {
            this.NOt.setDataSource(uri.getPath());
        } else {
            this.NOt.setDataSource(str);
        }
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public void ZRu(FileDescriptor fileDescriptor) throws Throwable {
        this.NOt.setDataSource(fileDescriptor);
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    @T(api = 23)
    public synchronized void ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar) {
        this.uR = com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.ZRu.ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.ZRu(), mZVar);
        com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.NOt.mZ.ZRu(mZVar);
        this.NOt.setDataSource(this.uR);
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public void ZRu(long j10, int i10) throws Throwable {
        if (Build.VERSION.SDK_INT < 26) {
            this.NOt.seekTo((int) j10);
            return;
        }
        if (i10 == 0) {
            this.NOt.seekTo((int) j10, 0);
            return;
        }
        if (i10 == 1) {
            this.NOt.seekTo((int) j10, 1);
            return;
        }
        if (i10 == 2) {
            this.NOt.seekTo((int) j10, 2);
        } else if (i10 == 3) {
            this.NOt.seekTo((int) j10, 3);
        } else {
            this.NOt.seekTo((int) j10);
        }
    }
}
