package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3550g2 implements InterfaceC3508d2 {
    @Override // com.inmobi.media.InterfaceC3508d2
    public final void a(V1 click) {
        kotlin.jvm.internal.G.p(click, "click");
        kotlin.jvm.internal.G.o(C3564h2.f(), "access$getTAG$p(...)");
        C3564h2.b(C3564h2.f152957a, click);
        W1 w1B = AbstractC3531eb.b();
        w1B.getClass();
        w1B.a("id = ?", new String[]{String.valueOf(click.f152500a)});
    }

    @Override // com.inmobi.media.InterfaceC3508d2
    public final void a(V1 click, J3 errorCode) {
        kotlin.jvm.internal.G.p(click, "click");
        kotlin.jvm.internal.G.p(errorCode, "errorCode");
        kotlin.jvm.internal.G.o(C3564h2.f(), "access$getTAG$p(...)");
        if (click.f152505f == 0) {
            C3564h2.f152957a.a(click, errorCode.name());
        }
        C3564h2 c3564h2 = C3564h2.f152957a;
        C3564h2.c(c3564h2, click);
        c3564h2.h();
    }
}
