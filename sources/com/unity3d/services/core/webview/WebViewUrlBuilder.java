package com.unity3d.services.core.webview;

import androidx.compose.runtime.changelist.a;
import androidx.compose.runtime.changelist.j;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes7.dex */
public class WebViewUrlBuilder {
    private final String _urlWithQueryString;

    public WebViewUrlBuilder(String str, Configuration configuration) {
        StringBuilder sbA = a.a("?platform=android" + buildQueryParam("origin", configuration.getWebViewUrl()));
        sbA.append(buildQueryParam("version", configuration.getWebViewVersion()));
        StringBuilder sbA2 = a.a(sbA.toString());
        sbA2.append(buildQueryParam("isNativeCollectingMetrics", String.valueOf(SDKMetrics.getInstance().areMetricsEnabledForCurrentSession())));
        this._urlWithQueryString = j.a(str, sbA2.toString());
    }

    private String buildQueryParam(String str, String str2) {
        if (str2 != null) {
            try {
                return "&" + str + "=" + URLEncoder.encode(str2, "UTF-8");
            } catch (UnsupportedEncodingException e10) {
                DeviceLog.exception(String.format("Unsupported charset when encoding %s", str), e10);
            }
        }
        return "";
    }

    public String getUrlWithQueryString() {
        return this._urlWithQueryString;
    }
}
