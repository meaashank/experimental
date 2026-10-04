package com.prism.gaia.server.notification;

import D9.d;
import K9.s;
import K9.t;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.app.B;
import androidx.core.app.L;
import com.prism.commons.utils.l0;
import com.prism.gaia.helper.interfaces.ParcelableG;
import com.prism.gaia.helper.io.GFile;
import com.prism.gaia.helper.utils.l;
import e.T;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@T(26)
public class NotificationSetting implements Parcelable {
    public static final int CURRENT_VERSION = 2;
    private final Map<String, NotificationChannel> channels;
    private final Map<String, NotificationChannelGroup> groups;
    private final String packageName;
    private final int vuserId;
    private static final String TAG = l0.b("NotificationSetting");
    public static final ParcelableG.b<NotificationSetting> CREATOR = new a();

    public class a implements ParcelableG.b<NotificationSetting> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public NotificationSetting createFromParcel(Parcel parcel) {
            return new NotificationSetting(parcel, -1);
        }

        @Override // com.prism.gaia.helper.interfaces.ParcelableG.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public NotificationSetting b(Parcel parcel, int i10) {
            return new NotificationSetting(parcel, i10);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NotificationSetting[] newArray(int i10) {
            return new NotificationSetting[0];
        }
    }

    public NotificationSetting(String str, int i10) {
        this.packageName = str;
        this.vuserId = i10;
        this.channels = new HashMap();
        this.groups = new HashMap();
    }

    public static String getUniqKey(String str, int i10) {
        return str + "@" + i10;
    }

    @NonNull
    public static Map<String, NotificationSetting> loadNotificationSettings() {
        HashMap map = new HashMap();
        GFile gFileN = d.N();
        if (!gFileN.exists()) {
            return map;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            l.P(parcelObtain, gFileN);
            int i10 = parcelObtain.readInt();
            if (i10 != 2) {
                return map;
            }
            int i11 = parcelObtain.readInt();
            for (int i12 = 0; i12 < i11; i12++) {
                NotificationSetting notificationSettingB = CREATOR.b(parcelObtain, i10);
                map.put(notificationSettingB.getUniqKey(), notificationSettingB);
            }
            return map;
        } catch (Throwable th) {
            try {
                th.getMessage();
                return map;
            } finally {
                parcelObtain.recycle();
            }
        }
    }

    public static void saveNotificationSettings(@NonNull Map<String, NotificationSetting> map) {
        GFile gFileN = d.N();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInt(2);
            parcelObtain.writeInt(map.size());
            Iterator<NotificationSetting> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcelObtain, 0);
            }
            l.Q(parcelObtain, gFileN);
        } catch (Throwable th) {
            try {
                th.getMessage();
            } finally {
                parcelObtain.recycle();
            }
        }
    }

    public boolean addChannels(Collection<NotificationChannel> collection) {
        Iterator<NotificationChannel> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            NotificationChannel notificationChannelA = B.a(it.next());
            NotificationChannel notificationChannelA2 = B.a(this.channels.put(notificationChannelA.getId(), notificationChannelA));
            if (notificationChannelA2 == null || !notificationChannelA2.equals(notificationChannelA)) {
                notificationChannelA.getId();
                z10 = true;
            }
        }
        return z10;
    }

    public boolean addGroups(Collection<NotificationChannelGroup> collection) {
        Iterator<NotificationChannelGroup> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            NotificationChannelGroup notificationChannelGroupA = L.a(it.next());
            NotificationChannelGroup notificationChannelGroupA2 = L.a(this.groups.put(notificationChannelGroupA.getId(), notificationChannelGroupA));
            if (notificationChannelGroupA2 == null || !notificationChannelGroupA2.equals(notificationChannelGroupA)) {
                notificationChannelGroupA.getId();
                z10 = true;
            }
        }
        return z10;
    }

    public boolean deleteChannel(String str) {
        return this.channels.remove(str) != null;
    }

    public boolean deleteGroup(String str) {
        return this.groups.remove(str) != null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public NotificationChannel getChannel(String str) {
        return B.a(this.channels.get(str));
    }

    public Collection<NotificationChannel> getChannels() {
        return this.channels.values();
    }

    public NotificationChannel getConversationChannel(String str, String str2, boolean z10) {
        NotificationChannel notificationChannelA;
        Iterator<NotificationChannel> it = this.channels.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                notificationChannelA = null;
                break;
            }
            notificationChannelA = B.a(it.next());
            if (str.equals(notificationChannelA.getConversationId()) && str2.equals(notificationChannelA.getParentChannelId())) {
                break;
            }
        }
        return (notificationChannelA == null && z10) ? B.a(this.channels.get(str2)) : notificationChannelA;
    }

    public NotificationChannelGroup getGroup(String str) {
        return L.a(this.groups.get(str));
    }

    public Collection<NotificationChannelGroup> getGroups() {
        return this.groups.values();
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getVuserId() {
        return this.vuserId;
    }

    public boolean updateChannel(NotificationChannel notificationChannel) {
        NotificationChannel notificationChannelA = B.a(this.channels.get(notificationChannel.getId()));
        if (notificationChannelA == null || notificationChannelA.equals(notificationChannel)) {
            return false;
        }
        this.channels.put(notificationChannel.getId(), notificationChannel);
        notificationChannel.getId();
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.packageName);
        parcel.writeInt(this.vuserId);
        parcel.writeInt(this.channels.size());
        Iterator<NotificationChannel> it = this.channels.values().iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(B.a(it.next()), i10);
        }
        parcel.writeInt(this.groups.size());
        Iterator<NotificationChannelGroup> it2 = this.groups.values().iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(L.a(it2.next()), i10);
        }
    }

    public String getUniqKey() {
        return getUniqKey(this.packageName, this.vuserId);
    }

    public NotificationSetting(Parcel parcel, int i10) {
        this.packageName = parcel.readString();
        this.vuserId = parcel.readInt();
        this.channels = new HashMap();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            NotificationChannel notificationChannelA = B.a(parcel.readParcelable(s.a().getClassLoader()));
            if (notificationChannelA != null) {
                this.channels.put(notificationChannelA.getId(), notificationChannelA);
            }
        }
        this.groups = new HashMap();
        int i13 = parcel.readInt();
        for (int i14 = 0; i14 < i13; i14++) {
            NotificationChannelGroup notificationChannelGroupA = L.a(parcel.readParcelable(t.a().getClassLoader()));
            if (notificationChannelGroupA != null) {
                this.groups.put(notificationChannelGroupA.getId(), notificationChannelGroupA);
            }
        }
    }
}
