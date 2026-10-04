package com.bytedance.sdk.component.ZRu;

import com.bytedance.sdk.component.ZRu.om;
import com.bytedance.sdk.component.ZRu.to;
import com.bytedance.sdk.component.ZRu.uR;
import com.bytedance.sdk.component.ZRu.xY;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
class Mm implements xY.ZRu {
    private final boolean FA;
    private final sAl Mm;
    private final OCA NOt;
    private final boolean Vor;
    private final FA ZRu;
    private final com.bytedance.sdk.component.ZRu.ZRu aT;
    private final Map<String, NOt> mZ = new HashMap();
    private final Map<String, uR.NOt> uR = new HashMap();
    private final List<yBV> TFq = new ArrayList();
    private final Set<uR> Ht = new HashSet();

    public static final class ZRu {
        String NOt;
        boolean ZRu;

        private ZRu(boolean z10, String str) {
            this.ZRu = z10;
            this.NOt = str;
        }
    }

    public Mm(aT aTVar, com.bytedance.sdk.component.ZRu.ZRu zRu, to toVar) {
        this.aT = zRu;
        this.ZRu = aTVar.uR;
        OCA oca = new OCA(toVar, aTVar.lp, aTVar.sAl);
        this.NOt = oca;
        oca.ZRu(this);
        oca.ZRu(aTVar.yBV);
        this.Mm = aTVar.Vor;
        this.FA = aTVar.FA;
        this.Vor = aTVar.oK;
    }

    private Zf NOt(String str, NOt nOt) {
        return this.Vor ? Zf.PRIVATE : this.NOt.ZRu(this.FA, str, nOt);
    }

    public ZRu ZRu(yBV ybv, Ht ht) throws Exception {
        NOt nOt = this.mZ.get(ybv.uR);
        if (nOt != null) {
            try {
                Zf zfNOt = NOt(ht.NOt, nOt);
                ht.uR = zfNOt;
                if (zfNOt == null) {
                    ybv.toString();
                    throw new qF(-1);
                }
                if (nOt instanceof TFq) {
                    ybv.toString();
                    return ZRu(ybv, (TFq) nOt, ht);
                }
                if (nOt instanceof mZ) {
                    ybv.toString();
                    return ZRu(ybv, (mZ) nOt, zfNOt);
                }
            } catch (to.ZRu unused) {
                ybv.toString();
                this.TFq.add(ybv);
                return new ZRu(false, ru.ZRu());
            }
        }
        uR.NOt nOt2 = this.uR.get(ybv.uR);
        if (nOt2 == null) {
            ybv.toString();
            return null;
        }
        uR uRVarZRu = nOt2.ZRu();
        uRVarZRu.ZRu(ybv.uR);
        Zf zfNOt2 = NOt(ht.NOt, uRVarZRu);
        ht.uR = zfNOt2;
        if (zfNOt2 != null) {
            ybv.toString();
            return ZRu(ybv, uRVarZRu, ht);
        }
        ybv.toString();
        uRVarZRu.uR();
        throw new qF(-1);
    }

    public void ZRu(String str, TFq<?, ?> tFq) {
        tFq.ZRu(str);
        this.mZ.put(str, tFq);
    }

    public void ZRu(String str, uR.NOt nOt) {
        this.uR.put(str, nOt);
    }

    public void ZRu() {
        Iterator<uR> it = this.Ht.iterator();
        while (it.hasNext()) {
            it.next().TFq();
        }
        this.Ht.clear();
        this.mZ.clear();
        this.uR.clear();
        this.NOt.NOt(this);
    }

    private ZRu ZRu(yBV ybv, TFq tFq, Ht ht) throws Exception {
        return new ZRu(true, ru.ZRu(this.ZRu.ZRu(tFq.ZRu(ZRu(ybv.TFq, (NOt) tFq), ht))));
    }

    private ZRu ZRu(final yBV ybv, final uR uRVar, Ht ht) throws Exception {
        this.Ht.add(uRVar);
        uRVar.ZRu(ZRu(ybv.TFq, uRVar), ht, new uR.ZRu() { // from class: com.bytedance.sdk.component.ZRu.Mm.1
            @Override // com.bytedance.sdk.component.ZRu.uR.ZRu
            public void ZRu(Object obj) {
                if (Mm.this.aT == null) {
                    return;
                }
                Mm.this.aT.NOt(ru.ZRu(Mm.this.ZRu.ZRu(obj)), ybv);
                Mm.this.Ht.remove(uRVar);
            }

            @Override // com.bytedance.sdk.component.ZRu.uR.ZRu
            public void ZRu(Throwable th) {
                if (Mm.this.aT == null) {
                    return;
                }
                Mm.this.aT.NOt(ru.ZRu(th), ybv);
                Mm.this.Ht.remove(uRVar);
            }
        });
        return new ZRu(false, ru.ZRu());
    }

    private ZRu ZRu(final yBV ybv, mZ mZVar, Zf zf) throws Exception {
        new om(ybv.uR, zf, new om.ZRu() { // from class: com.bytedance.sdk.component.ZRu.Mm.2
        });
        return new ZRu(false, ru.ZRu());
    }

    private Object ZRu(String str, NOt nOt) throws JSONException {
        return this.ZRu.ZRu(str, ZRu(nOt)[0]);
    }

    private static Type[] ZRu(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }
}
