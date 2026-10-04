package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiAudio;

/* JADX INFO: loaded from: classes5.dex */
public final class E4 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiAudio f151899a;

    public E4(InMobiAudio inMobiAudio) {
        this.f151899a = inMobiAudio;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            InMobiAudio inMobiAudio = this.f151899a;
            inMobiAudio.f151670f = AbstractC3760v3.a(inMobiAudio.getMeasuredWidth());
            InMobiAudio inMobiAudio2 = this.f151899a;
            inMobiAudio2.f151671g = AbstractC3760v3.a(inMobiAudio2.getMeasuredHeight());
            if (this.f151899a.b()) {
                this.f151899a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception unused) {
            AbstractC3666o6.a((byte) 1, "InMobiAudio", "InMobiAudio$1.onGlobalLayout() handler threw unexpected error");
        }
    }
}
