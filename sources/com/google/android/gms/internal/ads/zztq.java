package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zztq {
    private final zzv zza;
    private final zzv zzb;
    private final int zzc;
    private final int zzd;
    private final zzri zze;
    private final zzck zzf;
    private final zzbf zzg;

    @Nullable
    private final Object zzh;

    private zztq(zzv zzvVar, zzv zzvVar2, int i10, int i11, zzri zzriVar, zzck zzckVar, zzbf zzbfVar, @Nullable Object obj) {
        this.zza = zzvVar;
        this.zzb = zzvVar2;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = zzriVar;
        this.zzf = zzckVar;
        this.zzg = zzbfVar;
        this.zzh = obj;
    }

    public final /* synthetic */ zztq zza(zzri zzriVar) {
        return new zztq(this.zza, this.zzb, this.zzc, this.zzd, zzriVar, this.zzf, this.zzg, this.zzh);
    }

    public final /* synthetic */ long zzb(long j10) {
        return zzfm.zzu(j10, this.zza.zzK);
    }

    public final /* synthetic */ long zzc(long j10) {
        return zzfm.zzu(j10, this.zze.zzb);
    }

    public final /* synthetic */ zzsc zzd() {
        zzri zzriVar = this.zze;
        return new zzsc(zzriVar.zza, zzriVar.zzb, zzriVar.zzc, false, false, zzriVar.zze);
    }

    public final /* synthetic */ boolean zze() {
        return Objects.equals(this.zza.zzp, "audio/raw");
    }

    public final /* synthetic */ zzv zzf() {
        return this.zza;
    }

    public final /* synthetic */ zzv zzg() {
        return this.zzb;
    }

    public final /* synthetic */ int zzh() {
        return this.zzc;
    }

    public final /* synthetic */ int zzi() {
        return this.zzd;
    }

    public final /* synthetic */ zzri zzj() {
        return this.zze;
    }

    public final /* synthetic */ zzck zzk() {
        return this.zzf;
    }

    public final /* synthetic */ zzbf zzl() {
        return this.zzg;
    }

    public final /* synthetic */ Object zzm() {
        return this.zzh;
    }

    public /* synthetic */ zztq(zzv zzvVar, zzv zzvVar2, int i10, int i11, zzri zzriVar, zzck zzckVar, zzbf zzbfVar, Object obj, byte[] bArr) {
        this(zzvVar, zzvVar2, i10, i11, zzriVar, zzckVar, zzbfVar, obj);
    }
}
