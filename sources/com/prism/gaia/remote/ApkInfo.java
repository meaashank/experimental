package com.prism.gaia.remote;

import D9.d;
import U6.j;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.prism.commons.utils.C3855t;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.utils.PkgUtils;
import com.prism.gaia.helper.utils.l;

/* JADX INFO: loaded from: classes6.dex */
public class ApkInfo implements Parcelable {
    public String apkPath;
    public String apkPathOrig;
    public String pkgName;
    public boolean splitApk;
    public static final String TAG = "asdf-".concat("ApkInfo");
    public static final Parcelable.Creator<ApkInfo> CREATOR = new a();
    private String name = null;
    private Bitmap icon = null;

    public class a implements Parcelable.Creator<ApkInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ApkInfo createFromParcel(Parcel parcel) {
            return new ApkInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ApkInfo[] newArray(int i10) {
            return new ApkInfo[i10];
        }
    }

    public ApkInfo(String str, String str2, String[] strArr) {
        boolean z10 = false;
        this.splitApk = false;
        this.pkgName = str;
        this.apkPath = str2;
        if (strArr != null && strArr.length != 0) {
            z10 = true;
        }
        this.splitApk = z10;
    }

    public static ApkInfo getApkInfo(String str) {
        String strF = PkgUtils.f(str);
        if (strF == null) {
            return null;
        }
        return new ApkInfo(strF, str, PkgUtils.w(str));
    }

    public static ApkInfo getApkInfoSys(String str) {
        try {
            PackageInfo packageInfoU = GaiaContext.j().U(str, 0);
            if (packageInfoU == null) {
                return null;
            }
            return new ApkInfo(str, PkgUtils.e(packageInfoU.applicationInfo), PkgUtils.v(packageInfoU));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static boolean hostSourceDirEquals(PackageManager packageManager, String str, String str2) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            if (applicationInfo != null && str2 != null) {
                if (str2.equals(applicationInfo.sourceDir)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private void loadCached() {
        if (ensureCached()) {
            try {
                String strV = l.V(d.x(this.pkgName).getAbsolutePath());
                this.name = strV;
                this.name = strV.trim();
                this.icon = C3855t.h(d.w(this.pkgName).getAbsolutePath());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ensureCached() throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = r8.pkgName
            r1 = 0
            if (r0 == 0) goto L92
            java.lang.String r2 = r8.apkPath
            if (r2 != 0) goto Lb
            goto L92
        Lb:
            com.prism.gaia.helper.io.GFile r0 = D9.d.x(r0)
            java.lang.String r2 = r8.pkgName
            com.prism.gaia.helper.io.GFile r2 = D9.d.w(r2)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = r8.apkPath
            r3.<init>(r4)
            long r3 = r3.lastModified()
            boolean r5 = r0.exists()
            if (r5 == 0) goto L3d
            boolean r5 = r2.exists()
            if (r5 == 0) goto L3d
            long r5 = r0.lastModified()
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L3d
            long r5 = r2.lastModified()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 < 0) goto L3d
            goto L90
        L3d:
            com.prism.gaia.client.GaiaContext r3 = com.prism.gaia.client.GaiaContext.j()
            android.content.pm.PackageManager r3 = r3.T()
            java.lang.String r4 = r8.apkPath
            android.content.pm.PackageInfo r4 = r3.getPackageArchiveInfo(r4, r1)
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo
            java.lang.String r5 = r8.apkPath
            r4.sourceDir = r5
            r4.publicSourceDir = r5
            java.lang.CharSequence r5 = r3.getApplicationLabel(r4)
            java.lang.String r5 = r5.toString()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L63
            java.lang.String r5 = r8.pkgName
        L63:
            java.lang.String r6 = r8.pkgName
            java.lang.String r7 = r8.apkPath
            boolean r6 = hostSourceDirEquals(r3, r6, r7)
            if (r6 == 0) goto L74
            java.lang.String r6 = r8.pkgName     // Catch: java.lang.Exception -> L74
            android.graphics.drawable.Drawable r6 = r3.getApplicationIcon(r6)     // Catch: java.lang.Exception -> L74
            goto L75
        L74:
            r6 = 0
        L75:
            if (r6 != 0) goto L7b
            android.graphics.drawable.Drawable r6 = r3.getApplicationIcon(r4)
        L7b:
            com.prism.gaia.helper.utils.l.v(r0)     // Catch: java.lang.Exception -> L92
            r3 = -1
            com.prism.gaia.helper.utils.l.w(r2, r3)     // Catch: java.lang.Exception -> L92
            byte[] r3 = r5.getBytes()     // Catch: java.lang.Exception -> L92
            com.prism.gaia.helper.utils.l.f0(r3, r0)     // Catch: java.lang.Exception -> L92
            android.graphics.Bitmap r0 = com.prism.gaia.helper.utils.q.J(r6)     // Catch: java.lang.Exception -> L92
            com.prism.commons.utils.C3855t.i(r2, r0)     // Catch: java.lang.Exception -> L92
        L90:
            r0 = 1
            return r0
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.remote.ApkInfo.ensureCached():boolean");
    }

    public Bitmap getIcon() {
        if (this.icon == null) {
            loadCached();
        }
        return this.icon;
    }

    public Drawable getIconDrawable(Context context) {
        Bitmap icon = getIcon();
        if (icon == null) {
            return null;
        }
        return new BitmapDrawable(context.getResources(), icon);
    }

    public String getName() {
        if (this.name == null) {
            loadCached();
        }
        return this.name;
    }

    public PackageInfo getPackageInfo() {
        return GaiaContext.j().T().getPackageArchiveInfo(this.apkPath, 0);
    }

    public void releaseCached() {
        this.name = null;
        this.icon = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        j.F(sb2, "pkgName", this.pkgName);
        j.F(sb2, "apkPath", this.apkPath);
        j.F(sb2, "splitApk", Boolean.valueOf(this.splitApk));
        j.F(sb2, "apkPathOrig", this.apkPathOrig);
        j.G(sb2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.pkgName);
        parcel.writeString(this.apkPath);
        parcel.writeInt(this.splitApk ? 1 : 0);
        parcel.writeString(this.apkPathOrig);
    }

    public static ApkInfo getApkInfo(String str, boolean z10) {
        String strF = PkgUtils.f(str);
        if (strF == null) {
            return null;
        }
        return new ApkInfo(strF, str, z10);
    }

    public ApkInfo(String str, String str2, boolean z10) {
        this.pkgName = str;
        this.apkPath = str2;
        this.splitApk = z10;
    }

    public ApkInfo(Parcel parcel) {
        this.splitApk = false;
        this.pkgName = parcel.readString();
        this.apkPath = parcel.readString();
        this.splitApk = parcel.readInt() == 1;
        this.apkPathOrig = parcel.readString();
    }
}
