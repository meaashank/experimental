package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqr {
    private final Context zza;
    private final zzqq zzb;
    private final Handler zzc;
    private final zzqn zzd;
    private final BroadcastReceiver zze;

    @Nullable
    private final zzqo zzf;

    @Nullable
    private zzacr zzg;

    @Nullable
    private zzql zzh;

    @Nullable
    private AudioDeviceInfo zzi;
    private zzd zzj;
    private boolean zzk;

    /* JADX WARN: Multi-variable type inference failed */
    public zzqr(Context context, zzqq zzqqVar, zzd zzdVar, @Nullable AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = zzqqVar;
        this.zzj = zzdVar;
        this.zzi = audioDeviceInfo;
        Handler handler = new Handler(zzfm.zzf(), null);
        this.zzc = handler;
        this.zzd = new zzqn(this, null);
        this.zze = new zzqp(this, 0 == true ? 1 : 0);
        Uri uriZzc = zzql.zzc();
        this.zzf = uriZzc != null ? new zzqo(this, handler, applicationContext.getContentResolver(), uriZzc) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final List zzg() {
        zzacr zzacrVar;
        return (Build.VERSION.SDK_INT < 32 || (zzacrVar = this.zzg) == null) ? zzgxm.zzi() : zzacrVar.zzf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzh(zzql zzqlVar) {
        if (!this.zzk || zzqlVar.equals(this.zzh)) {
            return;
        }
        this.zzh = zzqlVar;
        this.zzb.zza(zzqlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzo, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzi() {
        zzh(zzql.zza(this.zza, this.zzj, this.zzi, zzg()));
    }

    public final void zza(zzql zzqlVar) {
        zzh(zzqlVar);
    }

    public final void zzb(zzd zzdVar) {
        if (Objects.equals(zzdVar, this.zzj)) {
            return;
        }
        this.zzj = zzdVar;
        zzh(zzql.zza(this.zza, zzdVar, this.zzi, zzg()));
    }

    public final void zzc(@Nullable AudioDeviceInfo audioDeviceInfo) {
        if (Objects.equals(audioDeviceInfo, this.zzi)) {
            return;
        }
        this.zzi = audioDeviceInfo;
        zzh(zzql.zza(this.zza, this.zzj, audioDeviceInfo, zzg()));
    }

    public final zzql zzd() {
        if (this.zzk) {
            zzql zzqlVar = this.zzh;
            zzqlVar.getClass();
            return zzqlVar;
        }
        this.zzk = true;
        zzqo zzqoVar = this.zzf;
        if (zzqoVar != null) {
            zzqoVar.zza();
        }
        Context context = this.zza;
        zzqn zzqnVar = this.zzd;
        Handler handler = this.zzc;
        zzcj.zza(context).registerAudioDeviceCallback(zzqnVar, handler);
        if (Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzacr(context, new Runnable() { // from class: com.google.android.gms.internal.ads.zzqm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzf();
                }
            }, Boolean.valueOf(zzfm.zzR(context)));
        }
        zzql zzqlVarZzb = zzql.zzb(context, context.registerReceiver(this.zze, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), this.zzj, this.zzi, zzg());
        this.zzh = zzqlVarZzb;
        return zzqlVarZzb;
    }

    public final void zze() {
        zzacr zzacrVar;
        if (this.zzk) {
            this.zzh = null;
            Context context = this.zza;
            zzcj.zza(context).unregisterAudioDeviceCallback(this.zzd);
            if (Build.VERSION.SDK_INT >= 32 && (zzacrVar = this.zzg) != null) {
                zzacrVar.zzg();
                this.zzg = null;
            }
            context.unregisterReceiver(this.zze);
            zzqo zzqoVar = this.zzf;
            if (zzqoVar != null) {
                zzqoVar.zzb();
            }
            this.zzk = false;
        }
    }

    public final /* synthetic */ AudioDeviceInfo zzj() {
        return this.zzi;
    }

    public final /* synthetic */ void zzk(AudioDeviceInfo audioDeviceInfo) {
        this.zzi = null;
    }

    public final /* synthetic */ zzd zzl() {
        return this.zzj;
    }
}
