package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.m;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;

/* JADX INFO: loaded from: classes7.dex */
public class WebViewErrorHandler implements d<m> {
    @Override // com.unity3d.scar.adapter.common.d
    public void handleError(m mVar) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.valueOf(mVar.getDomain()), mVar.getErrorCategory(), mVar.getErrorArguments());
    }
}
