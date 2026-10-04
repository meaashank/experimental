package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzgex implements zzgia {
    private final zzgeo zza;
    private final zzgeu zzb;
    private Context zzc;
    private View zzd;
    private Activity zze;
    private String zzf;
    private Map zzg;
    private zzaya zzh;
    private zzgff zzi;

    public /* synthetic */ zzgex(zzgeo zzgeoVar, zzgeu zzgeuVar, byte[] bArr) {
        this.zza = zzgeoVar;
        this.zzb = zzgeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final zzgib zza() {
        zzioe.zzc(this.zzc, Context.class);
        zzioe.zzc(this.zzg, Map.class);
        zzioe.zzc(this.zzh, zzaya.class);
        zzioe.zzc(this.zzi, zzgff.class);
        return new zzgey(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final /* bridge */ /* synthetic */ zzgia zzb(zzgff zzgffVar) {
        zzgffVar.getClass();
        this.zzi = zzgffVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final /* bridge */ /* synthetic */ zzgia zzc(zzaya zzayaVar) {
        zzayaVar.getClass();
        this.zzh = zzayaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final /* bridge */ /* synthetic */ zzgia zzd(Map map) {
        this.zzg = map;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final /* synthetic */ zzgia zze(String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final /* synthetic */ zzgia zzf(Activity activity) {
        this.zze = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final /* synthetic */ zzgia zzg(View view) {
        this.zzd = view;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final /* bridge */ /* synthetic */ zzgia zzh(Context context) {
        context.getClass();
        this.zzc = context;
        return this;
    }
}
