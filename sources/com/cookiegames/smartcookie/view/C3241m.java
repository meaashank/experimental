package com.cookiegames.smartcookie.view;

import android.webkit.WebView;
import bc.InterfaceC2859i;
import java.util.Map;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.view.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
@InterfaceC2859i
public final class C3241m implements r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f148480d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final u4.e f148481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final n0 f148482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C3230b f148483c;

    @Inject
    public C3241m(@NotNull u4.e userPreferences, @NotNull n0 startIncognitoPageInitializer, @NotNull C3230b bookmarkPageInitializer) {
        kotlin.jvm.internal.G.p(userPreferences, "userPreferences");
        kotlin.jvm.internal.G.p(startIncognitoPageInitializer, "startIncognitoPageInitializer");
        kotlin.jvm.internal.G.p(bookmarkPageInitializer, "bookmarkPageInitializer");
        this.f148481a = userPreferences;
        this.f148482b = startIncognitoPageInitializer;
        this.f148483c = bookmarkPageInitializer;
    }

    @Override // com.cookiegames.smartcookie.view.r0
    public void a(@NotNull WebView webView, @NotNull Map<String, String> headers) {
        kotlin.jvm.internal.G.p(webView, "webView");
        kotlin.jvm.internal.G.p(headers, "headers");
        String strE = this.f148481a.E();
        (kotlin.jvm.internal.G.g(strE, R3.a.f67730h) ? this.f148482b : kotlin.jvm.internal.G.g(strE, R3.a.f67733k) ? this.f148483c : new s0(strE)).a(webView, headers);
    }
}
