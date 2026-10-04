package com.bytedance.adsdk.ugeno.TFq;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.activity.C1477d;
import androidx.appcompat.view.menu.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes2.dex */
class uR {
    static final /* synthetic */ boolean mZ = true;
    private long[] Ht;
    long[] NOt;
    private boolean[] TFq;
    int[] ZRu;
    private final com.bytedance.adsdk.ugeno.TFq.ZRu uR;

    public static class NOt implements Comparable<NOt> {
        int NOt;
        int ZRu;

        private NOt() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public int compareTo(NOt nOt) {
            int i10 = this.NOt;
            int i11 = nOt.NOt;
            return i10 != i11 ? i10 - i11 : this.ZRu - nOt.ZRu;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Order{order=");
            sb2.append(this.NOt);
            sb2.append(", index=");
            return C1477d.a(sb2, this.ZRu, '}');
        }
    }

    public static class ZRu {
        int NOt;
        List<mZ> ZRu;

        public void ZRu() {
            this.ZRu = null;
            this.NOt = 0;
        }
    }

    public uR(com.bytedance.adsdk.ugeno.TFq.ZRu zRu) {
        this.uR = zRu;
    }

    private int Ht(com.bytedance.adsdk.ugeno.TFq.NOt nOt, boolean z10) {
        return z10 ? nOt.yBV() : nOt.oK();
    }

    private int TFq(com.bytedance.adsdk.ugeno.TFq.NOt nOt, boolean z10) {
        return z10 ? nOt.edo() : nOt.sAl();
    }

    private int mZ(boolean z10) {
        return z10 ? this.uR.getPaddingTop() : this.uR.getPaddingStart();
    }

    private int uR(boolean z10) {
        return z10 ? this.uR.getPaddingBottom() : this.uR.getPaddingEnd();
    }

    public int NOt(long j10) {
        return (int) (j10 >> 32);
    }

    public int ZRu(long j10) {
        return (int) j10;
    }

    public long NOt(int i10, int i11) {
        return (((long) i10) & ZipKt.f225990j) | (((long) i11) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] ZRu(View view, int i10, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.uR.getFlexItemCount();
        List<NOt> listNOt = NOt(flexItemCount);
        NOt nOt = new NOt();
        if (view == null || !(layoutParams instanceof com.bytedance.adsdk.ugeno.TFq.NOt)) {
            nOt.NOt = 1;
        } else {
            nOt.NOt = ((com.bytedance.adsdk.ugeno.TFq.NOt) layoutParams).mZ();
        }
        if (i10 == -1 || i10 == flexItemCount || i10 >= this.uR.getFlexItemCount()) {
            nOt.ZRu = flexItemCount;
        } else {
            nOt.ZRu = i10;
            while (i10 < flexItemCount) {
                listNOt.get(i10).ZRu++;
                i10++;
            }
        }
        listNOt.add(nOt);
        return ZRu(flexItemCount + 1, listNOt, sparseIntArray);
    }

    private List<NOt> NOt(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            com.bytedance.adsdk.ugeno.TFq.NOt nOt = (com.bytedance.adsdk.ugeno.TFq.NOt) this.uR.ZRu(i11).getLayoutParams();
            NOt nOt2 = new NOt();
            nOt2.NOt = nOt.mZ();
            nOt2.ZRu = i11;
            arrayList.add(nOt2);
        }
        return arrayList;
    }

    private int mZ(com.bytedance.adsdk.ugeno.TFq.NOt nOt, boolean z10) {
        if (z10) {
            return nOt.sAl();
        }
        return nOt.edo();
    }

    private int uR(com.bytedance.adsdk.ugeno.TFq.NOt nOt, boolean z10) {
        if (z10) {
            return nOt.oK();
        }
        return nOt.yBV();
    }

