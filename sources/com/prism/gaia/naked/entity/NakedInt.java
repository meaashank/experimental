package com.prism.gaia.naked.entity;

import com.android.launcher3.IconCache;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.gaia.naked.utils.NakedUtils;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class NakedInt {
    private static final String TAG = "asdf-".concat("NakedInt");
    private final Field field;

    public NakedInt(Class<?> cls, Field field) {
        Field field2 = NakedUtils.getField(cls, field.getName(), true);
        this.field = field2;
        if (field2 != null) {
            field2.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedInt failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + field.getName());
    }

    public static Integer getSafe(Object obj, NakedInt nakedInt) {
        if (obj == null || nakedInt == null) {
            return null;
        }
        try {
            return Integer.valueOf(nakedInt.field.getInt(obj));
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedInt.field);
            obj.toString();
            e10.getMessage();
            return 0;
        }
    }

    public static void setSafe(Object obj, NakedInt nakedInt, int i10) {
        if (obj == null || nakedInt == null) {
            return;
        }
        try {
            nakedInt.field.setInt(obj, i10);
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedInt.field);
            obj.toString();
            e10.getMessage();
        }
    }

    public int get(Object obj) {
        try {
            return this.field.getInt(obj);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
            return 0;
        }
    }

    public void set(Object obj, int i10) {
        try {
            this.field.setInt(obj, i10);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
        }
    }

    public NakedInt(Class<?> cls, String str) {
        Field field = NakedUtils.getField(cls, str, true);
        this.field = field;
        if (field != null) {
            field.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedInt failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + str);
    }
}
