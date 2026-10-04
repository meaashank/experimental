package com.prism.gaia.download;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f164619d = "DownloadHandler";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f164620e = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<Long, d> f164621a = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<Long, d> f164622b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f164623c = 5;

    public static c d() {
        return f164620e;
    }

    public synchronized void a() throws InterruptedException {
        if (this.f164622b.size() == 0 && this.f164621a.size() == 0) {
            if (a.f164589J) {
                Log.i("DownloadHandler", "nothing to wait on");
            }
            return;
        }
        if (a.f164589J) {
            for (d dVar : this.f164622b.values()) {
                Log.i("DownloadHandler", "** progress: " + dVar.f164642a + U6.j.f68738d + dVar.f164643b);
            }
            for (d dVar2 : this.f164621a.values()) {
                Log.i("DownloadHandler", "** in Q: " + dVar2.f164642a + U6.j.f68738d + dVar2.f164643b);
            }
        }
        if (a.f164589J) {
            Log.i("DownloadHandler", "waiting for 5 sec");
        }
        wait(5000L);
    }

    public synchronized void b(long j10) {
        this.f164622b.remove(Long.valueOf(j10));
        f();
        if (this.f164622b.size() == 0 && this.f164621a.size() == 0) {
            notifyAll();
        }
    }

    public synchronized void c(d dVar) {
        try {
            if (!this.f164621a.containsKey(Long.valueOf(dVar.f164642a))) {
                if (a.f164587H) {
                    Log.i("DownloadHandler", "enqueued download. id: " + dVar.f164642a + ", uri: " + dVar.f164643b);
                }
                this.f164621a.put(Long.valueOf(dVar.f164642a), dVar);
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean e(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.LinkedHashMap<java.lang.Long, com.prism.gaia.download.d> r0 = r2.f164621a     // Catch: java.lang.Throwable -> L1c
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L1e
            java.util.HashMap<java.lang.Long, com.prism.gaia.download.d> r0 = r2.f164622b     // Catch: java.lang.Throwable -> L1c
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1a
            goto L1e
        L1a:
            r3 = 0
            goto L1f
        L1c:
            r3 = move-exception
            goto L21
        L1e:
            r3 = 1
        L1f:
            monitor-exit(r2)
            return r3
        L21:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.download.c.e(long):boolean");
    }

    public final synchronized void f() {
        try {
            Iterator<Long> it = this.f164621a.keySet().iterator();
            ArrayList arrayList = new ArrayList();
            while (this.f164622b.size() < 5 && it.hasNext()) {
                Long next = it.next();
                this.f164621a.get(next).s();
                arrayList.add(next);
                this.f164622b.put(next, this.f164621a.get(next));
                if (a.f164587H) {
                    Log.i("DownloadHandler", "started download for : " + next);
                }
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                this.f164621a.remove((Long) obj);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
