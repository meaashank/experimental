package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes4.dex */
final class zznj extends IllegalArgumentException {
    public zznj(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Unpaired surrogate at index ");
        sb2.append(i10);
        sb2.append(" of ");
        sb2.append(i11);
        super(sb2.toString());
    }
}
