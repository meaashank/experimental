package com.bytedance.adsdk.ZRu.NOt.TFq.ZRu;

import B3.a;

/* JADX INFO: loaded from: classes2.dex */
public class mZ {
    private static Object ZRu(int i10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(i10 > number.intValue());
        }
        if (number instanceof Long) {
            return Boolean.valueOf(((long) i10) > number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) i10) > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) i10) > number.doubleValue());
        }
        throw new UnsupportedOperationException(a.a(number, "This type of addition operation is not supported"));
    }

    private static Object ZRu(long j10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(j10 > ((long) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(j10 > number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) j10) > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) j10) > number.doubleValue());
        }
        throw new UnsupportedOperationException(a.a(number, "This type of addition operation is not supported"));
    }

    private static Object ZRu(float f10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(f10 > ((float) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(f10 > ((float) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(f10 > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) f10) > number.doubleValue());
        }
        throw new UnsupportedOperationException(a.a(number, "This type of addition operation is not supported"));
    }

    private static Object ZRu(double d10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(d10 > ((double) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(d10 > ((double) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(d10 > ((double) number.floatValue()));
        }
        if (number instanceof Double) {
            return Boolean.valueOf(d10 > number.doubleValue());
        }
        throw new UnsupportedOperationException(a.a(number, "This type of addition operation is not supported"));
    }

    public static Object ZRu(Object obj, Number number) {
        if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
            if (obj instanceof Long) {
                return ZRu(((Long) obj).longValue(), number);
            }
            if (obj instanceof Float) {
                return ZRu(((Float) obj).floatValue(), number);
            }
            if (obj instanceof Double) {
                return ZRu(((Double) obj).doubleValue(), number);
            }
            if (obj instanceof String) {
                try {
                    return ZRu(Float.parseFloat((String) obj), number);
                } catch (NumberFormatException unused) {
                    throw new UnsupportedOperationException(obj.getClass().getName().concat("This type of addition operation is not supported"));
                }
            }
            throw new UnsupportedOperationException(obj.getClass().getName().concat("This type of addition operation is not supported"));
        }
        return ZRu(((Number) obj).intValue(), number);
    }
}
