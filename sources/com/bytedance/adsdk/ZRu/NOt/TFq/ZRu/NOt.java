package com.bytedance.adsdk.ZRu.NOt.TFq.ZRu;

import B3.a;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    private static boolean ZRu(int i10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return i10 == number.intValue();
        }
        if (number instanceof Long) {
            return ((long) i10) == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) i10) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) i10) == number.doubleValue();
        }
        throw new UnsupportedOperationException(a.a(number, "This type of addition operation is not supported"));
    }

    private static boolean ZRu(long j10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return j10 == ((long) number.intValue());
        }
        if (number instanceof Long) {
            return j10 == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) j10) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) j10) == number.doubleValue();
        }
        throw new UnsupportedOperationException(a.a(number, "This type of addition operation is not supported"));
    }

    private static boolean ZRu(float f10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return f10 == ((float) number.intValue());
        }
        if (number instanceof Long) {
            return f10 == ((float) number.longValue());
        }
        if (number instanceof Float) {
            return f10 == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) f10) == number.doubleValue();
        }
        throw new UnsupportedOperationException(a.a(number, "This type of addition operation is not supported"));
    }

    private static boolean ZRu(double d10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return d10 == ((double) number.intValue());
        }
        if (number instanceof Long) {
            return d10 == ((double) number.longValue());
        }
        if (number instanceof Float) {
            return d10 == ((double) number.floatValue());
        }
        if (number instanceof Double) {
            return d10 == number.doubleValue();
        }
        throw new UnsupportedOperationException(a.a(number, "This type of addition operation is not supported"));
    }

    public static boolean ZRu(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return ZRu(number.longValue(), number2);
            }
            if (number instanceof Float) {
                return ZRu(number.floatValue(), number2);
            }
            if (number instanceof Double) {
                return ZRu(number.doubleValue(), number2);
            }
            throw new UnsupportedOperationException(a.a(number, "This type of addition operation is not supported"));
        }
        return ZRu(number.intValue(), number2);
    }
}
