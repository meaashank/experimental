package com.prism.fads.unityads;

import S6.a;
import android.app.Activity;
import android.content.Context;
import com.prism.fusionadsdkbase.f;
import com.prism.fusionadsdkbase.h;
import com.unity3d.ads.metadata.MetaData;

/* JADX INFO: loaded from: classes2.dex */
@a(interstitials = {}, name = "unityads")
public class UnityAdsInitializer implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162228a = "765-UnityAdsInitializer";

    public final void a(Context context) {
        MetaData metaData = new MetaData(context);
        metaData.set("privacy.consent", Boolean.TRUE);
        metaData.commit();
    }

    public final void b(Context context) {
        MetaData metaData = new MetaData(context);
        metaData.set("gdpr.consent", Boolean.TRUE);
        metaData.commit();
    }

    @Override // com.prism.fusionadsdkbase.f
    public void gatherConsent(Activity activity, h hVar) {
    }

    @Override // com.prism.fusionadsdkbase.f
    public void init(Context context, String str) {
        b(context);
        a(context);
    }

    @Override // com.prism.fusionadsdkbase.f
    public void requestPermissionIfNecessary(Activity activity) {
    }
}
