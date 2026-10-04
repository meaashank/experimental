package hc;

import org.reactivestreams.Subscriber;

/* JADX INFO: renamed from: hc.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC4534n<Downstream, Upstream> {
    @lc.e
    Subscriber<? super Upstream> a(@lc.e Subscriber<? super Downstream> subscriber) throws Exception;
}
