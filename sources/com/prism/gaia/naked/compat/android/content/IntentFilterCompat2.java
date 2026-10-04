package com.prism.gaia.naked.compat.android.content;

import F8.e;
import android.content.IntentFilter;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.metadata.android.content.IntentFilterCAG;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class IntentFilterCompat2 {

    public static class Util {
        public static List<String> getActions(IntentFilter intentFilter) {
            return C3841e.E() ? new LinkedList(IntentFilterCAG.U34.mActions().get(intentFilter)) : IntentFilterCAG._T33.mActions().get(intentFilter);
        }

        public static void setActions(IntentFilter intentFilter, List<String> list) {
            if (C3841e.E()) {
                IntentFilterCAG.U34.mActions().set(intentFilter, e.a(list));
            } else {
                IntentFilterCAG._T33.mActions().set(intentFilter, new ArrayList(list));
            }
        }
    }
}
