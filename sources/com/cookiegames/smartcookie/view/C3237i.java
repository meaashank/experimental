package com.cookiegames.smartcookie.view;

import android.webkit.WebView;
import bc.InterfaceC2859i;
import java.util.Map;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.view.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
@InterfaceC2859i
public final class C3237i implements r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f148461d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final u4.e f148462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final p0 f148463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C3230b f148464c;

    @Inject
    public C3237i(@NotNull u4.e userPreferences, @NotNull p0 startPageInitializer, @NotNull C3230b bookmarkPageInitializer) {
        kotlin.jvm.internal.G.p(userPreferences, "userPreferences");
        kotlin.jvm.internal.G.p(startPageInitializer, "startPageInitializer");
        kotlin.jvm.internal.G.p(bookmarkPageInitializer, "bookmarkPageInitializer");
        this.f148462a = userPreferences;
        this.f148463b = startPageInitializer;
        this.f148464c = bookmarkPageInitializer;
    }

    @Override // com.cookiegames.smartcookie.view.r0
    public void a(@NotNull WebView webView, @NotNull Map<String, String> headers) {
        kotlin.jvm.internal.G.p(webView, "webView");
        kotlin.jvm.internal.G.p(headers, "headers");
        String strE = this.f148462a.E();
        (kotlin.jvm.internal.G.g(strE, R3.a.f67730h) ? this.f148463b : kotlin.jvm.internal.G.g(strE, R3.a.f67733k) ? this.f148464c : new s0(strE)).a(webView, headers);
    }
}
