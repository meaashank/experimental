package com.android.launcher3.util;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public interface SettingsObserver {

    public static abstract class Secure extends ContentObserver implements SettingsObserver {
        private String mKeySetting;
        private ContentResolver mResolver;

        public Secure(ContentResolver contentResolver) {
            super(new Handler());
            this.mResolver = contentResolver;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            super.onChange(z10);
            onSettingChanged(Settings.Secure.getInt(this.mResolver, this.mKeySetting, 1) == 1);
        }

        @Override // com.android.launcher3.util.SettingsObserver
        public void register(String str, String... strArr) {
            this.mKeySetting = str;
            this.mResolver.registerContentObserver(Settings.Secure.getUriFor(str), false, this);
            for (String str2 : strArr) {
                this.mResolver.registerContentObserver(Settings.Secure.getUriFor(str2), false, this);
            }
            onChange(true);
        }

        @Override // com.android.launcher3.util.SettingsObserver
        public void unregister() {
            this.mResolver.unregisterContentObserver(this);
        }
    }

    public static abstract class System extends ContentObserver implements SettingsObserver {
        private String mKeySetting;
        private ContentResolver mResolver;

        public System(ContentResolver contentResolver) {
            super(new Handler());
            this.mResolver = contentResolver;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            super.onChange(z10);
            onSettingChanged(Settings.System.getInt(this.mResolver, this.mKeySetting, 1) == 1);
        }

        @Override // com.android.launcher3.util.SettingsObserver
        public void register(String str, String... strArr) {
            this.mKeySetting = str;
            this.mResolver.registerContentObserver(Settings.System.getUriFor(str), false, this);
            for (String str2 : strArr) {
                this.mResolver.registerContentObserver(Settings.System.getUriFor(str2), false, this);
            }
            onChange(true);
        }

        @Override // com.android.launcher3.util.SettingsObserver
        public void unregister() {
            this.mResolver.unregisterContentObserver(this);
        }
    }

    void onSettingChanged(boolean z10);

    void register(String str, String... strArr);

    void unregister();
}
