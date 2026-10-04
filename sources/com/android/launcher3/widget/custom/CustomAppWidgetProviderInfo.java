package com.android.launcher3.widget.custom;

import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.c;
import com.android.launcher3.LauncherAppWidgetProviderInfo;
import com.android.launcher3.Utilities;

/* JADX INFO: loaded from: classes2.dex */
public class CustomAppWidgetProviderInfo extends LauncherAppWidgetProviderInfo implements Parcelable {
    public static final Parcelable.Creator<CustomAppWidgetProviderInfo> CREATOR = new AnonymousClass1();
    public final int providerId;

    /* JADX INFO: renamed from: com.android.launcher3.widget.custom.CustomAppWidgetProviderInfo$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<CustomAppWidgetProviderInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomAppWidgetProviderInfo createFromParcel(Parcel parcel) {
            return new CustomAppWidgetProviderInfo(parcel, true, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomAppWidgetProviderInfo[] newArray(int i10) {
            return new CustomAppWidgetProviderInfo[i10];
        }
    }

    public CustomAppWidgetProviderInfo(Parcel parcel, boolean z10, int i10) {
        super(parcel);
        if (!z10) {
            this.providerId = i10;
            return;
        }
        this.providerId = parcel.readInt();
        ((AppWidgetProviderInfo) this).provider = new ComponentName(parcel.readString(), c.a(LauncherAppWidgetProviderInfo.CLS_CUSTOM_WIDGET_PREFIX, i10));
        ((AppWidgetProviderInfo) this).label = parcel.readString();
        ((AppWidgetProviderInfo) this).initialLayout = parcel.readInt();
        ((AppWidgetProviderInfo) this).icon = parcel.readInt();
        ((AppWidgetProviderInfo) this).previewImage = parcel.readInt();
        ((AppWidgetProviderInfo) this).resizeMode = parcel.readInt();
        this.spanX = parcel.readInt();
        this.spanY = parcel.readInt();
        this.minSpanX = parcel.readInt();
        this.minSpanY = parcel.readInt();
    }

    @Override // com.android.launcher3.LauncherAppWidgetProviderInfo
    public String getLabel(PackageManager packageManager) {
        return Utilities.trim(((AppWidgetProviderInfo) this).label);
    }

    @Override // com.android.launcher3.LauncherAppWidgetProviderInfo
    public void initSpans(Context context) {
    }

    @Override // android.appwidget.AppWidgetProviderInfo
    public String toString() {
        return "WidgetProviderInfo(" + ((AppWidgetProviderInfo) this).provider + ")";
    }

    @Override // android.appwidget.AppWidgetProviderInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.providerId);
        parcel.writeString(((AppWidgetProviderInfo) this).provider.getPackageName());
        parcel.writeString(((AppWidgetProviderInfo) this).label);
        parcel.writeInt(((AppWidgetProviderInfo) this).initialLayout);
        parcel.writeInt(((AppWidgetProviderInfo) this).icon);
        parcel.writeInt(((AppWidgetProviderInfo) this).previewImage);
        parcel.writeInt(((AppWidgetProviderInfo) this).resizeMode);
        parcel.writeInt(this.spanX);
        parcel.writeInt(this.spanY);
        parcel.writeInt(this.minSpanX);
        parcel.writeInt(this.minSpanY);
    }
}
