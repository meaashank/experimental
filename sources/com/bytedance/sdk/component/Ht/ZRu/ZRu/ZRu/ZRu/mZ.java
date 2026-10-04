package com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mZ {
    private final Context ZRu;
    protected final List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> NOt = new ArrayList();
    private boolean mZ = false;
    private final Runnable uR = new Runnable() { // from class: com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.mZ.1
        @Override // java.lang.Runnable
        public void run() {
            synchronized (mZ.this) {
                try {
                    if (mZ.this.NOt.isEmpty()) {
                        mZ.this.mZ = false;
                        return;
                    }
                    ArrayList arrayList = new ArrayList(mZ.this.NOt);
                    mZ.this.NOt.clear();
                    mZ.this.mZ = false;
                    mZ.this.uR(arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    public mZ(Context context) {
        this.ZRu = context;
    }

    public abstract String NOt();

    public Context TFq() {
        return this.ZRu;
    }

    public void mZ(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            Iterator<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> it = this.NOt.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.Ht.ZRu.uR.ZRu next = it.next();
                if (next != null) {
                    String strMZ = next.mZ();
                    if (!TextUtils.isEmpty(strMZ) && list.contains(strMZ)) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            NOt();
            th.getMessage();
        }
    }

    public void uR(List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> list) {
        com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.mZ.ZRu(TFq(), NOt(), list);
    }

    private void ZRu() {
        if (this.mZ) {
            return;
        }
        com.bytedance.sdk.component.Ht.ZRu.Mm.ZRu.ZRu().postDelayed(this.uR, com.bytedance.sdk.component.Ht.ZRu.Mm.ZRu.NOt());
        this.mZ = true;
    }

    public synchronized void ZRu(com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu) {
        if (zRu.Mm() != null && !TextUtils.isEmpty(zRu.mZ())) {
            this.NOt.add(zRu);
            ZRu();
        }
    }
}
