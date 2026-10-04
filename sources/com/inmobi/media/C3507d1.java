package com.inmobi.media;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3507d1 extends Lambda implements ed.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3507d1 f152805a = new C3507d1();

    public C3507d1() {
        super(1);
    }

    @Override // ed.l
    public final Object invoke(Object obj) {
        P1 event = (P1) obj;
        kotlin.jvm.internal.G.p(event, "event");
        int i10 = event.f152367a;
        if (i10 == 1 || i10 == 2) {
            C3535f1 c3535f1 = C3535f1.f152892a;
            C3535f1.f152904m.set(false);
        } else if (i10 != 10) {
            C3535f1 c3535f12 = C3535f1.f152892a;
        } else if ("available".equals(event.f152368b)) {
            C3535f1 c3535f13 = C3535f1.f152892a;
            if (!C3535f1.f152901j.get()) {
                c3535f13.c();
            }
        } else {
            C3535f1 c3535f14 = C3535f1.f152892a;
            C3535f1.d();
        }
        return kotlin.L0.f217464a;
    }
}
