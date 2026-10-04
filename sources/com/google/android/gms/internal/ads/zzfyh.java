package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzfyh implements Continuation {
    static final /* synthetic */ zzfyh zza = new zzfyh();

    private /* synthetic */ zzfyh() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return new Boolean(task.isSuccessful());
    }
}
