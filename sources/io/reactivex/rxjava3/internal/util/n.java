package io.reactivex.rxjava3.internal.util;

import Dc.q;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f211955a = Long.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f211956b = Long.MAX_VALUE;

    public n() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> boolean a(boolean d10, boolean empty, Subscriber<?> s10, boolean delayError, q<?> q10, m<T, U> qd2) {
        if (qd2.cancelled()) {
            q10.clear();
            return true;
        }
        if (!d10) {
            return false;
        }
        if (delayError) {
            if (!empty) {
                return false;
            }
            Throwable thA = qd2.a();
            if (thA != null) {
                s10.onError(thA);
                return true;
            }
            s10.onComplete();
            return true;
        }
        Throwable thA2 = qd2.a();
        if (thA2 != null) {
            q10.clear();
            s10.onError(thA2);
            return true;
        }
        if (!empty) {
            return false;
        }
        s10.onComplete();
        return true;
    }

    public static <T, U> boolean b(boolean d10, boolean empty, V<?> observer, boolean delayError, q<?> q10, io.reactivex.rxjava3.disposables.d disposable, j<T, U> qd2) {
        if (qd2.cancelled()) {
            q10.clear();
            disposable.dispose();
            return true;
        }
        if (!d10) {
            return false;
        }
        if (delayError) {
            if (!empty) {
                return false;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            Throwable thA = qd2.a();
            if (thA != null) {
                observer.onError(thA);
                return true;
            }
            observer.onComplete();
            return true;
        }
        Throwable thA2 = qd2.a();
        if (thA2 != null) {
            q10.clear();
            if (disposable != null) {
                disposable.dispose();
            }
            observer.onError(thA2);
            return true;
        }
        if (!empty) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        observer.onComplete();
        return true;
    }

    public static <T> q<T> c(int capacityHint) {
        return capacityHint < 0 ? new io.reactivex.rxjava3.internal.queue.a(-capacityHint) : new SpscArrayQueue(capacityHint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        r1 = r8.b(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r1 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T, U> void d(Dc.p<T> r9, zc.V<? super U> r10, boolean r11, io.reactivex.rxjava3.disposables.d r12, io.reactivex.rxjava3.internal.util.j<T, U> r13) {
        /*
            r0 = 1
            r1 = r0
        L2:
            boolean r2 = r13.d()
            boolean r3 = r9.isEmpty()
            r6 = r9
            r4 = r10
            r5 = r11
            r7 = r12
            r8 = r13
            boolean r9 = b(r2, r3, r4, r5, r6, r7, r8)
            if (r9 == 0) goto L16
            goto L35
        L16:
            boolean r2 = r8.d()
            java.lang.Object r9 = r6.poll()
            if (r9 != 0) goto L22
            r3 = r0
            goto L24
        L22:
            r10 = 0
            r3 = r10
        L24:
            boolean r10 = b(r2, r3, r4, r5, r6, r7, r8)
            r11 = r3
            if (r10 == 0) goto L2c
            goto L35
        L2c:
            if (r11 == 0) goto L3c
            int r9 = -r1
            int r1 = r8.b(r9)
            if (r1 != 0) goto L36
        L35:
            return
        L36:
            r10 = r4
            r11 = r5
            r9 = r6
            r12 = r7
            r13 = r8
            goto L2
        L3c:
            r8.e(r4, r9)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.util.n.d(Dc.p, zc.V, boolean, io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.internal.util.j):void");
    }

    public static <T, U> void e(Dc.p<T> q10, Subscriber<? super U> a10, boolean delayError, io.reactivex.rxjava3.disposables.d dispose, m<T, U> qd2) {
        int iB = 1;
        while (true) {
            boolean zD = qd2.d();
            T tPoll = q10.poll();
            boolean z10 = tPoll == null;
            Dc.p<T> pVar = q10;
            Subscriber<? super U> subscriber = a10;
            boolean z11 = delayError;
            m<T, U> mVar = qd2;
            if (a(zD, z10, subscriber, z11, pVar, mVar)) {
                if (dispose != null) {
                    dispose.dispose();
                    return;
                }
                return;
            }
            if (z10) {
                iB = mVar.b(-iB);
                if (iB == 0) {
                    return;
                }
            } else {
                long jG = mVar.g();
                if (jG == 0) {
                    pVar.clear();
                    if (dispose != null) {
                        dispose.dispose();
                    }
                    subscriber.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                }
                if (mVar.f(subscriber, tPoll) && jG != Long.MAX_VALUE) {
                    mVar.e(1L);
                }
            }
            a10 = subscriber;
            delayError = z11;
            q10 = pVar;
            qd2 = mVar;
        }
    }

    public static boolean f(Bc.e cancelled) {
        try {
            return cancelled.d();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            return true;
        }
    }

    public static <T> void g(Subscriber<? super T> actual, Queue<T> queue, AtomicLong state, Bc.e isCancelled) {
        long j10;
        long j11;
        if (queue.isEmpty()) {
            actual.onComplete();
            return;
        }
        if (h(state.get(), actual, queue, state, isCancelled)) {
            return;
        }
        do {
            j10 = state.get();
            if ((j10 & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j11 = j10 | Long.MIN_VALUE;
            }
        } while (!state.compareAndSet(j10, j11));
        if (j10 != 0) {
            h(j11, actual, queue, state, isCancelled);
        }
    }

    public static <T> boolean h(long j10, Subscriber<? super T> subscriber, Queue<T> queue, AtomicLong atomicLong, Bc.e eVar) {
        long j11 = j10 & Long.MIN_VALUE;
        while (true) {
            if (j11 != j10) {
                if (f(eVar)) {
                    return true;
                }
                T tPoll = queue.poll();
                if (tPoll == null) {
                    subscriber.onComplete();
                    return true;
                }
                subscriber.onNext(tPoll);
                j11++;
            } else {
                if (f(eVar)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    subscriber.onComplete();
                    return true;
                }
                j10 = atomicLong.get();
                if (j10 == j11) {
                    long jAddAndGet = atomicLong.addAndGet(-(j11 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                        return false;
                    }
                    j11 = jAddAndGet & Long.MIN_VALUE;
                    j10 = jAddAndGet;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T> boolean i(long n10, Subscriber<? super T> actual, Queue<T> queue, AtomicLong state, Bc.e isCancelled) {
        long j10;
        do {
            j10 = state.get();
        } while (!state.compareAndSet(j10, b.c(Long.MAX_VALUE & j10, n10) | (j10 & Long.MIN_VALUE)));
        if (j10 != Long.MIN_VALUE) {
            return false;
        }
        h(n10 | Long.MIN_VALUE, actual, queue, state, isCancelled);
        return true;
    }

    public static void j(Subscription s10, int prefetch) {
        s10.request(prefetch < 0 ? Long.MAX_VALUE : prefetch);
    }
}
