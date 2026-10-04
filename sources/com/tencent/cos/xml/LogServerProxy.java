package com.tencent.cos.xml;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import vb.C5721b;
import vb.C5724e;

/* JADX INFO: loaded from: classes7.dex */
public class LogServerProxy {
    private static final String TAG = "LogServerProxy";
    private static LogServerProxy instance;
    private Context applicationContext;
    private Method destroyResourceMethod;
    private C5721b fileLogAdapter;
    private Object logServer;
    private Method setOnLogListenerMethod;
    private final String className = "com.tencent.qcloud.logutils.LogServer";
    private final String interfaceName = "com.tencent.qcloud.logutils.OnLogListener";
    private final String interfaceMethodName = "onLoad";

    private LogServerProxy(Context context, final C5721b c5721b) {
        this.applicationContext = context;
        this.fileLogAdapter = c5721b;
        try {
            Class<?> cls = Class.forName("com.tencent.qcloud.logutils.LogServer");
            Constructor<?> constructor = cls.getConstructor(Context.class);
            if (constructor != null) {
                this.logServer = constructor.newInstance(this.applicationContext);
            }
            Method declaredMethod = cls.getDeclaredMethod("destroy", null);
            this.destroyResourceMethod = declaredMethod;
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
            Class<?> cls2 = Class.forName("com.tencent.qcloud.logutils.OnLogListener");
            Object objNewProxyInstance = Proxy.newProxyInstance(LogServerProxy.class.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.tencent.cos.xml.LogServerProxy.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                    if ("onLoad".equals(method.getName())) {
                        return c5721b.k(30);
                    }
                    return null;
                }
            });
            Method declaredMethod2 = cls.getDeclaredMethod("setOnLogListener", cls2);
            this.setOnLogListenerMethod = declaredMethod2;
            if (declaredMethod2 != null) {
                declaredMethod2.setAccessible(true);
                this.setOnLogListenerMethod.invoke(this.logServer, objNewProxyInstance);
            }
        } catch (ClassNotFoundException unused) {
            C5724e.b(TAG, "com.tencent.qcloud.logutils.LogServer : not found", new Object[0]);
        } catch (IllegalAccessException e10) {
            C5724e.b(TAG, e10.getMessage() + " : not found", new Object[0]);
        } catch (InstantiationException e11) {
            C5724e.b(TAG, e11.getMessage() + " : not found", new Object[0]);
        } catch (NoSuchMethodException e12) {
            C5724e.b(TAG, e12.getMessage() + " : not found", new Object[0]);
        } catch (InvocationTargetException e13) {
            C5724e.b(TAG, e13.getMessage() + " : not found", new Object[0]);
        }
    }

    public static LogServerProxy getInstance() {
        return instance;
    }

    public static void init(Context context, C5721b c5721b) {
        synchronized (LogServerProxy.class) {
            try {
                if (instance == null) {
                    instance = new LogServerProxy(context, c5721b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void destroy() {
        Method method;
        Object obj = this.logServer;
        if (obj == null || (method = this.destroyResourceMethod) == null) {
            return;
        }
        try {
            method.invoke(obj, null);
        } catch (IllegalAccessException e10) {
            C5724e.b(TAG, e10.getMessage(), new Object[0]);
        } catch (InvocationTargetException e11) {
            C5724e.b(TAG, e11.getMessage(), new Object[0]);
        }
    }

    public C5721b getFileLogAdapter() {
        return this.fileLogAdapter;
    }
}
