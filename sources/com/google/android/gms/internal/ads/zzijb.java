package com.google.android.gms.internal.ads;

import androidx.core.view.C2462i0;

/* JADX INFO: loaded from: classes4.dex */
final class zzijb implements zzifs {
    static final zzifs zza = new zzijb();

    private zzijb() {
    }

    @Override // com.google.android.gms.internal.ads.zzifs
    public final boolean zza(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 1999) {
            switch (i10) {
                case 1000:
                case 1001:
                case 1002:
                case C2462i0.f111917f /* 1003 */:
                case 1004:
                case 1005:
                case C2462i0.f111919h /* 1006 */:
                case C2462i0.f111920i /* 1007 */:
                case C2462i0.f111921j /* 1008 */:
                case C2462i0.f111922k /* 1009 */:
                case 1010:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
