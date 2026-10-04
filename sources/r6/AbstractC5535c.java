package r6;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: r6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC5535c<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Handler f227230c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<InterfaceC5536d<T>, Integer> f227231a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f227232b;

    public AbstractC5535c(boolean z10) {
        this.f227232b = z10;
    }

    public static Handler e() {
        if (f227230c == null) {
            f227230c = new Handler(Looper.getMainLooper());
        }
        return f227230c;
    }

    public void c(T t10) {
        int iD = d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<InterfaceC5536d<T>, Integer> entry : this.f227231a.entrySet()) {
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

    public abstract T f();

    public void i(InterfaceC5536d<T> interfaceC5536d) {
        j(interfaceC5536d, 0);
    }

    public void j(InterfaceC5536d<T> interfaceC5536d, int i10) {
        this.f227231a.put(interfaceC5536d, Integer.valueOf(i10));
        ArrayList arrayList = new ArrayList();
        arrayList.add(interfaceC5536d);
        if (this.f227232b) {
            m(arrayList, i10, f());
        }
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void h(List<InterfaceC5536d<T>> list, T t10) {
        Iterator<InterfaceC5536d<T>> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(t10);
        }
    }

    public final void l(final List<InterfaceC5536d<T>> list, int i10, int i11, final T t10) {
        if (i10 == 0 || i11 == i10) {
            h(list, t10);
        } else if (i10 == 2) {
            new Thread(new Runnable() { // from class: r6.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f227224a.h(list, t10);
                }
            }).start();
        } else if (i10 == 1) {
            e().post(new Runnable() { // from class: r6.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f227227a.h(list, t10);
                }
            });
        }
    }

    public final void m(List<InterfaceC5536d<T>> list, int i10, T t10) {
        l(list, i10, d(), t10);
    }

    public void n(InterfaceC5536d<T> interfaceC5536d) {
        this.f227231a.remove(interfaceC5536d);
    }
}
