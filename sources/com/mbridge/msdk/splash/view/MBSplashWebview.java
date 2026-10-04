package com.mbridge.msdk.splash.view;

import android.content.Context;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

/* JADX INFO: loaded from: classes5.dex */
public class MBSplashWebview extends WindVaneWebView {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f159019r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private AdSession f159020s;

    public MBSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
        try {
            AdSession adSession = this.f159020s;
            if (adSession != null) {
                adSession.finish();
                this.f159020s = null;
                q0.a("OMSDK", "finish adSession");
            }
        } catch (Exception e10) {
            q0.a("OMSDK", e10.getMessage());
        }
    }

    public AdSession getAdSession() {
        return this.f159020s;
    }

    public String getRequestId() {
        return this.f159019r;
    }

    public void setAdSession(AdSession adSession) {
        this.f159020s = adSession;
    }

    public void setRequestId(String str) {
        this.f159019r = str;
    }
}
