package com.bytedance.sdk.component.adexpress.ZRu.NOt;

import android.text.TextUtils;
import android.util.Pair;
import androidx.compose.runtime.changelist.j;
import androidx.multidex.MultiDexExtractor;
import com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu;
import com.bytedance.sdk.component.utils.MR;
import com.bytedance.sdk.component.utils.lp;
import com.prism.commons.utils.C3843g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mZ {
    public List<ZRu.C0421ZRu> NOt(com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu, com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<ZRu.C0421ZRu> arrayList3 = new ArrayList<>();
        if (zRu2 == null || zRu2.Ht().isEmpty()) {
            arrayList2.addAll(zRu.Ht());
        } else if (zRu.Ht().isEmpty()) {
            arrayList.addAll(zRu2.Ht());
        } else {
            for (ZRu.C0421ZRu c0421ZRu : zRu.Ht()) {
                if (!zRu2.Ht().contains(c0421ZRu) && c0421ZRu != null && c0421ZRu.ZRu() != null && c0421ZRu.NOt() != null) {
                    arrayList2.add(c0421ZRu);
                }
            }
            for (ZRu.C0421ZRu c0421ZRu2 : zRu2.Ht()) {
                if (!zRu.Ht().contains(c0421ZRu2)) {
                    arrayList.add(c0421ZRu2);
                }
            }
        }
        if (ZRu(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public abstract File ZRu();

    public boolean ZRu(Map<String, com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu = map.get(it.next());
            if (zRu != null && !ZRu(zRu.Ht())) {
                return false;
            }
        }
        return true;
    }

    public void mZ(List<ZRu.C0421ZRu> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<ZRu.C0421ZRu> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(ZRu(), com.bytedance.sdk.component.utils.TFq.ZRu(it.next().ZRu()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public boolean ZRu(List<ZRu.C0421ZRu> list) {
        if (list == null || list.size() <= 0 || ZRu() == null) {
            return false;
        }
        for (ZRu.C0421ZRu c0421ZRu : list) {
            String strZRu = com.bytedance.sdk.component.utils.TFq.ZRu(c0421ZRu.ZRu());
            if (TextUtils.isEmpty(strZRu)) {
                return false;
            }
            File file = new File(ZRu(), strZRu);
            String strZRu2 = com.bytedance.sdk.component.utils.TFq.ZRu(file);
            if (!file.exists() || !file.isFile() || c0421ZRu.NOt() == null || !c0421ZRu.NOt().equals(strZRu2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean mZ(com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu, com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu2) {
        if (zRu != null) {
            try {
                if (!TextUtils.isEmpty(zRu.mZ())) {
                    if (zRu2 == null) {
                        return false;
                    }
                    if (ZRu(zRu.mZ(), zRu2.mZ())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu> mapZRu = zRu.ZRu();
                    Map<String, com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu> mapZRu2 = zRu2.ZRu();
                    if (mapZRu.isEmpty()) {
                        return !mapZRu2.isEmpty();
                    }
                    if (mapZRu2.isEmpty()) {
                        return false;
                    }
                    return ZRu(mapZRu, mapZRu2);
                }
            } catch (Throwable th) {
                th.getMessage();
                return false;
            }
        }
        return true;
    }

    public boolean ZRu(ZRu.NOt nOt) {
        if (nOt == null || ZRu() == null) {
            return false;
        }
        List<Pair<String, String>> listNOt = nOt.NOt();
        if (listNOt == null || listNOt.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = listNOt.iterator();
        while (it.hasNext()) {
            File file = new File(ZRu(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public void NOt(List<ZRu.C0421ZRu> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<ZRu.C0421ZRu> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(ZRu(), com.bytedance.sdk.component.utils.TFq.ZRu(it.next().ZRu()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public List<ZRu.C0421ZRu> ZRu(com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu, com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu2) {
        Map<String, com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu> mapZRu = zRu.ZRu();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<ZRu.C0421ZRu> arrayList3 = new ArrayList<>();
        if (mapZRu.size() == 0) {
            if (zRu2 != null && zRu2.ZRu().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu> mapZRu2 = zRu2.ZRu();
                Iterator<String> it = mapZRu2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu3 = mapZRu2.get(it.next());
                    if (zRu3 != null) {
                        arrayList.addAll(zRu3.Ht());
                    }
                }
            }
        } else if (zRu2 != null && zRu2.ZRu().size() != 0) {
            Map<String, com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu> mapZRu3 = zRu2.ZRu();
            for (String str : mapZRu.keySet()) {
                com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu4 = mapZRu.get(str);
                com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu5 = mapZRu3.get(str);
                if (zRu5 == null && zRu4 != null) {
                    arrayList2.addAll(zRu4.Ht());
                } else if (zRu4 == null && zRu5 != null) {
                    arrayList.addAll(zRu5.Ht());
                } else if (zRu4 != null) {
                    for (ZRu.C0421ZRu c0421ZRu : zRu4.Ht()) {
                        if (c0421ZRu != null && !zRu5.Ht().contains(c0421ZRu) && c0421ZRu.NOt() != null && c0421ZRu.ZRu() != null) {
                            arrayList2.add(c0421ZRu);
                        }
                    }
                    for (ZRu.C0421ZRu c0421ZRu2 : zRu5.Ht()) {
                        if (c0421ZRu2 != null && !zRu4.Ht().contains(c0421ZRu2)) {
                            arrayList.add(c0421ZRu2);
                        }
                    }
                }
            }
        } else if (mapZRu.size() != 0) {
            Iterator<String> it2 = mapZRu.keySet().iterator();
            while (it2.hasNext()) {
                com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu6 = mapZRu.get(it2.next());
                if (zRu6 != null) {
                    arrayList2.addAll(zRu6.Ht());
                }
            }
        }
        if (ZRu(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public static void NOt(File file, com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu, String str) {
        if (zRu == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (zRu.Ht() != null) {
            Iterator<ZRu.C0421ZRu> it = zRu.Ht().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.TFq.ZRu(it.next().ZRu())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private boolean ZRu(List<ZRu.C0421ZRu> list, List<ZRu.C0421ZRu> list2) {
        for (ZRu.C0421ZRu c0421ZRu : list) {
            String strZRu = c0421ZRu.ZRu();
            String strZRu2 = com.bytedance.sdk.component.utils.TFq.ZRu(strZRu);
            File file = new File(ZRu(), strZRu2);
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
            com.bytedance.sdk.component.Mm.NOt.ZRu zRuHt = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ().Ht();
            zRuHt.NOt(strZRu);
            zRuHt.ZRu(ZRu().getAbsolutePath(), strZRu2);
            com.bytedance.sdk.component.Mm.NOt nOtZRu = zRuHt.ZRu();
            list2.add(c0421ZRu);
            if (nOtZRu == null || !nOtZRu.Ht() || nOtZRu.TFq() == null || !nOtZRu.TFq().exists()) {
                mZ(list2);
                return false;
            }
        }
        return true;
    }

    public boolean ZRu(String str) {
        File file = new File(ZRu().getAbsoluteFile(), j.a(com.bytedance.sdk.component.utils.TFq.ZRu(str), MultiDexExtractor.f114845k));
        com.bytedance.sdk.component.Mm.NOt.ZRu zRuHt = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ().Ht();
        zRuHt.NOt(str);
        zRuHt.ZRu(file.getParent(), file.getName());
        com.bytedance.sdk.component.Mm.NOt nOtZRu = zRuHt.ZRu();
        if (nOtZRu.Ht() && nOtZRu.TFq() != null && nOtZRu.TFq().exists()) {
            File fileTFq = nOtZRu.TFq();
            try {
                MR.ZRu(fileTFq.getAbsolutePath(), file.getParent());
                if (!fileTFq.exists()) {
                    return true;
                }
                fileTFq.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void ZRu(int i10) {
        if (com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().uR() != null) {
            com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().uR().ZRu(i10);
        }
    }

    public static void ZRu(File file, com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu, String str) {
        FileOutputStream fileOutputStream;
        if (zRu == null) {
            return;
        }
        String strVor = zRu.Vor();
        if (TextUtils.isEmpty(strVor)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file3);
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileOutputStream.write(strVor.getBytes(C3843g.f162098b));
                if (file2.exists()) {
                    file2.delete();
                }
                file3.renameTo(file2);
                fileOutputStream.close();
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                try {
                    lp.ZRu("PlayComponentEngineCacheManager", "version save error3", th);
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                } catch (Throwable th3) {
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th3;
                }
            }
        } catch (IOException unused2) {
        }
    }

    private static boolean ZRu(Map<String, com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu> map, Map<String, com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu = map.get(str);
            if (zRu == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu2 = map2.get(str);
            if (zRu2 == null) {
                return false;
            }
            if (ZRu(zRu.mZ(), zRu2.mZ())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean ZRu(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "\\."
            java.lang.String[] r7 = r7.split(r0)
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r7.length
            int r1 = r6.length
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            r2 = r1
        L12:
            if (r2 >= r0) goto L42
            r3 = r7[r2]
            int r3 = r3.length()
            r4 = r6[r2]
            int r4 = r4.length()
            int r3 = r3 - r4
            r4 = 1
            if (r3 != 0) goto L3f
            r3 = r7[r2]
            r5 = r6[r2]
            int r3 = r3.compareTo(r5)
            if (r3 <= 0) goto L2f
            return r4
        L2f:
            if (r3 >= 0) goto L32
            return r1
        L32:
            int r3 = r0 + (-1)
            if (r2 != r3) goto L3c
            int r7 = r7.length
            int r6 = r6.length
            if (r7 <= r6) goto L3b
            return r4
        L3b:
            return r1
        L3c:
            int r2 = r2 + 1
            goto L12
        L3f:
            if (r3 <= 0) goto L42
            return r4
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.ZRu.NOt.mZ.ZRu(java.lang.String, java.lang.String):boolean");
    }

    @Deprecated
    public static boolean ZRu(com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu, String str) {
        if (zRu == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(zRu.mZ())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return ZRu(zRu.mZ(), str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
