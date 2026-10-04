package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcuy implements zzbfg, zzdek, com.google.android.gms.ads.internal.overlay.zzr, zzdej {
    private final zzcut zza;
    private final zzcuu zzb;
    private final zzbvm zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcux zzh = new zzcux();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcuy(zzbvj zzbvjVar, zzcuu zzcuuVar, Executor executor, zzcut zzcutVar, Clock clock) {
        this.zza = zzcutVar;
        zzbuu zzbuuVar = zzbux.zza;
        this.zzd = zzbvjVar.zza("google.afma.activeView.handleUpdate", zzbuuVar, zzbuuVar);
        this.zzb = zzcuuVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzp() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzc((zzclm) it.next());
        }
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final synchronized void zza(@Nullable Context context) {
        this.zzh.zzb = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final synchronized void zzb(@Nullable Context context) {
        this.zzh.zzb = false;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final synchronized void zzc(@Nullable Context context) {
        this.zzh.zze = "u";
        zzl();
        zzp();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final synchronized void zzdj(zzbff zzbffVar) {
        zzcux zzcuxVar = this.zzh;
        zzcuxVar.zza = zzbffVar.zzj;
        zzcuxVar.zzf = zzbffVar;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final synchronized void zzdr() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zza(this);
            zzl();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdw() {
        this.zzh.zzb = true;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdx() {
        this.zzh.zzb = false;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    public final synchronized void zzl() {
        try {
            if (this.zzj.get() == null) {
                zzm();
                return;
            }
            if (this.zzi || !this.zzg.get()) {
                return;
            }
            try {
                zzcux zzcuxVar = this.zzh;
                zzcuxVar.zzd = this.zzf.elapsedRealtime();
                final JSONObject jSONObjectZza = this.zzb.zzb(zzcuxVar);
                for (final zzclm zzclmVar : this.zzc) {
                    this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuw
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            JSONObject jSONObject = jSONObjectZza;
                            String string = jSONObject.toString();
                            String strA = androidx.compose.animation.core.E0.a(new StringBuilder(string.length() + 31), "Calling AFMA_updateActiveView(", string, ")");
                            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzd(strA);
                            zzclmVar.zzb("AFMA_updateActiveView", jSONObject);
                        }
                    });
                }
                zzcgm.zzb(this.zzd.zzb(jSONObjectZza), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzm() {
        zzp();
        this.zzi = true;
    }

    public final synchronized void zzn(zzclm zzclmVar) {
        this.zzc.add(zzclmVar);
        this.zza.zzb(zzclmVar);
    }

    public final void zzo(Object obj) {
        this.zzj = new WeakReference(obj);
    }
}
