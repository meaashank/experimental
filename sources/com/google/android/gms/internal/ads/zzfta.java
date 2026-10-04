package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfta {
    private final zzeqb zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzflp zzf;
    private final zzflq zzg;
    private final Clock zzh;
    private final zzbbd zzi;

    @e.f0
    public zzfta(zzeqb zzeqbVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, @Nullable zzflp zzflpVar, @Nullable zzflq zzflqVar, Clock clock, zzbbd zzbbdVar) {
        this.zza = zzeqbVar;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzflpVar;
        this.zzg = zzflqVar;
        this.zzh = clock;
        this.zzi = zzbbdVar;
    }

    public static String zzd(String str, String str2, @Nullable String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static String zzg(@Nullable String str) {
        return TextUtils.isEmpty(str) ? "" : com.google.android.gms.ads.internal.util.client.zzl.zzj() ? "fakeForAdDebugLog" : str;
    }

    public final List zza(zzflo zzfloVar, @Nullable zzfld zzfldVar, List list) {
        return zzb(zzfloVar, zzfldVar, false, "", "", list, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzflo r17, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzfld r18, boolean r19, @androidx.annotation.Nullable java.lang.String r20, @androidx.annotation.Nullable java.lang.String r21, java.util.List r22, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzdck r23, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzcfw r24) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfta.zzb(com.google.android.gms.internal.ads.zzflo, com.google.android.gms.internal.ads.zzfld, boolean, java.lang.String, java.lang.String, java.util.List, com.google.android.gms.internal.ads.zzdck, com.google.android.gms.internal.ads.zzcfw):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[LOOP:0: B:13:0x005a->B:15:0x0060, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzc(com.google.android.gms.internal.ads.zzfld r11, java.util.List r12, com.google.android.gms.internal.ads.zzcch r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.util.Clock r1 = r10.zzh
            long r1 = r1.currentTimeMillis()
            java.lang.String r3 = r13.zza()     // Catch: android.os.RemoteException -> Lab
            int r13 = r13.zzb()     // Catch: android.os.RemoteException -> Lab
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch: android.os.RemoteException -> Lab
            com.google.android.gms.internal.ads.zzbix r4 = com.google.android.gms.internal.ads.zzbjg.zzeC
            com.google.android.gms.internal.ads.zzbje r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.zzd(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L39
            com.google.android.gms.internal.ads.zzflq r4 = r10.zzg
            if (r4 != 0) goto L32
            com.google.android.gms.internal.ads.zzgui r4 = com.google.android.gms.internal.ads.zzgui.zzc()
            goto L3c
        L32:
            com.google.android.gms.internal.ads.zzflp r4 = r4.zza
        L34:
            com.google.android.gms.internal.ads.zzgui r4 = com.google.android.gms.internal.ads.zzgui.zzd(r4)
            goto L3c
        L39:
            com.google.android.gms.internal.ads.zzflp r4 = r10.zzf
            goto L34
        L3c:
            com.google.android.gms.internal.ads.zzfsz r5 = com.google.android.gms.internal.ads.zzfsz.zza
            com.google.android.gms.internal.ads.zzgui r5 = r4.zzb(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.zza(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzfsy r7 = com.google.android.gms.internal.ads.zzfsy.zza
            com.google.android.gms.internal.ads.zzgui r4 = r4.zzb(r7)
            java.lang.Object r4 = r4.zza(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r12 = r12.iterator()
        L5a:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto Laa
            java.lang.Object r6 = r12.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = zzd(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = zzd(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = zzd(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = zzd(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = zzd(r6, r7, r13)
            java.lang.String r7 = r10.zzb
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = zzd(r6, r8, r7)
            android.content.Context r7 = r10.zze
            boolean r8 = r11.zzW
            java.util.Map r9 = r11.zzaw
            java.lang.String r6 = com.google.android.gms.internal.ads.zzcet.zza(r6, r7, r8, r9)
            r0.add(r6)
            goto L5a
        Laa:
            return r0
        Lab:
            r11 = move-exception
            int r12 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r12 = "Unable to determine award type and amount."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r12, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfta.zzc(com.google.android.gms.internal.ads.zzfld, java.util.List, com.google.android.gms.internal.ads.zzcch):java.util.List");
    }
}
