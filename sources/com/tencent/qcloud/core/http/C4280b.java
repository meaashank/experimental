package com.tencent.qcloud.core.http;

import android.content.Context;
import android.text.TextUtils;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.tencent.qcloud.core.http.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C4280b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C4280b f194227e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f194229b = new e(yb.b.f241137a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f194230c = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, List<InetAddress>> f194228a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Executor f194231d = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.tencent.qcloud.core.http.b$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f194232a;

        public a(c cVar) {
            this.f194232a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4280b c4280b = C4280b.this;
            c4280b.f(c4280b.f194229b.a());
            C4280b c4280b2 = C4280b.this;
            c4280b2.f(c4280b2.f194230c.d());
            C4280b c4280b3 = C4280b.this;
            c4280b3.f194229b.b(c4280b3.f194228a);
            c cVar = this.f194232a;
            if (cVar != null) {
                cVar.onComplete();
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.qcloud.core.http.b$b, reason: collision with other inner class name */
    public class RunnableC0700b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f194234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f194235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f194236c;

        public RunnableC0700b(String str, List list, c cVar) {
            this.f194234a = str;
            this.f194235b = list;
            this.f194236c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C4280b.this.n(C4280b.this.f194228a.get(this.f194234a), this.f194235b)) {
                C4280b.this.f194228a.put(this.f194234a, this.f194235b);
                C4280b c4280b = C4280b.this;
                c4280b.f194229b.b(c4280b.f194228a);
            }
            c cVar = this.f194236c;
            if (cVar != null) {
                cVar.onComplete();
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.qcloud.core.http.b$c */
    public interface c {
        void onComplete();
    }

    /* JADX INFO: renamed from: com.tencent.qcloud.core.http.b$d */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f194238a = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<String> f194239b = new LinkedList();

        public synchronized void a(String str) {
            this.f194239b.add(str);
        }

        public synchronized void b(List<String> list) {
            this.f194239b.addAll(list);
        }

        public final List<InetAddress> c(String str, int i10) {
            if (i10 < 0) {
                return null;
            }
            try {
                return okhttp3.m.f225807b.lookup(str);
            } catch (UnknownHostException e10) {
                e10.printStackTrace();
                return c(str, i10 - 1);
            }
        }

        public synchronized Map<String, List<InetAddress>> d() {
            HashMap map;
            List<InetAddress> listC;
            map = new HashMap();
            for (String str : new LinkedList(this.f194239b)) {
                if (!TextUtils.isEmpty(str) && (listC = c(str, this.f194238a)) != null) {
                    map.put(str, listC);
                }
            }
            return map;
        }
    }

    /* JADX INFO: renamed from: com.tencent.qcloud.core.http.b$e */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f194240a;

        public e(Context context) {
            if (context != null) {
                this.f194240a = context.getCacheDir().getAbsolutePath().concat("/cosSdkDnsCache.db");
            }
        }

        public synchronized Map<String, List<InetAddress>> a() {
            String str = this.f194240a;
            if (str == null) {
                return null;
            }
            byte[] bArrG = yb.f.g(str);
            if (bArrG != null) {
                Object objI = yb.f.i(bArrG);
                if (objI instanceof Map) {
                    return (Map) objI;
                }
            }
            return null;
        }

        public synchronized void b(Map<String, List<InetAddress>> map) {
            if (this.f194240a == null) {
                return;
            }
            yb.f.j(this.f194240a, yb.f.h(map));
        }
    }

    public static C4280b i() {
        if (f194227e == null) {
            synchronized (C4280b.class) {
                try {
                    if (f194227e == null) {
                        f194227e = new C4280b();
                    }
                } finally {
                }
            }
        }
        return f194227e;
    }

    public final void f(Map<String, List<InetAddress>> map) {
        if (map != null) {
            this.f194228a.putAll(map);
        }
    }

    public void g(List<String> list) {
        this.f194230c.b(list);
    }

    public List<InetAddress> h(String str) throws UnknownHostException {
        if (this.f194228a.containsKey(str)) {
            return this.f194228a.get(str);
        }
        throw new UnknownHostException(str);
    }

    public void j() {
        k(null);
    }

    public void k(c cVar) {
        this.f194231d.execute(new a(cVar));
    }

    public void l(String str, List<InetAddress> list) {
        m(str, list, null);
    }

    public void m(String str, List<InetAddress> list, c cVar) {
        this.f194231d.execute(new RunnableC0700b(str, list, cVar));
    }

    public final boolean n(List<InetAddress> list, List<InetAddress> list2) {
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!list.get(i10).getHostAddress().equals(list2.get(i10).getHostAddress())) {
                return false;
            }
        }
        return true;
    }
}
