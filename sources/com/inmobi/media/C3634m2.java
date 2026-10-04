package com.inmobi.media;

import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.inmobi.media.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3634m2 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile F9 f153123a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3634m2(Runnable runnable, F9 priority) {
        super(runnable, null);
        kotlin.jvm.internal.G.p(priority, "priority");
        this.f153123a = priority;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3634m2 other = (C3634m2) obj;
        kotlin.jvm.internal.G.p(other, "other");
        return kotlin.jvm.internal.G.t(this.f153123a.f151935a, other.f153123a.f151935a);
    }
}
