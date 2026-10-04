package com.prism.gaia.naked.compat.android.app;

import W6.c;
import android.app.Application;
import android.app.Instrumentation;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.os.Handler;
import android.os.IInterface;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.compat.dalvik.system.BaseDexClassLoaderCompat2;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.metadata.android.app.LoadedApkCAG;
import dalvik.system.BaseDexClassLoader;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.LinkedList;
import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class LoadedApkCompat2 {
    private static final String TAG = "LoadedApkCompat2";

    public static class Util {
        public static String calcClassLoaderPathChain(ClassLoader classLoader) {
            LinkedList linkedList = new LinkedList();
            ClassLoader parent = ClassLoader.getSystemClassLoader().getParent();
            while (classLoader != null && classLoader != parent) {
                if (classLoader instanceof BaseDexClassLoader) {
                    linkedList.add(classLoader.getClass().getCanonicalName() + ": " + BaseDexClassLoaderCompat2.Util.getPathListStr((BaseDexClassLoader) classLoader));
                } else {
                    linkedList.add(classLoader.getClass().getCanonicalName());
                }
                classLoader = classLoader.getParent();
            }
            return Arrays.toString(linkedList.toArray(new String[0]));
        }

        private static Object dispatcherOf(IInterface iInterface) {
            try {
                WeakReference<Object> weakReference = LoadedApkCAG.f165347G.ReceiverDispatcher.InnerReceiver.mDispatcher().get(iInterface);
                if (weakReference == null) {
                    return null;
                }
                return weakReference.get();
            } catch (Throwable th) {
                th.getMessage();
                return null;
            }
        }

        public static IInterface forgetReceiverDispatcher(Object obj, Context context, BroadcastReceiver broadcastReceiver) {
            try {
                return LoadedApkCAG.f165347G.forgetReceiverDispatcher().call(obj, context, broadcastReceiver);
            } catch (Throwable unused) {
                return null;
            }
        }

        public static IInterface forgetServiceDispatcher(Object obj, Context context, ServiceConnection serviceConnection) {
            return LoadedApkCAG.f165347G.forgetServiceDispatcher().call(obj, context, serviceConnection);
        }

        public static ClassLoader getClassLoader(Object obj) {
            return LoadedApkCAG.f165347G.mClassLoader().get(obj);
        }

        public static ServiceConnection getConnFromDispatcher(IInterface iInterface) {
            Object obj = LoadedApkCAG.f165347G.ServiceDispatcher.InnerConnection.mDispatcher().get(iInterface).get();
            if (obj == null) {
                return null;
            }
            return LoadedApkCAG.f165347G.ServiceDispatcher.mConnection().get(obj);
        }

        public static Context getContextFromDispatcher(IInterface iInterface) {
            Object objDispatcherOf = dispatcherOf(iInterface);
            if (objDispatcherOf == null) {
                return null;
            }
            return LoadedApkCAG.f165347G.ReceiverDispatcher.mContext().get(objDispatcherOf);
        }

        public static Handler getHandlerFromDispatcher(IInterface iInterface) {
            Object objDispatcherOf = dispatcherOf(iInterface);
            if (objDispatcherOf == null) {
                return null;
            }
            return LoadedApkCAG.f165347G.ReceiverDispatcher.mActivityThread().get(objDispatcherOf);
        }

        public static ClassLoader getOrCreateClassLoader(Object obj) {
            return LoadedApkCAG.f165347G.getClassLoader().call(obj, new Object[0]);
        }

        public static IInterface getReceiverDispatcher(Object obj, BroadcastReceiver broadcastReceiver, Context context, Handler handler, Instrumentation instrumentation, boolean z10) {
            return LoadedApkCAG.f165347G.getReceiverDispatcher().call(obj, broadcastReceiver, context, handler, instrumentation, Boolean.valueOf(z10));
        }

        public static BroadcastReceiver getReceiverFromDispatcher(IInterface iInterface) {
            Object objDispatcherOf = dispatcherOf(iInterface);
            if (objDispatcherOf == null) {
                return null;
            }
            return LoadedApkCAG.f165347G.ReceiverDispatcher.mReceiver().get(objDispatcherOf);
        }

        public static IInterface getServiceDispatcher(Object obj, ServiceConnection serviceConnection, Context context, Handler handler, int i10) {
            return C3841e.E() ? LoadedApkCAG.U34.getServiceDispatcher().call(obj, serviceConnection, context, handler, Long.valueOf(((long) i10) & ZipKt.f225990j)) : LoadedApkCAG._T33.getServiceDispatcher().call(obj, serviceConnection, context, handler, Integer.valueOf(i10));
        }

        public static Application makeApplication(Object obj) {
            if (!C3841e.D()) {
                return LoadedApkCAG.f165347G.makeApplication().call(obj, Boolean.FALSE, null);
            }
            NakedMethod<Application> nakedMethodMakeApplicationInner = LoadedApkCAG.T33.makeApplicationInner();
            Boolean bool = Boolean.FALSE;
            return nakedMethodMakeApplicationInner.call(obj, bool, null, bool);
        }

        public static void setClassLoader(Object obj, ClassLoader classLoader) {
            LoadedApkCAG.f165347G.mClassLoader().set(obj, classLoader);
        }

        public static void setResources(Object obj, Resources resources) {
            LoadedApkCAG.f165347G.mResources().set(obj, resources);
        }
    }
}
