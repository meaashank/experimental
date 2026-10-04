package com.bytedance.adsdk.ZRu.NOt.TFq;

import com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.FA;
import com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.Ht;
import com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.TFq;
import com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.Vor;
import com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.WMI;
import com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.ZH;
import com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.edo;
import com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.lp;
import com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.om;
import com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.qF;
import com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.sAl;
import com.bytedance.adsdk.ZRu.NOt.uR.mZ;
import com.bytedance.adsdk.ZRu.NOt.uR.uR;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ZRu.NOt.TFq.NOt$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ZRu;

        static {
            int[] iArr = new int[mZ.values().length];
            ZRu = iArr;
            try {
                iArr[mZ.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ZRu[mZ.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ZRu[mZ.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ZRu[mZ.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ZRu[mZ.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ZRu[mZ.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ZRu[mZ.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ZRu[mZ.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ZRu[mZ.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                ZRu[mZ.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                ZRu[mZ.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                ZRu[mZ.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                ZRu[mZ.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static Deque<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> NOt(List<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> list, String str, int i10) {
        LinkedList<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> linkedList = new LinkedList(list);
        int i11 = 5;
        while (i11 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.ZRu.NOt.NOt.ZRu zRu : linkedList) {
                if (!linkedList2.isEmpty() && mZ.ZRu(((com.bytedance.adsdk.ZRu.NOt.NOt.ZRu) linkedList2.peekLast()).ZRu()) && ((mZ) ((com.bytedance.adsdk.ZRu.NOt.NOt.ZRu) linkedList2.peekLast()).ZRu()).NOt() == i11) {
                    com.bytedance.adsdk.ZRu.NOt.NOt.ZRu zRu2 = (com.bytedance.adsdk.ZRu.NOt.NOt.ZRu) linkedList2.pollLast();
                    com.bytedance.adsdk.ZRu.NOt.NOt.ZRu zRu3 = (com.bytedance.adsdk.ZRu.NOt.NOt.ZRu) linkedList2.pollLast();
                    if (mZ.ZRu(zRu3.ZRu()) || mZ.ZRu(zRu.ZRu())) {
                        throw new IllegalArgumentException(str.substring(0, i10));
                    }
                    linkedList2.addLast(ZRu(zRu3, zRu2, zRu));
                } else {
                    linkedList2.addLast(zRu);
                }
            }
            i11--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    public static com.bytedance.adsdk.ZRu.NOt.NOt.ZRu ZRu(List<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> list, String str, int i10) {
        mZ(list, str, i10);
        Deque<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> dequeZRu = ZRu(NOt(list, str, i10));
        if (dequeZRu.size() == 1) {
            return dequeZRu.getFirst();
        }
        throw new IllegalStateException();
    }

    private static void mZ(List<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> list, String str, int i10) {
        Iterator<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> it = list.iterator();
        while (it.hasNext()) {
            if (uR.ZRu(it.next().ZRu())) {
                throw new IllegalArgumentException(str.substring(0, i10));
            }
        }
    }

    private static Deque<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> ZRu(Deque<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.ZRu.NOt.NOt.ZRu zRu : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.ZRu.NOt.NOt.ZRu) linkedList.peekLast()).ZRu() == mZ.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.ZRu.NOt.NOt.ZRu zRu2 = (com.bytedance.adsdk.ZRu.NOt.NOt.ZRu) linkedList.pollLast();
                if (((com.bytedance.adsdk.ZRu.NOt.NOt.ZRu) linkedList.pollLast()).ZRu() == mZ.QUESTION) {
                    com.bytedance.adsdk.ZRu.NOt.NOt.ZRu zRu3 = (com.bytedance.adsdk.ZRu.NOt.NOt.ZRu) linkedList.pollLast();
                    om omVar = new om();
                    omVar.ZRu(zRu3);
                    omVar.NOt(zRu2);
                    omVar.mZ(zRu);
                    linkedList.addLast(omVar);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                linkedList.addLast(zRu);
            }
        }
        return linkedList;
    }

    private static com.bytedance.adsdk.ZRu.NOt.NOt.ZRu ZRu(com.bytedance.adsdk.ZRu.NOt.NOt.ZRu zRu, com.bytedance.adsdk.ZRu.NOt.NOt.ZRu zRu2, com.bytedance.adsdk.ZRu.NOt.NOt.ZRu zRu3) {
        WMI zh;
        switch (AnonymousClass1.ZRu[((mZ) zRu2.ZRu()).ordinal()]) {
            case 1:
                zh = new ZH();
                break;
            case 2:
                zh = new qF();
                break;
            case 3:
                zh = new com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.ZRu();
                break;
            case 4:
                zh = new sAl();
                break;
            case 5:
                zh = new lp();
                break;
            case 6:
                zh = new com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.uR();
                break;
            case 7:
                zh = new edo();
                break;
            case 8:
                zh = new Ht();
                break;
            case 9:
                zh = new Vor();
                break;
            case 10:
                zh = new TFq();
                break;
            case 11:
                zh = new FA();
                break;
            case 12:
                zh = new com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.NOt();
                break;
            case 13:
                zh = new com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.mZ();
                break;
            default:
                throw new UnsupportedOperationException(zRu2.ZRu().toString());
        }
        zh.ZRu(zRu);
        zh.NOt(zRu3);
        return zh;
    }

    public static boolean ZRu(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
