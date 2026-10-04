package io.reactivex.rxjava3.internal.util;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f211943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f211944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f211945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f211946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f211947e;

    public h(int capacityHint) {
        this.f211943a = capacityHint;
    }

    public void a(Object o10) {
        if (this.f211946d == 0) {
            Object[] objArr = new Object[this.f211943a + 1];
            this.f211944b = objArr;
            this.f211945c = objArr;
            objArr[0] = o10;
            this.f211947e = 1;
            this.f211946d = 1;
            return;
        }
        int i10 = this.f211947e;
        int i11 = this.f211943a;
        if (i10 != i11) {
            this.f211945c[i10] = o10;
            this.f211947e = i10 + 1;
            this.f211946d++;
        } else {
            Object[] objArr2 = new Object[i11 + 1];
            objArr2[0] = o10;
            this.f211945c[i11] = objArr2;
            this.f211945c = objArr2;
            this.f211947e = 1;
            this.f211946d++;
        }
    }

    public Object[] b() {
        return this.f211944b;
    }

    public int c() {
        return this.f211946d;
    }

    public String toString() {
        int i10 = this.f211943a;
        int i11 = this.f211946d;
        ArrayList arrayList = new ArrayList(i11 + 1);
        Object[] objArrB = b();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            arrayList.add(objArrB[i13]);
            i12++;
            i13++;
            if (i13 == i10) {
                objArrB = (Object[]) objArrB[i10];
                i13 = 0;
            }
        }
        return arrayList.toString();
    }
}
