package com.inmobi.media;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class X9 extends Lambda implements ed.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y9 f152601a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X9(Y9 y92) {
        super(1);
        this.f152601a = y92;
    }

    @Override // ed.l
    public final Object invoke(Object obj) {
        U9 result = (U9) obj;
        kotlin.jvm.internal.G.p(result, "result");
        if (result instanceof S9) {
            this.f152601a.a((R9) null);
        } else {
            Y9 y92 = this.f152601a;
            y92.a(new W9(y92));
        }
        return kotlin.L0.f217464a;
    }
}
