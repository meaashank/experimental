package com.bykv.vk.openvk.preload.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f140393a;

    public m(Boolean bool) {
        this.f140393a = com.bykv.vk.openvk.preload.falconx.a.a.a(bool);
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final Number a() {
        Object obj = this.f140393a;
        return obj instanceof String ? new com.bykv.vk.openvk.preload.a.b.f((String) obj) : (Number) obj;
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final String b() {
        Object obj = this.f140393a;
        return obj instanceof Number ? a().toString() : obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj;
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final double c() {
        return this.f140393a instanceof Number ? a().doubleValue() : Double.parseDouble(b());
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final long d() {
        return this.f140393a instanceof Number ? a().longValue() : Long.parseLong(b());
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final int e() {
        return this.f140393a instanceof Number ? a().intValue() : Integer.parseInt(b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f140393a == null) {
            return mVar.f140393a == null;
        }
        if (a(this) && a(mVar)) {
            return a().longValue() == mVar.a().longValue();
        }
        Object obj2 = this.f140393a;
        if (!(obj2 instanceof Number) || !(mVar.f140393a instanceof Number)) {
            return obj2.equals(mVar.f140393a);
        }
        double dDoubleValue = a().doubleValue();
        double dDoubleValue2 = mVar.a().doubleValue();
        return dDoubleValue == dDoubleValue2 || (Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2));
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final boolean f() {
        Object obj = this.f140393a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(b());
    }

    public final boolean g() {
        return this.f140393a instanceof Boolean;
    }

    public final boolean h() {
        return this.f140393a instanceof Number;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (this.f140393a == null) {
            return 31;
        }
        if (a(this)) {
            jDoubleToLongBits = a().longValue();
        } else {
            Object obj = this.f140393a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(a().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public final boolean i() {
        return this.f140393a instanceof String;
    }

    private static boolean a(m mVar) {
        Object obj = mVar.f140393a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public m(Number number) {
        this.f140393a = com.bykv.vk.openvk.preload.falconx.a.a.a(number);
    }

    public m(String str) {
        this.f140393a = com.bykv.vk.openvk.preload.falconx.a.a.a(str);
    }
}
