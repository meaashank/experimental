package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdcg {
    private IHsdpDeepLinkServiceWrapper zza;

    private final synchronized IHsdpDeepLinkServiceWrapper zzd(Context context) throws Exception {
        IHsdpDeepLinkServiceWrapper iHsdpDeepLinkServiceWrapper = this.zza;
        if (iHsdpDeepLinkServiceWrapper != null) {
            return iHsdpDeepLinkServiceWrapper;
        }
        IHsdpDeepLinkServiceWrapper iHsdpDeepLinkServiceWrapperAsInterface = IHsdpDeepLinkServiceWrapper.Stub.asInterface((IBinder) context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.ads.internal.client.hsdp.HsdpDeepLinkServiceWrapper").getConstructor(null).newInstance(null));
        this.zza = iHsdpDeepLinkServiceWrapperAsInterface;
        return iHsdpDeepLinkServiceWrapperAsInterface;
    }

    public final void zza(Context context, List list, IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback) throws Exception {
        IHsdpDeepLinkServiceWrapper iHsdpDeepLinkServiceWrapperZzd = zzd(context);
        if (iHsdpDeepLinkServiceWrapperZzd != null) {
            iHsdpDeepLinkServiceWrapperZzd.prewarm(ObjectWrapper.wrap(context), list, iHsdpPrewarmServiceCallback);
        }
    }

    public final void zzb(Context context, String str) throws Exception {
        IHsdpDeepLinkServiceWrapper iHsdpDeepLinkServiceWrapperZzd = zzd(context);
        if (iHsdpDeepLinkServiceWrapperZzd != null) {
            iHsdpDeepLinkServiceWrapperZzd.endSession(ObjectWrapper.wrap(context), str);
        }
    }

    public final void zzc(Context context, String str, String str2, Bundle bundle, boolean z10, IHsdpServiceCallback iHsdpServiceCallback) throws Exception {
        IHsdpDeepLinkServiceWrapper iHsdpDeepLinkServiceWrapperZzd = zzd(context);
        if (iHsdpDeepLinkServiceWrapperZzd != null) {
            iHsdpDeepLinkServiceWrapperZzd.open(ObjectWrapper.wrap(context), str, str2, bundle, z10, iHsdpServiceCallback);
        }
    }
}
