package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import com.app.hider.master.promax.R;
import com.prism.commons.ui.settings.SettingEntryLayout;
import com.prism.commons.ui.settings.SettingEntryRightIconLayout;
import com.prism.commons.ui.settings.SettingEntrySwitchLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderActivitySettingBinding implements b {

    @NonNull
    public final LinearLayout llFeedbackContainer;

    @NonNull
    public final RadioButton radioNotificationAll;

    @NonNull
    public final RadioButton radioNotificationNone;

    @NonNull
    public final RadioButton radioNotificationNumber;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SettingEntrySwitchLayout settingAllowScreenCapture;

    @NonNull
    public final SettingEntryLayout settingAppDetails;

    @NonNull
    public final SettingEntryLayout settingAppId;

    @NonNull
    public final SettingEntryLayout settingAppState;

    @NonNull
    public final SettingEntryLayout settingAppVersion;

    @NonNull
    public final SettingEntryLayout settingBattery;

    @NonNull
    public final SettingEntryRightIconLayout settingCalcSkin;

    @NonNull
    public final SettingEntryLayout settingContainerAccounts;

    @NonNull
    public final SettingEntryLayout settingDebug;

    @NonNull
    public final SettingEntryRightIconLayout settingEnhanceHider;

    @NonNull
    public final SettingEntryLayout settingFeedback;

    @NonNull
    public final FrameLayout settingFragmentContainer;

    @NonNull
    public final SettingEntryLayout settingGalleryDataRestore;

    @NonNull
    public final SettingEntrySwitchLayout settingGoHomeWhenFlipOver;

    @NonNull
    public final SettingEntrySwitchLayout settingHideFromRecent;

    @NonNull
    public final SettingEntrySwitchLayout settingKeepAlive;

    @NonNull
    public final SettingEntryLayout settingLaunguage;

    @NonNull
    public final SettingEntrySwitchLayout settingObedient;

    @NonNull
    public final SettingEntryLayout settingPrivacyPolicy;

    @NonNull
    public final SettingEntrySwitchLayout settingProtect;

    @NonNull
    public final SettingEntryLayout settingRate;

    @NonNull
    public final SettingEntryLayout settingReinstall;

    @NonNull
    public final SettingEntryLayout settingResetPin;

    @NonNull
    public final SettingEntryLayout settingRunningProcesses;

    @NonNull
    public final ScrollView settingScroll;

    @NonNull
    public final SettingEntryRightIconLayout settingSelectIcon;

    @NonNull
    public final SettingEntrySwitchLayout settingShowTipsWhenLaunchGuest;

    @NonNull
    public final SettingEntrySwitchLayout settingShowTipsWhenUpdateAvailable;

    @NonNull
    public final Toolbar settingToolbar;

    @NonNull
    public final SettingEntrySwitchLayout settingUseFingerprint;

    @NonNull
    public final SettingEntrySwitchLayout settingUseSystemShortcut;

    @NonNull
    public final SettingEntryLayout settingUserAgreement;

    @NonNull
    public final SettingEntryLayout settingVip;

    @NonNull
    public final SettingEntrySwitchLayout settingVpnSupport;

    private HiderActivitySettingBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull SettingEntrySwitchLayout settingEntrySwitchLayout, @NonNull SettingEntryLayout settingEntryLayout, @NonNull SettingEntryLayout settingEntryLayout2, @NonNull SettingEntryLayout settingEntryLayout3, @NonNull SettingEntryLayout settingEntryLayout4, @NonNull SettingEntryLayout settingEntryLayout5, @NonNull SettingEntryRightIconLayout settingEntryRightIconLayout, @NonNull SettingEntryLayout settingEntryLayout6, @NonNull SettingEntryLayout settingEntryLayout7, @NonNull SettingEntryRightIconLayout settingEntryRightIconLayout2, @NonNull SettingEntryLayout settingEntryLayout8, @NonNull FrameLayout frameLayout, @NonNull SettingEntryLayout settingEntryLayout9, @NonNull SettingEntrySwitchLayout settingEntrySwitchLayout2, @NonNull SettingEntrySwitchLayout settingEntrySwitchLayout3, @NonNull SettingEntrySwitchLayout settingEntrySwitchLayout4, @NonNull SettingEntryLayout settingEntryLayout10, @NonNull SettingEntrySwitchLayout settingEntrySwitchLayout5, @NonNull SettingEntryLayout settingEntryLayout11, @NonNull SettingEntrySwitchLayout settingEntrySwitchLayout6, @NonNull SettingEntryLayout settingEntryLayout12, @NonNull SettingEntryLayout settingEntryLayout13, @NonNull SettingEntryLayout settingEntryLayout14, @NonNull SettingEntryLayout settingEntryLayout15, @NonNull ScrollView scrollView, @NonNull SettingEntryRightIconLayout settingEntryRightIconLayout3, @NonNull SettingEntrySwitchLayout settingEntrySwitchLayout7, @NonNull SettingEntrySwitchLayout settingEntrySwitchLayout8, @NonNull Toolbar toolbar, @NonNull SettingEntrySwitchLayout settingEntrySwitchLayout9, @NonNull SettingEntrySwitchLayout settingEntrySwitchLayout10, @NonNull SettingEntryLayout settingEntryLayout16, @NonNull SettingEntryLayout settingEntryLayout17, @NonNull SettingEntrySwitchLayout settingEntrySwitchLayout11) {
        this.rootView = linearLayout;
        this.llFeedbackContainer = linearLayout2;
        this.radioNotificationAll = radioButton;
        this.radioNotificationNone = radioButton2;
        this.radioNotificationNumber = radioButton3;
        this.settingAllowScreenCapture = settingEntrySwitchLayout;
        this.settingAppDetails = settingEntryLayout;
        this.settingAppId = settingEntryLayout2;
        this.settingAppState = settingEntryLayout3;
        this.settingAppVersion = settingEntryLayout4;
        this.settingBattery = settingEntryLayout5;
        this.settingCalcSkin = settingEntryRightIconLayout;
        this.settingContainerAccounts = settingEntryLayout6;
        this.settingDebug = settingEntryLayout7;
        this.settingEnhanceHider = settingEntryRightIconLayout2;
        this.settingFeedback = settingEntryLayout8;
        this.settingFragmentContainer = frameLayout;
        this.settingGalleryDataRestore = settingEntryLayout9;
        this.settingGoHomeWhenFlipOver = settingEntrySwitchLayout2;
        this.settingHideFromRecent = settingEntrySwitchLayout3;
        this.settingKeepAlive = settingEntrySwitchLayout4;
        this.settingLaunguage = settingEntryLayout10;
        this.settingObedient = settingEntrySwitchLayout5;
        this.settingPrivacyPolicy = settingEntryLayout11;
        this.settingProtect = settingEntrySwitchLayout6;
        this.settingRate = settingEntryLayout12;
        this.settingReinstall = settingEntryLayout13;
        this.settingResetPin = settingEntryLayout14;
        this.settingRunningProcesses = settingEntryLayout15;
        this.settingScroll = scrollView;
        this.settingSelectIcon = settingEntryRightIconLayout3;
        this.settingShowTipsWhenLaunchGuest = settingEntrySwitchLayout7;
        this.settingShowTipsWhenUpdateAvailable = settingEntrySwitchLayout8;
        this.settingToolbar = toolbar;
        this.settingUseFingerprint = settingEntrySwitchLayout9;
        this.settingUseSystemShortcut = settingEntrySwitchLayout10;
        this.settingUserAgreement = settingEntryLayout16;
        this.settingVip = settingEntryLayout17;
        this.settingVpnSupport = settingEntrySwitchLayout11;
    }

    @NonNull
    public static HiderActivitySettingBinding bind(@NonNull View view) {
        int i10 = R.id.ll_feedback_container;
        LinearLayout linearLayout = (LinearLayout) c.a(view, R.id.ll_feedback_container);
        if (linearLayout != null) {
            i10 = R.id.radio_notification_all;
            RadioButton radioButton = (RadioButton) c.a(view, R.id.radio_notification_all);
            if (radioButton != null) {
                i10 = R.id.radio_notification_none;
                RadioButton radioButton2 = (RadioButton) c.a(view, R.id.radio_notification_none);
                if (radioButton2 != null) {
                    i10 = R.id.radio_notification_number;
                    RadioButton radioButton3 = (RadioButton) c.a(view, R.id.radio_notification_number);
                    if (radioButton3 != null) {
                        i10 = R.id.setting_allow_screen_capture;
                        SettingEntrySwitchLayout settingEntrySwitchLayout = (SettingEntrySwitchLayout) c.a(view, R.id.setting_allow_screen_capture);
                        if (settingEntrySwitchLayout != null) {
                            i10 = R.id.setting_app_details;
                            SettingEntryLayout settingEntryLayout = (SettingEntryLayout) c.a(view, R.id.setting_app_details);
                            if (settingEntryLayout != null) {
                                i10 = R.id.setting_app_id;
                                SettingEntryLayout settingEntryLayout2 = (SettingEntryLayout) c.a(view, R.id.setting_app_id);
                                if (settingEntryLayout2 != null) {
                                    i10 = R.id.setting_app_state;
                                    SettingEntryLayout settingEntryLayout3 = (SettingEntryLayout) c.a(view, R.id.setting_app_state);
                                    if (settingEntryLayout3 != null) {
                                        i10 = R.id.setting_app_version;
                                        SettingEntryLayout settingEntryLayout4 = (SettingEntryLayout) c.a(view, R.id.setting_app_version);
                                        if (settingEntryLayout4 != null) {
                                            i10 = R.id.setting_battery;
                                            SettingEntryLayout settingEntryLayout5 = (SettingEntryLayout) c.a(view, R.id.setting_battery);
                                            if (settingEntryLayout5 != null) {
                                                i10 = R.id.setting_calc_skin;
                                                SettingEntryRightIconLayout settingEntryRightIconLayout = (SettingEntryRightIconLayout) c.a(view, R.id.setting_calc_skin);
                                                if (settingEntryRightIconLayout != null) {
                                                    i10 = R.id.setting_container_accounts;
                                                    SettingEntryLayout settingEntryLayout6 = (SettingEntryLayout) c.a(view, R.id.setting_container_accounts);
                                                    if (settingEntryLayout6 != null) {
                                                        i10 = R.id.setting_debug;
                                                        SettingEntryLayout settingEntryLayout7 = (SettingEntryLayout) c.a(view, R.id.setting_debug);
                                                        if (settingEntryLayout7 != null) {
                                                            i10 = R.id.setting_enhance_hider;
                                                            SettingEntryRightIconLayout settingEntryRightIconLayout2 = (SettingEntryRightIconLayout) c.a(view, R.id.setting_enhance_hider);
                                                            if (settingEntryRightIconLayout2 != null) {
                                                                i10 = R.id.setting_feedback;
                                                                SettingEntryLayout settingEntryLayout8 = (SettingEntryLayout) c.a(view, R.id.setting_feedback);
                                                                if (settingEntryLayout8 != null) {
                                                                    i10 = R.id.setting_fragment_container;
                                                                    FrameLayout frameLayout = (FrameLayout) c.a(view, R.id.setting_fragment_container);
                                                                    if (frameLayout != null) {
                                                                        i10 = R.id.setting_gallery_data_restore;
                                                                        SettingEntryLayout settingEntryLayout9 = (SettingEntryLayout) c.a(view, R.id.setting_gallery_data_restore);
                                                                        if (settingEntryLayout9 != null) {
                                                                            i10 = R.id.setting_go_home_when_flip_over;
                                                                            SettingEntrySwitchLayout settingEntrySwitchLayout2 = (SettingEntrySwitchLayout) c.a(view, R.id.setting_go_home_when_flip_over);
                                                                            if (settingEntrySwitchLayout2 != null) {
                                                                                i10 = R.id.setting_hide_from_recent;
                                                                                SettingEntrySwitchLayout settingEntrySwitchLayout3 = (SettingEntrySwitchLayout) c.a(view, R.id.setting_hide_from_recent);
                                                                                if (settingEntrySwitchLayout3 != null) {
                                                                                    i10 = R.id.setting_keep_alive;
                                                                                    SettingEntrySwitchLayout settingEntrySwitchLayout4 = (SettingEntrySwitchLayout) c.a(view, R.id.setting_keep_alive);
                                                                                    if (settingEntrySwitchLayout4 != null) {
                                                                                        i10 = R.id.setting_launguage;
                                                                                        SettingEntryLayout settingEntryLayout10 = (SettingEntryLayout) c.a(view, R.id.setting_launguage);
                                                                                        if (settingEntryLayout10 != null) {
                                                                                            i10 = R.id.setting_obedient;
                                                                                            SettingEntrySwitchLayout settingEntrySwitchLayout5 = (SettingEntrySwitchLayout) c.a(view, R.id.setting_obedient);
                                                                                            if (settingEntrySwitchLayout5 != null) {
                                                                                                i10 = R.id.setting_privacy_policy;
                                                                                                SettingEntryLayout settingEntryLayout11 = (SettingEntryLayout) c.a(view, R.id.setting_privacy_policy);
                                                                                                if (settingEntryLayout11 != null) {
                                                                                                    i10 = R.id.setting_protect;
                                                                                                    SettingEntrySwitchLayout settingEntrySwitchLayout6 = (SettingEntrySwitchLayout) c.a(view, R.id.setting_protect);
                                                                                                    if (settingEntrySwitchLayout6 != null) {
                                                                                                        i10 = R.id.setting_rate;
                                                                                                        SettingEntryLayout settingEntryLayout12 = (SettingEntryLayout) c.a(view, R.id.setting_rate);
                                                                                                        if (settingEntryLayout12 != null) {
                                                                                                            i10 = R.id.setting_reinstall;
                                                                                                            SettingEntryLayout settingEntryLayout13 = (SettingEntryLayout) c.a(view, R.id.setting_reinstall);
                                                                                                            if (settingEntryLayout13 != null) {
                                                                                                                i10 = R.id.setting_reset_pin;
                                                                                                                SettingEntryLayout settingEntryLayout14 = (SettingEntryLayout) c.a(view, R.id.setting_reset_pin);
                                                                                                                if (settingEntryLayout14 != null) {
                                                                                                                    i10 = R.id.setting_running_processes;
                                                                                                                    SettingEntryLayout settingEntryLayout15 = (SettingEntryLayout) c.a(view, R.id.setting_running_processes);
                                                                                                                    if (settingEntryLayout15 != null) {
                                                                                                                        i10 = R.id.setting_scroll;
                                                                                                                        ScrollView scrollView = (ScrollView) c.a(view, R.id.setting_scroll);
                                                                                                                        if (scrollView != null) {
                                                                                                                            i10 = R.id.setting_select_icon;
                                                                                                                            SettingEntryRightIconLayout settingEntryRightIconLayout3 = (SettingEntryRightIconLayout) c.a(view, R.id.setting_select_icon);
                                                                                                                            if (settingEntryRightIconLayout3 != null) {
                                                                                                                                i10 = R.id.setting_show_tips_when_launch_guest;
                                                                                                                                SettingEntrySwitchLayout settingEntrySwitchLayout7 = (SettingEntrySwitchLayout) c.a(view, R.id.setting_show_tips_when_launch_guest);
                                                                                                                                if (settingEntrySwitchLayout7 != null) {
                                                                                                                                    i10 = R.id.setting_show_tips_when_update_available;
                                                                                                                                    SettingEntrySwitchLayout settingEntrySwitchLayout8 = (SettingEntrySwitchLayout) c.a(view, R.id.setting_show_tips_when_update_available);
                                                                                                                                    if (settingEntrySwitchLayout8 != null) {
                                                                                                                                        i10 = R.id.setting_toolbar;
                                                                                                                                        Toolbar toolbar = (Toolbar) c.a(view, R.id.setting_toolbar);
                                                                                                                                        if (toolbar != null) {
                                                                                                                                            i10 = R.id.setting_use_fingerprint;
                                                                                                                                            SettingEntrySwitchLayout settingEntrySwitchLayout9 = (SettingEntrySwitchLayout) c.a(view, R.id.setting_use_fingerprint);
                                                                                                                                            if (settingEntrySwitchLayout9 != null) {
                                                                                                                                                i10 = R.id.setting_use_system_shortcut;
                                                                                                                                                SettingEntrySwitchLayout settingEntrySwitchLayout10 = (SettingEntrySwitchLayout) c.a(view, R.id.setting_use_system_shortcut);
                                                                                                                                                if (settingEntrySwitchLayout10 != null) {
                                                                                                                                                    i10 = R.id.setting_user_agreement;
                                                                                                                                                    SettingEntryLayout settingEntryLayout16 = (SettingEntryLayout) c.a(view, R.id.setting_user_agreement);
                                                                                                                                                    if (settingEntryLayout16 != null) {
                                                                                                                                                        i10 = R.id.setting_vip;
                                                                                                                                                        SettingEntryLayout settingEntryLayout17 = (SettingEntryLayout) c.a(view, R.id.setting_vip);
                                                                                                                                                        if (settingEntryLayout17 != null) {
                                                                                                                                                            i10 = R.id.setting_vpn_support;
                                                                                                                                                            SettingEntrySwitchLayout settingEntrySwitchLayout11 = (SettingEntrySwitchLayout) c.a(view, R.id.setting_vpn_support);
                                                                                                                                                            if (settingEntrySwitchLayout11 != null) {
                                                                                                                                                                return new HiderActivitySettingBinding((LinearLayout) view, linearLayout, radioButton, radioButton2, radioButton3, settingEntrySwitchLayout, settingEntryLayout, settingEntryLayout2, settingEntryLayout3, settingEntryLayout4, settingEntryLayout5, settingEntryRightIconLayout, settingEntryLayout6, settingEntryLayout7, settingEntryRightIconLayout2, settingEntryLayout8, frameLayout, settingEntryLayout9, settingEntrySwitchLayout2, settingEntrySwitchLayout3, settingEntrySwitchLayout4, settingEntryLayout10, settingEntrySwitchLayout5, settingEntryLayout11, settingEntrySwitchLayout6, settingEntryLayout12, settingEntryLayout13, settingEntryLayout14, settingEntryLayout15, scrollView, settingEntryRightIconLayout3, settingEntrySwitchLayout7, settingEntrySwitchLayout8, toolbar, settingEntrySwitchLayout9, settingEntrySwitchLayout10, settingEntryLayout16, settingEntryLayout17, settingEntrySwitchLayout11);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static HiderActivitySettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderActivitySettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_activity_setting, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
