package com.cookiegames.smartcookie.view;

import android.webkit.WebView;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class s0 implements r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f148523b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f148524a;

    public s0(@NotNull String url) {
        kotlin.jvm.internal.G.p(url, "url");
        this.f148524a = url;
    }

    @Override // com.cookiegames.smartcookie.view.r0
    public void a(@NotNull WebView webView, @NotNull Map<String, String> headers) {
        kotlin.jvm.internal.G.p(webView, "webView");
        kotlin.jvm.internal.G.p(headers, "headers");
        webView.loadUrl(this.f148524a, headers);
    }
}
