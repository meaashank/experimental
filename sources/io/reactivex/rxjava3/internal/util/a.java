package io.reactivex.rxjava3.internal.util;

import Bc.r;

/* JADX INFO: loaded from: classes7.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f211937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f211938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f211939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f211940d;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC0794a<T> extends r<T> {
        @Override // Bc.r
        boolean test(T t10);
    }

    public a(int capacity) {
        this.f211937a = capacity;
        Object[] objArr = new Object[capacity + 1];
        this.f211938b = objArr;
        this.f211939c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <U> boolean a(org.reactivestreams.Subscriber<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f211938b
            int r1 = r4.f211937a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = io.reactivex.rxjava3.internal.util.NotificationLite.acceptFull(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.util.a.a(org.reactivestreams.Subscriber):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <U> boolean b(zc.V<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f211938b
            int r1 = r4.f211937a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = io.reactivex.rxjava3.internal.util.NotificationLite.acceptFull(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.util.a.b(zc.V):boolean");
    }

    public void c(T value) {
        int i10 = this.f211937a;
        int i11 = this.f211940d;
        if (i11 == i10) {
            Object[] objArr = new Object[i10 + 1];
            this.f211939c[i10] = objArr;
            this.f211939c = objArr;
            i11 = 0;
        }
        this.f211939c[i11] = value;
        this.f211940d = i11 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(io.reactivex.rxjava3.internal.util.a.InterfaceC0794a<? super T> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f211938b
            int r1 = r4.f211937a
        L4:
            if (r0 == 0) goto L1d
            r2 = 0
        L7:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L18
        Le:
            boolean r3 = r5.test(r3)
            if (r3 == 0) goto L15
            goto L1d
        L15:
            int r2 = r2 + 1
            goto L7
        L18:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.util.a.d(io.reactivex.rxjava3.internal.util.a$a):void");
    }

    public <S> void e(S state, Bc.d<? super S, ? super T> consumer) throws Throwable {
        Object[] objArr = this.f211938b;
        int i10 = this.f211937a;
        while (true) {
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = objArr[i11];
                if (obj == null || consumer.test(state, obj)) {
                    return;
                }
            }
            objArr = (Object[]) objArr[i10];
        }
    }

    public void f(T value) {
        this.f211938b[0] = value;
    }
}
