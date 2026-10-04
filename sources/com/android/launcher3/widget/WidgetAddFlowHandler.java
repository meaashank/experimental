package com.android.launcher3.widget;

import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherAppWidgetInfo;
import com.android.launcher3.LauncherAppWidgetProviderInfo;
import com.android.launcher3.util.PendingRequestArgs;

/* JADX INFO: loaded from: classes2.dex */
public class WidgetAddFlowHandler implements Parcelable {
    public static final Parcelable.Creator<WidgetAddFlowHandler> CREATOR = new AnonymousClass1();
    private final AppWidgetProviderInfo mProviderInfo;

    /* JADX INFO: renamed from: com.android.launcher3.widget.WidgetAddFlowHandler$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<WidgetAddFlowHandler> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WidgetAddFlowHandler createFromParcel(Parcel parcel) {
            return new WidgetAddFlowHandler(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WidgetAddFlowHandler[] newArray(int i10) {
            return new WidgetAddFlowHandler[i10];
        }
    }

    public WidgetAddFlowHandler(AppWidgetProviderInfo appWidgetProviderInfo) {
        this.mProviderInfo = appWidgetProviderInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LauncherAppWidgetProviderInfo getProviderInfo(Context context) {
        return LauncherAppWidgetProviderInfo.fromProviderInfo(context, this.mProviderInfo);
    }

    public boolean needsConfigure() {
        return this.mProviderInfo.configure != null;
    }

    public void startBindFlow(Launcher launcher, int i10, ItemInfo itemInfo, int i11) {
        launcher.setWaitingForResult(PendingRequestArgs.forWidgetInfo(i10, this, itemInfo));
        launcher.getAppWidgetHost().startBindFlow(launcher, i10, this.mProviderInfo, i11);
    }

    public boolean startConfigActivity(Launcher launcher, LauncherAppWidgetInfo launcherAppWidgetInfo, int i10) {
        return startConfigActivity(launcher, launcherAppWidgetInfo.appWidgetId, launcherAppWidgetInfo, i10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        this.mProviderInfo.writeToParcel(parcel, i10);
    }

    public boolean startConfigActivity(Launcher launcher, int i10, ItemInfo itemInfo, int i11) {
        if (!needsConfigure()) {
            return false;
        }
        launcher.setWaitingForResult(PendingRequestArgs.forWidgetInfo(i10, this, itemInfo));
        launcher.getAppWidgetHost().startConfigActivity(launcher, i10, i11);
        return true;
    }

    public WidgetAddFlowHandler(Parcel parcel) {
        this.mProviderInfo = (AppWidgetProviderInfo) AppWidgetProviderInfo.CREATOR.createFromParcel(parcel);
    }
}
