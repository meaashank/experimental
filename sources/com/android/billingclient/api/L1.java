package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.annotation.Nullable;
import androidx.core.util.InterfaceC2427d;
import com.android.billingclient.api.BillingClient;
import com.google.android.gms.internal.play_billing.zzba;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzdf;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzp;
import com.google.android.gms.internal.play_billing.zzr;
import com.google.android.gms.internal.play_billing.zzu;
import e.InterfaceC4330d;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class L1 extends C3014k {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Context f136444O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public volatile int f136445P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @Nullable
    public volatile zzba f136446Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public volatile I1 f136447R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @Nullable
    public volatile ScheduledExecutorService f136448S;

    @InterfaceC4330d
    public L1(@Nullable String str, Context context, @Nullable O1 o12, @Nullable ExecutorService executorService, BillingClient.Builder builder) {
        super(null, context, null, null, builder);
        this.f136445P = 0;
        this.f136444O = context;
    }

    public static final boolean B2(int i10) {
        return i10 > 0;
    }

    public static boolean r2(L1 l12, int i10) {
        return i10 > 0;
    }

    public static /* synthetic */ Object u2(L1 l12, int i10, zzp zzpVar) {
        try {
            if (l12.f136446Q == null) {
                throw null;
            }
            l12.f136446Q.zza(l12.f136444O.getPackageName(), i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW", new H1(zzpVar));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e10) {
            l12.E2(zzjs.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, S1.f136523F);
            zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            zzpVar.zzb(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public final synchronized void A2() {
        if (s2()) {
            zzc.zzm("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            F2(26);
            return;
        }
        if (this.f136445P == 1) {
            zzc.zzn("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.f136445P == 3) {
            zzc.zzn("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            E2(zzjs.BILLING_CLIENT_CLOSED, 26, S1.a(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.f136445P = 1;
        zzc.zzm("BillingClientTesting", "Starting Billing Override Service setup.");
        this.f136447R = new I1(this, null);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        Context context = this.f136444O;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        zzjs zzjsVar = zzjs.REASON_UNSPECIFIED;
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            zzjsVar = zzjs.INTENT_SERVICE_NOT_FOUND;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    zzjsVar = zzjs.BILLING_SERVICE_BLOCKED;
                    zzc.zzn("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (context.bindService(intent2, this.f136447R, 1)) {
                        zzc.zzm("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    } else {
                        zzjsVar = zzjs.BILLING_SERVICE_BLOCKED;
                        zzc.zzn("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                    }
                }
            }
        }
        this.f136445P = 0;
        zzc.zzm("BillingClientTesting", "Billing Override Service unavailable on device.");
        E2(zzjsVar, 26, S1.a(2, "Billing Override Service unavailable on device."));
    }

    public final BillingResult C2(int i10, int i11) {
        BillingResult billingResultA = S1.a(i11, "Billing override value was set by a license tester.");
        E2(zzjs.LICENSE_TESTER_BILLING_OVERRIDE, i10, billingResultA);
        return billingResultA;
    }

    public final com.google.android.gms.internal.play_billing.zzdk D2(final int i10) {
        if (s2()) {
            return zzu.zza(new zzr() { // from class: com.android.billingclient.api.B1
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final Object zza(zzp zzpVar) {
                    L1.u2(this.f136284a, i10, zzpVar);
                    return "billingOverrideService.getBillingOverride";
                }
            });
        }
        zzc.zzn("BillingClientTesting", "Billing Override Service is not ready.");
        E2(zzjs.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY, 28, S1.a(-1, "Billing Override Service connection is disconnected."));
        return zzdf.zza(0);
    }

    public final void E2(zzjs zzjsVar, int i10, BillingResult billingResult) {
        int i11 = N1.f136462a;
        zzjl zzjlVarB = N1.b(zzjsVar, i10, billingResult, null, zzjz.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzjlVarB, "ApiFailure should not be null");
        this.f136745h.n(zzjlVarB);
    }

    public final void F2(int i10) {
        int i11 = N1.f136462a;
        zzjp zzjpVarC = N1.c(i10, zzjz.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzjpVarC, "ApiSuccess should not be null");
        this.f136745h.d(zzjpVarC);
    }

    public final void G2(int i10, InterfaceC2427d interfaceC2427d, Runnable runnable) {
        zzdf.zzc(zzdf.zzb(D2(i10), 28500L, TimeUnit.MILLISECONDS, y2()), new G1(this, i10, interfaceC2427d, runnable), O());
    }

    @Override // com.android.billingclient.api.C3014k, com.android.billingclient.api.BillingClient
    public final void a(final AcknowledgePurchaseParams acknowledgePurchaseParams, final InterfaceC2978b interfaceC2978b) {
        Objects.requireNonNull(interfaceC2978b);
        G2(3, new InterfaceC2427d() { // from class: com.android.billingclient.api.C1
            @Override // androidx.core.util.InterfaceC2427d
            public final void accept(Object obj) {
                interfaceC2978b.a((BillingResult) obj);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.D1
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.k*/.a(acknowledgePurchaseParams, interfaceC2978b);
            }
        });
    }

    @Override // com.android.billingclient.api.C3014k, com.android.billingclient.api.BillingClient
    public final void b(final ConsumeParams consumeParams, final F f10) {
        G2(4, new InterfaceC2427d() { // from class: com.android.billingclient.api.z1
            @Override // androidx.core.util.InterfaceC2427d
            public final void accept(Object obj) {
                f10.a((BillingResult) obj, consumeParams.f136365a);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.A1
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.k*/.b(consumeParams, f10);
            }
        });
    }

    @Override // com.android.billingclient.api.C3014k, com.android.billingclient.api.BillingClient
    public final void f() {
        z2();
        super.f();
    }

    @Override // com.android.billingclient.api.C3014k, com.android.billingclient.api.BillingClient
    public final BillingResult o(final Activity activity, final BillingFlowParams billingFlowParams) {
        InterfaceC2427d interfaceC2427d = new InterfaceC2427d() { // from class: com.android.billingclient.api.E1
            @Override // androidx.core.util.InterfaceC2427d
            public final void accept(Object obj) {
                this.f136383a.Y1((BillingResult) obj);
            }
        };
        Callable callable = new Callable() { // from class: com.android.billingclient.api.F1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return super/*com.android.billingclient.api.k*/.o(activity, billingFlowParams);
            }
        };
        int iX2 = x2(D2(2));
        if (iX2 > 0) {
            BillingResult billingResultC2 = C2(2, iX2);
            interfaceC2427d.accept(billingResultC2);
            return billingResultC2;
        }
        try {
            return (BillingResult) callable.call();
        } catch (Exception e10) {
            zzjs zzjsVar = zzjs.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
            BillingResult billingResult = S1.f136537h;
            E2(zzjsVar, 2, billingResult);
            zzc.zzo("BillingClientTesting", "An internal error occurred.", e10);
            return billingResult;
        }
    }

    @Override // com.android.billingclient.api.C3014k, com.android.billingclient.api.BillingClient
    public final void r(final QueryProductDetailsParams queryProductDetailsParams, final Z z10) {
        G2(7, new InterfaceC2427d() { // from class: com.android.billingclient.api.x1
            @Override // androidx.core.util.InterfaceC2427d
            public final void accept(Object obj) {
                C3007i0 c3007i0 = new C3007i0(new ArrayList(), new ArrayList());
                z10.a((BillingResult) obj, c3007i0);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.y1
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.k*/.r(queryProductDetailsParams, z10);
            }
        });
    }

    public final synchronized boolean s2() {
        if (this.f136445P == 2 && this.f136446Q != null) {
            if (this.f136447R != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.android.billingclient.api.C3014k, com.android.billingclient.api.BillingClient
    public final void x(InterfaceC3065x interfaceC3065x) {
        A2();
        G1(interfaceC3065x, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int x2(com.google.android.gms.internal.play_billing.zzdk zzdkVar) {
        try {
            return ((Integer) zzdkVar.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            E2(zzjs.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, S1.f136523F);
            zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
            return 0;
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            E2(zzjs.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, S1.f136523F);
            zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
            return 0;
        }
    }

    public final synchronized ScheduledExecutorService y2() {
        try {
            if (this.f136448S == null) {
                this.f136448S = Executors.newSingleThreadScheduledExecutor();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f136448S;
    }

    public final synchronized void z2() {
        F2(27);
        try {
            try {
                if (this.f136447R != null && this.f136446Q != null) {
                    zzc.zzm("BillingClientTesting", "Unbinding from Billing Override Service.");
                    this.f136444O.unbindService(this.f136447R);
                    this.f136447R = new I1(this, null);
                }
                this.f136446Q = null;
                if (this.f136448S != null) {
                    this.f136448S.shutdownNow();
                    this.f136448S = null;
                }
            } catch (RuntimeException e10) {
                zzc.zzo("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e10);
            }
            this.f136445P = 3;
        } catch (Throwable th) {
            this.f136445P = 3;
            throw th;
        }
    }

    @InterfaceC4330d
    public L1(@Nullable String str, PendingPurchasesParams pendingPurchasesParams, Context context, InterfaceC2993e2 interfaceC2993e2, @Nullable O1 o12, @Nullable ExecutorService executorService, BillingClient.Builder builder) {
        super((String) null, pendingPurchasesParams, context, (InterfaceC2993e2) null, (O1) null, (ExecutorService) null, builder);
        this.f136445P = 0;
        this.f136444O = context;
    }

    @InterfaceC4330d
    public L1(@Nullable String str, PendingPurchasesParams pendingPurchasesParams, Context context, InterfaceC3003h0 interfaceC3003h0, @Nullable O1 o12, @Nullable ExecutorService executorService, BillingClient.Builder builder) {
        super((String) null, pendingPurchasesParams, context, interfaceC3003h0, (O1) null, (ExecutorService) null, builder);
        this.f136445P = 0;
        this.f136444O = context;
    }

    @InterfaceC4330d
    public L1(@Nullable String str, PendingPurchasesParams pendingPurchasesParams, Context context, InterfaceC3003h0 interfaceC3003h0, @Nullable InterfaceC3015k0 interfaceC3015k0, @Nullable M m10, @Nullable O1 o12, @Nullable ExecutorService executorService, BillingClient.Builder builder) {
        super(null, pendingPurchasesParams, context, interfaceC3003h0, interfaceC3015k0, m10, null, null, builder);
        this.f136445P = 0;
        this.f136444O = context;
    }
}
