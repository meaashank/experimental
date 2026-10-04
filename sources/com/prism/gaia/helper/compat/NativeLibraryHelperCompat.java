package com.prism.gaia.helper.compat;

import U6.m;
import android.annotation.TargetApi;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.commons.utils.C3838b;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.utils.A;
import com.prism.gaia.helper.utils.y;
import com.prism.gaia.naked.metadata.android.os.BuildCAG;
import com.prism.gaia.naked.metadata.com.android.internal.content.NativeLibraryHelperCAG;
import com.prism.gaia.remote.ApkInfo;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
public class NativeLibraryHelperCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f164948a = "NativeLibraryHelperCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, String> f164949b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Map<String, String> f164959l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f164952e = "x86";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f164954g = "mips";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f164956i = {"armeabi", "armeabi-v7a", f164952e, f164954g};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f164953f = "x86_64";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f164955h = "mips64";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f164957j = {"arm64-v8a", f164953f, f164955h};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f164950c = "arm";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f164951d = "arm64";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f164958k = {f164950c, f164951d, f164952e, f164953f, f164954g, f164955h};

    public static class ABIHelperGMS extends ABIHelper {
        public static final Parcelable.Creator<ABIHelperGMS> CREATOR = new a();
        private String libDirStr;

        public class a implements Parcelable.Creator<ABIHelperGMS> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ABIHelperGMS createFromParcel(Parcel parcel) {
                return new ABIHelperGMS(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public ABIHelperGMS[] newArray(int i10) {
                return new ABIHelperGMS[i10];
            }
        }

        private static String calcSecondaryAbi(String str) {
            return NativeLibraryHelperCompat.o(str) ? U6.c.k() : U6.c.h();
        }

        public static ABIHelperGMS getABIHelperForApk() {
            String strT = NativeLibraryHelperCompat.t("com.google.android.gms");
            if (strT == null) {
                String[] strArr = new String[0];
                String strB = NativeLibraryHelperCompat.b("com.google.android.gms", strArr);
                return new ABIHelperGMS(strB, calcSecondaryAbi(strB), strArr, null);
            }
            File[] fileArrListFiles = new File(strT).listFiles();
            if (fileArrListFiles == null) {
                String str = NativeLibraryHelperCompat.f164948a;
                String[] strArr2 = new String[0];
                String strB2 = NativeLibraryHelperCompat.b("com.google.android.gms", strArr2);
                return new ABIHelperGMS(strB2, calcSecondaryAbi(strB2), strArr2, null);
            }
            LinkedList linkedList = new LinkedList();
            for (File file : fileArrListFiles) {
                if (!file.isFile()) {
                    linkedList.add(file.getName());
                }
            }
            String[] strArrC = NativeLibraryHelperCompat.c(linkedList);
            String strB3 = NativeLibraryHelperCompat.b("com.google.android.gms", strArrC);
            return new ABIHelperGMS(strB3, calcSecondaryAbi(strB3), strArrC, strT);
        }

        @Override // com.prism.gaia.helper.compat.NativeLibraryHelperCompat.ABIHelper
        public int copyNativeLibrary(File file) throws Throwable {
            if (this.libDirStr == null) {
                setError("copyGmsCoreLibs can not locate library directory");
                String unused = NativeLibraryHelperCompat.f164948a;
                return -1;
            }
            try {
                String str = new File(this.libDirStr, getPrimaryAbiDirName()).exists() ? this.libDirStr + File.separator + getPrimaryAbiDirName() : this.libDirStr;
                String unused2 = NativeLibraryHelperCompat.f164948a;
                for (String str2 : m.f68757n) {
                    File file2 = new File(str, str2);
                    if (file2.exists()) {
                        com.prism.gaia.helper.utils.l.o(file2, new File(file, str2), null);
                    }
                }
                if (getSecondaryAbi() == null) {
                    return 0;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(file.getParent());
                String str3 = File.separator;
                sb2.append(str3);
                sb2.append(getSecondaryAbiDirName());
                String string = sb2.toString();
                String str4 = this.libDirStr + str3 + getSecondaryAbiDirName();
                com.prism.gaia.helper.utils.l.L(string);
                for (String str5 : m.f68757n) {
                    File file3 = new File(str4, str5);
                    if (file3.exists()) {
                        com.prism.gaia.helper.utils.l.o(file3, new File(string, str5), null);
                    }
                }
                return 0;
            } catch (IOException e10) {
                setError("copyGmsCoreLibs failed: (" + e10.getClass().getSimpleName() + ") " + e10.getMessage());
                String unused3 = NativeLibraryHelperCompat.f164948a;
                return -1;
            }
        }

        public boolean hasLibrarySource() {
            return this.libDirStr != null;
        }

        @Override // com.prism.gaia.helper.compat.NativeLibraryHelperCompat.ABIHelper, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.libDirStr);
        }

        private ABIHelperGMS(String str, String str2, String[] strArr, String str3) {
            super(str, str2, strArr);
            this.libDirStr = str3;
        }

        private ABIHelperGMS(Parcel parcel) {
            super(parcel);
            this.libDirStr = parcel.readString();
        }
    }

    public static class ABIHelper_K20 extends ABIHelper {
        public static final Parcelable.Creator<ABIHelper_K20> CREATOR = new a();
        private final File apkFile;

        public class a implements Parcelable.Creator<ABIHelper_K20> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ABIHelper_K20 createFromParcel(Parcel parcel) {
                return new ABIHelper_K20(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public ABIHelper_K20[] newArray(int i10) {
                return new ABIHelper_K20[i10];
            }
        }

        public static ABIHelper_K20 getABIHelperForApk(ApkInfo apkInfo) {
            return new ABIHelper_K20(U6.c.h(), new File(apkInfo.apkPath));
        }

        @Override // com.prism.gaia.helper.compat.NativeLibraryHelperCompat.ABIHelper
        public int copyNativeLibrary(File file) {
            try {
                return ((Integer) new y((Class<?>) NativeLibraryHelperCAG.f165982G.ORG_CLASS()).f("copyNativeBinariesIfNeededLI", this.apkFile, file).f165228a).intValue();
            } catch (Throwable th) {
                setError("(" + th.getClass().getSimpleName() + ") " + th.getMessage());
                String unused = NativeLibraryHelperCompat.f164948a;
                return -1;
            }
        }

        @Override // com.prism.gaia.helper.compat.NativeLibraryHelperCompat.ABIHelper, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.apkFile.getAbsolutePath());
        }

        private ABIHelper_K20(String str, File file) {
            super(str);
            this.apkFile = file;
        }

        private ABIHelper_K20(Parcel parcel) {
            super(parcel);
            this.apkFile = new File(parcel.readString());
        }
    }

    static {
        HashMap map = new HashMap();
        f164949b = map;
        map.put("armeabi", "");
        map.put("armeabi-v7a", "");
        map.put(f164952e, "");
        map.put("arm64-v8a", "_64");
        map.put(f164953f, "_64");
        HashMap map2 = new HashMap();
        f164959l = map2;
        map2.put("armeabi", f164950c);
        map2.put("armeabi-v7a", f164950c);
        map2.put("arm64-v8a", f164951d);
        map2.put(f164954g, f164954g);
        map2.put(f164955h, f164955h);
        map2.put(f164952e, f164952e);
        map2.put(f164953f, f164953f);
    }

    public static String b(String str, String[] strArr) {
        String[] strArrE;
        String str2;
        if (a7.c.o(str)) {
            return U6.c.b0() ? U6.c.f68724u : U6.c.f68723t;
        }
        boolean zB0 = U6.c.b0();
        if (strArr == null || strArr.length == 0) {
            return !zB0 ? U6.c.f68723t : U6.c.f68724u;
        }
        String[] strArrD = d(strArr);
        if (p(strArrD)) {
            strArrE = e(strArrD, U6.c.f68720q);
            str2 = strArrE.length > 0 ? strArrE[0] : U6.c.f68723t;
        } else if (r(strArrD)) {
            strArrE = e(strArrD, U6.c.f68721r);
            str2 = strArrE.length > 0 ? strArrE[0] : U6.c.f68724u;
        } else if (zB0) {
            strArrE = e(strArrD, U6.c.f68721r);
            str2 = strArrE.length > 0 ? strArrE[0] : U6.c.f68724u;
        } else {
            strArrE = e(strArrD, U6.c.f68720q);
            str2 = strArrE.length > 0 ? strArrE[0] : U6.c.f68723t;
        }
        if (strArrE.length > 0) {
            return str2;
        }
        return null;
    }

    public static String[] c(Collection<String> collection) {
        LinkedList linkedList = new LinkedList();
        for (Map.Entry<String, String> entry : f164959l.entrySet()) {
            if (collection.contains(entry.getValue())) {
                linkedList.add(entry.getKey());
            }
        }
        return (String[]) linkedList.toArray(new String[0]);
    }

    public static String[] d(String[] strArr) {
        return e(strArr, U6.c.n());
    }

    public static String[] e(String[] strArr, String[] strArr2) {
        LinkedList linkedList = new LinkedList();
        for (String str : strArr2) {
            if (C3838b.d(strArr, str)) {
                linkedList.add(str);
            }
        }
        return (String[]) linkedList.toArray(new String[0]);
    }

    @TargetApi(21)
    public static String f(Object obj, String[] strArr) {
        int iIntValue;
        if (strArr == null || strArr.length <= 0 || (iIntValue = NativeLibraryHelperCAG.L21.findSupportedAbi().call(obj, strArr).intValue()) < 0) {
            return null;
        }
        return strArr[iIntValue];
    }

    public static String g(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        File file = new File(str);
        String name = file.getName();
        if (name.contains(str2) || name.equals("lib")) {
            return file.getAbsolutePath();
        }
        File parentFile = file.getParentFile();
        return str3 == null ? parentFile.getAbsolutePath() : new File(parentFile, l(str3)).getAbsolutePath();
    }

    public static void h() {
        if (U6.c.f0()) {
            if (BuildCAG.f165856C.SUPPORTED_ABIS() != null) {
                BuildCAG.f165856C.SUPPORTED_ABIS().set((String[]) U6.c.f68722s.clone());
            }
            if (BuildCAG.f165856C.SUPPORTED_32_BIT_ABIS() != null) {
                BuildCAG.f165856C.SUPPORTED_32_BIT_ABIS().set((String[]) U6.c.f68720q.clone());
            }
            if (BuildCAG.f165856C.SUPPORTED_64_BIT_ABIS() != null) {
                BuildCAG.f165856C.SUPPORTED_64_BIT_ABIS().set((String[]) U6.c.f68721r.clone());
            }
        } else {
            if (BuildCAG.f165856C.SUPPORTED_ABIS() != null) {
                BuildCAG.f165856C.SUPPORTED_ABIS().set((String[]) U6.c.f68720q.clone());
            }
            if (BuildCAG.f165856C.SUPPORTED_32_BIT_ABIS() != null) {
                BuildCAG.f165856C.SUPPORTED_32_BIT_ABIS().set((String[]) U6.c.f68720q.clone());
            }
            if (BuildCAG.f165856C.SUPPORTED_64_BIT_ABIS() != null && !"com.google.android.gms".equals(GaiaContext.j().r())) {
                BuildCAG.f165856C.SUPPORTED_64_BIT_ABIS().set(new String[0]);
            }
        }
        String str = Build.CPU_ABI;
        String str2 = Build.CPU_ABI2;
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
        String[] strArr3 = Build.SUPPORTED_ABIS;
    }

    public static ABIHelper i(ApkInfo apkInfo) {
        if (apkInfo.pkgName.equals("com.google.android.gms")) {
            ABIHelperGMS aBIHelperForApk = ABIHelperGMS.getABIHelperForApk();
            if (aBIHelperForApk.hasLibrarySource()) {
                return aBIHelperForApk;
            }
        }
        return ABIHelperL21.getABIHelperForApk(apkInfo);
    }

    public static String[] j(String str) {
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(str).entries();
            HashSet hashSet = new HashSet();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                String name = zipEntryNextElement.getName();
                if (!name.contains("../") && name.startsWith("lib/") && !zipEntryNextElement.isDirectory() && name.endsWith(".so")) {
                    hashSet.add(name.substring(name.indexOf(RemoteSettings.FORWARD_SLASH_STRING) + 1, name.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING)));
                }
            }
            A.c(hashSet, ",");
            return (String[]) hashSet.toArray(new String[hashSet.size()]);
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    public static String[] k(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String[] strArrJ = j(str);
            if (strArrJ != null && strArrJ.length > 0) {
                hashSet.addAll(Arrays.asList(strArrJ));
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String l(String str) {
        return f164959l.get(str);
    }

    public static String m(String str) {
        Map<String, String> map = f164949b;
        String str2 = map.get(str);
        return str2 != null ? str2 : (U6.c.k() == null || !U6.c.f68703f) ? map.get(U6.c.f68723t) : map.get(U6.c.f68724u);
    }

    public static boolean n(String str, boolean z10) {
        return z10 ? C3838b.d(f164956i, str) : C3838b.d(f164957j, str);
    }

    public static boolean o(String str) {
        return C3838b.d(f164956i, str);
    }

    public static boolean p(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        for (String str : strArr) {
            if (!C3838b.d(f164956i, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean q(String str) {
        return C3838b.d(f164957j, str);
    }

    public static boolean r(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        for (String str : strArr) {
            if (!C3838b.d(f164957j, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean s(String str) {
        for (String str2 : U6.c.n()) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String t(String str) {
        ApplicationInfo applicationInfo;
        if (str == null) {
            return null;
        }
        try {
            PackageInfo packageInfoU = GaiaContext.j().U(str, 0);
            if (packageInfoU != null && (applicationInfo = packageInfoU.applicationInfo) != null) {
                String str2 = applicationInfo.nativeLibraryDir;
                String strG = g(str2, str, null);
                if (strG != null) {
                    return strG;
                }
                C5705o.c().a(new GaiaRuntimeException("fixNativeLibraryDirToAbi app(" + str + ") with path(" + str2 + ") result NULL"), "LOCATE_LIB", null);
                return strG;
            }
            C5705o.c().a(new GaiaRuntimeException("install but system got null app(" + str + ")"), "LOCATE_LIB", null);
            return null;
        } catch (Exception e10) {
            StringBuilder sbA = androidx.activity.result.i.a("locateNativeLibraryDirInSystem for package(", str, ") failed: (");
            sbA.append(e10.getClass().getSimpleName());
            sbA.append(")");
            sbA.append(e10.getMessage());
            C5705o.c().a(new GaiaRuntimeException(sbA.toString()), "LOCATE_LIB", null);
            return null;
        }
    }

    public static class ABIHelperL21 extends ABIHelper {
        private File apkFile;
        private Object apkHandle;
        private static final String TAG = "asdf-".concat(ABIHelperL21.class.getSimpleName());
        public static final Parcelable.Creator<ABIHelperL21> CREATOR = new a();

        public class a implements Parcelable.Creator<ABIHelperL21> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ABIHelperL21 createFromParcel(Parcel parcel) {
                return new ABIHelperL21(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public ABIHelperL21[] newArray(int i10) {
                return new ABIHelperL21[i10];
            }
        }

        public class b implements FilenameFilter {
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith(".apk");
            }
        }

        private ABIHelperL21(String str, String str2, String[] strArr, File file) {
            super(str, str2, strArr);
            this.apkHandle = NativeLibraryHelperCAG.L21.Handle.create().call(file);
            this.apkFile = file;
        }

        public static ABIHelperL21 getABIHelperForApk(ApkInfo apkInfo) {
            return apkInfo.splitApk ? getABIHelperForClusterApk(apkInfo) : getABIHelperForMonolithicApk(apkInfo);
        }

        @TargetApi(21)
        private static ABIHelperL21 getABIHelperForClusterApk(ApkInfo apkInfo) {
            File parentFile = new File(apkInfo.apkPath).getParentFile();
            String[] list = parentFile.list(new b());
            for (int i10 = 0; i10 < list.length; i10++) {
                list[i10] = parentFile.getPath() + File.separator + list[i10];
            }
            return getABIHelperForApk(apkInfo.pkgName, parentFile, NativeLibraryHelperCompat.k(list));
        }

        @TargetApi(21)
        private static ABIHelperL21 getABIHelperForMonolithicApk(ApkInfo apkInfo) {
            return getABIHelperForApk(apkInfo.pkgName, new File(apkInfo.apkPath), NativeLibraryHelperCompat.j(apkInfo.apkPath));
        }

        @Override // com.prism.gaia.helper.compat.NativeLibraryHelperCompat.ABIHelper
        public int copyNativeLibrary(File file) {
            file.getPath();
            getPrimaryAbi();
            try {
                return NativeLibraryHelperCAG.L21.copyNativeBinaries().call(this.apkHandle, file, getPrimaryAbi()).intValue();
            } catch (Throwable th) {
                setError("(" + th.getClass().getSimpleName() + ") " + th.getMessage());
                return -1;
            }
        }

        @Override // com.prism.gaia.helper.compat.NativeLibraryHelperCompat.ABIHelper, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.apkFile.getAbsolutePath());
        }

        public ABIHelperL21(Parcel parcel) {
            super(parcel);
            this.apkFile = new File(parcel.readString());
            this.apkHandle = NativeLibraryHelperCAG.L21.Handle.create().call(this.apkFile);
        }

        @TargetApi(21)
        private static ABIHelperL21 getABIHelperForApk(String str, File file, String[] strArr) {
            return new ABIHelperL21(NativeLibraryHelperCompat.b(str, strArr), null, strArr, file);
        }
    }

    public static class ABIHelper implements Parcelable {
        public static final Parcelable.Creator<ABIHelper> CREATOR = new a();
        private String error;
        private String primaryAbi;
        private String secondaryAbi;
        private String[] supportedAbis;

        public class a implements Parcelable.Creator<ABIHelper> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ABIHelper createFromParcel(Parcel parcel) {
                return new ABIHelper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public ABIHelper[] newArray(int i10) {
                return new ABIHelper[i10];
            }
        }

        public ABIHelper(Parcel parcel) {
            this.primaryAbi = parcel.readString();
            this.secondaryAbi = parcel.readString();
            int i10 = parcel.readInt();
            if (i10 > 0) {
                this.supportedAbis = new String[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    this.supportedAbis[i11] = parcel.readString();
                }
            }
        }

        public int copyNativeLibrary(File file) {
            return 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getError() {
            return this.error;
        }

        public String getPrimaryAbi() {
            return this.primaryAbi;
        }

        public String getPrimaryAbiDirName() {
            return NativeLibraryHelperCompat.l(this.primaryAbi);
        }

        public String getSecondaryAbi() {
            return this.secondaryAbi;
        }

        public String getSecondaryAbiDirName() {
            return NativeLibraryHelperCompat.l(this.secondaryAbi);
        }

        public String[] getSupportedAbis() {
            return this.supportedAbis;
        }

        public void setError(String str) {
            this.error = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.primaryAbi);
            parcel.writeString(this.secondaryAbi);
            String[] strArr = this.supportedAbis;
            int i11 = 0;
            if (strArr == null || strArr.length == 0) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(strArr.length);
            while (true) {
                String[] strArr2 = this.supportedAbis;
                if (i11 >= strArr2.length) {
                    return;
                }
                parcel.writeString(strArr2[i11]);
                i11++;
            }
        }

        public ABIHelper(String str) {
            this.primaryAbi = str;
            this.secondaryAbi = null;
            this.supportedAbis = new String[]{str};
        }

        public ABIHelper(String str, String str2, String[] strArr) {
            this.primaryAbi = str;
            this.secondaryAbi = str2;
            this.supportedAbis = strArr;
        }
    }
}
