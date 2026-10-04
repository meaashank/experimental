package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class T5 extends Lambda implements ed.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U5 f152454a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T5(U5 u52) {
        super(2);
        this.f152454a = u52;
    }

    @Override // ed.p
    public final Object invoke(Object obj, Object obj2) {
        String trackerName = (String) obj;
        Map macros = (Map) obj2;
        kotlin.jvm.internal.G.p(trackerName, "trackerName");
        kotlin.jvm.internal.G.p(macros, "macros");
        C3739ta c3739ta = this.f152454a.f152485d;
        if (c3739ta != null) {
            GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya = c3739ta.f153403a;
            if (!gestureDetectorOnGestureListenerC3809ya.f153612e) {
                gestureDetectorOnGestureListenerC3809ya.a(trackerName, macros);
            }
        }
        return kotlin.L0.f217464a;
    }
}
