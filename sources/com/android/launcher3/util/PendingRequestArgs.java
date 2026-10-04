package com.android.launcher3.util;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.widget.WidgetAddFlowHandler;

/* JADX INFO: loaded from: classes2.dex */
public class PendingRequestArgs extends ItemInfo implements Parcelable {
    public static final Parcelable.Creator<PendingRequestArgs> CREATOR = new AnonymousClass1();
    private static final int TYPE_APP_WIDGET = 2;
    private static final int TYPE_INTENT = 1;
    private static final int TYPE_NONE = 0;
    private final int mArg1;
    private final Parcelable mObject;
    private final int mObjectType;

    /* JADX INFO: renamed from: com.android.launcher3.util.PendingRequestArgs$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<PendingRequestArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PendingRequestArgs createFromParcel(Parcel parcel) {
            return new PendingRequestArgs(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PendingRequestArgs[] newArray(int i10) {
            return new PendingRequestArgs[i10];
        }
    }

    public PendingRequestArgs(ItemInfo itemInfo) {
        this.mArg1 = 0;
        this.mObjectType = 0;
        this.mObject = null;
        copyFrom(itemInfo);
    }

    public static PendingRequestArgs forIntent(int i10, Intent intent, ItemInfo itemInfo) {
        PendingRequestArgs pendingRequestArgs = new PendingRequestArgs(i10, 1, intent);
        pendingRequestArgs.copyFrom(itemInfo);
        return pendingRequestArgs;
    }

    public static PendingRequestArgs forWidgetInfo(int i10, WidgetAddFlowHandler widgetAddFlowHandler, ItemInfo itemInfo) {
        PendingRequestArgs pendingRequestArgs = new PendingRequestArgs(i10, 2, widgetAddFlowHandler);
        pendingRequestArgs.copyFrom(itemInfo);
        return pendingRequestArgs;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Intent getPendingIntent() {
        if (this.mObjectType == 1) {
            return (Intent) this.mObject;
        }
        return null;
    }

    public int getRequestCode() {
        if (this.mObjectType == 1) {
            return this.mArg1;
        }
        return 0;
    }

    public WidgetAddFlowHandler getWidgetHandler() {
        if (this.mObjectType == 2) {
            return (WidgetAddFlowHandler) this.mObject;
        }
        return null;
    }

    public int getWidgetId() {
        if (this.mObjectType == 2) {
            return this.mArg1;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        ContentValues contentValues = new ContentValues();
        writeToValues(new ContentWriter(contentValues, (Context) null));
        contentValues.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.user, i10);
        parcel.writeInt(this.mArg1);
        parcel.writeInt(this.mObjectType);
        parcel.writeParcelable(this.mObject, i10);
    }

    private PendingRequestArgs(int i10, int i11, Parcelable parcelable) {
        this.mArg1 = i10;
        this.mObjectType = i11;
        this.mObject = parcelable;
    }

    public PendingRequestArgs(Parcel parcel) {
        readFromValues((ContentValues) ContentValues.CREATOR.createFromParcel(parcel));
        this.user = (UserHandle) parcel.readParcelable(null);
        this.mArg1 = parcel.readInt();
        this.mObjectType = parcel.readInt();
        this.mObject = parcel.readParcelable(getClass().getClassLoader());
    }
}
