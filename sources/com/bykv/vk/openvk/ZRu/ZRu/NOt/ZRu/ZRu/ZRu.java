package com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.ZRu;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu implements com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.NOt {
    private String ZRu = "video_reward_full";
    private String NOt = "video_brand";
    private String mZ = "video_splash";
    private String uR = "video_default";
    private String TFq = null;
    private String Ht = null;
    private String Mm = null;
    private String FA = null;
    private String Vor = null;

    private List<com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.ZRu> Ht() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.ZRu(new File(ZRu()).listFiles(), com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.mZ()));
        arrayList.add(new com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.ZRu(new File(NOt()).listFiles(), com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.NOt()));
        arrayList.add(new com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.ZRu(new File(TFq()).listFiles(), com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.uR()));
        arrayList.add(new com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.ZRu(new File(mZ()).listFiles(), com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.TFq()));
        return arrayList;
    }

    private Set<String> Mm() {
        HashSet hashSet = new HashSet();
        for (com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.ZRu zRu : com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.ZRu.ZRu.values()) {
            if (zRu != null && zRu.ZRu() != null) {
                com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVarZRu = zRu.ZRu();
                hashSet.add(com.bykv.vk.openvk.ZRu.ZRu.NOt.TFq.NOt.NOt(mZVarZRu.NOt(), mZVarZRu.edo()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.ZRu.ZRu.NOt.TFq.NOt.mZ(mZVarZRu.NOt(), mZVarZRu.edo()).getAbsolutePath());
            }
        }
        for (com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.NOt.NOt nOt : com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.NOt.mZ.ZRu.values()) {
            if (nOt != null && nOt.ZRu() != null) {
                com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVarZRu2 = nOt.ZRu();
                hashSet.add(com.bykv.vk.openvk.ZRu.ZRu.NOt.TFq.NOt.NOt(mZVarZRu2.NOt(), mZVarZRu2.edo()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.ZRu.ZRu.NOt.TFq.NOt.mZ(mZVarZRu2.NOt(), mZVarZRu2.edo()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.NOt
    public String NOt() {
        if (this.FA == null) {
            this.FA = this.TFq + File.separator + this.mZ;
            File file = new File(this.FA);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.FA;
    }

    public String TFq() {
        if (this.Mm == null) {
            this.Mm = this.TFq + File.separator + this.NOt;
            File file = new File(this.Mm);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.Mm;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.NOt
    public void ZRu(String str) {
        this.TFq = str;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.NOt
    public String mZ() {
        if (this.Vor == null) {
            this.Vor = this.TFq + File.separator + this.uR;
            File file = new File(this.Vor);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.Vor;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.NOt
    public synchronized void uR() {
        try {
            Set<String> setMm = null;
            for (com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.ZRu zRu : Ht()) {
                File[] fileArrZRu = zRu.ZRu();
                if (fileArrZRu != null && fileArrZRu.length >= zRu.NOt()) {
                    if (setMm == null) {
                        setMm = Mm();
                    }
                    int iNOt = zRu.NOt() - 2;
                    if (iNOt < 0) {
                        iNOt = 0;
                    }
                    ZRu(zRu.ZRu(), iNOt, setMm);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.NOt
    public String ZRu() {
        if (this.Ht == null) {
            this.Ht = this.TFq + File.separator + this.ZRu;
            File file = new File(this.Ht);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.Ht;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.NOt
    public long NOt(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar) {
        if (TextUtils.isEmpty(mZVar.NOt()) || TextUtils.isEmpty(mZVar.edo())) {
            return 0L;
        }
        return com.bykv.vk.openvk.ZRu.ZRu.NOt.TFq.NOt.ZRu(mZVar.NOt(), mZVar.edo());
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.NOt
    public boolean ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar) {
        if (TextUtils.isEmpty(mZVar.NOt()) || TextUtils.isEmpty(mZVar.edo())) {
            return false;
        }
        return new File(mZVar.NOt(), mZVar.edo()).exists();
    }

    private static void ZRu(File[] fileArr, int i10, Set<String> set) {
        if (i10 >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i10) {
                    List listAsList = Arrays.asList(fileArr);
                    Collections.sort(listAsList, new Comparator<File>() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.ZRu.ZRu.1
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
                        public int compare(File file, File file2) {
                            long jLastModified = file2.lastModified() - file.lastModified();
                            if (jLastModified == 0) {
                                return 0;
                            }
                            return jLastModified < 0 ? -1 : 1;
                        }
                    });
                    while (i10 < listAsList.size()) {
                        File file = (File) listAsList.get(i10);
                        if (set != null && !set.contains(file.getAbsolutePath())) {
                            ((File) listAsList.get(i10)).delete();
                        }
                        i10++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
