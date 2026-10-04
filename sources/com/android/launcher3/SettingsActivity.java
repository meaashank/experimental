package com.android.launcher3;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.provider.Settings;
import android.text.TextUtils;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.launcher3.graphics.IconShapeOverride;
import com.android.launcher3.notification.NotificationListener;
import com.android.launcher3.states.RotationHelper;
import com.android.launcher3.util.ListViewHighlighter;
import com.android.launcher3.util.SettingsObserver;
import com.android.launcher3.views.ButtonPreference;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class SettingsActivity extends Activity {
    private static final int DELAY_HIGHLIGHT_DURATION_MILLIS = 600;
    private static final String EXTRA_FRAGMENT_ARG_KEY = ":settings:fragment_args_key";
    private static final String EXTRA_SHOW_FRAGMENT_ARGS = ":settings:show_fragment_args";
    private static final String ICON_BADGING_PREFERENCE_KEY = "pref_icon_badging";
    public static final String NOTIFICATION_BADGING = "notification_badging";
    private static final String NOTIFICATION_ENABLED_LISTENERS = "enabled_notification_listeners";
    private static final String SAVE_HIGHLIGHTED_KEY = "android:preference_highlighted";

    public static class IconBadgingObserver extends SettingsObserver.Secure implements Preference.OnPreferenceClickListener {
        private final ButtonPreference mBadgingPref;
        private final FragmentManager mFragmentManager;
        private final ContentResolver mResolver;

        public IconBadgingObserver(ButtonPreference buttonPreference, ContentResolver contentResolver, FragmentManager fragmentManager) {
            super(contentResolver);
            this.mBadgingPref = buttonPreference;
            this.mResolver = contentResolver;
            this.mFragmentManager = fragmentManager;
        }

        @Override // android.preference.Preference.OnPreferenceClickListener
        public boolean onPreferenceClick(Preference preference) {
            new NotificationAccessConfirmation().show(this.mFragmentManager, "notification_access");
            return true;
        }

        @Override // com.android.launcher3.util.SettingsObserver
        public void onSettingChanged(boolean z10) {
            int i10 = z10 ? com.app.hider.master.promax.R.string.icon_badging_desc_on : com.app.hider.master.promax.R.string.icon_badging_desc_off;
            boolean z11 = true;
            if (z10) {
                String string = Settings.Secure.getString(this.mResolver, "enabled_notification_listeners");
                ComponentName componentName = new ComponentName(this.mBadgingPref.getContext(), (Class<?>) NotificationListener.class);
                if (string == null || (!string.contains(componentName.flattenToString()) && !string.contains(componentName.flattenToShortString()))) {
                    z11 = false;
                }
                if (!z11) {
                    i10 = com.app.hider.master.promax.R.string.title_missing_notification_access;
                }
            }
            this.mBadgingPref.setWidgetFrameVisible(!z11);
            this.mBadgingPref.setOnPreferenceClickListener(z11 ? null : this);
            this.mBadgingPref.setSummary(i10);
        }
    }

    public static class LauncherSettingsFragment extends PreferenceFragment {
        private IconBadgingObserver mIconBadgingObserver;
        private boolean mPreferenceHighlighted = false;
        private String mPreferenceKey;

        /* JADX INFO: Access modifiers changed from: private */
        public void highlightPreference() {
            Preference preferenceFindPreference = findPreference(this.mPreferenceKey);
            if (preferenceFindPreference == null || getPreferenceScreen() == null) {
                return;
            }
            PreferenceScreen preferenceScreen = getPreferenceScreen();
            if (Utilities.ATLEAST_OREO) {
                preferenceScreen = selectPreferenceRecursive(preferenceFindPreference, preferenceScreen);
            }
            if (preferenceScreen == null) {
                return;
            }
            ListView listView = (ListView) (preferenceScreen.getDialog() != null ? preferenceScreen.getDialog().getWindow().getDecorView() : getView()).findViewById(android.R.id.list);
            if (listView == null || listView.getAdapter() == null) {
                return;
            }
            ListAdapter adapter = listView.getAdapter();
            int count = adapter.getCount() - 1;
            while (true) {
                if (count < 0) {
                    count = -1;
                    break;
                } else if (preferenceFindPreference == adapter.getItem(count)) {
                    break;
                } else {
                    count--;
                }
            }
            new ListViewHighlighter(listView, count);
            this.mPreferenceHighlighted = true;
        }

        @TargetApi(26)
        private PreferenceScreen selectPreferenceRecursive(Preference preference, PreferenceScreen preferenceScreen) {
            if (!(preference.getParent() instanceof PreferenceScreen)) {
                return null;
            }
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preference.getParent();
            if (Objects.equals(preferenceScreen2.getKey(), preferenceScreen.getKey())) {
                return preferenceScreen2;
            }
            if (selectPreferenceRecursive(preferenceScreen2, preferenceScreen) == null) {
                return null;
            }
            ((PreferenceScreen) preferenceScreen2.getParent()).onItemClick(null, null, preferenceScreen2.getOrder(), 0L);
            return preferenceScreen2;
        }

        @Override // android.preference.PreferenceFragment, android.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            if (bundle != null) {
                this.mPreferenceHighlighted = bundle.getBoolean(SettingsActivity.SAVE_HIGHLIGHTED_KEY);
            }
            getPreferenceManager().setSharedPreferencesName(LauncherFiles.SHARED_PREFERENCES_KEY);
            addPreferencesFromResource(com.app.hider.master.promax.R.xml.launcher_preferences);
            ContentResolver contentResolver = getActivity().getContentResolver();
            ButtonPreference buttonPreference = (ButtonPreference) findPreference(SettingsActivity.ICON_BADGING_PREFERENCE_KEY);
            if (!Utilities.ATLEAST_OREO) {
                getPreferenceScreen().removePreference(findPreference(SessionCommitReceiver.ADD_ICON_PREFERENCE_KEY));
                getPreferenceScreen().removePreference(buttonPreference);
            } else if (getResources().getBoolean(com.app.hider.master.promax.R.bool.notification_badging_enabled)) {
                IconBadgingObserver iconBadgingObserver = new IconBadgingObserver(buttonPreference, contentResolver, getFragmentManager());
                this.mIconBadgingObserver = iconBadgingObserver;
                iconBadgingObserver.register(SettingsActivity.NOTIFICATION_BADGING, "enabled_notification_listeners");
            } else {
                getPreferenceScreen().removePreference(buttonPreference);
            }
            Preference preferenceFindPreference = findPreference(IconShapeOverride.KEY_PREFERENCE);
            if (preferenceFindPreference != null) {
                if (IconShapeOverride.isSupported(getActivity())) {
                    IconShapeOverride.handlePreferenceUi((ListPreference) preferenceFindPreference);
                } else {
                    getPreferenceScreen().removePreference(preferenceFindPreference);
                }
            }
            Preference preferenceFindPreference2 = findPreference(RotationHelper.ALLOW_ROTATION_PREFERENCE_KEY);
            if (getResources().getBoolean(com.app.hider.master.promax.R.bool.allow_rotation)) {
                getPreferenceScreen().removePreference(preferenceFindPreference2);
            } else {
                preferenceFindPreference2.setDefaultValue(Boolean.valueOf(RotationHelper.getAllowRotationDefaultValue()));
            }
        }

        @Override // android.preference.PreferenceFragment, android.app.Fragment
        public void onDestroy() {
            IconBadgingObserver iconBadgingObserver = this.mIconBadgingObserver;
            if (iconBadgingObserver != null) {
                iconBadgingObserver.unregister();
                this.mIconBadgingObserver = null;
            }
            super.onDestroy();
        }

        @Override // android.app.Fragment
        public void onResume() {
            super.onResume();
            this.mPreferenceKey = getActivity().getIntent().getStringExtra(SettingsActivity.EXTRA_FRAGMENT_ARG_KEY);
            if (!isAdded() || this.mPreferenceHighlighted || TextUtils.isEmpty(this.mPreferenceKey)) {
                return;
            }
            getView().postDelayed(new Runnable() { // from class: com.android.launcher3.I
                @Override // java.lang.Runnable
                public final void run() {
                    this.f136872a.highlightPreference();
                }
            }, 600L);
        }

        @Override // android.preference.PreferenceFragment, android.app.Fragment
        public void onSaveInstanceState(Bundle bundle) {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean(SettingsActivity.SAVE_HIGHLIGHTED_KEY, this.mPreferenceHighlighted);
        }
    }

    public static class NotificationAccessConfirmation extends DialogFragment implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            ComponentName componentName = new ComponentName(getActivity(), (Class<?>) NotificationListener.class);
            Bundle bundle = new Bundle();
            bundle.putString(SettingsActivity.EXTRA_FRAGMENT_ARG_KEY, componentName.flattenToString());
            getActivity().startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS").addFlags(268435456).putExtra(SettingsActivity.EXTRA_FRAGMENT_ARG_KEY, componentName.flattenToString()).putExtra(SettingsActivity.EXTRA_SHOW_FRAGMENT_ARGS, bundle));
        }

        @Override // android.app.DialogFragment
        public Dialog onCreateDialog(Bundle bundle) {
            Activity activity = getActivity();
            return new AlertDialog.Builder(activity).setTitle(com.app.hider.master.promax.R.string.title_missing_notification_access).setMessage(activity.getString(com.app.hider.master.promax.R.string.msg_missing_notification_access, activity.getString(com.app.hider.master.promax.R.string.derived_app_name))).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(com.app.hider.master.promax.R.string.title_change_settings, this).create();
        }
    }

    public PreferenceFragment getNewFragment() {
        return new LauncherSettingsFragment();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            getFragmentManager().beginTransaction().replace(android.R.id.content, getNewFragment()).commit();
        }
    }
}
