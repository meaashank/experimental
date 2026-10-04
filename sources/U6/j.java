package U6;

import Y6.c;
import android.app.ActivityManager;
import android.app.DownloadManager;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Message;
import android.os.storage.StorageVolume;
import androidx.core.graphics.drawable.IconCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.C3842f;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.helper.utils.ComponentUtils;
import com.prism.gaia.naked.compat.android.app.ContextImplCompat2;
import com.prism.gaia.naked.compat.android.app.LoadedApkCompat2;
import com.prism.gaia.naked.compat.android.content.ContentProviderHolderCompat2;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.app.ActivityThreadCAG;
import com.prism.gaia.naked.metadata.android.app.ContextImplCAG;
import com.prism.gaia.naked.metadata.android.app.DownloadManagerCAG;
import com.prism.gaia.naked.metadata.android.app.LoadedApkCAG;
import com.prism.gaia.naked.metadata.android.app.job.JobParametersCAG;
import com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAG;
import com.prism.gaia.naked.metadata.android.content.pm.PackageInstallerCAG;
import com.prism.gaia.naked.metadata.android.os.MessageCAG;
import com.prism.gaia.naked.metadata.android.os.storage.StorageVolumeCAG;
import com.prism.gaia.naked.metadata.java.lang.ThreadGroupCAG;
import com.prism.gaia.naked.utils.NakedUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import v8.C5691a;

