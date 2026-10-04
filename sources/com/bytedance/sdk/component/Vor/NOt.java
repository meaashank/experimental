package com.bytedance.sdk.component.Vor;

import com.bytedance.sdk.component.utils.lp;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    public static boolean ZRu(List<String> list, String str) {
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                try {
                } catch (Throwable th) {
                    lp.NOt(th.toString());
                }
                if (Pattern.matches(it.next(), str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
