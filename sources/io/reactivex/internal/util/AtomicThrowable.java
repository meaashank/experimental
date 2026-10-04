package io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public boolean a(Throwable th) {
        return ExceptionHelper.a(this, th);
    }

    public boolean d() {
        return get() == ExceptionHelper.f207183a;
    }

    public Throwable g() {
        return ExceptionHelper.c(this);
    }
}
