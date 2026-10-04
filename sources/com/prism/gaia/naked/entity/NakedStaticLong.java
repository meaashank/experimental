package com.prism.gaia.naked.entity;

import com.android.launcher3.IconCache;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.gaia.naked.utils.NakedUtils;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class NakedStaticLong {
    private static final String TAG = "asdf-".concat("NakedStaticLong");
    private final Field field;

    public NakedStaticLong(Class cls, Field field) {
        Field field2 = NakedUtils.getField(cls, field.getName(), true);
        this.field = field2;
        if (field2 != null) {
            field2.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedStaticLong failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + field.getName());
    }

    public static Long getSafe(NakedStaticLong nakedStaticLong) {
        if (nakedStaticLong == null) {
            return null;
        }
        try {
            return Long.valueOf(nakedStaticLong.field.getLong(null));
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedStaticLong.field);
            e10.getMessage();
            return 0L;
        }
    }

    public static void setSafe(NakedStaticLong nakedStaticLong, long j10) {
        if (nakedStaticLong == null) {
            return;
        }
        try {
            nakedStaticLong.field.setLong(null, j10);
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedStaticLong.field);
            e10.getMessage();
        }
    }

    public long get() {
        try {
            return this.field.getLong(null);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
            return 0L;
        }
    }

    public void set(long j10) {
        try {
            this.field.setLong(null, j10);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
        }
    }

    public NakedStaticLong(Class<?> cls, String str) {
        Field field = NakedUtils.getField(cls, str, true);
        this.field = field;
        if (field != null) {
            field.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedStaticLong failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + str);
    }
}
