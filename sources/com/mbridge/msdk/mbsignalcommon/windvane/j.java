package com.mbridge.msdk.mbsignalcommon.windvane;

import C4.q;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes5.dex */
public class j extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WindVaneWebView f157650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f157651b;

    public j(WindVaneWebView windVaneWebView) {
        this.f157650a = windVaneWebView;
    }

    public void a(c cVar) {
        this.f157651b = cVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        b signalCommunication = this.f157650a.getSignalCommunication();
        if (signalCommunication != null) {
            String strMessage = consoleMessage.message();
            if (TextUtils.isEmpty(strMessage) || !strMessage.startsWith("mv://")) {
                return false;
            }
            q0.a("H5_ENTRY", "onConsoleMessage: message.length() = " + strMessage.length() + q.f17581a + strMessage);
            if (strMessage.contains("wv_hybrid:") && signalCommunication.b("wv_hybrid:")) {
                String strSubstring = strMessage.substring(0, strMessage.lastIndexOf(q.f17581a) + 1);
                q0.a("H5_ENTRY", "message = " + strSubstring);
                signalCommunication.a(strSubstring);
                return true;
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        q0.b("H5_ENTRY", str2 + "");
        b signalCommunication = this.f157650a.getSignalCommunication();
        if (signalCommunication == null || str3 == null || !signalCommunication.b(str3)) {
            return false;
        }
        signalCommunication.a(str2);
        jsPromptResult.confirm("");
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        c cVar = this.f157651b;
        if (cVar != null) {
            cVar.onProgressChanged(webView, i10);
        }
    }
}
