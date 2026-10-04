package com.google.android.gms.ads.internal.client.hsdp;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;
import com.google.android.play.core.hsdp.service.HsdpPrewarmRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class HsdpDeepLinkServiceWrapper extends IHsdpDeepLinkServiceWrapper.Stub {
    private zzcas zza;
    private zzcas zzb;

    @Nullable
    private HsdpDeepLinkService zzc;

    private final void zza(@Nullable Context context, Throwable th, String str) {
        if (context == null) {
            zzo.zzg("Context is null, unable to report exception for method: ".concat(str), th);
            return;
        }
        if (((Boolean) zzba.zzc().zzd(zzbjg.zzoF)).booleanValue()) {
            if (this.zzb == null) {
                this.zzb = zzcaq.zzc(context);
            }
            this.zzb.zzh(th, "HsdpDeepLinkServiceWrapperUnsampled.".concat(str));
        } else {
            if (this.zza == null) {
                this.zza = zzcaq.zza(context);
            }
            this.zza.zzh(th, "HsdpDeepLinkServiceWrapper.".concat(str));
        }
    }

    private final HsdpDeepLinkService zzb(Context context) {
        if (this.zzc == null) {
            this.zzc = HsdpDeepLinkServiceFactory.create(context);
        }
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
    public void endSession(@NonNull IObjectWrapper iObjectWrapper, @Nullable String str) {
        Throwable th;
        Context context;
        try {
            context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            if (context != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    zzb(context).endSession(str);
                } catch (Throwable th2) {
                    th = th2;
                    zza(context, th, "endSession");
                }
            }
        } catch (Throwable th3) {
            th = th3;
            context = null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
    public void open(@NonNull IObjectWrapper iObjectWrapper, @Nullable String str, @Nullable String str2, @Nullable Bundle bundle, boolean z10, @Nullable IHsdpServiceCallback iHsdpServiceCallback) {
        Throwable th;
        Context context;
        try {
            context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            if (context != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    HsdpDeepLinkService hsdpDeepLinkServiceZzb = zzb(context);
                    Map<String, String> mapZzb = zzp.zzb(bundle);
                    if (str2 == null) {
                        str2 = "";
                    }
                    hsdpDeepLinkServiceZzb.open(str, str2, new zzb(this, iHsdpServiceCallback), mapZzb, z10);
                } catch (Throwable th2) {
                    th = th2;
                    zza(context, th, "open");
                }
            }
        } catch (Throwable th3) {
            th = th3;
            context = null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
    public void prewarm(@NonNull IObjectWrapper iObjectWrapper, @NonNull List<Bundle> list, @Nullable IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback) {
        Throwable th;
        Context context;
        try {
            context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            if (context == null) {
                return;
            }
            try {
                HsdpDeepLinkService hsdpDeepLinkServiceZzb = zzb(context);
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (Bundle bundle : list) {
                        String string = bundle.getString("targetPackage");
                        if (!TextUtils.isEmpty(string)) {
                            IBinder binder = bundle.getBinder("window_token");
                            String string2 = bundle.getString("referrer");
                            HsdpPrewarmRequest.Builder extraQueryParams = HsdpPrewarmRequest.builder().setTargetAppPackageName(string).setExtraQueryParams(zzp.zzb(bundle.getBundle("extra_query_params")));
                            if (string2 != null) {
                                extraQueryParams.setReferrer(string2);
                            }
                            if (binder != null) {
                                extraQueryParams.setWindowToken(binder);
                            }
                            arrayList.add(extraQueryParams.build());
                        }
                    }
                }
                hsdpDeepLinkServiceZzb.prewarm(arrayList, new zza(this, iHsdpPrewarmServiceCallback));
            } catch (Throwable th2) {
                th = th2;
                zza(context, th, "prewarm");
            }
        } catch (Throwable th3) {
            th = th3;
            context = null;
        }
    }
}
