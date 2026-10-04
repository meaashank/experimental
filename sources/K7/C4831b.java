package k7;

import android.annotation.TargetApi;
import android.os.IInterface;
import c7.AbstractC2950b;
import c7.G;
import c7.m;
import c7.n;
import c7.o;
import c7.x;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.compat.android.content.AttributionSourceCompat2;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: k7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@TargetApi(19)
public class C4831b extends AbstractC2950b<IInterface> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f217335i = "asdf-".concat(C4831b.class.getSimpleName());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String[] f217336j = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", null, "android.permission.VIBRATE", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.READ_CALL_LOG", "android.permission.WRITE_CALL_LOG", "android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR", "android.permission.ACCESS_WIFI_STATE", null, null, U6.b.f68573j, "android.permission.READ_SMS", null, "android.permission.RECEIVE_SMS", "android.permission.RECEIVE_EMERGENCY_BROADCAST", "android.permission.RECEIVE_MMS", "android.permission.RECEIVE_WAP_PUSH", "android.permission.SEND_SMS", "android.permission.READ_SMS", null, "android.permission.WRITE_SETTINGS", "android.permission.SYSTEM_ALERT_WINDOW", "android.permission.ACCESS_NOTIFICATIONS", "android.permission.CAMERA", "android.permission.RECORD_AUDIO", null, null, null, null, null, null, null, null, null, null, null, null, "android.permission.WAKE_LOCK", null, null, "android.permission.PACKAGE_USAGE_STATS", null, null, null, null, null, null, null, U6.b.f68570g, U6.b.f68574k, U6.b.f68575l, "android.permission.PROCESS_OUTGOING_CALLS", "android.permission.USE_FINGERPRINT", "android.permission.BODY_SENSORS", "android.permission.READ_CELL_BROADCASTS", null, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", null, "android.permission.GET_ACCOUNTS", null};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String[] f217337k = {"COARSE_LOCATION", "FINE_LOCATION", "GPS", "VIBRATE", "READ_CONTACTS", "WRITE_CONTACTS", "READ_CALL_LOG", "WRITE_CALL_LOG", "READ_CALENDAR", "WRITE_CALENDAR", "WIFI_SCAN", "POST_NOTIFICATION", "NEIGHBORING_CELLS", "CALL_PHONE", "READ_SMS", "WRITE_SMS", "RECEIVE_SMS", "RECEIVE_EMERGECY_SMS", "RECEIVE_MMS", "RECEIVE_WAP_PUSH", "SEND_SMS", "READ_ICC_SMS", "WRITE_ICC_SMS", "WRITE_SETTINGS", "SYSTEM_ALERT_WINDOW", "ACCESS_NOTIFICATIONS", "CAMERA", "RECORD_AUDIO", "PLAY_AUDIO", "READ_CLIPBOARD", "WRITE_CLIPBOARD", "TAKE_MEDIA_BUTTONS", "TAKE_AUDIO_FOCUS", "AUDIO_MASTER_VOLUME", "AUDIO_VOICE_VOLUME", "AUDIO_RING_VOLUME", "AUDIO_MEDIA_VOLUME", "AUDIO_ALARM_VOLUME", "AUDIO_NOTIFICATION_VOLUME", "AUDIO_BLUETOOTH_VOLUME", "WAKE_LOCK", "MONITOR_LOCATION", "MONITOR_HIGH_POWER_LOCATION", "GET_USAGE_STATS", "MUTE_MICROPHONE", "TOAST_WINDOW", "PROJECT_MEDIA", "ACTIVATE_VPN", "WRITE_WALLPAPER", "ASSIST_STRUCTURE", "ASSIST_SCREENSHOT", "OP_READ_PHONE_STATE", "ADD_VOICEMAIL", "USE_SIP", "PROCESS_OUTGOING_CALLS", "USE_FINGERPRINT", "BODY_SENSORS", "READ_CELL_BROADCASTS", "MOCK_LOCATION", "READ_EXTERNAL_STORAGE", "WRITE_EXTERNAL_STORAGE", "TURN_ON_SCREEN", "GET_ACCOUNTS", "RUN_IN_BACKGROUND"};

    /* JADX INFO: renamed from: k7.b$a */
    public static class a extends n {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f217338f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f217339g;

        public a(String str, int i10, int i11) {
            super(str);
            this.f217338f = i10;
            this.f217339g = i11;
        }

        @Override // c7.m
        public boolean b(Object obj, Method method, Object... objArr) {
            int i10;
            if (C3841e.z() && (i10 = this.f217338f) != -1 && objArr.length > i10 && o.a(objArr[i10])) {
                AttributionSourceCompat2.Util.fixChain(b7.b.a(objArr[this.f217338f]), m.w());
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: k7.b$b, reason: collision with other inner class name */
    public static class C0818b extends n {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f217340f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f217341g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f217342h;

        public C0818b(String str, int i10, int i11, int i12) {
            super(str);
            this.f217340f = i11;
            this.f217341g = i10;
            this.f217342h = i12;
        }

        @Override // c7.m
        public boolean b(Object obj, Method method, Object... objArr) {
            int i10 = this.f217340f;
            if (i10 != -1 && objArr.length > i10 && (objArr[i10] instanceof String)) {
                String unused = C4831b.f217335i;
                method.getName();
                Object obj2 = objArr[this.f217340f];
                m.w();
                objArr[this.f217340f] = m.w();
            }
            int i11 = this.f217341g;
            if (i11 == -1 || !(objArr[i11] instanceof Integer)) {
                return true;
            }
            String unused2 = C4831b.f217335i;
            method.getName();
            Object obj3 = objArr[this.f217341g];
            m.F();
            objArr[this.f217341g] = Integer.valueOf(m.F());
            return true;
        }
    }

    public C4831b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        f(new C0818b("checkOperation", 1, 2, 0));
        f(new C0818b("noteOperation", 1, 2, 0));
        f(new C0818b("startOperation", 2, 3, 1));
        f(new C0818b("finishOperation", 2, 3, 1));
        f(new C0818b("startWatchingMode", -1, 1, 0));
        f(new C0818b("checkPackage", 0, 1, -1));
        f(new C0818b("getOpsForPackage", 0, 1, -1));
        f(new C0818b("setMode", 1, 2, 0));
        f(new C0818b("checkAudioOperation", 2, 3, 0));
        f(new C0818b("setAudioRestriction", 2, -1, 0));
        f(new G("resetAllModes"));
        f(new a("noteProxyOperation", 1, 0));
        f(new a("startProxyOperation", 2, 1));
        f(new a("finishProxyOperation", 2, 1));
        f(new C0818b("startWatchingAsyncNoted", -1, 0, -1));
        f(new C0818b("stopWatchingAsyncNoted", -1, 0, -1));
        f(new C0818b("extractAsyncOps", -1, 0, -1));
        g(new x());
    }
}
