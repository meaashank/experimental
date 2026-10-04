package com.inmobi.media;

import F5.ViewOnTouchListenerC1061g0;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.N6;

/* JADX INFO: loaded from: classes5.dex */
public final class N6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3809ya f152298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N4 f152299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public B6 f152300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3805y6 f152301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3805y6 f152302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3805y6 f152303f;

    public N6(GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya, N4 n42) {
        this.f152298a = gestureDetectorOnGestureListenerC3809ya;
        this.f152299b = n42;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean b() {
        Context contextD = C3657nb.d();
        if (contextD == null) {
            return false;
        }
        Object systemService = contextD.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    public final void a(String url, Activity activity) {
        kotlin.jvm.internal.G.p(url, "url");
        kotlin.jvm.internal.G.p(activity, "activity");
        N4 n42 = this.f152299b;
        if (n42 != null) {
            ((O4) n42).c("MraidMediaProcessor", "doPlayMedia");
        }
        B6 b62 = new B6(activity, this.f152299b);
        this.f152300c = b62;
        b62.setPlaybackData(url);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        RelativeLayout.LayoutParams layoutParamsA = E3.a.a(-1, -1, 13);
        B6 b63 = this.f152300c;
        if (b63 != null) {
            b63.setLayoutParams(layoutParamsA);
        }
        C6 c62 = new C6(activity);
        c62.setOnTouchListener(new ViewOnTouchListenerC1061g0());
        c62.setBackgroundColor(-16777216);
        c62.addView(this.f152300c);
        N4 n43 = this.f152299b;
        if (n43 != null) {
            ((O4) n43).a("MraidMediaProcessor", "adding media view on top");
        }
        viewGroup.addView(c62, new ViewGroup.LayoutParams(-1, -1));
        B6 b64 = this.f152300c;
        if (b64 != null) {
            b64.setViewContainer(c62);
        }
        B6 b65 = this.f152300c;
        if (b65 != null) {
            b65.requestFocus();
        }
        B6 b66 = this.f152300c;
        if (b66 != null) {
            b66.setOnKeyListener(new View.OnKeyListener() { // from class: F5.h0
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                    return N6.a(this.f34490a, view, i10, keyEvent);
                }
            });
        }
        B6 b67 = this.f152300c;
        if (b67 != null) {
            b67.setListener(new M6(this));
        }
        B6 b68 = this.f152300c;
        if (b68 != null) {
            b68.a();
        }
    }

    public static final boolean a(N6 this$0, View view, int i10, KeyEvent keyEvent) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        if (4 != i10 || keyEvent.getAction() != 0) {
            return false;
        }
        B6 b62 = this$0.f152300c;
        if (b62 == null) {
            return true;
        }
        b62.b();
        return true;
    }

    public final int a() {
        AdConfig.RenderingConfig renderingConfig;
        N4 n42 = this.f152299b;
        if (n42 != null) {
            ((O4) n42).c("MraidMediaProcessor", "deviceVolume");
        }
        Context contextD = C3657nb.d();
        if (contextD == null) {
            return -1;
        }
        GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya = this.f152298a;
        if (((gestureDetectorOnGestureListenerC3809ya == null || (renderingConfig = gestureDetectorOnGestureListenerC3809ya.getRenderingConfig()) == null) ? false : renderingConfig.getEnablePubMuteControl()) && C3657nb.o()) {
            return 0;
        }
        Object systemService = contextD.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }
}