    private void mZ(int i10) {
        boolean[] zArr = this.TFq;
        if (zArr == null) {
            this.TFq = new boolean[Math.max(i10, 10)];
        } else if (zArr.length < i10) {
            this.TFq = new boolean[Math.max(zArr.length * 2, i10)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    public boolean NOt(SparseIntArray sparseIntArray) {
        int flexItemCount = this.uR.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i10 = 0; i10 < flexItemCount; i10++) {
            View viewZRu = this.uR.ZRu(i10);
            if (viewZRu != null && ((com.bytedance.adsdk.ugeno.TFq.NOt) viewZRu.getLayoutParams()).mZ() != sparseIntArray.get(i10)) {
                return true;
            }
        }
        return false;
    }

    public void NOt(ZRu zRu, int i10, int i11) {
        ZRu(zRu, i11, i10, Integer.MAX_VALUE, 0, -1, (List<mZ>) null);
    }

    private int NOt(boolean z10) {
        if (z10) {
            return this.uR.getPaddingEnd();
        }
        return this.uR.getPaddingBottom();
    }

    public int[] ZRu(SparseIntArray sparseIntArray) {
        int flexItemCount = this.uR.getFlexItemCount();
        return ZRu(flexItemCount, NOt(flexItemCount), sparseIntArray);
    }

    private int NOt(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int[] ZRu(int i10, List<NOt> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        int i11 = 0;
        for (NOt nOt : list) {
            int i12 = nOt.ZRu;
            iArr[i11] = i12;
            sparseIntArray.append(i12, nOt.NOt);
            i11++;
        }
        return iArr;
    }

    private int NOt(com.bytedance.adsdk.ugeno.TFq.NOt nOt, boolean z10) {
        if (z10) {
            return nOt.NOt();
        }
        return nOt.ZRu();
    }

    private void NOt(int i10, int i11, mZ mZVar, int i12, int i13, boolean z10) {
        float f10;
        float f11;
        int iMax;
        int iMm;
        int i14 = mZVar.TFq;
        float f12 = mZVar.ZH;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i12 > i14) {
            return;
        }
        float f14 = (i14 - i12) / f12;
        mZVar.TFq = i13 + mZVar.Ht;
        if (!z10) {
            mZVar.Mm = Integer.MIN_VALUE;
        }
        int i15 = 0;
        boolean z11 = false;
        int i16 = 0;
        float f15 = 0.0f;
        while (i15 < mZVar.FA) {
            int i17 = mZVar.oK + i15;
            View viewNOt = this.uR.NOt(i17);
            if (viewNOt == null || viewNOt.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
            } else {
                com.bytedance.adsdk.ugeno.TFq.NOt nOt = (com.bytedance.adsdk.ugeno.TFq.NOt) viewNOt.getLayoutParams();
                int flexDirection = this.uR.getFlexDirection();
                f10 = f13;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewNOt.getMeasuredHeight();
                    long[] jArr = this.Ht;
                    if (jArr != null) {
                        measuredHeight = NOt(jArr[i17]);
                    }
                    int measuredWidth = viewNOt.getMeasuredWidth();
                    long[] jArr2 = this.Ht;
                    if (jArr2 != null) {
                        measuredWidth = ZRu(jArr2[i17]);
                    }
                    if (!this.TFq[i17] && nOt.TFq() > f10) {
                        float fTFq = measuredHeight - (nOt.TFq() * f14);
                        if (i15 == mZVar.FA - 1) {
                            fTFq += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(fTFq);
                        if (iRound < nOt.FA()) {
                            iRound = nOt.FA();
                            this.TFq[i17] = true;
                            mZVar.ZH -= nOt.TFq();
                            z11 = true;
                        } else {
                            float f16 = (fTFq - iRound) + f15;
                            double d10 = f16;
                            if (d10 > 1.0d) {
                                iRound++;
                                f16 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                iRound--;
                                f16 += 1.0f;
                            }
                            f15 = f16;
                        }
                        int iZRu = ZRu(i10, nOt, mZVar.sAl);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewNOt.measure(iZRu, iMakeMeasureSpec);
                        int measuredWidth2 = viewNOt.getMeasuredWidth();
                        int measuredHeight2 = viewNOt.getMeasuredHeight();
                        ZRu(i17, iZRu, iMakeMeasureSpec, viewNOt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i16, nOt.oK() + nOt.sAl() + measuredWidth + this.uR.ZRu(viewNOt));
                    mZVar.TFq = nOt.yBV() + nOt.edo() + measuredHeight + mZVar.TFq;
                    f11 = f14;
                } else {
                    int measuredWidth3 = viewNOt.getMeasuredWidth();
                    long[] jArr3 = this.Ht;
                    if (jArr3 != null) {
                        measuredWidth3 = ZRu(jArr3[i17]);
                    }
                    int measuredHeight3 = viewNOt.getMeasuredHeight();
                    long[] jArr4 = this.Ht;
                    f11 = f14;
                    if (jArr4 != null) {
                        measuredHeight3 = NOt(jArr4[i17]);
                    }
                    if (!this.TFq[i17] && nOt.TFq() > f10) {
                        float fTFq2 = measuredWidth3 - (nOt.TFq() * f11);
                        if (i15 == mZVar.FA - 1) {
                            fTFq2 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(fTFq2);
                        if (iRound2 < nOt.Mm()) {
                            iMm = nOt.Mm();
                            this.TFq[i17] = true;
                            mZVar.ZH -= nOt.TFq();
                            z11 = true;
                        } else {
                            float f17 = (fTFq2 - iRound2) + f15;
                            double d11 = f17;
                            if (d11 > 1.0d) {
                                iMm = iRound2 + 1;
                                f17 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                iMm = iRound2 - 1;
                                f17 += 1.0f;
                            } else {
                                iMm = iRound2;
                            }
                            f15 = f17;
                        }
                        int iNOt = NOt(i11, nOt, mZVar.sAl);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMm, 1073741824);
                        viewNOt.measure(iMakeMeasureSpec2, iNOt);
                        int measuredWidth4 = viewNOt.getMeasuredWidth();
                        int measuredHeight4 = viewNOt.getMeasuredHeight();
                        ZRu(i17, iMakeMeasureSpec2, iNOt, viewNOt);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i16, nOt.yBV() + nOt.edo() + measuredHeight3 + this.uR.ZRu(viewNOt));
                    mZVar.TFq = nOt.oK() + nOt.sAl() + measuredWidth3 + mZVar.TFq;
                    iMax = iMax2;
                }
                mZVar.Mm = Math.max(mZVar.Mm, iMax);
                i16 = iMax;
            }
            i15++;
            f14 = f11;
            f13 = f10;
        }
        if (!z11 || i14 == mZVar.TFq) {
            return;
        }
        NOt(i10, i11, mZVar, i12, i13, true);
    }

    public void ZRu(ZRu zRu, int i10, int i11) {
        ZRu(zRu, i10, i11, Integer.MAX_VALUE, 0, -1, (List<mZ>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void ZRu(ZRu zRu, int i10, int i11, int i12, int i13, int i14, List<mZ> list) {
        int i15;
        ZRu zRu2;
        boolean z10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iZRu;
        int i21;
        int i22;
        int i23;
        mZ mZVar;
        int i24;
        int i25;
        boolean z11;
        int i26;
        int i27;
        int i28 = i10;
        boolean zZRu = this.uR.ZRu();
        int mode = View.MeasureSpec.getMode(i28);
        int size = View.MeasureSpec.getSize(i28);
        List<mZ> arrayList = list == null ? new ArrayList() : list;
        zRu.ZRu = arrayList;
        boolean z12 = i14 == -1;
        int iZRu2 = ZRu(zZRu);
        int iNOt = NOt(zZRu);
        int iMZ = mZ(zZRu);
        int iUR = uR(zZRu);
        mZ mZVar2 = new mZ();
        int i29 = i13;
        mZVar2.oK = i29;
        int i30 = iZRu2 + iNOt;
        mZVar2.TFq = i30;
        int flexItemCount = this.uR.getFlexItemCount();
        boolean z13 = z12;
        mZ mZVar3 = mZVar2;
        int i31 = Integer.MIN_VALUE;
        int i32 = 0;
        int iCombineMeasuredStates = 0;
        int i33 = 0;
        while (true) {
            if (i29 >= flexItemCount) {
                i15 = iCombineMeasuredStates;
                zRu2 = zRu;
                break;
            }
            View viewNOt = this.uR.NOt(i29);
            if (viewNOt == null) {
                if (ZRu(i29, flexItemCount, mZVar3)) {
                    ZRu(arrayList, mZVar3, i29, i32);
                }
                i16 = i30;
                z10 = true;
            } else {
                z10 = true;
                i16 = i30;
                if (viewNOt.getVisibility() == 8) {
                    mZVar3.Vor++;
                    mZVar3.FA++;
                    if (ZRu(i29, flexItemCount, mZVar3)) {
                        ZRu(arrayList, mZVar3, i29, i32);
                    }
                } else {
                    if (viewNOt instanceof CompoundButton) {
                        ZRu((CompoundButton) viewNOt);
                    }
                    com.bytedance.adsdk.ugeno.TFq.NOt nOt = (com.bytedance.adsdk.ugeno.TFq.NOt) viewNOt.getLayoutParams();
                    int i34 = flexItemCount;
                    if (nOt.Ht() == 4) {
                        mZVar3.edo.add(Integer.valueOf(i29));
                    }
                    int iZRu3 = ZRu(nOt, zZRu);
                    if (nOt.lp() != -1.0f && mode == 1073741824) {
                        iZRu3 = Math.round(nOt.lp() * size);
                    }
                    if (zZRu) {
                        i18 = mode;
                        iZRu = this.uR.ZRu(i28, i16 + mZ(nOt, true) + uR(nOt, true), iZRu3);
                        i17 = size;
                        i19 = i32;
                        int iNOt2 = this.uR.NOt(i11, iMZ + iUR + TFq(nOt, true) + Ht(nOt, true) + i32, NOt(nOt, true));
                        viewNOt.measure(iZRu, iNOt2);
                        ZRu(i29, iZRu, iNOt2, viewNOt);
                        i20 = 0;
                    } else {
                        i17 = size;
                        i18 = mode;
                        i19 = i32;
                        i20 = 0;
                        int iZRu4 = this.uR.ZRu(i11, iMZ + iUR + TFq(nOt, false) + Ht(nOt, false) + i19, NOt(nOt, false));
                        int iNOt3 = this.uR.NOt(i28, i16 + mZ(nOt, false) + uR(nOt, false), iZRu3);
                        viewNOt.measure(iZRu4, iNOt3);
                        ZRu(i29, iZRu4, iNOt3, viewNOt);
                        iZRu = iNOt3;
                    }
                    ZRu(viewNOt, i29);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewNOt.getMeasuredState());
                    int i35 = i20;
                    i21 = i29;
                    int i36 = iZRu;
                    mZ mZVar4 = mZVar3;
                    int i37 = i33;
                    i22 = i16;
                    i23 = i19;
                    boolean z14 = zZRu;
                    size = i17;
                    if (ZRu(viewNOt, i18, size, mZVar3.TFq, ZRu(viewNOt, zZRu) + mZ(nOt, zZRu) + uR(nOt, zZRu), nOt, i21, i37, arrayList.size())) {
                        if (mZVar4.NOt() > 0) {
                            ZRu(arrayList, mZVar4, i21 > 0 ? i21 - 1 : i35, i23);
                            i27 = i23 + mZVar4.Mm;
                        } else {
                            i27 = i23;
                        }
                        if (z14) {
                            if (nOt.NOt() == -1) {
                                com.bytedance.adsdk.ugeno.TFq.ZRu zRu3 = this.uR;
                                viewNOt.measure(i36, zRu3.NOt(i11, nOt.yBV() + nOt.edo() + zRu3.getPaddingTop() + this.uR.getPaddingBottom() + i27, nOt.NOt()));
                                ZRu(viewNOt, i21);
                            }
                        } else if (nOt.ZRu() == -1) {
                            com.bytedance.adsdk.ugeno.TFq.ZRu zRu4 = this.uR;
                            viewNOt.measure(zRu4.ZRu(i11, nOt.oK() + nOt.sAl() + zRu4.getPaddingLeft() + this.uR.getPaddingRight() + i27, nOt.ZRu()), i36);
                            ZRu(viewNOt, i21);
                        }
                        mZ mZVar5 = new mZ();
                        mZVar5.FA = 1;
                        mZVar5.TFq = i22;
                        mZVar5.oK = i21;
                        i23 = i27;
                        i24 = i35;
                        mZVar = mZVar5;
                        i25 = Integer.MIN_VALUE;
                    } else {
                        mZVar = mZVar4;
                        mZVar.FA++;
                        i24 = i37 + 1;
                        i25 = i31;
                    }
                    mZVar.WMI = (mZVar.WMI ? 1 : 0) | (nOt.uR() != 0.0f ? 1 : i35);
                    mZVar.qF = (mZVar.qF ? 1 : 0) | (nOt.TFq() != 0.0f ? 1 : i35);
                    int[] iArr = this.ZRu;
                    if (iArr != null) {
                        iArr[i21] = arrayList.size();
                    }
                    z11 = z14;
                    mZVar.TFq = ZRu(viewNOt, z11) + mZ(nOt, z11) + uR(nOt, z11) + mZVar.TFq;
                    mZVar.aT = nOt.uR() + mZVar.aT;
                    mZVar.ZH = nOt.TFq() + mZVar.ZH;
                    this.uR.ZRu(viewNOt, i21, i24, mZVar);
                    int iMax = Math.max(i25, NOt(viewNOt, z11) + TFq(nOt, z11) + Ht(nOt, z11) + this.uR.ZRu(viewNOt));
                    mZVar.Mm = Math.max(mZVar.Mm, iMax);
                    if (z11) {
                        if (this.uR.getFlexWrap() != 2) {
                            mZVar.lp = Math.max(mZVar.lp, nOt.edo() + viewNOt.getBaseline());
                        } else {
                            mZVar.lp = Math.max(mZVar.lp, nOt.yBV() + (viewNOt.getMeasuredHeight() - viewNOt.getBaseline()));
                        }
                    }
                    i26 = i34;
                    if (ZRu(i21, i26, mZVar)) {
                        ZRu(arrayList, mZVar, i21, i23);
                        i23 += mZVar.Mm;
                    }
                    if (i14 != -1 && arrayList.size() > 0) {
                        if (((mZ) d.a(arrayList, 1)).yBV >= i14 && i21 >= i14 && !z13) {
                            i23 = -mZVar.ZRu();
                            z13 = true;
                        }
                    }
                    if (i23 > i12 && z13) {
                        zRu2 = zRu;
                        i15 = iCombineMeasuredStates;
                        break;
                    }
                    i31 = iMax;
                    i33 = i24;
                    int i38 = i21 + 1;
                    zZRu = z11;
                    mZVar3 = mZVar;
                    i30 = i22;
                    i32 = i23;
                    i28 = i10;
                    flexItemCount = i26;
                    i29 = i38;
                    mode = i18;
                }
            }
            i21 = i29;
            i18 = mode;
            i26 = flexItemCount;
            i23 = i32;
            z11 = zZRu;
            i22 = i16;
            mZVar = mZVar3;
            int i382 = i21 + 1;
            zZRu = z11;
            mZVar3 = mZVar;
            i30 = i22;
            i32 = i23;
            i28 = i10;
            flexItemCount = i26;
            i29 = i382;
            mode = i18;
        }
        zRu2.NOt = i15;
    }

    private int NOt(int i10, com.bytedance.adsdk.ugeno.TFq.NOt nOt, int i11) {
        com.bytedance.adsdk.ugeno.TFq.ZRu zRu = this.uR;
        int iNOt = zRu.NOt(i10, nOt.yBV() + nOt.edo() + zRu.getPaddingTop() + this.uR.getPaddingBottom() + i11, nOt.NOt());
        int size = View.MeasureSpec.getSize(iNOt);
        if (size > nOt.aT()) {
            return View.MeasureSpec.makeMeasureSpec(nOt.aT(), View.MeasureSpec.getMode(iNOt));
        }
        return size < nOt.FA() ? View.MeasureSpec.makeMeasureSpec(nOt.FA(), View.MeasureSpec.getMode(iNOt)) : iNOt;
    }

    public void NOt(int i10, int i11, int i12) {
        int mode;
        int size;
        int flexDirection = this.uR.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
        } else {
            int mode2 = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            mode = mode2;
            size = size2;
        }
        List<mZ> flexLinesInternal = this.uR.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.uR.getSumOfCrossSize() + i12;
            int i13 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).Mm = size - i12;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.uR.getAlignContent();
                if (alignContent == 1) {
                    int i14 = size - sumOfCrossSize;
                    mZ mZVar = new mZ();
                    mZVar.Mm = i14;
                    flexLinesInternal.add(0, mZVar);
                    return;
                }
                if (alignContent == 2) {
                    this.uR.setFlexLines(ZRu(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < size) {
                        float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size4 = flexLinesInternal.size();
                        float f10 = 0.0f;
                        while (i13 < size4) {
                            arrayList.add(flexLinesInternal.get(i13));
                            if (i13 != flexLinesInternal.size() - 1) {
                                mZ mZVar2 = new mZ();
                                if (i13 == flexLinesInternal.size() - 2) {
                                    mZVar2.Mm = Math.round(f10 + size3);
                                    f10 = 0.0f;
                                } else {
                                    mZVar2.Mm = Math.round(size3);
                                }
                                int i15 = mZVar2.Mm;
                                float f11 = (size3 - i15) + f10;
                                if (f11 > 1.0f) {
                                    mZVar2.Mm = i15 + 1;
                                    f11 -= 1.0f;
                                } else if (f11 < -1.0f) {
                                    mZVar2.Mm = i15 - 1;
                                    f11 += 1.0f;
                                }
                                f10 = f11;
                                arrayList.add(mZVar2);
                            }
                            i13++;
                        }
                        this.uR.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.uR.setFlexLines(ZRu(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    mZ mZVar3 = new mZ();
                    mZVar3.Mm = size5;
                    for (mZ mZVar4 : flexLinesInternal) {
                        arrayList2.add(mZVar3);
                        arrayList2.add(mZVar4);
                        arrayList2.add(mZVar3);
                    }
                    this.uR.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f12 = 0.0f;
                    while (i13 < size7) {
                        mZ mZVar5 = flexLinesInternal.get(i13);
                        float f13 = mZVar5.Mm + size6;
                        if (i13 == flexLinesInternal.size() - 1) {
                            f13 += f12;
                            f12 = 0.0f;
                        }
                        int iRound = Math.round(f13);
                        float f14 = (f13 - iRound) + f12;
                        if (f14 > 1.0f) {
                            iRound++;
                            f14 -= 1.0f;
                        } else if (f14 < -1.0f) {
                            iRound--;
                            f14 += 1.0f;
                        }
                        f12 = f14;
                        mZVar5.Mm = iRound;
                        i13++;
                    }
                }
            }
        }
    }

    private void ZRu(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.TFq.NOt nOt = (com.bytedance.adsdk.ugeno.TFq.NOt) compoundButton.getLayoutParams();
        int iMm = nOt.Mm();
        int iFA = nOt.FA();
        Drawable drawableZRu = com.bytedance.adsdk.ugeno.Mm.TFq.ZRu(compoundButton);
        int minimumWidth = drawableZRu == null ? 0 : drawableZRu.getMinimumWidth();
        int minimumHeight = drawableZRu != null ? drawableZRu.getMinimumHeight() : 0;
        if (iMm == -1) {
            iMm = minimumWidth;
        }
        nOt.ZRu(iMm);
        if (iFA == -1) {
            iFA = minimumHeight;
        }
        nOt.NOt(iFA);
    }

    private void NOt(View view, int i10, int i11) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.TFq.NOt nOt = (com.bytedance.adsdk.ugeno.TFq.NOt) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - nOt.sAl()) - nOt.oK()) - this.uR.ZRu(view), nOt.Mm()), nOt.Vor());
        long[] jArr = this.Ht;
        if (jArr != null) {
            measuredHeight = NOt(jArr[i11]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        ZRu(i11, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    private int ZRu(boolean z10) {
        if (z10) {
            return this.uR.getPaddingStart();
        }
        return this.uR.getPaddingTop();
    }

    private int ZRu(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private int ZRu(com.bytedance.adsdk.ugeno.TFq.NOt nOt, boolean z10) {
        if (z10) {
            return nOt.ZRu();
        }
        return nOt.NOt();
    }

    private boolean ZRu(View view, int i10, int i11, int i12, int i13, com.bytedance.adsdk.ugeno.TFq.NOt nOt, int i14, int i15, int i16) {
        if (this.uR.getFlexWrap() == 0) {
            return false;
        }
        if (nOt.ZH()) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int maxLine = this.uR.getMaxLine();
        if (maxLine != -1 && maxLine <= i16 + 1) {
            return false;
        }
        int iZRu = this.uR.ZRu(view, i14, i15);
        if (iZRu > 0) {
            i13 += iZRu;
        }
        return i11 < i12 + i13;
    }

    private boolean ZRu(int i10, int i11, mZ mZVar) {
        return i10 == i11 - 1 && mZVar.NOt() != 0;
    }

    private void ZRu(List<mZ> list, mZ mZVar, int i10, int i11) {
        mZVar.sAl = i11;
        this.uR.ZRu(mZVar);
        mZVar.yBV = i10;
        list.add(mZVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void ZRu(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.bytedance.adsdk.ugeno.TFq.NOt r0 = (com.bytedance.adsdk.ugeno.TFq.NOt) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.Mm()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.Mm()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.Vor()
            if (r1 <= r3) goto L26
            int r1 = r0.Vor()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.FA()
            if (r2 >= r5) goto L32
            int r2 = r0.FA()
            goto L3e
        L32:
            int r5 = r0.aT()
            if (r2 <= r5) goto L3d
            int r2 = r0.aT()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L50
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.ZRu(r8, r1, r0, r7)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.TFq.uR.ZRu(android.view.View, int):void");
    }

    public void ZRu(int i10, int i11) {
        ZRu(i10, i11, 0);
    }

    public void ZRu(int i10, int i11, int i12) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i13;
        int i14;
        mZ(this.uR.getFlexItemCount());
        if (i12 >= this.uR.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.uR.getFlexDirection();
        int flexDirection2 = this.uR.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int largestMainSize = this.uR.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.uR.getPaddingLeft();
            paddingRight = this.uR.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                size = this.uR.getLargestMainSize();
            }
            paddingLeft = this.uR.getPaddingTop();
            paddingRight = this.uR.getPaddingBottom();
        }
        int i15 = paddingLeft + paddingRight;
        int i16 = size;
        int[] iArr = this.ZRu;
        int i17 = iArr != null ? iArr[i12] : 0;
        List<mZ> flexLinesInternal = this.uR.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i17 < size2) {
            mZ mZVar = flexLinesInternal.get(i17);
            int i18 = mZVar.TFq;
            if (i18 < i16 && mZVar.WMI) {
                i13 = i10;
                i14 = i11;
                ZRu(i13, i14, mZVar, i16, i15, false);
            } else {
                i13 = i10;
                i14 = i11;
                if (i18 > i16 && mZVar.qF) {
                    NOt(i13, i14, mZVar, i16, i15, false);
                }
            }
            i17++;
            i10 = i13;
            i11 = i14;
        }
    }

    private void ZRu(int i10, int i11, mZ mZVar, int i12, int i13, boolean z10) {
        int i14;
        float f10;
        float f11;
        int iMax;
        double d10;
        double d11;
        float f12 = mZVar.aT;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i12 < (i14 = mZVar.TFq)) {
            return;
        }
        float f14 = (i12 - i14) / f12;
        mZVar.TFq = i13 + mZVar.Ht;
        if (!z10) {
            mZVar.Mm = Integer.MIN_VALUE;
        }
        int i15 = 0;
        boolean z11 = false;
        int i16 = 0;
        float f15 = 0.0f;
        while (i15 < mZVar.FA) {
            int i17 = mZVar.oK + i15;
            View viewNOt = this.uR.NOt(i17);
            if (viewNOt == null || viewNOt.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
                z11 = z11;
            } else {
                com.bytedance.adsdk.ugeno.TFq.NOt nOt = (com.bytedance.adsdk.ugeno.TFq.NOt) viewNOt.getLayoutParams();
                int flexDirection = this.uR.getFlexDirection();
                f10 = f13;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewNOt.getMeasuredHeight();
                    long[] jArr = this.Ht;
                    if (jArr != null) {
                        measuredHeight = NOt(jArr[i17]);
                    }
                    int measuredWidth = viewNOt.getMeasuredWidth();
                    long[] jArr2 = this.Ht;
                    f11 = f14;
                    boolean z12 = z11;
                    if (jArr2 != null) {
                        measuredWidth = ZRu(jArr2[i17]);
                    }
                    if (this.TFq[i17] || nOt.uR() <= f10) {
                        z11 = z12;
                    } else {
                        float fUR = (nOt.uR() * f11) + measuredHeight;
                        if (i15 == mZVar.FA - 1) {
                            fUR += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(fUR);
                        if (iRound > nOt.aT()) {
                            iRound = nOt.aT();
                            this.TFq[i17] = true;
                            mZVar.aT -= nOt.uR();
                            z11 = true;
                        } else {
                            float f16 = (fUR - iRound) + f15;
                            double d12 = f16;
                            if (d12 > 1.0d) {
                                iRound++;
                                d11 = d12 - 1.0d;
                            } else {
                                if (d12 < -1.0d) {
                                    iRound--;
                                    d11 = d12 + 1.0d;
                                }
                                f15 = f16;
                                z11 = z12;
                            }
                            f16 = (float) d11;
                            f15 = f16;
                            z11 = z12;
                        }
                        int iZRu = ZRu(i10, nOt, mZVar.sAl);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewNOt.measure(iZRu, iMakeMeasureSpec);
                        int measuredWidth2 = viewNOt.getMeasuredWidth();
                        int measuredHeight2 = viewNOt.getMeasuredHeight();
                        ZRu(i17, iZRu, iMakeMeasureSpec, viewNOt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i16, nOt.oK() + nOt.sAl() + measuredWidth + this.uR.ZRu(viewNOt));
                    mZVar.TFq = nOt.yBV() + nOt.edo() + measuredHeight + mZVar.TFq;
                } else {
                    f11 = f14;
                    boolean z13 = z11;
                    int measuredWidth3 = viewNOt.getMeasuredWidth();
                    long[] jArr3 = this.Ht;
                    if (jArr3 != null) {
                        measuredWidth3 = ZRu(jArr3[i17]);
                    }
                    int measuredHeight3 = viewNOt.getMeasuredHeight();
                    long[] jArr4 = this.Ht;
                    if (jArr4 != null) {
                        measuredHeight3 = NOt(jArr4[i17]);
                    }
                    if (this.TFq[i17] || nOt.uR() <= f10) {
                        z11 = z13;
                    } else {
                        float fUR2 = (nOt.uR() * f11) + measuredWidth3;
                        if (i15 == mZVar.FA - 1) {
                            fUR2 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(fUR2);
                        if (iRound2 > nOt.Vor()) {
                            iRound2 = nOt.Vor();
                            this.TFq[i17] = true;
                            mZVar.aT -= nOt.uR();
                            z11 = true;
                        } else {
                            float f17 = (fUR2 - iRound2) + f15;
                            double d13 = f17;
                            if (d13 > 1.0d) {
                                iRound2++;
                                d10 = d13 - 1.0d;
                            } else {
                                if (d13 < -1.0d) {
                                    iRound2--;
                                    d10 = d13 + 1.0d;
                                }
                                f15 = f17;
                                z11 = z13;
                            }
                            f17 = (float) d10;
                            f15 = f17;
                            z11 = z13;
                        }
                        int iNOt = NOt(i11, nOt, mZVar.sAl);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewNOt.measure(iMakeMeasureSpec2, iNOt);
                        int measuredWidth4 = viewNOt.getMeasuredWidth();
                        int measuredHeight4 = viewNOt.getMeasuredHeight();
                        ZRu(i17, iMakeMeasureSpec2, iNOt, viewNOt);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i16, nOt.yBV() + nOt.edo() + measuredHeight3 + this.uR.ZRu(viewNOt));
                    mZVar.TFq = nOt.oK() + nOt.sAl() + measuredWidth3 + mZVar.TFq;
                    iMax = iMax2;
                }
                mZVar.Mm = Math.max(mZVar.Mm, iMax);
                i16 = iMax;
            }
            i15++;
            f14 = f11;
            f13 = f10;
        }
        if (!z11 || i14 == mZVar.TFq) {
            return;
        }
        ZRu(i10, i11, mZVar, i12, i13, true);
    }

    private int ZRu(int i10, com.bytedance.adsdk.ugeno.TFq.NOt nOt, int i11) {
        com.bytedance.adsdk.ugeno.TFq.ZRu zRu = this.uR;
        int iZRu = zRu.ZRu(i10, nOt.oK() + nOt.sAl() + zRu.getPaddingLeft() + this.uR.getPaddingRight() + i11, nOt.ZRu());
        int size = View.MeasureSpec.getSize(iZRu);
        if (size > nOt.Vor()) {
            return View.MeasureSpec.makeMeasureSpec(nOt.Vor(), View.MeasureSpec.getMode(iZRu));
        }
        return size < nOt.Mm() ? View.MeasureSpec.makeMeasureSpec(nOt.Mm(), View.MeasureSpec.getMode(iZRu)) : iZRu;
    }

    private List<mZ> ZRu(List<mZ> list, int i10, int i11) {
        int i12 = (i10 - i11) / 2;
        ArrayList arrayList = new ArrayList();
        mZ mZVar = new mZ();
        mZVar.Mm = i12;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 == 0) {
                arrayList.add(mZVar);
            }
            arrayList.add(list.get(i13));
            if (i13 == list.size() - 1) {
                arrayList.add(mZVar);
            }
        }
        return arrayList;
    }

    public void ZRu() {
        ZRu(0);
    }

    public void ZRu(int i10) {
        View viewNOt;
        if (i10 >= this.uR.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.uR.getFlexDirection();
        if (this.uR.getAlignItems() == 4) {
            int[] iArr = this.ZRu;
            List<mZ> flexLinesInternal = this.uR.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i11 = iArr != null ? iArr[i10] : 0; i11 < size; i11++) {
                mZ mZVar = flexLinesInternal.get(i11);
                int i12 = mZVar.FA;
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = mZVar.oK + i13;
                    if (i13 < this.uR.getFlexItemCount() && (viewNOt = this.uR.NOt(i14)) != null && viewNOt.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.TFq.NOt nOt = (com.bytedance.adsdk.ugeno.TFq.NOt) viewNOt.getLayoutParams();
                        if (nOt.Ht() == -1 || nOt.Ht() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                }
                                NOt(viewNOt, mZVar.Mm, i14);
                            } else {
                                ZRu(viewNOt, mZVar.Mm, i14);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (mZ mZVar2 : this.uR.getFlexLinesInternal()) {
            for (Integer num : mZVar2.edo) {
                View viewNOt2 = this.uR.NOt(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                    }
                    NOt(viewNOt2, mZVar2.Mm, num.intValue());
                } else {
                    ZRu(viewNOt2, mZVar2.Mm, num.intValue());
                }
            }
        }
    }

    private void ZRu(View view, int i10, int i11) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.TFq.NOt nOt = (com.bytedance.adsdk.ugeno.TFq.NOt) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - nOt.edo()) - nOt.yBV()) - this.uR.ZRu(view), nOt.FA()), nOt.aT());
        long[] jArr = this.Ht;
        if (jArr != null) {
            measuredWidth = ZRu(jArr[i11]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        ZRu(i11, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    public void ZRu(View view, mZ mZVar, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.TFq.NOt nOt = (com.bytedance.adsdk.ugeno.TFq.NOt) view.getLayoutParams();
        int alignItems = this.uR.getAlignItems();
        if (nOt.Ht() != -1) {
            alignItems = nOt.Ht();
        }
        int i14 = mZVar.Mm;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.uR.getFlexWrap() != 2) {
                    int i15 = i11 + i14;
                    view.layout(i10, (i15 - view.getMeasuredHeight()) - nOt.yBV(), i12, i15 - nOt.yBV());
                    return;
                }
                view.layout(i10, nOt.edo() + view.getMeasuredHeight() + (i11 - i14), i12, nOt.edo() + view.getMeasuredHeight() + (i13 - i14));
                return;
            }
            if (alignItems == 2) {
                int iEdo = ((nOt.edo() + (i14 - view.getMeasuredHeight())) - nOt.yBV()) / 2;
                if (this.uR.getFlexWrap() != 2) {
                    int i16 = i11 + iEdo;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                } else {
                    int i17 = i11 - iEdo;
                    view.layout(i10, i17, i12, view.getMeasuredHeight() + i17);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.uR.getFlexWrap() != 2) {
                    int iMax = Math.max(mZVar.lp - view.getBaseline(), nOt.edo());
                    view.layout(i10, i11 + iMax, i12, i13 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (mZVar.lp - view.getMeasuredHeight()), nOt.yBV());
                    view.layout(i10, i11 - iMax2, i12, i13 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.uR.getFlexWrap() != 2) {
            view.layout(i10, nOt.edo() + i11, i12, nOt.edo() + i13);
        } else {
            view.layout(i10, i11 - nOt.yBV(), i12, i13 - nOt.yBV());
        }
    }

    public void ZRu(View view, mZ mZVar, boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.TFq.NOt nOt = (com.bytedance.adsdk.ugeno.TFq.NOt) view.getLayoutParams();
        int alignItems = this.uR.getAlignItems();
        if (nOt.Ht() != -1) {
            alignItems = nOt.Ht();
        }
        int i14 = mZVar.Mm;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z10) {
                    view.layout(((i10 + i14) - view.getMeasuredWidth()) - nOt.oK(), i11, ((i12 + i14) - view.getMeasuredWidth()) - nOt.oK(), i13);
                    return;
                }
                view.layout(nOt.sAl() + view.getMeasuredWidth() + (i10 - i14), i11, nOt.sAl() + view.getMeasuredWidth() + (i12 - i14), i13);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int iZRu = ((com.bytedance.adsdk.ugeno.Mm.Ht.ZRu(marginLayoutParams) + (i14 - view.getMeasuredWidth())) - com.bytedance.adsdk.ugeno.Mm.Ht.NOt(marginLayoutParams)) / 2;
                if (!z10) {
                    view.layout(i10 + iZRu, i11, i12 + iZRu, i13);
                    return;
                } else {
                    view.layout(i10 - iZRu, i11, i12 - iZRu, i13);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z10) {
            view.layout(nOt.sAl() + i10, i11, nOt.sAl() + i12, i13);
        } else {
            view.layout(i10 - nOt.oK(), i11, i12 - nOt.oK(), i13);
        }
    }

    private void ZRu(int i10, int i11, int i12, View view) {
        long[] jArr = this.NOt;
        if (jArr != null) {
            jArr[i10] = NOt(i11, i12);
        }
        long[] jArr2 = this.Ht;
        if (jArr2 != null) {
            jArr2[i10] = NOt(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
