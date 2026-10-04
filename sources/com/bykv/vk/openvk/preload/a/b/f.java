package com.bykv.vk.openvk.preload.a.b;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f140278a;

    public f(String str) {
        this.f140278a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f140278a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f140278a;
        String str2 = ((f) obj).f140278a;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f140278a);
    }

    public final int hashCode() {
        return this.f140278a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f140278a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f140278a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f140278a).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f140278a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f140278a).longValue();
        }
    }

    public final String toString() {
        return this.f140278a;
    }
}
