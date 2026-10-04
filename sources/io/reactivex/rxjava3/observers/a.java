package io.reactivex.rxjava3.observers;

import Bc.r;
import C4.q;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.VolatileSizeArrayList;
import io.reactivex.rxjava3.observers.a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T, U extends a<T, U>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f211963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f211964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f211965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f211966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f211967h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<T> f211961b = new VolatileSizeArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Throwable> f211962c = new VolatileSizeArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f211960a = new CountDownLatch(1);

    @yc.e
    public static String z(@yc.f Object o10) {
        if (o10 == null) {
            return "null";
        }
        return o10 + " (class: " + o10.getClass().getSimpleName() + ")";
    }

    @yc.e
    public final List<T> A() {
        return this.f211961b;
    }

    @yc.e
    public final U B(@yc.f CharSequence tag) {
        this.f211966g = tag;
        return this;
    }

    @yc.e
    public final U a() {
        long j10 = this.f211963d;
        if (j10 == 0) {
            throw y("Not completed");
        }
        if (j10 <= 1) {
            return this;
        }
        throw y("Multiple completions: " + j10);
    }

    @yc.e
    public final U b() {
        U u10 = (U) l();
        u10.q(0);
        u10.g();
        u10.i();
        return u10;
    }

    @yc.e
    public final U c(@yc.e r<Throwable> errorPredicate) {
        int size = this.f211962c.size();
        if (size == 0) {
            throw y("No errors");
        }
        Iterator<Throwable> it = this.f211962c.iterator();
        while (it.hasNext()) {
            try {
                if (errorPredicate.test(it.next())) {
                    if (size == 1) {
                        return this;
                    }
                    throw y("Error present but other errors as well");
                }
            } catch (Throwable th) {
                throw ExceptionHelper.i(th);
            }
        }
        throw y("Error not present");
    }

    @yc.e
    public final U d(@yc.e Class<? extends Throwable> errorClass) {
        c(new Functions.n(errorClass));
        return this;
    }

    public abstract void dispose();

    @yc.e
    public final U e(@yc.e Throwable error) {
        c(new Functions.s(error));
        return this;
    }

    @SafeVarargs
    @yc.e
    public final U f(@yc.e Class<? extends Throwable> cls, @yc.e T... tArr) {
        U u10 = (U) l();
        u10.s(tArr);
        u10.d(cls);
        u10.i();
        return u10;
    }

    @yc.e
    public final U g() {
        if (this.f211962c.size() == 0) {
            return this;
        }
        throw y("Error(s) present: " + this.f211962c);
    }

    @yc.e
    public final U h() {
        q(0);
        return this;
    }

    @yc.e
    public final U i() {
        long j10 = this.f211963d;
        if (j10 == 1) {
            throw y("Completed!");
        }
        if (j10 <= 1) {
            return this;
        }
        throw y("Multiple completions: " + j10);
    }

    public abstract boolean isDisposed();

    @SafeVarargs
    @yc.e
    public final U k(@yc.e T... tArr) {
        U u10 = (U) l();
        u10.s(tArr);
        u10.g();
        u10.a();
        return u10;
    }

    @yc.e
    public abstract U l();

    @yc.e
    public final U m(@yc.e r<T> valuePredicate) {
        o(0, valuePredicate);
        if (this.f211961b.size() <= 1) {
            return this;
        }
        throw y("Value present but other values as well");
    }

    @yc.e
    public final U n(@yc.e T value) {
        if (this.f211961b.size() != 1) {
            throw y("expected: " + z(value) + " but was: " + this.f211961b);
        }
        T t10 = this.f211961b.get(0);
        if (Objects.equals(value, t10)) {
            return this;
        }
        throw y("expected: " + z(value) + " but was: " + z(t10));
    }

    @yc.e
    public final U o(int index, @yc.e r<T> valuePredicate) {
        if (this.f211961b.size() == 0) {
            throw y("No values");
        }
        if (index >= this.f211961b.size()) {
            throw y("Invalid index: " + index);
        }
        try {
            if (valuePredicate.test(this.f211961b.get(index))) {
                return this;
            }
            throw y("Value not present");
        } catch (Throwable th) {
            throw ExceptionHelper.i(th);
        }
    }

    @yc.e
    public final U p(int index, @yc.e T value) {
        int size = this.f211961b.size();
        if (size == 0) {
            throw y("No values");
        }
        if (index >= size) {
            throw y("Invalid index: " + index);
        }
        T t10 = this.f211961b.get(index);
        if (Objects.equals(value, t10)) {
            return this;
        }
        throw y("expected: " + z(value) + " but was: " + z(t10));
    }

    @yc.e
    public final U q(int count) {
        int size = this.f211961b.size();
        if (size == count) {
            return this;
        }
        throw y("Value counts differ; expected: " + count + " but was: " + size);
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
    
        throw y("Fewer values received than expected (" + r1 + ")");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        throw y("More values received than expected (" + r1 + ")");
     */
    @yc.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final U r(@yc.e java.lang.Iterable<? extends T> r6) {
        /*
            r5 = this;
            java.util.List<T> r0 = r5.f211961b
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
            boolean r4 = java.util.Objects.equals(r2, r3)
            if (r4 == 0) goto L29
            int r1 = r1 + 1
            goto Lb
        L29:
            java.lang.String r6 = "Values at position "
            java.lang.String r0 = " differ; expected: "
            java.lang.StringBuilder r6 = android.support.v4.media.a.a(r6, r1, r0)
            java.lang.String r0 = z(r2)
            r6.append(r0)
            java.lang.String r0 = " but was: "
            r6.append(r0)
            java.lang.String r0 = z(r3)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.AssertionError r6 = r5.y(r6)
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
            java.lang.AssertionError r6 = r5.y(r6)
            throw r6
        L6a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "More values received than expected ("
            r0.<init>(r2)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.AssertionError r6 = r5.y(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.observers.a.r(java.lang.Iterable):io.reactivex.rxjava3.observers.a");
    }

    @SafeVarargs
    @yc.e
    public final U s(@yc.e T... values) {
        int size = this.f211961b.size();
        if (size != values.length) {
            throw y("Value count differs; expected: " + values.length + q.f17581a + Arrays.toString(values) + " but was: " + size + q.f17581a + this.f211961b);
        }
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = this.f211961b.get(i10);
            T t11 = values[i10];
            if (!Objects.equals(t11, t10)) {
                StringBuilder sbA = android.support.v4.media.a.a("Values at position ", i10, " differ; expected: ");
                sbA.append(z(t11));
                sbA.append(" but was: ");
                sbA.append(z(t10));
                throw y(sbA.toString());
            }
        }
        return this;
    }

    @SafeVarargs
    @yc.e
    public final U t(@yc.e T... tArr) {
        U u10 = (U) l();
        u10.s(tArr);
        u10.g();
        u10.i();
        return u10;
    }

    @yc.e
    public final U u() throws InterruptedException {
        if (this.f211960a.getCount() == 0) {
            return this;
        }
        this.f211960a.await();
        return this;
    }

    public final boolean v(long time, @yc.e TimeUnit unit) throws InterruptedException {
        boolean z10 = this.f211960a.getCount() == 0 || this.f211960a.await(time, unit);
        this.f211967h = !z10;
        return z10;
    }

    @yc.e
    public final U w(int atLeast) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (System.currentTimeMillis() - jCurrentTimeMillis < 5000) {
            if (this.f211960a.getCount() == 0 || this.f211961b.size() >= atLeast) {
                return this;
            }
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e10) {
                throw new RuntimeException(e10);
            }
        }
        this.f211967h = true;
        return this;
    }

    @yc.e
    public final U x(long time, @yc.e TimeUnit unit) {
        try {
            if (this.f211960a.await(time, unit)) {
                return this;
            }
            this.f211967h = true;
            dispose();
            return this;
        } catch (InterruptedException e10) {
            dispose();
            throw ExceptionHelper.i(e10);
        }
    }

    @yc.e
    public final AssertionError y(@yc.e String message) {
        StringBuilder sb2 = new StringBuilder(message.length() + 64);
        sb2.append(message);
        sb2.append(" (latch = ");
        sb2.append(this.f211960a.getCount());
        sb2.append(", values = ");
        sb2.append(this.f211961b.size());
        sb2.append(", errors = ");
        sb2.append(this.f211962c.size());
        sb2.append(", completions = ");
        sb2.append(this.f211963d);
        if (this.f211967h) {
            sb2.append(", timeout!");
        }
        if (isDisposed()) {
            sb2.append(", disposed!");
        }
        CharSequence charSequence = this.f211966g;
        if (charSequence != null) {
            sb2.append(", tag = ");
            sb2.append(charSequence);
        }
        sb2.append(')');
        AssertionError assertionError = new AssertionError(sb2.toString());
        if (!this.f211962c.isEmpty()) {
            if (this.f211962c.size() == 1) {
                assertionError.initCause(this.f211962c.get(0));
                return assertionError;
            }
            assertionError.initCause(new CompositeException(this.f211962c));
        }
        return assertionError;
    }
}
