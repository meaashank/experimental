package io.reactivex.rxjava3.internal.util;

import C4.q;
import androidx.compose.animation.core.C1598m0;
import androidx.compose.runtime.snapshots.z;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ExceptionHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Throwable f211932a = new Termination();

    public static final class Termination extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        public Termination() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    public ExceptionHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean a(AtomicReference<Throwable> field, Throwable exception) {
        Throwable th;
        do {
            th = field.get();
            if (th == f211932a) {
                return false;
            }
        } while (!C1598m0.a(field, th, th == null ? exception : new CompositeException(th, exception)));
        return true;
    }

    public static NullPointerException b(String prefix) {
        return new NullPointerException(e(prefix));
    }

    public static List<Throwable> c(Throwable t10) {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.offer(t10);
        while (!arrayDeque.isEmpty()) {
            Throwable th = (Throwable) arrayDeque.removeFirst();
            if (th instanceof CompositeException) {
                List<Throwable> list = ((CompositeException) th).f207347a;
                for (int size = list.size() - 1; size >= 0; size--) {
                    arrayDeque.offerFirst(list.get(size));
                }
            } else {
                arrayList.add(th);
            }
        }
        return arrayList;
    }

    public static <T> T d(T value, String prefix) {
        if (value != null) {
            return value;
        }
        throw b(prefix);
    }

    public static String e(String prefix) {
        return androidx.compose.runtime.changelist.j.a(prefix, " Null values are generally not allowed in 3.x operators and sources.");
    }

    public static Throwable f(AtomicReference<Throwable> field) {
        Throwable th = field.get();
        Throwable th2 = f211932a;
        return th != th2 ? field.getAndSet(th2) : th;
    }

    public static <E extends Throwable> Exception g(Throwable e10) throws Throwable {
        if (e10 instanceof Exception) {
            return (Exception) e10;
        }
        throw e10;
    }

    public static String h(long timeout, TimeUnit unit) {
        StringBuilder sbA = z.a("The source did not signal an event for ", timeout, q.f17581a);
        sbA.append(unit.toString().toLowerCase());
        sbA.append(" and has been terminated.");
        return sbA.toString();
    }

    public static RuntimeException i(Throwable error) {
        if (error instanceof Error) {
            throw ((Error) error);
        }
        return error instanceof RuntimeException ? (RuntimeException) error : new RuntimeException(error);
    }
}
