package com.mbridge.msdk.tracker.network.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Comparator<byte[]> f160053e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<byte[]> f160054a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<byte[]> f160055b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f160056c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f160057d;

    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public c(int i10) {
        this.f160057d = i10;
    }

    public synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f160055b.size(); i11++) {
            byte[] bArr = this.f160055b.get(i11);
            if (bArr.length >= i10) {
                this.f160056c -= bArr.length;
                this.f160055b.remove(i11);
                this.f160054a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f160057d) {
                this.f160054a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f160055b, bArr, f160053e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f160055b.add(iBinarySearch, bArr);
                this.f160056c += bArr.length;
                a();
            }
        }
    }

    private synchronized void a() {
        while (this.f160056c > this.f160057d) {
            byte[] bArrRemove = this.f160054a.remove(0);
            this.f160055b.remove(bArrRemove);
            this.f160056c -= bArrRemove.length;
        }
    }
}
