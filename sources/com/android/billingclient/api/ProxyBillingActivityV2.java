package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.C2382e;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjs;
import d.C4283b;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends androidx.activity.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.activity.result.g f136490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.activity.result.g f136491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.activity.result.g f136492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.activity.result.g f136493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.activity.result.g f136494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.activity.result.g f136495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ResultReceiver f136496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public ResultReceiver f136497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ResultReceiver f136498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ResultReceiver f136499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ResultReceiver f136500k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ResultReceiver f136501l;

    @Nullable
    public static final C2382e R0() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 36) {
            C2382e c2382eB = C2382e.b();
            c2382eB.l(3);
            return c2382eB;
        }
        if (i10 < 34) {
            return null;
        }
        C2382e c2382eB2 = C2382e.b();
        c2382eB2.l(1);
        return c2382eB2;
    }

    @e.f0
    public final void L0(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int i10 = zzc.zzi(data, "ProxyBillingActivityV2").f136358a;
        ResultReceiver resultReceiver = this.f136496g;
        if (resultReceiver != null) {
            resultReceiver.send(i10, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || i10 != 0) {
            zzc.zzn("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + activityResult.getResultCode() + " and billing's responseCode: " + i10);
        }
        finish();
    }

    @e.f0
    public final void M0(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int i10 = zzc.zzi(data, "ProxyBillingActivityV2").f136358a;
        ResultReceiver resultReceiver = this.f136500k;
        if (resultReceiver != null) {
            resultReceiver.send(i10, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || i10 != 0) {
            zzc.zzn("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + activityResult.getResultCode() + " and billing's responseCode: " + i10);
        }
        finish();
    }

    @e.f0
    public final void N0(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int i10 = zzc.zzi(data, "ProxyBillingActivityV2").f136358a;
        ResultReceiver resultReceiver = this.f136497h;
        if (resultReceiver != null) {
            resultReceiver.send(i10, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || i10 != 0) {
            zzc.zzn("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(activityResult.getResultCode()), Integer.valueOf(i10)));
        }
        finish();
    }

    @e.f0
    public final void O0(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        Bundle extras = data == null ? null : data.getExtras();
        if (activityResult.getResultCode() != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            zzc.zzn("ProxyBillingActivityV2", String.format("External offer flow finished with resultCode: %s", Integer.valueOf(activityResult.getResultCode())));
            extras.putInt("INTERNAL_LOG_ERROR_REASON", zzjs.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("External offer flow finished with error resultCode: %s", Integer.valueOf(activityResult.getResultCode())));
        }
        int i10 = zzc.zzi(data, "ProxyBillingActivityV2").f136358a;
        ResultReceiver resultReceiver = this.f136498i;
        if (resultReceiver != null) {
            resultReceiver.send(i10, extras);
        } else {
            zzc.zzn("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i10 != 0) {
            zzc.zzn("ProxyBillingActivityV2", String.format("External offer flow finished with billing responseCode: %s", Integer.valueOf(i10)));
        }
        finish();
    }

    @e.f0
    public final void P0(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        Bundle extras = data == null ? null : data.getExtras();
        if (activityResult.getResultCode() != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            zzc.zzn("ProxyBillingActivityV2", String.format("Launch external link flow finished with resultCode: %s", Integer.valueOf(activityResult.getResultCode())));
            extras.putInt("INTERNAL_LOG_ERROR_REASON", zzjs.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("Launch external link flow finished with error resultCode: %s", Integer.valueOf(activityResult.getResultCode())));
        }
        int i10 = zzc.zzi(data, "ProxyBillingActivityV2").f136358a;
        ResultReceiver resultReceiver = this.f136499j;
        if (resultReceiver != null) {
            resultReceiver.send(i10, extras);
        } else {
            zzc.zzn("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
        }
        if (i10 != 0) {
            zzc.zzn("ProxyBillingActivityV2", String.format("Launch external link flow finished with billing responseCode: %s", Integer.valueOf(i10)));
        }
        finish();
    }

    @e.f0
    public final void Q0(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int i10 = zzc.zzi(data, "ProxyBillingActivityV2").f136358a;
        ResultReceiver resultReceiver = this.f136501l;
        if (resultReceiver != null) {
            resultReceiver.send(i10, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || i10 != 0) {
            zzc.zzn("ProxyBillingActivityV2", String.format("Subscription management action finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(activityResult.getResultCode()), Integer.valueOf(i10)));
        }
        finish();
    }

    @Override // androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f136490a = registerForActivityResult(new C4283b.n(), new androidx.activity.result.a() { // from class: com.android.billingclient.api.o2
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                this.f136789a.L0((ActivityResult) obj);
            }
        });
        this.f136491b = registerForActivityResult(new C4283b.n(), new androidx.activity.result.a() { // from class: com.android.billingclient.api.p2
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                this.f136796a.N0((ActivityResult) obj);
            }
        });
        this.f136492c = registerForActivityResult(new C4283b.n(), new androidx.activity.result.a() { // from class: com.android.billingclient.api.q2
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                this.f136804a.O0((ActivityResult) obj);
            }
        });
        this.f136493d = registerForActivityResult(new C4283b.n(), new androidx.activity.result.a() { // from class: com.android.billingclient.api.r2
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                this.f136811a.P0((ActivityResult) obj);
            }
        });
        this.f136494e = registerForActivityResult(new C4283b.n(), new androidx.activity.result.a() { // from class: com.android.billingclient.api.s2
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                this.f136822a.M0((ActivityResult) obj);
            }
        });
        this.f136495f = registerForActivityResult(new C4283b.n(), new androidx.activity.result.a() { // from class: com.android.billingclient.api.t2
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                this.f136829a.Q0((ActivityResult) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f136496g = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.f136497h = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.f136498i = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.f136499j = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
            }
            if (bundle.containsKey("billing_program_information_dialog_result_receiver")) {
                this.f136500k = (ResultReceiver) bundle.getParcelable("billing_program_information_dialog_result_receiver");
            }
            if (bundle.containsKey("subscription_management_action_result_receiver")) {
                this.f136501l = (ResultReceiver) bundle.getParcelable("subscription_management_action_result_receiver");
                return;
            }
            return;
        }
        zzc.zzm("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f136496g = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f136490a.c(new IntentSenderRequest.Builder(pendingIntent).build(), R0());
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f136497h = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f136491b.c(new IntentSenderRequest.Builder(pendingIntent2).build(), R0());
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.f136498i = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            this.f136492c.c(new IntentSenderRequest.Builder(pendingIntent3).build(), R0());
            return;
        }
        if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.f136499j = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            this.f136493d.c(new IntentSenderRequest.Builder(pendingIntent4).build(), R0());
        } else if (getIntent().hasExtra("billing_program_information_dialog_pending_intent")) {
            PendingIntent pendingIntent5 = (PendingIntent) getIntent().getParcelableExtra("billing_program_information_dialog_pending_intent");
            this.f136500k = (ResultReceiver) getIntent().getParcelableExtra("billing_program_information_dialog_result_receiver");
            this.f136494e.c(new IntentSenderRequest.Builder(pendingIntent5).build(), R0());
        } else if (getIntent().hasExtra("SUBSCRIPTION_MANAGEMENT_INTENT")) {
            PendingIntent pendingIntent6 = (PendingIntent) getIntent().getParcelableExtra("SUBSCRIPTION_MANAGEMENT_INTENT");
            this.f136501l = (ResultReceiver) getIntent().getParcelableExtra("subscription_management_action_result_receiver");
            this.f136495f.c(new IntentSenderRequest.Builder(pendingIntent6).build(), R0());
        }
    }

    @Override // androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f136496g;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f136497h;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f136498i;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.f136499j;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
        ResultReceiver resultReceiver5 = this.f136500k;
        if (resultReceiver5 != null) {
            bundle.putParcelable("billing_program_information_dialog_result_receiver", resultReceiver5);
        }
        ResultReceiver resultReceiver6 = this.f136501l;
        if (resultReceiver6 != null) {
            bundle.putParcelable("subscription_management_action_result_receiver", resultReceiver6);
        }
    }
}
