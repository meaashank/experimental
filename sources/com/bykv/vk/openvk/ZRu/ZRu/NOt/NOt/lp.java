package com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class lp {
    private int Ht;
    private final int Mm;
    private int TFq = -1;
    private final ArrayList<ZRu> mZ;
    private final int uR;
    private static final Set<String> ZRu = new HashSet();
    private static final Set<String> NOt = new HashSet();

    public class ZRu {
        int NOt;
        final String ZRu;

        public ZRu(String str) {
            this.ZRu = str;
        }

        public void NOt() {
            lp.NOt.add(this.ZRu);
        }

        public void ZRu() {
            lp.ZRu.add(this.ZRu);
        }

        public String toString() {
            return this.ZRu;
        }
    }

    public lp(List<String> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("urls can't be empty");
        }
        int size = list.size();
        this.uR = size;
        this.mZ = new ArrayList<>(size);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (String str : list) {
            ZRu zRu = new ZRu(str);
            if (ZRu.contains(str)) {
                arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                arrayList2.add(zRu);
            } else if (NOt.contains(str)) {
                arrayList = arrayList == null ? new ArrayList() : arrayList;
                arrayList.add(zRu);
            } else {
                this.mZ.add(zRu);
            }
        }
        if (arrayList != null) {
            this.mZ.addAll(arrayList);
        }
        if (arrayList2 != null) {
            this.mZ.addAll(arrayList2);
        }
        Integer num = TFq.Vor;
        this.Mm = (num == null || num.intValue() <= 0) ? this.uR >= 2 ? 1 : 2 : num.intValue();
    }

    public ZRu NOt() {
        if (!ZRu()) {
            throw new NoSuchElementException();
        }
        int i10 = this.TFq + 1;
        if (i10 >= this.uR - 1) {
            this.TFq = -1;
            this.Ht++;
        } else {
            this.TFq = i10;
        }
        ZRu zRu = this.mZ.get(i10);
        zRu.NOt = (this.Ht * this.uR) + this.TFq;
        return zRu;
    }

    public boolean ZRu() {
        return this.Ht < this.Mm;
    }

    public lp(String str) {
        ArrayList<ZRu> arrayList = new ArrayList<>(1);
        this.mZ = arrayList;
        arrayList.add(new ZRu(str));
        this.uR = 1;
        this.Mm = 1;
    }
}
