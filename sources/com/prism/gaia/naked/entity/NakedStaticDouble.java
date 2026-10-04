package com.prism.gaia.naked.entity;

import com.android.launcher3.IconCache;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.gaia.naked.utils.NakedUtils;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class NakedStaticDouble {
    private static final String TAG = "asdf-".concat("NakedStaticDouble");
    private final Field field;

    public NakedStaticDouble(Class cls, Field field) {
        Field field2 = NakedUtils.getField(cls, field.getName(), true);
        this.field = field2;
        if (field2 != null) {
            field2.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedStaticDouble failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + field.getName());
    }

    public static Double getSafe(NakedStaticDouble nakedStaticDouble) {
        if (nakedStaticDouble == null) {
            return null;
        }
        try {
            return Double.valueOf(nakedStaticDouble.field.getDouble(null));
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedStaticDouble.field);
            e10.getMessage();
            return Double.valueOf(0.0d);
        }
    }

    public static void setSafe(NakedStaticDouble nakedStaticDouble, double d10) {
        if (nakedStaticDouble == null) {
            return;
        }
        try {
            nakedStaticDouble.field.setDouble(null, d10);
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedStaticDouble.field);
            e10.getMessage();
        }
    }

    public double get() {
        try {
            return this.field.getDouble(null);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
            return 0.0d;
        }
    }

    public void set(double d10) {
        try {
            this.field.setDouble(null, d10);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
        }
    }

    public NakedStaticDouble(Class<?> cls, String str) {
        Field field = NakedUtils.getField(cls, str, true);
        this.field = field;
        if (field != null) {
            field.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedStaticDouble failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + str);
    }
}
