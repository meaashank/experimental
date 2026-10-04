package com.android.launcher3.states;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.android.launcher3.Utilities;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public class RotationHelper implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final String ALLOW_ROTATION_PREFERENCE_KEY = "pref_allowRotation";
    public static final int REQUEST_LOCK = 2;
    public static final int REQUEST_NONE = 0;
    public static final int REQUEST_ROTATE = 1;
    private final Activity mActivity;
    private boolean mAutoRotateEnabled;
    public boolean mDestroyed;
    private boolean mIgnoreAutoRotateSettings;
    private boolean mInitialized;
    private final SharedPreferences mPrefs;
    private int mStateHandlerRequest = 0;
    private int mCurrentStateRequest = 0;
    private int mLastActivityFlags = -1;

    public RotationHelper(Activity activity) {
        this.mActivity = activity;
        this.mPrefs = Utilities.getPrefs(activity);
        updateAutoRotateSetting();
    }

    public static boolean getAllowRotationDefaultValue() {
        if (Utilities.ATLEAST_NOUGAT) {
            Resources system = Resources.getSystem();
            if ((system.getConfiguration().smallestScreenWidthDp * system.getDisplayMetrics().densityDpi) / DisplayMetrics.DENSITY_DEVICE_STABLE >= 600) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void notifyChange() {
        /*
            r4 = this;
            boolean r0 = r4.mInitialized
            if (r0 == 0) goto L32
            boolean r0 = r4.mDestroyed
            if (r0 == 0) goto L9
            goto L32
        L9:
            int r0 = r4.mStateHandlerRequest
            r1 = -1
            r2 = 14
            r3 = 2
            if (r0 == 0) goto L14
            if (r0 != r3) goto L27
            goto L18
        L14:
            int r0 = r4.mCurrentStateRequest
            if (r0 != r3) goto L1a
        L18:
            r1 = r2
            goto L27
        L1a:
            boolean r2 = r4.mIgnoreAutoRotateSettings
            if (r2 != 0) goto L27
            r2 = 1
            if (r0 == r2) goto L27
            boolean r0 = r4.mAutoRotateEnabled
            if (r0 == 0) goto L26
            goto L27
        L26:
            r1 = 5
        L27:
            int r0 = r4.mLastActivityFlags
            if (r1 == r0) goto L32
            r4.mLastActivityFlags = r1
            android.app.Activity r0 = r4.mActivity
            r0.setRequestedOrientation(r1)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.states.RotationHelper.notifyChange():void");
    }

    public void destroy() {
        if (this.mDestroyed) {
            return;
        }
        this.mDestroyed = true;
        SharedPreferences sharedPreferences = this.mPrefs;
        if (sharedPreferences != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this);
        }
    }

    public void initialize() {
        if (this.mInitialized) {
            return;
        }
        this.mInitialized = true;
        notifyChange();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.mAutoRotateEnabled = this.mPrefs.getBoolean(ALLOW_ROTATION_PREFERENCE_KEY, getAllowRotationDefaultValue());
        notifyChange();
    }

    public void setCurrentStateRequest(int i10) {
        if (this.mCurrentStateRequest != i10) {
            this.mCurrentStateRequest = i10;
            notifyChange();
        }
    }

    public void setStateHandlerRequest(int i10) {
        if (this.mStateHandlerRequest != i10) {
            this.mStateHandlerRequest = i10;
            notifyChange();
        }
    }

    public String toString() {
        return String.format("[mStateHandlerRequest=%d, mCurrentStateRequest=%d, mLastActivityFlags=%d, mIgnoreAutoRotateSettings=%b, mAutoRotateEnabled=%b]", Integer.valueOf(this.mStateHandlerRequest), Integer.valueOf(this.mCurrentStateRequest), Integer.valueOf(this.mLastActivityFlags), Boolean.valueOf(this.mIgnoreAutoRotateSettings), Boolean.valueOf(this.mAutoRotateEnabled));
    }

    public void updateAutoRotateSetting() {
        boolean z10 = this.mActivity.getResources().getBoolean(R.bool.allow_rotation);
        this.mIgnoreAutoRotateSettings = z10;
        if (z10) {
            this.mPrefs.unregisterOnSharedPreferenceChangeListener(this);
        } else {
            this.mPrefs.registerOnSharedPreferenceChangeListener(this);
            this.mAutoRotateEnabled = this.mPrefs.getBoolean(ALLOW_ROTATION_PREFERENCE_KEY, getAllowRotationDefaultValue());
        }
        notifyChange();
    }
}
