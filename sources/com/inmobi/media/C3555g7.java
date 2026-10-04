package com.inmobi.media;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: com.inmobi.media.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3555g7 implements Xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f152937a = new Rect();

    @Override // com.inmobi.media.Xc
    public final boolean a(View rootView, View adView, int i10) {
        kotlin.jvm.internal.G.p(rootView, "rootView");
        kotlin.jvm.internal.G.p(adView, "adView");
        return true;
    }

    @Override // com.inmobi.media.Xc
    public final boolean a(View view, View view2, int i10, Object obj) {
        Q7 mediaPlayer;
        if (!(obj instanceof C3499c7) || ((C3499c7) obj).f152791t) {
            return false;
        }
        if ((!(view2 instanceof C3765v8) || (mediaPlayer = ((C3765v8) view2).getMediaPlayer()) == null || 3 == mediaPlayer.f152393a) && view2 != null && view2.isShown()) {
            if ((view != null ? view.getParent() : null) == null || !view2.getGlobalVisibleRect(this.f152937a)) {
                return false;
            }
            long jHeight = ((long) this.f152937a.height()) * ((long) this.f152937a.width());
            long width = ((long) view.getWidth()) * ((long) view.getHeight());
            if (width > 0 && ((long) 100) * jHeight >= ((long) i10) * width) {
                return true;
            }
        }
        return false;
    }
}
