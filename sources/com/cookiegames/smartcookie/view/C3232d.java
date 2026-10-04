package com.cookiegames.smartcookie.view;

import android.os.Bundle;
import android.webkit.WebView;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.view.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C3232d implements r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f148443b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Bundle f148444a;

    public C3232d(@NotNull Bundle bundle) {
        kotlin.jvm.internal.G.p(bundle, "bundle");
        this.f148444a = bundle;
    }

    @Override // com.cookiegames.smartcookie.view.r0
    public void a(@NotNull WebView webView, @NotNull Map<String, String> headers) {
        kotlin.jvm.internal.G.p(webView, "webView");
        kotlin.jvm.internal.G.p(headers, "headers");
        webView.restoreState(this.f148444a);
    }
}
