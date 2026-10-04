package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class zzhb extends IOException {
    public zzhb(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public zzhb(String str) {
        super(str);
    }
}
