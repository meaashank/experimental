package com.android.launcher3.graphics;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Process;
import android.os.SystemClock;
import android.preference.ListPreference;
import android.preference.Preference;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.LauncherFiles;
import com.android.launcher3.LauncherModel;
import com.android.launcher3.Utilities;
import com.android.launcher3.util.LooperExecutor;
import com.app.hider.master.promax.R;
import com.prism.commons.utils.C3836a;
import java.lang.reflect.Field;
import s0.x;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(26)
public class IconShapeOverride {
    public static final String KEY_PREFERENCE = "pref_override_icon_shape";
    private static final long PROCESS_KILL_DELAY_MS = 1000;
    private static final int RESTART_REQUEST_CODE = 42;
    private static final String TAG = "IconShapeOverride";

    public static class OverrideApplyHandler implements Runnable {
        private final Context mContext;
        private final String mValue;

        @Override // java.lang.Runnable
        public void run() {
            Utilities.getDevicePrefs(this.mContext).edit().putString(IconShapeOverride.KEY_PREFERENCE, this.mValue).commit();
            LauncherAppState.getInstance(this.mContext).getIconCache().clear();
            try {
                Thread.sleep(1000L);
            } catch (Exception e10) {
                Log.e(IconShapeOverride.TAG, "Error waiting", e10);
            }
            ((AlarmManager) this.mContext.getSystemService(AlarmManager.class)).set(3, SystemClock.elapsedRealtime() + 50, PendingIntent.getActivity(this.mContext, 42, new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME").setPackage(this.mContext.getPackageName()).addFlags(268435456), C3836a.b.a(1409286144)));
            Process.killProcess(Process.myPid());
        }

        private OverrideApplyHandler(Context context, String str) {
            this.mContext = context;
            this.mValue = str;
        }
    }

    public static class PreferenceChangeHandler implements Preference.OnPreferenceChangeListener {
        private final Context mContext;

        @Override // android.preference.Preference.OnPreferenceChangeListener
        public boolean onPreferenceChange(Preference preference, Object obj) {
            String str = (String) obj;
            if (!IconShapeOverride.getAppliedValue(this.mContext).equals(str)) {
                Context context = this.mContext;
                ProgressDialog.show(context, null, context.getString(R.string.icon_shape_override_progress), true, false);
                new LooperExecutor(LauncherModel.getWorkerLooper()).execute(new OverrideApplyHandler(this.mContext, str));
            }
            return false;
        }

        private PreferenceChangeHandler(Context context) {
            this.mContext = context;
        }
    }

    public static class ResourcesOverride extends Resources {
        private final int mOverrideId;
        private final String mOverrideValue;

        public ResourcesOverride(Resources resources, int i10, String str) {
            super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
            this.mOverrideId = i10;
            this.mOverrideValue = str;
        }

        @Override // android.content.res.Resources
        @NonNull
        public String getString(int i10) throws Resources.NotFoundException {
            return i10 == this.mOverrideId ? this.mOverrideValue : super.getString(i10);
        }
    }

    public static void apply(Context context) {
        if (Utilities.ATLEAST_OREO) {
            String appliedValue = getAppliedValue(context);
            if (!TextUtils.isEmpty(appliedValue) && isSupported(context)) {
                try {
                    getSystemResField().set(null, new ResourcesOverride(Resources.getSystem(), getConfigResId(), appliedValue));
                } catch (Exception e10) {
                    Log.e(TAG, "Unable to override icon shape", e10);
                    context.getSharedPreferences(LauncherFiles.DEVICE_PREFERENCES_KEY, 0).edit().remove(KEY_PREFERENCE).apply();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getAppliedValue(Context context) {
        return Utilities.getDevicePrefs(context).getString(KEY_PREFERENCE, "");
    }

    private static int getConfigResId() {
        return Resources.getSystem().getIdentifier("config_icon_mask", x.b.f238264e, "android");
    }

    private static Field getSystemResField() throws Exception {
        Field declaredField = Resources.class.getDeclaredField("mSystem");
        declaredField.setAccessible(true);
        return declaredField;
    }

    public static void handlePreferenceUi(ListPreference listPreference) {
        Context context = listPreference.getContext();
        listPreference.setValue(getAppliedValue(context));
        listPreference.setOnPreferenceChangeListener(new PreferenceChangeHandler(context));
    }

    public static boolean isSupported(Context context) {
        if (Utilities.ATLEAST_OREO && Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 1) {
            return getSystemResField().get(null) == Resources.getSystem() && getConfigResId() != 0;
        }
        return false;
    }
}
