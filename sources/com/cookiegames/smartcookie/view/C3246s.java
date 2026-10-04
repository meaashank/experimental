package com.cookiegames.smartcookie.view;

import android.os.Message;
import android.webkit.WebView;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.view.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C3246s implements r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f148521b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Message f148522a;

    public C3246s(@NotNull Message resultMessage) {
        kotlin.jvm.internal.G.p(resultMessage, "resultMessage");
        this.f148522a = resultMessage;
    }

    @Override // com.cookiegames.smartcookie.view.r0
    public void a(@NotNull WebView webView, @NotNull Map<String, String> headers) {
        kotlin.jvm.internal.G.p(webView, "webView");
        kotlin.jvm.internal.G.p(headers, "headers");
        Message message = this.f148522a;
        Object obj = message.obj;
        kotlin.jvm.internal.G.n(obj, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
        ((WebView.WebViewTransport) obj).setWebView(webView);
        message.sendToTarget();
    }
}
