package com.prism.gaia.naked.entity;

import com.android.launcher3.IconCache;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.gaia.naked.utils.NakedUtils;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class NakedBoolean {
    private static final String TAG = "asdf-".concat("NakedBoolean");
    private final Field field;

    public NakedBoolean(Class<?> cls, Field field) {
        Field field2 = NakedUtils.getField(cls, field.getName(), true);
        this.field = field2;
        if (field2 != null) {
            field2.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedBoolean failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + field.getName());
    }

    public static boolean getSafe(Object obj, NakedBoolean nakedBoolean) {
        if (obj != null && nakedBoolean != null) {
            try {
                return nakedBoolean.field.getBoolean(obj);
            } catch (Exception e10) {
                NakedUtils.getFieldDescStr(nakedBoolean.field);
                obj.toString();
                e10.getMessage();
            }
        }
        return false;
    }

    public static void setSafe(Object obj, NakedBoolean nakedBoolean, boolean z10) {
        if (obj == null || nakedBoolean == null) {
            return;
        }
        try {
            nakedBoolean.field.setBoolean(obj, z10);
        } catch (Exception e10) {
            NakedUtils.getFieldDescStr(nakedBoolean.field);
            obj.toString();
            e10.getMessage();
        }
    }

    public boolean get(Object obj) {
        try {
            return this.field.getBoolean(obj);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
            return false;
        }
    }

    public void set(Object obj, boolean z10) {
        try {
            this.field.setBoolean(obj, z10);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
        }
    }

    public NakedBoolean(Class<?> cls, String str) {
        Field field = NakedUtils.getField(cls, str, true);
        this.field = field;
        if (field != null) {
            field.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedBoolean failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + str);
    }
}
