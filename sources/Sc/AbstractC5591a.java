package sc;

import hc.H;
import hc.z;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.C4656i;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import java.util.concurrent.TimeUnit;
import lc.InterfaceC5190c;
import lc.e;
import lc.g;
import nc.InterfaceC5271g;
import uc.C5666a;

/* JADX INFO: renamed from: sc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC5591a<T> extends z<T> {
    @e
    public z<T> c8() {
        return d8(1);
    }

    @e
    public z<T> d8(int i10) {
        return e8(i10, Functions.f202950d);
    }

    @e
    public z<T> e8(int i10, @e InterfaceC5271g<? super io.reactivex.disposables.b> interfaceC5271g) {
        if (i10 > 0) {
            return C5666a.R(new C4656i(this, i10, interfaceC5271g));
        }
        g8(interfaceC5271g);
        return C5666a.U(this);
    }

    public final io.reactivex.disposables.b f8() {
        io.reactivex.internal.util.e eVar = new io.reactivex.internal.util.e();
        g8(eVar);
        return eVar.f207193a;
    }

    public abstract void g8(@e InterfaceC5271g<? super io.reactivex.disposables.b> interfaceC5271g);

    @e
    @InterfaceC5190c
    @g("none")
    public z<T> h8() {
        return C5666a.R(new ObservableRefCount(this));
    }

    @InterfaceC5190c
    @g("none")
    public final z<T> i8(int i10) {
        return k8(i10, 0L, TimeUnit.NANOSECONDS, Kc.b.h());
    }

    @InterfaceC5190c
    @g("io.reactivex:computation")
    public final z<T> j8(int i10, long j10, TimeUnit timeUnit) {
        return k8(i10, j10, timeUnit, Kc.b.a());
    }

    @InterfaceC5190c
    @g("custom")
    public final z<T> k8(int i10, long j10, TimeUnit timeUnit, H h10) {
        io.reactivex.internal.functions.a.h(i10, "subscriberCount");
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h10, "scheduler is null");
        return C5666a.R(new ObservableRefCount(this, i10, j10, timeUnit, h10));
    }

    @InterfaceC5190c
    @g("io.reactivex:computation")
    public final z<T> l8(long j10, TimeUnit timeUnit) {
        return k8(1, j10, timeUnit, Kc.b.a());
    }

    @InterfaceC5190c
    @g("custom")
    public final z<T> m8(long j10, TimeUnit timeUnit, H h10) {
        return k8(1, j10, timeUnit, h10);
    }
}
