package com.inmobi.media;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class B5 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f151769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N4 f151770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f151771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f151772d;

    public B5(FrameLayout view, N4 n42) {
        kotlin.jvm.internal.G.p(view, "view");
        this.f151769a = view;
        this.f151770b = n42;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            N4 n42 = this.f151770b;
            if (n42 != null) {
                String str = E5.f151900a;
                kotlin.jvm.internal.G.o(str, "access$getTAG$p(...)");
                ((O4) n42).a(str, "close called");
            }
            this.f151771c = AbstractC3760v3.a(this.f151769a.getWidth());
            this.f151772d = AbstractC3760v3.a(this.f151769a.getHeight());
            this.f151769a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            Boolean bool = Boolean.FALSE;
            synchronized (bool) {
                bool.notify();
            }
        } catch (Exception e10) {
            N4 n43 = this.f151770b;
            if (n43 != null) {
                String str2 = E5.f151900a;
                ((O4) n43).b(str2, jd.a(e10, O5.a(str2, "access$getTAG$p(...)", "SDK encountered unexpected error in JavaScriptBridge$1.onGlobalLayout(); ")));
            }
        }
    }
}
