package com.prism.gaia.naked.entity;

import cb.i;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.naked.marks.NIMethodNakedParams;
import com.prism.gaia.naked.marks.NIMethodParams;
import com.prism.gaia.naked.utils.NakedUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class NakedConstructor<T> {
    private static final String TAG = "asdf-".concat("NakedConstructor");
    private Constructor<?> ctor;

    public NakedConstructor(Class<?> cls, Field field) {
        if (field.isAnnotationPresent(NIMethodParams.class)) {
            initConstructor(cls, ((NIMethodParams) field.getAnnotation(NIMethodParams.class)).value(), true);
        } else if (field.isAnnotationPresent(NIMethodNakedParams.class)) {
            initConstructor(cls, ((NIMethodNakedParams) field.getAnnotation(NIMethodNakedParams.class)).value(), true);
        } else {
            initConstructor(cls, true);
        }
    }

    private void initConstructor(Class<?> cls, boolean z10) {
        try {
            this.ctor = cls.getDeclaredConstructor(null);
        } catch (Exception e10) {
            if (!z10) {
                NakedUtils.handleException(e10);
                return;
            } else {
                i.a(GaiaContext.j().p());
                initConstructor(cls, false);
            }
        }
        Constructor<?> constructor = this.ctor;
        if (constructor != null) {
            constructor.setAccessible(true);
        } else {
            throw new GaiaRuntimeException("NakedConstructor failed: " + cls.getCanonicalName());
        }
    }

    public static <T> T newInstanceSafe(NakedConstructor<T> nakedConstructor) {
        if (nakedConstructor == null) {
            return null;
        }
        try {
            return (T) ((NakedConstructor) nakedConstructor).ctor.newInstance(null);
        } catch (Exception e10) {
            NakedUtils.getConstructorDescStr(((NakedConstructor) nakedConstructor).ctor);
            e10.getMessage();
            return null;
        }
    }

    public T newInstance() {
        try {
            return (T) this.ctor.newInstance(null);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
            return null;
        }
    }

    public static <T> T newInstanceSafe(NakedConstructor<T> nakedConstructor, Object... objArr) {
        if (nakedConstructor == null) {
            return null;
        }
        try {
            return (T) ((NakedConstructor) nakedConstructor).ctor.newInstance(objArr);
        } catch (Exception e10) {
            NakedUtils.getConstructorDescStr(((NakedConstructor) nakedConstructor).ctor);
            e10.getMessage();
            return null;
        }
    }

    public T newInstance(Object... objArr) {
        try {
            return (T) this.ctor.newInstance(objArr);
        } catch (Exception e10) {
            NakedUtils.handleException(e10);
            return null;
        }
    }

    public NakedConstructor(Class<?> cls, Class<?>[] clsArr) {
        initConstructor(cls, clsArr, true);
    }

    private void initConstructor(Class<?> cls, Class<?>[] clsArr, boolean z10) {
        try {
            this.ctor = cls.getDeclaredConstructor(clsArr);
        } catch (Exception e10) {
            if (!z10) {
                NakedUtils.handleException(e10);
                return;
            } else {
                i.a(GaiaContext.j().p());
                initConstructor(cls, clsArr, false);
            }
        }
        Constructor<?> constructor = this.ctor;
        if (constructor != null) {
            constructor.setAccessible(true);
        } else {
            throw new GaiaRuntimeException("NakedConstructor failed: " + cls.getCanonicalName());
        }
    }

    public NakedConstructor(Class<?> cls, String[] strArr) {
        initConstructor(cls, strArr, true);
    }

    public NakedConstructor(Class<?> cls) {
        initConstructor(cls, true);
    }

    private void initConstructor(Class<?> cls, String[] strArr, boolean z10) {
        Class<?>[] clsArr = new Class[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            Class<?> protoType = NakedUtils.getProtoType(strArr[i10]);
            if (protoType == null) {
                try {
                    protoType = Class.forName(strArr[i10]);
                } catch (Exception e10) {
                    cls.getCanonicalName();
                    String str = strArr[i10];
                    e10.getMessage();
                }
            }
            clsArr[i10] = protoType;
        }
        initConstructor(cls, clsArr, z10);
    }
}
