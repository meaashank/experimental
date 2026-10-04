package com.prism.gaia.remote;

import D9.d;
import U6.c;
import U6.j;
import U6.o;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.download.j;
import com.prism.gaia.helper.compat.NativeLibraryHelperCompat;
import com.prism.gaia.helper.io.GFile;
import com.prism.gaia.server.pm.C;
import com.prism.gaia.server.pm.PackageG;
import v8.C5714x;
import y8.C5842a;

/* JADX INFO: loaded from: classes6.dex */
public final class GuestAppInfo implements Parcelable {
    public static final Parcelable.Creator<GuestAppInfo> CREATOR = new a();
    public String apkPath;
    public int appId;
    private String appPath;
    public String betterSpacePkgName;
    public String[] dexFilePaths;
    public int enabledState;
    public int[] enabledStates;
    private String errorMsg;
    private boolean hasLaunchedBefore;
    public boolean hidden;
    public boolean[] hiddenStates;
    public String installSource;
    public String packageName;
    private String primaryAbi;
    private String secondaryAbi;
    public String spacePkgName;
    public String[] splitCodePaths;
    private PackageG.StateCode stateCode;
    private int stateFlags;
    private String[] supportedAbis;
    public int targetSdkVersion;
    public int versionCode;
    public int versionCodeMajor;
    public String versionName;
    public int[] vuserIds;

    public class a implements Parcelable.Creator<GuestAppInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GuestAppInfo createFromParcel(Parcel parcel) {
            return new GuestAppInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public GuestAppInfo[] newArray(int i10) {
            return new GuestAppInfo[i10];
        }
    }

    public GuestAppInfo(String str, int i10, int[] iArr, String str2, String str3, String str4, int i11, String str5, int i12, int i13, String str6, String str7, String[] strArr, String[] strArr2, String str8, String str9, String[] strArr3, PackageG.StateCode stateCode, String str10, int i14, boolean z10) {
        this.packageName = str;
        this.appId = i10;
        this.vuserIds = iArr;
        this.appPath = str2;
        this.spacePkgName = str3;
        this.betterSpacePkgName = str4;
        this.targetSdkVersion = i11;
        this.versionName = str5;
        this.versionCode = i12;
        this.versionCodeMajor = i13;
        this.installSource = str6;
        this.apkPath = str7;
        this.splitCodePaths = strArr;
        this.dexFilePaths = strArr2;
        this.primaryAbi = str8;
        this.secondaryAbi = str9;
        this.supportedAbis = strArr3;
        this.stateCode = stateCode;
        this.errorMsg = str10;
        this.stateFlags = i14;
        this.hasLaunchedBefore = z10;
    }

