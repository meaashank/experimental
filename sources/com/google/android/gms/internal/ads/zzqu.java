package com.google.android.gms.internal.ads;

import android.media.AudioDescriptor;
import android.os.Build;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
final class zzqu {
    public static zzgxm zza(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            return zzgxm.zzi();
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(zzqt.zza).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorA = K2.a(it.next());
            if (audioDescriptorA.getStandard() == 1) {
                byte[] descriptor = audioDescriptorA.getDescriptor();
                int length = descriptor.length;
                if (length != 3) {
                    B.a(new StringBuilder(String.valueOf(length).length() + 20), "Invalid SAD length: ", length, "AudioDescriptorUtil");
                } else {
                    byte b10 = descriptor[0];
                    int i10 = (b10 & 7) + 1;
                    if (((b10 >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(zzfm.zzG(i10)));
                    }
                }
            }
        }
        return zzgxm.zzq(treeSet);
    }
}
