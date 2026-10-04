package com.prism.gaia.server.pm;

import android.os.Parcel;
import com.prism.gaia.helper.PersistenceHelper;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class A extends PersistenceHelper<Set<PackageSettingG>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f167414e = "asdf-".concat(A.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char[] f167415f = {androidx.compose.ui.graphics.vector.f.f101677i, 'p', 'k', 'g'};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f167416g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f167417h = 1195726932;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f167418i = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f167419d;

    public A() {
        super(D9.d.O());
        this.f167419d = 16;
    }

    public static void m(Parcel parcel, int i10, int i11) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10);
        parcel.writeInt(iDataPosition - i11);
        parcel.setDataPosition(iDataPosition);
    }

    @Override // com.prism.gaia.helper.PersistenceHelper
    public int b() {
        return 16;
    }

    @Override // com.prism.gaia.helper.PersistenceHelper
    public void e() {
        this.f164941a.getAbsolutePath();
    }

    @Override // com.prism.gaia.helper.PersistenceHelper
    public boolean f(int i10, int i11) {
        if (i10 > i11) {
            return false;
        }
        this.f167419d = i10;
        return true;
    }

    @Override // com.prism.gaia.helper.PersistenceHelper
    public boolean j(Parcel parcel) {
        return Arrays.equals(parcel.createCharArray(), f167415f);
    }

    @Override // com.prism.gaia.helper.PersistenceHelper
    public void l(Parcel parcel) {
        parcel.writeCharArray(f167415f);
    }

    public int n() {
        return this.f167419d;
    }

    @Override // com.prism.gaia.helper.PersistenceHelper
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Set<PackageSettingG> h(Parcel parcel) {
        int i10 = parcel.readInt();
        HashSet hashSet = new HashSet();
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                p(hashSet, parcel);
                return hashSet;
            }
            hashSet.add(PackageSettingG.CREATOR.b(parcel, this.f167419d));
            i10 = i11;
        }
    }

    public final void p(Set<PackageSettingG> set, Parcel parcel) {
        try {
            if (parcel.dataAvail() < 12) {
                return;
            }
            int iDataPosition = parcel.dataPosition();
            if (parcel.readInt() != 1195726932) {
                parcel.setDataPosition(iDataPosition);
                return;
            }
            int i10 = parcel.readInt();
            int iDataPosition2 = parcel.dataPosition() + parcel.readInt();
            if (i10 > 1) {
                parcel.setDataPosition(iDataPosition2);
                return;
            }
            HashMap map = new HashMap();
            for (PackageSettingG packageSettingG : set) {
                map.put(packageSettingG.packageName, packageSettingG);
            }
            int i11 = parcel.readInt();
            while (true) {
                int i12 = i11 - 1;
                if (i11 <= 0 || parcel.dataPosition() >= iDataPosition2) {
                    break;
                }
                int i13 = parcel.readInt();
                int iDataPosition3 = parcel.dataPosition();
                String string = parcel.readString();
                long j10 = parcel.readLong();
                long j11 = parcel.readLong();
                PackageSettingG packageSettingG2 = (PackageSettingG) map.get(string);
                if (packageSettingG2 != null) {
                    packageSettingG2.firstInstallTime = j10;
                    packageSettingG2.lastUpdateTime = j11;
                }
                parcel.setDataPosition(iDataPosition3 + i13);
                i11 = i12;
            }
            parcel.setDataPosition(iDataPosition2);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.prism.gaia.helper.PersistenceHelper
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(Set<PackageSettingG> set, Parcel parcel) {
        parcel.writeInt(set.size());
        Iterator<PackageSettingG> it = set.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, 0);
        }
        r(set, parcel);
    }

    public final void r(Set<PackageSettingG> set, Parcel parcel) {
        parcel.writeInt(f167417h);
        parcel.writeInt(1);
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        int iDataPosition2 = parcel.dataPosition();
        parcel.writeInt(set.size());
        for (PackageSettingG packageSettingG : set) {
            int iDataPosition3 = parcel.dataPosition();
            parcel.writeInt(0);
            int iDataPosition4 = parcel.dataPosition();
            parcel.writeString(packageSettingG.packageName);
            parcel.writeLong(packageSettingG.firstInstallTime);
            parcel.writeLong(packageSettingG.lastUpdateTime);
            m(parcel, iDataPosition3, iDataPosition4);
        }
        m(parcel, iDataPosition, iDataPosition2);
    }

    public A(File file) {
        super(file);
        this.f167419d = 16;
    }
}
