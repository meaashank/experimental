package xa;

import com.prism.lib.downloader.common.DownloadStatus;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: xa.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5802d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C5802d f240585c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Long, C5800b> f240586a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f240587b = new AtomicInteger();

    public static C5802d f() {
        C5802d c5802d = f240585c;
        if (c5802d != null) {
            return c5802d;
        }
        synchronized (C5802d.class) {
            try {
                C5802d c5802d2 = f240585c;
                if (c5802d2 != null) {
                    return c5802d2;
                }
                C5802d c5802d3 = new C5802d();
                f240585c = c5802d3;
                return c5802d3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i() {
        f();
    }

    public void a(long j10) {
        C5800b c5800b = this.f240586a.get(Long.valueOf(j10));
        if (c5800b == null) {
            return;
        }
        c5800b.j();
    }

    public void b() {
        Iterator<Map.Entry<Long, C5800b>> it = this.f240586a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().j();
        }
    }

    public void c(Object obj) {
        Iterator<Map.Entry<Long, C5800b>> it = this.f240586a.entrySet().iterator();
        while (it.hasNext()) {
            C5800b value = it.next().getValue();
            if ((value.F() instanceof String) && (obj instanceof String)) {
                if (((String) value.F()).equals((String) obj)) {
                    value.j();
                }
            } else if (value.F().equals(obj)) {
                value.j();
            }
        }
    }

    public boolean d(C5800b c5800b) {
        return this.f240586a.get(Long.valueOf(c5800b.w())) != null;
    }

    public C5800b e(long j10) {
        return this.f240586a.get(Long.valueOf(j10));
    }

    public final int g() {
        return this.f240587b.incrementAndGet();
    }

    public DownloadStatus h(long j10) {
        C5800b c5800b = this.f240586a.get(Long.valueOf(j10));
        return c5800b != null ? c5800b.E() : DownloadStatus.UNKNOWN;
    }

    public void j(long j10) {
        C5800b c5800b = this.f240586a.get(Long.valueOf(j10));
        if (c5800b == null) {
            return;
        }
        c5800b.X();
    }

    public void k(C5800b c5800b) {
        this.f240586a.put(Long.valueOf(c5800b.w()), c5800b);
        if (c5800b.D() >= 0) {
            return;
        }
        c5800b.u0(this.f240587b.incrementAndGet());
    }

    public void l(C5800b c5800b) {
        this.f240586a.remove(Long.valueOf(c5800b.w()));
    }

    public void m(long j10) {
        C5800b c5800b = this.f240586a.get(Long.valueOf(j10));
        if (c5800b == null) {
            return;
        }
        c5800b.Y();
    }
}
