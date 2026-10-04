package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class c implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f140627a;

    public static c a() {
        if (f140627a == null) {
            synchronized (c.class) {
                try {
                    if (f140627a == null) {
                        f140627a = new c();
                    }
                } finally {
                }
            }
        }
        return f140627a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.p().execute(runnable);
    }
}
