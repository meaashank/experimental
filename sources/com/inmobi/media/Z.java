package com.inmobi.media;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Z extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3464a0 f152638a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C3464a0 c3464a0) {
        super(0);
        this.f152638a = c3464a0;
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() {
        return Boolean.valueOf(this.f152638a.f152669h == Vc.f152532c);
    }
}
