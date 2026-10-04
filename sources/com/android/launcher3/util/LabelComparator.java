package com.android.launcher3.util;

import java.text.Collator;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public class LabelComparator implements Comparator<String> {
    private final Collator mCollator = Collator.getInstance();

    @Override // java.util.Comparator
    public int compare(String str, String str2) {
        boolean z10 = false;
        boolean z11 = str.length() > 0 && Character.isLetterOrDigit(str.codePointAt(0));
        if (str2.length() > 0 && Character.isLetterOrDigit(str2.codePointAt(0))) {
            z10 = true;
        }
        if (z11 && !z10) {
            return -1;
        }
        if (z11 || !z10) {
            return this.mCollator.compare(str, str2);
        }
        return 1;
    }
}
