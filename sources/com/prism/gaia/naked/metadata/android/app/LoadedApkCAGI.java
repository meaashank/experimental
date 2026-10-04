package com.prism.gaia.naked.metadata.android.app;

import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Instrumentation;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.Handler;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class LoadedApkCAGI {

    @W6.m
    @W6.j("android.app.LoadedApk")
    public interface C extends ClassAccessor {
        @W6.n("mAppComponentFactory")
        NakedObject<AppComponentFactory> mAppComponentFactory();
    }

    public interface D {

        public interface HuaWei {

            @W6.m
            @W6.j("android.app.LoadedApk")
            public interface C extends ClassAccessor {
                @W6.n("mReceiverResource")
                NakedObject<Object> mReceiverResource();
            }
        }
    }

    @W6.l
    @W6.j("android.app.LoadedApk")
    public interface G extends ClassAccessor {

        @W6.l
        @W6.j("android.app.LoadedApk$ReceiverDispatcher")
        public interface ReceiverDispatcher extends ClassAccessor {

            @W6.l
            @W6.j("android.app.LoadedApk$ReceiverDispatcher$InnerReceiver")
            public interface InnerReceiver extends ClassAccessor {
                @W6.n("mDispatcher")
                NakedObject<WeakReference<Object>> mDispatcher();
            }

            @W6.n("mActivityThread")
            NakedObject<Handler> mActivityThread();

            @W6.n("mContext")
            NakedObject<Context> mContext();

            @W6.n("mReceiver")
            NakedObject<BroadcastReceiver> mReceiver();
        }

        @W6.l
        @W6.j("android.app.LoadedApk$ServiceDispatcher")
        public interface ServiceDispatcher extends ClassAccessor {

            @W6.l
            @W6.j("android.app.LoadedApk$ServiceDispatcher$InnerConnection")
            public interface InnerConnection extends ClassAccessor {
                @W6.n("mDispatcher")
                NakedObject<WeakReference<Object>> mDispatcher();
            }

            @W6.n("mConnection")
            NakedObject<ServiceConnection> mConnection();
        }

        @W6.p("forgetReceiverDispatcher")
        @W6.f({Context.class, BroadcastReceiver.class})
        NakedMethod<IInterface> forgetReceiverDispatcher();

        @W6.p("forgetServiceDispatcher")
        @W6.f({Context.class, ServiceConnection.class})
        NakedMethod<IInterface> forgetServiceDispatcher();

        @W6.p("getClassLoader")
        NakedMethod<ClassLoader> getClassLoader();

        @W6.p("getReceiverDispatcher")
        @W6.f({BroadcastReceiver.class, Context.class, Handler.class, Instrumentation.class, boolean.class})
        NakedMethod<IInterface> getReceiverDispatcher();

        @W6.n("mApplication")
        NakedObject<Application> mApplication();

        @W6.n("mApplicationInfo")
        NakedObject<ApplicationInfo> mApplicationInfo();

        @W6.n("mBaseClassLoader")
        NakedObject<ClassLoader> mBaseClassLoader();

        @W6.n("mClassLoader")
        NakedObject<ClassLoader> mClassLoader();

        @W6.n("mDefaultClassLoader")
        NakedObject<ClassLoader> mDefaultClassLoader();

        @W6.n("mIncludeCode")
        NakedBoolean mIncludeCode();

        @W6.n("mResources")
        NakedObject<Resources> mResources();

        @W6.n("mServices")
        NakedObject<Object> mServices();

        @W6.p("makeApplication")
        @W6.f({boolean.class, Instrumentation.class})
        NakedMethod<Application> makeApplication();
    }

    @W6.l
    @W6.j("android.app.LoadedApk")
    public interface T33 extends ClassAccessor {
        @W6.p("makeApplicationInner")
        @W6.f({boolean.class, Instrumentation.class, boolean.class})
        NakedMethod<Application> makeApplicationInner();
    }

    @W6.l
    @W6.j("android.app.LoadedApk")
    public interface U34 extends ClassAccessor {
        @W6.p("getServiceDispatcher")
        @W6.f({ServiceConnection.class, Context.class, Handler.class, long.class})
        NakedMethod<IInterface> getServiceDispatcher();
    }

    @W6.l
    @W6.j("android.app.LoadedApk")
    public interface _T33 extends ClassAccessor {
        @W6.p("getServiceDispatcher")
        @W6.f({ServiceConnection.class, Context.class, Handler.class, int.class})
        NakedMethod<IInterface> getServiceDispatcher();
    }
}
