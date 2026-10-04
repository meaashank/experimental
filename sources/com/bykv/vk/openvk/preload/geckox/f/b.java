package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f140560a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ReentrantLock f140561b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f140562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileLock f140563d;

    private b(String str, FileLock fileLock) {
        this.f140562c = str;
        this.f140563d = fileLock;
    }

    public static b a(String str) throws Exception {
        f140561b.lock();
        try {
            FileLock fileLockA = FileLock.a(str);
            Map<String, Lock> map = f140560a;
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            reentrantLock.lock();
            return new b(str, fileLockA);
        } catch (Exception e10) {
            f140561b.unlock();
            throw e10;
        }
    }

    public final void a() {
        try {
            this.f140563d.a();
            this.f140563d.b();
            Lock lock = f140560a.get(this.f140562c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            f140561b.unlock();
        }
    }
}
