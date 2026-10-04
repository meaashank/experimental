package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
final class zzug {
    private static final zzgxm zza = zzgxm.zzj(12);

    /* JADX WARN: Removed duplicated region for block: B:117:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzgxm zza(android.media.AudioDeviceInfo r10) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzug.zza(android.media.AudioDeviceInfo):com.google.android.gms.internal.ads.zzgxm");
    }

    @e.T(31)
    private static zzgxm zzb(AudioDeviceInfo audioDeviceInfo) {
        List audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(zzuf.zza).reversed());
        Iterator it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile audioProfileA = E2.a(it.next());
            if (audioProfileA.getEncapsulationType() != 1 && zzfm.zzE(audioProfileA.getFormat())) {
                for (int i10 : audioProfileA.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i10));
                }
            }
        }
        return zzgxm.zzq(treeSet);
    }
}
