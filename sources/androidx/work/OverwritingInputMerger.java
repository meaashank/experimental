package androidx.work;

import androidx.annotation.NonNull;
import androidx.work.Data;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OverwritingInputMerger extends g {
    @Override // androidx.work.g
    @NonNull
    public Data b(@NonNull List<Data> inputs) {
        Data.Builder builder = new Data.Builder();
        HashMap map = new HashMap();
        Iterator<Data> it = inputs.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(it.next().f120220a));
        }
        builder.putAll(map);
        return builder.build();
    }
}
