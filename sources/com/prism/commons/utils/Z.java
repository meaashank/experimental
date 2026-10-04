package com.prism.commons.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public class Z {

    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f162072a;

        public a(Object obj) {
            this.f162072a = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return method.invoke(this.f162072a, objArr);
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(Class<T> cls, Object obj) {
        return obj;
    }
}