    private int indexOfVuser(int i10) {
        if (this.vuserIds == null) {
            return -1;
        }
        int i11 = 0;
        while (true) {
            int[] iArr = this.vuserIds;
            if (i11 >= iArr.length) {
                return -1;
            }
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int enabledStateOf(int i10) {
        int iIndexOfVuser = indexOfVuser(i10);
        int[] iArr = this.enabledStates;
        return (iArr == null || iIndexOfVuser < 0 || iIndexOfVuser >= iArr.length) ? this.enabledState : iArr[iIndexOfVuser];
    }

    public ApkInfo getApkInfo() {
        return new ApkInfo(this.packageName, this.apkPath, this.splitCodePaths);
    }

    public ApplicationInfo getApplicationInfo(int i10) {
        return C5714x.j().o(this.packageName, 0, i10);
    }

    public String getErrorMsg() {
        return GaiaContext.j().N(o.n.f72190d4, this.packageName) + this.errorMsg;
    }

    public GFile getIconFile() {
        return d.w(this.packageName);
    }

    public int[] getInstalledUsers() {
        return C5842a.m().g(this.packageName);
    }

    public GFile getNameFile() {
        return d.x(this.packageName);
    }

    public PackageInfo getPackageInfo(int i10) {
        return C5714x.j().C(this.packageName, 0, i10);
    }

    public String getPrimaryAbi() {
        return this.primaryAbi;
    }

    public PackageG.StateCode getStateCode() {
        return this.stateCode;
    }

    public String[] getSupportedAbis() {
        return this.supportedAbis;
    }

    public boolean hasLaunchedBefore() {
        return C5714x.j().P(this.packageName);
    }

    public boolean hiddenOf(int i10) {
        int iIndexOfVuser = indexOfVuser(i10);
        boolean[] zArr = this.hiddenStates;
        return (zArr == null || iIndexOfVuser < 0 || iIndexOfVuser >= zArr.length) ? this.hidden : zArr[iIndexOfVuser];
    }

    public boolean is32bitOnly() {
        return NativeLibraryHelperCompat.p(this.supportedAbis);
    }

    public boolean is64bitOnly() {
        return NativeLibraryHelperCompat.r(this.supportedAbis);
    }

    public boolean isHasLaunchedBefore() {
        return this.hasLaunchedBefore;
    }

    public boolean isLaunchInHelper() {
        return c.W(this.spacePkgName);
    }

    public boolean isUsingOldVersionNow() {
        return (this.stateFlags & 2) != 0;
    }

    public boolean isVisibleToUser(int i10) {
        int iEnabledStateOf = enabledStateOf(i10);
        return (hiddenOf(i10) || iEnabledStateOf == 2 || iEnabledStateOf == 3 || iEnabledStateOf == 4) ? false : true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        j.F(sb2, "packageName", this.packageName);
        j.F(sb2, RemoteConfigConstants.RequestFieldKey.APP_ID, Integer.valueOf(this.appId));
        j.H(sb2, "vuserIds", this.vuserIds);
        j.F(sb2, "appPath", this.appPath);
        j.F(sb2, "spacePkgName", this.spacePkgName);
        j.F(sb2, "betterSpacePkgName", this.betterSpacePkgName);
        j.F(sb2, "targetSdkVersion", Integer.valueOf(this.targetSdkVersion));
        j.F(sb2, "versionName", this.versionName);
        j.F(sb2, "versionCode", Integer.valueOf(this.versionCode));
        j.F(sb2, "versionCodeMajor", Integer.valueOf(this.versionCodeMajor));
        j.F(sb2, "installSource", this.installSource);
        j.F(sb2, "apkPath", this.apkPath);
        j.H(sb2, "splitCodePaths", this.splitCodePaths);
        j.H(sb2, "dexFilePaths", this.dexFilePaths);
        j.F(sb2, "primaryAbi", this.primaryAbi);
        j.F(sb2, "secondaryAbi", this.secondaryAbi);
        j.H(sb2, "supportedAbis", this.supportedAbis);
        j.F(sb2, "stateCode", this.stateCode);
        j.F(sb2, j.b.f164724U, this.errorMsg);
        U6.j.F(sb2, "stateFlags", Integer.valueOf(this.stateFlags));
        U6.j.F(sb2, "hasLaunchedBefore", Boolean.valueOf(this.hasLaunchedBefore));
        U6.j.G(sb2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.packageName);
        parcel.writeInt(this.appId);
        parcel.writeInt(this.vuserIds.length);
        for (int i11 : this.vuserIds) {
            parcel.writeInt(i11);
        }
        parcel.writeString(this.appPath);
        parcel.writeString(this.spacePkgName);
        parcel.writeString(this.betterSpacePkgName);
        parcel.writeInt(this.targetSdkVersion);
        parcel.writeString(this.versionName);
        parcel.writeInt(this.versionCode);
        parcel.writeInt(this.versionCodeMajor);
        parcel.writeString(this.installSource);
        parcel.writeString(this.apkPath);
        parcel.writeStringArray(this.splitCodePaths);
        parcel.writeStringArray(this.dexFilePaths);
        parcel.writeString(this.primaryAbi);
        parcel.writeString(this.secondaryAbi);
        parcel.writeStringArray(this.supportedAbis);
        this.stateCode.writeToParcel(parcel, i10);
        parcel.writeString(this.errorMsg);
        parcel.writeInt(this.stateFlags);
        parcel.writeByte(this.hasLaunchedBefore ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.enabledState);
        parcel.writeByte(this.hidden ? (byte) 1 : (byte) 0);
        parcel.writeIntArray(this.enabledStates);
        parcel.writeBooleanArray(this.hiddenStates);
    }

    public boolean isVisibleToUser() {
        int i10;
        return (this.hidden || (i10 = this.enabledState) == 2 || i10 == 3 || i10 == 4) ? false : true;
    }

    public GuestAppInfo(Parcel parcel) {
        this.packageName = parcel.readString();
        this.appId = parcel.readInt();
        int i10 = parcel.readInt();
        this.vuserIds = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.vuserIds[i11] = parcel.readInt();
        }
        this.appPath = parcel.readString();
        this.spacePkgName = parcel.readString();
        this.betterSpacePkgName = parcel.readString();
        this.targetSdkVersion = parcel.readInt();
        this.versionName = parcel.readString();
        this.versionCode = parcel.readInt();
        this.versionCodeMajor = parcel.readInt();
        this.installSource = parcel.readString();
        this.apkPath = parcel.readString();
        this.splitCodePaths = C.i(parcel);
        this.dexFilePaths = C.i(parcel);
        this.primaryAbi = parcel.readString();
        this.secondaryAbi = parcel.readString();
        this.supportedAbis = C.i(parcel);
        this.stateCode = PackageG.StateCode.readFromParcel(parcel);
        this.errorMsg = parcel.readString();
        this.stateFlags = parcel.readInt();
        this.hasLaunchedBefore = parcel.readByte() != 0;
        this.enabledState = parcel.readInt();
        this.hidden = parcel.readByte() != 0;
        this.enabledStates = parcel.createIntArray();
        this.hiddenStates = parcel.createBooleanArray();
    }
}
