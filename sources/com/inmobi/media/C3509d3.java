package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.inmobi.media.C3509d3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.inmobi.media.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3509d3 extends dd {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final N4 f152806n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f152807o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f152808p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final WeakReference f152809q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3509d3(C3555g7 visibilityChecker, Activity activity, N4 n42) {
        super(visibilityChecker, (byte) 1, n42);
        kotlin.jvm.internal.G.p(visibilityChecker, "visibilityChecker");
        kotlin.jvm.internal.G.p(activity, "activity");
        this.f152806n = n42;
        this.f152807o = "d3";
        View decorView = activity.getWindow().getDecorView();
        kotlin.jvm.internal.G.o(decorView, "getDecorView(...)");
        this.f152809q = new WeakReference(decorView);
        ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: F5.Y0
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    return C3509d3.a(this.f34423a);
                }
            };
            this.f152808p = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        } else if (n42 != null) {
            ((O4) n42).b("d3", "Visibility Tracker was unable to track views because the  root view tree observer was not alive");
        }
    }

    public static final boolean a(C3509d3 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.g();
        return true;
    }

    @Override // com.inmobi.media.dd
    public final void b() {
        N4 n42 = this.f152806n;
        if (n42 != null) {
            String TAG = this.f152807o;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            ((O4) n42).c(TAG, "unregisterPreDrawListener");
        }
        View view = (View) this.f152809q.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f152808p);
            }
        }
        super.b();
    }

    @Override // com.inmobi.media.dd
    public final int c() {
        return 100;
    }

    @Override // com.inmobi.media.dd
    public final void d() {
    }

    @Override // com.inmobi.media.dd
    public final void e() {
        N4 n42 = this.f152806n;
        if (n42 != null) {
            String TAG = this.f152807o;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            ((O4) n42).c(TAG, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        }
        if (this.f152832i.get()) {
            return;
        }
        N4 n43 = this.f152806n;
        if (n43 != null) {
            String TAG2 = this.f152807o;
            kotlin.jvm.internal.G.o(TAG2, "TAG");
            ((O4) n43).c(TAG2, "unregisterPreDrawListener");
        }
        View view = (View) this.f152809q.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f152808p);
            }
        }
        super.e();
    }

    @Override // com.inmobi.media.dd
    public final void f() {
        N4 n42 = this.f152806n;
        if (n42 != null) {
            String TAG = this.f152807o;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            ((O4) n42).c(TAG, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        }
        if (this.f152832i.get()) {
            View view = (View) this.f152809q.get();
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(this.f152808p);
                } else {
                    N4 n43 = this.f152806n;
                    if (n43 != null) {
                        String TAG2 = this.f152807o;
                        kotlin.jvm.internal.G.o(TAG2, "TAG");
                        ((O4) n43).b(TAG2, "Visibility Tracker was unable to track views because the root view tree observer was not alive");
                    }
                }
            }
            super.f();
        }
    }
}
