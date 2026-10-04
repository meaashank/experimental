package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdxf {
    private final zzddn zza;
    private final zzdlu zzb;
    private final zzdew zzc;
    private final zzdfj zzd;
    private final zzdga zze;
    private final zzdit zzf;
    private final Executor zzg;
    private final zzdlq zzh;
    private final zzcuy zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzcef zzk;
    private final zzbbd zzl;
    private final zzdik zzm;
    private final zzele zzn;
    private final zzfte zzo;
    private final zzeaj zzp;
    private final zzcub zzq;
    private final zzdxl zzr;
    private final zzebm zzs;
    private final zzdcq zzt;
    private final zzdck zzu;
    private final zzdcg zzv;

    public zzdxf(zzddn zzddnVar, zzdew zzdewVar, zzdfj zzdfjVar, zzdga zzdgaVar, zzdit zzditVar, Executor executor, zzdlq zzdlqVar, zzcuy zzcuyVar, com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzcef zzcefVar, zzbbd zzbbdVar, zzdik zzdikVar, zzele zzeleVar, zzfte zzfteVar, zzeaj zzeajVar, zzdlu zzdluVar, zzcub zzcubVar, zzdxl zzdxlVar, zzebm zzebmVar, zzdcq zzdcqVar, zzdck zzdckVar, zzdcg zzdcgVar) {
        this.zza = zzddnVar;
        this.zzc = zzdewVar;
        this.zzd = zzdfjVar;
        this.zze = zzdgaVar;
        this.zzf = zzditVar;
        this.zzg = executor;
        this.zzh = zzdlqVar;
        this.zzi = zzcuyVar;
        this.zzj = zzbVar;
        this.zzk = zzcefVar;
        this.zzl = zzbbdVar;
        this.zzm = zzdikVar;
        this.zzn = zzeleVar;
        this.zzo = zzfteVar;
        this.zzp = zzeajVar;
        this.zzb = zzdluVar;
        this.zzq = zzcubVar;
        this.zzr = zzdxlVar;
        this.zzs = zzebmVar;
        this.zzt = zzdcqVar;
        this.zzu = zzdckVar;
        this.zzv = zzdcgVar;
    }

    public static final ListenableFuture zzj(zzclm zzclmVar, String str, String str2, final zzeae zzeaeVar, zzfrg zzfrgVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcV)).booleanValue()) {
            E0.a(zzeaeVar, zzdzs.RENDERING_WEBVIEW_LOAD_HTML_START.zza());
        }
        final zzcgo zzcgoVar = new zzcgo();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkq)).booleanValue()) {
            zzfqw zzfqwVarA = R0.a(zzclmVar.getContext(), 112);
            zzfqwVarA.zza();
            zzfrf.zzd(zzcgoVar, zzfrgVar, zzfqwVarA);
        }
        zzclmVar.zzP().zzG(new zzcni() { // from class: com.google.android.gms.internal.ads.zzdxd
            @Override // com.google.android.gms.internal.ads.zzcni
            public final /* synthetic */ void zza(boolean z10, int i10, String str3, String str4) {
                zzcgo zzcgoVar2 = zzcgoVar;
                if (z10) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcV)).booleanValue()) {
                        E0.a(zzeaeVar, zzdzs.RENDERING_WEBVIEW_LOAD_HTML_END.zza());
                    }
                    zzcgoVar2.zzc(null);
                    return;
                }
                int length = String.valueOf(i10).length();
                StringBuilder sb2 = new StringBuilder(length + 55 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb2.append("Ad Web View failed to load. Error code: ");
                sb2.append(i10);
                sb2.append(", Description: ");
                sb2.append(str3);
                zzcgoVar2.zzd(new Exception(android.support.v4.media.e.a(sb2, ", Failing URL: ", str4)));
            }
        });
        zzclmVar.zzau(str, str2, null);
        return zzcgoVar;
    }

    public final /* synthetic */ void zza() {
        this.zza.onAdClicked();
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public final /* synthetic */ void zzc() {
        this.zzc.zzb();
    }

    public final /* synthetic */ boolean zzd(View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlH)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
        }
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public final /* synthetic */ void zze(View view) {
        this.zzj.zza();
    }

    public final /* synthetic */ void zzf(zzclm zzclmVar, zzclm zzclmVar2, Map map) {
        this.zzi.zzn(zzclmVar);
    }

    public final /* synthetic */ zzdew zzg() {
        return this.zzc;
    }

    public final /* synthetic */ zzdik zzh() {
        return this.zzm;
    }

    public final void zzi(final zzclm zzclmVar, boolean z10, zzbqk zzbqkVar, zzeae zzeaeVar) {
        zzbay zzbayVarZzb;
        zzbix zzbixVar = zzbjg.zzcV;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
            E0.a(zzeaeVar, zzdzs.RENDERING_CONFIGURE_WEBVIEW_START.zza());
        }
        zzclmVar.zzP().zzab(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdxe
            @Override // com.google.android.gms.ads.internal.client.zza
            public final /* synthetic */ void onAdClicked() {
                this.zza.zza();
            }
        }, this.zzd, this.zze, new zzboz() { // from class: com.google.android.gms.internal.ads.zzdwx
            @Override // com.google.android.gms.internal.ads.zzboz
            public final /* synthetic */ void zzb(String str, String str2) {
                this.zza.zzb(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdwy
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                this.zza.zzc();
            }
        }, z10, zzbqkVar, this.zzj, new zzdww(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq, this.zzs, this.zzt, this.zzu, this.zzv);
        zzclmVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdwz
            @Override // android.view.View.OnTouchListener
            public final /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
                this.zza.zzd(view, motionEvent);
                return false;
            }
        });
        zzclmVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdxa
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                this.zza.zze(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdE)).booleanValue() && (zzbayVarZzb = this.zzl.zzb()) != null) {
            zzbayVarZzb.zzh(zzclmVar.zzE());
        }
        zzdlq zzdlqVar = this.zzh;
        Executor executor = this.zzg;
        zzdlqVar.zzq(zzclmVar, executor);
        zzdlqVar.zzq(new zzbfg() { // from class: com.google.android.gms.internal.ads.zzdxb
            @Override // com.google.android.gms.internal.ads.zzbfg
            public final /* synthetic */ void zzdj(zzbff zzbffVar) {
                Rect rect = zzbffVar.zzd;
                zzclmVar.zzP().zza(rect.left, rect.top, false);
            }
        }, executor);
        zzdlqVar.zza(zzclmVar.zzE());
        zzclmVar.zzab("/trackActiveViewUnit", new zzbqh() { // from class: com.google.android.gms.internal.ads.zzdxc
            @Override // com.google.android.gms.internal.ads.zzbqh
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzf(zzclmVar, (zzclm) obj, map);
            }
        });
        this.zzi.zzo(zzclmVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
            E0.a(zzeaeVar, zzdzs.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
    }
}
