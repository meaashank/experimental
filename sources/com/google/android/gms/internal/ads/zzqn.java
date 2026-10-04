package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzqn extends AudioDeviceCallback {
    final /* synthetic */ zzqr zza;

    public /* synthetic */ zzqn(zzqr zzqrVar, byte[] bArr) {
        Objects.requireNonNull(zzqrVar);
        this.zza = zzqrVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.zza.zzi();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        String str = zzfm.zza;
        int length = audioDeviceInfoArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            zzqr zzqrVar = this.zza;
            if (Objects.equals(audioDeviceInfoArr[i10], zzqrVar.zzj())) {
                zzqrVar.zzk(null);
                break;
            }
            i10++;
        }
        this.zza.zzi();
    }
}
