package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzglt extends zzfyi {
    private final zzggk zzb;

    public zzglt(Context context, Executor executor, zzggk zzggkVar) {
        super(context, executor, new TaskCompletionSource().getTask(), false);
        this.zzb = zzggkVar;
    }

    private static Task zzh() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.internal.ads.zzfyi
    public final Task zzb(int i10, long j10) {
        this.zzb.zzb(i10, j10, null, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfyi
    public final Task zzc(int i10, long j10, Exception exc) {
        this.zzb.zzb(i10, j10, exc, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfyi
    public final Task zze(int i10, String str) {
        this.zzb.zzb(i10, -1L, null, str);
        return zzh();
    }
}
