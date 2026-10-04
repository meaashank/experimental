package io.reactivex.internal.util;

import hc.G;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import nc.InterfaceC5269e;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f207206a = Long.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f207207b = Long.MAX_VALUE;

    public n() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> boolean a(boolean z10, boolean z11, G<?> g10, boolean z12, pc.o<?> oVar, io.reactivex.disposables.b bVar, j<T, U> jVar) {
        if (jVar.cancelled()) {
            oVar.clear();
            bVar.dispose();
            return true;
        }
        if (!z10) {
            return false;
        }
        if (z12) {
            if (!z11) {
                return false;
            }
            if (bVar != null) {
                bVar.dispose();
            }
            Throwable thA = jVar.a();
            if (thA != null) {
                g10.onError(thA);
                return true;
            }
            g10.onComplete();
            return true;
        }
        Throwable thA2 = jVar.a();
        if (thA2 != null) {
            oVar.clear();
            if (bVar != null) {
                bVar.dispose();
            }
            g10.onError(thA2);
            return true;
        }
        if (!z11) {
            return false;
        }
        if (bVar != null) {
            bVar.dispose();
        }
        g10.onComplete();
        return true;
    }

    public static <T, U> boolean b(boolean z10, boolean z11, Subscriber<?> subscriber, boolean z12, pc.o<?> oVar, m<T, U> mVar) {
        if (mVar.cancelled()) {
            oVar.clear();
            return true;
        }
        if (!z10) {
            return false;
        }
        if (z12) {
            if (!z11) {
                return false;
            }
            Throwable thA = mVar.a();
            if (thA != null) {
                subscriber.onError(thA);
                return true;
            }
            subscriber.onComplete();
            return true;
        }
        Throwable thA2 = mVar.a();
        if (thA2 != null) {
            oVar.clear();
            subscriber.onError(thA2);
            return true;
        }
        if (!z11) {
            return false;
        }
        subscriber.onComplete();
        return true;
    }

    public static <T> pc.o<T> c(int i10) {
        return i10 < 0 ? new io.reactivex.internal.queue.a(-i10) : new SpscArrayQueue(i10);
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
    public static <T, U> void d(pc.n<T> r9, hc.G<? super U> r10, boolean r11, io.reactivex.disposables.b r12, io.reactivex.internal.util.j<T, U> r13) {
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
            boolean r9 = a(r2, r3, r4, r5, r6, r7, r8)
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
            boolean r10 = a(r2, r3, r4, r5, r6, r7, r8)
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
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.n.d(pc.n, hc.G, boolean, io.reactivex.disposables.b, io.reactivex.internal.util.j):void");
    }

    public static <T, U> void e(pc.n<T> nVar, Subscriber<? super U> subscriber, boolean z10, io.reactivex.disposables.b bVar, m<T, U> mVar) {
        int iB = 1;
        while (true) {
            boolean zD = mVar.d();
            T tPoll = nVar.poll();
            boolean z11 = tPoll == null;
            pc.n<T> nVar2 = nVar;
            Subscriber<? super U> subscriber2 = subscriber;
            boolean z12 = z10;
            m<T, U> mVar2 = mVar;
            if (b(zD, z11, subscriber2, z12, nVar2, mVar2)) {
                if (bVar != null) {
                    bVar.dispose();
                    return;
                }
                return;
            }
            if (z11) {
                iB = mVar2.b(-iB);
                if (iB == 0) {
                    return;
                }
            } else {
                long jG = mVar2.g();
                if (jG == 0) {
                    nVar2.clear();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    subscriber2.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                }
                if (mVar2.f(subscriber2, tPoll) && jG != Long.MAX_VALUE) {
                    mVar2.e(1L);
                }
            }
            subscriber = subscriber2;
            z10 = z12;
            nVar = nVar2;
            mVar = mVar2;
        }
    }

    public static boolean f(InterfaceC5269e interfaceC5269e) {
        try {
            return interfaceC5269e.d();
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            return true;
        }
    }

    public static <T> void g(Subscriber<? super T> subscriber, Queue<T> queue, AtomicLong atomicLong, InterfaceC5269e interfaceC5269e) {
        long j10;
        long j11;
        if (queue.isEmpty()) {
            subscriber.onComplete();
            return;
        }
        if (h(atomicLong.get(), subscriber, queue, atomicLong, interfaceC5269e)) {
            return;
        }
        do {
            j10 = atomicLong.get();
            if ((j10 & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j11 = j10 | Long.MIN_VALUE;
            }
        } while (!atomicLong.compareAndSet(j10, j11));
        if (j10 != 0) {
            h(j11, subscriber, queue, atomicLong, interfaceC5269e);
        }
    }

    public static <T> boolean h(long j10, Subscriber<? super T> subscriber, Queue<T> queue, AtomicLong atomicLong, InterfaceC5269e interfaceC5269e) {
        long j11 = j10 & Long.MIN_VALUE;
        while (true) {
            if (j11 != j10) {
                if (f(interfaceC5269e)) {
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
                if (f(interfaceC5269e)) {
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

    public static <T> boolean i(long j10, Subscriber<? super T> subscriber, Queue<T> queue, AtomicLong atomicLong, InterfaceC5269e interfaceC5269e) {
        long j11;
        do {
            j11 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j11, b.c(Long.MAX_VALUE & j11, j10) | (j11 & Long.MIN_VALUE)));
        if (j11 != Long.MIN_VALUE) {
            return false;
        }
        h(j10 | Long.MIN_VALUE, subscriber, queue, atomicLong, interfaceC5269e);
        return true;
    }

    public static void j(Subscription subscription, int i10) {
        subscription.request(i10 < 0 ? Long.MAX_VALUE : i10);
    }
}
