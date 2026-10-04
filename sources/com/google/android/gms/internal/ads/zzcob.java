package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcob implements zzcsi {

    @Nullable
    private static zzcob zza;

    private static synchronized zzcob zzH(Context context, @Nullable zzbvu zzbvuVar, int i10, boolean z10, int i11, zzcpl zzcplVar) {
        try {
            zzcob zzcobVar = zza;
            if (zzcobVar != null) {
                return zzcobVar;
            }
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzbjg.zza(context);
            if (((Boolean) zzbkz.zze.zze()).booleanValue()) {
                zzbir.zza(context);
            }
            zzfms zzfmsVarZza = zzfms.zza(context);
            VersionInfoParcel versionInfoParcelZzb = zzfmsVarZza.zzb(ModuleDescriptor.MODULE_VERSION, false, i11);
            zzfmsVarZza.zzc(zzbvuVar);
            zzcqa zzcqaVar = new zzcqa(null);
            zzcoc zzcocVar = new zzcoc();
            zzcocVar.zza(versionInfoParcelZzb);
            zzcocVar.zzb(context);
            zzcocVar.zzc(jCurrentTimeMillis);
            zzcqaVar.zza(new zzcod(zzcocVar, null));
            zzcqaVar.zzb(new zzcqx(zzcplVar));
            zzcob zzcobVarZzc = zzcqaVar.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpC)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zze().zza(zzfoy.zzc(), zzcobVarZzc.zzD(), context);
                com.google.android.gms.ads.internal.zzt.zze().zzb();
            }
            ((zzeez) ((zzcpp) zzcobVarZzc).zzs.zzb()).zza();
            ((zzcnu) ((zzcpp) zzcobVarZzc).zzr.zzb()).zza(context, versionInfoParcelZzb);
            com.google.android.gms.ads.internal.zzt.zzh().zzf(context, versionInfoParcelZzb, zzcobVarZzc.zzD());
            com.google.android.gms.ads.internal.zzt.zzj().zza(context);
            com.google.android.gms.ads.internal.zzt.zzc().zzc(context);
            com.google.android.gms.ads.internal.zzt.zzc().zzd(context);
            com.google.android.gms.ads.internal.util.zzd.zza(context);
            com.google.android.gms.ads.internal.zzt.zzg().zza(context);
            com.google.android.gms.ads.internal.zzt.zzA().zza(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpY)).booleanValue()) {
                String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpZ);
                if (!str.isEmpty()) {
                    if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                        zzcobVarZzc.zzE().zza(com.google.android.gms.ads.internal.zzt.zzg());
                    }
                }
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpX)).booleanValue()) {
                    zzcobVarZzc.zzE().zza(com.google.android.gms.ads.internal.zzt.zzg());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzqi)).booleanValue()) {
                ((DeviceTierManager) ((zzcpp) zzcobVarZzc).zzm.zzb()).initialize();
            }
            ((com.google.android.gms.ads.internal.util.zzbz) ((zzcpp) zzcobVarZzc).zzaz.zzb()).zza();
            zzces.zzb(context);
            com.google.android.gms.ads.internal.zzt.zzD().zza(zzcobVarZzc.zzD());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhn)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbn)).booleanValue()) {
                    new zzeks(context, versionInfoParcelZzb, new zzbif(new zzbik(context)), new zzejx(new zzejt(context), (zzhdi) ((zzcpp) zzcobVarZzc).zzd.zzb())).zza(com.google.android.gms.ads.internal.zzt.zzh().zzp().zzx());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpR)).booleanValue()) {
                zzcobVarZzc.zzg().zza();
            }
            zza = zzcobVarZzc;
            return zzcobVarZzc;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static zzcob zza(Context context, @Nullable zzbvu zzbvuVar, int i10) {
        return zzH(context, zzbvuVar, ModuleDescriptor.MODULE_VERSION, false, i10, new zzcpl());
    }

    public abstract zzeca zzA();

    public abstract zzfmm zzB();

    public abstract zzeem zzC();

    public abstract zzeaj zzD();

    public abstract zzdxs zzE();

    @Override // com.google.android.gms.internal.ads.zzcsi
    public final zzcfl zzF() {
        return zzG();
    }

    public abstract zzcfl zzG();

    public abstract Executor zzb();

    public abstract ScheduledExecutorService zzc();

    public abstract zzdgq zzd();

    public abstract zzcrj zze();

    public abstract zzfud zzf();

    public abstract zzeie zzg();

    public abstract zzeig zzh();

    public abstract zzcxh zzi();

    public abstract zzfhs zzj();

    public abstract zzcvq zzk();

    public abstract zzfge zzl();

    public abstract zzdod zzm();

    public abstract zzfji zzn();

    public abstract zzdoz zzo();

    public abstract zzdwo zzp();

    public abstract zzfkw zzq();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzw zzr();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzap zzs();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzq zzt();

    public abstract zzelp zzu();

    public abstract zzfmv zzv();

    public abstract zzedp zzw();

    public abstract zzfrj zzx();

    @Override // com.google.android.gms.internal.ads.zzcsi
    public final zzfek zzy(zzcbv zzcbvVar, int i10) {
        return zzz(new zzffn(zzcbvVar, i10));
    }

    public abstract zzfek zzz(zzffn zzffnVar);
}
