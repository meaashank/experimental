package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdwk extends zzcyl {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdom zze;
    private final zzdla zzf;
    private final zzdec zzg;
    private final zzdfj zzh;
    private final zzczg zzi;
    private final zzccx zzj;
    private final zzfys zzk;
    private final zzflq zzl;
    private final zzeaj zzm;
    private boolean zzn;

    public zzdwk(zzcyk zzcykVar, Context context, @Nullable zzclm zzclmVar, zzdom zzdomVar, zzdla zzdlaVar, zzdec zzdecVar, zzdfj zzdfjVar, zzczg zzczgVar, zzfld zzfldVar, zzfys zzfysVar, zzflq zzflqVar, zzeaj zzeajVar) {
        super(zzcykVar);
        this.zzn = false;
        this.zzc = context;
        this.zze = zzdomVar;
        this.zzd = new WeakReference(zzclmVar);
        this.zzf = zzdlaVar;
        this.zzg = zzdecVar;
        this.zzh = zzdfjVar;
        this.zzi = zzczgVar;
        this.zzk = zzfysVar;
        zzcct zzcctVar = zzfldVar.zzl;
        this.zzj = new zzcdr(zzcctVar != null ? zzcctVar.zza : "", zzcctVar != null ? zzcctVar.zzb : 1);
        this.zzl = zzflqVar;
        this.zzm = zzeajVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzclm zzclmVar = (zzclm) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhM)).booleanValue()) {
                if (!this.zzn && zzclmVar != null) {
                    zzcgj.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwj
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzclmVar.destroy();
                        }
                    });
                }
            } else if (zzclmVar != null) {
                zzclmVar.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean zza(boolean z10, @Nullable Activity activity) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdom zzdomVar = this.zze;
        if (!com.google.android.gms.ads.internal.util.zzs.zzR(zzdomVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpt)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzQ(this.zzc, this.zzb, this.zzm);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbs)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc)) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzg.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbt)).booleanValue()) {
                        this.zzk.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        if (this.zzn) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The rewarded ad have been showed.");
            this.zzg.zzc(zzfmy.zzd(10, null, null));
            return false;
        }
        this.zzn = true;
        zzdla zzdlaVar = this.zzf;
        zzdlaVar.zza();
        Context context = activity;
        if (activity == null) {
            context = this.zzc;
        }
        try {
            zzdomVar.zza(z10, context, this.zzg);
            zzdlaVar.zzb();
            return true;
        } catch (zzdol e10) {
            this.zzg.zzd(e10);
            return false;
        }
    }

    public final boolean zzb() {
        return this.zzn;
    }

    public final zzccx zzc() {
        return this.zzj;
    }

    public final boolean zze() {
        return this.zzi.zzl();
    }

    public final boolean zzf() {
        zzclm zzclmVar = (zzclm) this.zzd.get();
        return (zzclmVar == null || zzclmVar.zzaB()) ? false : true;
    }

    public final Bundle zzg() {
        return this.zzh.zzb();
    }

    public final zzflq zzh() {
        return this.zzl;
    }
}
