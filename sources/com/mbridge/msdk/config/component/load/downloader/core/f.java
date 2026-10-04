package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, d> f154538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<d>> f154539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f154540c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final f f154541a = new f();
    }

    public static f a() {
        return b.f154541a;
    }

    private int b() {
        return this.f154540c.incrementAndGet();
    }

    public void c() {
    }

    private f() {
        this.f154538a = new ConcurrentHashMap<>();
        this.f154540c = new AtomicInteger();
        this.f154539b = new ConcurrentHashMap<>();
    }

    public synchronized void a(d dVar) {
        try {
            String strE = dVar.e();
            dVar.a(b());
            if (this.f154538a.containsKey(strE)) {
                dVar.b(dVar.i() != 7 ? 8 : 7);
                if (this.f154539b.containsKey(strE)) {
                    CopyOnWriteArrayList<d> copyOnWriteArrayList = this.f154539b.get(strE);
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.add(dVar);
                        this.f154539b.remove(strE);
                        this.f154539b.put(strE, copyOnWriteArrayList);
                    }
                } else {
                    CopyOnWriteArrayList<d> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                    copyOnWriteArrayList2.add(dVar);
                    this.f154539b.put(strE, copyOnWriteArrayList2);
                }
            } else {
                dVar.b(dVar.i() != 7 ? 2 : 7);
                this.f154538a.put(strE, dVar);
                dVar.a(i.b().a().getDownloadTasks().submit(new h(dVar)));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b(d dVar) {
        CopyOnWriteArrayList<d> copyOnWriteArrayListRemove;
        String strE = dVar.e();
        this.f154538a.remove(strE);
        if (this.f154539b.containsKey(strE) && (copyOnWriteArrayListRemove = this.f154539b.remove(strE)) != null && !copyOnWriteArrayListRemove.isEmpty()) {
            d dVarRemove = copyOnWriteArrayListRemove.remove(0);
            dVarRemove.b(2);
            this.f154538a.put(strE, dVarRemove);
            dVarRemove.a(i.b().a().getDownloadTasks().submit(new h(dVarRemove)));
            if (!copyOnWriteArrayListRemove.isEmpty()) {
                this.f154539b.put(strE, copyOnWriteArrayListRemove);
            }
        }
    }

    public synchronized void a(String str) {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        try {
            if (!TextUtils.isEmpty(str) && this.f154539b.containsKey(str) && (copyOnWriteArrayList = this.f154539b.get(str)) != null && !copyOnWriteArrayList.isEmpty()) {
                for (d dVar : copyOnWriteArrayList) {
                    copyOnWriteArrayList.remove(dVar);
                    dVar.b(dVar.c());
                }
                if (!copyOnWriteArrayList.isEmpty()) {
                    this.f154539b.remove(str);
                    this.f154539b.put(str, copyOnWriteArrayList);
                } else {
                    this.f154539b.remove(str);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                a(this.f154538a.get(str), str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(d dVar, String str) {
        if (dVar != null) {
            dVar.a(dVar.c());
            this.f154538a.remove(str);
        }
    }
}
