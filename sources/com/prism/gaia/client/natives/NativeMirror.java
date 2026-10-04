package com.prism.gaia.client.natives;

import B0.C0922f;
import D9.d;
import U6.c;
import Z6.b;
import android.annotation.SuppressLint;
import android.hardware.Camera;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.Visualizer;
import android.os.Binder;
import android.os.Build;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.compose.runtime.changelist.j;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.compat.NativeLibraryHelperCompat;
import com.prism.gaia.helper.io.GFile;
import com.prism.gaia.helper.utils.OatUtils;
import com.prism.gaia.helper.utils.l;
import com.prism.gaia.helper.utils.o;
import com.prism.gaia.naked.compat.android.content.AttributionSourceCompat2;
import com.prism.gaia.remote.GuestAppInfo;
import com.prism.gaia.server.pm.C;
import dalvik.system.DexFile;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.NetworkInterface;
import java.util.HashMap;
import java.util.Map;
import o8.C5335a;
import v8.C5707q;
import v8.C5714x;
import v8.C5716z;
import w.y;

/* JADX INFO: loaded from: classes6.dex */
public class NativeMirror {
    private static String gaiaNativeLibrary;
    private static Boolean sContainerCallingUid;
    private static final String TAG = "asdf-".concat("NativeMirror");
    private static Map<String, GuestAppInfo> cachedInsideDexFilePathMap = new HashMap();
    private static volatile boolean androidVmHookOKFlag = false;
    private static volatile boolean androidLibHookOKFlag = false;
    private static volatile boolean guestCrashReporterFlag = false;
    private static volatile boolean libLoaded = false;
    private static final Map<String, String> tempFileRedirectMap = new HashMap();
    private static final Map<String, String> subDirReplaceMap = new HashMap();
    private static boolean vpnSocketHookFlag = false;

    public static class AndroidVMNativeMethods {
        private static final Object[][] needHookVmNativeMethodArgs;
        private static final Method[] needHookVmNativeMethods;

        static {
            VmNativeMethodIndex vmNativeMethodIndex = VmNativeMethodIndex.IDX_LENGTH;
            needHookVmNativeMethods = new Method[vmNativeMethodIndex.ordinal()];
            needHookVmNativeMethodArgs = new Object[vmNativeMethodIndex.ordinal()][];
        }

