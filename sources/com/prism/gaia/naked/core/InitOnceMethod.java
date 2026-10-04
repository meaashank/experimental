package com.prism.gaia.naked.core;

import android.util.Log;
import com.prism.commons.utils.l0;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
public abstract class InitOnceMethod<T> extends AbstractInitOnce<T> {
    private static final String TAG = l0.b("InitOnceMethod");
    private String methodName;
    private Class<?> methodOwnerClass;
    private Class<?>[] paramTypes;
    private String[] paramTypesStr;

    public static class InitOnceConstructorMethod<T> extends InitOnceMethod<NakedConstructor<T>> {
        public InitOnceConstructorMethod(Class<?> cls, Class<?>[] clsArr) {
            super(cls, (String) null, clsArr);
        }

        @Override // com.prism.gaia.naked.core.InitOnceMethod
        public /* bridge */ /* synthetic */ Object onInit(Class cls, String str) throws NoSuchMethodException {
            return onInit((Class<?>) cls, str);
        }

        public InitOnceConstructorMethod(Class<?> cls, String[] strArr) {
            super(cls, (String) null, strArr);
        }

        @Override // com.prism.gaia.naked.core.InitOnceMethod
        public /* bridge */ /* synthetic */ Object onInit(Class cls, String str, Class[] clsArr) throws NoSuchMethodException {
            return onInit((Class<?>) cls, str, (Class<?>[]) clsArr);
        }

        public InitOnceConstructorMethod(Class<?> cls) {
            super(cls, null);
        }

        @Override // com.prism.gaia.naked.core.InitOnceMethod
        public /* bridge */ /* synthetic */ Object onInit(Class cls, String str, String[] strArr) throws NoSuchMethodException {
            return onInit((Class<?>) cls, str, strArr);
        }

        @Override // com.prism.gaia.naked.core.InitOnceMethod
        public NakedConstructor<T> onInit(Class<?> cls, String str) throws NoSuchMethodException {
            return new NakedConstructor<>(cls);
        }

        @Override // com.prism.gaia.naked.core.InitOnceMethod
        public NakedConstructor<T> onInit(Class<?> cls, String str, Class<?>[] clsArr) throws NoSuchMethodException {
            return new NakedConstructor<>(cls, clsArr);
        }

        @Override // com.prism.gaia.naked.core.InitOnceMethod
        public NakedConstructor<T> onInit(Class<?> cls, String str, String[] strArr) throws NoSuchMethodException {
            return new NakedConstructor<>(cls, strArr);
        }
    }

    public static class InitOnceInstanceMethod<T> extends InitOnceMethod<NakedMethod<T>> {
        public InitOnceInstanceMethod(Class<?> cls, String str, Class<?>[] clsArr) {
            super(cls, str, clsArr);
        }

        @Override // com.prism.gaia.naked.core.InitOnceMethod
        public /* bridge */ /* synthetic */ Object onInit(Class cls, String str) throws NoSuchMethodException {
            return onInit((Class<?>) cls, str);
        }

        public InitOnceInstanceMethod(Class<?> cls, String str, String[] strArr) {
            super(cls, str, strArr);
        }

        @Override // com.prism.gaia.naked.core.InitOnceMethod
        public /* bridge */ /* synthetic */ Object onInit(Class cls, String str, Class[] clsArr) throws NoSuchMethodException {
            return onInit((Class<?>) cls, str, (Class<?>[]) clsArr);
        }

        public InitOnceInstanceMethod(Class<?> cls, String str) {
            super(cls, str);
        }

        @Override // com.prism.gaia.naked.core.InitOnceMethod
        public /* bridge */ /* synthetic */ Object onInit(Class cls, String str, String[] strArr) throws NoSuchMethodException {
            return onInit((Class<?>) cls, str, strArr);
        }

        @Override // com.prism.gaia.naked.core.InitOnceMethod
        public NakedMethod<T> onInit(Class<?> cls, String str) throws NoSuchMethodException {
            return new NakedMethod<>(cls, str);
        }

