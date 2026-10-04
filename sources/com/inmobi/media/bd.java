package com.inmobi.media;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class bd extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dd f152734a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(dd ddVar) {
        super(0);
        this.f152734a = ddVar;
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() {
        dd ddVar = this.f152734a;
        return new Yc(ddVar, ddVar.f152832i);
    }
}
