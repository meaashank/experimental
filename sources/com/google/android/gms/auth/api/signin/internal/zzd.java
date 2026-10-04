package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import androidx.loader.content.a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd extends a<Void> implements SignInConnectionListener {
    private Semaphore zzcg;
    private Set<GoogleApiClient> zzch;

    public zzd(Context context, Set<GoogleApiClient> set) {
        super(context);
        this.zzcg = new Semaphore(0);
        this.zzch = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.loader.content.a
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final Void loadInBackground() {
        Iterator<GoogleApiClient> it = this.zzch.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().maybeSignIn(this)) {
                i10++;
            }
        }
        try {
            this.zzcg.tryAcquire(i10, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.zzcg.release();
    }

    @Override // androidx.loader.content.c
    public final void onStartLoading() {
        this.zzcg.drainPermits();
        forceLoad();
    }
}
