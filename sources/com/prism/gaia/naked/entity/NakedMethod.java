package com.prism.gaia.naked.entity;

import U6.j;
import android.os.Bundle;
import cb.i;
import com.android.launcher3.IconCache;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.naked.marks.NIMethodNakedParams;
import com.prism.gaia.naked.marks.NIMethodParams;
import com.prism.gaia.naked.utils.NakedUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
public class NakedMethod<T> {
    private static final String TAG = "asdf-".concat("NakedMethod");
    private Method method;

    public NakedMethod(Class<?> cls, Field field) {
        if (field.isAnnotationPresent(NIMethodParams.class)) {
            initMethod(cls, field.getName(), ((NIMethodParams) field.getAnnotation(NIMethodParams.class)).value(), true);
        } else if (field.isAnnotationPresent(NIMethodNakedParams.class)) {
            ((NIMethodNakedParams) field.getAnnotation(NIMethodNakedParams.class)).value();
        } else {
            initMethod(cls, field.getName(), true);
        }
    }

    public static <T> T callSafe(Object obj, NakedMethod<T> nakedMethod, Object... objArr) {
        if (obj != null && nakedMethod != null) {
            try {
                return (T) ((NakedMethod) nakedMethod).method.invoke(obj, objArr);
            } catch (InvocationTargetException e10) {
                if (e10.getCause() != null) {
                    Throwable cause = e10.getCause();
                    NakedUtils.getMethodDescStr(((NakedMethod) nakedMethod).method);
                    obj.toString();
                    cause.getMessage();
                } else {
                    NakedUtils.getMethodDescStr(((NakedMethod) nakedMethod).method);
                    obj.toString();
                    e10.getMessage();
                }
            } catch (Throwable th) {
                NakedUtils.getMethodDescStr(((NakedMethod) nakedMethod).method);
                obj.toString();
                th.getMessage();
            }
        }
        return null;
    }

    public static <T> T callWithExceptionSafe(Object obj, NakedMethod<T> nakedMethod, Object... objArr) throws Throwable {
        if (obj == null || nakedMethod == null) {
            return null;
        }
        try {
            return (T) ((NakedMethod) nakedMethod).method.invoke(obj, objArr);
        } catch (InvocationTargetException e10) {
            if (e10.getCause() != null) {
                throw e10.getCause();
            }
            throw e10;
        }
    }

    private void initMethod(Class<?> cls, String str, boolean z10) {
        try {
            Method method = null;
            for (Method method2 : cls.getDeclaredMethods()) {
                if (method2.getName().equals(str)) {
                    method2.setAccessible(true);
                    if (method == null || method2.getParameterTypes().length < method.getParameterTypes().length) {
                        method = method2;
                    }
                }
            }
            if (method != null) {
                this.method = method;
            } else if (z10) {
                i.a(GaiaContext.j().p());
                initMethod(cls, str, false);
            }
        } catch (Exception e10) {
            if (!z10) {
                NakedUtils.handleException(e10);
                return;
            } else {
                i.a(GaiaContext.j().p());
                initMethod(cls, str, false);
            }
        }
        if (this.method != null) {
            return;
        }
        throw new GaiaRuntimeException("NakedMethod failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + str);
    }

    public T call(Object obj, Object... objArr) {
        InvocationTargetException invocationTargetException;
        try {
            return (T) this.method.invoke(obj, objArr);
        } catch (InvocationTargetException e10) {
            if (e10.getCause() != null) {
                Throwable cause = e10.getCause();
                NakedUtils.getMethodDescStr(this.method);
                Objects.toString(obj);
                cause.getMessage();
                invocationTargetException = cause;
            } else {
                NakedUtils.getMethodDescStr(this.method);
                Objects.toString(obj);
                e10.getMessage();
                invocationTargetException = e10;
            }
            InvocationTargetException invocationTargetException2 = invocationTargetException;
            Bundle bundle = new Bundle();
            bundle.putString("METHOD_DESC", NakedUtils.getMethodDescStr(this.method));
            bundle.putString("RECEIVER", "" + obj);
            bundle.putString("args", j.J(objArr));
            C5705o.c().e(invocationTargetException2, "unknown", "unknown", "NAKED_METHOD_CALL_FAIL", bundle);
            return null;
        } catch (Throwable th) {
            NakedUtils.handleException(th);
            return null;
        }
    }

    public T callWithException(Object obj, Object... objArr) throws Throwable {
        try {
            return (T) this.method.invoke(obj, objArr);
        } catch (InvocationTargetException e10) {
            if (e10.getCause() != null) {
                throw e10.getCause();
            }
            throw e10;
        }
    }

    public Class<?>[] paramList() {
        return this.method.getParameterTypes();
    }

    public NakedMethod(Class<?> cls, String str) {
        initMethod(cls, str, true);
    }

    public NakedMethod(Class<?> cls, String str, Class<?>[] clsArr) {
        initMethod(cls, str, clsArr, true);
    }

    public NakedMethod(Class<?> cls, String str, String[] strArr) {
        initMethod(cls, str, strArr, true);
    }

    private void initMethod(Class<?> cls, String str, Class<?>[] clsArr, boolean z10) {
        try {
            this.method = cls.getDeclaredMethod(str, clsArr);
        } catch (Exception e10) {
            if (!z10) {
                NakedUtils.handleException(e10);
                return;
            } else {
                i.a(GaiaContext.j().p());
                initMethod(cls, str, clsArr, false);
            }
        }
        Method method = this.method;
        if (method != null) {
            method.setAccessible(true);
            return;
        }
        throw new GaiaRuntimeException("NakedMethod failed: " + cls.getCanonicalName() + IconCache.EMPTY_CLASS_NAME + str);
    }

    private void initMethod(Class<?> cls, String str, String[] strArr, boolean z10) {
        Class<?>[] clsArr = new Class[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            Class<?> protoType = NakedUtils.getProtoType(strArr[i10]);
            if (protoType == null) {
                try {
                    protoType = Class.forName(strArr[i10]);
                } catch (ClassNotFoundException e10) {
                    cls.getCanonicalName();
                    Objects.toString(this.method);
                    e10.getMessage();
                }
            }
            clsArr[i10] = protoType;
        }
        initMethod(cls, str, clsArr, z10);
    }
}
