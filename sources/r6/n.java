package r6;

import android.os.Handler;
import android.os.Looper;
import com.prism.commons.utils.t0;
import com.prism.commons.utils.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class n<T, P> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Handler f227258c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0<T, P> f227259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<InterfaceC5536d<T>, Integer> f227260b = new ConcurrentHashMap();

    public n(t0<T, P> t0Var) {
        this.f227259a = t0Var;
    }

    public static Handler e() {
        if (f227258c == null) {
            f227258c = new Handler(Looper.getMainLooper());
        }
        return f227258c;
    }

    public final void c(P p10, T t10) {
        int iD = d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<InterfaceC5536d<T>, Integer> entry : this.f227260b.entrySet()) {
            int iIntValue = entry.getValue().intValue();
            if (iIntValue == 0 || iIntValue == iD) {
                arrayList.add(entry.getKey());
            } else {
                arrayList2.add(entry.getKey());
            }
        }
        int i10 = iD == 2 ? 1 : 2;
        l(arrayList, iD, iD, t10);
        l(arrayList2, i10, iD, t10);
    }

    public final int d() {
        return Looper.myLooper() == Looper.getMainLooper() ? 1 : 2;
    }

    public T h(P p10) {
        return this.f227259a.a(p10);
    }

    public void i(P p10, InterfaceC5536d<T> interfaceC5536d) {
        j(p10, interfaceC5536d, 0);
    }

    public void j(P p10, InterfaceC5536d<T> interfaceC5536d, int i10) {
        this.f227260b.put(interfaceC5536d, Integer.valueOf(i10));
        ArrayList arrayList = new ArrayList();
        arrayList.add(interfaceC5536d);
        m(arrayList, i10, h(p10));
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void g(List<InterfaceC5536d<T>> list, T t10) {
        Iterator<InterfaceC5536d<T>> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(t10);
        }
    }

    public final void l(final List<InterfaceC5536d<T>> list, int i10, int i11, final T t10) {
        if (i10 == 0 || i11 == i10) {
            g(list, t10);
        } else if (i10 == 2) {
            new Thread(new Runnable() { // from class: r6.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f227252a.g(list, t10);
                }
            }).start();
        } else if (i10 == 1) {
            e().post(new Runnable() { // from class: r6.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f227255a.g(list, t10);
                }
            });
        }
    }

    public final void m(List<InterfaceC5536d<T>> list, int i10, T t10) {
        l(list, i10, d(), t10);
    }

    public void n(P p10, T t10) {
        T tH = h(p10);
        this.f227259a.b(p10, t10);
        if (tH != t10) {
            c(p10, t10);
        }
    }

    public void o(InterfaceC5536d<T> interfaceC5536d) {
        this.f227260b.remove(interfaceC5536d);
    }

    public n(y0<T, P> y0Var) {
        this.f227259a = new t0<>(y0Var, y0Var);
    }
}
