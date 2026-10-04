package com.prism.gaia.server.pm;

import android.os.Parcel;
import android.os.Parcelable;
import com.prism.gaia.helper.interfaces.ParcelableG;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes6.dex */
public class PackageUserStateG implements Parcelable {
    public static final int CURRENT_VERSION = 4;
    HashSet<String> disabledComponents;
    int enabled;
    HashSet<String> enabledComponents;
    private boolean hidden;
    boolean installed;
    private String lastDisableAppCaller;
    boolean launched;
    private HashMap<String, HashSet<String>> mimeGroups;
    private static final String TAG = "asdf-".concat("PackageUserStateG");
    public static final ParcelableG.b<PackageUserStateG> CREATOR = new a();

    public class a implements ParcelableG.b<PackageUserStateG> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PackageUserStateG createFromParcel(Parcel parcel) {
            return new PackageUserStateG(parcel, 0);
        }

        @Override // com.prism.gaia.helper.interfaces.ParcelableG.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public PackageUserStateG b(Parcel parcel, int i10) {
            return new PackageUserStateG(parcel, i10);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public PackageUserStateG[] newArray(int i10) {
            return new PackageUserStateG[i10];
        }
    }

    public PackageUserStateG() {
        this.enabled = 0;
        this.launched = false;
        this.hidden = false;
        this.installed = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getEnabled() {
        return this.enabled;
    }

    public Set<String> getMimeGroup(String str) {
        HashMap<String, HashSet<String>> map = this.mimeGroups;
        HashSet<String> hashSet = map == null ? null : map.get(str);
        return hashSet == null ? new HashSet() : new HashSet(hashSet);
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public boolean isInstalled() {
        return this.installed;
    }

    public void setEnabled(int i10) {
        this.enabled = i10;
    }

    public void setHidden(boolean z10) {
        this.hidden = z10;
    }

    public void setInstalled(boolean z10) {
        this.installed = z10;
    }

    public boolean setMimeGroup(String str, Set<String> set) {
        if (this.mimeGroups == null) {
            this.mimeGroups = new HashMap<>();
        }
        HashSet<String> hashSet = set == null ? new HashSet<>() : new HashSet<>(set);
        return !hashSet.equals(this.mimeGroups.put(str, hashSet));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{launched:");
        sb2.append(this.launched);
        sb2.append(",lastDisableAppCaller:");
        String str = this.lastDisableAppCaller;
        if (str == null) {
            str = "(null)";
        }
        sb2.append(str);
        sb2.append(",disabledComponents:");
        HashSet<String> hashSet = this.disabledComponents;
        String string = HttpUrl.f225216p;
        sb2.append(hashSet == null ? HttpUrl.f225216p : hashSet.toString());
        sb2.append(",enabledComponents:");
        HashSet<String> hashSet2 = this.enabledComponents;
        if (hashSet2 != null) {
            string = hashSet2.toString();
        }
        sb2.append(string);
        sb2.append(",mimeGroups:");
        HashMap<String, HashSet<String>> map = this.mimeGroups;
        return android.support.v4.media.e.a(sb2, map == null ? Ib.b.f53002g : map.toString(), "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.launched ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hidden ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.installed ? (byte) 1 : (byte) 0);
        parcel.writeString(this.lastDisableAppCaller);
        HashSet<String> hashSet = this.disabledComponents;
        if (hashSet != null) {
            parcel.writeInt(hashSet.size());
            Iterator<String> it = this.disabledComponents.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next());
            }
        } else {
            parcel.writeInt(0);
        }
        HashSet<String> hashSet2 = this.enabledComponents;
        if (hashSet2 != null) {
            parcel.writeInt(hashSet2.size());
            Iterator<String> it2 = this.enabledComponents.iterator();
            while (it2.hasNext()) {
                parcel.writeString(it2.next());
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.enabled);
        HashMap<String, HashSet<String>> map = this.mimeGroups;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, HashSet<String>> entry : this.mimeGroups.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeInt(entry.getValue().size());
            Iterator<String> it3 = entry.getValue().iterator();
            while (it3.hasNext()) {
                parcel.writeString(it3.next());
            }
        }
    }

    public PackageUserStateG(Parcel parcel, int i10) {
        this.enabled = 0;
        this.launched = parcel.readByte() != 0;
        this.hidden = parcel.readByte() != 0;
        this.installed = parcel.readByte() != 0;
        if (i10 >= 1) {
            this.lastDisableAppCaller = parcel.readString();
            int i11 = parcel.readInt();
            if (i11 > 0) {
                this.disabledComponents = new HashSet<>(i11);
            }
            while (true) {
                int i12 = i11 - 1;
                if (i11 <= 0) {
                    break;
                }
                this.disabledComponents.add(parcel.readString());
                i11 = i12;
            }
            int i13 = parcel.readInt();
            if (i13 > 0) {
                this.enabledComponents = new HashSet<>(i13);
            }
            while (true) {
                int i14 = i13 - 1;
                if (i13 <= 0) {
                    break;
                }
                this.enabledComponents.add(parcel.readString());
                i13 = i14;
            }
        }
        if (i10 >= 3) {
            this.enabled = parcel.readInt();
        }
        if (i10 < 4) {
            return;
        }
        int i15 = parcel.readInt();
        if (i15 > 0) {
            this.mimeGroups = new HashMap<>(i15);
        }
        while (true) {
            int i16 = i15 - 1;
            if (i15 <= 0) {
                return;
            }
            String string = parcel.readString();
            int i17 = parcel.readInt();
            HashSet<String> hashSet = new HashSet<>(Math.max(i17, 0));
            while (true) {
                int i18 = i17 - 1;
                if (i17 > 0) {
                    hashSet.add(parcel.readString());
                    i17 = i18;
                }
            }
            this.mimeGroups.put(string, hashSet);
            i15 = i16;
        }
    }
}
