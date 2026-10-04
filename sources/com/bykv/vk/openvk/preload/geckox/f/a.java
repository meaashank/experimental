package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f140557a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileLock f140558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f140559c;

    private a(String str, FileLock fileLock) {
        this.f140559c = str;
        this.f140558b = fileLock;
    }

    public static a a(String str) throws Exception {
        Map<String, Lock> map = f140557a;
        synchronized (map) {
            try {
                Lock reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                if (!reentrantLock.tryLock()) {
                    return null;
                }
                try {
                    FileLock fileLockC = FileLock.c(str);
                    if (fileLockC == null) {
                        reentrantLock.unlock();
                        return null;
                    }
                    return new a(str, fileLockC);
                } catch (Exception e10) {
                    reentrantLock.lock();
                    com.bykv.vk.openvk.preload.geckox.utils.a.a(new RuntimeException(e10));
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        Map<String, Lock> map = f140557a;
        synchronized (map) {
            try {
                try {
                    this.f140558b.a();
                    this.f140558b.b();
                    map.get(this.f140559c).unlock();
                } catch (Throwable th) {
                    f140557a.get(this.f140559c).unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
