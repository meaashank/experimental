package io.reactivex.observers;

import C4.q;
import hc.y;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.VolatileSizeArrayList;
import io.reactivex.observers.BaseTestConsumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import nc.r;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseTestConsumer<T, U extends BaseTestConsumer<T, U>> implements io.reactivex.disposables.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f207212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f207213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f207214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f207215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f207216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f207217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f207218j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<T> f207210b = new VolatileSizeArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Throwable> f207211c = new VolatileSizeArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f207209a = new CountDownLatch(1);

    public enum TestWaitStrategy implements Runnable {
        SPIN { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.1
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
            }
        },
        YIELD { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.2
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                Thread.yield();
            }
        },
        SLEEP_1MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.3
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(1);
            }
        },
        SLEEP_10MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.4
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(10);
            }
        },
        SLEEP_100MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.5
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(100);
            }
        },
        SLEEP_1000MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.6
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(1000);
            }
        };

        public static void sleep(int i10) {
            try {
                Thread.sleep(i10);
            } catch (InterruptedException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // java.lang.Runnable
        public abstract void run();
    }

    public static String Y(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj + " (class: " + obj.getClass().getSimpleName() + ")";
    }

    public final U A(int i10) {
        int size = this.f207210b.size();
        if (size == i10) {
            return this;
        }
        throw T("Value counts differ; Expected: " + i10 + ", Actual: " + size);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r3 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r2 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        throw T("Fewer values received than expected (" + r1 + ")");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        throw T("More values received than expected (" + r1 + ")");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final U B(java.lang.Iterable<? extends T> r6) {
        /*
            r5 = this;
            java.util.List<T> r0 = r5.f207210b
            java.util.Iterator r0 = r0.iterator()
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
        Lb:
            boolean r2 = r6.hasNext()
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L4d
            if (r2 != 0) goto L18
            goto L4d
        L18:
            java.lang.Object r2 = r6.next()
            java.lang.Object r3 = r0.next()
            boolean r4 = io.reactivex.internal.functions.a.c(r2, r3)
            if (r4 == 0) goto L29
            int r1 = r1 + 1
            goto Lb
        L29:
            java.lang.String r6 = "Values at position "
            java.lang.String r0 = " differ; Expected: "
            java.lang.StringBuilder r6 = android.support.v4.media.a.a(r6, r1, r0)
            java.lang.String r0 = Y(r2)
            r6.append(r0)
            java.lang.String r0 = ", Actual: "
            r6.append(r0)
            java.lang.String r0 = Y(r3)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.AssertionError r6 = r5.T(r6)
            throw r6
        L4d:
            java.lang.String r6 = ")"
            if (r3 != 0) goto L6a
            if (r2 != 0) goto L54
            return r5
        L54:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Fewer values received than expected ("
            r0.<init>(r2)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.AssertionError r6 = r5.T(r6)
            throw r6
        L6a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "More values received than expected ("
            r0.<init>(r2)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.AssertionError r6 = r5.T(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.observers.BaseTestConsumer.B(java.lang.Iterable):io.reactivex.observers.BaseTestConsumer");
    }

    public final U C(Iterable<? extends T> iterable) {
        U u10 = (U) t();
        u10.B(iterable);
        u10.m();
        u10.p();
        return u10;
    }

    public final U D(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            A(0);
            return this;
        }
        for (T t10 : this.f207210b) {
            if (!collection.contains(t10)) {
                throw T("Value not in the expected collection: " + Y(t10));
            }
        }
        return this;
    }

    public final U E(Collection<? extends T> collection) {
        U u10 = (U) t();
        u10.D(collection);
        u10.m();
        u10.p();
        return u10;
    }

    public final U F(T... tArr) {
        int size = this.f207210b.size();
        if (size != tArr.length) {
            throw T("Value count differs; Expected: " + tArr.length + q.f17581a + Arrays.toString(tArr) + ", Actual: " + size + q.f17581a + this.f207210b);
        }
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = this.f207210b.get(i10);
            T t11 = tArr[i10];
            if (!io.reactivex.internal.functions.a.c(t11, t10)) {
                StringBuilder sbA = android.support.v4.media.a.a("Values at position ", i10, " differ; Expected: ");
                sbA.append(Y(t11));
                sbA.append(", Actual: ");
                sbA.append(Y(t10));
                throw T(sbA.toString());
            }
        }
        return this;
    }

    public final U G(T... tArr) {
        U u10 = (U) t();
        u10.F(tArr);
        u10.m();
        u10.p();
        return u10;
    }

    public final U H() throws InterruptedException {
        if (this.f207209a.getCount() == 0) {
            return this;
        }
        this.f207209a.await();
        return this;
    }

    public final boolean I(long j10, TimeUnit timeUnit) throws InterruptedException {
        boolean z10 = this.f207209a.getCount() == 0 || this.f207209a.await(j10, timeUnit);
        this.f207218j = !z10;
        return z10;
    }

    public final U J(int i10) {
        L(i10, TestWaitStrategy.SLEEP_10MS, 5000L);
        return this;
    }

    public final U K(int i10, Runnable runnable) {
        L(i10, runnable, 5000L);
        return this;
    }

    public final U L(int i10, Runnable runnable, long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (true) {
            if (j10 > 0 && System.currentTimeMillis() - jCurrentTimeMillis >= j10) {
                this.f207218j = true;
                return this;
            }
            if (this.f207209a.getCount() == 0 || this.f207210b.size() >= i10) {
                break;
            }
            runnable.run();
        }
        return this;
    }

    public final U M(long j10, TimeUnit timeUnit) {
        try {
            if (this.f207209a.await(j10, timeUnit)) {
                return this;
            }
            this.f207218j = true;
            dispose();
            return this;
        } catch (InterruptedException e10) {
            dispose();
            throw ExceptionHelper.e(e10);
        }
    }

    public final boolean N() {
        try {
            H();
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final boolean O(long j10, TimeUnit timeUnit) {
        try {
            return I(j10, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final U P() {
        this.f207218j = false;
        return this;
    }

    public final long Q() {
        return this.f207212d;
    }

    public final int R() {
        return this.f207211c.size();
    }

    public final List<Throwable> S() {
        return this.f207211c;
    }

    public final AssertionError T(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 64);
        sb2.append(str);
        sb2.append(" (latch = ");
        sb2.append(this.f207209a.getCount());
        sb2.append(", values = ");
        sb2.append(this.f207210b.size());
        sb2.append(", errors = ");
        sb2.append(this.f207211c.size());
        sb2.append(", completions = ");
        sb2.append(this.f207212d);
        if (this.f207218j) {
            sb2.append(", timeout!");
        }
        if (isDisposed()) {
            sb2.append(", disposed!");
        }
        CharSequence charSequence = this.f207217i;
        if (charSequence != null) {
            sb2.append(", tag = ");
            sb2.append(charSequence);
        }
        sb2.append(')');
        AssertionError assertionError = new AssertionError(sb2.toString());
        if (!this.f207211c.isEmpty()) {
            if (this.f207211c.size() == 1) {
                assertionError.initCause(this.f207211c.get(0));
                return assertionError;
            }
            assertionError.initCause(new CompositeException(this.f207211c));
        }
        return assertionError;
    }

    public final List<List<Object>> U() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f207210b);
        arrayList.add(this.f207211c);
        ArrayList arrayList2 = new ArrayList();
        for (long j10 = 0; j10 < this.f207212d; j10++) {
            arrayList2.add(y.f202669b);
        }
        arrayList.add(arrayList2);
        return arrayList;
    }

    public final boolean V() {
        return this.f207209a.getCount() == 0;
    }

    public final boolean W() {
        return this.f207218j;
    }

    public final Thread X() {
        return this.f207213e;
    }

    public final int Z() {
        return this.f207210b.size();
    }

    public final U a() {
        long j10 = this.f207212d;
        if (j10 == 0) {
            throw T("Not completed");
        }
        if (j10 <= 1) {
            return this;
        }
        throw T("Multiple completions: " + j10);
    }

    public final List<T> a0() {
        return this.f207210b;
    }

    public final U b() {
        U u10 = (U) t();
        u10.A(0);
        u10.m();
        u10.p();
        return u10;
    }

    public final U b0(CharSequence charSequence) {
        this.f207217i = charSequence;
        return this;
    }

    public final U c(Class<? extends Throwable> cls) {
        e(new Functions.n(cls));
        return this;
    }

    public final U d(Throwable th) {
        e(new Functions.s(th));
        return this;
    }

    public final U e(r<Throwable> rVar) {
        int size = this.f207211c.size();
        if (size == 0) {
            throw T("No errors");
        }
        Iterator<Throwable> it = this.f207211c.iterator();
        while (it.hasNext()) {
            try {
                if (rVar.test(it.next())) {
                    if (size == 1) {
                        return this;
                    }
                    throw T("Error present but other errors as well");
                }
            } catch (Exception e10) {
                throw ExceptionHelper.e(e10);
            }
        }
        throw T("Error not present");
    }

    public final U f(String str) {
        int size = this.f207211c.size();
        if (size == 0) {
            throw T("No errors");
        }
        if (size != 1) {
            throw T("Multiple errors");
        }
        String message = this.f207211c.get(0).getMessage();
        if (io.reactivex.internal.functions.a.c(str, message)) {
            return this;
        }
        throw T("Error message differs; Expected: " + str + ", Actual: " + message);
    }

    public final U g(Class<? extends Throwable> cls, T... tArr) {
        U u10 = (U) t();
        u10.F(tArr);
        u10.c(cls);
        u10.p();
        return u10;
    }

    public final U h(r<Throwable> rVar, T... tArr) {
        U u10 = (U) t();
        u10.F(tArr);
        u10.e(rVar);
        u10.p();
        return u10;
    }

    public final U i(Class<? extends Throwable> cls, String str, T... tArr) {
        U u10 = (U) t();
        u10.F(tArr);
        u10.c(cls);
        u10.f(str);
        u10.p();
        return u10;
    }

    public final U k(T t10) {
        int size = this.f207210b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (io.reactivex.internal.functions.a.c(this.f207210b.get(i10), t10)) {
                StringBuilder sbA = android.support.v4.media.a.a("Value at position ", i10, " is equal to ");
                sbA.append(Y(t10));
                sbA.append("; Expected them to be different");
                throw T(sbA.toString());
            }
        }
        return this;
    }

    public final U l(r<? super T> rVar) {
        int size = this.f207210b.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                if (rVar.test(this.f207210b.get(i10))) {
                    throw T("Value at position " + i10 + " matches predicate " + rVar.toString() + ", which was not expected.");
                }
            } catch (Exception e10) {
                throw ExceptionHelper.e(e10);
            }
        }
        return this;
    }

    public final U m() {
        if (this.f207211c.size() == 0) {
            return this;
        }
        throw T("Error(s) present: " + this.f207211c);
    }

    public final U n() {
        if (this.f207218j) {
            throw T("Timeout?!");
        }
        return this;
    }

    public final U o() {
        A(0);
        return this;
    }

    public final U p() {
        long j10 = this.f207212d;
        if (j10 == 1) {
            throw T("Completed!");
        }
        if (j10 <= 1) {
            return this;
        }
        throw T("Multiple completions: " + j10);
    }

    public abstract U q();

    public final U r() {
        if (this.f207209a.getCount() != 0) {
            return this;
        }
        throw T("Subscriber terminated!");
    }

    public final U s(T... tArr) {
        U u10 = (U) t();
        u10.F(tArr);
        u10.m();
        u10.a();
        return u10;
    }

    public abstract U t();

    public final U u() {
        if (this.f207209a.getCount() != 0) {
            throw T("Subscriber still running!");
        }
        long j10 = this.f207212d;
        if (j10 > 1) {
            throw T("Terminated with multiple completions: " + j10);
        }
        int size = this.f207211c.size();
        if (size > 1) {
            throw T("Terminated with multiple errors: " + size);
        }
        if (j10 == 0 || size == 0) {
            return this;
        }
        throw T("Terminated with multiple completions and errors: " + j10);
    }

    public final U v() {
        if (this.f207218j) {
            return this;
        }
        throw T("No timeout?!");
    }

    public final U w(T t10) {
        if (this.f207210b.size() != 1) {
            throw T("Expected: " + Y(t10) + ", Actual: " + this.f207210b);
        }
        T t11 = this.f207210b.get(0);
        if (io.reactivex.internal.functions.a.c(t10, t11)) {
            return this;
        }
        throw T("Expected: " + Y(t10) + ", Actual: " + Y(t11));
    }

    public final U x(r<T> rVar) {
        z(0, rVar);
        if (this.f207210b.size() <= 1) {
            return this;
        }
        throw T("Value present but other values as well");
    }

    public final U y(int i10, T t10) {
        int size = this.f207210b.size();
        if (size == 0) {
            throw T("No values");
        }
        if (i10 >= size) {
            throw T("Invalid index: " + i10);
        }
        T t11 = this.f207210b.get(i10);
        if (io.reactivex.internal.functions.a.c(t10, t11)) {
            return this;
        }
        throw T("Expected: " + Y(t10) + ", Actual: " + Y(t11));
    }

    public final U z(int i10, r<T> rVar) {
        if (this.f207210b.size() == 0) {
            throw T("No values");
        }
        if (i10 >= this.f207210b.size()) {
            throw T("Invalid index: " + i10);
        }
        try {
            if (rVar.test(this.f207210b.get(i10))) {
                return this;
            }
            throw T("Value not present");
        } catch (Exception e10) {
            throw ExceptionHelper.e(e10);
        }
    }
}
