package Cc;

import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.disposables.e;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements d, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<d> f17599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f17600b;

    public a() {
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean a(d d10) {
        Objects.requireNonNull(d10, "d is null");
        if (!this.f17600b) {
            synchronized (this) {
                try {
                    if (!this.f17600b) {
                        List linkedList = this.f17599a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f17599a = linkedList;
                        }
                        linkedList.add(d10);
                        return true;
                    }
                } finally {
                }
            }
        }
        d10.dispose();
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean b(d d10) {
        Objects.requireNonNull(d10, "Disposable item is null");
        if (this.f17600b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f17600b) {
                    return false;
                }
                List<d> list = this.f17599a;
                if (list != null && list.remove(d10)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean c(d d10) {
        if (!b(d10)) {
            return false;
        }
        d10.dispose();
        return true;
    }

    public boolean d(d... ds) {
        Objects.requireNonNull(ds, "ds is null");
        if (!this.f17600b) {
            synchronized (this) {
                try {
                    if (!this.f17600b) {
                        List linkedList = this.f17599a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f17599a = linkedList;
                        }
                        for (d dVar : ds) {
                            Objects.requireNonNull(dVar, "d is null");
                            linkedList.add(dVar);
                        }
                        return true;
                    }
                } finally {
                }
            }
        }
        for (d dVar2 : ds) {
            dVar2.dispose();
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        if (this.f17600b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f17600b) {
                    return;
                }
                this.f17600b = true;
                List<d> list = this.f17599a;
                this.f17599a = null;
                f(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        if (this.f17600b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f17600b) {
                    return;
                }
                List<d> list = this.f17599a;
                this.f17599a = null;
                f(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(List<d> set) {
        if (set == null) {
            return;
        }
        Iterator<d> it = set.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw ExceptionHelper.i((Throwable) arrayList.get(0));
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return this.f17600b;
    }

    public a(d... resources) {
        Objects.requireNonNull(resources, "resources is null");
        this.f17599a = new LinkedList();
        for (d dVar : resources) {
            Objects.requireNonNull(dVar, "Disposable item is null");
            this.f17599a.add(dVar);
        }
    }

    public a(Iterable<? extends d> resources) {
        Objects.requireNonNull(resources, "resources is null");
        this.f17599a = new LinkedList();
        for (d dVar : resources) {
            Objects.requireNonNull(dVar, "Disposable item is null");
            this.f17599a.add(dVar);
        }
    }
}
