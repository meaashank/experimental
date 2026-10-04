package com.prism.gaia.naked.compat.android.content.pm;

import X7.g;
import a7.c;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import com.prism.gaia.remote.PropertyG;
import com.prism.gaia.server.pm.D;

/* JADX INFO: loaded from: classes6.dex */
public class PackagePropertyCompat {
    private static final int PLATFORM_TYPE_BOOLEAN = 1;
    private static final int PLATFORM_TYPE_FLOAT = 2;
    private static final int PLATFORM_TYPE_INTEGER = 3;
    private static final int PLATFORM_TYPE_RESOURCE = 4;
    private static final int PLATFORM_TYPE_STRING = 5;
    private static final String TAG = "PackagePropertyCompat";
    private static volatile Boolean sUsable;

    private PackagePropertyCompat() {
    }

    public static PackageManager.Property build(PropertyG propertyG) {
        if (propertyG == null || propertyG.value == null || !isUsable()) {
            return null;
        }
        return buildUnchecked(propertyG.name, propertyG.packageName, propertyG.className, propertyG.value);
    }

    private static PackageManager.Property buildUnchecked(String str, String str2, String str3, D d10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeString(str);
            switch (d10.f167430a) {
                case 1:
                    parcelObtain.writeInt(1);
                    writeScope(parcelObtain, str2, str3);
                    parcelObtain.writeBoolean(d10.f167431b);
                    break;
                case 2:
                    parcelObtain.writeInt(3);
                    writeScope(parcelObtain, str2, str3);
                    parcelObtain.writeInt(d10.f167432c);
                    break;
                case 3:
                    parcelObtain.writeInt(2);
                    writeScope(parcelObtain, str2, str3);
                    parcelObtain.writeFloat(d10.f167433d);
                    break;
                case 4:
                case 6:
                    parcelObtain.writeInt(5);
                    writeScope(parcelObtain, str2, str3);
                    parcelObtain.writeString(d10.f167434e);
                    break;
                case 5:
                    parcelObtain.writeInt(4);
                    writeScope(parcelObtain, str2, str3);
                    parcelObtain.writeInt(d10.f167432c);
                    break;
                default:
                    return null;
            }
            parcelObtain.setDataPosition(0);
            return g.a(PackageManager.Property.CREATOR.createFromParcel(parcelObtain));
        } catch (Throwable th) {
            try {
                th.getMessage();
                return null;
            } finally {
                parcelObtain.recycle();
            }
        }
    }

    private static boolean isUsable() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        Boolean bool = sUsable;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zSelfCheck = selfCheck();
        sUsable = Boolean.valueOf(zSelfCheck);
        return zSelfCheck;
    }

    private static boolean selfCheck() {
        try {
            PackageManager.Property propertyBuildUnchecked = buildUnchecked("gaia.selfcheck.bool", "p", c.f84756a, D.b(true));
            PackageManager.Property propertyBuildUnchecked2 = buildUnchecked("gaia.selfcheck.int", "p", null, D.d(424242));
            PackageManager.Property propertyBuildUnchecked3 = buildUnchecked("gaia.selfcheck.float", "p", null, D.c(1.5f));
            PackageManager.Property propertyBuildUnchecked4 = buildUnchecked("gaia.selfcheck.string", "p", null, D.f("v"));
            PackageManager.Property propertyBuildUnchecked5 = buildUnchecked("gaia.selfcheck.res", "p", null, D.e(2130772483));
            if (propertyBuildUnchecked != null && propertyBuildUnchecked.isBoolean() && propertyBuildUnchecked.getBoolean() && "gaia.selfcheck.bool".equals(propertyBuildUnchecked.getName()) && "p".equals(propertyBuildUnchecked.getPackageName()) && c.f84756a.equals(propertyBuildUnchecked.getClassName()) && propertyBuildUnchecked2 != null && propertyBuildUnchecked2.isInteger() && propertyBuildUnchecked2.getInteger() == 424242 && propertyBuildUnchecked3 != null && propertyBuildUnchecked3.isFloat() && propertyBuildUnchecked3.getFloat() == 1.5f && propertyBuildUnchecked4 != null && propertyBuildUnchecked4.isString() && "v".equals(propertyBuildUnchecked4.getString()) && propertyBuildUnchecked5 != null && propertyBuildUnchecked5.isResourceId()) {
                return propertyBuildUnchecked5.getResourceId() == 2130772483;
            }
            return false;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private static void writeScope(Parcel parcel, String str, String str2) {
        parcel.writeString(str);
        parcel.writeString(str2);
    }
}
