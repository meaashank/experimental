package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.k;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements d, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k<d> f207343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f207344b;

    public a() {
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean a(@yc.e d disposable) {
        Objects.requireNonNull(disposable, "disposable is null");
        if (!this.f207344b) {
            synchronized (this) {
                try {
                    if (!this.f207344b) {
                        k<d> kVar = this.f207343a;
                        if (kVar == null) {
                            kVar = new k<>();
                            this.f207343a = kVar;
                        }
                        kVar.a(disposable);
                        return true;
                    }
                } finally {
                }
            }
        }
        disposable.dispose();
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean b(@yc.e d disposable) {
        Objects.requireNonNull(disposable, "disposable is null");
        if (this.f207344b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f207344b) {
                    return false;
                }
                k<d> kVar = this.f207343a;
                if (kVar != null && kVar.e(disposable)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean c(@yc.e d disposable) {
        if (!b(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }

    public boolean d(@yc.e d... disposables) {
        Objects.requireNonNull(disposables, "disposables is null");
        if (!this.f207344b) {
            synchronized (this) {
                try {
                    if (!this.f207344b) {
                        k<d> kVar = this.f207343a;
                        if (kVar == null) {
                            kVar = new k<>(disposables.length + 1);
                            this.f207343a = kVar;
                        }
                        for (d dVar : disposables) {
                            Objects.requireNonNull(dVar, "A Disposable in the disposables array is null");
                            kVar.a(dVar);
                        }
                        return true;
                    }
                } finally {
                }
            }
        }
        for (d dVar2 : disposables) {
            dVar2.dispose();
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        if (this.f207344b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f207344b) {
                    return;
                }
                this.f207344b = true;
                k<d> kVar = this.f207343a;
                this.f207343a = null;
                f(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        if (this.f207344b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f207344b) {
                    return;
                }
                k<d> kVar = this.f207343a;
                this.f207343a = null;
                f(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(@yc.f k<d> set) {
        if (set == null) {
            return;
        }
        ArrayList arrayList = null;
        for (d dVar : set.f211954e) {
            if (dVar instanceof d) {
                try {
                    dVar.dispose();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw ExceptionHelper.i((Throwable) arrayList.get(0));
        }
    }

    public int g() {
        if (this.f207344b) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f207344b) {
                    return 0;
                }
                k<d> kVar = this.f207343a;
                return kVar != null ? kVar.f211952c : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return this.f207344b;
    }

    public a(@yc.e d... disposables) {
        Objects.requireNonNull(disposables, "disposables is null");
        this.f207343a = new k<>(disposables.length + 1);
        for (d dVar : disposables) {
            Objects.requireNonNull(dVar, "A Disposable in the disposables array is null");
            this.f207343a.a(dVar);
        }
    }

    public a(@yc.e Iterable<? extends d> disposables) {
        Objects.requireNonNull(disposables, "disposables is null");
        this.f207343a = new k<>();
        for (d dVar : disposables) {
            Objects.requireNonNull(dVar, "A Disposable item in the disposables sequence is null");
            this.f207343a.a(dVar);
        }
    }
}
