package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public interface zzclm extends com.google.android.gms.ads.internal.client.zza, zzdlw, zzcld, zzbte, zzcmt, zzcmy, zzbtq, zzbfg, zzcnc, com.google.android.gms.ads.internal.zzn, zzcnf, zzcng, zzcif, zzcnh {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcmy, com.google.android.gms.internal.ads.zzcif
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i10, int i11);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcif
    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcld
    zzfld zzC();

    WebView zzD();

    @Override // com.google.android.gms.internal.ads.zzcnh
    View zzE();

    List zzF();

    void zzG();

    void zzH(int i10);

    void zzI();

    void zzJ();

    Context zzK();

    com.google.android.gms.ads.internal.overlay.zzm zzL();

    com.google.android.gms.ads.internal.overlay.zzm zzM();

    @Override // com.google.android.gms.internal.ads.zzcne
    zzcnw zzN();

    String zzO();

    zzcnk zzP();

    WebViewClient zzQ();

    boolean zzR();

    @Override // com.google.android.gms.internal.ads.zzcnf
    zzbbd zzS();

    zzfma zzT();

    zzeml zzU();

    zzemj zzV();

    boolean zzW();

    boolean zzX();

    void zzY();

    boolean zzZ();

    boolean zzaA(boolean z10, int i10);

    boolean zzaB();

    @Override // com.google.android.gms.internal.ads.zzcmt
    zzflg zzaC();

    void zzaD(zzfld zzfldVar, zzflg zzflgVar);

    void zzaE(boolean z10, int i10);

    ListenableFuture zzaF();

    void zzaG(boolean z10);

    boolean zzaa();

    void zzab(String str, zzbqh zzbqhVar);

    void zzac(String str, zzbqh zzbqhVar);

    void zzad(String str, Predicate predicate);

    void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzaf(zzcnw zzcnwVar);

    void zzag(boolean z10);

    void zzah();

    void zzai(Context context);

    void zzaj(boolean z10);

    void zzak(zzeml zzemlVar);

    void zzal(zzemj zzemjVar);

    void zzam(int i10);

    void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzao(boolean z10);

    void zzap();

    void zzaq(zzbmi zzbmiVar);

    zzbmi zzar();

    void zzas(boolean z10);

    void zzat();

    void zzau(String str, String str2, String str3);

    void zzav();

    void zzaw(boolean z10);

    void zzax(zzbmf zzbmfVar);

    void zzay(zzbgt zzbgtVar);

    zzbgt zzaz();

    @Override // com.google.android.gms.internal.ads.zzcif
    zzcms zzh();

    @Override // com.google.android.gms.internal.ads.zzcmy, com.google.android.gms.internal.ads.zzcif
    Activity zzj();

    @Override // com.google.android.gms.internal.ads.zzcif
    com.google.android.gms.ads.internal.zza zzk();

    @Override // com.google.android.gms.internal.ads.zzcif
    zzbjt zzq();

    @Override // com.google.android.gms.internal.ads.zzcng, com.google.android.gms.internal.ads.zzcif
    VersionInfoParcel zzs();

    @Override // com.google.android.gms.internal.ads.zzcif
    void zzt(String str, zzcjs zzcjsVar);

    @Override // com.google.android.gms.internal.ads.zzcif
    void zzw(zzcms zzcmsVar);
}
