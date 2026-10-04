package io.reactivex.internal.util;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f207194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f207195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f207196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f207197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f207198e;

    public h(int i10) {
        this.f207194a = i10;
    }

    public void a(Object obj) {
        if (this.f207197d == 0) {
            Object[] objArr = new Object[this.f207194a + 1];
            this.f207195b = objArr;
            this.f207196c = objArr;
            objArr[0] = obj;
            this.f207198e = 1;
            this.f207197d = 1;
            return;
        }
        int i10 = this.f207198e;
        int i11 = this.f207194a;
        if (i10 != i11) {
            this.f207196c[i10] = obj;
            this.f207198e = i10 + 1;
            this.f207197d++;
        } else {
            Object[] objArr2 = new Object[i11 + 1];
            objArr2[0] = obj;
            this.f207196c[i11] = objArr2;
            this.f207196c = objArr2;
            this.f207198e = 1;
            this.f207197d++;
        }
    }

    public Object[] b() {
        return this.f207195b;
    }

    public int c() {
        return this.f207197d;
    }

    public String toString() {
        int i10 = this.f207194a;
        int i11 = this.f207197d;
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
