package com.inmobi.media;

import kotlin.jvm.internal.Lambda;
import kotlin.text.C5032y;

/* JADX INFO: loaded from: classes5.dex */
public final class W9 extends Lambda implements ed.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y9 f152576a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W9(Y9 y92) {
        super(1);
        this.f152576a = y92;
    }

    @Override // ed.l
    public final Object invoke(Object obj) {
        R9 data = (R9) obj;
        kotlin.jvm.internal.G.p(data, "data");
        int iIncrementAndGet = this.f152576a.f152629c.incrementAndGet();
        Y9 y92 = this.f152576a;
        if (iIncrementAndGet == y92.f152631e) {
            if (data.f152412a == 0 && data.f152413b == 0) {
                y92.a((R9) null);
            } else {
                C5032y.x("No of In-App Purchases: " + data.f152412a + "\n                                    | and No of Subscriptions: " + data.f152413b, null, 1, null);
                this.f152576a.a(data);
            }
        }
        return kotlin.L0.f217464a;
    }
}
