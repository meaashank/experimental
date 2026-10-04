package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbqg {
    public static final zzbqh zza = zzbqf.zza;
    public static final zzbqh zzb = zzbpw.zza;
    public static final zzbqh zzc = zzbpx.zza;
    public static final zzbqh zzd = new zzbpo();
    public static final zzbqh zze = new zzbpp();
    public static final zzbqh zzf = zzbqc.zza;
    public static final zzbqh zzg = new zzbpq();
    public static final zzbqh zzh = new zzbpr();
    public static final zzbqh zzi = zzbqd.zza;
    public static final zzbqh zzj = new zzbps();
    public static final zzbqh zzk = new zzbpt();
    public static final zzbqh zzl = new zzcjg();
    public static final zzbqh zzm = new zzcjh();
    public static final zzbqh zzn = new zzbpa();
    public static final zzbqz zzo = new zzbqz();
    public static final zzbqh zzp = new zzbpu();
    public static final zzbqh zzq = new zzbpv();
    public static final zzbqh zzr = new zzbpb();
    public static final zzbqh zzs = new zzbpc();
    public static final zzbqh zzt = new zzbpd();
    public static final zzbqh zzu = new zzbpe();
    public static final zzbqh zzv = new zzbpf();
    public static final zzbqh zzw = new zzbpg();
    public static final zzbqh zzx = new zzbph();
    public static final zzbqh zzy = new zzbpi();
    public static final zzbqh zzz = new zzbpj();
    public static final zzbqh zzA = new zzbpk();
    public static final zzbqh zzB = new zzbpm();
    public static final zzbqh zzC = new zzbpn();

    public static ListenableFuture zza(zzclm zzclmVar, String str) {
        Uri uriZzd = Uri.parse(str);
        try {
            zzbbd zzbbdVarZzS = zzclmVar.zzS();
            zzfma zzfmaVarZzT = zzclmVar.zzT();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznH)).booleanValue() || zzfmaVarZzT == null) {
                if (zzbbdVarZzS != null && zzbbdVarZzS.zza(uriZzd)) {
                    uriZzd = zzbbdVarZzS.zzd(uriZzd, zzclmVar.getContext(), zzclmVar.zzE(), zzclmVar.zzj());
                }
            } else if (zzbbdVarZzS != null && zzbbdVarZzS.zza(uriZzd)) {
                uriZzd = zzfmaVarZzT.zza(uriZzd, zzclmVar.getContext(), zzclmVar.zzE(), zzclmVar.zzj());
            }
        } catch (zzbbe unused) {
            String strConcat = "Unable to append parameter to URL: ".concat(str);
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        }
        Map map = new HashMap();
        if (zzclmVar.zzC() != null) {
            map = zzclmVar.zzC().zzaw;
        }
        final String strZzb = zzcet.zzb(uriZzd, zzclmVar.getContext(), map);
        long jLongValue = ((Long) zzblg.zze.zze()).longValue();
        if (jLongValue <= 0 || jLongValue > 262180000) {
            return zzhcy.zza(strZzb);
        }
        zzhcq zzhcqVarZzw = zzhcq.zzw(zzclmVar.zzaF());
        zzbpy zzbpyVar = zzbpy.zza;
        zzhdi zzhdiVar = zzcgj.zzh;
        return (zzhcq) zzhcy.zzg((zzhcq) zzhcy.zzk((zzhcq) zzhcy.zzg(zzhcqVarZzw, Throwable.class, zzbpyVar, zzhdiVar), new zzgub() { // from class: com.google.android.gms.internal.ads.zzbpz
            /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
            @Override // com.google.android.gms.internal.ads.zzgub
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.String r6 = (java.lang.String) r6
                    com.google.android.gms.internal.ads.zzbqh r0 = com.google.android.gms.internal.ads.zzbqg.zza
                    java.lang.String r0 = r1
                    if (r6 != 0) goto L9
                    goto L74
                L9:
                    com.google.android.gms.internal.ads.zzbkq r1 = com.google.android.gms.internal.ads.zzblg.zzf
                    java.lang.Object r1 = r1.zze()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L18
                    goto L39
                L18:
                    java.lang.String r1 = ".googleadservices.com"
                    java.lang.String r2 = ".googlesyndication.com"
                    java.lang.String r3 = ".doubleclick.net"
                    java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
                    android.net.Uri r2 = android.net.Uri.parse(r0)
                    java.lang.String r2 = r2.getHost()
                    r3 = 0
                L2b:
                    r4 = 3
                    if (r3 >= r4) goto L74
                    r4 = r1[r3]
                    boolean r4 = r2.endsWith(r4)
                    if (r4 != 0) goto L39
                    int r3 = r3 + 1
                    goto L2b
                L39:
                    com.google.android.gms.internal.ads.zzbkq r1 = com.google.android.gms.internal.ads.zzblg.zza
                    java.lang.Object r1 = r1.zze()
                    java.lang.String r1 = (java.lang.String) r1
                    com.google.android.gms.internal.ads.zzbkq r2 = com.google.android.gms.internal.ads.zzblg.zzb
                    java.lang.Object r2 = r2.zze()
                    java.lang.String r2 = (java.lang.String) r2
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L53
                    java.lang.String r0 = r0.replace(r1, r6)
                L53:
                    boolean r1 = android.text.TextUtils.isEmpty(r2)
                    if (r1 != 0) goto L74
                    android.net.Uri r1 = android.net.Uri.parse(r0)
                    java.lang.String r3 = r1.getQueryParameter(r2)
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto L74
                    android.net.Uri$Builder r0 = r1.buildUpon()
                    android.net.Uri$Builder r6 = r0.appendQueryParameter(r2, r6)
                    java.lang.String r6 = r6.toString()
                    return r6
                L74:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbpz.apply(java.lang.Object):java.lang.Object");
            }
        }, zzhdiVar), Throwable.class, new zzgub() { // from class: com.google.android.gms.internal.ads.zzbqa
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbqh zzbqhVar = zzbqg.zza;
                if (((Boolean) zzblg.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "prepareClickUrl.attestation2");
                }
                return strZzb;
            }
        }, zzhdiVar);
    }

    public static zzbqh zzb(final zzdlw zzdlwVar, final zzcub zzcubVar) {
        return new zzbqh() { // from class: com.google.android.gms.internal.ads.zzbqb
            @Override // com.google.android.gms.internal.ads.zzbqh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzclm zzclmVar = (zzclm) obj;
                zzbqg.zzc(map, zzdlwVar);
                final String str = (String) map.get("u");
                if (str == null) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                    return;
                }
                final zzcub zzcubVar2 = zzcubVar;
                zzhcq zzhcqVarZzw = zzhcq.zzw(zzbqg.zza(zzclmVar, str));
                zzhcg zzhcgVar = new zzhcg() { // from class: com.google.android.gms.internal.ads.zzbqe
                    @Override // com.google.android.gms.internal.ads.zzhcg
                    public final /* synthetic */ ListenableFuture zza(Object obj2) {
                        zzcub zzcubVar3;
                        String str2 = (String) obj2;
                        zzbqh zzbqhVar = zzbqg.zza;
                        return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlH)).booleanValue() && (zzcubVar3 = zzcubVar2) != null && zzcub.zzc(str)) ? zzcubVar3.zzb(str2, com.google.android.gms.ads.internal.client.zzay.zzh()) : zzhcy.zza(str2);
                    }
                };
                zzhdi zzhdiVar = zzcgj.zza;
                zzhcy.zzr((zzhcq) zzhcy.zzj(zzhcqVarZzw, zzhcgVar, zzhdiVar), new zzbpl(zzclmVar), zzhdiVar);
            }
        };
    }

    public static void zzc(Map map, zzdlw zzdlwVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmr)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdlwVar != null) {
            zzdlwVar.zzdu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zze(com.google.android.gms.internal.ads.zzcmy r16, java.util.Map r17) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqg.zze(com.google.android.gms.internal.ads.zzcmy, java.util.Map):void");
    }
}
