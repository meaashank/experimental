package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class J1 extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.G f152087a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(Context context) {
        super(context);
        kotlin.jvm.internal.G.p(context, "context");
        this.f152087a = kotlin.I.a(new I1(this));
    }

    public abstract U5 f();

    @NotNull
    public final U5 getLandingPageHandler() {
        return (U5) this.f152087a.getValue();
    }
}
