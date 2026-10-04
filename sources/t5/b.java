package T5;

import android.annotation.TargetApi;
import com.permissionx.guolindev.request.x;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.B;
import kotlin.collections.m0;
import kotlin.collections.n0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Set<String> f68347a = B.Fz(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission.SYSTEM_ALERT_WINDOW", "android.permission.WRITE_SETTINGS", "android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission.REQUEST_INSTALL_PACKAGES", "android.permission.POST_NOTIFICATIONS", x.f161795f});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @TargetApi(29)
    @NotNull
    public static final Map<String, String> f68348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @TargetApi(30)
    @NotNull
    public static final Map<String, String> f68349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @TargetApi(31)
    @NotNull
    public static final Map<String, String> f68350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @TargetApi(33)
    @NotNull
    public static final Map<String, String> f68351e;

    static {
        Map<String, String> mapW = n0.W(new Pair("android.permission.READ_CALENDAR", "android.permission-group.CALENDAR"), new Pair("android.permission.WRITE_CALENDAR", "android.permission-group.CALENDAR"), new Pair("android.permission.READ_CALL_LOG", "android.permission-group.CALL_LOG"), new Pair("android.permission.WRITE_CALL_LOG", "android.permission-group.CALL_LOG"), new Pair("android.permission.PROCESS_OUTGOING_CALLS", "android.permission-group.CALL_LOG"), new Pair("android.permission.CAMERA", "android.permission-group.CAMERA"), new Pair("android.permission.READ_CONTACTS", "android.permission-group.CONTACTS"), new Pair("android.permission.WRITE_CONTACTS", "android.permission-group.CONTACTS"), new Pair("android.permission.GET_ACCOUNTS", "android.permission-group.CONTACTS"), new Pair("android.permission.ACCESS_FINE_LOCATION", "android.permission-group.LOCATION"), new Pair("android.permission.ACCESS_COARSE_LOCATION", "android.permission-group.LOCATION"), new Pair("android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission-group.LOCATION"), new Pair("android.permission.RECORD_AUDIO", "android.permission-group.MICROPHONE"), new Pair(U6.b.f68570g, "android.permission-group.PHONE"), new Pair(U6.b.f68571h, "android.permission-group.PHONE"), new Pair(U6.b.f68573j, "android.permission-group.PHONE"), new Pair(U6.b.f68572i, "android.permission-group.PHONE"), new Pair(U6.b.f68574k, "android.permission-group.PHONE"), new Pair(U6.b.f68575l, "android.permission-group.PHONE"), new Pair("android.permission.ACCEPT_HANDOVER", "android.permission-group.PHONE"), new Pair("android.permission.BODY_SENSORS", "android.permission-group.SENSORS"), new Pair("android.permission.ACTIVITY_RECOGNITION", "android.permission-group.ACTIVITY_RECOGNITION"), new Pair("android.permission.SEND_SMS", "android.permission-group.SMS"), new Pair("android.permission.RECEIVE_SMS", "android.permission-group.SMS"), new Pair("android.permission.READ_SMS", "android.permission-group.SMS"), new Pair("android.permission.RECEIVE_WAP_PUSH", "android.permission-group.SMS"), new Pair("android.permission.RECEIVE_MMS", "android.permission-group.SMS"), new Pair("android.permission.READ_EXTERNAL_STORAGE", "android.permission-group.STORAGE"), new Pair("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission-group.STORAGE"), new Pair(U6.b.f68586w, "android.permission-group.STORAGE"));
        f68348b = mapW;
        Map mapJ0 = n0.J0(m0.k(new Pair("android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission-group.STORAGE")));
        mapJ0.putAll(mapW);
        Map<String, String> mapD0 = n0.D0(mapJ0);
        f68349c = mapD0;
        Map mapJ02 = n0.J0(n0.W(new Pair("android.permission.BLUETOOTH_SCAN", "android.permission-group.NEARBY_DEVICES"), new Pair("android.permission.BLUETOOTH_ADVERTISE", "android.permission-group.NEARBY_DEVICES"), new Pair("android.permission.BLUETOOTH_CONNECT", "android.permission-group.NEARBY_DEVICES")));
        mapJ02.putAll(mapD0);
        Map<String, String> mapD02 = n0.D0(mapJ02);
        f68350d = mapD02;
        Map mapJ03 = n0.J0(n0.W(new Pair("android.permission.READ_MEDIA_IMAGES", "android.permission-group.READ_MEDIA_VISUAL"), new Pair("android.permission.READ_MEDIA_VIDEO", "android.permission-group.READ_MEDIA_VISUAL"), new Pair("android.permission.READ_MEDIA_AUDIO", "android.permission-group.READ_MEDIA_AURAL"), new Pair("android.permission.POST_NOTIFICATIONS", "android.permission-group.NOTIFICATIONS"), new Pair("android.permission.NEARBY_WIFI_DEVICES", "android.permission-group.NEARBY_DEVICES"), new Pair(x.f161795f, "android.permission-group.SENSORS")));
        mapJ03.putAll(mapD02);
        f68351e = n0.D0(mapJ03);
    }

    @NotNull
    public static final Set<String> a() {
        return f68347a;
    }

    @NotNull
    public static final Map<String, String> b() {
        return f68348b;
    }

    @NotNull
    public static final Map<String, String> c() {
        return f68349c;
    }

    @NotNull
    public static final Map<String, String> d() {
        return f68350d;
    }

    @NotNull
    public static final Map<String, String> e() {
        return f68351e;
    }
}
