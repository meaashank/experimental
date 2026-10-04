package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class f implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f140629a;

    public static f a() {
        if (f140629a == null) {
            synchronized (f.class) {
                try {
                    if (f140629a == null) {
                        f140629a = new f();
                    }
                } finally {
                }
            }
        }
        return f140629a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.p().execute(runnable);
    }
}
