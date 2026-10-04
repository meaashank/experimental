package com.prism.commons.notification;

import android.app.Notification;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public class NotificationBundle implements Parcelable {
    public static final Parcelable.Creator<NotificationBundle> CREATOR = new a();
    private static final String EXTRA_GAIA_FADE = "gaia_fade";
    public boolean fade;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public int f161981id;
    public Notification notification;
    public String tag;

    public class a implements Parcelable.Creator<NotificationBundle> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public NotificationBundle createFromParcel(Parcel parcel) {
            return new NotificationBundle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public NotificationBundle[] newArray(int i10) {
            return new NotificationBundle[i10];
        }
    }

    public NotificationBundle() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f161981id);
        parcel.writeString(this.tag);
        parcel.writeParcelable(this.notification, i10);
        parcel.writeByte(this.fade ? (byte) 1 : (byte) 0);
    }

    public NotificationBundle(int i10, Notification notification) {
        this(i10, null, notification, notification != null && notification.extras.getBoolean(EXTRA_GAIA_FADE));
    }

    public NotificationBundle(int i10, Notification notification, boolean z10) {
        this(i10, null, notification, z10);
    }

    public NotificationBundle(int i10, String str, Notification notification) {
        this(i10, str, notification, notification != null && notification.extras.getBoolean(EXTRA_GAIA_FADE));
    }

    public NotificationBundle(int i10, String str, Notification notification, boolean z10) {
        this.f161981id = i10;
        this.tag = str;
        this.notification = notification;
        this.fade = z10;
        if (notification == null || !z10) {
            return;
        }
        notification.extras.putBoolean(EXTRA_GAIA_FADE, true);
    }

    public NotificationBundle(Parcel parcel) {
        this.f161981id = parcel.readInt();
        this.tag = parcel.readString();
        this.notification = (Notification) parcel.readParcelable(Notification.class.getClassLoader());
        this.fade = parcel.readByte() != 0;
    }
}
