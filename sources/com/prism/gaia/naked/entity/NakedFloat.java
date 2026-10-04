package com.prism.gaia.naked.entity;

import com.android.launcher3.IconCache;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.gaia.naked.utils.NakedUtils;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class NakedFloat {
    private static final String TAG = "asdf-".concat("NakedFloat");
    private final Field field;

    public NakedFloat(Class<?> cls, Field field) {
        Field field2 = NakedUtils.getField(cls, field.getName(), true);
        this.field = field2;
        if (field2 != null) {
            field2.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedFloat failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + field.getName());
    }

    public static Float getSafe(Object obj, NakedFloat nakedFloat) {
        if (obj == null || nakedFloat == null) {
            return null;
        }
        try {
            return Float.valueOf(nakedFloat.field.getFloat(obj));
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedFloat.field);
            obj.toString();
            e10.getMessage();
            return Float.valueOf(0.0f);
        }
    }

    public static void setSafe(Object obj, NakedFloat nakedFloat, float f10) {
        if (obj == null || nakedFloat == null) {
            return;
        }
        try {
            nakedFloat.field.setFloat(obj, f10);
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedFloat.field);
            obj.toString();
            e10.getMessage();
        }
    }

    public float get(Object obj) {
        try {
            return this.field.getFloat(obj);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
            return 0.0f;
        }
    }

    public void set(Object obj, float f10) {
        try {
            this.field.setFloat(obj, f10);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
        }
    }

    public NakedFloat(Class<?> cls, String str) {
        Field field = NakedUtils.getField(cls, str, true);
        this.field = field;
        if (field != null) {
            field.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedFloat failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + str);
    }
}
