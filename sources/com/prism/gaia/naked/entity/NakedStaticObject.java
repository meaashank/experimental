package com.prism.gaia.naked.entity;

import com.android.launcher3.IconCache;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.gaia.naked.utils.NakedUtils;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class NakedStaticObject<T> {
    private static final String TAG = "asdf-".concat("NakedStaticDouble");
    private final Field field;

    public NakedStaticObject(Class<?> cls, Field field) {
        Field field2 = NakedUtils.getField(cls, field.getName(), true);
        this.field = field2;
        if (field2 != null) {
            field2.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedStaticObject failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + field.getName());
    }

    public static <T> T getSafe(NakedStaticObject<T> nakedStaticObject) {
        if (nakedStaticObject == null) {
            return null;
        }
        try {
            return (T) ((NakedStaticObject) nakedStaticObject).field.get(null);
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(((NakedStaticObject) nakedStaticObject).field);
            e10.getMessage();
            return null;
        }
    }

    public static <T> void setSafe(NakedStaticObject<T> nakedStaticObject, T t10) {
        if (nakedStaticObject == null) {
            return;
        }
        try {
            ((NakedStaticObject) nakedStaticObject).field.set(null, t10);
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(((NakedStaticObject) nakedStaticObject).field);
            e10.getMessage();
        }
    }

    public T get() {
        try {
            return (T) this.field.get(null);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
            return null;
        }
    }

    public void set(T t10) {
        try {
            this.field.set(null, t10);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
        }
    }

    public Class<?> type() {
        return this.field.getType();
    }

    public NakedStaticObject(Class<?> cls, String str) {
        Field field = NakedUtils.getField(cls, str, true);
        this.field = field;
        if (field != null) {
            field.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedStaticObject failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + str);
    }
}
