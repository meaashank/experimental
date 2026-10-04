package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzfmy;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzo extends WebViewClient {
    final /* synthetic */ zzs zza;

    public zzo(zzs zzsVar) {
        Objects.requireNonNull(zzsVar);
        this.zza = zzsVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzs zzsVar = this.zza;
        if (zzsVar.zzW() != null) {
            try {
                zzsVar.zzW().zzc(zzfmy.zzd(1, null, null));
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
        zzs zzsVar2 = this.zza;
        if (zzsVar2.zzW() != null) {
            try {
                zzsVar2.zzW().zzb(0);
            } catch (RemoteException e11) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e11);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzs zzsVar = this.zza;
        if (str.startsWith(zzsVar.zzN())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (zzsVar.zzW() != null) {
                try {
                    zzsVar.zzW().zzc(zzfmy.zzd(3, null, null));
                } catch (RemoteException e10) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                }
            }
            zzs zzsVar2 = this.zza;
            if (zzsVar2.zzW() != null) {
                try {
                    zzsVar2.zzW().zzb(3);
                } catch (RemoteException e11) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e11);
                }
            }
            this.zza.zzL(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzs zzsVar3 = this.zza;
            if (zzsVar3.zzW() != null) {
                try {
                    zzsVar3.zzW().zzc(zzfmy.zzd(1, null, null));
                } catch (RemoteException e12) {
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e12);
                }
            }
            zzs zzsVar4 = this.zza;
            if (zzsVar4.zzW() != null) {
                try {
                    zzsVar4.zzW().zzb(0);
                } catch (RemoteException e13) {
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e13);
                }
            }
            this.zza.zzL(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            zzs zzsVar5 = this.zza;
            if (zzsVar5.zzW() != null) {
                try {
                    zzsVar5.zzW().zze();
                } catch (RemoteException e14) {
                    int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e14);
                }
            }
            zzs zzsVar6 = this.zza;
            zzsVar6.zzL(zzsVar6.zzK(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        zzs zzsVar7 = this.zza;
        if (zzsVar7.zzW() != null) {
            try {
                zzsVar7.zzW().zzg();
                zzsVar7.zzW().zzd();
            } catch (RemoteException e15) {
                int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e15);
            }
        }
        this.zza.zzU(str);
        return true;
    }
}
