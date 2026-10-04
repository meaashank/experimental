package com.android.launcher3.logging;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.support.v4.media.b;
import android.support.v4.media.f;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.android.launcher3.DeviceProfile;
import com.android.launcher3.DragSource;
import com.android.launcher3.DropTarget;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Utilities;
import com.android.launcher3.userevent.nano.LauncherLogProto;
import com.android.launcher3.util.ComponentKey;
import com.android.launcher3.util.InstantAppResolver;
import com.app.hider.master.promax.R;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class UserEventDispatcher {
    private static final boolean IS_VERBOSE = Utilities.isPropertyEnabled("UserEvent");
    private static final int MAXIMUM_VIEW_HIERARCHY_LEVEL = 5;
    private static final String TAG = "UserEvent";
    private static final String UUID_STORAGE = "uuid";
    private long mActionDurationMillis;
    private boolean mAppOrTaskLaunch;
    private UserEventDelegate mDelegate;
    private long mElapsedContainerMillis;
    private long mElapsedSessionMillis;
    protected InstantAppResolver mInstantAppResolver;
    private boolean mIsInLandscapeMode;
    private boolean mIsInMultiWindowMode;
    private boolean mSessionStarted;
    private String mUuidStr;

    public interface LogContainerProvider {
        void fillInLogContainerData(View view, ItemInfo itemInfo, LauncherLogProto.Target target, LauncherLogProto.Target target2);
    }

    public interface UserEventDelegate {
        void modifyUserEvent(LauncherLogProto.LauncherEvent launcherEvent);
    }

    private void fillComponentInfo(LauncherLogProto.Target target, ComponentName componentName) {
        if (componentName != null) {
            target.packageNameHash = (this.mUuidStr + componentName.getPackageName()).hashCode();
            target.componentHash = (this.mUuidStr + componentName.flattenToString()).hashCode();
        }
    }

    public static LogContainerProvider getLaunchProviderRecursive(@Nullable View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            int i10 = 5;
            while (parent != null) {
                int i11 = i10 - 1;
                if (i10 <= 0) {
                    break;
                }
                if (parent instanceof LogContainerProvider) {
                    return (LogContainerProvider) parent;
                }
                parent = parent.getParent();
                i10 = i11;
            }
        }
        return null;
    }

    private static String getTargetsStr(LauncherLogProto.Target[] targetArr) {
        String string = "child:" + LoggerUtils.getTargetStr(targetArr[0]);
        for (int i10 = 1; i10 < targetArr.length; i10++) {
            StringBuilder sbA = f.a(string, "\tparent:");
            sbA.append(LoggerUtils.getTargetStr(targetArr[i10]));
            string = sbA.toString();
        }
        return string;
    }

    public static UserEventDispatcher newInstance(Context context, DeviceProfile deviceProfile, UserEventDelegate userEventDelegate) {
        SharedPreferences devicePrefs = Utilities.getDevicePrefs(context);
        String string = devicePrefs.getString(UUID_STORAGE, null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            devicePrefs.edit().putString(UUID_STORAGE, string).apply();
        }
        UserEventDispatcher userEventDispatcher = (UserEventDispatcher) Utilities.getOverrideObject(UserEventDispatcher.class, context.getApplicationContext(), R.string.user_event_dispatcher_class);
        userEventDispatcher.mDelegate = userEventDelegate;
        userEventDispatcher.mIsInLandscapeMode = deviceProfile.isVerticalBarLayout();
        userEventDispatcher.mIsInMultiWindowMode = deviceProfile.isMultiWindowMode;
        userEventDispatcher.mUuidStr = string;
        userEventDispatcher.mInstantAppResolver = (InstantAppResolver) Utilities.getOverrideObject(InstantAppResolver.class, context, R.string.instant_app_resolver_class);
        return userEventDispatcher;
    }

    public void dispatchUserEvent(LauncherLogProto.LauncherEvent launcherEvent, Intent intent) {
        this.mAppOrTaskLaunch = false;
        launcherEvent.isInLandscapeMode = this.mIsInLandscapeMode;
        launcherEvent.isInMultiWindowMode = this.mIsInMultiWindowMode;
        launcherEvent.elapsedContainerMillis = SystemClock.uptimeMillis() - this.mElapsedContainerMillis;
        launcherEvent.elapsedSessionMillis = SystemClock.uptimeMillis() - this.mElapsedSessionMillis;
        if (IS_VERBOSE) {
            String string = "\n-----------------------------------------------------\naction:" + LoggerUtils.getActionStr(launcherEvent.action);
            LauncherLogProto.Target[] targetArr = launcherEvent.srcTarget;
            if (targetArr != null && targetArr.length > 0) {
                StringBuilder sbA = f.a(string, "\n Source ");
                sbA.append(getTargetsStr(launcherEvent.srcTarget));
                string = sbA.toString();
            }
            LauncherLogProto.Target[] targetArr2 = launcherEvent.destTarget;
            if (targetArr2 != null && targetArr2.length > 0) {
                StringBuilder sbA2 = f.a(string, "\n Destination ");
                sbA2.append(getTargetsStr(launcherEvent.destTarget));
                string = sbA2.toString();
            }
            StringBuilder sbA3 = androidx.compose.runtime.changelist.a.a(string);
            sbA3.append(String.format(Locale.US, "\n Elapsed container %d ms, session %d ms, action %d ms", Long.valueOf(launcherEvent.elapsedContainerMillis), Long.valueOf(launcherEvent.elapsedSessionMillis), Long.valueOf(launcherEvent.actionDurationMillis)));
            StringBuilder sbA4 = f.a(sbA3.toString(), "\n isInLandscapeMode ");
            sbA4.append(launcherEvent.isInLandscapeMode);
            StringBuilder sbA5 = f.a(sbA4.toString(), "\n isInMultiWindowMode ");
            sbA5.append(launcherEvent.isInMultiWindowMode);
            Log.d("UserEvent", sbA5.toString() + "\n\n");
        }
    }

    public boolean fillInLogContainerData(LauncherLogProto.LauncherEvent launcherEvent, @Nullable View view) {
        LogContainerProvider launchProviderRecursive = getLaunchProviderRecursive(view);
        if (view == null || !(view.getTag() instanceof ItemInfo) || launchProviderRecursive == null) {
            return false;
        }
        ItemInfo itemInfo = (ItemInfo) view.getTag();
        LauncherLogProto.Target[] targetArr = launcherEvent.srcTarget;
        launchProviderRecursive.fillInLogContainerData(view, itemInfo, targetArr[0], targetArr[1]);
        return true;
    }

    public void fillIntentInfo(LauncherLogProto.Target target, Intent intent) {
        target.intentHash = intent.hashCode();
        fillComponentInfo(target, intent.getComponent());
    }

    public void logActionBounceTip(int i10) {
        LauncherLogProto.LauncherEvent launcherEventNewLauncherEvent = LoggerUtils.newLauncherEvent(LoggerUtils.newAction(3), LoggerUtils.newContainerTarget(i10));
        launcherEventNewLauncherEvent.srcTarget[0].tipType = 1;
        dispatchUserEvent(launcherEventNewLauncherEvent, null);
    }

    public void logActionCommand(int i10, LauncherLogProto.Target target) {
        logActionCommand(i10, target, (LauncherLogProto.Target) null);
    }

    public void logActionOnContainer(int i10, int i11, int i12) {
        logActionOnContainer(i10, i11, i12, 0);
    }

    public void logActionOnControl(int i10, int i11) {
        logActionOnControl(i10, i11, (View) null, -1);
    }

    public void logActionOnItem(int i10, int i11, int i12) {
        LauncherLogProto.Target targetNewTarget = LoggerUtils.newTarget(1);
        targetNewTarget.itemType = i12;
        LauncherLogProto.LauncherEvent launcherEventNewLauncherEvent = LoggerUtils.newLauncherEvent(LoggerUtils.newTouchAction(i10), targetNewTarget);
        launcherEventNewLauncherEvent.action.dir = i11;
        dispatchUserEvent(launcherEventNewLauncherEvent, null);
    }

    public void logActionTapOutside(LauncherLogProto.Target target) {
        LauncherLogProto.LauncherEvent launcherEventNewLauncherEvent = LoggerUtils.newLauncherEvent(LoggerUtils.newTouchAction(0), target);
        launcherEventNewLauncherEvent.action.isOutside = true;
        dispatchUserEvent(launcherEventNewLauncherEvent, null);
    }

    public void logActionTip(int i10, int i11) {
    }

    public void logAppLaunch(View view, Intent intent) {
        LauncherLogProto.LauncherEvent launcherEventNewLauncherEvent = LoggerUtils.newLauncherEvent(LoggerUtils.newTouchAction(0), LoggerUtils.newItemTarget(view, this.mInstantAppResolver), LoggerUtils.newTarget(3));
        if (fillInLogContainerData(launcherEventNewLauncherEvent, view)) {
            UserEventDelegate userEventDelegate = this.mDelegate;
            if (userEventDelegate != null) {
                userEventDelegate.modifyUserEvent(launcherEventNewLauncherEvent);
            }
            fillIntentInfo(launcherEventNewLauncherEvent.srcTarget[0], intent);
        }
        dispatchUserEvent(launcherEventNewLauncherEvent, intent);
        this.mAppOrTaskLaunch = true;
    }

    public void logDeepShortcutsOpen(View view) {
        LogContainerProvider launchProviderRecursive = getLaunchProviderRecursive(view);
        if (view == null || !(view.getTag() instanceof ItemInfo)) {
            return;
        }
        ItemInfo itemInfo = (ItemInfo) view.getTag();
        LauncherLogProto.LauncherEvent launcherEventNewLauncherEvent = LoggerUtils.newLauncherEvent(LoggerUtils.newTouchAction(1), LoggerUtils.newItemTarget(itemInfo, this.mInstantAppResolver), LoggerUtils.newTarget(3));
        LauncherLogProto.Target[] targetArr = launcherEventNewLauncherEvent.srcTarget;
        launchProviderRecursive.fillInLogContainerData(view, itemInfo, targetArr[0], targetArr[1]);
        dispatchUserEvent(launcherEventNewLauncherEvent, null);
        resetElapsedContainerMillis("deep shortcut open");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void logDragNDrop(DropTarget.DragObject dragObject, View view) {
        LauncherLogProto.LauncherEvent launcherEventNewLauncherEvent = LoggerUtils.newLauncherEvent(LoggerUtils.newTouchAction(2), LoggerUtils.newItemTarget(dragObject.originalDragInfo, this.mInstantAppResolver), LoggerUtils.newTarget(3));
        launcherEventNewLauncherEvent.destTarget = new LauncherLogProto.Target[]{LoggerUtils.newItemTarget(dragObject.originalDragInfo, this.mInstantAppResolver), LoggerUtils.newDropTarget(view)};
        DragSource dragSource = dragObject.dragSource;
        ItemInfo itemInfo = dragObject.originalDragInfo;
        LauncherLogProto.Target[] targetArr = launcherEventNewLauncherEvent.srcTarget;
        dragSource.fillInLogContainerData(null, itemInfo, targetArr[0], targetArr[1]);
        if (view instanceof LogContainerProvider) {
            ItemInfo itemInfo2 = dragObject.dragInfo;
            LauncherLogProto.Target[] targetArr2 = launcherEventNewLauncherEvent.destTarget;
            ((LogContainerProvider) view).fillInLogContainerData(null, itemInfo2, targetArr2[0], targetArr2[1]);
        }
        launcherEventNewLauncherEvent.actionDurationMillis = SystemClock.uptimeMillis() - this.mActionDurationMillis;
        dispatchUserEvent(launcherEventNewLauncherEvent, null);
    }

    public void logNotificationLaunch(View view, PendingIntent pendingIntent) {
        LauncherLogProto.LauncherEvent launcherEventNewLauncherEvent = LoggerUtils.newLauncherEvent(LoggerUtils.newTouchAction(0), LoggerUtils.newItemTarget(view, this.mInstantAppResolver), LoggerUtils.newTarget(3));
        if (fillInLogContainerData(launcherEventNewLauncherEvent, view)) {
            launcherEventNewLauncherEvent.srcTarget[0].packageNameHash = (this.mUuidStr + pendingIntent.getCreatorPackage()).hashCode();
        }
        dispatchUserEvent(launcherEventNewLauncherEvent, null);
    }

    public void logOverviewReorder() {
        dispatchUserEvent(LoggerUtils.newLauncherEvent(LoggerUtils.newTouchAction(2), LoggerUtils.newContainerTarget(1), LoggerUtils.newContainerTarget(6)), null);
    }

    public void logStateChangeAction(int i10, int i11, int i12, int i13, int i14, int i15) {
        LauncherLogProto.LauncherEvent launcherEventNewLauncherEvent = i12 == 9 ? LoggerUtils.newLauncherEvent(LoggerUtils.newTouchAction(i10), LoggerUtils.newItemTarget(i12), LoggerUtils.newContainerTarget(i13)) : LoggerUtils.newLauncherEvent(LoggerUtils.newTouchAction(i10), LoggerUtils.newContainerTarget(i12), LoggerUtils.newContainerTarget(i13));
        launcherEventNewLauncherEvent.destTarget = new LauncherLogProto.Target[]{LoggerUtils.newContainerTarget(i14)};
        LauncherLogProto.Action action = launcherEventNewLauncherEvent.action;
        action.dir = i11;
        action.isStateChange = true;
        launcherEventNewLauncherEvent.srcTarget[0].pageIndex = i15;
        dispatchUserEvent(launcherEventNewLauncherEvent, null);
        resetElapsedContainerMillis("state changed");
    }

    public void logTaskLaunchOrDismiss(int i10, int i11, int i12, ComponentKey componentKey) {
        LauncherLogProto.LauncherEvent launcherEventNewLauncherEvent = LoggerUtils.newLauncherEvent(LoggerUtils.newTouchAction(i10), LoggerUtils.newTarget(1));
        if (i10 == 3 || i10 == 4) {
            launcherEventNewLauncherEvent.action.dir = i11;
        }
        LauncherLogProto.Target target = launcherEventNewLauncherEvent.srcTarget[0];
        target.itemType = 9;
        target.pageIndex = i12;
        fillComponentInfo(target, componentKey.componentName);
        dispatchUserEvent(launcherEventNewLauncherEvent, null);
        this.mAppOrTaskLaunch = true;
    }

    public final void resetActionDurationMillis() {
        this.mActionDurationMillis = SystemClock.uptimeMillis();
    }

    public final void resetElapsedContainerMillis(String str) {
        this.mElapsedContainerMillis = SystemClock.uptimeMillis();
        if (IS_VERBOSE) {
            b.a("resetElapsedContainerMillis reason=", str, "UserEvent");
        }
    }

    public final void startSession() {
        this.mSessionStarted = true;
        this.mElapsedSessionMillis = SystemClock.uptimeMillis();
        this.mElapsedContainerMillis = SystemClock.uptimeMillis();
    }

    public void logActionCommand(int i10, int i11, int i12) {
        logActionCommand(i10, LoggerUtils.newContainerTarget(i11), i12 >= 0 ? LoggerUtils.newContainerTarget(i12) : null);
    }

    public void logActionOnContainer(int i10, int i11, int i12, int i13) {
        LauncherLogProto.LauncherEvent launcherEventNewLauncherEvent = LoggerUtils.newLauncherEvent(LoggerUtils.newTouchAction(i10), LoggerUtils.newContainerTarget(i12));
        launcherEventNewLauncherEvent.action.dir = i11;
        launcherEventNewLauncherEvent.srcTarget[0].pageIndex = i13;
        dispatchUserEvent(launcherEventNewLauncherEvent, null);
    }

    public void logActionOnControl(int i10, int i11, int i12) {
        logActionOnControl(i10, i11, (View) null, i12);
    }

    public void logActionOnControl(int i10, int i11, @Nullable View view) {
        logActionOnControl(i10, i11, view, -1);
    }

    public void logActionOnControl(int i10, int i11, int i12, int i13) {
        dispatchUserEvent(LoggerUtils.newLauncherEvent(LoggerUtils.newTouchAction(i10), LoggerUtils.newControlTarget(i11), LoggerUtils.newContainerTarget(i12), LoggerUtils.newContainerTarget(i13)), null);
    }

    public void logActionCommand(int i10, LauncherLogProto.Target target, LauncherLogProto.Target target2) {
        LauncherLogProto.LauncherEvent launcherEventNewLauncherEvent = LoggerUtils.newLauncherEvent(LoggerUtils.newCommandAction(i10), target);
        if (i10 == 5 && (this.mAppOrTaskLaunch || !this.mSessionStarted)) {
            this.mSessionStarted = false;
            return;
        }
        if (target2 != null) {
            launcherEventNewLauncherEvent.destTarget = new LauncherLogProto.Target[]{target2};
            launcherEventNewLauncherEvent.action.isStateChange = true;
        }
        dispatchUserEvent(launcherEventNewLauncherEvent, null);
    }

    public void logActionOnControl(int i10, int i11, @Nullable View view, int i12) {
        LauncherLogProto.LauncherEvent launcherEventNewLauncherEvent;
        if (view == null && i12 < 0) {
            launcherEventNewLauncherEvent = LoggerUtils.newLauncherEvent(LoggerUtils.newTouchAction(i10), LoggerUtils.newTarget(2));
        } else {
            launcherEventNewLauncherEvent = LoggerUtils.newLauncherEvent(LoggerUtils.newTouchAction(i10), LoggerUtils.newTarget(2), LoggerUtils.newTarget(3));
        }
        launcherEventNewLauncherEvent.srcTarget[0].controlType = i11;
        if (view != null) {
            fillInLogContainerData(launcherEventNewLauncherEvent, view);
        }
        if (i12 >= 0) {
            launcherEventNewLauncherEvent.srcTarget[1].containerType = i12;
        }
        if (i10 == 2) {
            launcherEventNewLauncherEvent.actionDurationMillis = SystemClock.uptimeMillis() - this.mActionDurationMillis;
        }
        dispatchUserEvent(launcherEventNewLauncherEvent, null);
    }

    public void logActionCommand(int i10, View view, int i11) {
        LauncherLogProto.LauncherEvent launcherEventNewLauncherEvent = LoggerUtils.newLauncherEvent(LoggerUtils.newCommandAction(i10), LoggerUtils.newItemTarget(view, this.mInstantAppResolver), LoggerUtils.newTarget(3));
        if (fillInLogContainerData(launcherEventNewLauncherEvent, view)) {
            LauncherLogProto.Target target = launcherEventNewLauncherEvent.srcTarget[0];
            target.type = 3;
            target.containerType = i11;
        }
        dispatchUserEvent(launcherEventNewLauncherEvent, null);
    }

    public static UserEventDispatcher newInstance(Context context, DeviceProfile deviceProfile) {
        return newInstance(context, deviceProfile, null);
    }
}
