package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdrm extends zzbmy implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdso {
    public static final zzgxm zza = zzgxm.zzl("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzhdi zzf;
    private View zzg;
    private zzdqm zzi;
    private zzbfi zzj;
    private zzbms zzl;
    private boolean zzm;
    private GestureDetector zzo;
    private Map zzc = new HashMap();
    private IObjectWrapper zzk = null;
    private boolean zzn = false;
    private final int zzh = ModuleDescriptor.MODULE_VERSION;

    public zzdrm(FrameLayout frameLayout, FrameLayout frameLayout2, int i10) {
        String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcgw.zza(frameLayout, this);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcgw.zzb(frameLayout, this);
        this.zzf = zzcgj.zzf;
        this.zzj = new zzbfi(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzr() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznj)).booleanValue() || this.zzi.zzG() == 0) {
            return;
        }
        this.zzo = new GestureDetector(this.zzd.getContext(), new zzdru(this.zzi, this));
    }

    private final synchronized void zzs() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzq();
            }
        });
    }

    private final synchronized void zzt(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.zze.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.zze.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e10) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Encountered invalid base64 watermark.", e10);
                    }
                }
            }
            this.zze.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdqm zzdqmVar = this.zzi;
        if (zzdqmVar == null || !zzdqmVar.zzH()) {
            return;
        }
        this.zzi.zzz();
        this.zzi.zzi(view, this.zzd, zzh(), zzi(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdqm zzdqmVar = this.zzi;
        if (zzdqmVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdqmVar.zzu(frameLayout, zzh(), zzi(), zzdqm.zzI(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdqm zzdqmVar = this.zzi;
        if (zzdqmVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdqmVar.zzu(frameLayout, zzh(), zzi(), zzdqm.zzI(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdqm zzdqmVar = this.zzi;
        if (zzdqmVar != null) {
            zzdqmVar.zzk(view, motionEvent, this.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznj)).booleanValue() && this.zzo != null && this.zzi.zzG() != 0) {
                this.zzo.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized void zza(String str, IObjectWrapper iObjectWrapper) {
        zzg(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized IObjectWrapper zzb(String str) {
        return ObjectWrapper.wrap(zzk(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized void zzc(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof zzdqm)) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdqm zzdqmVar = this.zzi;
        if (zzdqmVar != null) {
            zzdqmVar.zzh(this);
        }
        zzs();
        zzdqm zzdqmVar2 = (zzdqm) objUnwrap;
        this.zzi = zzdqmVar2;
        zzdqmVar2.zzg(this);
        this.zzi.zzN(this.zzd);
        this.zzi.zzO(this.zze);
        if (this.zzm) {
            this.zzi.zzP().zzb(this.zzl);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeV)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzK())) {
            zzt(this.zzi.zzK());
        }
        zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized void zzd() {
        try {
            if (this.zzn) {
                return;
            }
            zzdqm zzdqmVar = this.zzi;
            if (zzdqmVar != null) {
                zzdqmVar.zzh(this);
                this.zzi = null;
            }
            this.zzc.clear();
            this.zzd.removeAllViews();
            this.zze.removeAllViews();
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzg = null;
            this.zzj = null;
            this.zzn = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final FrameLayout zzdA() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized void zzdB(IObjectWrapper iObjectWrapper) {
        this.zzi.zzx((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized void zzdC(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        this.zzk = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzdD(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzd, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized void zzdE(zzbms zzbmsVar) {
        if (!this.zzn) {
            this.zzm = true;
            this.zzl = zzbmsVar;
            zzdqm zzdqmVar = this.zzi;
            if (zzdqmVar != null) {
                zzdqmVar.zzP().zzb(zzbmsVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final /* synthetic */ View zzdF() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized void zze(IObjectWrapper iObjectWrapper, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final zzbfi zzf() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized void zzg(String str, View view, boolean z10) {
        if (!this.zzn) {
            if (view == null) {
                this.zzc.remove(str);
                return;
            }
            this.zzc.put(str, new WeakReference(view));
            if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                if (com.google.android.gms.ads.internal.util.zzbs.zza(this.zzh)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized Map zzh() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized Map zzi() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    @Nullable
    public final synchronized Map zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    @Nullable
    public final synchronized View zzk(String str) {
        WeakReference weakReference;
        if (!this.zzn && (weakReference = (WeakReference) this.zzc.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized String zzl() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    @Nullable
    public final IObjectWrapper zzm() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    @Nullable
    public final synchronized JSONObject zzn() {
        zzdqm zzdqmVar = this.zzi;
        if (zzdqmVar == null) {
            return null;
        }
        return zzdqmVar.zzv(this.zzd, zzh(), zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    @Nullable
    public final synchronized JSONObject zzo() {
        zzdqm zzdqmVar = this.zzi;
        if (zzdqmVar == null) {
            return null;
        }
        return zzdqmVar.zzw(this.zzd, zzh(), zzi());
    }

    public final FrameLayout zzp() {
        return this.zzd;
    }

    public final /* synthetic */ void zzq() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
