package com.inmobi.media;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: com.inmobi.media.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3552g4 implements InterfaceC3622l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f152935a;

    @Override // com.inmobi.media.Xc
    public final boolean a(View view, View view2, int i10, Object obj) {
        if (view2 != null && view2.getVisibility() == 0) {
            if ((view != null ? view.getParent() : null) != null && view2.isShown()) {
                GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya = view2 instanceof GestureDetectorOnGestureListenerC3809ya ? (GestureDetectorOnGestureListenerC3809ya) view2 : null;
                if (gestureDetectorOnGestureListenerC3809ya == null) {
                    return false;
                }
                if (gestureDetectorOnGestureListenerC3809ya.getPlacementType() != 1 && (gestureDetectorOnGestureListenerC3809ya.getHeight() <= 0 || gestureDetectorOnGestureListenerC3809ya.getWidth() <= 0)) {
                    return false;
                }
                Rect rect = new Rect();
                if (!gestureDetectorOnGestureListenerC3809ya.getGlobalVisibleRect(rect)) {
                    return false;
                }
                this.f152935a = ((long) rect.height()) * ((long) rect.width());
                if (gestureDetectorOnGestureListenerC3809ya.getPlacementType() == 1) {
                    gestureDetectorOnGestureListenerC3809ya.setConfiguredArea(gestureDetectorOnGestureListenerC3809ya.getHeight() * gestureDetectorOnGestureListenerC3809ya.getWidth());
                }
                if (gestureDetectorOnGestureListenerC3809ya.getArea() > 0) {
                    if (((long) 100) * this.f152935a >= gestureDetectorOnGestureListenerC3809ya.getConfiguredArea() * ((long) i10)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010e A[SYNTHETIC] */
    @Override // com.inmobi.media.Xc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.view.View r13, android.view.View r14, int r15) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3552g4.a(android.view.View, android.view.View, int):boolean");
    }
}
