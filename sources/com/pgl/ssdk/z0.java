package com.pgl.ssdk;

import com.pgl.ssdk.y0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes5.dex */
public class z0<T extends y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f161954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BlockingQueue<T> f161955b = new LinkedBlockingQueue();

    private z0(int i10) {
        this.f161954a = i10;
    }

    public static z0 a(int i10) {
        return new z0(i10);
    }

    public T a() {
        return this.f161955b.poll();
    }
}
