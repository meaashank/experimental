package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.Class(creator = "PoolConfigurationCreator")
public final class zzfns extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfns> CREATOR = new zzfnt();

    @Nullable
    public final Context zza;
    public final zzfnp zzb;

    @SafeParcelable.Field(id = 2)
    public final int zzc;

    @SafeParcelable.Field(id = 3)
    public final int zzd;

    @SafeParcelable.Field(id = 4)
    public final int zze;

    @SafeParcelable.Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfnp[] zzh;

    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzi;

    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;

    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzfns(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 4) int i13, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i14, @SafeParcelable.Param(id = 7) int i15) {
        zzfnp[] zzfnpVarArrValues = zzfnp.values();
        this.zzh = zzfnpVarArrValues;
        int[] iArrZza = zzfnq.zza();
        this.zzl = iArrZza;
        int[] iArrZza2 = zzfnr.zza();
        this.zzm = iArrZza2;
        this.zza = null;
        this.zzi = i10;
        this.zzb = zzfnpVarArrValues[i10];
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = str;
        this.zzj = i14;
        this.zzg = iArrZza[i14];
        this.zzk = i15;
        int i16 = iArrZza2[i15];
    }

    @Nullable
    public static zzfns zza(zzfnp zzfnpVar, Context context) {
        if (zzfnpVar == zzfnp.Rewarded) {
            return new zzfns(context, zzfnpVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhu)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhA)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhC)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhE), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhw), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhy));
        }
        if (zzfnpVar == zzfnp.Interstitial) {
            return new zzfns(context, zzfnpVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhv)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhB)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhD)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhF), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhx), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhz));
        }
        if (zzfnpVar != zzfnp.AppOpen) {
            return null;
        }
        return new zzfns(context, zzfnpVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhI)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhK)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhL)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhG), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhH), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhJ));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zzi;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzfns(@Nullable Context context, zzfnp zzfnpVar, int i10, int i11, int i12, String str, String str2, String str3) {
        this.zzh = zzfnp.values();
        this.zzl = zzfnq.zza();
        this.zzm = zzfnr.zza();
        this.zza = context;
        this.zzi = zzfnpVar.ordinal();
        this.zzb = zzfnpVar;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = str;
        int i13 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.zzg = i13;
        this.zzj = i13 - 1;
        this.zzk = 0;
    }
}
