package com.android.billingclient.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzkg;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("PlatformActivityProxy")
@Y2
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f136471i = "in_app_message_result_receiver";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f136472j = "ProxyBillingActivity";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f136473k = 100;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f136474l = 101;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f136475m = 110;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @e.f0
    public static final int f136476n = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @e.f0
    public static final int f136477o = 4;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @e.f0
    public static final int f136478p = 5;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f136479q = "send_cancelled_broadcast_if_finished";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f136480r = "activity_code";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f136481s = "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ResultReceiver f136482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f136483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f136484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f136485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f136486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f136487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    @e.f0
    public C3056u2 f136488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    @e.f0
    public O1 f136489h;

    public final zzjs a(int i10, @Nullable Intent intent) {
        return intent == null ? i10 != -1 ? i10 != 0 ? i10 != 3 ? i10 != 4 ? zzjs.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : zzjs.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE : zzjs.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE : zzjs.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : zzjs.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : intent.getExtras() == null ? zzjs.NULL_BUNDLE_IN_ACTIVITY_RESULT : i10 == 5 ? zzjs.PLAY_STORE_ON_CREATE_RUNTIME_EXCEPTION : zzjs.REASON_UNSPECIFIED;
    }

    public final boolean b(@Nullable Bundle bundle) {
        if (bundle != null) {
            return bundle.containsKey(f136471i);
        }
        if (getIntent() == null) {
            return false;
        }
        return getIntent().hasExtra("IN_APP_MESSAGE_INTENT");
    }

    public final boolean c(int i10, @Nullable Intent intent) {
        return !a(i10, intent).equals(zzjs.REASON_UNSPECIFIED);
    }

    public final boolean d() {
        return this.f136488g != null;
    }

    public final Intent e(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Intent f(com.google.android.gms.internal.play_billing.zzjs r7, long r8, boolean r10) {
        /*
            r6 = this;
            android.content.Intent r0 = r6.g()
            java.lang.String r1 = "FAILURE_LOGGING_PAYLOAD"
            r2 = 0
            r3 = 2
            java.lang.String r4 = "DEBUG_MESSAGE"
            java.lang.String r5 = "RESPONSE_CODE"
            if (r10 == 0) goto L5a
            boolean r10 = r6.d()
            if (r10 == 0) goto L25
            com.android.billingclient.api.u2 r10 = r6.f136488g
            com.android.billingclient.api.BillingResult r10 = r10.f136837a
            if (r10 == 0) goto L25
            int r7 = r10.f136358a
            r0.putExtra(r5, r7)
            java.lang.String r7 = r10.f136360c
            r0.putExtra(r4, r7)
            goto L80
        L25:
            boolean r10 = r6.d()
            if (r10 == 0) goto L5a
            com.android.billingclient.api.u2 r10 = r6.f136488g
            boolean r10 = r10.f136838b
            if (r10 != 0) goto L5a
            r7 = 3
            r0.putExtra(r5, r7)
            java.lang.String r10 = "Play Store is blocked."
            r0.putExtra(r4, r10)
            com.android.billingclient.api.BillingResult$Builder r4 = com.android.billingclient.api.BillingResult.d()
            r4.setResponseCode(r7)
            r4.setDebugMessage(r10)
            com.android.billingclient.api.BillingResult r7 = r4.build()
            com.google.android.gms.internal.play_billing.zzjs r10 = com.google.android.gms.internal.play_billing.zzjs.PLAY_STORE_APP_BLOCKED
            int r4 = com.android.billingclient.api.N1.f136462a
            com.google.android.gms.internal.play_billing.zzjz r4 = com.google.android.gms.internal.play_billing.zzjz.BROADCAST_ACTION_UNSPECIFIED
            com.google.android.gms.internal.play_billing.zzjl r7 = com.android.billingclient.api.N1.b(r10, r3, r7, r2, r4)
            byte[] r7 = r7.zzQ()
            r0.putExtra(r1, r7)
            goto L80
        L5a:
            r10 = 6
            r0.putExtra(r5, r10)
            java.lang.String r5 = "An internal error occurred."
            r0.putExtra(r4, r5)
            com.android.billingclient.api.BillingResult$Builder r4 = com.android.billingclient.api.BillingResult.d()
            r4.setResponseCode(r10)
            r4.setDebugMessage(r5)
            com.android.billingclient.api.BillingResult r10 = r4.build()
            int r4 = com.android.billingclient.api.N1.f136462a
            com.google.android.gms.internal.play_billing.zzjz r4 = com.google.android.gms.internal.play_billing.zzjz.BROADCAST_ACTION_UNSPECIFIED
            com.google.android.gms.internal.play_billing.zzjl r7 = com.android.billingclient.api.N1.b(r7, r3, r10, r2, r4)
            byte[] r7 = r7.zzQ()
            r0.putExtra(r1, r7)
        L80:
            java.lang.String r7 = "INTENT_SOURCE"
            java.lang.String r10 = "LAUNCH_BILLING_FLOW"
            r0.putExtra(r7, r10)
            java.lang.String r7 = "billingClientTransactionId"
            r0.putExtra(r7, r8)
            boolean r7 = r6.f136487f
            java.lang.String r8 = "wasServiceAutoReconnected"
            r0.putExtra(r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.f(com.google.android.gms.internal.play_billing.zzjs, long, boolean):android.content.Intent");
    }

    public final Intent g() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037 A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:5:0x001d, B:28:0x0067, B:21:0x0031, B:23:0x0037, B:25:0x005e, B:24:0x004b), top: B:30:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:5:0x001d, B:28:0x0067, B:21:0x0031, B:23:0x0037, B:25:0x005e, B:24:0x004b), top: B:30:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void h() throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            com.android.billingclient.api.u2 r0 = new com.android.billingclient.api.u2     // Catch: java.lang.Throwable -> L28 java.lang.NoSuchMethodError -> L2b java.lang.RuntimeException -> L2e
            com.android.billingclient.api.O1 r1 = r8.f136489h     // Catch: java.lang.Throwable -> L28 java.lang.NoSuchMethodError -> L2b java.lang.RuntimeException -> L2e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L28 java.lang.NoSuchMethodError -> L2b java.lang.RuntimeException -> L2e
            r8.f136488g = r0     // Catch: java.lang.Throwable -> L28 java.lang.NoSuchMethodError -> L2b java.lang.RuntimeException -> L2e
            android.content.IntentFilter r4 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L28 java.lang.NoSuchMethodError -> L2b java.lang.RuntimeException -> L2e
            java.lang.String r0 = "com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L28 java.lang.NoSuchMethodError -> L2b java.lang.RuntimeException -> L2e
            java.lang.String r0 = "com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION"
            r4.addAction(r0)     // Catch: java.lang.Throwable -> L28 java.lang.NoSuchMethodError -> L2b java.lang.RuntimeException -> L2e
            com.android.billingclient.api.u2 r3 = r8.f136488g     // Catch: java.lang.Throwable -> L28 java.lang.NoSuchMethodError -> L2b java.lang.RuntimeException -> L2e
            java.lang.String r5 = "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST"
            r6 = 0
            r7 = 2
            r2 = r8
            B0.C0920d.registerReceiver(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L22 java.lang.NoSuchMethodError -> L24 java.lang.RuntimeException -> L26
            monitor-exit(r8)
            return
        L22:
            r0 = move-exception
            goto L67
        L24:
            r0 = move-exception
            goto L30
        L26:
            r0 = move-exception
            goto L30
        L28:
            r0 = move-exception
            r2 = r8
            goto L67
        L2b:
            r0 = move-exception
        L2c:
            r2 = r8
            goto L30
        L2e:
            r0 = move-exception
            goto L2c
        L30:
            r1 = 0
            r2.f136488g = r1     // Catch: java.lang.Throwable -> L22
            boolean r1 = r0 instanceof java.lang.NoSuchMethodError     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L4b
            com.android.billingclient.api.O1 r1 = r2.f136489h     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.play_billing.zzla r3 = com.google.android.gms.internal.play_billing.zzld.zza()     // Catch: java.lang.Throwable -> L22
            r4 = 2
            r3.zza(r4)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.play_billing.zzgp r3 = r3.zzi()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.play_billing.zzld r3 = (com.google.android.gms.internal.play_billing.zzld) r3     // Catch: java.lang.Throwable -> L22
            r1.m(r3)     // Catch: java.lang.Throwable -> L22
            goto L5e
        L4b:
            com.android.billingclient.api.O1 r1 = r2.f136489h     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.play_billing.zzla r3 = com.google.android.gms.internal.play_billing.zzld.zza()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r3.zza(r4)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.play_billing.zzgp r3 = r3.zzi()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.play_billing.zzld r3 = (com.google.android.gms.internal.play_billing.zzld) r3     // Catch: java.lang.Throwable -> L22
            r1.m(r3)     // Catch: java.lang.Throwable -> L22
        L5e:
            java.lang.String r1 = "ProxyBillingActivity"
            java.lang.String r3 = "Failed to register receiver."
            com.google.android.gms.internal.play_billing.zzc.zzo(r1, r3, r0)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r8)
            return
        L67:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L22
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.h():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // android.app.Activity
    @com.android.billingclient.api.Y2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(int r10, int r11, @androidx.annotation.Nullable android.content.Intent r12) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    @Y2
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i10;
        PendingIntent pendingIntent;
        Bundle bundle2;
        Bundle bundle3;
        super.onCreate(bundle);
        if (!b(bundle)) {
            try {
                i10 = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e10) {
                zzc.zzo(f136472j, "Failed to get package info for current package.", e10);
                i10 = -1;
            }
            if (this.f136489h == null) {
                Context applicationContext = getApplicationContext();
                zzke zzkeVarZza = zzkg.zza();
                zzkeVarZza.zzq(getPackageName());
                zzkeVarZza.zzx(X2.a.f76746b);
                zzkeVarZza.zzb(i10);
                zzkeVarZza.zza(Build.VERSION.SDK_INT);
                zzkeVarZza.zzp(926300087L);
                this.f136489h = new C2981b2(applicationContext, (zzkg) zzkeVarZza.zzi());
            }
            h();
        }
        if (bundle != null) {
            zzc.zzm(f136472j, "Launching Play Store billing flow from savedInstanceState");
            this.f136483b = bundle.getBoolean(f136479q, false);
            if (bundle.containsKey(f136471i)) {
                this.f136482a = (ResultReceiver) bundle.getParcelable(f136471i);
            }
            this.f136484c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f136485d = bundle.getInt(f136480r, 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f136486e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f136487f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        zzc.zzm(f136472j, "Launching Play Store billing flow");
        this.f136485d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f136484c = true;
                this.f136485d = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f136482a = (ResultReceiver) getIntent().getParcelableExtra(f136471i);
            this.f136485d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f136486e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f136487f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.f136483b = true;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 36) {
                bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(3).toBundle();
            } else {
                if (i11 < 34) {
                    bundle2 = null;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), this.f136485d, new Intent(), 0, 0, 0, bundle2);
                }
                bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
            }
            bundle2 = bundle3;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f136485d, new Intent(), 0, 0, 0, bundle2);
        } catch (IntentSender.SendIntentException e11) {
            zzc.zzo(f136472j, "Got exception while trying to start a purchase flow.", e11);
            ResultReceiver resultReceiver = this.f136482a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentF = f(zzjs.INTENT_SENDER_EXCEPTION, this.f136486e, false);
                if (this.f136484c) {
                    intentF.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentF);
            }
            this.f136483b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    @Y2
    public void onDestroy() {
        BillingResult billingResult;
        super.onDestroy();
        if (d()) {
            C3056u2 c3056u2 = this.f136488g;
            billingResult = c3056u2.f136837a;
            try {
                unregisterReceiver(c3056u2);
            } catch (RuntimeException e10) {
                zzc.zzo(f136472j, "Failed to unregister receiver.", e10);
            }
        } else {
            billingResult = null;
        }
        if (isFinishing() && this.f136483b) {
            Intent intentG = g();
            if (billingResult != null) {
                intentG.putExtra("RESPONSE_CODE", billingResult.f136358a);
                intentG.putExtra("DEBUG_MESSAGE", billingResult.f136360c);
            } else {
                intentG.putExtra("RESPONSE_CODE", 1);
                intentG.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            }
            if (this.f136484c) {
                intentG.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i10 = this.f136485d;
            if (i10 == 110 || i10 == 100) {
                intentG.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentG.putExtra("billingClientTransactionId", this.f136486e);
            }
            sendBroadcast(intentG);
        }
    }

    @Override // android.app.Activity
    @Y2
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f136482a;
        if (resultReceiver != null) {
            bundle.putParcelable(f136471i, resultReceiver);
        }
        bundle.putBoolean(f136479q, this.f136483b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f136484c);
        bundle.putInt(f136480r, this.f136485d);
        bundle.putLong("billingClientTransactionId", this.f136486e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f136487f);
    }
}
