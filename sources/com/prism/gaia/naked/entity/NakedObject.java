package com.prism.gaia.naked.entity;

import com.android.launcher3.IconCache;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.gaia.naked.utils.NakedUtils;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class NakedObject<T> {
    private static final String TAG = "asdf-".concat("NakedObject");
    private final Field field;

    public NakedObject(Class<?> cls, Field field) {
        Field field2 = NakedUtils.getField(cls, field.getName(), true);
        this.field = field2;
        if (field2 != null) {
            field2.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedObject failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + field.getName());
    }

    public static <T> T getSafe(Object obj, NakedObject<T> nakedObject) {
        if (obj != null && nakedObject != null) {
            try {
                return (T) ((NakedObject) nakedObject).field.get(obj);
            } catch (Exception e10) {
                NakedUtils.getFieldDescStr(((NakedObject) nakedObject).field);
                obj.toString();
                e10.getMessage();
            }
        }
        return null;
    }

    public static <T> void setSafe(Object obj, NakedObject<T> nakedObject, T t10) {
        if (obj == null || nakedObject == null) {
            return;
        }
        try {
            ((NakedObject) nakedObject).field.set(obj, t10);
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(((NakedObject) nakedObject).field);
            obj.toString();
            e10.getMessage();
        }
    }

    public T get(Object obj) {
        try {
            return (T) this.field.get(obj);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
            return null;
        }
    }

    public void set(Object obj, T t10) {
        try {
            this.field.set(obj, t10);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
        }
    }

    public NakedObject(Class<?> cls, String str) {
        Field field = NakedUtils.getField(cls, str, true);
        this.field = field;
        if (field != null) {
            field.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedObject failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + str);
    }
}
