package com.bytedance.adsdk.ZRu.NOt;

import com.bytedance.adsdk.ZRu.NOt.mZ.ZRu.FA;
import com.bytedance.adsdk.ZRu.NOt.mZ.ZRu.Ht;
import com.bytedance.adsdk.ZRu.NOt.mZ.ZRu.Mm;
import com.bytedance.adsdk.ZRu.NOt.mZ.ZRu.NOt;
import com.bytedance.adsdk.ZRu.NOt.mZ.ZRu.TFq;
import com.bytedance.adsdk.ZRu.NOt.mZ.ZRu.Vor;
import com.bytedance.adsdk.ZRu.NOt.mZ.ZRu.aT;
import com.bytedance.adsdk.ZRu.NOt.mZ.ZRu.mZ;
import com.bytedance.adsdk.ZRu.NOt.mZ.ZRu.uR;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    private static final com.bytedance.adsdk.ZRu.NOt.mZ.ZRu ZRu;
    private final com.bytedance.adsdk.ZRu.NOt.mZ.ZRu NOt;
    private String TFq;
    private com.bytedance.adsdk.ZRu.NOt.NOt.ZRu mZ;
    private Deque<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> uR = new LinkedList();

    static {
        int i10 = 8;
        Ht[] htArr = {new aT(), new uR(), new Vor(), new NOt(), new TFq(), new com.bytedance.adsdk.ZRu.NOt.mZ.ZRu.ZRu(), new Mm(), new mZ(), new FA()};
        final com.bytedance.adsdk.ZRu.NOt.mZ.ZRu zRu = new com.bytedance.adsdk.ZRu.NOt.mZ.ZRu() { // from class: com.bytedance.adsdk.ZRu.NOt.ZRu.1
            @Override // com.bytedance.adsdk.ZRu.NOt.mZ.ZRu
            public int ZRu(String str, int i11, Deque<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> deque) {
                return i11;
            }
        };
        while (i10 >= 0) {
            final Ht ht = htArr[i10];
            i10--;
            zRu = new com.bytedance.adsdk.ZRu.NOt.mZ.ZRu() { // from class: com.bytedance.adsdk.ZRu.NOt.ZRu.2
                @Override // com.bytedance.adsdk.ZRu.NOt.mZ.ZRu
                public int ZRu(String str, int i11, Deque<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> deque) {
                    return ht.ZRu(str, i11, deque, zRu);
                }
            };
        }
        ZRu = zRu;
    }

    private ZRu(String str, com.bytedance.adsdk.ZRu.NOt.mZ.ZRu zRu) {
        this.NOt = zRu;
        this.TFq = str;
        try {
            ZRu();
        } catch (Exception e10) {
            throw new com.bytedance.adsdk.ZRu.ZRu.NOt(str, e10);
        }
    }

    public static ZRu ZRu(String str) {
        return new ZRu(str, ZRu);
    }

    private void ZRu() {
        int length = this.TFq.length();
        int i10 = 0;
        while (i10 < length) {
            int iZRu = this.NOt.ZRu(this.TFq, i10, this.uR);
            if (iZRu == i10) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.TFq.substring(0, i10));
            }
            i10 = iZRu;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.ZRu.NOt.NOt.ZRu zRuPollFirst = this.uR.pollFirst();
            if (zRuPollFirst == null) {
                this.mZ = com.bytedance.adsdk.ZRu.NOt.TFq.NOt.ZRu(arrayList, this.TFq, i10);
                this.uR = null;
                return;
            }
            arrayList.add(0, zRuPollFirst);
        }
    }

    public <T> T ZRu(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("default_key", jSONObject);
        return (T) ZRu(map);
    }

    public <T> T ZRu(Map<String, JSONObject> map) {
        return (T) this.mZ.ZRu(map);
    }
}