/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f68736b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f68737c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f68738d = ", ";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static NakedUtils.IClassLoaderHelper f68740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static c f68741g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f68735a = "asdf-".concat(j.class.getSimpleName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f68739e = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static ThreadLocal<LinkedList<Object>> f68742h = new a();

    public class a extends ThreadLocal<LinkedList<Object>> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LinkedList<Object> initialValue() {
            return new LinkedList<>();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68743a;

        static {
            int[] iArr = new int[ComponentUtils.ComponentType.values().length];
            f68743a = iArr;
            try {
                iArr[ComponentUtils.ComponentType.ActivityInfo.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68743a[ComponentUtils.ComponentType.ServiceInfo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68743a[ComponentUtils.ComponentType.ProviderInfo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class c extends ClassLoader {
        public c(ClassLoader classLoader) {
            super(classLoader);
        }

        @Override // java.lang.ClassLoader
        public Class<?> findClass(String str) throws ClassNotFoundException {
            String unused = j.f68735a;
            Class<?> clsFindClass = j.f68740f.findClass(str);
            if (clsFindClass != null) {
                return clsFindClass;
            }
            String str2 = j.f68735a;
            throw new ClassNotFoundException(android.support.v4.media.i.a("class(", str, ") not found"));
        }
    }

    public static void A(StringBuilder sb2, StorageVolume storageVolume) {
        try {
            sb2.append("{");
            sb2.append(storageVolume.toString());
            sb2.append(" path:");
            sb2.append(StorageVolumeCAG.f165926G.getPath().call(storageVolume, new Object[0]));
            sb2.append("}");
        } catch (Throwable unused) {
        }
    }

    public static void B(StringBuilder sb2, Thread thread) {
        sb2.append("(");
        F(sb2, "id", Long.valueOf(thread.getId()));
        F(sb2, "name", thread.getName());
        G(sb2);
        sb2.append(")");
    }

    public static void C(StringBuilder sb2, ThreadGroup threadGroup) {
        sb2.append("{");
        sb2.append("name:");
        sb2.append(threadGroup.getName());
        sb2.append(f68738d);
        ThreadGroup parent = threadGroup.getParent();
        sb2.append("parent:");
        if (parent == threadGroup) {
            sb2.append("self");
        } else {
            w(sb2, parent);
        }
        sb2.append(f68738d);
        Thread[] threadArr = ThreadGroupCAG.N24.threads().get(threadGroup);
        sb2.append("threads:");
        w(sb2, threadArr);
        sb2.append(f68738d);
        ThreadGroup[] threadGroupArr = ThreadGroupCAG.N24.groups().get(threadGroup);
        if (threadGroupArr != null) {
            threadGroupArr = (ThreadGroup[]) threadGroupArr.clone();
            for (int i10 = 0; i10 < threadGroupArr.length; i10++) {
                if (threadGroupArr[i10] == threadGroup) {
                    threadGroupArr[i10] = null;
                }
            }
        }
        sb2.append("groups:");
        if (threadGroupArr == null) {
            sb2.append("(null)");
        } else {
            sb2.append("[");
            for (ThreadGroup threadGroup2 : threadGroupArr) {
                if (threadGroup2 == null) {
                    sb2.append("(null)");
                } else {
                    D(sb2, threadGroup2);
                }
                sb2.append(f68738d);
            }
            sb2.append("]");
        }
        sb2.append("}");
    }

    public static void D(StringBuilder sb2, ThreadGroup threadGroup) {
        sb2.append("{");
        sb2.append("name:");
        sb2.append(threadGroup.getName());
        sb2.append(f68738d);
        ThreadGroup parent = threadGroup.getParent();
        sb2.append("parent:");
        if (parent == null) {
            sb2.append("(null)");
        } else if (parent == threadGroup) {
            sb2.append("(self)");
        } else {
            sb2.append("(");
            sb2.append(parent.getName());
        }
        sb2.append(f68738d);
        Thread[] threadArr = ThreadGroupCAG.N24.threads().get(threadGroup);
        sb2.append("threads:");
        w(sb2, threadArr);
        sb2.append(",");
        ThreadGroup[] threadGroupArr = ThreadGroupCAG.N24.groups().get(threadGroup);
        sb2.append("groups:");
        if (threadGroupArr != null) {
            sb2.append(threadGroupArr.length);
        } else {
            sb2.append("(null)");
        }
        sb2.append("}");
    }

    public static void F(StringBuilder sb2, String str, Object obj) {
        sb2.append(str);
        sb2.append(com.prism.gaia.server.accounts.b.f166434b0);
        try {
            sb2.append(obj);
        } catch (Throwable unused) {
            sb2.append("(@unknown)");
        }
        sb2.append(f68738d);
    }

    public static void G(StringBuilder sb2) {
        int length = sb2.length();
        int i10 = f68739e;
        if (length < i10 || !sb2.substring(sb2.length() - i10).equals(f68738d)) {
            return;
        }
        sb2.delete(sb2.length() - i10, sb2.length());
    }

    public static void H(StringBuilder sb2, String str, Object obj) {
        sb2.append(str);
        sb2.append(com.prism.gaia.server.accounts.b.f166434b0);
        w(sb2, obj);
        sb2.append(f68738d);
    }

    public static String I(Object obj) {
        StringBuilder sb2 = new StringBuilder();
        w(sb2, obj);
        return sb2.toString();
    }

    public static String J(Object... objArr) {
        if (objArr == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : objArr) {
            w(sb2, obj);
        }
        return sb2.toString();
    }

    public static boolean K(LinkedList<Object> linkedList, Object obj) {
        Iterator<Object> it = linkedList.iterator();
        while (it.hasNext()) {
            if (it.next() == obj) {
                return true;
            }
        }
        return false;
    }

    public static String L(Object obj) {
        return M(System.identityHashCode(obj));
    }

    public static String M(int i10) {
        String hexString = Integer.toHexString(i10);
        int length = 8 - hexString.length();
        StringBuilder sb2 = new StringBuilder("0x");
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
        }
        sb2.append(hexString);
        return sb2.toString();
    }

    public static void c(StringBuilder sb2, Object obj) {
        sb2.append("ActivityClientRecord (");
        H(sb2, "intent", ActivityThreadCAG.f165276G.ActivityClientRecord.intent().get(obj));
        H(sb2, "activityInfo", ActivityThreadCAG.f165276G.ActivityClientRecord.activityInfo().get(obj));
        sb2.append(")");
    }

    public static void d(StringBuilder sb2, C5691a c5691a) {
        sb2.append("(");
        F(sb2, "Object", c5691a.toString());
        H(sb2, "info", c5691a.f239862b);
        F(sb2, "activity", c5691a.f239861a);
        G(sb2);
        sb2.append(")");
    }

    public static void e(StringBuilder sb2, ApplicationInfo applicationInfo) {
        sb2.append("(");
        F(sb2, "_class", "ApplicationInfo");
        F(sb2, GProcessClient.f164190q, Integer.valueOf(applicationInfo.uid));
        F(sb2, GProcessClient.f164193t, applicationInfo.processName);
        F(sb2, c.g.f79296d, applicationInfo.className);
        if (C3841e.v()) {
            F(sb2, "appComponentFactory", applicationInfo.appComponentFactory);
        }
        F(sb2, "permission", applicationInfo.permission);
        F(sb2, "flags", M(applicationInfo.flags));
        F(sb2, "targetSdkVersion", Integer.valueOf(applicationInfo.targetSdkVersion));
        F(sb2, "dataDir", applicationInfo.dataDir);
        F(sb2, "sourceDir", applicationInfo.sourceDir);
        F(sb2, "publicSourceDir", applicationInfo.publicSourceDir);
        F(sb2, "nativeLibraryDir", applicationInfo.nativeLibraryDir);
        F(sb2, "secondaryNativeLibraryDir", NakedObject.getSafe(applicationInfo, ApplicationInfoCAG.L21.secondaryNativeLibraryDir()));
        F(sb2, "scanSourceDir", NakedObject.getSafe(applicationInfo, ApplicationInfoCAG.L21.scanSourceDir()));
        F(sb2, "scanPublicSourceDir", NakedObject.getSafe(applicationInfo, ApplicationInfoCAG.L21.scanPublicSourceDir()));
        H(sb2, "resourceDirs", NakedObject.getSafe(applicationInfo, ApplicationInfoCAG.L21.resourceDirs()));
        H(sb2, "overlayPaths", NakedObject.getSafe(applicationInfo, ApplicationInfoCAG.f165610C.overlayPaths()));
        F(sb2, "sharedLibraryFiles", Arrays.toString(applicationInfo.sharedLibraryFiles));
        if (C3841e.w()) {
            H(sb2, "sharedLibraryInfos", ApplicationInfoCAG.Q29.sharedLibraryInfos().get(applicationInfo));
        }
        if (C3841e.s()) {
            F(sb2, "splitNames", Arrays.toString(applicationInfo.splitNames));
        }
        F(sb2, "splitPublicSourceDirs", Arrays.toString(applicationInfo.splitPublicSourceDirs));
        if (C3841e.p()) {
            F(sb2, "deviceProtectedDataDir", applicationInfo.deviceProtectedDataDir);
        }
        F(sb2, "primaryCpuAbi", NakedObject.getSafe(applicationInfo, ApplicationInfoCAG.L21.primaryCpuAbi()));
        F(sb2, "secondaryCpuAbi", NakedObject.getSafe(applicationInfo, ApplicationInfoCAG.L21.secondaryCpuAbi()));
        G(sb2);
        sb2.append(")");
    }

    public static <T> void f(StringBuilder sb2, Object obj) {
        int length = Array.getLength(obj);
        if (obj.getClass().getComponentType().equals(Byte.TYPE)) {
            sb2.append("byte[](");
            sb2.append(length);
            sb2.append(")");
            return;
        }
        sb2.append("[");
        for (int i10 = 0; i10 < length; i10++) {
            w(sb2, Array.get(obj, i10));
            sb2.append(f68738d);
        }
        G(sb2);
        sb2.append("]");
    }

    public static void g(StringBuilder sb2, Bundle bundle) {
        Bundle bundleA = C3842f.a(bundle);
        sb2.append("(");
        try {
            sb2.append("(@cantSee)");
        } catch (Throwable unused) {
            sb2.append("(@notSafe)");
            sb2.append(f68738d);
        }
        G(sb2);
        sb2.append(")");
        bundleA.clear();
    }

    public static void h(StringBuilder sb2, Class cls) {
        sb2.append("{");
        sb2.append("name:");
        sb2.append(cls.getName());
        sb2.append(" fields:");
        sb2.append(cls.getDeclaredFields().length);
        for (Field field : cls.getDeclaredFields()) {
            sb2.append("    {");
            sb2.append(field.getName());
            sb2.append(com.prism.gaia.server.accounts.b.f166434b0);
            sb2.append(field.getType().getName());
            sb2.append(com.prism.gaia.server.accounts.b.f166434b0);
            sb2.append(Modifier.toString(field.getModifiers()));
            sb2.append("}  ");
        }
        sb2.append("}");
    }

    public static void i(StringBuilder sb2, ClassLoader classLoader) {
        sb2.append("(");
        F(sb2, "_class", classLoader != null ? classLoader.getClass().getSimpleName() : "ClassLoader(Unknown)");
        sb2.append("classLoaderChainPaths:");
        sb2.append(LoadedApkCompat2.Util.calcClassLoaderPathChain(classLoader));
        sb2.append(")");
    }

    public static void j(StringBuilder sb2, Collection collection) {
        sb2.append("[");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            w(sb2, it.next());
            sb2.append(f68738d);
        }
        G(sb2);
        sb2.append("]");
    }

    public static void k(StringBuilder sb2, ComponentInfo componentInfo) {
        ComponentUtils.ComponentType componentTypeE = ComponentUtils.e(componentInfo);
        sb2.append("(");
        F(sb2, "type", ComponentUtils.f(componentTypeE));
        F(sb2, "addr", L(componentInfo));
        F(sb2, "name", componentInfo.name);
        F(sb2, "packageName", componentInfo.packageName);
        F(sb2, GProcessClient.f164193t, componentInfo.processName);
        if (C3841e.s()) {
            F(sb2, "splitName", componentInfo.splitName);
        }
        F(sb2, com.prism.gaia.server.content.j.f167238E, Boolean.valueOf(componentInfo.enabled));
        F(sb2, "exported", Boolean.valueOf(componentInfo.exported));
        int i10 = b.f68743a[componentTypeE.ordinal()];
        if (i10 == 1) {
            ActivityInfo activityInfo = (ActivityInfo) componentInfo;
            F(sb2, "documentLaunchMode", Integer.valueOf(activityInfo.documentLaunchMode));
            F(sb2, "documentLaunchMode", M(activityInfo.documentLaunchMode));
            F(sb2, "flags", M(activityInfo.flags));
            F(sb2, "taskAffinity", activityInfo.taskAffinity);
            F(sb2, "targetActivity", activityInfo.targetActivity);
        } else if (i10 == 2) {
            ServiceInfo serviceInfo = (ServiceInfo) componentInfo;
            F(sb2, "permission", serviceInfo.permission);
            F(sb2, "flags", M(serviceInfo.flags));
        } else if (i10 == 3) {
            ProviderInfo providerInfo = (ProviderInfo) componentInfo;
            F(sb2, "auth", providerInfo.authority);
            F(sb2, "multiProcess", Boolean.valueOf(providerInfo.multiprocess));
            F(sb2, "initOrder", Integer.valueOf(providerInfo.initOrder));
        }
        H(sb2, "appInfo", componentInfo.applicationInfo);
        G(sb2);
        sb2.append(")");
    }

    public static void l(StringBuilder sb2, Object obj) {
        sb2.append("(");
        H(sb2, "info", ContentProviderHolderCompat2.Util.getInfo(obj));
        F(sb2, "provider", ContentProviderHolderCompat2.Util.getProvider(obj));
        F(sb2, "connection", ContentProviderHolderCompat2.Util.getConnection(obj));
        G(sb2);
        sb2.append(")");
    }

    public static void m(StringBuilder sb2, Context context) {
        sb2.append("(");
        F(sb2, "_class", "ContextImpl");
        F(sb2, "_address", L(context));
        Context contextImpl = ContextImplCompat2.Util.getContextImpl(context);
        Object safe = NakedObject.getSafe(contextImpl, ContextImplCAG.L21.mUser());
        if (safe != null) {
            F(sb2, "mUser.class", safe.getClass().getCanonicalName());
        }
        H(sb2, "mPackageInfo", NakedObject.getSafe(contextImpl, ContextImplCAG.f165289G.mPackageInfo()));
        F(sb2, "mBasePackageName", NakedObject.getSafe(contextImpl, ContextImplCAG.f165289G.mBasePackageName()));
        F(sb2, "mOpPackageName", NakedObject.getSafe(contextImpl, ContextImplCAG.K19.mOpPackageName()));
        F(sb2, "mDatabasesDir", NakedObject.getSafe(contextImpl, ContextImplCAG.K19.mDatabasesDir()));
        F(sb2, "mPreferencesDir", NakedObject.getSafe(contextImpl, ContextImplCAG.K19.mPreferencesDir()));
        F(sb2, "mFilesDir", NakedObject.getSafe(contextImpl, ContextImplCAG.K19.mFilesDir()));
        F(sb2, "mCacheDir", NakedObject.getSafe(contextImpl, ContextImplCAG.K19.mCacheDir()));
        F(sb2, "mNoBackupFilesDir", NakedObject.getSafe(contextImpl, ContextImplCAG.L21.mNoBackupFilesDir()));
        F(sb2, "mCodeCacheDir", NakedObject.getSafe(contextImpl, ContextImplCAG.L21.mCodeCacheDir()));
        G(sb2);
        sb2.append(")");
    }

    public static void n(StringBuilder sb2, Cursor cursor) {
        sb2.append("[");
        if (cursor.getCount() > 0) {
            int position = cursor.getPosition();
            cursor.moveToFirst();
            do {
                sb2.append("(");
                for (int i10 = 0; i10 < cursor.getColumnCount(); i10++) {
                    sb2.append(cursor.getColumnName(i10));
                    sb2.append(com.prism.gaia.server.accounts.b.f166434b0);
                    w(sb2, com.prism.gaia.helper.utils.e.c(cursor, i10));
                    sb2.append(f68738d);
                }
                G(sb2);
                sb2.append(")");
                sb2.append(f68738d);
            } while (cursor.moveToNext());
            cursor.moveToPosition(position);
            G(sb2);
        }
        sb2.append("]");
    }

    public static void o(StringBuilder sb2, DownloadManager.Query query) {
        Long[] lArr;
        sb2.append("(");
        if (C3841e.r()) {
            long[] jArr = DownloadManagerCAG.f165295N.QueryN.mIds().get(query);
            if (jArr != null) {
                lArr = new Long[jArr.length];
                for (int i10 = 0; i10 < jArr.length; i10++) {
                    lArr[i10] = Long.valueOf(jArr[i10]);
                }
            } else {
                lArr = null;
            }
            H(sb2, "mIds", lArr);
            F(sb2, "mStatusFlags", DownloadManagerCAG.f165295N.QueryN.mStatusFlags().get(query));
            F(sb2, "mOrderByColumn", DownloadManagerCAG.f165295N.QueryN.mOrderByColumn().get(query));
            F(sb2, "mOrderDirection", Integer.valueOf(DownloadManagerCAG.f165295N.QueryN.mOrderDirection().get(query)));
            F(sb2, "mOnlyIncludeVisibleInDownloadsUi", Boolean.valueOf(DownloadManagerCAG.f165295N.QueryN.mOnlyIncludeVisibleInDownloadsUi().get(query)));
        }
        G(sb2);
        sb2.append(")");
    }

    public static void p(StringBuilder sb2, int[] iArr) {
        sb2.append("{");
        for (int i10 : iArr) {
            sb2.append(i10);
            sb2.append(",");
        }
        sb2.setLength(sb2.length() - 1);
        sb2.append("}");
    }

    public static void q(StringBuilder sb2, Intent intent) {
        sb2.append("{");
        sb2.append("intent:");
        sb2.append(intent.toString());
        sb2.append(f68738d);
        sb2.append("extra:");
        w(sb2, intent.getExtras());
        sb2.append(f68738d);
        sb2.append(zd.b.f241358c);
        w(sb2, intent.getData());
        sb2.append("}");
    }

    public static void r(StringBuilder sb2, IntentFilter intentFilter) {
        sb2.append("{");
        sb2.append(intentFilter.toString());
        sb2.append(" action:");
        Iterator<String> itActionsIterator = intentFilter.actionsIterator();
        while (itActionsIterator.hasNext()) {
            sb2.append(itActionsIterator.next());
            sb2.append(" | ");
        }
        sb2.append("}");
    }

    public static void s(StringBuilder sb2, JobParameters jobParameters) {
        sb2.append("JobParameters(");
        F(sb2, "jobId", Integer.valueOf(jobParameters.getJobId()));
        H(sb2, "callback", JobParametersCAG.f165471G.callback().get(jobParameters));
        H(sb2, "extras", jobParameters.getExtras());
        sb2.append(")");
    }

    public static void t(StringBuilder sb2, Object obj) {
        sb2.append("(");
        F(sb2, "_class", "LoadedApk");
        F(sb2, "_address", L(obj));
        H(sb2, "appInfo", NakedObject.getSafe(obj, LoadedApkCAG.f165347G.mApplicationInfo()));
        H(sb2, "mClassLoader", LoadedApkCompat2.Util.getClassLoader(obj));
        H(sb2, "mBaseClassLoader", NakedObject.getSafe(obj, LoadedApkCAG.f165347G.mBaseClassLoader()));
        H(sb2, "mDefaultClassLoader", NakedObject.getSafe(obj, LoadedApkCAG.f165347G.mDefaultClassLoader()));
        H(sb2, "mAppComponentFactory", NakedObject.getSafe(obj, LoadedApkCAG.f165345C.mAppComponentFactory()));
        F(sb2, "mIncludeCode", Boolean.valueOf(NakedBoolean.getSafe(obj, LoadedApkCAG.f165347G.mIncludeCode())));
        F(sb2, "mServices", NakedObject.getSafe(obj, LoadedApkCAG.f165347G.mServices()));
        G(sb2);
        sb2.append(")");
    }

    public static void u(StringBuilder sb2, Map<String, Object> map) {
        sb2.append("{");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(com.prism.gaia.server.accounts.b.f166434b0);
            w(sb2, entry.getValue());
            sb2.append(f68738d);
        }
        G(sb2);
        sb2.append("}");
    }

    public static void v(StringBuilder sb2, Message message) {
        Object obj = MessageCAG.f165882G.obj().get(message);
        sb2.append("(");
        F(sb2, "_class", "Message");
        H(sb2, IconCompat.f111190A, obj);
        H(sb2, "data", message.getData());
        G(sb2);
        sb2.append(")");
    }

    public static void w(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("(null)");
            return;
        }
        LinkedList<Object> linkedList = f68742h.get();
        if (K(linkedList, obj)) {
            sb2.append("(@reference)");
            return;
        }
        linkedList.addLast(obj);
        if (obj instanceof Map) {
            u(sb2, (Map) obj);
        } else if (obj instanceof Collection) {
            j(sb2, (Collection) obj);
        } else if (obj.getClass().isArray()) {
            f(sb2, obj);
        } else {
            try {
                sb2.append(obj.toString());
            } catch (Exception unused) {
                sb2.append("(@unknown)");
            }
        }
        linkedList.removeLast();
    }

    public static void x(StringBuilder sb2, ActivityManager.RunningTaskInfo runningTaskInfo) {
        sb2.append("(");
        F(sb2, "baseActivity", runningTaskInfo.baseActivity);
        F(sb2, "topActivity", runningTaskInfo.topActivity);
        G(sb2);
        sb2.append(")");
    }

    public static void y(StringBuilder sb2, PackageInstaller.SessionParams sessionParams) {
        sb2.append("(");
        F(sb2, "appPackageName", PackageInstallerCAG.M23.SessionParams.appPackageName().get(sessionParams));
        F(sb2, "appLabel", PackageInstallerCAG.M23.SessionParams.appLabel().get(sessionParams));
        F(sb2, "originatingUri", PackageInstallerCAG.M23.SessionParams.originatingUri().get(sessionParams));
        F(sb2, "referrerUri", PackageInstallerCAG.M23.SessionParams.referrerUri().get(sessionParams));
        F(sb2, "abiOverride", PackageInstallerCAG.M23.SessionParams.abiOverride().get(sessionParams));
        G(sb2);
        sb2.append(")");
    }

    public static void z(StringBuilder sb2, Signature signature) {
        sb2.append("(");
        F(sb2, "_class", "Signature");
        F(sb2, "hashCode", Integer.valueOf(signature.hashCode()));
        G(sb2);
        sb2.append(")");
    }

    public static void E() {
    }
}
