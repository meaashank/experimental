package io.reactivex.rxjava3.internal.disposables;

import Ic.a;
import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public enum DisposableHelper implements d {
    DISPOSED;

    public static boolean replace(AtomicReference<d> field, d d10) {
        d dVar;
        do {
            dVar = field.get();
            if (dVar == DISPOSED) {
                if (d10 == null) {
                    return false;
                }
                d10.dispose();
                return false;
            }
        } while (!C1598m0.a(field, dVar, d10));
        return true;
    }

    public static void reportDisposableSet() {
        a.Y(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean set(AtomicReference<d> field, d d10) {
        d dVar;
        do {
            dVar = field.get();
            if (dVar == DISPOSED) {
                if (d10 == null) {
                    return false;
                }
                d10.dispose();
                return false;
            }
        } while (!C1598m0.a(field, dVar, d10));
        if (dVar == null) {
            return true;
        }
        dVar.dispose();
        return true;
    }

    public static boolean setOnce(AtomicReference<d> field, d d10) {
        Objects.requireNonNull(d10, "d is null");
        if (C1598m0.a(field, null, d10)) {
            return true;
        }
        d10.dispose();
        if (field.get() == DISPOSED) {
            return false;
        }
        reportDisposableSet();
        return false;
    }

    public static boolean trySet(AtomicReference<d> field, d d10) {
        if (C1598m0.a(field, null, d10)) {
            return true;
        }
        if (field.get() != DISPOSED) {
            return false;
        }
        d10.dispose();
        return false;
    }

    public static boolean validate(d current, d next) {
        if (next == null) {
            a.Y(new NullPointerException("next is null"));
            return false;
        }
        if (current == null) {
            return true;
        }
        next.dispose();
        reportDisposableSet();
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return true;
    }

    public static boolean dispose(AtomicReference<d> field) {
        d andSet;
        d dVar = field.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (dVar == disposableHelper || (andSet = field.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(d d10) {
        return d10 == DISPOSED;
    }
}
