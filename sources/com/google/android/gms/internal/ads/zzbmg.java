package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbmg extends zzbmu {
    private final Drawable zza;
    private final Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;

    @Nullable
    private final Map zzf;

    public zzbmg(Drawable drawable, Uri uri, double d10, int i10, int i11, @Nullable Map map) {
        this.zza = drawable;
        this.zzb = uri;
        this.zzc = d10;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final IObjectWrapper zza() throws RemoteException {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final Uri zzb() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final double zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final int zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    @Nullable
    public final Map zzf() {
        return this.zzf;
    }
}
