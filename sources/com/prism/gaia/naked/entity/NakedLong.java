package com.prism.gaia.naked.entity;

import com.android.launcher3.IconCache;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.gaia.naked.utils.NakedUtils;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class NakedLong {
    private static final String TAG = "asdf-".concat("NakedLong");
    private final Field field;

    public NakedLong(Class<?> cls, Field field) throws NoSuchFieldException {
        Field field2 = NakedUtils.getField(cls, field.getName(), true);
        this.field = field2;
        if (field2 != null) {
            field2.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedLong failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + field.getName());
    }

    public static Long getSafe(Object obj, NakedLong nakedLong) {
        if (obj == null || nakedLong == null) {
            return null;
        }
        try {
            return Long.valueOf(nakedLong.field.getLong(obj));
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedLong.field);
            obj.toString();
            e10.getMessage();
            return 0L;
        }
    }

    public static void setSafe(Object obj, NakedLong nakedLong, long j10) {
        if (obj == null || nakedLong == null) {
            return;
        }
        try {
            nakedLong.field.setLong(obj, j10);
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedLong.field);
            obj.toString();
            e10.getMessage();
        }
    }

    public long get(Object obj) {
        try {
            return this.field.getLong(obj);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
            return 0L;
        }
    }

    public void set(Object obj, long j10) {
        try {
            this.field.setLong(obj, j10);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
        }
    }

    public NakedLong(Class<?> cls, String str) throws NoSuchFieldException {
        Field field = NakedUtils.getField(cls, str, true);
        this.field = field;
        if (field != null) {
            field.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedLong failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + str);
    }
}
