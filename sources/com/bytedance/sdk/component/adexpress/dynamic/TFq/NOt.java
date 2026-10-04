package com.bytedance.sdk.component.adexpress.dynamic.TFq;

import android.text.TextUtils;
import androidx.compose.animation.C1571b;
import com.bytedance.sdk.component.adexpress.NOt.sAl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.N;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    private String FA;
    private int Ht;
    private double Mm;
    private double TFq;
    private sAl Vor;
    public Map<String, mZ> ZRu = new HashMap();
    public Map<String, mZ> NOt = new HashMap();
    public Map<String, mZ> mZ = new HashMap();
    private double uR = Math.random();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.TFq.NOt$NOt, reason: collision with other inner class name */
    public static class C0422NOt {
        int NOt;
        float TFq;
        float ZRu;
        int mZ;
        double uR;

        public static JSONObject ZRu(C0422NOt c0422NOt) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", c0422NOt.ZRu);
                jSONObject.put("letterSpacing", c0422NOt.NOt);
                jSONObject.put("lineHeight", c0422NOt.uR);
                jSONObject.put("maxWidth", c0422NOt.TFq);
                jSONObject.put("fontWeight", c0422NOt.mZ);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    public static class ZRu implements Cloneable {
        boolean NOt;
        float ZRu;
        float mZ;

        public Object clone() {
            try {
                return (ZRu) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }

    public static class mZ {
        float NOt;
        float ZRu;

        public mZ() {
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("UnitSize{width=");
            sb2.append(this.ZRu);
            sb2.append(", height=");
            return C1571b.a(sb2, this.NOt, '}');
        }

        public mZ(float f10, float f11) {
            this.ZRu = f10;
            this.NOt = f11;
        }
    }

    public NOt(double d10, int i10, double d11, String str, sAl sal) {
        this.TFq = d10;
        this.Ht = i10;
        this.Mm = d11;
        this.FA = str;
        this.Vor = sal;
    }

    private mZ Ht(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2, float f10, float f11) {
        new mZ();
        com.bytedance.sdk.component.adexpress.dynamic.uR.Ht htTFq = fa2.aT().TFq();
        fa2.aT().mZ();
        htTFq.Np();
        float fQF = htTFq.qF();
        int iGis = htTFq.Gis();
        double dJem = htTFq.Jem();
        int iHX = htTFq.HX();
        boolean zHvv = htTFq.Hvv();
        boolean zGmt = htTFq.gmt();
        int iIZ = htTFq.IZ();
        C0422NOt c0422NOt = new C0422NOt();
        c0422NOt.ZRu = fQF;
        c0422NOt.NOt = iGis;
        c0422NOt.mZ = iHX;
        c0422NOt.uR = dJem;
        c0422NOt.TFq = f10;
        return ZRu(fa2.aT().mZ(), c0422NOt, zHvv, zGmt, iIZ, fa2);
    }

    private mZ TFq(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2, float f10, float f11) {
        String str = fa2.mZ() + "_" + f10 + "_" + f11;
        if (this.mZ.containsKey(str)) {
            return this.mZ.get(str);
        }
        mZ mZVarHt = Ht(fa2, f10, f11);
        this.mZ.put(str, mZVarHt);
        return mZVarHt;
    }

    public mZ NOt(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2, float f10, float f11) {
        mZ mZVar = new mZ();
        if (fa2.aT().TFq() == null) {
            return mZVar;
        }
        mZ mZVarTFq = TFq(fa2, f10, f11);
        float f12 = mZVarTFq.ZRu;
        float f13 = mZVarTFq.NOt;
        mZVar.ZRu = Math.min(f12, f10);
        mZVar.NOt = Math.min(f13, f11);
        return mZVar;
    }

    public mZ ZRu(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2, float f10, float f11) {
        float f12;
        if (TextUtils.isEmpty(fa2.aT().mZ()) && fa2.aT().TFq().Oc() == null) {
            return new mZ(0.0f, 0.0f);
        }
        if (a.a(fa2, "creative-playable-bait")) {
            return new mZ(0.0f, 0.0f);
        }
        float fFA = fa2.FA();
        float fVor = fa2.Vor();
        com.bytedance.sdk.component.adexpress.dynamic.uR.Ht htTFq = fa2.aT().TFq();
        String strNb = htTFq.Nb();
        String strFcs = htTFq.fcs();
        float fSAl = fa2.sAl();
        float fEdo = fa2.edo();
        float fOK = fa2.oK();
        float fYBV = fa2.yBV();
        if (TextUtils.equals(strNb, "fixed")) {
            f10 = Math.min(fFA, f10);
            if (TextUtils.equals(strFcs, N.f218775c)) {
                f12 = NOt(fa2, f10 - fOK, f11 - fYBV).NOt;
                fVor = f12 + fYBV;
            }
        } else if (TextUtils.equals(strNb, N.f218775c)) {
            mZ mZVarNOt = NOt(fa2, f10 - fOK, f11 - fYBV);
            f10 = mZVarNOt.ZRu + fOK;
            if (TextUtils.equals(strFcs, N.f218775c)) {
                f12 = mZVarNOt.NOt;
                fVor = f12 + fYBV;
            }
        } else if (!TextUtils.equals(strNb, "flex")) {
            f10 = fFA;
        } else if (TextUtils.equals(strFcs, N.f218775c)) {
            f12 = NOt(fa2, f10 - fOK, f11 - fYBV).NOt;
            fVor = f12 + fYBV;
        }
        if (TextUtils.equals(strFcs, "scale")) {
            float fRound = Math.round((f10 - fSAl) / fVor) + fEdo;
            if (fRound > f11) {
                f10 = Math.round((f11 - fEdo) * fVor) + fSAl;
            } else {
                f11 = fRound;
            }
        } else if (TextUtils.equals(strFcs, "fixed")) {
            f11 = Math.min(fVor + fEdo, f11);
        } else if (!TextUtils.equals(strFcs, "flex")) {
            f11 = fVor;
        }
        mZ mZVar = new mZ();
        mZVar.ZRu = f10;
        mZVar.NOt = f11;
        return mZVar;
    }

    public mZ mZ(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2, float f10, float f11) {
        if (fa2 == null) {
            return null;
        }
        mZ mZVarZRu = ZRu(fa2);
        if (mZVarZRu != null && (mZVarZRu.ZRu != 0.0f || mZVarZRu.NOt != 0.0f)) {
            return mZVarZRu;
        }
        mZ mZVarUR = uR(fa2, f10, f11);
        ZRu(fa2, mZVarUR);
        return mZVarUR;
    }

    public mZ uR(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2, float f10, float f11) {
        float fMin;
        float f12;
        float f13;
        mZ mZVar = new mZ();
        float f14 = 0.0f;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            mZVar.ZRu = 0.0f;
            mZVar.NOt = 0.0f;
            return mZVar;
        }
        if (fa2.qF()) {
            return ZRu(fa2, f10, f11);
        }
        float fFA = fa2.FA();
        float fVor = fa2.Vor();
        float fOK = fa2.oK();
        float fYBV = fa2.yBV();
        com.bytedance.sdk.component.adexpress.dynamic.uR.Ht htTFq = fa2.aT().TFq();
        String strNb = htTFq.Nb();
        String strFcs = htTFq.fcs();
        float fMin2 = ((TextUtils.equals(strNb, "flex") || TextUtils.equals(strNb, N.f218775c)) ? f10 : Math.min(fFA, f10)) - fOK;
        if (TextUtils.equals(strFcs, "scale")) {
            fMin = Math.round(fMin2 / fVor) + fYBV;
            if (fMin > f11) {
                fMin2 = Math.round((f11 - fYBV) * fVor);
            }
        } else {
            fMin = (TextUtils.equals(strFcs, N.f218775c) || TextUtils.equals(strFcs, "flex")) ? f11 : Math.min(fVor, f11);
        }
        float f15 = fMin - fYBV;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA>> listWMI = fa2.WMI();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        for (List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> list : listWMI) {
            float f16 = f14;
            float f17 = fOK;
            mZ mZVarNOt = NOt(list, fMin2, f15);
            if (NOt(list)) {
                f13 = f16 + 1.0f;
            } else {
                fMax = Math.max(fMax, mZVarNOt.ZRu);
                f13 = f16;
            }
            float f18 = f13;
            float f19 = fMin2;
            fMax2 = fa2.aT().NOt().equals("carousel") ? Math.max(fa2.Vor(), mZVarNOt.NOt) : fMax2 + mZVarNOt.NOt;
            fOK = f17;
            f14 = f18;
            fMin2 = f19;
        }
        float f20 = f14;
        float f21 = fMin2;
        float f22 = fOK;
        if (!TextUtils.equals(strNb, N.f218775c)) {
            f12 = f21;
        } else if (f20 == listWMI.size()) {
            f12 = f10;
        } else {
            for (List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> list2 : listWMI) {
                mZ(list2);
                NOt(list2, fMax, f15);
            }
            f12 = fMax;
        }
        if (TextUtils.equals(strFcs, N.f218775c)) {
            if (fMax2 <= f11) {
                f15 = fMax2;
            } else {
                ZRu(listWMI, f12, f15);
            }
        } else if ((TextUtils.equals(strFcs, "fixed") || TextUtils.equals(strFcs, "flex")) && f15 < fMax2) {
            ZRu(listWMI, f12, f15);
        }
        mZVar.ZRu = Math.min(f12 + f22, f10);
        mZVar.NOt = Math.min(f15 + fYBV, f11);
        return mZVar;
    }

    private mZ mZ(List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> list, float f10, float f11) {
        float fMax;
        uR(list);
        mZ mZVar = new mZ();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2 : list) {
            com.bytedance.sdk.component.adexpress.dynamic.uR.Ht htTFq = fa2.aT().TFq();
            if (htTFq.ZRJ() == 1 || htTFq.ZRJ() == 2) {
                arrayList.add(fa2);
            }
            if (htTFq.ZRJ() != 1 && htTFq.ZRJ() != 2) {
                arrayList2.add(fa2);
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            mZ((com.bytedance.sdk.component.adexpress.dynamic.uR.FA) obj, f10, f11);
        }
        if (arrayList2.size() <= 0) {
            return mZVar;
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            arrayList3.add(Float.valueOf(mZ((com.bytedance.sdk.component.adexpress.dynamic.uR.FA) obj2, f10, f11).ZRu));
        }
        ArrayList arrayList4 = new ArrayList();
        int i12 = 0;
        while (true) {
            if (i12 >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa3 = (com.bytedance.sdk.component.adexpress.dynamic.uR.FA) arrayList2.get(i12);
            String strNb = fa3.aT().TFq().Nb();
            float fFA = fa3.FA();
            boolean zEquals = TextUtils.equals(strNb, "flex");
            if (TextUtils.equals(strNb, N.f218775c)) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA>> listWMI = fa3.WMI();
                if (listWMI == null || listWMI.size() <= 0) {
                    zEquals = false;
                } else {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA>> it = listWMI.iterator();
                    while (it.hasNext()) {
                        if (NOt(it.next())) {
                            zEquals = true;
                            break;
                        }
                    }
                    zEquals = false;
                }
            }
            ZRu zRu = new ZRu();
            if (!zEquals) {
                fFA = ((Float) arrayList3.get(i12)).floatValue();
            }
            zRu.ZRu = fFA;
            zRu.NOt = !zEquals;
            if (zEquals) {
                fMax = ((Float) arrayList3.get(i12)).floatValue();
            }
            zRu.mZ = fMax;
            arrayList4.add(zRu);
            i12++;
        }
        ZRu(arrayList4, f10, arrayList2);
        List<ZRu> listZRu = aT.ZRu(f10, arrayList4);
        float f12 = 0.0f;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            f12 += listZRu.get(i13).ZRu;
            if (((Float) arrayList3.get(i13)).floatValue() != listZRu.get(i13).ZRu) {
                uR((com.bytedance.sdk.component.adexpress.dynamic.uR.FA) arrayList2.get(i13));
            }
        }
        int size3 = arrayList2.size();
        int i14 = 0;
        boolean z10 = false;
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                break;
            }
            Object obj3 = arrayList2.get(i15);
            i15++;
            i14++;
            if (!NOt((com.bytedance.sdk.component.adexpress.dynamic.uR.FA) obj3)) {
                z10 = false;
                break;
            }
            if (i14 == arrayList2.size()) {
                z10 = true;
            }
        }
        fMax = z10 ? f11 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
            com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa4 = (com.bytedance.sdk.component.adexpress.dynamic.uR.FA) arrayList2.get(i16);
            mZ mZVarMZ = mZ(fa4, listZRu.get(i16).ZRu, f11);
            if (!NOt(fa4)) {
                fMax = Math.max(fMax, mZVarMZ.NOt);
            }
            arrayList5.add(mZVarMZ);
        }
        ArrayList arrayList6 = new ArrayList();
        int size4 = arrayList5.size();
        int i17 = 0;
        while (i17 < size4) {
            Object obj4 = arrayList5.get(i17);
            i17++;
            arrayList6.add(Float.valueOf(((mZ) obj4).NOt));
        }
        if (!z10) {
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa5 = (com.bytedance.sdk.component.adexpress.dynamic.uR.FA) arrayList2.get(i18);
                if (NOt(fa5) && ((Float) arrayList6.get(i18)).floatValue() != fMax) {
                    uR(fa5);
                    mZ(fa5, listZRu.get(i18).ZRu, fMax);
                }
            }
        }
        mZVar.ZRu = f12;
        mZVar.NOt = fMax;
        return mZVar;
    }

    private boolean NOt(List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> list) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA>> listWMI;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().aT().TFq().Nb(), "flex")) {
                return true;
            }
        }
        while (true) {
            boolean z10 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2 : list) {
                if (TextUtils.equals(fa2.aT().TFq().Nb(), N.f218775c) && (listWMI = fa2.WMI()) != null) {
                    int i10 = 0;
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> list2 : listWMI) {
                        i10++;
                        if (!NOt(list2)) {
                            break;
                        }
                        if (i10 == list2.size()) {
                            z10 = true;
                        }
                    }
                }
            }
            return z10;
        }
    }

    private String TFq(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        return fa2.mZ();
    }

    private mZ NOt(List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> list, float f10, float f11) {
        mZ mZVarZRu = ZRu(list);
        if (mZVarZRu != null && (mZVarZRu.ZRu != 0.0f || mZVarZRu.NOt != 0.0f)) {
            return mZVarZRu;
        }
        mZ mZVarMZ = mZ(list, f10, f11);
        ZRu(list, mZVarMZ);
        return mZVarMZ;
    }

    private boolean NOt(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        if (fa2 == null) {
            return false;
        }
        if (TextUtils.equals(fa2.aT().TFq().fcs(), "flex")) {
            return true;
        }
        return mZ(fa2);
    }

    private mZ ZRu(String str, C0422NOt c0422NOt, boolean z10, boolean z11, int i10, com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        return ZH.ZRu(str, fa2.aT().NOt(), C0422NOt.ZRu(c0422NOt).toString(), z10, z11, i10, fa2, this.TFq, this.Ht, this.Mm, this.FA, this.Vor);
    }

    private void uR(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        this.ZRu.remove(TFq(fa2));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA>> listWMI = fa2.WMI();
        if (listWMI == null || listWMI.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA>> it = listWMI.iterator();
        while (it.hasNext()) {
            mZ(it.next());
        }
    }

    private void ZRu(List<List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA>> list, float f10, float f11) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA>> it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (ZRu(it.next(), false)) {
                z10 = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> list2 : list) {
            ZRu zRu = new ZRu();
            boolean zZRu = ZRu(list2, !z10);
            zRu.ZRu = zZRu ? 1.0f : NOt(list2, f10, f11).NOt;
            zRu.NOt = !zZRu;
            arrayList.add(zRu);
        }
        List<ZRu> listZRu = aT.ZRu(f11, arrayList);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((ZRu) arrayList.get(i10)).ZRu != listZRu.get(i10).ZRu) {
                List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> list3 = list.get(i10);
                mZ(list3);
                NOt(list3, f10, listZRu.get(i10).ZRu);
            }
        }
    }

    private String uR(List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String strMZ = list.get(i10).mZ();
            if (i10 < list.size() - 1) {
                sb2.append(strMZ);
                sb2.append(com.prism.gaia.download.a.f164606q);
            } else {
                sb2.append(strMZ);
            }
        }
        return sb2.toString();
    }

    private boolean ZRu(List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> list, boolean z10) {
        for (com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2 : list) {
            com.bytedance.sdk.component.adexpress.dynamic.uR.Ht htTFq = fa2.aT().TFq();
            String strFcs = htTFq.fcs();
            if (TextUtils.equals(strFcs, "flex") || (z10 && ((TextUtils.equals(htTFq.Nb(), "flex") && TextUtils.equals(htTFq.fcs(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.uR.TFq.ZRu.get(fa2.aT().NOt()).intValue() == 7) || TextUtils.equals(strFcs, "flex")))) {
                return true;
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> it = list.iterator();
        while (it.hasNext()) {
            if (mZ(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean mZ(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA>> listWMI;
        if (!fa2.qF() && TextUtils.equals(fa2.aT().TFq().fcs(), N.f218775c) && (listWMI = fa2.WMI()) != null && listWMI.size() > 0) {
            if (listWMI.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> it = listWMI.get(0).iterator();
                while (it.hasNext()) {
                    if (!NOt(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA>> it2 = listWMI.iterator();
            while (it2.hasNext()) {
                if (ZRu(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void ZRu(List<ZRu> list, float f10, List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> list2) {
        float f11 = 0.0f;
        for (ZRu zRu : list) {
            if (zRu.NOt) {
                f11 += zRu.ZRu;
            }
        }
        if (f11 > f10) {
            int i10 = 0;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (list.get(i11).NOt && list2.get(i11).xY()) {
                    i10++;
                }
            }
            if (i10 > 0) {
                float fCeil = (float) (Math.ceil(((f11 - f10) / i10) * 1000.0f) / 1000.0d);
                for (int i12 = 0; i12 < list2.size(); i12++) {
                    ZRu zRu2 = list.get(i12);
                    if (zRu2.NOt && list2.get(i12).xY()) {
                        zRu2.ZRu -= fCeil;
                    }
                }
            }
        }
    }

    private void mZ(List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.NOt.remove(uR(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> it = list.iterator();
        while (it.hasNext()) {
            uR(it.next());
        }
    }

    public void ZRu() {
        this.mZ.clear();
        this.ZRu.clear();
        this.NOt.clear();
    }

    public mZ ZRu(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        return this.ZRu.get(TFq(fa2));
    }

    public mZ ZRu(List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> list) {
        return this.NOt.get(uR(list));
    }

    private void ZRu(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2, mZ mZVar) {
        this.ZRu.put(TFq(fa2), mZVar);
    }

    private void ZRu(List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> list, mZ mZVar) {
        this.NOt.put(uR(list), mZVar);
    }
}
