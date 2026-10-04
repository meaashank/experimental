package com.prism.gaia.server.pm;

import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.prism.commons.utils.C3838b;
import com.prism.gaia.helper.DeprecatedUserStateParcelProxy;
import com.prism.gaia.helper.GUri;
import com.prism.gaia.helper.compat.NativeLibraryHelperCompat;
import com.prism.gaia.helper.interfaces.ParcelableG;
import com.prism.gaia.helper.io.GFile;
import com.prism.gaia.helper.utils.OatUtils;
import com.prism.gaia.remote.ApkInfo;
import com.prism.gaia.server.pm.PackageParserG;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
public class PackageSettingG implements Parcelable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CURRENT_VERSION = 16;
    private static final int MATCH_ANY_USER = 4194304;
    public String apkPath;
    public int appId;
    public String appPath;
    public String betterSpacePkgName;
    public String dataPath;
    public String[] dexFilePaths;
    public long firstInstallTime;
    public boolean hasDexExt;
    public String installerSource;
    public long lastUpdateTime;
    public boolean launchable;
    public String libPath;
    public String packageName;
    PackageInfo pkgInfoInSystem;
    public String primaryAbi;
    public String runningAbi;
    public String secondaryAbi;
    public String selectedSpacePkgName;
    public boolean skipDexOpt;
    public String[] splitCodePaths;
    public String[] splitSrcPaths;
    public String srcPath;
    public String[] supportedAbis;
    public boolean useSystem;
    public boolean useSystemApk;
    public boolean useSystemOat;
    SparseArray<PackageUserStateG> userStateMap;
    private static final String TAG = "asdf-".concat("PackageSettingG");
    public static final ParcelableG.b<PackageSettingG> CREATOR = new a();

    public class a implements ParcelableG.b<PackageSettingG> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PackageSettingG createFromParcel(Parcel parcel) {
            return new PackageSettingG(parcel, -1);
        }

        @Override // com.prism.gaia.helper.interfaces.ParcelableG.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public PackageSettingG b(Parcel parcel, int i10) {
            return new PackageSettingG(parcel, i10);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public PackageSettingG[] newArray(int i10) {
            return new PackageSettingG[i10];
        }
    }

    public PackageSettingG() {
        this.userStateMap = new SparseArray<>();
    }

    private String[] calcDexFilePaths_D9(ApkInfo apkInfo, String[] strArr, String str, boolean z10) {
        String str2;
        if (z10) {
            return new String[0];
        }
        LinkedList linkedList = new LinkedList();
        GFile gFileQ = D9.d.q(apkInfo.pkgName);
        if (gFileQ.exists() && gFileQ.isFile()) {
            Iterator it = ((HashSet) OatUtils.a(gFileQ, apkInfo.pkgName, str)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
                str2 = (String) it.next();
                if (new File(str2).exists()) {
                    break;
                }
            }
            if (str2 != null) {
                String strB = OatUtils.b(gFileQ, apkInfo.pkgName, str);
                try {
                    com.prism.gaia.helper.utils.l.y(strB, 493);
                    com.prism.gaia.helper.utils.l.O(str2, strB);
                } catch (IOException e10) {
                    C5705o.c().e(new RuntimeException(androidx.constraintlayout.motion.widget.s.a("NEVER HAPPEN: move file from '", str2, "' to '", strB, "' failed"), e10), apkInfo.pkgName, "supervisor", "FILE_OP", null);
                }
            }
            linkedList.add(gFileQ.getAbsolutePath());
        }
        if (strArr != null) {
            for (String str3 : strArr) {
                File file = new File(str3);
                if (file.exists() && file.isFile()) {
                    linkedList.add(file.getAbsolutePath());
                }
            }
        }
        return (String[]) linkedList.toArray(new String[linkedList.size()]);
    }

    private com.prism.gaia.helper.e getLocationMatcher() {
        return U6.c.F();
    }

    private PackageUserStateG modifyUserStateComponents(int i10, boolean z10, boolean z11) {
        PackageUserStateG userState = getUserState(i10);
        if (z10 && userState.disabledComponents == null) {
            userState.disabledComponents = new HashSet<>(1);
        }
        if (z11 && userState.enabledComponents == null) {
            userState.enabledComponents = new HashSet<>(1);
        }
        return userState;
    }

    public PackageUserStateG delUserState(int i10) {
        PackageUserStateG packageUserStateG = this.userStateMap.get(i10);
        if (packageUserStateG != null) {
            packageUserStateG.setInstalled(false);
            GaiaUserManagerService.Y5(this, new int[]{i10});
        }
        return packageUserStateG;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean disableComponentLPw(String str, int i10) {
        PackageUserStateG packageUserStateGModifyUserStateComponents = modifyUserStateComponents(i10, true, false);
        HashSet<String> hashSet = packageUserStateGModifyUserStateComponents.enabledComponents;
        return packageUserStateGModifyUserStateComponents.disabledComponents.add(str) | (hashSet != null && hashSet.remove(str));
    }

    public boolean enableComponentLPw(String str, int i10) {
        boolean z10 = false;
        PackageUserStateG packageUserStateGModifyUserStateComponents = modifyUserStateComponents(i10, false, true);
        HashSet<String> hashSet = packageUserStateGModifyUserStateComponents.disabledComponents;
        if (hashSet != null && hashSet.remove(str)) {
            z10 = true;
        }
        return packageUserStateGModifyUserStateComponents.enabledComponents.add(str) | z10;
    }

    public String getApkPath() {
        return new File(this.apkPath).getPath();
    }

    public int getCurrentEnabledStateLPr(String str, int i10) {
        PackageUserStateG userState = getUserState(i10);
        HashSet<String> hashSet = userState.enabledComponents;
        if (hashSet != null && hashSet.contains(str)) {
            return 1;
        }
        HashSet<String> hashSet2 = userState.disabledComponents;
        return (hashSet2 == null || !hashSet2.contains(str)) ? 0 : 2;
    }

    public String getLibPath(String str) {
        return new File(this.libPath).getParent() + File.separator + NativeLibraryHelperCompat.l(str);
    }

    public String getLocationPkgName() {
        return getLocationMatcher().c(this.appPath);
    }

    public String getSpacePkgName() {
        return getLocationMatcher().d(this.appPath);
    }

    public GUri getSpaceUri() {
        return getLocationMatcher().e(this.appPath);
    }

    public PackageUserStateG getUserState(int i10) {
        PackageUserStateG packageUserStateG = this.userStateMap.get(i10);
        if (packageUserStateG == null) {
            packageUserStateG = new PackageUserStateG();
            if (i10 == 0) {
                packageUserStateG.installed = true;
            } else {
                packageUserStateG.launched = true;
            }
            this.userStateMap.put(i10, packageUserStateG);
        }
        return packageUserStateG;
    }

    public int[] getVuserIds() {
        LinkedList linkedList = new LinkedList();
        for (int i10 = 0; i10 < this.userStateMap.size(); i10++) {
            if (this.userStateMap.valueAt(i10).installed) {
                linkedList.add(Integer.valueOf(this.userStateMap.keyAt(i10)));
            }
        }
        return C3838b.s(linkedList);
    }

    public boolean isApplicationEnabledLPr(boolean z10, int i10, int i11) {
        if ((i10 & 512) != 0) {
            return true;
        }
        int enabled = getUserState(i11).getEnabled();
        return enabled != 0 ? (enabled == 2 || enabled == 3 || (enabled == 4 && (32768 & i10) == 0)) ? false : true : z10;
    }

    public boolean isAvailableLPr(int i10, int i11) {
        if ((4194304 & i10) != 0) {
            return true;
        }
        PackageUserStateG userState = getUserState(i11);
        if (userState.isInstalled()) {
            return (userState.isHidden() && (i10 & 8192) == 0) ? false : true;
        }
        return false;
    }

    public boolean isClonePresentLPr(int i10, int i11) {
        PackageUserStateG packageUserStateG;
        return (i10 & 4202496) != 0 || (packageUserStateG = this.userStateMap.get(i11)) == null || packageUserStateG.isInstalled();
    }

    public boolean isEnabledLPr(ComponentInfo componentInfo, int i10, int i11) {
        if ((i10 & 512) != 0) {
            return true;
        }
        PackageUserStateG userState = getUserState(i11);
        ApplicationInfo applicationInfo = componentInfo.applicationInfo;
        if (!isApplicationEnabledLPr(applicationInfo == null || applicationInfo.enabled, i10, i11)) {
            return false;
        }
        HashSet<String> hashSet = userState.enabledComponents;
        if (hashSet != null && hashSet.contains(componentInfo.name)) {
            return true;
        }
        HashSet<String> hashSet2 = userState.disabledComponents;
        if (hashSet2 == null || !hashSet2.contains(componentInfo.name)) {
            return componentInfo.enabled;
        }
        return false;
    }

    public boolean isInstalledInHelper() {
        return getLocationMatcher().h(this.appPath);
    }

    public boolean isInstalledInLaunch() {
        return getLocationMatcher().k(this.appPath);
    }

    public boolean isLaunched(int i10) {
        return getUserState(i10).launched;
    }

    public boolean isNeedMigrate() {
        return getLocationMatcher().l(this.appPath);
    }

    public boolean isPackageVisibleLPr(boolean z10, int i10, int i11) {
        return isAvailableLPr(i10, i11) && isApplicationEnabledLPr(z10, i10, i11);
    }

    public synchronized boolean markLaunchedIfFirst(int i10) {
        PackageUserStateG userState = getUserState(i10);
        if (userState.launched) {
            return false;
        }
        userState.launched = true;
        saveUserStates();
        return true;
    }

    public boolean restoreComponentLPw(String str, int i10) {
        PackageUserStateG packageUserStateGModifyUserStateComponents = modifyUserStateComponents(i10, true, true);
        HashSet<String> hashSet = packageUserStateGModifyUserStateComponents.disabledComponents;
        boolean z10 = hashSet != null && hashSet.remove(str);
        HashSet<String> hashSet2 = packageUserStateGModifyUserStateComponents.enabledComponents;
        return z10 | (hashSet2 != null && hashSet2.remove(str));
    }

    public void saveUserStates() {
        u.n().R(this);
    }

    public void setLaunched(int i10, boolean z10) {
        getUserState(i10).launched = z10;
        saveUserStates();
    }

    public String toString() {
        return "{pkg:" + this.packageName + ",srcPath:" + this.srcPath + ",userStates:" + this.userStateMap.toString() + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringArray(this.splitCodePaths);
        parcel.writeString(this.packageName);
        parcel.writeString(this.appPath);
        parcel.writeString(this.apkPath);
        parcel.writeString(this.libPath);
        parcel.writeString(this.dataPath);
        parcel.writeString(this.srcPath);
        parcel.writeStringArray(this.splitSrcPaths);
        parcel.writeString(this.selectedSpacePkgName);
        parcel.writeString(this.installerSource);
        parcel.writeString(this.primaryAbi);
        parcel.writeStringArray(this.supportedAbis);
        parcel.writeString(this.secondaryAbi);
        parcel.writeByte(this.useSystem ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.useSystemApk ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.useSystemOat ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hasDexExt ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.appId);
        parcel.writeByte(this.skipDexOpt ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.dexFilePaths);
    }

    public PackageSettingG(Parcel parcel, int i10) {
        this.userStateMap = new SparseArray<>();
        if (i10 >= 9) {
            this.splitCodePaths = C.i(parcel);
        } else {
            this.splitCodePaths = null;
        }
        this.packageName = parcel.readString();
        if (i10 >= 11) {
            this.appPath = parcel.readString();
        } else {
            this.appPath = null;
        }
        this.apkPath = parcel.readString();
        this.libPath = parcel.readString();
        if (i10 >= 12) {
            this.dataPath = parcel.readString();
        } else {
            this.dataPath = null;
        }
        if (i10 >= 13) {
            this.srcPath = parcel.readString();
        } else {
            this.srcPath = this.apkPath;
        }
        if (i10 >= 14) {
            this.splitSrcPaths = C.i(parcel);
        } else {
            String[] strArr = this.splitCodePaths;
            this.splitSrcPaths = strArr == null ? null : (String[]) strArr.clone();
        }
        if (i10 >= 15) {
            this.selectedSpacePkgName = parcel.readString();
        } else {
            this.selectedSpacePkgName = null;
        }
        if (i10 >= 16) {
            this.installerSource = parcel.readString();
        } else {
            this.installerSource = Z6.g.B().o(this.packageName);
        }
        ApkInfo apkInfo = new ApkInfo(this.packageName, this.apkPath, this.splitCodePaths);
        NativeLibraryHelperCompat.ABIHelper aBIHelperI = i10 < 8 ? NativeLibraryHelperCompat.i(apkInfo) : null;
        if (i10 >= 7) {
            this.primaryAbi = parcel.readString();
        } else {
            this.primaryAbi = aBIHelperI.getPrimaryAbi();
        }
        if (i10 >= 8) {
            this.supportedAbis = C.i(parcel);
        } else {
            String[] supportedAbis = aBIHelperI.getSupportedAbis();
            this.supportedAbis = supportedAbis;
            if (supportedAbis == null) {
                this.supportedAbis = new String[0];
            }
        }
        if (i10 >= 10) {
            parcel.readString();
            this.secondaryAbi = null;
        } else {
            this.secondaryAbi = null;
        }
        this.runningAbi = this.primaryAbi;
        boolean z10 = parcel.readByte() != 0;
        this.useSystem = z10;
        if (i10 >= 6) {
            this.useSystemApk = parcel.readByte() != 0;
            this.useSystemOat = parcel.readByte() != 0;
        } else {
            this.useSystemApk = z10;
            this.useSystemOat = z10;
        }
        if (i10 >= 8) {
            this.hasDexExt = parcel.readByte() != 0;
        } else {
            this.hasDexExt = com.prism.gaia.helper.utils.x.c(this.packageName);
        }
        this.appId = parcel.readInt();
        if (i10 == 3) {
            this.userStateMap = new DeprecatedUserStateParcelProxy(parcel, i10).f(PackageUserStateG.class.getClassLoader());
        }
        this.skipDexOpt = parcel.readByte() != 0;
        if (i10 >= 10) {
            this.dexFilePaths = C.i(parcel);
        } else {
            this.dexFilePaths = calcDexFilePaths_D9(apkInfo, this.splitCodePaths, this.primaryAbi, this.useSystem);
        }
        if (this.appPath == null) {
            if (this.useSystem) {
                this.appPath = D9.d.r(this.packageName).h(getSpacePkgName()).getAbsolutePath();
            } else {
                this.appPath = new GFile(this.apkPath).getParent();
            }
        }
        if (this.dataPath == null) {
            this.dataPath = D9.d.s(0, this.packageName).h(getSpacePkgName()).getAbsolutePath();
        }
    }

    public static boolean isEnabledLPr(PackageParserG.b bVar, int i10, int i11) {
        PackageSettingG packageSettingG;
        if (!(bVar.a() instanceof ComponentInfo)) {
            return false;
        }
        ComponentInfo componentInfo = (ComponentInfo) bVar.a();
        PackageG packageG = bVar.f167530a;
        if (packageG == null || (packageSettingG = packageG.f167488A) == null) {
            return false;
        }
        return packageSettingG.isEnabledLPr(componentInfo, i10, i11);
    }
}
