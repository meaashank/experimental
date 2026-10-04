package com.google.firebase.crashlytics;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.crashlytics.internal.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements OnFailureListener {
    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Logger.getLogger().e("Error fetching settings.", exc);
    }
}
