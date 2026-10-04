package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzclm;
import e.f0;

/* JADX INFO: loaded from: classes3.dex */
@f0
public final class zzj {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzj(zzclm zzclmVar) throws zzh {
        this.zzb = zzclmVar.getLayoutParams();
        ViewParent parent = zzclmVar.getParent();
        this.zzd = zzclmVar.zzK();
        if (!(parent instanceof ViewGroup)) {
            throw new zzh("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(zzclmVar.zzE());
        viewGroup.removeView(zzclmVar.zzE());
        zzclmVar.zzag(true);
    }
}
