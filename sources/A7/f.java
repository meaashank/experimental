package a7;

import U6.b;
import com.apm.insight.l.p;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.download.j;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f84779a = U6.b.a(f.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet<String> f84780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet<String> f84781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet<String> f84782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set<String> f84783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set<String> f84784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set<String> f84785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set<String> f84786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Set<String> f84787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set<String> f84788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f84789k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f84790l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f84791m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Set<String> f84792n;

    static {
        HashSet<String> hashSet = new HashSet<>(5);
        f84780b = hashSet;
        HashSet<String> hashSet2 = new HashSet<>(6);
        f84781c = hashSet2;
        HashSet<String> hashSet3 = new HashSet<>(9);
        f84782d = hashSet3;
        HashSet hashSet4 = new HashSet();
        f84783e = hashSet4;
        HashSet hashSet5 = new HashSet();
        f84784f = hashSet5;
        HashSet hashSet6 = new HashSet();
        f84785g = hashSet6;
        HashSet hashSet7 = new HashSet();
        f84786h = hashSet7;
        HashSet hashSet8 = new HashSet();
        f84787i = hashSet8;
        HashSet hashSet9 = new HashSet();
        f84788j = hashSet9;
        String[] strArr = {j.b.f164738e, j.b.f164744h, j.b.f164734c, j.b.f164736d, "android.permission.ACCOUNT_MANAGER", "android.permission.GET_ACCOUNTS", U6.b.f68586w, "com.android.permission.GET_INSTALLED_APPS"};
        f84789k = strArr;
        String[] strArr2 = new String[0];
        f84790l = strArr2;
        String[] strArr3 = {"android.permission.INTERACT_ACROSS_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL", "android.permission.UPDATE_APP_OPS_STATS", "android.permission.UPDATE_DEVICE_STATS", "android.permission.LOCATION_HARDWARE", "android.permission.BROADCAST_PACKAGE_REMOVED", "android.permission.WRITE_SECURE_SETTINGS"};
        f84791m = strArr3;
        HashSet hashSet10 = new HashSet();
        f84792n = hashSet10;
        d.a(hashSet9, com.prism.gaia.helper.compat.a.f164969j, com.prism.gaia.helper.compat.a.f164968i, hashSet8, "android.app.action.ACTION_PASSWORD_CHANGED");
        p.a(hashSet8, "android.app.action.ACTION_PASSWORD_EXPIRING", "android.app.action.ACTION_PASSWORD_FAILED", "android.app.action.ACTION_PASSWORD_SUCCEEDED", "android.app.action.ACTION_SHOW_NEW_USER_DISCLAIMER");
        hashSet8.add("android.app.action.AFFILIATED_PROFILE_TRANSFER_OWNERSHIP_COMPLETE");
        hashSet7.add("android.app.action.APP_BLOCK_STATE_CHANGED");
        hashSet8.add("android.app.action.APPLICATION_DELEGATION_SCOPES_CHANGED");
        e.a(hashSet7, "android.app.action.AUTOMATIC_ZEN_RULE_STATUS_CHANGED", hashSet8, "android.app.action.BUGREPORT_FAILED", "android.app.action.BUGREPORT_SHARE");
        p.a(hashSet8, "android.app.action.BUGREPORT_SHARING_DECLINED", "android.app.action.CLOSE_NOTIFICATION_HANDLER_PANEL", "android.app.action.COMPLIANCE_ACKNOWLEDGEMENT_REQUIRED", "android.app.action.DATA_SHARING_RESTRICTION_APPLIED");
        p.a(hashSet8, "android.app.action.DATA_SHARING_RESTRICTION_CHANGED", "android.app.action.DEVICE_ADMIN_DISABLED", "android.app.action.DEVICE_ADMIN_DISABLE_REQUESTED", "android.app.action.DEVICE_ADMIN_ENABLED");
        hashSet8.add("android.app.action.DEVICE_OWNER_CHANGED");
        hashSet8.add("android.app.action.DEVICE_POLICY_CONSTANTS_CHANGED");
        hashSet8.add("android.app.action.DEVICE_POLICY_RESOURCE_UPDATED");
        d.a(hashSet7, "android.app.action.INTERRUPTION_FILTER_CHANGED", "android.app.action.INTERRUPTION_FILTER_CHANGED_INTERNAL", hashSet8, "android.app.action.LOCK_TASK_ENTERING");
        hashSet8.add("android.app.action.LOCK_TASK_EXITING");
        e.a(hashSet9, "android.app.action.MANAGED_USER_CREATED", hashSet7, "android.app.action.NETWORK_LOGS_AVAILABLE", "android.app.action.NEXT_ALARM_CLOCK_CHANGED");
        p.a(hashSet7, "android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED", "android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED", "android.app.action.NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED", "android.app.action.NOTIFICATION_POLICY_CHANGED");
        hashSet7.add("android.app.action.NOTIFY_PENDING_SYSTEM_UPDATE");
        hashSet7.add("android.app.action.OPERATION_SAFETY_STATE_CHANGED");
        hashSet7.add("android.app.action.PROFILE_OWNER_CHANGED");
        e.a(hashSet8, "android.app.action.PROFILE_PROVISIONING_COMPLETE", hashSet7, "android.app.action.SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED", "android.app.action.SECURITY_LOGS_AVAILABLE");
        e.a(hashSet9, "android.app.action.SHOW_NEW_USER_DISCLAIMER", hashSet7, "android.app.action.SYSTEM_UPDATE_POLICY_CHANGED", "android.app.action.TRANSFER_OWNERSHIP_COMPLETE");
        p.a(hashSet9, "android.app.action.USER_ADDED", "android.app.action.USER_REMOVED", "android.app.action.USER_STARTED", "android.app.action.USER_STOPPED");
        p.a(hashSet9, "android.app.action.USER_SWITCHED", "android.appwidget.action.APPWIDGET_DELETED", "android.appwidget.action.APPWIDGET_DISABLED", "android.appwidget.action.APPWIDGET_ENABLED");
        p.a(hashSet9, "android.appwidget.action.APPWIDGET_HOST_RESTORED", "android.appwidget.action.APPWIDGET_RESTORED", "android.appwidget.action.APPWIDGET_UPDATE", "android.appwidget.action.APPWIDGET_UPDATE_OPTIONS");
        p.a(hashSet7, "android.bluetooth.a2dp.action.SINK_STATE_CHANGED", "android.bluetooth.a2dp.profile.action.ACTIVE_DEVICE_CHANGED", "android.bluetooth.a2dp.profile.action.AVRCP_CONNECTION_STATE_CHANGED", "android.bluetooth.a2dp.profile.action.CODEC_CONFIG_CHANGED");
        p.a(hashSet7, "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED", "android.bluetooth.a2dp-sink.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.action.CSIS_CONNECTION_STATE_CHANGED");
        p.a(hashSet7, "android.bluetooth.action.LE_AUDIO_ACTIVE_DEVICE_CHANGED", "android.bluetooth.action.LE_AUDIO_CONNECTION_STATE_CHANGED", "android.bluetooth.action.TETHERING_STATE_CHANGED", "android.bluetooth.adapter.action.BLE_ACL_CONNECTED");
        p.a(hashSet7, "android.bluetooth.adapter.action.BLE_ACL_DISCONNECTED", "android.bluetooth.adapter.action.BLE_STATE_CHANGED", "android.bluetooth.adapter.action.BLUETOOTH_ADDRESS_CHANGED", "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
        p.a(hashSet7, "android.bluetooth.adapter.action.DISCOVERY_FINISHED", "android.bluetooth.adapter.action.DISCOVERY_STARTED", "android.bluetooth.adapter.action.LOCAL_NAME_CHANGE", "android.bluetooth.adapter.action.SCAN_MODE_CHANGED");
        p.a(hashSet7, "android.bluetooth.adapter.action.STATE_CHANGED", "android.bluetooth.avrcp-controller.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.avrcp-controller.profile.action.PLAYER_SETTING", "android.bluetooth.device.action.ACL_CONNECTED");
        p.a(hashSet7, "android.bluetooth.device.action.ACL_DISCONNECTED", "android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED", "android.bluetooth.device.action.ALIAS_CHANGED", "android.bluetooth.device.action.BATTERY_LEVEL_CHANGED");
        p.a(hashSet7, "android.bluetooth.device.action.BOND_STATE_CHANGED", "android.bluetooth.device.action.CLASS_CHANGED", "android.bluetooth.device.action.CONNECTION_ACCESS_CANCEL", "android.bluetooth.device.action.CONNECTION_ACCESS_REPLY");
        p.a(hashSet7, "android.bluetooth.device.action.CONNECTION_ACCESS_REQUEST", "android.bluetooth.device.action.FOUND", "android.bluetooth.device.action.MAS_INSTANCE", "android.bluetooth.device.action.NAME_CHANGED");
        p.a(hashSet7, "android.bluetooth.device.action.NAME_FAILED", "android.bluetooth.device.action.PAIRING_CANCEL", "android.bluetooth.device.action.PAIRING_REQUEST", "android.bluetooth.device.action.SDP_RECORD");
        p.a(hashSet7, "android.bluetooth.device.action.SILENCE_MODE_CHANGED", "android.bluetooth.device.action.UUID", "android.bluetooth.devicepicker.action.DEVICE_SELECTED", "android.bluetooth.devicepicker.action.LAUNCH");
        p.a(hashSet7, "android.bluetooth.headset.action.HF_INDICATORS_VALUE_CHANGED", "android.bluetooth.headset.action.AUDIO_STATE_CHANGED", "android.bluetooth.headset.action.STATE_CHANGED", "android.bluetooth.headset.action.VENDOR_SPECIFIC_HEADSET_EVENT");
        p.a(hashSet7, "android.bluetooth.headsetclient.profile.action.AG_CALL_CHANGED", "android.bluetooth.headsetclient.profile.action.AG_EVENT", "android.bluetooth.headsetclient.profile.action.AUDIO_STATE_CHANGED", "android.bluetooth.headsetclient.profile.action.CONNECTION_STATE_CHANGED");
        p.a(hashSet7, "android.bluetooth.headsetclient.profile.action.LAST_VTAG", "android.bluetooth.headsetclient.profile.action.RESULT", "android.bluetooth.headsetclient.profile.action.VENDOR_SPECIFIC_EVENT", "android.bluetooth.headset.profile.action.ACTIVE_DEVICE_CHANGED");
        p.a(hashSet7, "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED", "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.hearingaid.profile.action.ACTIVE_DEVICE_CHANGED", "android.bluetooth.hearingaid.profile.action.CONNECTION_STATE_CHANGED");
        p.a(hashSet7, "android.bluetooth.hearingaid.profile.action.PLAYING_STATE_CHANGED", "android.bluetooth.hiddevice.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.inputhost.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.input.profile.action.CONNECTION_STATE_CHANGED");
        p.a(hashSet7, "android.bluetooth.input.profile.action.HANDSHAKE", "android.bluetooth.input.profile.action.IDLE_TIME_CHANGED", "android.bluetooth.input.profile.action.PROTOCOL_MODE_CHANGED", "android.bluetooth.input.profile.action.REPORT");
        p.a(hashSet7, "android.bluetooth.input.profile.action.VIRTUAL_UNPLUG_STATUS", "android.bluetooth.mapmce.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.mapmce.profile.action.MESSAGE_DELETED_STATUS_CHANGED", "android.bluetooth.mapmce.profile.action.MESSAGE_DELIVERED_SUCCESSFULLY");
        p.a(hashSet7, "android.bluetooth.mapmce.profile.action.MESSAGE_READ_STATUS_CHANGED", "android.bluetooth.mapmce.profile.action.MESSAGE_RECEIVED", "android.bluetooth.mapmce.profile.action.MESSAGE_SENT_SUCCESSFULLY", "android.bluetooth.map.profile.action.CONNECTION_STATE_CHANGED");
        p.a(hashSet7, "android.bluetooth.pan.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.pbapclient.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.pbap.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.sap.profile.action.CONNECTION_STATE_CHANGED");
        d.a(hashSet9, "android.content.pm.action.SESSION_COMMITTED", "android.content.pm.action.SESSION_UPDATED", hashSet7, "android.hardware.action.NEW_PICTURE");
        hashSet7.add("android.hardware.action.NEW_VIDEO");
        hashSet8.add("android.hardware.hdmi.action.OSD_MESSAGE");
        e.a(hashSet9, "android.hardware.input.action.QUERY_KEYBOARD_LAYOUTS", hashSet7, "android.hardware.usb.action.USB_ACCESSORY_ATTACHED", "android.hardware.usb.action.USB_ACCESSORY_DETACHED");
        p.a(hashSet7, "android.hardware.usb.action.USB_ACCESSORY_HANDSHAKE", "android.hardware.usb.action.USB_DEVICE_ATTACHED", "android.hardware.usb.action.USB_DEVICE_DETACHED", "android.intent.action.ACTION_IDLE_MAINTENANCE_END");
        p.a(hashSet7, "android.intent.action.ACTION_IDLE_MAINTENANCE_START", "android.intent.action.ACTION_POWER_CONNECTED", "android.intent.action.ACTION_POWER_DISCONNECTED", "android.intent.action.ACTION_PREFERRED_ACTIVITY_CHANGED");
        p.a(hashSet7, "android.intent.action.ACTION_SHUTDOWN", "android.intent.action.ANY_DATA_STATE", "android.intent.action.AIRPLANE_MODE", "android.intent.action.ALARM_CHANGED");
        e.a(hashSet9, "android.intent.action.APPLICATION_LOCALE_CHANGED", hashSet7, "android.intent.action.APPLICATION_RESTRICTIONS_CHANGED", "android.intent.action.BATTERY_CHANGED");
        d.a(hashSet7, "android.intent.action.BATTERY_LOW", "android.intent.action.BATTERY_OKAY", hashSet9, "android.intent.action.BOOT_COMPLETED");
        d.a(hashSet7, "android.intent.action.CALL_DISCONNECT_CAUSE", "android.intent.action.CAMERA_BUTTON", hashSet8, "android.intent.action.CANCEL_ENABLE_ROLLBACK");
        e.a(hashSet8, "android.intent.action.CLEAR_DNS_CACHE", hashSet7, "android.intent.action.CLOSE_SYSTEM_DIALOGS", "android.intent.action.CONFIGURATION_CHANGED");
        e.a(hashSet9, "android.intent.action.CONTENT_CHANGED", hashSet7, "android.intent.action.DATA_SMS_RECEIVED", "android.intent.action.DATA_STALL_DETECTED");
        p.a(hashSet7, "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_FULL", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_NOT_FULL");
        p.a(hashSet7, "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DISTRACTING_PACKAGES_CHANGED", "android.intent.action.DOCK_EVENT", "android.intent.action.DOMAINS_NEED_VERIFICATION");
        d.a(hashSet9, "android.intent.action.DOWNLOAD_COMPLETE", j.b.f164758o, hashSet7, "android.intent.action.DREAMING_STARTED");
        d.a(hashSet7, "android.intent.action.DREAMING_STOPPED", "android.intent.action.DROPBOX_ENTRY_ADDED", hashSet8, "android.intent.action.DYNAMIC_SENSOR_CHANGED");
        d.a(hashSet8, "android.intent.action.EMERGENCY_CALLBACK_MODE_CHANGED", "android.intent.action.EMERGENCY_CALL_STATE_CHANGED", hashSet7, "android.intent.action.EVENT_REMINDER");
        d.a(hashSet9, "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE", "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE", hashSet7, "android.intent.action.FACTORY_RESET");
        p.a(hashSet7, "android.intent.action.FETCH_VOICEMAIL", "android.intent.action.GTALK_CONNECTED", "android.intent.action.GTALK_DISCONNECTED", "android.intent.action.HEADSET_PLUG");
        d.a(hashSet7, "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.INTENT_FILTER_NEEDS_VERIFICATION", hashSet9, "android.intent.action.LOCALE_CHANGED");
        d.a(hashSet9, "android.intent.action.LOCKED_BOOT_COMPLETED", "android.intent.action.MANAGE_PACKAGE_STORAGE", hashSet7, "android.intent.action.MASTER_CLEAR_NOTIFICATION");
        p.a(hashSet7, "android.intent.action.MEDIA_BAD_REMOVAL", "android.intent.action.MEDIA_BUTTON", "android.intent.action.MEDIA_CHECKING", "android.intent.action.MEDIA_EJECT");
        p.a(hashSet7, "android.intent.action.MEDIA_MOUNTED", "android.intent.action.MEDIA_NOFS", "android.intent.action.MEDIA_REMOVED", "android.intent.action.MEDIA_SCANNER_FINISHED");
        p.a(hashSet7, "android.intent.action.MEDIA_SCANNER_SCAN_FILE", "android.intent.action.MEDIA_SCANNER_STARTED", "android.intent.action.MEDIA_SHARED", "android.intent.action.MEDIA_UNMOUNTABLE");
        e.a(hashSet7, "android.intent.action.MEDIA_UNMOUNTED", hashSet9, "android.intent.action.MY_PACKAGE_REPLACED", "android.intent.action.MY_PACKAGE_SUSPENDED");
        hashSet9.add("android.intent.action.MY_PACKAGE_UNSUSPENDED");
        hashSet8.add("android.intent.action.NEW_OUTGOING_CALL");
        e.a(hashSet7, "android.intent.action.NEW_VOICEMAIL", hashSet9, "android.intent.action.PACKAGE_ADDED", "android.intent.action.PACKAGE_CHANGED");
        hashSet9.add("android.intent.action.PACKAGE_DATA_CLEARED");
        hashSet8.add("android.intent.action.PACKAGE_ENABLE_ROLLBACK");
        hashSet9.add("android.intent.action.PACKAGE_FIRST_LAUNCH");
        d.a(hashSet9, "android.intent.action.PACKAGE_FULLY_REMOVED", "android.intent.action.PACKAGE_INSTALL", hashSet8, "android.intent.action.PACKAGE_NEEDS_INTEGRITY_VERIFICATION");
        p.a(hashSet9, "android.intent.action.PACKAGE_NEEDS_VERIFICATION", "android.intent.action.PACKAGE_REMOVED", "android.intent.action.PACKAGE_REMOVED_INTERNAL", "android.intent.action.PACKAGE_REPLACED");
        hashSet9.add("android.intent.action.PACKAGE_RESTARTED");
        hashSet8.add("android.intent.action.PACKAGE_UNSUSPENDED_MANUALLY");
        hashSet9.add("android.intent.action.PACKAGE_VERIFIED");
        hashSet9.add("android.intent.action.PACKAGES_SUSPENDED");
        hashSet9.add("android.intent.action.PACKAGES_SUSPENSION_CHANGED");
        hashSet9.add("android.intent.action.PACKAGES_UNSUSPENDED");
        e.a(hashSet7, "android.intent.action.PHONE_STATE", hashSet8, "android.intent.action.PRECISE_CALL_STATE", "android.intent.action.PRECISE_DATA_CONNECTION_STATE_CHANGED");
        hashSet9.add("android.intent.action.PROVIDER_CHANGED");
        e.a(hashSet7, "android.intent.action.PROXY_CHANGE", hashSet8, "android.intent.action.QUERY_PACKAGE_RESTART", "android.intent.action.REBOOT");
        e.a(hashSet8, "android.intent.action.ROLLBACK_COMMITTED", hashSet7, "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON");
        hashSet8.add("android.intent.action.SERVICE_STATE");
        hashSet7.add("android.intent.action.SIM_STATE_CHANGED");
        hashSet9.add("android.intent.action.SPLIT_CONFIGURATION_CHANGED");
        e.a(hashSet8, "android.intent.action.SUB_DEFAULT_CHANGED", hashSet7, "android.intent.action.TIME_SET", "android.intent.action.TIME_TICK");
        hashSet7.add("android.intent.action.TIMEZONE_CHANGED");
        hashSet9.add("android.intent.action.UID_REMOVED");
        hashSet7.add("android.intent.action.UMS_CONNECTED");
        e.a(hashSet7, "android.intent.action.UMS_DISCONNECTED", hashSet9, b.a.f68590a, b.a.f68592c);
        hashSet9.add("android.intent.action.USER_INITIALIZE");
        hashSet7.add("android.intent.action.USER_PRESENT");
        hashSet9.add(b.a.f68591b);
        hashSet9.add(b.a.f68594e);
        hashSet9.add(b.a.f68595f);
        hashSet9.add("android.intent.action.USER_UNLOCKED");
        p.a(hashSet7, "android.intent.action.WALLPAPER_CHANGED", "android.location.action.ADAS_GNSS_ENABLED_CHANGED", "android.location.action.GNSS_CAPABILITIES_CHANGED", "android.location.MODE_CHANGED");
        hashSet7.add("android.location.PROVIDERS_CHANGED");
        hashSet7.add("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        hashSet7.add("android.media.AUDIO_BECOMING_NOISY");
        d.a(hashSet8, "android.media.INTERNAL_RINGER_MODE_CHANGED_ACTION", "android.media.MASTER_MUTE_CHANGED_ACTION", hashSet7, "android.media.RINGER_MODE_CHANGED");
        e.a(hashSet7, "android.media.SCO_AUDIO_STATE_CHANGED", hashSet8, "android.media.STREAM_DEVICES_CHANGED_ACTION", "android.media.STREAM_MUTE_CHANGED_ACTION");
        p.a(hashSet7, "android.media.VIBRATE_SETTING_CHANGED", "android.media.VOLUME_CHANGED_ACTION", "android.net.action.CLEAR_DNS_CACHE", "android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
        hashSet7.add("android.media.action.HDMI_AUDIO_PLUG");
        hashSet7.add("android.media.action.MICROPHONE_MUTE_CHANGED");
        hashSet7.add("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION");
        e.a(hashSet8, "android.media.action.SPEAKERPHONE_STATE_CHANGED", hashSet7, "android.media.tv.action.CHANNEL_BROWSABLE_REQUESTED", "android.media.tv.action.INITIALIZE_PROGRAMS");
        p.a(hashSet7, "android.media.tv.action.PREVIEW_PROGRAM_ADDED_TO_WATCH_NEXT", "android.media.tv.action.PREVIEW_PROGRAM_BROWSABLE_DISABLED", "android.media.tv.action.WATCH_NEXT_PROGRAM_BROWSABLE_DISABLED", "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED");
        d.a(hashSet7, "android.net.conn.CAPTIVE_PORTAL_TEST_COMPLETED", q4.c.f226807e, hashSet8, "android.net.conn.DATA_ACTIVITY_CHANGE");
        hashSet8.add("android.net.conn.INET_CONDITION_ACTION");
        hashSet7.add("android.net.conn.RESTRICT_BACKGROUND_CHANGED");
        hashSet8.add("android.net.conn.TETHER_STATE_CHANGED");
        e.a(hashSet7, "android.net.nsd.STATE_CHANGED", hashSet8, "android.net.scoring.SCORE_NETWORKS", "android.net.scoring.SCORER_CHANGED");
        p.a(hashSet8, "android.net.sip.action.SIP_CALL_OPTION_CHANGED", "android.net.sip.action.SIP_INCOMING_CALL", "android.net.sip.action.SIP_REMOVE_PROFILE", "android.net.sip.action.SIP_SERVICE_UP");
        e.a(hashSet8, "android.net.sip.action.START_SIP", hashSet7, "android.net.wifi.action.WIFI_NETWORK_SUGGESTION_POST_CONNECTION", "android.net.wifi.action.WIFI_SCAN_AVAILABILITY_CHANGED");
        p.a(hashSet7, "android.net.wifi.aware.action.WIFI_AWARE_RESOURCE_CHANGED", "android.net.wifi.aware.action.WIFI_AWARE_STATE_CHANGED", "android.net.wifi.BATCHED_RESULTS", "android.net.wifi.NETWORK_IDS_CHANGED");
        p.a(hashSet7, "android.net.wifi.RSSI_CHANGED", "android.net.wifi.SCAN_RESULTS", "android.net.wifi.STATE_CHANGE", "android.net.wifi.WIFI_STATE_CHANGED");
        p.a(hashSet7, "android.net.wifi.p2p.CONNECTION_STATE_CHANGE", "android.net.wifi.p2p.DISCOVERY_STATE_CHANGE", "android.net.wifi.p2p.PEERS_CHANGED", "android.net.wifi.p2p.STATE_CHANGED");
        p.a(hashSet7, "android.net.wifi.p2p.THIS_DEVICE_CHANGED", "android.net.wifi.rtt.action.WIFI_RTT_STATE_CHANGED", "android.net.wifi.supplicant.CONNECTION_CHANGE", "android.net.wifi.supplicant.STATE_CHANGE");
        hashSet7.add("android.nfc.action.ADAPTER_STATE_CHANGED");
        hashSet8.add("android.nfc.action.PREFERRED_PAYMENT_CHANGED");
        hashSet7.add("android.nfc.action.TRANSACTION_DETECTED");
        e.a(hashSet8, "android.os.action.ACTION_EFFECTS_SUPPRESSOR_CHANGED", hashSet7, "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.ENHANCED_DISCHARGE_PREDICTION_CHANGED");
        hashSet8.add("android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED");
        hashSet7.add("android.os.action.POWER_SAVE_MODE_CHANGED");
        hashSet8.add("android.os.action.POWER_SAVE_MODE_CHANGED_INTERNAL");
        p.a(hashSet8, "android.os.action.POWER_SAVE_MODE_CHANGING", "android.os.action.POWER_SAVE_TEMP_WHITELIST_CHANGED", "android.os.action.POWER_SAVE_WHITELIST_CHANGED", "android.os.action.UPDATE_EMERGENCY_NUMBER_DB");
        hashSet9.add("android.provider.action.DEFAULT_SMS_PACKAGE_CHANGE");
        hashSet8.add("android.provider.action.DEFAULT_SMS_PACKAGE_CHANGED_INTERNAL");
        hashSet9.add("android.provider.action.EXTERNAL_PROVIDER_CHANGE");
        e.a(hashSet9, "android.provider.action.SIM_ACCOUNTS_CHANGED", hashSet8, "android.provider.action.SMS_EMERGENCY_CB_RECEIVED", "android.provider.action.SMS_MMS_DB_CREATED");
        hashSet8.add("android.provider.action.SMS_MMS_DB_LOST");
        hashSet7.add("android.provider.action.SYNC_VOICEMAIL");
        hashSet8.add("android.provider.Telephony.MMS_DOWNLOADED");
        d.a(hashSet7, "android.provider.Telephony.SECRET_CODE", "android.provider.Telephony.SIM_FULL", hashSet8, "android.provider.Telephony.SMS_CARRIER_PROVISION");
        p.a(hashSet7, "android.provider.Telephony.SMS_CB_RECEIVED", "android.provider.Telephony.SMS_DELIVER", "android.provider.Telephony.SMS_EMERGENCY_CB_RECEIVED", "android.provider.Telephony.SMS_RECEIVED");
        p.a(hashSet7, "android.provider.Telephony.SMS_REJECTED", "android.provider.Telephony.SMS_SERVICE_CATEGORY_PROGRAM_DATA_RECEIVED", "android.provider.Telephony.WAP_PUSH_DELIVER", "android.provider.Telephony.WAP_PUSH_RECEIVED");
        e.a(hashSet9, "android.scheduling.action.REBOOT_READY", hashSet7, "android.security.action.KEY_ACCESS_CHANGED", "android.security.action.KEYCHAIN_CHANGED");
        hashSet7.add("android.security.action.TRUST_STORE_CHANGED");
        hashSet7.add("android.security.STORAGE_CHANGED");
        hashSet7.add("android.se.omapi.action.SECURE_ELEMENT_STATE_CHANGED");
        d.a(hashSet8, "android.service.controls.action.ADD_CONTROL", "android.settings.ENABLE_MMS_DATA_REQUEST", hashSet9, "android.settings.SHOW_RESTRICTED_SETTING_DIALOG");
        d.a(hashSet7, "android.speech.tts.engine.TTS_DATA_INSTALLED", "android.speech.tts.TTS_QUEUE_PROCESSING_COMPLETED", hashSet9, "android.telecom.action.PHONE_ACCOUNT_REGISTERED");
        hashSet9.add("android.telecom.action.PHONE_ACCOUNT_UNREGISTERED");
        e.a(hashSet8, "android.telephony.action.AREA_INFO_UPDATED", hashSet7, "android.telephony.action.CARRIER_SIGNAL_DEFAULT_NETWORK_AVAILABLE", "android.telephony.action.CARRIER_SIGNAL_PCO_VALUE");
        p.a(hashSet7, "android.telephony.action.CARRIER_SIGNAL_REDIRECTED", "android.telephony.action.CARRIER_SIGNAL_REQUEST_NETWORK_FAILED", "android.telephony.action.CARRIER_SIGNAL_RESET", "android.telephony.action.CARRIER_CONFIG_CHANGED");
        d.a(hashSet7, "android.telephony.action.DEFAULT_SMS_SUBSCRIPTION_CHANGED", "android.telephony.action.DEFAULT_SUBSCRIPTION_CHANGED", hashSet8, "android.telephony.action.PRIMARY_SUBSCRIPTION_LIST_CHANGED");
        e.a(hashSet7, "android.telephony.action.REFRESH_SUBSCRIPTION_PLANS", hashSet8, "android.telephony.action.SECRET_CODE", "android.telephony.action.SERVICE_PROVIDERS_UPDATED");
        p.a(hashSet7, "android.telephony.action.SIM_APPLICATION_STATE_CHANGED", "android.telephony.action.SIM_CARD_STATE_CHANGED", "android.telephony.action.SIM_SLOT_STATUS_CHANGED", "android.telephony.action.SUBSCRIPTION_CARRIER_IDENTITY_CHANGED");
        d.a(hashSet8, "android.telephony.action.SUBSCRIPTION_PLANS_CHANGED", "android.telephony.action.SUBSCRIPTION_SPECIFIC_CARRIER_IDENTITY_CHANGED", hashSet7, "android.telephony.euicc.action.NOTIFY_CARRIER_SETUP_INCOMPLETE");
        d.a(hashSet7, "android.telephony.euicc.action.OTA_STATUS_CHANGED", "android.telephony.ims.action.RCS_SINGLE_REGISTRATION_CAPABILITY_UPDATE", hashSet8, "android.telephony.ims.action.WFC_IMS_REGISTRATION_ERROR");
        p.a(hashSet8, "com.android.intent.action.DISMISS_KEYBOARD_SHORTCUTS", "com.android.intent.action.SHOW_KEYBOARD_SHORTCUTS", "com.android.internal.intent.action.ACTION_FORBIDDEN_NO_SERVICE_AUTHORIZATION", "com.android.internal.provider.action.VOICEMAIL_SMS_RECEIVED");
        hashSet7.add("android.intent.action.QUICKBOOT_POWERON");
        hashSet7.add("android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED");
        hashSet7.add("android.intent.action.ACTION_DEFAULT_VOICE_SUBSCRIPTION_CHANGED");
        p.a(hashSet8, "com.xiaomi.push.PING_TIMER", "com.xiaomi.mipush.RECEIVE_MESSAGE", "com.xiaomi.mipush.MESSAGE_ARRIVED", "com.xiaomi.mipush.ERROR");
        p.a(hashSet8, "com.meizu.cloud.pushservice.action.PUSH_SERVICE_START", "com.meizu.flyme.push.intent.MESSAGE", "com.meizu.flyme.push.intent.REGISTER.FEEDBACK", "com.meizu.flyme.push.intent.UNREGISTER.FEEDBACK");
        p.a(hashSet8, "com.meizu.c2dm.intent.REGISTRATION", "com.meizu.c2dm.intent.RECEIVE", "com.huawei.intent.action.PUSH", "com.huawei.android.push.intent.REGISTRATION");
        hashSet8.add("com.huawei.android.push.intent.RECEIVE");
        hashSet8.add("com.huawei.android.push.intent.CLICK");
        hashSet8.add("com.huawei.intent.action.PUSH_STATE");
        hashSet4.addAll(hashSet7);
        hashSet4.addAll(hashSet8);
        hashSet4.addAll(hashSet9);
        p.a(hashSet5, "android.intent.action.BOOT_COMPLETED", "android.intent.action.LOCKED_BOOT_COMPLETED", "android.intent.action.QUICKBOOT_POWERON", "android.intent.action.USER_INITIALIZE");
        p.a(hashSet5, b.a.f68590a, b.a.f68591b, "android.intent.action.TIME_SET", "android.intent.action.TIMEZONE_CHANGED");
        p.a(hashSet5, "android.app.action.NEXT_ALARM_CLOCK_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.hardware.usb.action.USB_ACCESSORY_ATTACHED", "android.hardware.usb.action.USB_ACCESSORY_DETACHED");
        p.a(hashSet5, "android.hardware.usb.action.USB_DEVICE_ATTACHED", "android.hardware.usb.action.USB_DEVICE_DETACHED", "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        p.a(hashSet5, "android.bluetooth.device.action.ACL_CONNECTED", "android.bluetooth.device.action.ACL_DISCONNECTED", "android.telephony.action.CARRIER_CONFIG_CHANGED", "android.telephony.action.DEFAULT_SMS_SUBSCRIPTION_CHANGED");
        p.a(hashSet5, "android.telephony.action.DEFAULT_SUBSCRIPTION_CHANGED", "android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED", "android.intent.action.ACTION_DEFAULT_VOICE_SUBSCRIPTION_CHANGED", "android.provider.Telephony.SECRET_CODE");
        p.a(hashSet5, "android.intent.action.PHONE_STATE", "android.telecom.action.PHONE_ACCOUNT_REGISTERED", "android.telecom.action.PHONE_ACCOUNT_UNREGISTERED", com.prism.gaia.helper.compat.a.f164968i);
        p.a(hashSet5, com.prism.gaia.helper.compat.a.f164969j, "android.intent.action.PACKAGE_DATA_CLEARED", "android.intent.action.PACKAGE_FULLY_REMOVED", "android.intent.action.NEW_OUTGOING_CALL");
        p.a(hashSet5, "android.app.action.DEVICE_OWNER_CHANGED", "android.intent.action.EVENT_REMINDER", "android.intent.action.MEDIA_MOUNTED", "android.intent.action.MEDIA_CHECKING");
        p.a(hashSet5, "android.intent.action.MEDIA_UNMOUNTED", "android.intent.action.MEDIA_EJECT", "android.intent.action.MEDIA_UNMOUNTABLE", "android.intent.action.MEDIA_REMOVED");
        hashSet5.add("android.intent.action.MEDIA_BAD_REMOVAL");
        hashSet5.add("android.provider.Telephony.SMS_RECEIVED");
        hashSet5.add("android.provider.Telephony.WAP_PUSH_RECEIVED");
        hashSet6.add("android.app.action.INTERRUPTION_FILTER_CHANGED");
        hashSet6.add("android.app.action.NEXT_ALARM_CLOCK_CHANGED");
        hashSet6.add("android.app.action.NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED");
        hashSet6.add("android.app.action.NOTIFICATION_POLICY_CHANGED");
        if (C3841e.s()) {
            hashSet6.add("android.hardware.action.NEW_PICTURE");
            hashSet6.add("android.hardware.action.NEW_VIDEO");
        }
        p.a(hashSet6, "android.intent.action.BATTERY_CHANGED", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED");
        p.a(hashSet6, "android.intent.action.PACKAGES_SUSPENDED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIME_TICK");
        p.a(hashSet6, "android.intent.action.USER_UNLOCKED", "android.media.action.HDMI_AUDIO_PLUG", "android.net.conn.RESTRICT_BACKGROUND_CHANGED", "android.net.wifi.aware.action.WIFI_AWARE_STATE_CHANGED");
        hashSet6.add("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        hashSet6.add("android.os.action.POWER_SAVE_MODE_CHANGED");
        if (C3841e.q()) {
            hashSet6.add("android.security.STORAGE_CHANGED");
        }
        if (C3841e.w()) {
            hashSet6.add("android.intent.action.DISTRACTING_PACKAGES_CHANGED");
        }
        U6.c.P();
        hashSet.addAll(Arrays.asList(strArr));
        hashSet.addAll(Arrays.asList(strArr2));
        hashSet2.addAll(Arrays.asList(strArr3));
        hashSet3.add(U6.b.f68572i);
        hashSet3.add(U6.b.f68571h);
        hashSet3.addAll(Arrays.asList(U6.b.f68579p));
        hashSet3.addAll(Arrays.asList(U6.b.f68580q));
        hashSet3.addAll(Arrays.asList(U6.b.f68581r));
        hashSet3.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        U6.c.i0();
        hashSet.add(U6.b.f68585v);
        hashSet2.add(U6.b.f68584u);
        hashSet10.addAll(Arrays.asList(U6.b.f68557A));
    }

    public static boolean a(String str) {
        return f84781c.contains(str);
    }

    public static boolean b(String str) {
        return f84788j.contains(str);
    }

    public static boolean c(String str) {
        return f84784f.contains(str);
    }

    public static boolean d(String str) {
        return f84785g.contains(str);
    }

    public static boolean e(String str) {
        return f84783e.contains(str);
    }

    public static boolean f(String str) {
        return f84787i.contains(str);
    }

    public static boolean g(String str) {
        return f84786h.contains(str);
    }

    public static boolean h(String str) {
        return f84782d.contains(str);
    }

    public static boolean i(String str) {
        return f84792n.contains(str);
    }

    public static boolean j(String str) {
        return f84780b.contains(str);
    }
}
