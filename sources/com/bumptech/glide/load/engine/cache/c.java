package com.bumptech.glide.load.engine.cache;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import y3.m;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, a> f139586a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f139587b = new b();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lock f139588a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f139589b;
    }

    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f139590b = 10;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue<a> f139591a = new ArrayDeque();

        public a a() {
            a aVarPoll;
            synchronized (this.f139591a) {
                aVarPoll = this.f139591a.poll();
            }
            return aVarPoll == null ? new a() : aVarPoll;
        }

        public void b(a aVar) {
            synchronized (this.f139591a) {
                try {
                    if (this.f139591a.size() < 10) {
                        this.f139591a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void a(String str) {
        a aVarA;
        synchronized (this) {
            try {
                aVarA = this.f139586a.get(str);
                if (aVarA == null) {
                    aVarA = this.f139587b.a();
                    this.f139586a.put(str, aVarA);
                }
                aVarA.f139589b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVarA.f139588a.lock();
    }

    public void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                a aVar2 = this.f139586a.get(str);
                m.f(aVar2, "Argument must not be null");
                aVar = aVar2;
                int i10 = aVar.f139589b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f139589b);
                }
                int i11 = i10 - 1;
                aVar.f139589b = i11;
                if (i11 == 0) {
                    a aVarRemove = this.f139586a.remove(str);
                    if (!aVarRemove.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVarRemove + ", safeKey: " + str);
                    }
                    this.f139587b.b(aVarRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f139588a.unlock();
    }
}
