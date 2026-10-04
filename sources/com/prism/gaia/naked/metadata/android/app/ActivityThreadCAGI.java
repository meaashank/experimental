package com.prism.gaia.naked.metadata.android.app;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticInt;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import s0.x;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class ActivityThreadCAGI {

    @W6.m
    @W6.j("android.app.ActivityThread")
    public interface C extends ClassAccessor {

        @W6.m
        @W6.j("android.app.ActivityThread$H")
        public interface H extends ClassAccessor {
            @W6.q("APPLICATION_INFO_CHANGED")
            NakedStaticInt APPLICATION_INFO_CHANGED();

            @W6.q("ATTACH_AGENT")
            NakedStaticInt ATTACH_AGENT();

            @W6.q("BIND_APPLICATION")
            NakedStaticInt BIND_APPLICATION();

            @W6.q("BIND_SERVICE")
            NakedStaticInt BIND_SERVICE();

            @W6.q("CLEAN_UP_CONTEXT")
            NakedStaticInt CLEAN_UP_CONTEXT();

            @W6.q("CONFIGURATION_CHANGED")
            NakedStaticInt CONFIGURATION_CHANGED();

            @W6.q("CREATE_BACKUP_AGENT")
            NakedStaticInt CREATE_BACKUP_AGENT();

            @W6.q("CREATE_SERVICE")
            NakedStaticInt CREATE_SERVICE();

            @W6.q("DESTROY_ACTIVITY")
            NakedStaticInt DESTROY_ACTIVITY();

            @W6.q("DESTROY_BACKUP_AGENT")
            NakedStaticInt DESTROY_BACKUP_AGENT();

            @W6.q("DISPATCH_PACKAGE_BROADCAST")
            NakedStaticInt DISPATCH_PACKAGE_BROADCAST();

            @W6.q("DUMP_ACTIVITY")
            NakedStaticInt DUMP_ACTIVITY();

            @W6.q("DUMP_HEAP")
            NakedStaticInt DUMP_HEAP();

            @W6.q("DUMP_PROVIDER")
            NakedStaticInt DUMP_PROVIDER();

            @W6.q("DUMP_SERVICE")
            NakedStaticInt DUMP_SERVICE();

            @W6.q("ENABLE_JIT")
            NakedStaticInt ENABLE_JIT();

            @W6.q("ENTER_ANIMATION_COMPLETE")
            NakedStaticInt ENTER_ANIMATION_COMPLETE();

            @W6.q("EXECUTE_TRANSACTION")
            NakedStaticInt EXECUTE_TRANSACTION();

            @W6.q("EXIT_APPLICATION")
            NakedStaticInt EXIT_APPLICATION();

            @W6.q("GC_WHEN_IDLE")
            NakedStaticInt GC_WHEN_IDLE();

            @W6.q("HIDE_WINDOW")
            NakedStaticInt HIDE_WINDOW();

            @W6.q("INSTALL_PROVIDER")
            NakedStaticInt INSTALL_PROVIDER();

            @W6.q("LAUNCH_ACTIVITY")
            NakedStaticInt LAUNCH_ACTIVITY();

            @W6.q("LOCAL_VOICE_INTERACTION_STARTED")
            NakedStaticInt LOCAL_VOICE_INTERACTION_STARTED();

            @W6.q("LOW_MEMORY")
            NakedStaticInt LOW_MEMORY();

            @W6.q("NEW_INTENT")
            NakedStaticInt NEW_INTENT();

            @W6.q("ON_NEW_ACTIVITY_OPTIONS")
            NakedStaticInt ON_NEW_ACTIVITY_OPTIONS();

            @W6.q("PAUSE_ACTIVITY")
            NakedStaticInt PAUSE_ACTIVITY();

            @W6.q("PAUSE_ACTIVITY_FINISHING")
            NakedStaticInt PAUSE_ACTIVITY_FINISHING();

            @W6.q("PROFILER_CONTROL")
            NakedStaticInt PROFILER_CONTROL();

            @W6.q("RECEIVER")
            NakedStaticInt RECEIVER();

            @W6.q("RELAUNCH_ACTIVITY")
            NakedStaticInt RELAUNCH_ACTIVITY();

            @W6.q("REMOVE_PROVIDER")
            NakedStaticInt REMOVE_PROVIDER();

            @W6.q("REQUEST_ASSIST_CONTEXT_EXTRAS")
            NakedStaticInt REQUEST_ASSIST_CONTEXT_EXTRAS();

            @W6.q("RESUME_ACTIVITY")
            NakedStaticInt RESUME_ACTIVITY();

            @W6.q("RUN_ISOLATED_ENTRY_POINT")
            NakedStaticInt RUN_ISOLATED_ENTRY_POINT();

            @W6.q("SCHEDULE_CRASH")
            NakedStaticInt SCHEDULE_CRASH();

            @W6.q("SEND_RESULT")
            NakedStaticInt SEND_RESULT();

            @W6.q("SERVICE_ARGS")
            NakedStaticInt SERVICE_ARGS();

            @W6.q("SET_CORE_SETTINGS")
            NakedStaticInt SET_CORE_SETTINGS();

            @W6.q("SHOW_WINDOW")
            NakedStaticInt SHOW_WINDOW();

            @W6.q("SLEEPING")
            NakedStaticInt SLEEPING();

            @W6.q("START_BINDER_TRACKING")
            NakedStaticInt START_BINDER_TRACKING();

            @W6.q("STOP_ACTIVITY_HIDE")
            NakedStaticInt STOP_ACTIVITY_HIDE();

            @W6.q("STOP_ACTIVITY_SHOW")
            NakedStaticInt STOP_ACTIVITY_SHOW();

            @W6.q("STOP_BINDER_TRACKING_AND_DUMP")
            NakedStaticInt STOP_BINDER_TRACKING_AND_DUMP();

            @W6.q("STOP_SERVICE")
            NakedStaticInt STOP_SERVICE();

            @W6.q("SUICIDE")
            NakedStaticInt SUICIDE();

            @W6.q("TRANSLUCENT_CONVERSION_COMPLETE")
            NakedStaticInt TRANSLUCENT_CONVERSION_COMPLETE();

            @W6.q("UNBIND_SERVICE")
            NakedStaticInt UNBIND_SERVICE();

            @W6.q("UNSTABLE_PROVIDER_DIED")
            NakedStaticInt UNSTABLE_PROVIDER_DIED();

            @W6.q("UPDATE_PACKAGE_COMPATIBILITY_INFO")
            NakedStaticInt UPDATE_PACKAGE_COMPATIBILITY_INFO();
        }

        @W6.m
        @W6.j("android.app.ActivityThread$ResultData")
        public interface ResultData extends ClassAccessor {
            @W6.n("results")
            NakedObject<Object> results();

            @W6.n(BidResponsed.KEY_TOKEN)
            NakedObject<IBinder> token();
        }

        @W6.n("mAllApplications")
        NakedObject<Object> mAllApplications();

        @W6.p("performNewIntents")
        @W6.f({IBinder.class, List.class})
        NakedMethod<Void> performNewIntents();

        @W6.p("prepareInstrumentation")
        @W6.g({"android.app.ActivityThread$AppBindData"})
        NakedMethod<InstrumentationInfo> prepareInstrumentation();
    }

    @W6.l
    @W6.j("android.app.ActivityThread")
    public interface G extends ClassAccessor {

        @W6.l
        @W6.j("android.app.ActivityThread$ActivityClientRecord")
        public interface ActivityClientRecord extends ClassAccessor {
            @W6.n("activity")
            NakedObject<Activity> activity();

            @W6.n("activityInfo")
            NakedObject<ActivityInfo> activityInfo();

            @W6.n("intent")
            NakedObject<Intent> intent();

            @W6.n("packageInfo")
            NakedObject<Object> packageInfo();

            @W6.n(BidResponsed.KEY_TOKEN)
            NakedObject<IBinder> token();
        }

        @W6.l
        @W6.j("android.app.ActivityThread$AppBindData")
        public interface AppBindData extends ClassAccessor {
            @W6.n("appInfo")
            NakedObject<ApplicationInfo> appInfo();

            @W6.n("info")
            NakedObject<Object> info();

            @W6.n("instrumentationName")
            NakedObject<ComponentName> instrumentationName();

            @W6.n(GProcessClient.f164193t)
            NakedObject<String> processName();

            @W6.n("providers")
            NakedObject<List<ProviderInfo>> providers();
        }

        @W6.l
        @W6.j("android.app.ActivityThread$BindServiceData")
        public interface BindServiceData extends ClassAccessor {
            @W6.n("bindToken")
            NakedObject<IBinder> bindToken();

            @W6.k
            NakedConstructor<Object> ctor();

            @W6.n("intent")
            NakedObject<Intent> intent();

            @W6.n("rebind")
            NakedBoolean rebind();

            @W6.n(BidResponsed.KEY_TOKEN)
            NakedObject<IBinder> token();
        }

        @W6.l
        @W6.j("android.app.ActivityThread$CreateServiceData")
        public interface CreateServiceData extends ClassAccessor {
            @W6.n("compatInfo")
            NakedObject<Object> compatInfo();

            @W6.k
            NakedConstructor<Object> ctor();

            @W6.n("info")
            NakedObject<ServiceInfo> info();

            @W6.n(BidResponsed.KEY_TOKEN)
            NakedObject<IBinder> token();
        }

        @W6.l
        @W6.j("android.app.ActivityThread$NewIntentData")
        public interface NewIntentData extends ClassAccessor {
            @W6.n("intents")
            NakedObject<Object> intents();
        }

        @W6.l
        @W6.j("android.app.ActivityThread$ProviderClientRecord")
        public interface ProviderClientRecord extends ClassAccessor {
            @W6.g({"android.app.ActivityThread", "java.lang.String", "android.content.IContentProvider", "android.content.ContentProvider"})
            @W6.k
            NakedConstructor<?> ctor();

            @W6.n("mName")
            NakedObject<String> mName();

            @W6.n("mProvider")
            NakedObject<IInterface> mProvider();
        }

        @W6.l
        @W6.j("android.app.ActivityThread$ServiceArgsData")
        public interface ServiceArgsData extends ClassAccessor {
            @W6.n("args")
            NakedObject<Intent> args();

            @W6.k
            NakedConstructor<Object> ctor();

            @W6.n("flags")
            NakedInt flags();

            @W6.n("startId")
            NakedInt startId();

            @W6.n("taskRemoved")
            NakedBoolean taskRemoved();

            @W6.n(BidResponsed.KEY_TOKEN)
            NakedObject<IBinder> token();
        }

        @W6.s("currentActivityThread")
        NakedStaticMethod currentActivityThread();

        @W6.p("getApplicationThread")
        NakedMethod<Binder> getApplicationThread();

        @W6.p("getHandler")
        NakedMethod<Handler> getHandler();

        @W6.p("getProcessName")
        NakedMethod<String> getProcessName();

        @W6.p("handleBindService")
        NakedMethod<Void> handleBindService();

        @W6.p("handleCreateService")
        NakedMethod<Void> handleCreateService();

        @W6.p("handleServiceArgs")
        NakedMethod<Void> handleServiceArgs();

        @W6.p("handleStopService")
        NakedMethod<Void> handleStopService();

        @W6.p("handleUnbindService")
        NakedMethod<Void> handleUnbindService();

        @W6.p("installProvider")
        NakedMethod<Object> installProvider();

        @W6.n("mActivities")
        NakedObject<Map<IBinder, Object>> mActivities();

        @W6.n("mBoundApplication")
        NakedObject<Object> mBoundApplication();

        @W6.n("mH")
        NakedObject<Handler> mH();

        @W6.n("mInitialApplication")
        NakedObject<Application> mInitialApplication();

        @W6.n("mInstrumentation")
        NakedObject<Instrumentation> mInstrumentation();

        @W6.n("mPackages")
        NakedObject<Map<String, WeakReference<?>>> mPackages();

        @W6.n("mProviderMap")
        NakedObject<Map> mProviderMap();

        @W6.n("mResourcesManager")
        NakedObject<Object> mResourcesManager();

        @W6.n("mServices")
        NakedObject<Map<IBinder, Service>> mServices();

        @W6.q("sPackageManager")
        NakedStaticObject<IInterface> sPackageManager();

        @W6.p("sendActivityResult")
        @W6.f({IBinder.class, String.class, int.class, int.class, Intent.class})
        NakedMethod<Void> sendActivityResult();
    }

    @W6.l
    @W6.j("android.app.ActivityThread")
    public interface J16 extends ClassAccessor {

        @W6.l
        @W6.j("android.app.ActivityThread$ProviderClientRecord")
        public interface ProviderClientRecord extends ClassAccessor {
            @W6.n("mHolder")
            NakedObject<Object> mHolder();

            @W6.n("mProvider")
            NakedObject<IInterface> mProvider();
        }

        @W6.p("getPackageInfoNoCheck")
        @W6.g({"android.content.pm.ApplicationInfo", "android.content.res.CompatibilityInfo"})
        NakedMethod<Object> getPackageInfoNoCheck();
    }

    public interface J17 {

        @W6.l
        @W6.j("android.app.ActivityThread$ProviderKey")
        public interface ProviderKey extends ClassAccessor {
            @W6.f({String.class, int.class})
            @W6.k
            NakedConstructor<?> ctor();
        }
    }

    @W6.l
    @W6.j("android.app.ActivityThread")
    public interface N24_P28 extends ClassAccessor {
        @W6.p("performNewIntents")
        @W6.f({IBinder.class, List.class, boolean.class})
        NakedMethod<Void> performNewIntents();
    }

    @W6.l
    @W6.j("android.app.ActivityThread$ProviderKey")
    public interface ProviderKeyS31 extends ClassAccessor {
        @W6.n("mHolder")
        NakedObject<Object> mHolder();

        @W6.n("mLock")
        NakedObject<Object> mLock();
    }

    @W6.l
    @W6.j("android.app.ActivityThread")
    public interface Q29 extends ClassAccessor {
        @W6.p("handleNewIntent")
        @W6.f({IBinder.class, List.class})
        NakedMethod<Void> handleNewIntent();
    }

    @W6.l
    @W6.j("android.app.ActivityThread")
    public interface S31 extends ClassAccessor {
        @W6.p("getGetProviderKey")
        @W6.g({"java.lang.String", "int"})
        NakedMethod<Object> getGetProviderKey();

        @W6.p("handleNewIntent")
        @W6.g({"android.app.ActivityThread$ActivityClientRecord", "java.util.List"})
        NakedMethod<Void> handleNewIntent();

        @W6.n("mActivities")
        NakedObject<Map<IBinder, Object>> mActivities();

        @W6.n("mLaunchingActivities")
        NakedObject<Map<IBinder, Object>> mLaunchingActivities();
    }

    @W6.l
    @W6.j("android.app.ActivityThread")
    public interface T33 extends ClassAccessor {
        @W6.p("getPackageInfoNoCheck")
        @W6.g({"android.content.pm.ApplicationInfo", "android.content.res.CompatibilityInfo", x.b.f238265f})
        NakedMethod<Object> getPackageInfoNoCheck();
    }

    @W6.l
    @W6.j("android.app.ActivityThread")
    public interface U34 extends ClassAccessor {
        @W6.p("getPackageInfoNoCheck")
        @W6.g({"android.content.pm.ApplicationInfo"})
        NakedMethod<Object> getPackageInfoNoCheck();
    }
}
