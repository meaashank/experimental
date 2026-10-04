package com.inmobi.media;

import androidx.activity.C1477d;

/* JADX INFO: loaded from: classes5.dex */
public final class R9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152412a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f152413b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R9)) {
            return false;
        }
        R9 r92 = (R9) obj;
        return this.f152412a == r92.f152412a && this.f152413b == r92.f152413b;
    }

    public final int hashCode() {
        return this.f152413b + (this.f152412a * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PurchaseData(noOfInAppPurchases=");
        sb2.append(this.f152412a);
        sb2.append(", noOfSubscriptions=");
        return C1477d.a(sb2, this.f152413b, ')');
    }
}
