package io.reactivex.internal.util;

import nc.InterfaceC5268d;
import nc.r;

/* JADX INFO: loaded from: classes7.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f207188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f207189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f207190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f207191d;

    /* JADX INFO: renamed from: io.reactivex.internal.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC0777a<T> extends r<T> {
        @Override // nc.r
        boolean test(T t10);
    }

    public a(int i10) {
        this.f207188a = i10;
        Object[] objArr = new Object[i10 + 1];
        this.f207189b = objArr;
        this.f207190c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <U> boolean a(hc.G<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f207189b
            int r1 = r4.f207188a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = io.reactivex.internal.util.NotificationLite.acceptFull(r3, r5)
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
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.a.a(hc.G):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <U> boolean b(org.reactivestreams.Subscriber<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f207189b
            int r1 = r4.f207188a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = io.reactivex.internal.util.NotificationLite.acceptFull(r3, r5)
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
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.a.b(org.reactivestreams.Subscriber):boolean");
    }

    public void c(T t10) {
        int i10 = this.f207188a;
        int i11 = this.f207191d;
        if (i11 == i10) {
            Object[] objArr = new Object[i10 + 1];
            this.f207190c[i10] = objArr;
            this.f207190c = objArr;
            i11 = 0;
        }
        this.f207190c[i11] = t10;
        this.f207191d = i11 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(io.reactivex.internal.util.a.InterfaceC0777a<? super T> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f207189b
            int r1 = r4.f207188a
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
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.a.d(io.reactivex.internal.util.a$a):void");
    }

    public <S> void e(S s10, InterfaceC5268d<? super S, ? super T> interfaceC5268d) throws Exception {
        Object[] objArr = this.f207189b;
        int i10 = this.f207188a;
        while (true) {
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = objArr[i11];
                if (obj == null || interfaceC5268d.test(s10, obj)) {
                    return;
                }
            }
            objArr = (Object[]) objArr[i10];
        }
    }

    public void f(T t10) {
        this.f207189b[0] = t10;
    }
}
