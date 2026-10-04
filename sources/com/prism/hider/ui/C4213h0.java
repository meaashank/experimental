package com.prism.hider.ui;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: renamed from: com.prism.hider.ui.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4213h0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f168249b = "ReadOnlyLiveList";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public androidx.lifecycle.K<List<T>>[] f168250a;

    public C4213h0(@NonNull androidx.lifecycle.K<List<T>>[] kArr) {
        this.f168250a = kArr;
    }

    public T a(int i10) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(androidx.collection.N0.a("index ", i10, " < 0"));
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.f168250a.length) {
            int iB = b(i11) + i12;
            if (i10 >= i12 && i10 < iB) {
                return this.f168250a[i11].f().get(i10 - i12);
            }
            i11++;
            i12 = iB;
        }
        StringBuilder sbA = android.support.v4.media.a.a("index ", i10, " size:");
        sbA.append(c());
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    public final int b(int i10) {
        List<T> listF;
        if (i10 < 0) {
            return 0;
        }
        androidx.lifecycle.K<List<T>>[] kArr = this.f168250a;
        if (i10 >= kArr.length || (listF = kArr[i10].f()) == null) {
            return 0;
        }
        return listF.size();
    }

    public int c() {
        int iB = 0;
        for (int i10 = 0; i10 < this.f168250a.length; i10++) {
            iB += b(i10);
        }
        return iB;
    }
}
