package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgdv {
    public static ListenableFuture zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzgdt zzgdtVar = new zzgdt(task, null);
        task.addOnCompleteListener(zzhdp.zza(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzgdu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task2) {
                zzgdt zzgdtVar2 = zzgdtVar;
                if (task2.isCanceled()) {
                    zzgdtVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzgdtVar2.zza(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzgdtVar2.zzb(exception);
            }
        });
        return zzgdtVar;
    }
}
