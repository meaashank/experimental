package com.prism.gaia.naked.entity;

import com.android.launcher3.IconCache;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.gaia.naked.utils.NakedUtils;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class NakedStaticBoolean {
    private static final String TAG = "asdf-".concat("NakedStaticBoolean");
    private final Field field;

    public NakedStaticBoolean(Class<?> cls, Field field) {
        Field field2 = NakedUtils.getField(cls, field.getName(), true);
        this.field = field2;
        if (field2 != null) {
            field2.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedStaticBoolean failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + field.getName());
    }

    public static Boolean getSafe(NakedStaticBoolean nakedStaticBoolean) {
        if (nakedStaticBoolean == null) {
            return null;
        }
        try {
            return Boolean.valueOf(nakedStaticBoolean.field.getBoolean(null));
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedStaticBoolean.field);
            e10.getMessage();
            return Boolean.FALSE;
        }
    }

    public static void setSafe(NakedStaticBoolean nakedStaticBoolean, boolean z10) {
        if (nakedStaticBoolean == null) {
            return;
        }
        try {
            nakedStaticBoolean.field.setBoolean(null, z10);
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedStaticBoolean.field);
            e10.getMessage();
        }
    }

    public boolean get() {
        try {
            return this.field.getBoolean(null);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
            return false;
        }
    }

    public void set(boolean z10) {
        try {
            this.field.setBoolean(null, z10);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
        }
    }

    public NakedStaticBoolean(Class<?> cls, String str) {
        Field field = NakedUtils.getField(cls, str, true);
        this.field = field;
        if (field != null) {
            field.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedStaticBoolean failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + str);
    }
}
