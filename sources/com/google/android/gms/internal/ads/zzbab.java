package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
final class zzbab implements Runnable {
    private zzbab() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzbac.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzbac.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzbac.zzb;
        } catch (Throwable th) {
            zzbac.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ zzbab(byte[] bArr) {
    }
}
