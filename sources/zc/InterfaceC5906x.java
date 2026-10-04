package zc;

import org.reactivestreams.Subscriber;

/* JADX INFO: renamed from: zc.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@FunctionalInterface
public interface InterfaceC5906x<Downstream, Upstream> {
    @yc.e
    Subscriber<? super Upstream> a(@yc.e Subscriber<? super Downstream> subscriber) throws Throwable;
}
