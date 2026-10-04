package ta;

import android.content.Context;
import android.util.Log;
import com.prism.commons.utils.l0;
import h6.InterfaceC4495a;
import h6.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import ua.C5662b;
import xa.C5800b;
import xa.C5802d;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Context f239228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Set<b> f239229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C5662b f239230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static d<String, C5800b> f239231f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f239226a = l0.b(c.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f239227b = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile boolean f239232g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final InterfaceC4495a<C5800b, String> f239233h = new ta.b();

    public class a extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            c.a();
        }
    }

    public interface b {
        void a(C5800b c5800b, int i10, String str);

        void b(C5800b c5800b);

        void c(ArrayList<C5800b> arrayList);

        void d(C5800b c5800b, int i10);
    }

    public static void a() {
        if (f239232g) {
            return;
        }
        synchronized (c.class) {
            b();
        }
    }

    public static void b() {
        if (f239232g) {
            return;
        }
        C5662b c5662b = new C5662b(f239228c);
        f239230e = c5662b;
        ArrayList arrayList = (ArrayList) c5662b.f();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C5800b c5800b = (C5800b) obj;
            C5802d.f().k(c5800b);
            f239231f.c(c5800b);
        }
        h();
        f239232g = true;
    }

    public static void c(Context context) {
        if (f239227b) {
            return;
        }
        synchronized (c.class) {
            d(context);
        }
    }

    public static void d(Context context) {
        if (f239227b) {
            return;
        }
        f239228c = context;
        f239229d = new HashSet();
        f239231f = new d<>(f239233h, C5800b.f240535z, C5800b.class);
        f239227b = true;
        new a().start();
    }

    public static synchronized void e(C5800b c5800b) {
        int iS = f239231f.s(c5800b);
        if (iS < 0) {
            return;
        }
        Iterator<b> it = f239229d.iterator();
        while (it.hasNext()) {
            it.next().d(c5800b, iS);
        }
    }

    public static synchronized void f(C5800b c5800b) {
        Iterator<b> it = f239229d.iterator();
        while (it.hasNext()) {
            it.next().b(c5800b);
        }
    }

    public static synchronized void g(C5800b c5800b, String str) {
        int iS = f239231f.s(c5800b);
        if (iS < 0) {
            return;
        }
        Iterator<b> it = f239229d.iterator();
        while (it.hasNext()) {
            it.next().a(c5800b, iS, str);
        }
    }

    public static synchronized void h() {
        ArrayList<C5800b> arrayListO = f239231f.o();
        Iterator<b> it = f239229d.iterator();
        while (it.hasNext()) {
            it.next().c(arrayListO);
        }
    }

    public static synchronized void i(b bVar) {
        f239229d.add(bVar);
        h();
    }

    public static long j(C5800b c5800b) {
        a();
        if (n(c5800b.I()) == null) {
            return o(c5800b);
        }
        return -3L;
    }

    public static void k(C5800b c5800b) {
        a();
        f239230e.i(c5800b.w());
        synchronized (c.class) {
            f239231f.remove(c5800b);
            f(c5800b);
            h();
        }
    }

    public static void l(C5800b c5800b) {
        a();
        f239230e.i(c5800b.w());
        synchronized (c.class) {
            f239231f.remove(c5800b);
            h();
        }
    }

    public static void m(C5800b c5800b, String str) {
        Log.w(f239226a, "download request failed: " + str);
        g(c5800b, str);
    }

    public static C5800b n(String str) {
        a();
        return f239231f.k(str);
    }

    public static long o(C5800b c5800b) {
        a();
        long jG = f239230e.g(c5800b);
        if (jG >= 0) {
            c5800b.i0(jG);
        }
        synchronized (c.class) {
            f239231f.c(c5800b);
            h();
        }
        return jG;
    }

    public static void p(C5800b c5800b, boolean z10) {
        a();
        if (z10) {
            f239230e.k(c5800b);
        }
        e(c5800b);
    }

    public static synchronized void q(b bVar) {
        f239229d.remove(bVar);
    }
}
