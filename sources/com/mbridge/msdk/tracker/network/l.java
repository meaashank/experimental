package com.mbridge.msdk.tracker.network;

/* JADX INFO: loaded from: classes5.dex */
public class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile l f159964b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f159965a;

    private l() {
    }

    public static l a() {
        if (f159964b == null) {
            synchronized (l.class) {
                try {
                    if (f159964b == null) {
                        f159964b = new l();
                    }
                } finally {
                }
            }
        }
        return f159964b;
    }

    public u b() {
        if (this.f159965a == null) {
            u uVarA = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(new com.mbridge.msdk.tracker.network.toolbox.m()), null, 10, new com.mbridge.msdk.tracker.network.toolbox.l());
            this.f159965a = uVarA;
            uVarA.b();
        }
        return this.f159965a;
    }
}