        @Override // com.prism.gaia.naked.core.InitOnceMethod
        public NakedMethod<T> onInit(Class<?> cls, String str, Class<?>[] clsArr) throws NoSuchMethodException {
            return new NakedMethod<>(cls, str, clsArr);
        }

        @Override // com.prism.gaia.naked.core.InitOnceMethod
        public NakedMethod<T> onInit(Class<?> cls, String str, String[] strArr) throws NoSuchMethodException {
            return new NakedMethod<>(cls, str, strArr);
        }
    }

    public static class InitOnceStaticMethod<T> extends InitOnceMethod<NakedStaticMethod<T>> {
        public InitOnceStaticMethod(Class<?> cls, String str, Class<?>[] clsArr) {
            super(cls, str, clsArr);
        }

        @Override // com.prism.gaia.naked.core.InitOnceMethod
        public /* bridge */ /* synthetic */ Object onInit(Class cls, String str) throws NoSuchMethodException {
            return onInit((Class<?>) cls, str);
        }

        public InitOnceStaticMethod(Class<?> cls, String str, String[] strArr) {
            super(cls, str, strArr);
        }

        @Override // com.prism.gaia.naked.core.InitOnceMethod
        public /* bridge */ /* synthetic */ Object onInit(Class cls, String str, Class[] clsArr) throws NoSuchMethodException {
            return onInit((Class<?>) cls, str, (Class<?>[]) clsArr);
        }

        public InitOnceStaticMethod(Class<?> cls, String str) {
            super(cls, str);
        }

        @Override // com.prism.gaia.naked.core.InitOnceMethod
        public /* bridge */ /* synthetic */ Object onInit(Class cls, String str, String[] strArr) throws NoSuchMethodException {
            return onInit((Class<?>) cls, str, strArr);
        }

        @Override // com.prism.gaia.naked.core.InitOnceMethod
        public NakedStaticMethod<T> onInit(Class<?> cls, String str) throws NoSuchMethodException {
            return new NakedStaticMethod<>(cls, str);
        }

        @Override // com.prism.gaia.naked.core.InitOnceMethod
        public NakedStaticMethod<T> onInit(Class<?> cls, String str, Class<?>[] clsArr) throws NoSuchMethodException {
            return new NakedStaticMethod<>(cls, str, clsArr);
        }

        @Override // com.prism.gaia.naked.core.InitOnceMethod
        public NakedStaticMethod<T> onInit(Class<?> cls, String str, String[] strArr) throws NoSuchMethodException {
            return new NakedStaticMethod<>(cls, str, strArr);
        }
    }

    public InitOnceMethod(Class<?> cls, String str, Class<?>[] clsArr) {
        this(cls, str);
        this.paramTypes = clsArr;
    }

    @Override // com.prism.gaia.naked.core.AbstractInitOnce
    public T onInit() {
        try {
            Class<?>[] clsArr = this.paramTypes;
            if (clsArr != null) {
                return onInit(this.methodOwnerClass, this.methodName, clsArr);
            }
            String[] strArr = this.paramTypesStr;
            return strArr != null ? onInit(this.methodOwnerClass, this.methodName, strArr) : onInit(this.methodOwnerClass, this.methodName);
        } catch (NoSuchMethodException e10) {
            Log.e(TAG, "unknown method", e10);
            return null;
        }
    }

    public abstract T onInit(Class<?> cls, String str) throws NoSuchMethodException;

    public abstract T onInit(Class<?> cls, String str, Class<?>[] clsArr) throws NoSuchMethodException;

    public abstract T onInit(Class<?> cls, String str, String[] strArr) throws NoSuchMethodException;

    public InitOnceMethod(Class<?> cls, String str, String[] strArr) {
        this(cls, str);
        this.paramTypesStr = strArr;
    }

    public InitOnceMethod(Class<?> cls, String str) {
        this.paramTypes = null;
        this.paramTypesStr = null;
        this.methodOwnerClass = cls;
        this.methodName = str;
    }
}
