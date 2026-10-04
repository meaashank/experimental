package xb;

import U6.j;
import android.content.Context;
import android.support.v4.media.f;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.BeaconReport;
import com.tencent.beacon.event.open.EventResult;
import com.tencent.beacon.event.open.EventType;
import java.util.Map;
import vb.C5724e;

/* JADX INFO: renamed from: xb.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C5803a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f240588b = "TrackService";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f240589c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f240590d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f240591e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static C5803a f240592f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f240593a;

    public C5803a(Context context) {
        this.f240593a = context.getApplicationContext();
    }

    public static C5803a a() {
        return f240592f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[Catch: all -> 0x0046, DONT_GENERATE, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0016, B:10:0x001c, B:11:0x0042, B:15:0x0048, B:19:0x0077, B:18:0x0074, B:20:0x007a), top: B:26:0x0003, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r4, java.lang.String r5, boolean r6, boolean r7) {
        /*
            java.lang.Class<xb.a> r0 = xb.C5803a.class
            monitor-enter(r0)
            xb.a r1 = xb.C5803a.f240592f     // Catch: java.lang.Throwable -> L46
            if (r1 != 0) goto L7a
            xb.a r1 = new xb.a     // Catch: java.lang.Throwable -> L46
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L46
            xb.C5803a.f240592f = r1     // Catch: java.lang.Throwable -> L46
            xb.C5803a.f240589c = r5     // Catch: java.lang.Throwable -> L46
            xb.C5803a.f240590d = r6     // Catch: java.lang.Throwable -> L46
            xb.C5803a.f240591e = r7     // Catch: java.lang.Throwable -> L46
            if (r7 != 0) goto L7a
            boolean r7 = c()     // Catch: java.lang.Throwable -> L46
            if (r7 == 0) goto L7a
            com.tencent.beacon.event.open.BeaconConfig$Builder r7 = com.tencent.beacon.event.open.BeaconConfig.builder()     // Catch: java.lang.Throwable -> L46
            r1 = 0
            com.tencent.beacon.event.open.BeaconConfig$Builder r7 = r7.auditEnable(r1)     // Catch: java.lang.Throwable -> L46
            com.tencent.beacon.event.open.BeaconConfig$Builder r7 = r7.bidEnable(r1)     // Catch: java.lang.Throwable -> L46
            com.tencent.beacon.event.open.BeaconConfig$Builder r7 = r7.qmspEnable(r1)     // Catch: java.lang.Throwable -> L46
            com.tencent.beacon.event.open.BeaconConfig$Builder r7 = r7.pagePathEnable(r1)     // Catch: java.lang.Throwable -> L46
            r2 = 30000(0x7530, double:1.4822E-319)
            com.tencent.beacon.event.open.BeaconConfig$Builder r7 = r7.setNormalPollingTime(r2)     // Catch: java.lang.Throwable -> L46
            com.tencent.beacon.event.open.BeaconConfig r7 = r7.build()     // Catch: java.lang.Throwable -> L46
            com.tencent.beacon.event.open.BeaconReport r2 = com.tencent.beacon.event.open.BeaconReport.getInstance()     // Catch: java.lang.Throwable -> L46
            r2.setLogAble(r6)     // Catch: java.lang.Throwable -> L46
            r2.setCollectProcessInfo(r1)     // Catch: java.lang.Throwable -> L46 java.lang.NoSuchMethodError -> L48
            goto L48
        L46:
            r4 = move-exception
            goto L7c
        L48:
            com.tencent.qimei.sdk.IQimeiSDK r6 = com.tencent.qimei.sdk.QimeiSDK.getInstance(r5)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L73
            com.tencent.qimei.strategy.terminal.ITerminalStrategy r6 = r6.getStrategy()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L73
            com.tencent.qimei.strategy.terminal.ITerminalStrategy r6 = r6.enableOAID(r1)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L73
            com.tencent.qimei.strategy.terminal.ITerminalStrategy r6 = r6.enableIMEI(r1)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L73
            com.tencent.qimei.strategy.terminal.ITerminalStrategy r6 = r6.enableIMSI(r1)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L73
            com.tencent.qimei.strategy.terminal.ITerminalStrategy r6 = r6.enableAndroidId(r1)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L73
            com.tencent.qimei.strategy.terminal.ITerminalStrategy r6 = r6.enableMAC(r1)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L73
            com.tencent.qimei.strategy.terminal.ITerminalStrategy r6 = r6.enableCid(r1)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L73
            com.tencent.qimei.strategy.terminal.ITerminalStrategy r6 = r6.enableProcessInfo(r1)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L73
            r6.enableBuildModel(r1)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L73
            r2.start(r4, r5, r7)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L73
            goto L77
        L73:
            r4 = move-exception
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L46
        L77:
            r2.setCollectProcessInfo(r1)     // Catch: java.lang.Throwable -> L46 java.lang.NoSuchMethodError -> L7a
        L7a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return
        L7c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.C5803a.b(android.content.Context, java.lang.String, boolean, boolean):void");
    }

    public static boolean c() {
        try {
            Class.forName("com.tencent.beacon.event.open.BeaconReport");
            Class.forName("com.tencent.qimei.sdk.QimeiSDK");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public void d(String str, String str2, Map<String, String> map) {
        if (f240591e || !c()) {
            return;
        }
        String str3 = f240589c;
        if (str == null) {
            str = str3;
        }
        EventResult eventResultReport = BeaconReport.getInstance().report(BeaconEvent.builder().withAppKey(str).withCode(str2).withType(EventType.NORMAL).withParams(map).build());
        if (f240590d) {
            StringBuilder sb2 = new StringBuilder("{");
            for (String str4 : map.keySet()) {
                StringBuilder sbA = f.a(str4, "=");
                sbA.append(map.get(str4));
                sbA.append(j.f68738d);
                sb2.append(sbA.toString());
            }
            sb2.delete(sb2.length() - 2, sb2.length()).append("}");
            C5724e.g(f240588b, "eventCode: %s, params: %s => result{ eventID: %s, errorCode: %d, errorMsg: %s}", str2, sb2, Long.valueOf(eventResultReport.eventID), Integer.valueOf(eventResultReport.errorCode), eventResultReport.errMsg);
        }
    }
}
