package com.android.launcher3;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import androidx.appcompat.app.ActivityC1486c;
import com.android.launcher3.DeviceProfile;
import com.android.launcher3.logging.UserEventDispatcher;
import com.android.launcher3.userevent.nano.LauncherLogProto;
import com.android.launcher3.util.SystemUiController;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseActivity extends ActivityC1486c implements UserEventDispatcher.UserEventDelegate {
    private static final int ACTIVITY_STATE_RESUMED = 2;
    private static final int ACTIVITY_STATE_STARTED = 1;
    private static final int ACTIVITY_STATE_USER_ACTIVE = 4;
    public static final int INVISIBLE_ALL = 3;
    public static final int INVISIBLE_BY_APP_TRANSITIONS = 2;
    public static final int INVISIBLE_BY_STATE_HANDLER = 1;
    private int mActivityFlags;
    protected DeviceProfile mDeviceProfile;
    private int mForceInvisible;
    protected SystemUiController mSystemUiController;
    protected UserEventDispatcher mUserEventDispatcher;
    private final ArrayList<DeviceProfile.OnDeviceProfileChangeListener> mDPChangeListeners = new ArrayList<>();
    private final ArrayList<MultiWindowModeChangedListener> mMultiWindowModeChangedListeners = new ArrayList<>();

    @Retention(RetentionPolicy.SOURCE)
    public @interface ActivityFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface InvisibilityFlags {
    }

    public interface MultiWindowModeChangedListener {
        void onMultiWindowModeChanged(boolean z10);
    }

    public static BaseActivity fromContext(Context context) {
        return context instanceof BaseActivity ? (BaseActivity) context : (BaseActivity) ((ContextWrapper) context).getBaseContext();
    }

    public void addForceInvisibleFlag(int i10) {
        this.mForceInvisible = i10 | this.mForceInvisible;
    }

    public void addMultiWindowModeChangedListener(MultiWindowModeChangedListener multiWindowModeChangedListener) {
        this.mMultiWindowModeChangedListeners.add(multiWindowModeChangedListener);
    }

    public void addOnDeviceProfileChangeListener(DeviceProfile.OnDeviceProfileChangeListener onDeviceProfileChangeListener) {
        this.mDPChangeListeners.add(onDeviceProfileChangeListener);
    }

    public void clearForceInvisibleFlag(int i10) {
        this.mForceInvisible = (~i10) & this.mForceInvisible;
    }

    public void dispatchDeviceProfileChanged() {
        for (int size = this.mDPChangeListeners.size() - 1; size >= 0; size--) {
            this.mDPChangeListeners.get(size).onDeviceProfileChanged(this.mDeviceProfile);
        }
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
    }

    public void dumpMisc(PrintWriter printWriter) {
        printWriter.println(" deviceProfile isTransposed=" + getDeviceProfile().isVerticalBarLayout());
        printWriter.println(" orientation=" + getResources().getConfiguration().orientation);
        printWriter.println(" mSystemUiController: " + this.mSystemUiController);
        printWriter.println(" mActivityFlags: " + this.mActivityFlags);
        printWriter.println(" mForceInvisible: " + this.mForceInvisible);
    }

    public View.AccessibilityDelegate getAccessibilityDelegate() {
        return null;
    }

    public DeviceProfile getDeviceProfile() {
        return this.mDeviceProfile;
    }

    public SystemUiController getSystemUiController() {
        if (this.mSystemUiController == null) {
            this.mSystemUiController = new SystemUiController(getWindow());
        }
        return this.mSystemUiController;
    }

    public final UserEventDispatcher getUserEventDispatcher() {
        if (this.mUserEventDispatcher == null) {
            this.mUserEventDispatcher = UserEventDispatcher.newInstance(this, this.mDeviceProfile, this);
        }
        return this.mUserEventDispatcher;
    }

    public boolean hasBeenResumed() {
        return (this.mActivityFlags & 2) != 0;
    }

    public boolean isForceInvisible() {
        return this.mForceInvisible != 0;
    }

    public boolean isInMultiWindowModeCompat() {
        return Utilities.ATLEAST_NOUGAT && isInMultiWindowMode();
    }

    public boolean isStarted() {
        return (this.mActivityFlags & 1) != 0;
    }

    public boolean isUserActive() {
        return (this.mActivityFlags & 4) != 0;
    }

    @Override // com.android.launcher3.logging.UserEventDispatcher.UserEventDelegate
    public void modifyUserEvent(LauncherLogProto.LauncherEvent launcherEvent) {
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.k, android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        super.onMultiWindowModeChanged(z10, configuration);
        for (int size = this.mMultiWindowModeChangedListeners.size() - 1; size >= 0; size--) {
            this.mMultiWindowModeChangedListeners.get(size).onMultiWindowModeChanged(z10);
        }
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onPause() {
        this.mActivityFlags &= -3;
        super.onPause();
        getSystemUiController().updateUiState(4, 0);
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onResume() {
        this.mActivityFlags |= 6;
        super.onResume();
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.fragment.app.r, android.app.Activity
    public void onStart() {
        this.mActivityFlags |= 1;
        super.onStart();
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.fragment.app.r, android.app.Activity
    public void onStop() {
        this.mActivityFlags &= -6;
        this.mForceInvisible = 0;
        super.onStop();
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        this.mActivityFlags &= -5;
        super.onUserLeaveHint();
    }

    public void removeMultiWindowModeChangedListener(MultiWindowModeChangedListener multiWindowModeChangedListener) {
        this.mMultiWindowModeChangedListeners.remove(multiWindowModeChangedListener);
    }

    public void removeOnDeviceProfileChangeListener(DeviceProfile.OnDeviceProfileChangeListener onDeviceProfileChangeListener) {
        this.mDPChangeListeners.remove(onDeviceProfileChangeListener);
    }
}
