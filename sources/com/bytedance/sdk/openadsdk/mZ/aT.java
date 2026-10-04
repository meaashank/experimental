package com.bytedance.sdk.openadsdk.mZ;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.mZ.uR;
import com.bytedance.sdk.openadsdk.utils.WD;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class aT {
    protected IListenerManager Ht;
    private int WMI;
    private String ZH;
    private String edo;
    private String lp;
    private String oK;
    private FilterWord qF;
    private String sAl;
    private int yBV;
    public static FilterWord ZRu = new FilterWord("", "");
    public static int NOt = 1;
    public static int mZ = 2;
    public static int uR = 3;
    public static int TFq = 4;
    private final Set<mZ> Mm = new HashSet();
    private final Set<NOt> FA = new HashSet();
    private final Set<uR> Vor = new HashSet();
    private final Set<ZRu> aT = new HashSet();

    public interface NOt {
        void ZRu(int i10);
    }

    public interface ZRu {
        void ZRu(List<FilterWord> list);
    }

    public interface mZ {
        void ZRu(FilterWord filterWord);
    }

    public interface uR {
        void ZRu(String str);
    }

    private void aT() {
        Iterator<mZ> it = this.Mm.iterator();
        while (it.hasNext()) {
            it.next().ZRu(this.qF);
        }
    }

    public int FA() {
        return this.yBV;
    }

    public void Ht() {
        Iterator<NOt> it = this.FA.iterator();
        while (it.hasNext()) {
            it.next().ZRu(TFq);
        }
    }

    public String Mm() {
        return this.edo;
    }

    public void NOt(String str) {
        this.lp = str;
    }

    public void TFq() {
        Iterator<NOt> it = this.FA.iterator();
        while (it.hasNext()) {
            it.next().ZRu(mZ);
        }
    }

    public boolean Vor() {
        return this.yBV < this.WMI;
    }

    public boolean mZ() {
        FilterWord filterWord = this.qF;
        return (filterWord == null || filterWord.equals(ZRu)) ? false : true;
    }

    public void uR() {
        if (!mZ() && !TextUtils.isEmpty(this.edo)) {
            this.qF = new FilterWord("0:00", this.edo);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.qF);
        if (!TextUtils.isEmpty(this.ZH)) {
            if (TextUtils.isEmpty(this.edo)) {
                com.bytedance.sdk.openadsdk.mZ.NOt.ZRu().ZRu(this.ZH, arrayList, this.lp);
            } else {
                com.bytedance.sdk.openadsdk.mZ.NOt.ZRu().ZRu(this.ZH, arrayList, this.oK, this.edo, this.lp);
            }
        }
        if (!TextUtils.isEmpty(this.sAl)) {
            if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                TFq("onItemClickClosed");
            } else {
                uR.ZRu zRuTFq = com.bytedance.sdk.openadsdk.core.Vor.NOt().TFq(this.sAl);
                if (zRuTFq != null) {
                    zRuTFq.ZRu();
                    com.bytedance.sdk.openadsdk.core.Vor.NOt().Ht(this.sAl);
                }
            }
        }
        Iterator<NOt> it = this.FA.iterator();
        while (it.hasNext()) {
            it.next().ZRu(NOt);
        }
        ZRu(ZRu);
        mZ("");
    }

    public FilterWord NOt() {
        return this.qF;
    }

    public void ZRu() {
        this.Mm.clear();
        this.FA.clear();
        this.Vor.clear();
        this.aT.clear();
    }

    public void mZ(String str) {
        this.edo = str;
        Iterator<uR> it = this.Vor.iterator();
        while (it.hasNext()) {
            it.next().ZRu(this.edo);
        }
    }

    private void TFq(final String str) {
        WD.mZ(new com.bytedance.sdk.component.FA.FA("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.mZ.aT.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (TextUtils.isEmpty(aT.this.sAl)) {
                        return;
                    }
                    aT.this.ZRu(6).executeDisLikeClosedCallback(aT.this.sAl, str);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lp.ZRu("TTDislikeManager", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    public void ZRu(String str) {
        this.ZH = str;
    }

    public void ZRu(FilterWord filterWord) {
        this.qF = filterWord;
        aT();
    }

    public void ZRu(mZ mZVar) {
        this.Mm.add(mZVar);
    }

    public void ZRu(NOt nOt) {
        this.FA.add(nOt);
    }

    public void ZRu(uR uRVar) {
        this.Vor.add(uRVar);
    }

    public void ZRu(ZRu zRu) {
        this.aT.add(zRu);
    }

    public void ZRu(List<FilterWord> list) {
        Iterator<ZRu> it = this.aT.iterator();
        while (it.hasNext()) {
            it.next().ZRu(list);
        }
    }

    public IListenerManager ZRu(int i10) {
        if (this.Ht == null) {
            this.Ht = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.ZRu.ZRu().ZRu(i10));
        }
        return this.Ht;
    }

    public void uR(String str) {
        this.oK = str;
    }

    public static void ZRu(final int i10, final String str, final uR.ZRu zRu) {
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            WD.mZ(new com.bytedance.sdk.component.FA.FA("DislikeClosed_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.mZ.aT.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.ZRu ZRu2 = com.bytedance.sdk.openadsdk.multipro.aidl.ZRu.ZRu();
                    if (i10 != 6 || zRu == null) {
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.multipro.aidl.NOt.NOt nOt = new com.bytedance.sdk.openadsdk.multipro.aidl.NOt.NOt(str, zRu);
                        IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(ZRu2.ZRu(6));
                        if (iListenerManagerAsInterface != null) {
                            iListenerManagerAsInterface.registerDisLikeClosedListener(str, nOt);
                        }
                    } catch (RemoteException e10) {
                        com.bytedance.sdk.component.utils.lp.ZRu("TTDislikeManager", e10.getMessage());
                    }
                }
            }, 5);
        }
    }

    public static void ZRu(final int i10, final String str) {
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            WD.mZ(new com.bytedance.sdk.component.FA.FA("DislikeClosed_unregisterMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.mZ.aT.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.ZRu ZRu2 = com.bytedance.sdk.openadsdk.multipro.aidl.ZRu.ZRu();
                    if (i10 == 6) {
                        try {
                            IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(ZRu2.ZRu(6));
                            if (iListenerManagerAsInterface != null) {
                                iListenerManagerAsInterface.unregisterDisLikeClosedListener(str);
                            }
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }, 5);
        }
    }

    public void ZRu(int i10, int i11) {
        this.yBV = i10;
        this.WMI = i11;
    }
}
