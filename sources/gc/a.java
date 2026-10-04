package Gc;

import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.observable.C4751i;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import yc.c;
import yc.e;
import yc.g;
import zc.N;
import zc.W;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T> extends N<T> {
    @e
    @c
    @g("none")
    public N<T> A8() {
        return B8(1);
    }

    @e
    @g("none")
    @c
    public N<T> B8(int numberOfSubscribers) {
        return C8(numberOfSubscribers, Functions.f207355d);
    }

    @e
    @g("none")
    @c
    public N<T> C8(int numberOfSubscribers, @e Bc.g<? super d> connection) {
        Objects.requireNonNull(connection, "connection is null");
        if (numberOfSubscribers > 0) {
            return Ic.a.U(new C4751i(this, numberOfSubscribers, connection));
        }
        E8(connection);
        return Ic.a.P(this);
    }

    @e
    @g("none")
    public final d D8() {
        io.reactivex.rxjava3.internal.util.e eVar = new io.reactivex.rxjava3.internal.util.e();
        E8(eVar);
        return eVar.f211942a;
    }

    @g("none")
    public abstract void E8(@e Bc.g<? super d> connection);

    @e
    @c
    @g("none")
    public N<T> F8() {
        return Ic.a.U(new ObservableRefCount(this));
    }

    @e
    @g("none")
    @c
    public final N<T> G8(int subscriberCount) {
        return I8(subscriberCount, 0L, TimeUnit.NANOSECONDS, Jc.b.j());
    }

    @e
    @g("io.reactivex:computation")
    @c
    public final N<T> H8(int subscriberCount, long timeout, @e TimeUnit unit) {
        return I8(subscriberCount, timeout, unit, Jc.b.a());
    }

    @e
    @g("custom")
    @c
    public final N<T> I8(int subscriberCount, long timeout, @e TimeUnit unit, @e W scheduler) {
        io.reactivex.rxjava3.internal.functions.a.b(subscriberCount, "subscriberCount");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return Ic.a.U(new ObservableRefCount(this, subscriberCount, timeout, unit, scheduler));
    }

    @e
    @g("io.reactivex:computation")
    @c
    public final N<T> J8(long timeout, @e TimeUnit unit) {
        return I8(1, timeout, unit, Jc.b.a());
    }

    @e
    @g("custom")
    @c
    public final N<T> K8(long timeout, @e TimeUnit unit, @e W scheduler) {
        return I8(1, timeout, unit, scheduler);
    }

    @g("none")
    public abstract void L8();
}
