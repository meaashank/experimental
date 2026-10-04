package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class zzjy implements zzgs {
    static final zzgs zza = new zzjy();

    private zzjy() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzgs
    public final boolean zza(int i10) {
        return (i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? null : zzjz.PLAY_BILLING_ACTIVITY_CREATED_ACTION : zzjz.IN_APP_BILLING_RESULT_UPDATE_ACTION : zzjz.ALTERNATIVE_BILLING_ACTION : zzjz.LOCAL_PURCHASES_UPDATED_ACTION : zzjz.PURCHASES_UPDATED_ACTION : zzjz.BROADCAST_ACTION_UNSPECIFIED) != null;
    }
}
