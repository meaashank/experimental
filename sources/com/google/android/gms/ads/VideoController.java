package com.google.android.gms.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoController {

    @KeepForSdk
    public static final int PLAYBACK_STATE_ENDED = 3;

    @KeepForSdk
    public static final int PLAYBACK_STATE_PAUSED = 2;

    @KeepForSdk
    public static final int PLAYBACK_STATE_PLAYING = 1;

    @KeepForSdk
    public static final int PLAYBACK_STATE_READY = 5;

    @KeepForSdk
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object zza = new Object();

    @Nullable
    private zzea zzb;

    @Nullable
    private VideoLifecycleCallbacks zzc;

    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z10) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    @KeepForSdk
    public int getPlaybackState() {
        synchronized (this.zza) {
            zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return 0;
            }
            try {
                return zzeaVar.zzi();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call getPlaybackState on video controller.", e10);
                return 0;
            }
        }
    }

    @Nullable
    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.zza) {
            videoLifecycleCallbacks = this.zzc;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z10;
        synchronized (this.zza) {
            z10 = this.zzb != null;
        }
        return z10;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.zza) {
            zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return false;
            }
            try {
                return zzeaVar.zzp();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call isClickToExpandEnabled.", e10);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.zza) {
            zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return false;
            }
            try {
                return zzeaVar.zzn();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call isUsingCustomPlayerControls.", e10);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.zza) {
            zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return true;
            }
            try {
                return zzeaVar.zzh();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call isMuted on video controller.", e10);
                return true;
            }
        }
    }

    public void mute(boolean z10) {
        synchronized (this.zza) {
            zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zzg(z10);
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call mute on video controller.", e10);
            }
        }
    }

    public void pause() {
        synchronized (this.zza) {
            zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zzf();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call pause on video controller.", e10);
            }
        }
    }

    public void play() {
        synchronized (this.zza) {
            zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zze();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call play on video controller.", e10);
            }
        }
    }

    public void setVideoLifecycleCallbacks(@Nullable VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfv zzfvVar;
        synchronized (this.zza) {
            this.zzc = videoLifecycleCallbacks;
            zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return;
            }
            if (videoLifecycleCallbacks == null) {
                zzfvVar = null;
            } else {
                try {
                    zzfvVar = new zzfv(videoLifecycleCallbacks);
                } catch (RemoteException e10) {
                    zzo.zzg("Unable to call setVideoLifecycleCallbacks on video controller.", e10);
                }
            }
            zzeaVar.zzl(zzfvVar);
        }
    }

    public void stop() {
        synchronized (this.zza) {
            zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zzq();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call stop on video controller.", e10);
            }
        }
    }

    public final void zza(@Nullable zzea zzeaVar) {
        synchronized (this.zza) {
            try {
                this.zzb = zzeaVar;
                VideoLifecycleCallbacks videoLifecycleCallbacks = this.zzc;
                if (videoLifecycleCallbacks != null) {
                    setVideoLifecycleCallbacks(videoLifecycleCallbacks);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final zzea zzb() {
        zzea zzeaVar;
        synchronized (this.zza) {
            zzeaVar = this.zzb;
        }
        return zzeaVar;
    }
}
