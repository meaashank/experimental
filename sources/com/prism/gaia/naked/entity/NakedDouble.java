package com.prism.gaia.naked.entity;

import com.android.launcher3.IconCache;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.gaia.naked.utils.NakedUtils;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class NakedDouble {
    private static final String TAG = "asdf-".concat("NakedDouble");
    private final Field field;

    public NakedDouble(Class<?> cls, Field field) {
        Field field2 = NakedUtils.getField(cls, field.getName(), true);
        this.field = field2;
        if (field2 != null) {
            field2.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedDouble failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + field.getName());
    }

    public static double getSafe(Object obj, NakedDouble nakedDouble) {
        if (obj != null && nakedDouble != null) {
            try {
                return nakedDouble.field.getDouble(obj);
            } catch (Exception e10) {
                NakedUtils.getFieldDescStr(nakedDouble.field);
                obj.toString();
                e10.getMessage();
            }
        }
        return 0.0d;
    }

    public static void setSafe(Object obj, NakedDouble nakedDouble, double d10) {
        if (obj == null || nakedDouble == null) {
            return;
        }
        try {
            nakedDouble.field.setDouble(obj, d10);
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedDouble.field);
            obj.toString();
            e10.getMessage();
        }
    }

    public double get(Object obj) {
        try {
            return this.field.getDouble(obj);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
            return 0.0d;
        }
    }

    public void set(Object obj, double d10) {
        try {
            this.field.setDouble(obj, d10);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
        }
    }

    public NakedDouble(Class<?> cls, String str) {
        Field field = NakedUtils.getField(cls, str, true);
        this.field = field;
        if (field != null) {
            field.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedDouble failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + str);
    }
}
