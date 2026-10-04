package com.prism.gaia.naked.entity;

import com.android.launcher3.IconCache;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.gaia.naked.utils.NakedUtils;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class NakedStaticInt {
    private static final String TAG = "asdf-".concat("NakedStaticInt");
    private final Field field;

    public NakedStaticInt(Class<?> cls, Field field) {
        Field field2 = NakedUtils.getField(cls, field.getName(), true);
        this.field = field2;
        if (field2 != null) {
            field2.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedStaticInt failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + field.getName());
    }

    public static Integer getSafe(NakedStaticInt nakedStaticInt) {
        if (nakedStaticInt == null) {
            return null;
        }
        try {
            return Integer.valueOf(nakedStaticInt.field.getInt(null));
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedStaticInt.field);
            e10.getMessage();
            return 0;
        }
    }

    public static void setSafe(NakedStaticInt nakedStaticInt, int i10) {
        if (nakedStaticInt == null) {
            return;
        }
        try {
            nakedStaticInt.field.setInt(null, i10);
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedStaticInt.field);
            e10.getMessage();
        }
    }

    public int get() {
        try {
            return this.field.getInt(null);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
            return 0;
        }
    }

    public void set(int i10) {
        try {
            this.field.setInt(null, i10);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
        }
    }

    public static int getSafe(NakedStaticInt nakedStaticInt, int i10) {
        if (nakedStaticInt == null) {
            return i10;
        }
        try {
            return nakedStaticInt.field.getInt(null);
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedStaticInt.field);
            e10.getMessage();
            return 0;
        }
    }

    public NakedStaticInt(Class<?> cls, String str) {
        Field field = NakedUtils.getField(cls, str, true);
        this.field = field;
        if (field != null) {
            field.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedStaticInt failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + str);
    }
}
