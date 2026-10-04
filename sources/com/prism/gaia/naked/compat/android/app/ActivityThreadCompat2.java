package com.prism.gaia.naked.compat.android.app;

import U6.j;
import W6.c;
import android.app.Instrumentation;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import androidx.compose.runtime.changelist.a;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.compat.android.content.res.CompatibilityInfoCompat2;
import com.prism.gaia.naked.compat.com.android.internal.content.ReferrerIntentCompat2;
import com.prism.gaia.naked.core.ClassAccessorUtils;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticInt;
import com.prism.gaia.naked.metadata.android.app.ActivityThreadCAG;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ActivityThreadCompat2 {

    public static class MsgCodes {
        private static final int ACTIVITY_CONFIGURATION_CHANGED = 125;
        private static final int APPLICATION_INFO_CHANGED = 156;
        private static final int ATTACH_AGENT = 155;
        private static final int BACKGROUND_VISIBLE_BEHIND_CHANGED = 148;
        private static final int BIND_APPLICATION = 110;
        private static final int BIND_SERVICE = 121;
        private static final int CANCEL_VISIBLE_BEHIND = 147;
        private static final int CLEAN_UP_CONTEXT = 119;
        private static final int CONFIGURATION_CHANGED = 118;
        private static final int CREATE_BACKUP_AGENT = 128;
        private static final int CREATE_SERVICE = 114;
        private static final int DESTROY_ACTIVITY = 109;
        private static final int DESTROY_BACKUP_AGENT = 129;
        private static final int DISPATCH_PACKAGE_BROADCAST = 133;
        private static final int DUMP_ACTIVITY = 136;
        private static final int DUMP_HEAP = 135;
        private static final int DUMP_PROVIDER = 141;
        private static final int DUMP_SERVICE = 123;
        private static final int ENABLE_JIT = 132;
        private static final int ENTER_ANIMATION_COMPLETE = 149;
        private static final int EXECUTE_TRANSACTION = 159;
        private static final int EXIT_APPLICATION = 111;
        private static final int GC_WHEN_IDLE = 120;
        private static final int HIDE_WINDOW = 106;
        private static final int INSTALL_PROVIDER = 145;
        private static final int LAUNCH_ACTIVITY = 100;
        private static final int LOCAL_VOICE_INTERACTION_STARTED = 154;
        private static final int LOW_MEMORY = 124;
        private static final int MULTI_WINDOW_MODE_CHANGED = 152;
        private static final int NEW_INTENT = 112;
        private static final int ON_NEW_ACTIVITY_OPTIONS = 146;
        private static final int PAUSE_ACTIVITY = 101;
        private static final int PAUSE_ACTIVITY_FINISHING = 102;
        private static final int PICTURE_IN_PICTURE_MODE_CHANGED = 153;
        private static final int PROFILER_CONTROL = 127;
        private static final int RECEIVER = 113;
        private static final int RELAUNCH_ACTIVITY_1 = 126;
        private static final int RELAUNCH_ACTIVITY_2 = 160;
        private static final int REMOVE_PROVIDER = 131;
        private static final int REQUEST_ASSIST_CONTEXT_EXTRAS = 143;
        private static final int RESUME_ACTIVITY = 107;
        private static final int RUN_ISOLATED_ENTRY_POINT = 158;
        private static final int SCHEDULE_CRASH = 134;
        private static final int SEND_RESULT = 108;
        private static final int SERVICE_ARGS = 115;
        private static final int SET_CORE_SETTINGS = 138;
        private static final int SHOW_WINDOW = 105;
        private static final int SLEEPING = 137;
        private static final int START_BINDER_TRACKING = 150;
        private static final int STOP_ACTIVITY_HIDE = 104;
        private static final int STOP_ACTIVITY_SHOW = 103;
        private static final int STOP_BINDER_TRACKING_AND_DUMP = 151;
        private static final int STOP_SERVICE = 116;
        private static final int SUICIDE = 130;
        private static final int TRANSLUCENT_CONVERSION_COMPLETE = 144;
        private static final int TRIM_MEMORY = 140;
        private static final int UNBIND_SERVICE = 122;
        private static final int UNSTABLE_PROVIDER_DIED = 142;
        private static final int UPDATE_PACKAGE_COMPATIBILITY_INFO = 139;

        /* JADX INFO: Access modifiers changed from: private */
        public static String code2String(int i10) {
            switch (i10) {
                case 100:
                    return "LAUNCH_ACTIVITY";
                case 101:
                    return "PAUSE_ACTIVITY";
                case 102:
                    return "PAUSE_ACTIVITY_FINISHING";
                case 103:
                    return "STOP_ACTIVITY_SHOW";
                case 104:
                    return "STOP_ACTIVITY_HIDE";
                case 105:
                    return "SHOW_WINDOW";
                case 106:
                    return "HIDE_WINDOW";
                case 107:
                    return "RESUME_ACTIVITY";
                case 108:
                    return "SEND_RESULT";
                case 109:
                    return "DESTROY_ACTIVITY";
                case 110:
                    return "BIND_APPLICATION";
                case 111:
                    return "EXIT_APPLICATION";
                case 112:
                    return "NEW_INTENT";
                case 113:
                    return "RECEIVER";
                case 114:
                    return "CREATE_SERVICE";
                case 115:
                    return "SERVICE_ARGS";
                case 116:
                    return "STOP_SERVICE";
                case 117:
                case 157:
                default:
                    return Integer.toString(i10);
                case 118:
                    return "CONFIGURATION_CHANGED";
                case 119:
                    return "CLEAN_UP_CONTEXT";
                case 120:
                    return "GC_WHEN_IDLE";
                case 121:
                    return "BIND_SERVICE";
                case 122:
                    return "UNBIND_SERVICE";
                case 123:
                    return "DUMP_SERVICE";
                case 124:
                    return "LOW_MEMORY";
                case 125:
                    return "ACTIVITY_CONFIGURATION_CHANGED";
                case 126:
                    return "RELAUNCH_ACTIVITY";
                case 127:
                    return "PROFILER_CONTROL";
                case 128:
                    return "CREATE_BACKUP_AGENT";
                case 129:
                    return "DESTROY_BACKUP_AGENT";
                case 130:
                    return "SUICIDE";
                case 131:
                    return "REMOVE_PROVIDER";
                case 132:
                    return "ENABLE_JIT";
                case 133:
                    return "DISPATCH_PACKAGE_BROADCAST";
                case 134:
                    return "SCHEDULE_CRASH";
                case 135:
                    return "DUMP_HEAP";
                case 136:
                    return "DUMP_ACTIVITY";
                case 137:
                    return "SLEEPING";
                case 138:
                    return "SET_CORE_SETTINGS";
                case 139:
                    return "UPDATE_PACKAGE_COMPATIBILITY_INFO";
                case 140:
                    return "TRIM_MEMORY";
                case 141:
                    return "DUMP_PROVIDER";
                case 142:
                    return "UNSTABLE_PROVIDER_DIED";
                case 143:
                    return "REQUEST_ASSIST_CONTEXT_EXTRAS";
                case 144:
                    return "TRANSLUCENT_CONVERSION_COMPLETE";
                case 145:
                    return "INSTALL_PROVIDER";
                case 146:
                    return "ON_NEW_ACTIVITY_OPTIONS";
                case 147:
                    return "CANCEL_VISIBLE_BEHIND";
                case 148:
                    return "BACKGROUND_VISIBLE_BEHIND_CHANGED";
                case 149:
                    return "ENTER_ANIMATION_COMPLETE";
                case 150:
                    return "START_BINDER_TRACKING";
                case 151:
                    return "STOP_BINDER_TRACKING_AND_DUMP";
                case 152:
                    return "MULTI_WINDOW_MODE_CHANGED";
                case 153:
                    return "PICTURE_IN_PICTURE_MODE_CHANGED";
                case 154:
                    return "LOCAL_VOICE_INTERACTION_STARTED";
                case 155:
                    return "ATTACH_AGENT";
                case 156:
                    return "APPLICATION_INFO_CHANGED";
                case 158:
                    return "RUN_ISOLATED_ENTRY_POINT";
                case 159:
                    return "EXECUTE_TRANSACTION";
                case 160:
                    return "RELAUNCH_ACTIVITY";
            }
        }
    }

    public static class Util {
        private static boolean compatTest = false;
        private static boolean fuckHuaWeiFlag = false;
        public static final int LAUNCH_ACTIVITY = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.LAUNCH_ACTIVITY(), -1);
        public static final int PAUSE_ACTIVITY = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.PAUSE_ACTIVITY(), -1);
        public static final int PAUSE_ACTIVITY_FINISHING = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.PAUSE_ACTIVITY_FINISHING(), -1);
        public static final int STOP_ACTIVITY_SHOW = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.STOP_ACTIVITY_SHOW(), -1);
        public static final int STOP_ACTIVITY_HIDE = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.STOP_ACTIVITY_HIDE(), -1);
        public static final int SHOW_WINDOW = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.SHOW_WINDOW(), -1);
        public static final int HIDE_WINDOW = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.HIDE_WINDOW(), -1);
        public static final int RESUME_ACTIVITY = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.RESUME_ACTIVITY(), -1);
        public static final int SEND_RESULT = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.SEND_RESULT(), -1);
        public static final int DESTROY_ACTIVITY = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.DESTROY_ACTIVITY(), -1);
        public static final int BIND_APPLICATION = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.BIND_APPLICATION(), -1);
        public static final int EXIT_APPLICATION = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.EXIT_APPLICATION(), -1);
        public static final int NEW_INTENT = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.NEW_INTENT(), -1);
        public static final int RECEIVER = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.RECEIVER(), -1);
        public static final int CREATE_SERVICE = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.CREATE_SERVICE(), -1);
        public static final int SERVICE_ARGS = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.SERVICE_ARGS(), -1);
        public static final int STOP_SERVICE = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.STOP_SERVICE(), -1);
        public static final int CONFIGURATION_CHANGED = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.CONFIGURATION_CHANGED(), -1);
        public static final int CLEAN_UP_CONTEXT = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.CLEAN_UP_CONTEXT(), -1);
        public static final int GC_WHEN_IDLE = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.GC_WHEN_IDLE(), -1);
        public static final int BIND_SERVICE = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.BIND_SERVICE(), -1);
        public static final int UNBIND_SERVICE = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.UNBIND_SERVICE(), -1);
        public static final int DUMP_SERVICE = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.DUMP_SERVICE(), -1);
        public static final int LOW_MEMORY = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.LOW_MEMORY(), -1);
        public static final int PROFILER_CONTROL = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.PROFILER_CONTROL(), -1);
        public static final int CREATE_BACKUP_AGENT = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.CREATE_BACKUP_AGENT(), -1);
        public static final int DESTROY_BACKUP_AGENT = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.DESTROY_BACKUP_AGENT(), -1);
        public static final int SUICIDE = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.SUICIDE(), -1);
        public static final int REMOVE_PROVIDER = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.REMOVE_PROVIDER(), -1);
        public static final int ENABLE_JIT = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.ENABLE_JIT(), -1);
        public static final int DISPATCH_PACKAGE_BROADCAST = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.DISPATCH_PACKAGE_BROADCAST(), -1);
        public static final int SCHEDULE_CRASH = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.SCHEDULE_CRASH(), -1);
        public static final int DUMP_HEAP = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.DUMP_HEAP(), -1);
        public static final int DUMP_ACTIVITY = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.DUMP_ACTIVITY(), -1);
        public static final int SLEEPING = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.SLEEPING(), -1);
        public static final int SET_CORE_SETTINGS = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.SET_CORE_SETTINGS(), -1);
        public static final int UPDATE_PACKAGE_COMPATIBILITY_INFO = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.UPDATE_PACKAGE_COMPATIBILITY_INFO(), -1);
        public static final int DUMP_PROVIDER = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.DUMP_PROVIDER(), -1);
        public static final int UNSTABLE_PROVIDER_DIED = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.UNSTABLE_PROVIDER_DIED(), -1);
        public static final int REQUEST_ASSIST_CONTEXT_EXTRAS = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.REQUEST_ASSIST_CONTEXT_EXTRAS(), -1);
        public static final int TRANSLUCENT_CONVERSION_COMPLETE = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.TRANSLUCENT_CONVERSION_COMPLETE(), -1);
        public static final int INSTALL_PROVIDER = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.INSTALL_PROVIDER(), -1);
        public static final int ON_NEW_ACTIVITY_OPTIONS = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.ON_NEW_ACTIVITY_OPTIONS(), -1);
        public static final int ENTER_ANIMATION_COMPLETE = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.ENTER_ANIMATION_COMPLETE(), -1);
        public static final int START_BINDER_TRACKING = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.START_BINDER_TRACKING(), -1);
        public static final int STOP_BINDER_TRACKING_AND_DUMP = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.STOP_BINDER_TRACKING_AND_DUMP(), -1);
        public static final int LOCAL_VOICE_INTERACTION_STARTED = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.LOCAL_VOICE_INTERACTION_STARTED(), -1);
        public static final int ATTACH_AGENT = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.ATTACH_AGENT(), -1);
        public static final int APPLICATION_INFO_CHANGED = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.APPLICATION_INFO_CHANGED(), -1);
        public static final int RUN_ISOLATED_ENTRY_POINT = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.RUN_ISOLATED_ENTRY_POINT(), -1);
        public static final int EXECUTE_TRANSACTION = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.EXECUTE_TRANSACTION(), -1);
        public static final int RELAUNCH_ACTIVITY = NakedStaticInt.getSafe(ActivityThreadCAG.f165275C.f165277H.RELAUNCH_ACTIVITY(), -1);

        static {
            if (compatTest) {
                return;
            }
            fuckHuaWeiFlag = ActivityThreadCAG.f165276G.handleCreateService().paramList().length > 1;
            compatTest = true;
        }

        public static Object ctorBindServiceData(IBinder iBinder, Intent intent, boolean z10) {
            try {
                Object objNewInstance = ActivityThreadCAG.f165276G.BindServiceData.ctor().newInstance();
                ActivityThreadCAG.f165276G.BindServiceData.token().set(objNewInstance, iBinder);
                ActivityThreadCAG.f165276G.BindServiceData.intent().set(objNewInstance, intent);
                ActivityThreadCAG.f165276G.BindServiceData.rebind().set(objNewInstance, z10);
                return objNewInstance;
            } catch (Throwable th) {
                Bundle bundle = new Bundle();
                try {
                    Class<?> clsClassForName = ClassAccessorUtils.classForName("android.app.ActivityThread");
                    StringBuilder sb2 = new StringBuilder();
                    Class<?>[] declaredClasses = clsClassForName.getDeclaredClasses();
                    Class<?> clsClassForName2 = null;
                    if (declaredClasses == null || declaredClasses.length == 0) {
                        sb2.append("inner class is empty");
                    } else {
                        sb2.append("inner class count:" + declaredClasses.length);
                        sb2.append("---");
                        int length = declaredClasses.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                break;
                            }
                            Class<?> cls = declaredClasses[i10];
                            sb2.append(cls.getSimpleName());
                            sb2.append(",");
                            if (cls.getSimpleName().equalsIgnoreCase("BindServiceData")) {
                                clsClassForName2 = cls;
                                break;
                            }
                            i10++;
                        }
                    }
                    if (clsClassForName2 == null) {
                        clsClassForName2 = ClassAccessorUtils.classForName("android.app.ActivityThread$BindServiceData");
                    }
                    if (clsClassForName2 != null) {
                        sb2.append("** svcBindData exists");
                        Constructor<?>[] declaredConstructors = clsClassForName2.getDeclaredConstructors();
                        if (declaredConstructors != null && declaredConstructors.length != 0) {
                            int i11 = 0;
                            for (Constructor<?> constructor : declaredConstructors) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("; ctor no:: ");
                                i11++;
                                sb3.append(i11);
                                sb2.append(sb3.toString());
                                Class<?>[] parameterTypes = constructor.getParameterTypes();
                                if (parameterTypes == null || parameterTypes.length == 0) {
                                    sb2.append("param_count=0.");
                                } else {
                                    sb2.append(",params: ");
                                    for (Class<?> cls2 : parameterTypes) {
                                        sb2.append(cls2.getSimpleName());
                                        sb2.append(",");
                                    }
                                }
                            }
                        }
                        Field[] declaredFields = clsClassForName2.getDeclaredFields();
                        if (declaredFields == null || declaredFields.length == 0) {
                            sb2.append("-->svcBindData fields count=0");
                        } else {
                            sb2.append("-->svcBindData fields count:" + declaredFields.length);
                            for (Field field : declaredFields) {
                                sb2.append("field: ");
                                sb2.append(field.getName());
                                sb2.append(",");
                            }
                        }
                    } else {
                        sb2.append("** svcBindData is empty");
                    }
                    bundle.putString("info", sb2.toString());
                    C5705o.c().a(th, "ctorBindServiceData", bundle);
                } catch (Throwable unused) {
                }
                throw th;
            }
        }

        public static Object ctorCreateServiceData(IBinder iBinder, ServiceInfo serviceInfo, Object obj) {
            Object objNewInstance = ActivityThreadCAG.f165276G.CreateServiceData.ctor().newInstance();
            ActivityThreadCAG.f165276G.CreateServiceData.token().set(objNewInstance, iBinder);
            ActivityThreadCAG.f165276G.CreateServiceData.info().set(objNewInstance, serviceInfo);
            ActivityThreadCAG.f165276G.CreateServiceData.compatInfo().set(objNewInstance, obj);
            return objNewInstance;
        }

        public static Object ctorServiceArgsData(IBinder iBinder, boolean z10, int i10, int i11, Intent intent) {
            Object objNewInstance = ActivityThreadCAG.f165276G.ServiceArgsData.ctor().newInstance();
            ActivityThreadCAG.f165276G.ServiceArgsData.token().set(objNewInstance, iBinder);
            ActivityThreadCAG.f165276G.ServiceArgsData.taskRemoved().set(objNewInstance, z10);
            ActivityThreadCAG.f165276G.ServiceArgsData.startId().set(objNewInstance, i10);
            ActivityThreadCAG.f165276G.ServiceArgsData.flags().set(objNewInstance, i11);
            ActivityThreadCAG.f165276G.ServiceArgsData.args().set(objNewInstance, intent);
            return objNewInstance;
        }

        public static Object getActivityClientRecord(Object obj, IBinder iBinder) {
            if (C3841e.z()) {
                return ActivityThreadCAG.S31.mActivities().get(obj).get(iBinder);
            }
            return null;
        }

        public static Handler getHandler(Object obj) {
            return ActivityThreadCAG.f165276G.getHandler().call(obj, new Object[0]);
        }

        public static ServiceInfo getInfoOfCreateServiceData(Object obj) {
            return ActivityThreadCAG.f165276G.CreateServiceData.info().get(obj);
        }

        public static Instrumentation getInstrumentation(Object obj) {
            return ActivityThreadCAG.f165276G.mInstrumentation().get(obj);
        }

        public static Intent getIntentOfNewIntentData(Object obj) {
            List list;
            if (obj == null || (list = (List) ActivityThreadCAG.f165276G.NewIntentData.intents().get(obj)) == null) {
                return null;
            }
            return (Intent) list.get(0);
        }

        public static Object getLaunchingActivityClientRecord(Object obj, IBinder iBinder) {
            if (C3841e.D()) {
                return ActivityThreadCAG.S31.mActivities().get(obj).get(iBinder);
            }
            if (C3841e.z()) {
                return ActivityThreadCAG.S31.mLaunchingActivities().get(obj).get(iBinder);
            }
            return null;
        }

        public static String getMsgCodeName(int i10) {
            return MsgCodes.code2String(i10);
        }

        public static List<Object> getResultsOfResultData(Object obj) {
            return ActivityThreadCAG.f165275C.ResultData.results() == null ? new LinkedList() : (List) ActivityThreadCAG.f165275C.ResultData.results().get(obj);
        }

        public static Service getServiceByToken(Object obj, IBinder iBinder) {
            return ActivityThreadCAG.f165276G.mServices().get(obj).get(iBinder);
        }

        public static Object getmAllApplications(Object obj) {
            if (ActivityThreadCAG.f165275C.mAllApplications() != null) {
                return ActivityThreadCAG.f165275C.mAllApplications().get(obj);
            }
            return null;
        }

        public static void handleBindService(Object obj, Object obj2) {
            if (fuckHuaWeiFlag) {
                ActivityThreadCAG.f165276G.handleBindService().call(obj, obj2, 0);
            } else {
                ActivityThreadCAG.f165276G.handleBindService().call(obj, obj2);
            }
        }

        public static void handleCreateService(Object obj, Object obj2) {
            if (fuckHuaWeiFlag) {
                ActivityThreadCAG.f165276G.handleCreateService().call(obj, obj2, 0);
            } else {
                ActivityThreadCAG.f165276G.handleCreateService().call(obj, obj2);
            }
        }

        public static void handleServiceArgs(Object obj, Object obj2) {
            if (fuckHuaWeiFlag) {
                ActivityThreadCAG.f165276G.handleServiceArgs().call(obj, obj2, 0);
            } else {
                ActivityThreadCAG.f165276G.handleServiceArgs().call(obj, obj2);
            }
        }

        public static void handleStopService(Object obj, IBinder iBinder) {
            if (fuckHuaWeiFlag) {
                ActivityThreadCAG.f165276G.handleStopService().call(obj, iBinder, 0);
            } else {
                ActivityThreadCAG.f165276G.handleStopService().call(obj, iBinder);
            }
        }

        public static void handleUnbindService(Object obj, Object obj2) {
            if (fuckHuaWeiFlag) {
                ActivityThreadCAG.f165276G.handleUnbindService().call(obj, obj2, 0);
            } else {
                ActivityThreadCAG.f165276G.handleUnbindService().call(obj, obj2);
            }
        }

        public static boolean hasActivityClientRecord(Object obj, IBinder iBinder) {
            Map<IBinder, Object> map = ActivityThreadCAG.f165276G.mActivities().get(obj);
            return (map == null || map.get(iBinder) == null) ? false : true;
        }

        public static Object installProvider(Object obj, Context context, ProviderInfo providerInfo, Object obj2) {
            NakedMethod<Object> nakedMethodInstallProvider = ActivityThreadCAG.f165276G.installProvider();
            Boolean bool = Boolean.TRUE;
            return nakedMethodInstallProvider.call(obj, context, obj2, providerInfo, Boolean.FALSE, bool, bool);
        }

        public static Object instanceLoadedApk(Object obj, ApplicationInfo applicationInfo) {
            return C3841e.E() ? ActivityThreadCAG.U34.getPackageInfoNoCheck().call(obj, applicationInfo) : C3841e.D() ? ActivityThreadCAG.T33.getPackageInfoNoCheck().call(obj, applicationInfo, CompatibilityInfoCompat2.Util.DEFAULT_COMPATIBILITY_INFO, Boolean.FALSE) : ActivityThreadCAG.J16.getPackageInfoNoCheck().call(obj, applicationInfo, CompatibilityInfoCompat2.Util.DEFAULT_COMPATIBILITY_INFO);
        }

        public static boolean isInstanceOfResultData(Object obj) {
            return (obj == null || ActivityThreadCAG.f165275C.ResultData.ORG_CLASS() == null || !ActivityThreadCAG.f165275C.ResultData.ORG_CLASS().isInstance(obj)) ? false : true;
        }

        public static boolean isInstanceOfServiceArgsData(Object obj) {
            return (obj == null || ActivityThreadCAG.f165276G.ServiceArgsData.ORG_CLASS() == null || !ActivityThreadCAG.f165276G.ServiceArgsData.ORG_CLASS().isInstance(obj)) ? false : true;
        }

        public static void setInstrumentation(Object obj, Instrumentation instrumentation) {
            ActivityThreadCAG.f165276G.mInstrumentation().set(obj, instrumentation);
        }

        public static void setIntentOfNewIntentData(Object obj, Intent intent) {
            List list;
            if (obj == null || (list = (List) ActivityThreadCAG.f165276G.NewIntentData.intents().get(obj)) == null) {
                return;
            }
            ActivityThreadCAG.f165276G.NewIntentData.intents().set(obj, Collections.singletonList(ReferrerIntentCompat2.Util.ctor(intent, ReferrerIntentCompat2.Util.getMReferrer(list.get(0)))));
        }

        public static void setResultsOfResultData(Object obj, List<Object> list) {
            if (ActivityThreadCAG.f165275C.ResultData.results() != null) {
                ActivityThreadCAG.f165275C.ResultData.results().set(obj, list);
            }
        }

        public static String toStringResultData(Object obj) {
            StringBuilder sbA = a.a("(_class:ActivityThread$ResultData, ");
            if (ActivityThreadCAG.f165275C.ResultData.token() != null) {
                sbA.append("token:");
                sbA.append(ActivityThreadCAG.f165275C.ResultData.token().get(obj));
                sbA.append(j.f68738d);
            }
            if (ActivityThreadCAG.f165275C.ResultData.results() != null) {
                sbA.append("results:");
                sbA.append(j.I(ActivityThreadCAG.f165275C.ResultData.results().get(obj)));
                sbA.append(j.f68738d);
            }
            if (sbA.length() > 2 && sbA.substring(sbA.length() - 2).equals(j.f68738d)) {
                sbA.delete(sbA.length() - 2, sbA.length());
            }
            sbA.append(")");
            return sbA.toString();
        }

        public static String toStringServiceArgsData(Object obj) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(");
            j.F(sb2, "_class", "ActivityThread$ServiceArgsData");
            j.F(sb2, BidResponsed.KEY_TOKEN, ActivityThreadCAG.f165276G.ServiceArgsData.token().get(obj));
            j.F(sb2, "startId", Integer.valueOf(ActivityThreadCAG.f165276G.ServiceArgsData.startId().get(obj)));
            j.F(sb2, "flags", j.M(ActivityThreadCAG.f165276G.ServiceArgsData.flags().get(obj)));
            j.H(sb2, "args", ActivityThreadCAG.f165276G.ServiceArgsData.args().get(obj));
            j.G(sb2);
            sb2.append(")");
            return sb2.toString();
        }
    }
}
