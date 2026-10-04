package com.inmobi.media;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class P6 extends Lambda implements ed.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f152372a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P6(int[] iArr) {
        super(1);
        this.f152372a = iArr;
    }

    @Override // ed.l
    public final Object invoke(Object obj) {
        P1 event = (P1) obj;
        kotlin.jvm.internal.G.p(event, "event");
        return Boolean.valueOf(kotlin.collections.B.z8(this.f152372a, event.f152367a));
    }
}
