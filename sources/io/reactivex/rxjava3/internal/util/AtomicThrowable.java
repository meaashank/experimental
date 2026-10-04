package io.reactivex.rxjava3.internal.util;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import zc.F;
import zc.InterfaceC5888e;
import zc.InterfaceC5893j;
import zc.V;
import zc.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public boolean d() {
        return get() == ExceptionHelper.f211932a;
    }

    public Throwable g() {
        return ExceptionHelper.f(this);
    }

    public boolean h(Throwable t10) {
        return ExceptionHelper.a(this, t10);
    }

    public boolean i(Throwable t10) {
        if (ExceptionHelper.a(this, t10)) {
            return true;
        }
        Ic.a.Y(t10);
        return false;
    }

    public void j() {
        Throwable thF = ExceptionHelper.f(this);
        if (thF == null || thF == ExceptionHelper.f211932a) {
            return;
        }
        Ic.a.Y(thF);
    }

    public void k(Subscriber<?> consumer) {
        Throwable thF = ExceptionHelper.f(this);
        if (thF == null) {
            consumer.onComplete();
        } else if (thF != ExceptionHelper.f211932a) {
            consumer.onError(thF);
        }
    }

    public void l(InterfaceC5888e consumer) {
        Throwable thF = ExceptionHelper.f(this);
        if (thF == null) {
            consumer.onComplete();
        } else if (thF != ExceptionHelper.f211932a) {
            consumer.onError(thF);
        }
    }

    public void m(InterfaceC5893j<?> consumer) {
        Throwable thF = ExceptionHelper.f(this);
        if (thF == null) {
            consumer.onComplete();
        } else if (thF != ExceptionHelper.f211932a) {
            consumer.onError(thF);
        }
    }

    public void n(F<?> consumer) {
        Throwable thF = ExceptionHelper.f(this);
        if (thF == null) {
            consumer.onComplete();
        } else if (thF != ExceptionHelper.f211932a) {
            consumer.onError(thF);
        }
    }

    public void o(V<?> consumer) {
        Throwable thF = ExceptionHelper.f(this);
        if (thF == null) {
            consumer.onComplete();
        } else if (thF != ExceptionHelper.f211932a) {
            consumer.onError(thF);
        }
    }

    public void p(a0<?> consumer) {
        Throwable thF = ExceptionHelper.f(this);
        if (thF == null || thF == ExceptionHelper.f211932a) {
            return;
        }
        consumer.onError(thF);
    }
}
