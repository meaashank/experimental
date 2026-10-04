package com.prism.gaia.server.pm;

import B0.C0922f;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.SharedLibraryInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.C3853q;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.compat.NativeLibraryHelperCompat;
import com.prism.gaia.helper.compat.bit32bit64.FileCompat;
import com.prism.gaia.helper.io.GFile;
import com.prism.gaia.helper.utils.ComponentUtils;
import com.prism.gaia.helper.utils.PkgUtils;
import com.prism.gaia.helper.utils.l;
import com.prism.gaia.naked.compat.android.content.pm.PackageParserCompat2;
import com.prism.gaia.naked.compat.android.content.pm.SharedLibraryInfoCompat2;
import com.prism.gaia.naked.compat.android.content.pm.SigningInfoCompat2;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAG;
import com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAG;
import com.prism.gaia.naked.metadata.android.content.pm.SignatureCAG;
import com.prism.gaia.os.GaiaUserHandle;
import com.prism.gaia.remote.ApkInfo;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* JADX INFO: loaded from: classes6.dex */
public class PackageParserG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f167524a = "asdf-".concat(PackageParserG.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f167525b = 8388608;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f167526c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f167527d = 4194304;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f167528e = 1;

    public static class ActivityIntentInfo extends IntentInfo {
        public a activity;

        public ActivityIntentInfo(Object obj) {
            super(obj);
        }

        public ActivityIntentInfo(Parcel parcel) {
            super(parcel);
        }

        public ActivityIntentInfo() {
        }
    }

    public static class EmptyApplicationInfo extends ApplicationInfo {
        public static final Parcelable.Creator<EmptyApplicationInfo> CREATOR = new a();

        public class a implements Parcelable.Creator<EmptyApplicationInfo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public EmptyApplicationInfo createFromParcel(Parcel parcel) {
                return new EmptyApplicationInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public EmptyApplicationInfo[] newArray(int i10) {
                return new EmptyApplicationInfo[i10];
            }
        }

        @Override // android.content.pm.ApplicationInfo, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.content.pm.ApplicationInfo, android.content.pm.PackageItemInfo, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
        }

        public EmptyApplicationInfo() {
        }

        private EmptyApplicationInfo(Parcel parcel) {
        }
    }

    public static class IntentInfo implements Parcelable {
        public static final Parcelable.Creator<IntentInfo> CREATOR = new a();
        public int banner;
        public IntentFilter filter;
        public boolean hasDefault;
        public int icon;
        public int labelRes;
        public int logo;
        public String nonLocalizedLabel;

        public class a implements Parcelable.Creator<IntentInfo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public IntentInfo createFromParcel(Parcel parcel) {
                return new IntentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public IntentInfo[] newArray(int i10) {
                return new IntentInfo[i10];
            }
        }

        public IntentInfo() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean hasAction(String str) {
            IntentFilter intentFilter = this.filter;
            return intentFilter != null && intentFilter.hasAction(str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.filter, i10);
            parcel.writeByte(this.hasDefault ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.labelRes);
            parcel.writeString(this.nonLocalizedLabel);
            parcel.writeInt(this.icon);
            parcel.writeInt(this.logo);
            parcel.writeInt(this.banner);
        }

        public IntentInfo(Object obj) {
            this.filter = (IntentFilter) obj;
            this.hasDefault = PackageParserCAG.I14.IntentInfo.hasDefault().get(obj);
            this.labelRes = PackageParserCAG.I14.IntentInfo.labelRes().get(obj);
            CharSequence charSequence = PackageParserCAG.I14.IntentInfo.nonLocalizedLabel().get(obj);
            if (charSequence != null) {
                this.nonLocalizedLabel = charSequence.toString();
            }
            this.icon = PackageParserCAG.I14.IntentInfo.icon().get(obj);
            this.logo = PackageParserCAG.I14.IntentInfo.logo().get(obj);
            this.banner = PackageParserCAG.K19.IntentInfo.banner().get(obj);
        }

        public IntentInfo(Parcel parcel) {
            this.filter = (IntentFilter) parcel.readParcelable(PackageParserG.class.getClassLoader());
            this.hasDefault = parcel.readByte() != 0;
            this.labelRes = parcel.readInt();
            this.nonLocalizedLabel = parcel.readString();
            this.icon = parcel.readInt();
            this.logo = parcel.readInt();
            this.banner = parcel.readInt();
        }
    }

    public static class ProviderIntentInfo extends IntentInfo {
        public f provider;

        public ProviderIntentInfo(Object obj) {
            super(obj);
        }

        public ProviderIntentInfo(Parcel parcel) {
            super(parcel);
        }

        public ProviderIntentInfo() {
        }
    }

    public static class ServiceIntentInfo extends IntentInfo {
        public g service;

        public ServiceIntentInfo(Object obj) {
            super(obj);
        }

        public ServiceIntentInfo(Parcel parcel) {
            super(parcel);
        }

        public ServiceIntentInfo() {
        }
    }

    public static abstract class b<II extends IntentInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PackageG f167530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<II> f167531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f167532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Bundle f167533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ComponentName f167534e;

        public b() {
        }

        public abstract PackageItemInfo a();

        public ComponentName b() {
            ComponentName componentName = this.f167534e;
            if (componentName != null) {
                return componentName;
            }
            if (this.f167532c != null) {
                this.f167534e = new ComponentName(this.f167530a.f167512o, this.f167532c);
            }
            return this.f167534e;
        }

        public boolean c(String str) {
            ArrayList<II> arrayList = this.f167531b;
            if (arrayList == null) {
                return false;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                II ii = arrayList.get(i10);
                i10++;
                if (ii.hasAction(str)) {
                    return true;
                }
            }
            return false;
        }

        public b(Object obj) {
            this.f167532c = PackageParserCAG.f165667G.Component.className().get(obj);
            this.f167533d = PackageParserCAG.f165667G.Component.metaData().get(obj);
        }
    }

    public static z A(PackageSettingG packageSettingG) {
        try {
            return B(packageSettingG);
        } catch (Throwable th) {
            String str = packageSettingG.packageName;
            th.getMessage();
            return null;
        }
    }

    public static z B(PackageSettingG packageSettingG) {
        GFile gFileT = D9.d.T(packageSettingG.packageName);
        if (gFileT.exists()) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                com.prism.gaia.helper.utils.l.P(parcelObtain, gFileT);
                z zVarL = z.l(parcelObtain);
                if (zVarL != null) {
                    File file = new File(packageSettingG.apkPath);
                    if (zVarL.i(file)) {
                        return zVarL;
                    }
                    zVarL.b();
                    file.length();
                    file.lastModified();
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        SystemClock.uptimeMillis();
        z zVarK = C4182q.k(packageSettingG.apkPath);
        SystemClock.uptimeMillis();
        if (zVarK == null) {
            return null;
        }
        zVarK.o(new File(packageSettingG.apkPath));
        P(packageSettingG.packageName, zVarK);
        zVarK.a();
        return zVarK;
    }

    public static PackageG C(ApkInfo apkInfo) throws Throwable {
        File parentFile = new File(apkInfo.apkPath).getParentFile();
        parentFile.getAbsoluteFile();
        return F(parentFile);
    }

    public static PackageG D(ApkInfo apkInfo) throws Throwable {
        File file = new File(apkInfo.apkPath);
        file.getAbsoluteFile();
        return F(file);
    }

    public static PackageG E(ApkInfo apkInfo) throws Throwable {
        return apkInfo.splitApk ? C(apkInfo) : D(apkInfo);
    }

    public static PackageG F(File file) throws Throwable {
        Object objCtor = PackageParserCompat2.Util.ctor(file);
        Object obj = PackageParserCompat2.Util.parsePackage(objCtor, file, 128);
        h(objCtor, obj, file);
        return f(obj);
    }

    public static int[] G(String[] strArr, PackageG packageG, int i10) {
        int[] iArr = new int[strArr.length];
        int vuid = GaiaUserHandle.getVuid(i10, packageG.f167488A.appId);
        for (int i11 = 0; i11 < strArr.length; i11++) {
            iArr[i11] = 1;
            try {
                if (BinderC4171f.h6().u2(strArr[i11], vuid) == 0) {
                    iArr[i11] = iArr[i11] | 2;
                }
            } catch (Throwable unused) {
            }
        }
        return iArr;
    }

    public static PackageG H(PackageSettingG packageSettingG) {
        PackageG packageGI;
        GFile gFileS = D9.d.S(packageSettingG.packageName);
        if (gFileS.exists() && (packageGI = I(gFileS, false)) != null) {
            return packageGI;
        }
        GFile gFileR = D9.d.R(packageSettingG.packageName);
        SystemClock.uptimeMillis();
        PackageG packageGI2 = gFileR.exists() ? I(gFileR, true) : null;
        SystemClock.uptimeMillis();
        if (packageGI2 == null) {
            packageGI2 = M(packageSettingG);
        }
        if (packageGI2 == null) {
            return null;
        }
        packageGI2.f167488A = packageSettingG;
        packageGI2.f167497J = true;
        return packageGI2;
    }

    public static PackageG I(File file, boolean z10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                com.prism.gaia.helper.utils.l.P(parcelObtain, file);
                PackageG packageGB = z10 ? t.b(parcelObtain) : s.c(parcelObtain);
                if (packageGB == null) {
                    parcelObtain.recycle();
                    return null;
                }
                C3853q.v(GaiaContext.j().n());
                J(packageGB);
                parcelObtain.recycle();
                return packageGB;
            } catch (Exception e10) {
                file.getAbsolutePath();
                e10.getMessage();
                parcelObtain.recycle();
                return null;
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
        parcelObtain.recycle();
        throw th;
    }

    public static void J(PackageG packageG) {
        if (L(packageG)) {
            return;
        }
        K(packageG);
    }

    public static boolean K(PackageG packageG) {
        GFile gFileU = D9.d.U(packageG.f167512o);
        if (!gFileU.exists()) {
            return false;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            com.prism.gaia.helper.utils.l.P(parcelObtain, gFileU);
            packageG.f167509l = (Signature[]) parcelObtain.createTypedArray(Signature.CREATOR);
            parcelObtain.recycle();
            return true;
        } catch (Throwable th) {
            try {
                gFileU.getAbsolutePath();
                th.getMessage();
                return false;
            } finally {
                parcelObtain.recycle();
            }
        }
    }

    public static boolean L(PackageG packageG) {
        GFile gFileV = D9.d.V(packageG.f167512o);
        if (!gFileV.exists()) {
            return false;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            com.prism.gaia.helper.utils.l.P(parcelObtain, gFileV);
            packageG.f167510m = parcelObtain.readParcelable(GaiaContext.j().n().getClassLoader());
            parcelObtain.recycle();
            return true;
        } catch (Throwable th) {
            try {
                gFileV.getAbsolutePath();
                th.getMessage();
                return false;
            } finally {
                parcelObtain.recycle();
            }
        }
    }

    public static PackageG M(PackageSettingG packageSettingG) {
        if (packageSettingG.apkPath == null) {
            return null;
        }
        File file = new File(packageSettingG.apkPath);
        if (!file.exists()) {
            return null;
        }
        String[] strArr = packageSettingG.splitCodePaths;
        boolean z10 = strArr != null && strArr.length > 0;
        if (z10) {
            file = file.getParentFile();
        }
        try {
            PackageG packageGF = F(file);
            if (z10) {
                packageGF.f167489B = packageSettingG.splitCodePaths;
            }
            return packageGF;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static void N(PackageG packageG) throws IOException {
        O(packageG, true);
    }

    public static void O(PackageG packageG, boolean z10) throws IOException {
        GFile gFileS = D9.d.S(packageG.f167512o);
        gFileS.l(-1);
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                s.p(parcelObtain, packageG);
                com.prism.gaia.helper.utils.l.Q(parcelObtain, gFileS);
                if (z10) {
                    Q(packageG);
                }
            } catch (IOException e10) {
                gFileS.getAbsolutePath();
                e10.getMessage();
                com.prism.gaia.helper.utils.l.E(e10);
                throw null;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    public static void P(String str, z zVar) {
        if (zVar == null) {
            return;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            GFile gFileT = D9.d.T(str);
            gFileT.l(-1);
            zVar.q(parcelObtain);
            com.prism.gaia.helper.utils.l.Q(parcelObtain, gFileT);
        } catch (Throwable th) {
            try {
                th.getMessage();
            } finally {
                parcelObtain.recycle();
            }
        }
    }

    public static void Q(PackageG packageG) throws IOException {
        if (packageG.f167510m != null) {
            S(packageG);
        } else {
            R(packageG);
        }
    }

    public static void R(PackageG packageG) throws IOException {
        Signature[] signatureArr = packageG.f167509l;
        if (signatureArr != null) {
            GFile gFileU = D9.d.U(packageG.f167512o);
            gFileU.l(-1);
            if (gFileU.exists()) {
                gFileU.delete();
            }
            Parcel parcelObtain = Parcel.obtain();
            try {
                try {
                    parcelObtain.writeTypedArray(signatureArr, 0);
                    com.prism.gaia.helper.utils.l.Q(parcelObtain, gFileU);
                } catch (IOException e10) {
                    gFileU.getAbsolutePath();
                    e10.getMessage();
                    com.prism.gaia.helper.utils.l.E(e10);
                    throw null;
                }
            } finally {
                parcelObtain.recycle();
            }
        }
    }

    public static void S(PackageG packageG) throws IOException {
        if (packageG.f167510m != null) {
            GFile gFileV = D9.d.V(packageG.f167512o);
            gFileV.l(-1);
            if (gFileV.exists()) {
                gFileV.delete();
            }
            Parcel parcelObtain = Parcel.obtain();
            try {
                try {
                    parcelObtain.writeParcelable((Parcelable) packageG.f167510m, 0);
                    com.prism.gaia.helper.utils.l.Q(parcelObtain, gFileV);
                } catch (IOException e10) {
                    gFileV.getAbsolutePath();
                    e10.getMessage();
                    com.prism.gaia.helper.utils.l.E(e10);
                    throw null;
                }
            } finally {
                parcelObtain.recycle();
            }
        }
    }

    public static void b(PackageG packageG) {
        ArrayList<a> arrayList = packageG.f167498a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            a aVar = arrayList.get(i11);
            i11++;
            a aVar2 = aVar;
            aVar2.f167530a = packageG;
            ArrayList<II> arrayList2 = aVar2.f167531b;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList2.get(i12);
                i12++;
                ((ActivityIntentInfo) obj).activity = aVar2;
            }
        }
        ArrayList<g> arrayList3 = packageG.f167501d;
        int size3 = arrayList3.size();
        int i13 = 0;
        while (i13 < size3) {
            g gVar = arrayList3.get(i13);
            i13++;
            g gVar2 = gVar;
            gVar2.f167530a = packageG;
            ArrayList<II> arrayList4 = gVar2.f167531b;
            int size4 = arrayList4.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj2 = arrayList4.get(i14);
                i14++;
                ((ServiceIntentInfo) obj2).service = gVar2;
            }
        }
        ArrayList<a> arrayList5 = packageG.f167499b;
        int size5 = arrayList5.size();
        int i15 = 0;
        while (i15 < size5) {
            a aVar3 = arrayList5.get(i15);
            i15++;
            a aVar4 = aVar3;
            aVar4.f167530a = packageG;
            ArrayList<II> arrayList6 = aVar4.f167531b;
            int size6 = arrayList6.size();
            int i16 = 0;
            while (i16 < size6) {
                Object obj3 = arrayList6.get(i16);
                i16++;
                ((ActivityIntentInfo) obj3).activity = aVar4;
            }
        }
        ArrayList<f> arrayList7 = packageG.f167500c;
        int size7 = arrayList7.size();
        int i17 = 0;
        while (i17 < size7) {
            f fVar = arrayList7.get(i17);
            i17++;
            f fVar2 = fVar;
            fVar2.f167530a = packageG;
            ArrayList<II> arrayList8 = fVar2.f167531b;
            int size8 = arrayList8.size();
            int i18 = 0;
            while (i18 < size8) {
                Object obj4 = arrayList8.get(i18);
                i18++;
                ((ProviderIntentInfo) obj4).provider = fVar2;
            }
        }
        ArrayList<c> arrayList9 = packageG.f167502e;
        int size9 = arrayList9.size();
        int i19 = 0;
        while (i19 < size9) {
            c cVar = arrayList9.get(i19);
            i19++;
            cVar.f167530a = packageG;
        }
        ArrayList<d> arrayList10 = packageG.f167503f;
        int size10 = arrayList10.size();
        int i20 = 0;
        while (i20 < size10) {
            d dVar = arrayList10.get(i20);
            i20++;
            dVar.f167530a = packageG;
        }
        ArrayList<e> arrayList11 = packageG.f167504g;
        int size11 = arrayList11.size();
        while (i10 < size11) {
            e eVar = arrayList11.get(i10);
            i10++;
            eVar.f167530a = packageG;
        }
    }

    public static void c(Collection<String> collection, boolean z10, List<String> list, Set<String> set) {
        if (collection == null) {
            return;
        }
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            d(it.next(), z10, list, set);
        }
    }

    public static void d(String str, boolean z10, List<String> list, Set<String> set) {
        if (set.contains(str)) {
            return;
        }
        String strV6 = BinderC4171f.v6(str, z10);
        if (strV6 != null) {
            list.add(strV6);
            set.add(str);
        } else if (C3841e.s()) {
            list.addAll(SharedLibraryInfoCompat2.Util.getAllCodePaths(BinderC4171f.t6(str)));
            set.add(str);
        }
    }

    public static void e(ApplicationInfo applicationInfo, PackageUserStateG packageUserStateG) {
        if (packageUserStateG.isInstalled()) {
            applicationInfo.flags |= 8388608;
        } else {
            applicationInfo.flags &= -8388609;
        }
        NakedInt nakedIntPrivateFlags = ApplicationInfoCAG.L21.privateFlags();
        if (nakedIntPrivateFlags != null) {
            int i10 = nakedIntPrivateFlags.get(applicationInfo);
            nakedIntPrivateFlags.set(applicationInfo, packageUserStateG.isHidden() ? i10 | 1 : i10 & (-2));
        }
        int enabled = packageUserStateG.getEnabled();
        if (enabled == 1) {
            applicationInfo.enabled = true;
        } else if (enabled == 2 || enabled == 3 || enabled == 4) {
            applicationInfo.enabled = false;
        }
        NakedInt nakedIntEnabledSetting = ApplicationInfoCAG.L21.enabledSetting();
        if (nakedIntEnabledSetting != null) {
            nakedIntEnabledSetting.set(applicationInfo, packageUserStateG.getEnabled());
        }
    }

    public static PackageG f(Object obj) {
        List<String> list;
        PackageG packageG = new PackageG();
        packageG.f167508k = PackageParserCAG.f165667G.Package.applicationInfo().get(obj);
        List list2 = PackageParserCAG.f165667G.Package.activities().get(obj);
        if (list2 != null) {
            packageG.f167498a = new ArrayList<>(list2.size());
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                a aVar = new a(it.next());
                aVar.f167529f.applicationInfo = packageG.f167508k;
                packageG.f167498a.add(aVar);
            }
        } else {
            packageG.f167498a = new ArrayList<>(0);
        }
        List list3 = PackageParserCAG.f165667G.Package.services().get(obj);
        if (list3 != null) {
            packageG.f167501d = new ArrayList<>(list3.size());
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                g gVar = new g(it2.next());
                gVar.f167539f.applicationInfo = packageG.f167508k;
                packageG.f167501d.add(gVar);
            }
        } else {
            packageG.f167501d = new ArrayList<>(0);
        }
        List list4 = PackageParserCAG.f165667G.Package.receivers().get(obj);
        if (list4 != null) {
            packageG.f167499b = new ArrayList<>(list4.size());
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                a aVar2 = new a(it3.next());
                aVar2.f167529f.applicationInfo = packageG.f167508k;
                packageG.f167499b.add(aVar2);
            }
        } else {
            packageG.f167499b = new ArrayList<>(0);
        }
        List list5 = PackageParserCAG.f165667G.Package.providers().get(obj);
        if (list5 != null) {
            packageG.f167500c = new ArrayList<>(list5.size());
            Iterator it4 = list5.iterator();
            while (it4.hasNext()) {
                f fVar = new f(it4.next());
                fVar.f167538f.applicationInfo = packageG.f167508k;
                packageG.f167500c.add(fVar);
            }
        } else {
            packageG.f167500c = new ArrayList<>(0);
        }
        List list6 = PackageParserCAG.f165667G.Package.instrumentation().get(obj);
        if (list6 != null) {
            packageG.f167502e = new ArrayList<>(list6.size());
            Iterator it5 = list6.iterator();
            while (it5.hasNext()) {
                packageG.f167502e.add(new c(it5.next()));
            }
        } else {
            packageG.f167502e = new ArrayList<>(0);
        }
        List list7 = PackageParserCAG.f165667G.Package.permissions().get(obj);
        if (list7 != null) {
            packageG.f167503f = new ArrayList<>(list7.size());
            Iterator it6 = list7.iterator();
            while (it6.hasNext()) {
                packageG.f167503f.add(new d(it6.next()));
            }
        } else {
            packageG.f167503f = new ArrayList<>(0);
        }
        List list8 = PackageParserCAG.f165667G.Package.permissionGroups().get(obj);
        if (list8 != null) {
            packageG.f167504g = new ArrayList<>(list8.size());
            Iterator it7 = list8.iterator();
            while (it7.hasNext()) {
                packageG.f167504g.add(new e(it7.next()));
            }
        } else {
            packageG.f167504g = new ArrayList<>(0);
        }
        ArrayList<String> arrayList = PackageParserCAG.f165667G.Package.requestedPermissions().get(obj);
        if (arrayList != null) {
            ArrayList<String> arrayList2 = new ArrayList<>(arrayList.size());
            packageG.f167505h = arrayList2;
            arrayList2.addAll(arrayList);
        } else {
            packageG.f167505h = new ArrayList<>(0);
        }
        if (PackageParserCAG.f165667G.Package.protectedBroadcasts() != null && (list = PackageParserCAG.f165667G.Package.protectedBroadcasts().get(obj)) != null) {
            ArrayList<String> arrayList3 = new ArrayList<>(list);
            packageG.f167507j = arrayList3;
            arrayList3.addAll(list);
        }
        if (C3841e.v()) {
            packageG.f167510m = PackageParserCAG.P28.Package.mSigningDetails().get(obj);
        } else {
            packageG.f167509l = PackageParserCAG._O27.Package.mSignatures().get(obj);
        }
        packageG.f167511n = PackageParserCAG.f165667G.Package.mAppMetaData().get(obj);
        packageG.f167512o = PackageParserCAG.f165667G.Package.packageName().get(obj);
        packageG.f167513p = PackageParserCAG.f165667G.Package.mPreferredOrder().get(obj);
        packageG.f167514q = PackageParserCAG.f165667G.Package.mVersionName().get(obj);
        packageG.f167515r = PackageParserCAG.f165667G.Package.mSharedUserId().get(obj);
        packageG.f167521x = PackageParserCAG.f165667G.Package.mSharedUserLabel().get(obj);
        ArrayList<String> arrayList4 = PackageParserCAG.f165667G.Package.usesLibraries().get(obj);
        packageG.f167516s = arrayList4;
        if (arrayList4 == null) {
            packageG.f167516s = new ArrayList<>();
        }
        ArrayList<String> arrayList5 = PackageParserCAG.f165667G.Package.usesOptionalLibraries().get(obj);
        packageG.f167517t = arrayList5;
        if (arrayList5 == null) {
            packageG.f167517t = new ArrayList<>();
        }
        if (C3841e.v()) {
            packageG.f167518u = PackageParserCAG.P28.Package.usesStaticLibraries().get(obj);
        }
        if (packageG.f167518u == null) {
            packageG.f167518u = new ArrayList<>();
        }
        packageG.f167519v = PackageParserCAG.f165667G.Package.mVersionCode().get(obj).intValue();
        packageG.f167520w = PackageParserCompat2.Util.getPackageVersionCodeMajor(obj);
        packageG.f167511n = PackageParserCAG.f165667G.Package.mAppMetaData().get(obj);
        packageG.f167522y = PackageParserCAG.f165667G.Package.configPreferences().get(obj);
        packageG.f167523z = PackageParserCAG.f165667G.Package.reqFeatures().get(obj);
        packageG.f167489B = PackageParserCAG.L21.Package.splitCodePaths().get(obj);
        packageG.f167490C = PackageParserCAG.L21.Package.splitFlags().get(obj);
        packageG.j();
        return packageG;
    }

    public static boolean g(PackageUserStateG packageUserStateG, int i10) {
        return ((4194304 & i10) == 0 && packageUserStateG.isHidden() && (i10 & 8192) == 0) ? false : true;
    }

    public static void h(Object obj, Object obj2, File file) {
        String str = PackageParserCAG.f165667G.Package.packageName().get(obj2);
        ArrayList<String> arrayList = PackageParserCAG.f165667G.Package.requestedPermissions().get(obj2);
        Bundle bundle = PackageParserCAG.f165667G.Package.mAppMetaData().get(obj2);
        if (arrayList.contains("android.permission.FAKE_PACKAGE_SIGNATURE") && bundle != null && bundle.containsKey("fake-signature")) {
            PackageParserCompat2.Util.fillSignature(obj2, bundle.getString("fake-signature"));
            return;
        }
        try {
            if (U6.m.o(str)) {
                i(obj2, file);
            } else {
                PackageParserCompat2.Util.collectCertificates(obj, obj2, true);
            }
        } catch (Throwable th) {
            throw new RuntimeException(com.bykv.vk.openvk.preload.geckox.d.j.a(th, new StringBuilder("signature collect failed: ")), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[PHI: r0
      0x004e: PHI (r0v10 java.io.File) = (r0v9 java.io.File), (r0v9 java.io.File), (r0v11 java.io.File), (r0v11 java.io.File) binds: [B:5:0x0020, B:7:0x002b, B:15:0x0046, B:17:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(java.lang.Object r11, java.io.File r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.server.pm.PackageParserG.i(java.lang.Object, java.io.File):void");
    }

    public static Signature[] j(Certificate[][] certificateArr) throws CertificateEncodingException {
        Signature[] signatureArr = new Signature[certificateArr.length];
        for (int i10 = 0; i10 < certificateArr.length; i10++) {
            signatureArr[i10] = (Signature) SignatureCAG.L21.ctor().newInstance(certificateArr[i10]);
        }
        return signatureArr;
    }

    public static void k(PackageG packageG) {
        com.prism.gaia.helper.utils.l.s(D9.d.S(packageG.f167512o));
        com.prism.gaia.helper.utils.l.s(D9.d.T(packageG.f167512o));
        com.prism.gaia.helper.utils.l.s(D9.d.R(packageG.f167512o));
        l(packageG);
    }

    public static void l(PackageG packageG) {
        if (packageG.f167510m != null) {
            com.prism.gaia.helper.utils.l.s(D9.d.V(packageG.f167512o));
        }
        if (packageG.f167509l != null) {
            com.prism.gaia.helper.utils.l.s(D9.d.U(packageG.f167512o));
        }
    }

    public static void m(PackageG packageG) {
        String str = packageG.f167512o;
        PackageSettingG packageSettingG = packageG.f167488A;
        ApplicationInfo applicationInfo = packageG.f167508k;
        int iR = GaiaContext.j().R();
        String spacePkgName = packageSettingG.getSpacePkgName();
        GFile gFileH = D9.d.s(0, packageG.f167512o).h(spacePkgName);
        GFile gFileH2 = D9.d.t(0, packageG.f167512o).h(spacePkgName);
        GFile gFileH3 = D9.d.u(0, packageG.f167512o).h(spacePkgName);
        if (TextUtils.isEmpty(applicationInfo.processName)) {
            applicationInfo.processName = applicationInfo.packageName;
        }
        applicationInfo.flags |= 4;
        applicationInfo.dataDir = gFileH.getAbsolutePath();
        applicationInfo.nativeLibraryDir = packageSettingG.libPath;
        applicationInfo.uid = packageSettingG.appId;
        applicationInfo.name = ComponentUtils.h(packageSettingG.packageName, applicationInfo.name);
        String str2 = packageSettingG.apkPath;
        applicationInfo.publicSourceDir = str2;
        applicationInfo.sourceDir = str2;
        try {
            GFile gFile = new GFile(applicationInfo.sourceDir);
            if (gFile.v()) {
                FileCompat.a(gFile, l.b.f165184r, true);
                FileCompat.c(gFile, iR, l.c.f165193a, true);
            }
        } catch (Exception unused) {
        }
        try {
            if (!TextUtils.isEmpty(applicationInfo.nativeLibraryDir)) {
                GFile gFile2 = new GFile(applicationInfo.nativeLibraryDir);
                if (gFile2.v()) {
                    com.prism.gaia.helper.utils.l.g(gFile2.getAbsolutePath(), l.b.f165186t);
                }
            }
        } catch (Exception unused2) {
        }
        String[] strArr = packageSettingG.splitCodePaths;
        applicationInfo.splitSourceDirs = strArr;
        applicationInfo.splitPublicSourceDirs = strArr;
        if (C3841e.s()) {
            String[] strArr2 = applicationInfo.splitSourceDirs;
            if (strArr2 == null) {
                applicationInfo.splitNames = null;
            } else {
                applicationInfo.splitNames = new String[strArr2.length];
                for (int i10 = 0; i10 < applicationInfo.splitSourceDirs.length; i10++) {
                    try {
                        GFile gFile3 = new GFile(applicationInfo.splitSourceDirs[i10]);
                        if (gFile3.v()) {
                            FileCompat.a(gFile3, l.b.f165184r, true);
                            FileCompat.c(gFile3, iR, l.c.f165193a, true);
                        }
                    } catch (Exception unused3) {
                    }
                    String str3 = applicationInfo.splitSourceDirs[i10];
                    String strG = PkgUtils.g(str3);
                    if (strG == null) {
                        String name = new File(str3).getName();
                        if (name.toLowerCase(Locale.ROOT).endsWith(".apk")) {
                            name = C0922f.a(name, 4, 0);
                        }
                        if (name.startsWith("split_")) {
                            name = name.substring(6);
                        }
                        strG = name;
                    }
                    applicationInfo.splitNames[i10] = strG;
                }
            }
        }
        ApplicationInfoCAG.L21.primaryCpuAbi().set(applicationInfo, packageSettingG.primaryAbi);
        ApplicationInfoCAG.L21.scanSourceDir().set(applicationInfo, applicationInfo.dataDir);
        ApplicationInfoCAG.L21.scanPublicSourceDir().set(applicationInfo, applicationInfo.dataDir);
        if (packageSettingG.secondaryAbi != null) {
            ApplicationInfoCAG.L21.secondaryCpuAbi().set(applicationInfo, packageSettingG.secondaryAbi);
            ApplicationInfoCAG.L21.secondaryNativeLibraryDir().set(applicationInfo, packageSettingG.getLibPath(packageSettingG.secondaryAbi));
        }
        if (C3841e.p()) {
            if (Build.VERSION.SDK_INT < 26) {
                ApplicationInfoCAG.N24_N25.deviceEncryptedDataDir().set(applicationInfo, gFileH3.getAbsolutePath());
                ApplicationInfoCAG.N24_N25.credentialEncryptedDataDir().set(applicationInfo, gFileH2.getAbsolutePath());
            }
            ApplicationInfoCAG.N24.deviceProtectedDataDir().set(applicationInfo, gFileH3.getAbsolutePath());
            ApplicationInfoCAG.N24.credentialProtectedDataDir().set(applicationInfo, gFileH2.getAbsolutePath());
        }
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        boolean zQ = NativeLibraryHelperCompat.q(packageSettingG.primaryAbi);
        c(packageG.f167516s, zQ, linkedList, hashSet);
        c(packageG.f167517t, zQ, linkedList, hashSet);
        c(packageG.f167518u, zQ, linkedList, hashSet);
        LinkedList linkedList2 = new LinkedList();
        if (applicationInfo.targetSdkVersion <= 26) {
            linkedList2.add("org.apache.http.legacy");
        }
        c(linkedList2, zQ, linkedList, hashSet);
        if (!packageSettingG.useSystem && packageSettingG.hasDexExt) {
            try {
                GFile gFileV = D9.d.v(packageSettingG.packageName);
                FileCompat.a(gFileV, l.b.f165184r, true);
                FileCompat.c(gFileV, iR, l.c.f165193a, true);
                linkedList.add(gFileV.getCanonicalPath());
            } catch (Exception unused4) {
            }
        }
        applicationInfo.sharedLibraryFiles = (String[]) linkedList.toArray(new String[0]);
        if (C3841e.w()) {
            LinkedList linkedList3 = new LinkedList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                SharedLibraryInfo sharedLibraryInfoT6 = BinderC4171f.t6((String) it.next());
                if (sharedLibraryInfoT6 != null) {
                    linkedList3.add(sharedLibraryInfoT6);
                }
            }
            ApplicationInfoCAG.Q29.sharedLibraryInfos().set(applicationInfo, linkedList3);
        }
    }

    public static ActivityInfo n(a aVar, int i10, PackageUserStateG packageUserStateG, int i11, boolean z10) {
        return o(aVar, i10, packageUserStateG, i11, z10, null);
    }

    public static ActivityInfo o(a aVar, int i10, PackageUserStateG packageUserStateG, int i11, boolean z10, ApplicationInfo applicationInfo) {
        Bundle bundle;
        if (aVar == null || !g(packageUserStateG, i10)) {
            return null;
        }
        ActivityInfo activityInfo = (ActivityInfo) C.b(aVar.f167529f);
        ComponentUtils.c(activityInfo);
        if ((i10 & 128) == 0 || (bundle = aVar.f167533d) == null) {
            activityInfo.metaData = null;
        } else {
            activityInfo.metaData = bundle;
        }
        if (!z10) {
            activityInfo.applicationInfo = new ApplicationInfo();
            return activityInfo;
        }
        if (applicationInfo == null) {
            applicationInfo = p(aVar.f167530a, i10, packageUserStateG, i11);
        }
        activityInfo.applicationInfo = applicationInfo;
        return activityInfo;
    }

    public static ApplicationInfo p(PackageG packageG, int i10, PackageUserStateG packageUserStateG, int i11) {
        if (packageG == null || !g(packageUserStateG, i10)) {
            return null;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) C.b(packageG.f167508k);
        e(applicationInfo, packageUserStateG);
        if ((i10 & 128) != 0) {
            applicationInfo.metaData = packageG.f167511n;
        } else {
            applicationInfo.metaData = null;
        }
        if (i11 > 0) {
            String spacePkgName = packageG.f167488A.getSpacePkgName();
            applicationInfo.dataDir = D9.d.s(i11, packageG.f167512o).h(spacePkgName).getAbsolutePath();
            applicationInfo.uid = GaiaUserHandle.getVuid(i11, applicationInfo.uid);
            if (C3841e.p()) {
                GFile gFileH = D9.d.t(i11, packageG.f167512o).h(spacePkgName);
                GFile gFileH2 = D9.d.u(i11, packageG.f167512o).h(spacePkgName);
                if (Build.VERSION.SDK_INT < 26) {
                    ApplicationInfoCAG.N24_N25.deviceEncryptedDataDir().set(applicationInfo, gFileH2.getAbsolutePath());
                    ApplicationInfoCAG.N24_N25.credentialEncryptedDataDir().set(applicationInfo, gFileH.getAbsolutePath());
                }
                ApplicationInfoCAG.N24.deviceProtectedDataDir().set(applicationInfo, gFileH2.getAbsolutePath());
                ApplicationInfoCAG.N24.credentialProtectedDataDir().set(applicationInfo, gFileH.getAbsolutePath());
            }
        }
        return applicationInfo;
    }

    public static InstrumentationInfo q(c cVar, int i10) {
        if (cVar == null) {
            return null;
        }
        if ((i10 & 128) == 0) {
            return cVar.f167535f;
        }
        InstrumentationInfo instrumentationInfo = (InstrumentationInfo) C.b(cVar.f167535f);
        instrumentationInfo.metaData = cVar.f167533d;
        return instrumentationInfo;
    }

    public static PackageInfo r(PackageG packageG, int i10, long j10, long j11, PackageUserStateG packageUserStateG, int i11, boolean z10) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        int size6;
        ArrayList<String> arrayList;
        PackageUserStateG packageUserStateG2 = packageUserStateG;
        int i12 = i11;
        if (!g(packageUserStateG2, i10)) {
            return null;
        }
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.packageName = packageG.f167512o;
        if (C3841e.v()) {
            packageInfo.setLongVersionCode(packageG.n());
        } else {
            packageInfo.versionCode = packageG.f167519v;
        }
        int i13 = packageG.f167521x;
        packageInfo.versionName = packageG.f167514q;
        packageInfo.sharedUserId = packageG.f167515r;
        packageInfo.sharedUserLabel = i13;
        ApplicationInfo applicationInfoP = p(packageG, i10, packageUserStateG2, i12);
        packageInfo.applicationInfo = applicationInfoP;
        if (applicationInfoP != null) {
            packageInfo.splitNames = applicationInfoP.splitNames;
        }
        packageInfo.firstInstallTime = j10;
        packageInfo.lastUpdateTime = j11;
        int i14 = i10 & 4096;
        if (i14 != 0 && (arrayList = packageG.f167505h) != null && !arrayList.isEmpty()) {
            String[] strArr = new String[packageG.f167505h.size()];
            packageG.f167505h.toArray(strArr);
            packageInfo.requestedPermissions = strArr;
            packageInfo.requestedPermissionsFlags = G(strArr, packageG, i12);
        }
        if ((i10 & 256) != 0) {
            packageInfo.gids = GaiaContext.j().w().gids;
        }
        if ((i10 & 16384) != 0) {
            ArrayList<ConfigurationInfo> arrayList2 = packageG.f167522y;
            int size7 = arrayList2 != null ? arrayList2.size() : 0;
            if (size7 > 0) {
                ConfigurationInfo[] configurationInfoArr = new ConfigurationInfo[size7];
                packageInfo.configPreferences = configurationInfoArr;
                packageG.f167522y.toArray(configurationInfoArr);
            }
            ArrayList<FeatureInfo> arrayList3 = packageG.f167523z;
            int size8 = arrayList3 != null ? arrayList3.size() : 0;
            if (size8 > 0) {
                FeatureInfo[] featureInfoArr = new FeatureInfo[size8];
                packageInfo.reqFeatures = featureInfoArr;
                packageG.f167523z.toArray(featureInfoArr);
            }
        }
        if ((i10 & 1) != 0 && (size6 = packageG.f167498a.size()) > 0) {
            ActivityInfo[] activityInfoArr = new ActivityInfo[size6];
            int i15 = 0;
            int i16 = 0;
            while (i15 < size6) {
                a aVar = packageG.f167498a.get(i15);
                if (y(packageG, aVar, i10, i12)) {
                    activityInfoArr[i16] = o(aVar, i10, packageUserStateG2, i12, z10, packageInfo.applicationInfo);
                    i16++;
                }
                i15++;
                packageUserStateG2 = packageUserStateG;
            }
            if (i16 != size6) {
                activityInfoArr = (ActivityInfo[]) Arrays.copyOf(activityInfoArr, i16);
            }
            packageInfo.activities = activityInfoArr;
        }
        if ((i10 & 2) != 0 && (size5 = packageG.f167499b.size()) > 0) {
            ActivityInfo[] activityInfoArr2 = new ActivityInfo[size5];
            int i17 = 0;
            for (int i18 = 0; i18 < size5; i18++) {
                a aVar2 = packageG.f167499b.get(i18);
                if (y(packageG, aVar2, i10, i12)) {
                    activityInfoArr2[i17] = o(aVar2, i10, packageUserStateG, i12, z10, packageInfo.applicationInfo);
                    i17++;
                }
            }
            if (i17 != size5) {
                activityInfoArr2 = (ActivityInfo[]) Arrays.copyOf(activityInfoArr2, i17);
            }
            packageInfo.receivers = activityInfoArr2;
        }
        if ((i10 & 4) != 0 && (size4 = packageG.f167501d.size()) > 0) {
            ServiceInfo[] serviceInfoArr = new ServiceInfo[size4];
            int i19 = 0;
            for (int i20 = 0; i20 < size4; i20++) {
                g gVar = packageG.f167501d.get(i20);
                if (y(packageG, gVar, i10, i12)) {
                    serviceInfoArr[i19] = x(gVar, i10, packageUserStateG, i12, z10, packageInfo.applicationInfo);
                    i19++;
                }
            }
            if (i19 != size4) {
                serviceInfoArr = (ServiceInfo[]) Arrays.copyOf(serviceInfoArr, i19);
            }
            packageInfo.services = serviceInfoArr;
        }
        if ((i10 & 8) != 0 && (size3 = packageG.f167500c.size()) > 0) {
            ProviderInfo[] providerInfoArr = new ProviderInfo[size3];
            int i21 = 0;
            int i22 = 0;
            while (i21 < size3) {
                f fVar = packageG.f167500c.get(i21);
                if (y(packageG, fVar, i10, i12)) {
                    providerInfoArr[i22] = v(fVar, i10, packageUserStateG, i12, z10, packageInfo.applicationInfo);
                    i22++;
                }
                i21++;
                i12 = i11;
            }
            if (i22 != size3) {
                providerInfoArr = (ProviderInfo[]) Arrays.copyOf(providerInfoArr, i22);
            }
            packageInfo.providers = providerInfoArr;
        }
        if ((i10 & 16) != 0 && (size2 = packageG.f167502e.size()) > 0) {
            packageInfo.instrumentation = new InstrumentationInfo[size2];
            for (int i23 = 0; i23 < size2; i23++) {
                packageInfo.instrumentation[i23] = q(packageG.f167502e.get(i23), i10);
            }
        }
        if (i14 != 0 && (size = packageG.f167503f.size()) > 0) {
            packageInfo.permissions = new PermissionInfo[size];
            for (int i24 = 0; i24 < size; i24++) {
                packageInfo.permissions[i24] = t(packageG.f167503f.get(i24), i10);
            }
        }
        if ((i10 & 64) != 0 || (134217728 & i10) != 0) {
            Object obj = packageG.f167510m;
            if (obj != null) {
                packageInfo.signingInfo = SigningInfoCompat2.Util.ctor(obj);
                if (!PackageParserCAG.P28.SigningDetails.hasPastSigningCertificates().call(packageG.f167510m, new Object[0]).booleanValue()) {
                    if (!PackageParserCAG.P28.SigningDetails.hasSignatures().call(packageG.f167510m, new Object[0]).booleanValue()) {
                        packageInfo.signatures = null;
                        return packageInfo;
                    }
                    Signature[] signatureArr = PackageParserCAG.P28.SigningDetails.signatures().get(packageG.f167510m);
                    int length = signatureArr.length;
                    Signature[] signatureArr2 = new Signature[length];
                    packageInfo.signatures = signatureArr2;
                    System.arraycopy(signatureArr, 0, signatureArr2, 0, length);
                    return packageInfo;
                }
                Signature[] signatureArr3 = PackageParserCAG.P28.SigningDetails.pastSigningCertificates().get(packageG.f167510m);
                if (signatureArr3 != null && signatureArr3.length > 0) {
                    packageInfo.signatures = new Signature[]{signatureArr3[0]};
                    return packageInfo;
                }
            } else {
                if (packageG.f167509l == null) {
                    if (C3841e.v()) {
                        packageInfo.signingInfo = null;
                    }
                    packageInfo.signatures = null;
                    return packageInfo;
                }
                if (C3841e.v()) {
                    packageInfo.signingInfo = null;
                }
                Signature[] signatureArr4 = packageG.f167509l;
                int length2 = signatureArr4.length;
                Signature[] signatureArr5 = new Signature[length2];
                packageInfo.signatures = signatureArr5;
                if (length2 > 0) {
                    System.arraycopy(signatureArr4, 0, signatureArr5, 0, length2);
                }
            }
        }
        return packageInfo;
    }

    public static PermissionGroupInfo s(e eVar, int i10) {
        if (eVar == null) {
            return null;
        }
        if ((i10 & 128) == 0) {
            return eVar.f167537f;
        }
        PermissionGroupInfo permissionGroupInfo = (PermissionGroupInfo) C.b(eVar.f167537f);
        permissionGroupInfo.metaData = eVar.f167533d;
        return permissionGroupInfo;
    }

    public static PermissionInfo t(d dVar, int i10) {
        if (dVar == null) {
            return null;
        }
        if ((i10 & 128) == 0) {
            return dVar.f167536f;
        }
        PermissionInfo permissionInfo = (PermissionInfo) C.b(dVar.f167536f);
        permissionInfo.metaData = dVar.f167533d;
        return permissionInfo;
    }

    public static ProviderInfo u(f fVar, int i10, PackageUserStateG packageUserStateG, int i11, boolean z10) {
        return v(fVar, i10, packageUserStateG, i11, z10, null);
    }

    public static ProviderInfo v(f fVar, int i10, PackageUserStateG packageUserStateG, int i11, boolean z10, ApplicationInfo applicationInfo) {
        Bundle bundle;
        if (fVar == null || !g(packageUserStateG, i10)) {
            return null;
        }
        ProviderInfo providerInfo = new ProviderInfo(fVar.f167538f);
        ComponentUtils.c(providerInfo);
        if ((i10 & 128) == 0 || (bundle = fVar.f167533d) == null) {
            providerInfo.metaData = null;
        } else {
            providerInfo.metaData = bundle;
        }
        if ((i10 & 2048) == 0) {
            providerInfo.uriPermissionPatterns = null;
        }
        if (!z10) {
            providerInfo.applicationInfo = new ApplicationInfo();
            return providerInfo;
        }
        if (applicationInfo == null) {
            applicationInfo = p(fVar.f167530a, i10, packageUserStateG, i11);
        }
        providerInfo.applicationInfo = applicationInfo;
        return providerInfo;
    }

    public static ServiceInfo w(g gVar, int i10, PackageUserStateG packageUserStateG, int i11, boolean z10) {
        return x(gVar, i10, packageUserStateG, i11, z10, null);
    }

    public static ServiceInfo x(g gVar, int i10, PackageUserStateG packageUserStateG, int i11, boolean z10, ApplicationInfo applicationInfo) {
        Bundle bundle;
        if (gVar == null || !g(packageUserStateG, i10)) {
            return null;
        }
        ServiceInfo serviceInfo = (ServiceInfo) C.b(gVar.f167539f);
        ComponentUtils.c(serviceInfo);
        if ((i10 & 128) == 0 || (bundle = gVar.f167533d) == null) {
            serviceInfo.metaData = null;
        } else {
            serviceInfo.metaData = bundle;
        }
        if (!z10) {
            serviceInfo.applicationInfo = new ApplicationInfo();
            return serviceInfo;
        }
        if (applicationInfo == null) {
            applicationInfo = p(gVar.f167530a, i10, packageUserStateG, i11);
        }
        serviceInfo.applicationInfo = applicationInfo;
        return serviceInfo;
    }

    @SuppressLint({"NewApi"})
    public static boolean y(PackageG packageG, b bVar, int i10, int i11) {
        if (packageG == null || packageG.f167488A == null || bVar == null) {
            return true;
        }
        return PackageSettingG.isEnabledLPr(bVar, i10, i11);
    }

    public static Certificate[] z(JarFile jarFile, JarEntry jarEntry, byte[] bArr) {
        try {
            InputStream inputStream = jarFile.getInputStream(jarEntry);
            while (inputStream.read(bArr, 0, bArr.length) != -1) {
            }
            inputStream.close();
            if (jarEntry != null) {
                return jarEntry.getCertificates();
            }
            return null;
        } catch (IOException unused) {
            jarEntry.getName();
            jarFile.getName();
            return null;
        }
    }

    public static class a extends b<ActivityIntentInfo> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ActivityInfo f167529f;

        public a() {
            this.f167531b = new ArrayList<>();
        }

        @Override // com.prism.gaia.server.pm.PackageParserG.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ActivityInfo a() {
            return this.f167529f;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public a(Parcel parcel) {
            this.f167529f = (ActivityInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
            this.f167532c = parcel.readString();
            this.f167533d = parcel.readBundle(Bundle.class.getClassLoader());
            int i10 = parcel.readInt();
            this.f167531b = new ArrayList<>(i10);
            while (true) {
                int i11 = i10 - 1;
                if (i10 <= 0) {
                    return;
                }
                this.f167531b.add(new ActivityIntentInfo(parcel));
                i10 = i11;
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public a(Object obj) {
            super(obj);
            List<IntentFilter> list = PackageParserCAG.f165667G.Component.intents().get(obj);
            if (list != null) {
                this.f167531b = new ArrayList<>(list.size());
                Iterator<IntentFilter> it = list.iterator();
                while (it.hasNext()) {
                    this.f167531b.add(new ActivityIntentInfo(it.next()));
                }
            }
            this.f167529f = PackageParserCAG.f165667G.Activity.info().get(obj);
        }
    }

    public static class c extends b<IntentInfo> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InstrumentationInfo f167535f;

        public c() {
            this.f167531b = new ArrayList<>();
        }

        @Override // com.prism.gaia.server.pm.PackageParserG.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public InstrumentationInfo a() {
            return this.f167535f;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public c(Parcel parcel) {
            this.f167535f = (InstrumentationInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
            this.f167532c = parcel.readString();
            this.f167533d = parcel.readBundle(Bundle.class.getClassLoader());
            int i10 = parcel.readInt();
            this.f167531b = new ArrayList<>(i10);
            while (true) {
                int i11 = i10 - 1;
                if (i10 <= 0) {
                    return;
                }
                this.f167531b.add((II) new IntentInfo(parcel));
                i10 = i11;
            }
        }

        public c(Object obj) {
            super(obj);
            this.f167535f = PackageParserCAG.f165667G.Instrumentation.info().get(obj);
        }
    }

    public static class d extends b<IntentInfo> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public PermissionInfo f167536f;

        public d() {
            this.f167531b = new ArrayList<>();
        }

        @Override // com.prism.gaia.server.pm.PackageParserG.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public PermissionInfo a() {
            return this.f167536f;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public d(Parcel parcel) {
            this.f167536f = (PermissionInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
            this.f167532c = parcel.readString();
            this.f167533d = parcel.readBundle(Bundle.class.getClassLoader());
            int i10 = parcel.readInt();
            this.f167531b = new ArrayList<>(i10);
            while (true) {
                int i11 = i10 - 1;
                if (i10 <= 0) {
                    return;
                }
                this.f167531b.add((II) new IntentInfo(parcel));
                i10 = i11;
            }
        }

        public d(Object obj) {
            super(obj);
            this.f167536f = PackageParserCAG.f165667G.Permission.info().get(obj);
        }
    }

    public static class e extends b<IntentInfo> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public PermissionGroupInfo f167537f;

        public e() {
            this.f167531b = new ArrayList<>();
        }

        @Override // com.prism.gaia.server.pm.PackageParserG.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public PermissionGroupInfo a() {
            return this.f167537f;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public e(Parcel parcel) {
            this.f167537f = (PermissionGroupInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
            this.f167532c = parcel.readString();
            this.f167533d = parcel.readBundle(Bundle.class.getClassLoader());
            int i10 = parcel.readInt();
            this.f167531b = new ArrayList<>(i10);
            while (true) {
                int i11 = i10 - 1;
                if (i10 <= 0) {
                    return;
                }
                this.f167531b.add((II) new IntentInfo(parcel));
                i10 = i11;
            }
        }

        public e(Object obj) {
            super(obj);
            this.f167537f = PackageParserCAG.f165667G.PermissionGroup.info().get(obj);
        }
    }

    public static class f extends b<ProviderIntentInfo> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ProviderInfo f167538f;

        public f() {
            this.f167531b = new ArrayList<>();
        }

        @Override // com.prism.gaia.server.pm.PackageParserG.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ProviderInfo a() {
            return this.f167538f;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public f(Parcel parcel) {
            this.f167538f = (ProviderInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
            this.f167532c = parcel.readString();
            this.f167533d = parcel.readBundle(Bundle.class.getClassLoader());
            int i10 = parcel.readInt();
            this.f167531b = new ArrayList<>(i10);
            while (true) {
                int i11 = i10 - 1;
                if (i10 <= 0) {
                    return;
                }
                this.f167531b.add(new ProviderIntentInfo(parcel));
                i10 = i11;
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public f(Object obj) {
            super(obj);
            List<IntentFilter> list = PackageParserCAG.f165667G.Component.intents().get(obj);
            if (list != null) {
                this.f167531b = new ArrayList<>(list.size());
                Iterator<IntentFilter> it = list.iterator();
                while (it.hasNext()) {
                    this.f167531b.add(new ProviderIntentInfo(it.next()));
                }
            }
            this.f167538f = PackageParserCAG.f165667G.Provider.info().get(obj);
        }
    }

    public static class g extends b<ServiceIntentInfo> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ServiceInfo f167539f;

        public g() {
            this.f167531b = new ArrayList<>();
        }

        @Override // com.prism.gaia.server.pm.PackageParserG.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ServiceInfo a() {
            return this.f167539f;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public g(Parcel parcel) {
            this.f167539f = (ServiceInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
            this.f167532c = parcel.readString();
            this.f167533d = parcel.readBundle(Bundle.class.getClassLoader());
            int i10 = parcel.readInt();
            this.f167531b = new ArrayList<>(i10);
            while (true) {
                int i11 = i10 - 1;
                if (i10 <= 0) {
                    return;
                }
                this.f167531b.add(new ServiceIntentInfo(parcel));
                i10 = i11;
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public g(Object obj) {
            super(obj);
            List<IntentFilter> list = PackageParserCAG.f165667G.Component.intents().get(obj);
            if (list != null) {
                this.f167531b = new ArrayList<>(list.size());
                Iterator<IntentFilter> it = list.iterator();
                while (it.hasNext()) {
                    this.f167531b.add(new ServiceIntentInfo(it.next()));
                }
            }
            this.f167539f = PackageParserCAG.f165667G.Service.info().get(obj);
        }
    }
}