        private static Method findShape(Class<?> cls, String str, int i10, int i11, Class<?> cls2) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().equals(str)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == i10 && i11 < parameterTypes.length && parameterTypes[i11] == cls2) {
                        method.setAccessible(true);
                        return method;
                    }
                }
            }
            return null;
        }

        public static Method[] getNeedHookAndroidMethods() {
            return needHookVmNativeMethods;
        }

        public static Object[][] getNeedHookVmNativeMethodArgs() {
            return needHookVmNativeMethodArgs;
        }

        public static void init() {
            if (b.a() && C5335a.a()) {
                needHook_NetworkUtilsInternal_protectFromVpn();
            }
            needHook_Runtime_nativeLoad();
            needHook_DexFile_openDexFileNative();
            needHook_Camera_nativeSetup();
            needHook_AudioRecord_nativeCheckPermission();
            needHook_NetworkInterface_getAll();
            needHook_NetworkInterface_getByName0();
            needHook_MediaRecorder_nativeSetup();
            needHook_AudioTrack_nativeSetup();
            needHook_AudioRecord_nativeSetup();
            needHook_MediaPlayer_nativeSetup();
            needHook_AudioEffect_nativeSetup();
            needHook_Visualizer_nativeSetup();
            needHook_MiuiShell_runtimeSharedValue();
        }

        public static void needHook_AudioEffect_nativeSetup() {
            Method methodFindShape = findShape(AudioEffect.class, "native_setup", 11, 9, Parcel.class);
            if (methodFindShape != null) {
                setHook(VmNativeMethodIndex.IDX_AudioEffect_nativeSetup, methodFindShape, 1, "AudioEffect.native_setup");
            } else {
                setHook(VmNativeMethodIndex.IDX_AudioEffect_nativeSetup, findShape(AudioEffect.class, "native_setup", 11, 9, String.class), 2, "AudioEffect.native_setup");
            }
        }

        public static void needHook_AudioRecord_nativeCheckPermission() {
            Method method;
            int iOrdinal = VmNativeMethodIndex.IDX_AudioRecord_nativeCheckPermission.ordinal();
            Method[] declaredMethods = AudioRecord.class.getDeclaredMethods();
            int length = declaredMethods.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i10];
                if (method.getName().equals("native_check_permission") && method.getParameterTypes().length == 1 && method.getParameterTypes()[0] == String.class) {
                    method.setAccessible(true);
                    break;
                }
                i10++;
            }
            needHookVmNativeMethods[iOrdinal] = method;
            needHookVmNativeMethodArgs[iOrdinal] = null;
            if (method != null) {
                String unused = NativeMirror.TAG;
            } else {
                String unused2 = NativeMirror.TAG;
            }
        }

        public static void needHook_AudioRecord_nativeSetup() {
            Method methodFindShape = findShape(AudioRecord.class, "native_setup", 12, 8, Parcel.class);
            if (methodFindShape != null) {
                setHook(VmNativeMethodIndex.IDX_AudioRecord_nativeSetup, methodFindShape, 3, "AudioRecord.native_setup");
                return;
            }
            Method methodFindShape2 = findShape(AudioRecord.class, "native_setup", 11, 8, Parcel.class);
            if (methodFindShape2 != null) {
                setHook(VmNativeMethodIndex.IDX_AudioRecord_nativeSetup, methodFindShape2, 2, "AudioRecord.native_setup");
                return;
            }
            Method methodFindShape3 = findShape(AudioRecord.class, "native_setup", 11, 7, Parcel.class);
            if (methodFindShape3 != null) {
                setHook(VmNativeMethodIndex.IDX_AudioRecord_nativeSetup, methodFindShape3, 4, "AudioRecord.native_setup");
                return;
            }
            Method methodFindShape4 = findShape(AudioRecord.class, "native_setup", 10, 8, String.class);
            if (methodFindShape4 != null) {
                setHook(VmNativeMethodIndex.IDX_AudioRecord_nativeSetup, methodFindShape4, 1, "AudioRecord.native_setup");
            } else {
                setHook(VmNativeMethodIndex.IDX_AudioRecord_nativeSetup, null, 0, null);
                String unused = NativeMirror.TAG;
            }
        }

        public static void needHook_AudioTrack_nativeSetup() {
            VmNativeMethodIndex vmNativeMethodIndex = VmNativeMethodIndex.IDX_AudioTrack_nativeSetup;
            int iOrdinal = vmNativeMethodIndex.ordinal();
            needHookVmNativeMethods[iOrdinal] = null;
            needHookVmNativeMethodArgs[iOrdinal] = null;
            if (!C3841e.E()) {
                String unused = NativeMirror.TAG;
                return;
            }
            Method methodFindShape = findShape(AudioTrack.class, "native_setup", 16, 9, Parcel.class);
            if (methodFindShape != null) {
                setHook(vmNativeMethodIndex, methodFindShape, 2, "AudioTrack.native_setup");
                return;
            }
            Method methodFindShape2 = findShape(AudioTrack.class, "native_setup", 15, 9, Parcel.class);
            if (methodFindShape2 != null) {
                setHook(vmNativeMethodIndex, methodFindShape2, 1, "AudioTrack.native_setup");
                return;
            }
            Method methodFindShape3 = findShape(AudioTrack.class, "native_setup", 15, 8, Parcel.class);
            if (methodFindShape3 != null) {
                setHook(vmNativeMethodIndex, methodFindShape3, 3, "AudioTrack.native_setup");
            } else {
                setHook(vmNativeMethodIndex, null, 0, null);
                String unused2 = NativeMirror.TAG;
            }
        }

        public static void needHook_Binder_getCallingUid() {
            Method method;
            int iOrdinal = VmNativeMethodIndex.IDX_Binder_getCallingUid.ordinal();
            Method[] declaredMethods = Binder.class.getDeclaredMethods();
            int length = declaredMethods.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i10];
                if (method.getName().endsWith("getCallingUid")) {
                    method.setAccessible(true);
                    break;
                }
                i10++;
            }
            needHookVmNativeMethods[iOrdinal] = method;
            needHookVmNativeMethodArgs[iOrdinal] = null;
            if (method != null) {
                String unused = NativeMirror.TAG;
            } else {
                String unused2 = NativeMirror.TAG;
            }
        }

        public static void needHook_Camera_nativeSetup() {
            int iOrdinal = VmNativeMethodIndex.IDX_Camera_nativeSetup.ordinal();
            int i10 = 3;
            Class cls = Integer.TYPE;
            Method methodTryReflectMethod = tryReflectMethod("native_setup", Camera.class, Object.class, cls, String.class);
            if (methodTryReflectMethod != null) {
                i10 = 1;
            } else {
                Method methodTryReflectMethod2 = tryReflectMethod("native_setup", Camera.class, Object.class, cls, cls, String.class);
                if (methodTryReflectMethod2 != null) {
                    i10 = 2;
                    methodTryReflectMethod = methodTryReflectMethod2;
                } else {
                    Class cls2 = Boolean.TYPE;
                    Method methodTryReflectMethod3 = tryReflectMethod("native_setup", Camera.class, Object.class, cls, cls, String.class, cls2);
                    if (methodTryReflectMethod3 != null) {
                        methodTryReflectMethod = methodTryReflectMethod3;
                    } else {
                        Method methodTryReflectMethod4 = tryReflectMethod("native_setup", Camera.class, Object.class, cls, String.class, cls2);
                        if (methodTryReflectMethod4 != null) {
                            methodTryReflectMethod = methodTryReflectMethod4;
                            i10 = 4;
                        } else {
                            methodTryReflectMethod = findShape(Camera.class, "native_setup", 6, 4, Parcel.class);
                            i10 = 7;
                            if (methodTryReflectMethod == null) {
                                methodTryReflectMethod = findShape(Camera.class, "native_setup", 7, 2, String.class);
                                if (methodTryReflectMethod != null) {
                                    i10 = 6;
                                } else {
                                    methodTryReflectMethod = findShape(Camera.class, "native_setup", 5, 2, String.class);
                                    i10 = methodTryReflectMethod != null ? 5 : -1;
                                }
                            }
                        }
                    }
                }
            }
            if (methodTryReflectMethod != null) {
                methodTryReflectMethod.setAccessible(true);
            }
            needHookVmNativeMethods[iOrdinal] = methodTryReflectMethod;
            needHookVmNativeMethodArgs[iOrdinal] = new Object[]{Integer.valueOf(i10)};
            if (methodTryReflectMethod != null) {
                String unused = NativeMirror.TAG;
            } else {
                String unused2 = NativeMirror.TAG;
            }
        }

        public static void needHook_DexFile_openDexFileNative() {
            Method method;
            int iOrdinal = VmNativeMethodIndex.IDX_DexFile_openDexFileNative.ordinal();
            Method[] declaredMethods = DexFile.class.getDeclaredMethods();
            int length = declaredMethods.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i10];
                if (method.getName().equals("openDexFileNative")) {
                    method.setAccessible(true);
                    break;
                }
                i10++;
            }
            if (method == null) {
                throw new RuntimeException("NativeMirror: Unable to find method: ".concat("openDexFileNative"));
            }
            needHookVmNativeMethods[iOrdinal] = method;
            needHookVmNativeMethodArgs[iOrdinal] = null;
            String unused = NativeMirror.TAG;
        }

        public static void needHook_MediaPlayer_nativeSetup() {
            Method methodFindShape = findShape(MediaPlayer.class, "native_setup", 3, 1, Parcel.class);
            if (methodFindShape != null) {
                setHook(VmNativeMethodIndex.IDX_MediaPlayer_nativeSetup, methodFindShape, 2, "MediaPlayer.native_setup");
            } else {
                setHook(VmNativeMethodIndex.IDX_MediaPlayer_nativeSetup, findShape(MediaPlayer.class, "native_setup", 2, 1, Parcel.class), 1, "MediaPlayer.native_setup");
            }
        }

        public static void needHook_MediaRecorder_nativeSetup() {
            int iOrdinal = VmNativeMethodIndex.IDX_MediaRecorder_nativeSetup.ordinal();
            int i10 = 2;
            Method methodFindShape = findShape(MediaRecorder.class, "native_setup", 3, 2, Parcel.class);
            if (methodFindShape == null) {
                methodFindShape = findShape(MediaRecorder.class, "native_setup", 3, 2, String.class);
            } else {
                i10 = 1;
            }
            needHookVmNativeMethods[iOrdinal] = methodFindShape;
            needHookVmNativeMethodArgs[iOrdinal] = methodFindShape == null ? null : new Object[]{Integer.valueOf(i10)};
            if (methodFindShape != null) {
                String unused = NativeMirror.TAG;
            } else {
                String unused2 = NativeMirror.TAG;
            }
        }

        public static void needHook_MiuiShell_runtimeSharedValue() {
            try {
                Class<?> cls = Class.forName("android.miui.Shell");
                String[] strArr = {"nativeGetRuntimeSharedValue", "nativeSetRuntimeSharedValue"};
                VmNativeMethodIndex[] vmNativeMethodIndexArr = {VmNativeMethodIndex.IDX_MiuiShell_nativeGetRuntimeSharedValue, VmNativeMethodIndex.IDX_MiuiShell_nativeSetRuntimeSharedValue};
                Class<?>[][] clsArr = {new Class[]{String.class}, new Class[]{String.class, Long.TYPE}};
                for (int i10 = 0; i10 < 2; i10++) {
                    try {
                        Method declaredMethod = cls.getDeclaredMethod(strArr[i10], clsArr[i10]);
                        if (Modifier.isNative(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                            declaredMethod.setAccessible(true);
                            needHookVmNativeMethods[vmNativeMethodIndexArr[i10].ordinal()] = declaredMethod;
                            needHookVmNativeMethodArgs[vmNativeMethodIndexArr[i10].ordinal()] = null;
                            String unused = NativeMirror.TAG;
                            String str = strArr[i10];
                        } else {
                            String unused2 = NativeMirror.TAG;
                            String str2 = strArr[i10];
                        }
                    } catch (Throwable unused3) {
                        String unused4 = NativeMirror.TAG;
                        String str3 = strArr[i10];
                    }
                }
            } catch (Throwable unused5) {
            }
        }

        public static void needHook_NetworkInterface_getAll() {
            Method method;
            int iOrdinal = VmNativeMethodIndex.IDX_NetworkInterface_getAll.ordinal();
            if (C3841e.s()) {
                needHookVmNativeMethods[iOrdinal] = null;
                needHookVmNativeMethodArgs[iOrdinal] = null;
                String unused = NativeMirror.TAG;
                return;
            }
            Method[] declaredMethods = NetworkInterface.class.getDeclaredMethods();
            int length = declaredMethods.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i10];
                if (method.getName().equals("getAll")) {
                    method.setAccessible(true);
                    break;
                }
                i10++;
            }
            needHookVmNativeMethods[iOrdinal] = method;
            needHookVmNativeMethodArgs[iOrdinal] = null;
            if (method != null) {
                String unused2 = NativeMirror.TAG;
            } else {
                String unused3 = NativeMirror.TAG;
            }
        }

        public static void needHook_NetworkInterface_getByName0() {
            Method method;
            int iOrdinal = VmNativeMethodIndex.IDX_NetworkInterface_getByName0.ordinal();
            if (C3841e.s()) {
                needHookVmNativeMethods[iOrdinal] = null;
                needHookVmNativeMethodArgs[iOrdinal] = null;
                String unused = NativeMirror.TAG;
                return;
            }
            Method[] declaredMethods = NetworkInterface.class.getDeclaredMethods();
            int length = declaredMethods.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i10];
                if (method.getName().equals("getByName0")) {
                    method.setAccessible(true);
                    break;
                }
                i10++;
            }
            needHookVmNativeMethods[iOrdinal] = method;
            needHookVmNativeMethodArgs[iOrdinal] = null;
            if (method != null) {
                String unused2 = NativeMirror.TAG;
            } else {
                String unused3 = NativeMirror.TAG;
            }
        }

        public static void needHook_NetworkUtilsInternal_protectFromVpn() {
            int iOrdinal = VmNativeMethodIndex.IDX_NetworkUtilsInternal_protectFromVpn.ordinal();
            String[] strArr = {"com.android.internal.net.NetworkUtilsInternal", "android.net.NetworkUtils"};
            Method method = null;
            int i10 = 0;
            while (true) {
                if (i10 >= 2) {
                    break;
                }
                try {
                    Method[] declaredMethods = Class.forName(strArr[i10]).getDeclaredMethods();
                    int length = declaredMethods.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            break;
                        }
                        Method method2 = declaredMethods[i11];
                        if (method2.getName().equals("protectFromVpn") && method2.getParameterTypes().length == 1 && method2.getParameterTypes()[0] == Integer.TYPE) {
                            method2.setAccessible(true);
                            method = method2;
                            break;
                        }
                        i11++;
                    }
                } catch (Throwable unused) {
                    String unused2 = NativeMirror.TAG;
                }
                if (method != null) {
                    String unused3 = NativeMirror.TAG;
                    break;
                }
                i10++;
            }
            needHookVmNativeMethods[iOrdinal] = method;
            needHookVmNativeMethodArgs[iOrdinal] = null;
            if (method != null) {
                String unused4 = NativeMirror.TAG;
            } else {
                String unused5 = NativeMirror.TAG;
            }
        }

        public static void needHook_Runtime_nativeLoad() {
            int iOrdinal = VmNativeMethodIndex.IDX_Runtime_nativeLoad.ordinal();
            Method methodTryReflectMethod = C3841e.w() ? tryReflectMethod("nativeLoad", Runtime.class, String.class, ClassLoader.class, Class.class) : C3841e.v() ? tryReflectMethod("nativeLoad", Runtime.class, String.class, ClassLoader.class) : tryReflectMethod("nativeLoad", Runtime.class, String.class, ClassLoader.class, String.class);
            if (methodTryReflectMethod != null) {
                methodTryReflectMethod.setAccessible(true);
            }
            needHookVmNativeMethods[iOrdinal] = methodTryReflectMethod;
            needHookVmNativeMethodArgs[iOrdinal] = null;
            if (methodTryReflectMethod != null) {
                String unused = NativeMirror.TAG;
            } else {
                String unused2 = NativeMirror.TAG;
            }
        }

        public static void needHook_Visualizer_nativeSetup() {
            Method methodFindShape = findShape(Visualizer.class, "native_setup", 4, 3, Parcel.class);
            if (methodFindShape != null) {
                setHook(VmNativeMethodIndex.IDX_Visualizer_nativeSetup, methodFindShape, 1, "Visualizer.native_setup");
            } else {
                setHook(VmNativeMethodIndex.IDX_Visualizer_nativeSetup, findShape(Visualizer.class, "native_setup", 4, 3, String.class), 2, "Visualizer.native_setup");
            }
        }

        private static void setHook(VmNativeMethodIndex vmNativeMethodIndex, Method method, int i10, String str) {
            int iOrdinal = vmNativeMethodIndex.ordinal();
            if (method == null) {
                needHookVmNativeMethods[iOrdinal] = null;
                needHookVmNativeMethodArgs[iOrdinal] = null;
            } else {
                needHookVmNativeMethods[iOrdinal] = method;
                needHookVmNativeMethodArgs[iOrdinal] = new Object[]{Integer.valueOf(i10)};
                String unused = NativeMirror.TAG;
            }
        }

        private static Method tryReflectMethod(String str, Class<?> cls, Class<?>... clsArr) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static class VmNativeMethodArg {

        public static class AudioRecord_nativeSetup_ParamType {
            public static final int PARAM_A33 = 2;
            public static final int PARAM_A34 = 3;
            public static final int PARAM_A37 = 4;
            public static final int PARAM_STR = 1;
        }

        public static class AudioTrack_nativeSetup_ParamType {
            public static final int PARAM_A34 = 1;
            public static final int PARAM_A36 = 2;
            public static final int PARAM_A37 = 3;
        }

        public static class Camera_nativeSetup_ParamType {
            public static final int PARAM_A34 = 5;
            public static final int PARAM_A35 = 6;
            public static final int PARAM_A36 = 7;
            public static final int PARAM_OBJ_INT_INT_STR = 2;
            public static final int PARAM_OBJ_INT_INT_STR_BOOL = 3;
            public static final int PARAM_OBJ_INT_STR = 1;
            public static final int PARAM_OBJ_INT_STR_BOOL = 4;
        }

        public static class MediaPlayer_nativeSetup_ParamType {
            public static final int PARAM_A33 = 1;
            public static final int PARAM_A34 = 2;
        }

        public static class MediaRecorder_nativeSetup_ParamType {
            public static final int PARAM_PARCEL = 1;
            public static final int PARAM_STR = 2;
        }
    }

    public enum VmNativeMethodIndex {
        IDX_Binder_getCallingUid,
        IDX_Runtime_nativeLoad,
        IDX_DexFile_openDexFileNative,
        IDX_Camera_nativeSetup,
        IDX_AudioRecord_nativeCheckPermission,
        IDX_NetworkInterface_getAll,
        IDX_NetworkInterface_getByName0,
        IDX_MediaRecorder_nativeSetup,
        IDX_AudioTrack_nativeSetup,
        IDX_AudioRecord_nativeSetup,
        IDX_MediaPlayer_nativeSetup,
        IDX_AudioEffect_nativeSetup,
        IDX_Visualizer_nativeSetup,
        IDX_NetworkUtilsInternal_protectFromVpn,
        IDX_MiuiShell_nativeGetRuntimeSharedValue,
        IDX_MiuiShell_nativeSetRuntimeSharedValue,
        IDX_LENGTH
    }

    public static void addRuleRedirectDirPrefix(String str, String str2) {
        if (!str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            str = str.concat(RemoteSettings.FORWARD_SLASH_STRING);
        }
        if (!str2.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            str2 = str2.concat(RemoteSettings.FORWARD_SLASH_STRING);
        }
        Map<String, String> map = subDirReplaceMap;
        synchronized (map) {
            map.put(str, str2);
        }
    }

    public static void addRuleRedirectFile(String str, String str2) {
        if (str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            str = C0922f.a(str, 1, 0);
        }
        if (str2.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            str2 = C0922f.a(str2, 1, 0);
        }
        Map<String, String> map = tempFileRedirectMap;
        synchronized (map) {
            map.put(str, str2);
        }
    }

    private static GuestAppInfo chkUpdCachedInstalledAppInfo(String str) {
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            GuestAppInfo guestAppInfo = cachedInsideDexFilePathMap.get(canonicalPath);
            if (guestAppInfo != null) {
                return guestAppInfo;
            }
            updCached();
            return cachedInsideDexFilePathMap.get(canonicalPath);
        } catch (IOException unused) {
            return null;
        }
    }

    public static synchronized void ensureLoadedForSupervisor() {
        if (libLoaded) {
            return;
        }
        try {
            String[] strArr = Build.SUPPORTED_ABIS;
            String str = "gaianative" + NativeLibraryHelperCompat.m(strArr.length > 0 ? strArr[0] : null);
            gaiaNativeLibrary = str;
            System.loadLibrary(str);
            nativeInitHookEnvironment(GaiaContext.j().v(), GaiaContext.c0(), Build.VERSION.SDK_INT);
            libLoaded = true;
        } catch (Throwable unused) {
        }
    }

    private static String guestShipsItsOwnShadowhook() {
        try {
            String strR = GaiaContext.j().r();
            if (strR == null) {
                return null;
            }
            GFile gFile = new GFile(d.r(strR), "lib/" + c.q());
            String[] list = gFile.list();
            if (list == null) {
                return null;
            }
            for (String str : list) {
                if (str.startsWith("libshadowhook") && str.endsWith(".so")) {
                    return new GFile(gFile, str).getAbsolutePath();
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void init(String str) {
        String strA = y.a("gaianative", NativeLibraryHelperCompat.m(str));
        gaiaNativeLibrary = strA;
        try {
            System.loadLibrary(strA);
            nativeInitHookEnvironment(GaiaContext.j().v(), GaiaContext.c0(), Build.VERSION.SDK_INT);
            libLoaded = true;
        } catch (Throwable th) {
            Log.getStackTraceString(th);
        }
    }

    public static void initInstalledAppInfoBuffer() {
        updCached();
    }

    public static int lwipOpen(boolean z10, int i10, int i11) {
        try {
            return nativeLwipOpen(z10, i10, i11);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static long lwipPacketsIn() {
        ensureLoadedForSupervisor();
        return nativeLwipPacketsIn();
    }

    public static int lwipStart(int i10, int i11, int i12) {
        o.c("lwipStart(joins the lwIP loop if one is running)");
        ensureLoadedForSupervisor();
        try {
            return nativeLwipStart(i10, i11, i12);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void lwipStop() {
        try {
            nativeLwipStop();
        } catch (Throwable unused) {
        }
    }

    public static long lwipTunnelPacketsIn() {
        ensureLoadedForSupervisor();
        return nativeLwipTunnelPacketsIn();
    }

    private static native int nativeAddRuleRedirectDirPrefix(String str, String str2);

    private static native int nativeAddRuleRedirectFile(String str, String str2);

    private static native int nativeDelRuleRedirectDirPrefix(String str);

    private static native int nativeDelRuleRedirectFile(String str);

    private static native long nativeDlopenFd(int i10, String str, long j10, boolean z10);

    private static native int nativeHookGuestCrashReport();

    private static native int nativeHookLibNativeMethods();

    private static native int nativeHookVmNativeMethods(Object[] objArr, Object[][] objArr2);

    private static native int nativeHookVpnSocketMethods();

    private static native void nativeInitHookEnvironment(String str, boolean z10, int i10);

    private static native int nativeLwipOpen(boolean z10, int i10, int i11);

    private static native long nativeLwipPacketsIn();

    private static native int nativeLwipStart(int i10, int i11, int i12);

    private static native void nativeLwipStop();

    private static native long nativeLwipTunnelPacketsIn();

    private static native long nativeVpnLookupOrigDst(int i10);

    private static native int nativeVpnOpenOutbound(int i10, int i11);

    private static native void nativeVpnProtectFd(int i10);

    private static native void nativeVpnSetIntercept(boolean z10, int i10, int i11);

    private static native void nativeVpnSetLocalIp(int i10);

    public static int onGetCallingUid(int i10) {
        return i10;
    }

    public static Parcel onHostAttributionSource(Parcel parcel) {
        if (!C3841e.z()) {
            return null;
        }
        try {
            return C.a(AttributionSourceCompat2.Util.asHost());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int onInterceptConnect(int i10, int i11, boolean z10) {
        try {
            ParcelFileDescriptor parcelFileDescriptorG = z10 ? C5716z.a().g(i10, i11) : C5716z.a().h(i10, i11);
            if (parcelFileDescriptorG == null) {
                return -1;
            }
            return parcelFileDescriptorG.detachFd();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static Parcel onMediaRecorderNativeSetup(String str, Parcel parcel) {
        if (C3841e.z()) {
            return C.a(AttributionSourceCompat2.Util.asHost());
        }
        return null;
    }

    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public static boolean onNativeLoad0(String str) {
        String strS;
        FileDescriptor fileDescriptorMemfd_create;
        if (!GaiaContext.j().i0() || str.startsWith("/proc/self/fd/") || str.startsWith("/data/app/") || (strS = C5714x.j().S(str)) == null) {
            return false;
        }
        String name = new GFile(strS).getName();
        ParcelFileDescriptor parcelFileDescriptorK = C5714x.f239909d.K(strS, false);
        FileDescriptor fileDescriptor = null;
        try {
            try {
                fileDescriptorMemfd_create = Os.memfd_create(name, OsConstants.MFD_CLOEXEC);
            } catch (IOException e10) {
                e10.getMessage();
                return false;
            }
        } catch (ErrnoException e11) {
            e = e11;
        }
        try {
            Os.fchmod(fileDescriptorMemfd_create, l.b.f165184r);
            l.d0(parcelFileDescriptorK, new FileOutputStream(fileDescriptorMemfd_create), null);
            Os.lseek(fileDescriptorMemfd_create, 0L, OsConstants.SEEK_SET);
        } catch (ErrnoException e12) {
            e = e12;
            fileDescriptor = fileDescriptorMemfd_create;
            e.getMessage();
            fileDescriptorMemfd_create = fileDescriptor;
        }
        try {
            String strA = android.support.v4.media.c.a("/proc/self/fd/", ParcelFileDescriptor.dup(fileDescriptorMemfd_create).getFd());
            try {
                Os.readlink(strA);
                System.load(strA);
                return true;
            } catch (Throwable th) {
                th.getMessage();
                return false;
            }
        } catch (Throwable th2) {
            th2.getMessage();
            return false;
        }
    }

    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public static String onNativeLoad1(String str) {
        String strS;
        if (!GaiaContext.j().i0() || str.startsWith("/proc/self/fd/") || str.startsWith("/data/app/") || (strS = C5714x.j().S(str)) == null) {
            return null;
        }
        return strS;
    }

    public static NetworkInterface[] onNetworkInterfaceNativeGetAll(NetworkInterface[] networkInterfaceArr) {
        int length = networkInterfaceArr.length;
        for (NetworkInterface networkInterface : networkInterfaceArr) {
            C5707q.c().a(networkInterface);
        }
        return networkInterfaceArr;
    }

    public static NetworkInterface onNetworkInterfaceNativeGetByName0(NetworkInterface networkInterface) {
        if (networkInterface != null) {
            networkInterface.getName();
        }
        C5707q.c().a(networkInterface);
        return networkInterface;
    }

    public static void onOpenDexFileNative(String[] strArr) {
        String str = strArr[0];
        String str2 = strArr[1];
        if (str2 == null) {
            File file = new File(str);
            if (d.q0(str)) {
                String name = file.getName();
                strArr[1] = OatUtils.b(file, name.substring(0, name.lastIndexOf(46)), c.p());
            } else {
                GuestAppInfo guestAppInfoChkUpdCachedInstalledAppInfo = chkUpdCachedInstalledAppInfo(str);
                if (guestAppInfoChkUpdCachedInstalledAppInfo != null) {
                    String strB = OatUtils.b(file, guestAppInfoChkUpdCachedInstalledAppInfo.packageName, c.p());
                    File file2 = new File(strB);
                    if (file2.isDirectory() && (file2.getName().endsWith(".odex") || file2.getName().endsWith(".vdex"))) {
                        l.s(file2);
                    }
                    try {
                        l.x(strB);
                    } catch (IOException unused) {
                    }
                    strArr[1] = strB;
                }
            }
        } else if (str2.startsWith("/data/data/") || str.startsWith("/data/data/")) {
            String strR = GaiaContext.j().r();
            String absolutePath = d.s(GaiaContext.f164212y.Z(), strR).getAbsolutePath();
            String strSubstring = str2.substring(11);
            if (!c.F().g(strSubstring)) {
                int iIndexOf = str2.indexOf(47, 11);
                if (strR != null && strSubstring.startsWith(strR)) {
                    strArr[1] = j.a(absolutePath, iIndexOf > 0 ? str2.substring(iIndexOf) : "");
                }
            }
            String strSubstring2 = str.substring(11);
            if (!c.b.f68734b.g(strSubstring2)) {
                int iIndexOf2 = str.indexOf(47, 11);
                if (strR != null && strSubstring2.startsWith(strR)) {
                    strArr[0] = j.a(absolutePath, iIndexOf2 > 0 ? str.substring(iIndexOf2) : "");
                }
            }
        }
        String str3 = strArr[0];
        String str4 = strArr[1];
    }

    public static int onOpenUdpChannel(int i10, int i11) {
        try {
            return o8.j.d(i10, i11);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean onProtectFromVpn(int i10) {
        C5335a.f(i10);
        vpnProtectFd(i10);
        return true;
    }

    public static void onTunnelDied() {
        try {
            M9.c.Y5().e6();
        } catch (Throwable unused) {
        }
    }

    private static native void scratchesForMeasureOffset();

    public static void startAndroidLibNativeMethodHooker() {
        if (androidLibHookOKFlag) {
            return;
        }
        try {
            nativeHookLibNativeMethods();
        } catch (Throwable unused) {
        }
        androidLibHookOKFlag = true;
    }

    public static void startAndroidVmNativeMethodHooker() {
        if (androidVmHookOKFlag) {
            return;
        }
        AndroidVMNativeMethods.init();
        Method[] needHookAndroidMethods = AndroidVMNativeMethods.getNeedHookAndroidMethods();
        Object[][] needHookVmNativeMethodArgs = AndroidVMNativeMethods.getNeedHookVmNativeMethodArgs();
        try {
            int length = needHookAndroidMethods.length;
            nativeHookVmNativeMethods(needHookAndroidMethods, needHookVmNativeMethodArgs);
        } catch (Throwable unused) {
        }
        androidVmHookOKFlag = true;
    }

    public static void startContainerVpnSocketHooker() {
        if (vpnSocketHookFlag) {
            return;
        }
        vpnSocketHookFlag = true;
        if (b.a() && C5335a.a() && guestShipsItsOwnShadowhook() == null) {
            try {
                nativeHookVpnSocketMethods();
                if (C5716z.a().d()) {
                    C5335a.c();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void startGuestCrashReporter() {
        if (guestCrashReporterFlag) {
            return;
        }
        guestCrashReporterFlag = true;
    }

    public static String tempRedirectPath(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        if (str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            str = C0922f.a(str, 1, 0);
        }
        Map<String, String> map = tempFileRedirectMap;
        synchronized (map) {
            str2 = map.get(str);
        }
        if (str2 != null) {
            return str2;
        }
        Map<String, String> map2 = subDirReplaceMap;
        synchronized (map2) {
            try {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    String key = entry.getKey();
                    if (str.contains(key)) {
                        str = str.replace(key, entry.getValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    private static void updCached() {
        HashMap map = new HashMap();
        for (GuestAppInfo guestAppInfo : C5714x.j().w()) {
            String str = guestAppInfo.packageName;
            for (String str2 : guestAppInfo.dexFilePaths) {
                map.put(str2, guestAppInfo);
            }
        }
        cachedInsideDexFilePathMap = map;
    }

    public static long vpnLookupOrigDst(int i10) {
        try {
            return nativeVpnLookupOrigDst(i10);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static int vpnOpenOutbound(int i10, int i11) {
        try {
            return nativeVpnOpenOutbound(i10, i11);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void vpnProtectFd(int i10) {
        try {
            nativeVpnProtectFd(i10);
        } catch (Throwable unused) {
        }
    }

    public static void vpnSetIntercept(boolean z10, int i10, int i11) {
        try {
            nativeVpnSetIntercept(z10, i10, i11);
        } catch (Throwable unused) {
        }
    }

    public static void vpnSetLocalIp(int i10) {
        try {
            nativeVpnSetLocalIp(i10);
        } catch (Throwable unused) {
        }
    }
}
