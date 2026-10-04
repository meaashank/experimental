package com.prism.gaia.os;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import android.util.SparseArray;
import androidx.compose.ui.graphics.vector.f;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.naked.compat.android.os.UserHandlerCompat2;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes6.dex */
public final class GaiaUserHandle implements Parcelable {
    private static final int FIRST_ISOLATED_VUID = 99000;
    private static final int FIRST_SHARED_APPLICATION_VGID = 50000;
    private static final int LAST_ISOLATED_VUID = 99999;
    private static final int LAST_SHARED_APPLICATION_VGID = 59999;
    private static final boolean MU_ENABLED = true;
    private static final int PER_VUSER_RANGE = 100000;
    public static final int VUID_SYSTEM = 1000;
    public static final int VUSERID_ALL = -1;
    public static final int VUSERID_CURRENT = -2;
    public static final int VUSERID_CURRENT_OR_SELF = -3;
    public static final int VUSERID_NULL = -10000;
    public static final int VUSERID_OWNER = 0;
    private final int mHandle;
    private static final int PER_USER_RANGE = UserHandlerCompat2.Util.getPerUserRange();
    public static final GaiaUserHandle VUSER_ALL = new GaiaUserHandle(-1);
    public static final GaiaUserHandle VUSER_CURRENT = new GaiaUserHandle(-2);
    public static final GaiaUserHandle VUSER_CURRENT_OR_SELF = new GaiaUserHandle(-3);
    public static final GaiaUserHandle VUSER_OWNER = new GaiaUserHandle(0);
    private static final boolean MU_ENABLED_SYSTEM = UserHandlerCompat2.Util.isMuEnabled();
    public static final Parcelable.Creator<GaiaUserHandle> CREATOR = new a();
    private static final SparseArray<GaiaUserHandle> vuserHandles = new SparseArray<>();

    public class a implements Parcelable.Creator<GaiaUserHandle> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GaiaUserHandle createFromParcel(Parcel parcel) {
            return new GaiaUserHandle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public GaiaUserHandle[] newArray(int i10) {
            return new GaiaUserHandle[i10];
        }
    }

    public GaiaUserHandle(int i10) {
        this.mHandle = i10;
    }

    public static boolean accept(int i10) {
        return i10 == -1 || i10 == GaiaContext.j().Z();
    }

    public static int fixToVuserId(int i10, int i11) {
        return getVuid(i11, getVappId(i10));
    }

    public static void formatUid(StringBuilder sb2, int i10) {
        if (i10 < 10000) {
            sb2.append(i10);
            return;
        }
        sb2.append('u');
        sb2.append(getVuserId(i10));
        int vappId = getVappId(i10);
        if (vappId >= FIRST_ISOLATED_VUID && vappId <= LAST_ISOLATED_VUID) {
            sb2.append('i');
            sb2.append(vappId - FIRST_ISOLATED_VUID);
        } else if (vappId >= 10000) {
            sb2.append(f.f101687s);
            sb2.append(vappId - 10000);
        } else {
            sb2.append(f.f101681m);
            sb2.append(vappId);
        }
    }

    public static int getAppIdFromSharedAppGid(int i10) {
        int vappId = getVappId(i10);
        if (vappId >= 50000 && vappId <= LAST_SHARED_APPLICATION_VGID) {
            return vappId - 40000;
        }
        throw new IllegalArgumentException(Integer.toString(i10) + " is not a shared app gid");
    }

    public static int getUserId(int i10) {
        int i11;
        if (!MU_ENABLED_SYSTEM || (i11 = PER_USER_RANGE) <= 0) {
            return 0;
        }
        return i10 / i11;
    }

    public static int getVappId(int i10) {
        return i10 % 100000;
    }

    public static int getVuid(int i10, int i11) {
        return (i11 % 100000) + (i10 * 100000);
    }

    public static int getVuserId(int i10) {
        return i10 / 100000;
    }

    public static boolean isApp(int i10) {
        int vappId;
        return i10 > 0 && (vappId = getVappId(i10)) >= 10000 && vappId <= 19999;
    }

    public static final boolean isIsolated(int i10) {
        int vappId;
        return i10 > 0 && (vappId = getVappId(i10)) >= FIRST_ISOLATED_VUID && vappId <= LAST_ISOLATED_VUID;
    }

    public static final boolean isSameApp(int i10, int i11) {
        return getVappId(i10) == getVappId(i11);
    }

    public static boolean isSameVuser(int i10, int i11) {
        return getVuserId(i10) == getVuserId(i11);
    }

    public static boolean isSystem(int i10) {
        return i10 == 1000;
    }

    public static GaiaUserHandle readFromParcel(Parcel parcel) {
        int i10 = parcel.readInt();
        if (i10 != -10000) {
            return new GaiaUserHandle(i10);
        }
        return null;
    }

    public static void writeToParcel(GaiaUserHandle gaiaUserHandle, Parcel parcel) {
        if (gaiaUserHandle != null) {
            gaiaUserHandle.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(-10000);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            try {
                if (this.mHandle == ((GaiaUserHandle) obj).mHandle) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public int getIdentifier() {
        return this.mHandle;
    }

    public int getmHandle() {
        return this.mHandle;
    }

    public int hashCode() {
        return this.mHandle;
    }

    public final boolean isOwner() {
        return equals(VUSER_OWNER);
    }

    public String toString() {
        return d.a(new StringBuilder("VUserHandle{"), this.mHandle, "}");
    }

    public GaiaUserHandle(Parcel parcel) {
        this.mHandle = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.mHandle);
    }

    public static String formatUid(int i10) {
        StringBuilder sb2 = new StringBuilder();
        formatUid(sb2, i10);
        return sb2.toString();
    }

    public static void formatUid(PrintWriter printWriter, int i10) {
        if (i10 < 10000) {
            printWriter.print(i10);
            return;
        }
        printWriter.print('u');
        printWriter.print(getVuserId(i10));
        int vappId = getVappId(i10);
        if (vappId >= FIRST_ISOLATED_VUID && vappId <= LAST_ISOLATED_VUID) {
            printWriter.print('i');
            printWriter.print(vappId - FIRST_ISOLATED_VUID);
        } else if (vappId >= 10000) {
            printWriter.print(f.f101687s);
            printWriter.print(vappId - 10000);
        } else {
            printWriter.print(f.f101681m);
            printWriter.print(vappId);
        }
    }
}
