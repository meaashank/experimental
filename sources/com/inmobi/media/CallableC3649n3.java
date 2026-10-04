package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.inmobi.media.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class CallableC3649n3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3732t3 f153186a;

    public CallableC3649n3(C3732t3 c3732t3) {
        this.f153186a = c3732t3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f153186a) {
            try {
                C3732t3 c3732t3 = this.f153186a;
                if (c3732t3.f153390j == null) {
                    return null;
                }
                while (c3732t3.f153389i > c3732t3.f153386f) {
                    c3732t3.d((String) ((Map.Entry) c3732t3.f153391k.entrySet().iterator().next()).getKey());
                }
                if (this.f153186a.a()) {
                    this.f153186a.d();
                    this.f153186a.f153392l = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
