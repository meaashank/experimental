package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes4.dex */
public interface zzcif extends zzcne, zzcnh, zzbte {
    Context getContext();

    void setBackgroundColor(int i10);

    void zzA(int i10);

    void zzB(int i10);

    @Nullable
    zzchu zzdm();

    void zzdn(boolean z10);

    @Nullable
    zzcms zzh();

    @Nullable
    zzbjs zzi();

    @Nullable
    Activity zzj();

    @Nullable
    com.google.android.gms.ads.internal.zza zzk();

    void zzl();

    String zzm();

    @Nullable
    String zzn();

    void zzo(int i10);

    int zzp();

    zzbjt zzq();

    @Nullable
    zzcjs zzr(String str);

    VersionInfoParcel zzs();

    void zzt(String str, zzcjs zzcjsVar);

    void zzu(boolean z10, long j10);

    void zzv(int i10);

    void zzw(zzcms zzcmsVar);

    int zzx();

    int zzy();

    void zzz();
}
