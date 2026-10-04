package com.prism.gaia.server.pm;

import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureInfo;
import android.os.Bundle;
import android.os.Parcel;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.compat.android.content.pm.ApplicationInfoCompat2;
import com.prism.gaia.server.pm.PackageG;
import com.prism.gaia.server.pm.PackageParserG;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f167647a = "asdf-".concat(t.class.getSimpleName());

    public static void a(PackageG packageG, Parcel parcel, int i10) {
        packageG.f167508k = null;
        if (i10 >= 12) {
            packageG.f167508k = (ApplicationInfo) parcel.readParcelable(ApplicationInfo.class.getClassLoader());
        }
        int i11 = parcel.readInt();
        packageG.f167498a = new ArrayList<>(i11);
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                break;
            }
            PackageParserG.a aVar = new PackageParserG.a(parcel);
            ApplicationInfo applicationInfo = packageG.f167508k;
            if (applicationInfo == null) {
                packageG.f167508k = aVar.f167529f.applicationInfo;
            } else {
                aVar.f167529f.applicationInfo = applicationInfo;
            }
            packageG.f167498a.add(aVar);
            i11 = i12;
        }
        int i13 = parcel.readInt();
        packageG.f167499b = new ArrayList<>(i13);
        while (true) {
            int i14 = i13 - 1;
            if (i13 <= 0) {
                break;
            }
            PackageParserG.a aVar2 = new PackageParserG.a(parcel);
            ApplicationInfo applicationInfo2 = packageG.f167508k;
            if (applicationInfo2 == null) {
                packageG.f167508k = aVar2.f167529f.applicationInfo;
            } else {
                aVar2.f167529f.applicationInfo = applicationInfo2;
            }
            packageG.f167499b.add(aVar2);
            i13 = i14;
        }
        int i15 = parcel.readInt();
        packageG.f167500c = new ArrayList<>(i15);
        while (true) {
            int i16 = i15 - 1;
            if (i15 <= 0) {
                break;
            }
            PackageParserG.f fVar = new PackageParserG.f(parcel);
            ApplicationInfo applicationInfo3 = packageG.f167508k;
            if (applicationInfo3 == null) {
                packageG.f167508k = fVar.f167538f.applicationInfo;
            } else {
                fVar.f167538f.applicationInfo = applicationInfo3;
            }
            packageG.f167500c.add(fVar);
            i15 = i16;
        }
        int i17 = parcel.readInt();
        packageG.f167501d = new ArrayList<>(i17);
        while (true) {
            int i18 = i17 - 1;
            if (i17 <= 0) {
                break;
            }
            PackageParserG.g gVar = new PackageParserG.g(parcel);
            ApplicationInfo applicationInfo4 = packageG.f167508k;
            if (applicationInfo4 == null) {
                packageG.f167508k = gVar.f167539f.applicationInfo;
            } else {
                gVar.f167539f.applicationInfo = applicationInfo4;
            }
            packageG.f167501d.add(gVar);
            i17 = i18;
        }
        int i19 = parcel.readInt();
        packageG.f167502e = new ArrayList<>(i19);
        while (true) {
            int i20 = i19 - 1;
            if (i19 <= 0) {
                break;
            }
            packageG.f167502e.add(new PackageParserG.c(parcel));
            i19 = i20;
        }
        int i21 = parcel.readInt();
        packageG.f167503f = new ArrayList<>(i21);
        while (true) {
            int i22 = i21 - 1;
            if (i21 <= 0) {
                break;
            }
            packageG.f167503f.add(new PackageParserG.d(parcel));
            i21 = i22;
        }
        int i23 = parcel.readInt();
        packageG.f167504g = new ArrayList<>(i23);
        while (true) {
            int i24 = i23 - 1;
            if (i23 <= 0) {
                break;
            }
            packageG.f167504g.add(new PackageParserG.e(parcel));
            i23 = i24;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        packageG.f167505h = arrayListCreateStringArrayList;
        if (arrayListCreateStringArrayList == null) {
            packageG.f167505h = new ArrayList<>(0);
        }
        packageG.f167507j = parcel.createStringArrayList();
        if (i10 <= 11) {
            if (packageG.f167508k == null) {
                packageG.f167508k = (ApplicationInfo) parcel.readParcelable(ApplicationInfo.class.getClassLoader());
            } else {
                parcel.readParcelable(ApplicationInfo.class.getClassLoader());
            }
        }
        packageG.f167511n = parcel.readBundle(Bundle.class.getClassLoader());
        packageG.f167512o = parcel.readString();
        packageG.f167513p = parcel.readInt();
        packageG.f167514q = parcel.readString();
        packageG.f167515r = parcel.readString();
        packageG.f167516s = parcel.createStringArrayList();
        if (i10 >= 6) {
            packageG.f167517t = parcel.createStringArrayList();
        } else {
            packageG.f167517t = new ArrayList<>();
        }
        if (i10 >= 11) {
            packageG.f167518u = parcel.createStringArrayList();
        } else {
            packageG.f167518u = new ArrayList<>();
        }
        packageG.f167519v = parcel.readInt();
        if (i10 >= 8) {
            packageG.f167520w = parcel.readInt();
        } else if (C3841e.v()) {
            long longVersionCode = ApplicationInfoCompat2.Util.getLongVersionCode(packageG.f167508k);
            if (packageG.f167519v == ((int) longVersionCode)) {
                packageG.f167520w = (int) (longVersionCode >> 32);
            } else {
                packageG.f167520w = -1;
            }
        } else {
            packageG.f167520w = -1;
        }
        packageG.f167521x = parcel.readInt();
        packageG.f167522y = parcel.createTypedArrayList(ConfigurationInfo.CREATOR);
        packageG.f167523z = parcel.createTypedArrayList(FeatureInfo.CREATOR);
        if (i10 >= 5) {
            int i25 = parcel.readInt();
            if (i25 > 0) {
                packageG.f167489B = new String[i25];
                while (true) {
                    int i26 = i25 - 1;
                    if (i25 <= 0) {
                        break;
                    }
                    packageG.f167489B[i26] = parcel.readString();
                    i25 = i26;
                }
            }
            int i27 = parcel.readInt();
            if (i27 > 0) {
                packageG.f167490C = new int[i27];
                while (true) {
                    int i28 = i27 - 1;
                    if (i27 <= 0) {
                        break;
                    }
                    packageG.f167490C[i28] = parcel.readInt();
                    i27 = i28;
                }
            }
        }
        if (i10 >= 7) {
            PackageG.State state = PackageG.State.values()[parcel.readInt()];
            packageG.f167491D = state;
            if (i10 >= 10) {
                packageG.f167492E = PackageG.StateCode.readFromParcel(parcel);
            } else {
                packageG.f167492E = state.isRightState() ? PackageG.StateCode.DEFAULT : PackageG.StateCode.INSTALL_ERROR;
            }
            packageG.f167493F = parcel.readString();
        } else {
            packageG.f167491D = PackageG.State.DEFAULT;
            packageG.f167492E = PackageG.StateCode.DEFAULT;
            packageG.f167493F = null;
        }
        if (i10 >= 9) {
            packageG.D(parcel.readInt());
        }
    }

    public static PackageG b(Parcel parcel) {
        try {
            int i10 = parcel.readInt();
            PackageG packageG = new PackageG();
            a(packageG, parcel, i10);
            packageG.j();
            return packageG;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }
}
