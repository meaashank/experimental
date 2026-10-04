package com.prism.gaia.naked.entity;

import com.android.launcher3.IconCache;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.gaia.naked.utils.NakedUtils;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class NakedStaticFloat {
    private static final String TAG = "asdf-".concat("NakedStaticFloat");
    private final Field field;

    public NakedStaticFloat(Class cls, Field field) {
        Field field2 = NakedUtils.getField(cls, field.getName(), true);
        this.field = field2;
        if (field2 != null) {
            field2.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedStaticFloat failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + field.getName());
    }

    public static Float getSafe(NakedStaticFloat nakedStaticFloat) {
        if (nakedStaticFloat == null) {
            return null;
        }
        try {
            return Float.valueOf(nakedStaticFloat.field.getFloat(null));
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedStaticFloat.field);
            e10.getMessage();
            return Float.valueOf(0.0f);
        }
    }

    public static void setSafe(NakedStaticFloat nakedStaticFloat, float f10) {
        if (nakedStaticFloat == null) {
            return;
        }
        try {
            nakedStaticFloat.field.setFloat(null, f10);
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedStaticFloat.field);
            e10.getMessage();
        }
    }

    public float get() {
        try {
            return this.field.getFloat(null);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
            return 0.0f;
        }
    }

    public void set(float f10) {
        try {
            this.field.setFloat(null, f10);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
        }
    }

    public NakedStaticFloat(Class<?> cls, String str) {
        Field field = NakedUtils.getField(cls, str, true);
        this.field = field;
        if (field != null) {
            field.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedStaticFloat failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + str);
    }
}
