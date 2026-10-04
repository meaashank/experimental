package com.bytedance.adsdk.ugeno.TFq;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.Mm.Mm;
import com.bytedance.adsdk.ugeno.TFq.uR;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TFq extends ViewGroup implements com.bytedance.adsdk.ugeno.TFq.ZRu {
    private Drawable FA;
    private int Ht;
    private Drawable Mm;
    private int NOt;
    private int TFq;
    private int Vor;
    private com.bytedance.adsdk.ugeno.mZ WMI;
    private int ZH;
    private int ZRu;
    private int aT;
    private SparseIntArray edo;
    private int lp;
    private int mZ;
    private uR oK;
    private uR.ZRu qF;
    private int[] sAl;
    private int uR;
    private List<mZ> yBV;

    public static class ZRu extends ViewGroup.MarginLayoutParams implements NOt {
        public static final Parcelable.Creator<ZRu> CREATOR = new Parcelable.Creator<ZRu>() { // from class: com.bytedance.adsdk.ugeno.TFq.TFq.ZRu.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public ZRu createFromParcel(Parcel parcel) {
                return new ZRu(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public ZRu[] newArray(int i10) {
                return new ZRu[i10];
            }
        };
        private int FA;
        private int Ht;
        private int Mm;
        private float NOt;
        private float TFq;
        private int Vor;
        private int ZRu;
        private boolean aT;
        private float mZ;
        private int uR;

        public ZRu(ZRu zRu) {
            super((ViewGroup.MarginLayoutParams) zRu);
            this.ZRu = 1;
            this.NOt = 0.0f;
            this.mZ = 0.0f;
            this.uR = -1;
            this.TFq = -1.0f;
            this.Ht = -1;
            this.Mm = -1;
            this.FA = 16777215;
            this.Vor = 16777215;
            this.ZRu = zRu.ZRu;
            this.NOt = zRu.NOt;
            this.mZ = zRu.mZ;
            this.uR = zRu.uR;
            this.TFq = zRu.TFq;
            this.Ht = zRu.Ht;
            this.Mm = zRu.Mm;
            this.FA = zRu.FA;
            this.Vor = zRu.Vor;
            this.aT = zRu.aT;
        }

        @Override // com.bytedance.adsdk.ugeno.TFq.NOt
        public int FA() {
            return this.Mm;
        }

        @Override // com.bytedance.adsdk.ugeno.TFq.NOt
        public int Ht() {
            return this.uR;
        }

        @Override // com.bytedance.adsdk.ugeno.TFq.NOt
        public int Mm() {
            return this.Ht;
        }

        @Override // com.bytedance.adsdk.ugeno.TFq.NOt
        public int NOt() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bytedance.adsdk.ugeno.TFq.NOt
        public float TFq() {
            return this.mZ;
        }

        @Override // com.bytedance.adsdk.ugeno.TFq.NOt
        public int Vor() {
            return this.FA;
        }

        @Override // com.bytedance.adsdk.ugeno.TFq.NOt
        public boolean ZH() {
            return this.aT;
        }

        @Override // com.bytedance.adsdk.ugeno.TFq.NOt
        public int ZRu() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bytedance.adsdk.ugeno.TFq.NOt
        public int aT() {
            return this.Vor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.TFq.NOt
        public int edo() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.TFq.NOt
        public float lp() {
            return this.TFq;
        }

        @Override // com.bytedance.adsdk.ugeno.TFq.NOt
        public int mZ() {
            return this.ZRu;
        }

        @Override // com.bytedance.adsdk.ugeno.TFq.NOt
        public int oK() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.TFq.NOt
        public int sAl() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.TFq.NOt
        public float uR() {
            return this.NOt;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.ZRu);
            parcel.writeFloat(this.NOt);
            parcel.writeFloat(this.mZ);
            parcel.writeInt(this.uR);
            parcel.writeFloat(this.TFq);
            parcel.writeInt(this.Ht);
            parcel.writeInt(this.Mm);
            parcel.writeInt(this.FA);
            parcel.writeInt(this.Vor);
            parcel.writeByte(this.aT ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.bytedance.adsdk.ugeno.TFq.NOt
        public int yBV() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        public void NOt(float f10) {
            this.mZ = f10;
        }

        public void ZRu(float f10) {
            this.NOt = f10;
        }

        public void mZ(int i10) {
            this.ZRu = i10;
        }

        public void uR(int i10) {
            this.uR = i10;
        }

        @Override // com.bytedance.adsdk.ugeno.TFq.NOt
        public void NOt(int i10) {
            this.Mm = i10;
        }

        @Override // com.bytedance.adsdk.ugeno.TFq.NOt
        public void ZRu(int i10) {
            this.Ht = i10;
        }

        public void mZ(float f10) {
            this.TFq = f10;
        }

        public ZRu(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.ZRu = 1;
            this.NOt = 0.0f;
            this.mZ = 0.0f;
            this.uR = -1;
            this.TFq = -1.0f;
            this.Ht = -1;
            this.Mm = -1;
            this.FA = 16777215;
            this.Vor = 16777215;
        }

        public ZRu(int i10, int i11) {
            super(new ViewGroup.LayoutParams(i10, i11));
            this.ZRu = 1;
            this.NOt = 0.0f;
            this.mZ = 0.0f;
            this.uR = -1;
            this.TFq = -1.0f;
            this.Ht = -1;
            this.Mm = -1;
            this.FA = 16777215;
            this.Vor = 16777215;
        }

        public ZRu(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.ZRu = 1;
            this.NOt = 0.0f;
            this.mZ = 0.0f;
            this.uR = -1;
            this.TFq = -1.0f;
            this.Ht = -1;
            this.Mm = -1;
            this.FA = 16777215;
            this.Vor = 16777215;
        }

        public ZRu(Parcel parcel) {
            super(0, 0);
            this.ZRu = 1;
            this.NOt = 0.0f;
            this.mZ = 0.0f;
            this.uR = -1;
            this.TFq = -1.0f;
            this.Ht = -1;
            this.Mm = -1;
            this.FA = 16777215;
            this.Vor = 16777215;
            this.ZRu = parcel.readInt();
            this.NOt = parcel.readFloat();
            this.mZ = parcel.readFloat();
            this.uR = parcel.readInt();
            this.TFq = parcel.readFloat();
            this.Ht = parcel.readInt();
            this.Mm = parcel.readInt();
            this.FA = parcel.readInt();
            this.Vor = parcel.readInt();
            this.aT = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public TFq(Context context) {
        super(context, null);
        this.Ht = -1;
        this.oK = new uR(this);
        this.yBV = new ArrayList();
        this.qF = new uR.ZRu();
    }

    private boolean Ht(int i10) {
        if (i10 >= 0 && i10 < this.yBV.size()) {
            for (int i11 = i10 + 1; i11 < this.yBV.size(); i11++) {
                if (this.yBV.get(i11).NOt() > 0) {
                    return false;
                }
            }
            if (ZRu()) {
                return (this.Vor & 4) != 0;
            }
            if ((this.aT & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean TFq(int i10, int i11) {
        for (int i12 = 1; i12 <= i11; i12++) {
            View viewMZ = mZ(i10 - i12);
            if (viewMZ != null && viewMZ.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean uR(int i10, int i11) {
        return TFq(i10, i11) ? ZRu() ? (this.aT & 1) != 0 : (this.Vor & 1) != 0 : ZRu() ? (this.aT & 2) != 0 : (this.Vor & 2) != 0;
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public View NOt(int i10) {
        return mZ(i10);
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public int ZRu(View view) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.edo == null) {
            this.edo = new SparseIntArray(getChildCount());
        }
        this.sAl = this.oK.ZRu(view, i10, layoutParams, this.edo);
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ZRu;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ZRu ? new ZRu((ZRu) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new ZRu((ViewGroup.MarginLayoutParams) layoutParams) : new ZRu(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public int getAlignContent() {
        return this.TFq;
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public int getAlignItems() {
        return this.uR;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.Mm;
    }

    public Drawable getDividerDrawableVertical() {
        return this.FA;
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public int getFlexDirection() {
        return this.ZRu;
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<mZ> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.yBV.size());
        for (mZ mZVar : this.yBV) {
            if (mZVar.NOt() != 0) {
                arrayList.add(mZVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public List<mZ> getFlexLinesInternal() {
        return this.yBV;
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public int getFlexWrap() {
        return this.NOt;
    }

    public int getJustifyContent() {
        return this.mZ;
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public int getLargestMainSize() {
        Iterator<mZ> it = this.yBV.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().TFq);
        }
        return iMax;
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public int getMaxLine() {
        return this.Ht;
    }

    public int getShowDividerHorizontal() {
        return this.Vor;
    }

    public int getShowDividerVertical() {
        return this.aT;
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public int getSumOfCrossSize() {
        int size = this.yBV.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            mZ mZVar = this.yBV.get(i11);
            if (uR(i11)) {
                i10 += ZRu() ? this.ZH : this.lp;
            }
            if (Ht(i11)) {
                i10 += ZRu() ? this.ZH : this.lp;
            }
            i10 += mZVar.Mm;
        }
        return i10;
    }

    public View mZ(int i10) {
        if (i10 < 0) {
            return null;
        }
        int[] iArr = this.sAl;
        if (i10 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i10]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.mZ mZVar = this.WMI;
        if (mZVar != null) {
            mZVar.Mm();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.mZ mZVar = this.WMI;
        if (mZVar != null) {
            mZVar.FA();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.FA == null && this.Mm == null) {
            return;
        }
        if (this.Vor == 0 && this.aT == 0) {
            return;
        }
        int iZRu = Mm.ZRu(this);
        int i10 = this.ZRu;
        if (i10 == 0) {
            ZRu(canvas, iZRu == 1, this.NOt == 2);
            return;
        }
        if (i10 == 1) {
            ZRu(canvas, iZRu != 1, this.NOt == 2);
            return;
        }
        if (i10 == 2) {
            boolean z10 = iZRu == 1;
            if (this.NOt == 2) {
                z10 = !z10;
            }
            NOt(canvas, z10, false);
            return;
        }
        if (i10 != 3) {
            return;
        }
        boolean z11 = iZRu == 1;
        if (this.NOt == 2) {
            z11 = !z11;
        }
        NOt(canvas, z11, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        TFq tFq;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z12;
        TFq tFq2;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z13;
        com.bytedance.adsdk.ugeno.mZ mZVar = this.WMI;
        if (mZVar != null) {
            mZVar.Ht();
        }
        int iZRu = Mm.ZRu(this);
        int i22 = this.ZRu;
        if (i22 == 0) {
            if (iZRu == 1) {
                z11 = true;
                tFq = this;
                i14 = i10;
                i17 = i11;
                i16 = i13;
                i15 = i12;
            } else {
                z11 = false;
                tFq = this;
                i14 = i10;
                i15 = i12;
                i16 = i13;
                i17 = i11;
            }
            tFq.ZRu(z11, i14, i17, i15, i16);
        } else if (i22 == 1) {
            if (iZRu != 1) {
                z12 = true;
                tFq2 = this;
                i18 = i10;
                i21 = i11;
                i20 = i13;
                i19 = i12;
            } else {
                z12 = false;
                tFq2 = this;
                i18 = i10;
                i19 = i12;
                i20 = i13;
                i21 = i11;
            }
            tFq2.ZRu(z12, i18, i21, i19, i20);
        } else if (i22 == 2) {
            z13 = iZRu == 1;
            if (this.NOt == 2) {
                z13 = !z13;
            }
            ZRu(z13, false, i10, i11, i12, i13);
        } else {
            if (i22 != 3) {
                throw new IllegalStateException("Invalid flex direction is set: " + this.ZRu);
            }
            z13 = iZRu == 1;
            if (this.NOt == 2) {
                z13 = !z13;
            }
            ZRu(z13, true, i10, i11, i12, i13);
        }
        com.bytedance.adsdk.ugeno.mZ mZVar2 = this.WMI;
        if (mZVar2 != null) {
            mZVar2.ZRu(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.mZ mZVar = this.WMI;
        if (mZVar != null) {
            int[] iArrZRu = mZVar.ZRu(i10, i11);
            ZRu(iArrZRu[0], iArrZRu[1]);
        } else {
            ZRu(i10, i11);
        }
        com.bytedance.adsdk.ugeno.mZ mZVar2 = this.WMI;
        if (mZVar2 != null) {
            mZVar2.TFq();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.mZ mZVar = this.WMI;
        if (mZVar != null) {
            mZVar.NOt(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void setAlignContent(int i10) {
        if (this.TFq != i10) {
            this.TFq = i10;
            requestLayout();
        }
    }

    public void setAlignItems(int i10) {
        if (this.uR != i10) {
            this.uR = i10;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.Mm) {
            return;
        }
        this.Mm = drawable;
        if (drawable != null) {
            this.ZH = drawable.getIntrinsicHeight();
        } else {
            this.ZH = 0;
        }
        NOt();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.FA) {
            return;
        }
        this.FA = drawable;
        if (drawable != null) {
            this.lp = drawable.getIntrinsicWidth();
        } else {
            this.lp = 0;
        }
        NOt();
        requestLayout();
    }

    public void setFlexDirection(int i10) {
        if (this.ZRu != i10) {
            this.ZRu = i10;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public void setFlexLines(List<mZ> list) {
        this.yBV = list;
    }

    public void setFlexWrap(int i10) {
        if (this.NOt != i10) {
            this.NOt = i10;
            requestLayout();
        }
    }

    public void setJustifyContent(int i10) {
        if (this.mZ != i10) {
            this.mZ = i10;
            requestLayout();
        }
    }

    public void setMaxLine(int i10) {
        if (this.Ht != i10) {
            this.Ht = i10;
            requestLayout();
        }
    }

    public void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }

    public void setShowDividerHorizontal(int i10) {
        if (i10 != this.Vor) {
            this.Vor = i10;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i10) {
        if (i10 != this.aT) {
            this.aT = i10;
            requestLayout();
        }
    }

    private void NOt(int i10, int i11) {
        this.yBV.clear();
        this.qF.ZRu();
        this.oK.ZRu(this.qF, i10, i11);
        this.yBV = this.qF.ZRu;
        this.oK.ZRu(i10, i11);
        if (this.uR == 3) {
            for (mZ mZVar : this.yBV) {
                int iMax = Integer.MIN_VALUE;
                for (int i12 = 0; i12 < mZVar.FA; i12++) {
                    View viewMZ = mZ(mZVar.oK + i12);
                    if (viewMZ != null && viewMZ.getVisibility() != 8) {
                        ZRu zRu = (ZRu) viewMZ.getLayoutParams();
                        iMax = this.NOt != 2 ? Math.max(iMax, viewMZ.getMeasuredHeight() + Math.max(mZVar.lp - viewMZ.getBaseline(), ((ViewGroup.MarginLayoutParams) zRu).topMargin) + ((ViewGroup.MarginLayoutParams) zRu).bottomMargin) : Math.max(iMax, viewMZ.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) zRu).topMargin + Math.max(viewMZ.getBaseline() + (mZVar.lp - viewMZ.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) zRu).bottomMargin));
                    }
                }
                mZVar.Mm = iMax;
            }
        }
        this.oK.NOt(i10, i11, getPaddingBottom() + getPaddingTop());
        this.oK.ZRu();
        ZRu(this.ZRu, i10, i11, this.qF.NOt);
    }

    private void ZRu(int i10, int i11) {
        if (this.edo == null) {
            this.edo = new SparseIntArray(getChildCount());
        }
        if (this.oK.NOt(this.edo)) {
            this.sAl = this.oK.ZRu(this.edo);
        }
        int i12 = this.ZRu;
        if (i12 == 0 || i12 == 1) {
            NOt(i10, i11);
        } else if (i12 == 2 || i12 == 3) {
            mZ(i10, i11);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.ZRu);
        }
    }

    private boolean TFq(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.yBV.get(i11).NOt() > 0) {
                return false;
            }
        }
        return true;
    }

    private void mZ(int i10, int i11) {
        this.yBV.clear();
        this.qF.ZRu();
        this.oK.NOt(this.qF, i10, i11);
        this.yBV = this.qF.ZRu;
        this.oK.ZRu(i10, i11);
        this.oK.NOt(i10, i11, getPaddingRight() + getPaddingLeft());
        this.oK.ZRu();
        ZRu(this.ZRu, i10, i11, this.qF.NOt);
    }

    private boolean uR(int i10) {
        if (i10 >= 0 && i10 < this.yBV.size()) {
            if (TFq(i10)) {
                return ZRu() ? (this.Vor & 1) != 0 : (this.aT & 1) != 0;
            }
            if (ZRu()) {
                return (this.Vor & 2) != 0;
            }
            if ((this.aT & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public View ZRu(int i10) {
        return getChildAt(i10);
    }

    private void ZRu(int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 == 0 || i10 == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i10)));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i11, i13);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else {
            throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i13 = View.combineMeasuredStates(i13, 256);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i12, i13);
        } else if (mode2 == 1073741824) {
            if (size2 < paddingBottom) {
                i13 = View.combineMeasuredStates(i13, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private void NOt(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.yBV.size();
        for (int i12 = 0; i12 < size; i12++) {
            mZ mZVar = this.yBV.get(i12);
            for (int i13 = 0; i13 < mZVar.FA; i13++) {
                int i14 = mZVar.oK + i13;
                View viewMZ = mZ(i14);
                if (viewMZ != null && viewMZ.getVisibility() != 8) {
                    ZRu zRu = (ZRu) viewMZ.getLayoutParams();
                    if (uR(i14, i13)) {
                        if (z11) {
                            top = viewMZ.getBottom() + ((ViewGroup.MarginLayoutParams) zRu).bottomMargin;
                        } else {
                            top = (viewMZ.getTop() - ((ViewGroup.MarginLayoutParams) zRu).topMargin) - this.ZH;
                        }
                        NOt(canvas, mZVar.ZRu, top, mZVar.Mm);
                    }
                    if (i13 == mZVar.FA - 1 && (this.Vor & 4) > 0) {
                        if (z11) {
                            bottom = (viewMZ.getTop() - ((ViewGroup.MarginLayoutParams) zRu).topMargin) - this.ZH;
                        } else {
                            bottom = viewMZ.getBottom() + ((ViewGroup.MarginLayoutParams) zRu).bottomMargin;
                        }
                        NOt(canvas, mZVar.ZRu, bottom, mZVar.Mm);
                    }
                }
            }
            if (uR(i12)) {
                if (z10) {
                    i11 = mZVar.mZ;
                } else {
                    i11 = mZVar.ZRu - this.lp;
                }
                ZRu(canvas, i11, paddingTop, iMax);
            }
            if (Ht(i12) && (this.aT & 4) > 0) {
                if (z10) {
                    i10 = mZVar.ZRu - this.lp;
                } else {
                    i10 = mZVar.mZ;
                }
                ZRu(canvas, i10, paddingTop, iMax);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public boolean ZRu() {
        int i10 = this.ZRu;
        return i10 == 0 || i10 == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void ZRu(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.TFq.TFq.ZRu(boolean, int, int, int, int):void");
    }

    private void NOt(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.Mm;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.ZH + i11);
        this.Mm.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public int NOt(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    private void NOt() {
        if (this.Mm == null && this.FA == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void ZRu(boolean r25, boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.TFq.TFq.ZRu(boolean, boolean, int, int, int, int):void");
    }

    private void ZRu(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.yBV.size();
        for (int i12 = 0; i12 < size; i12++) {
            mZ mZVar = this.yBV.get(i12);
            for (int i13 = 0; i13 < mZVar.FA; i13++) {
                int i14 = mZVar.oK + i13;
                View viewMZ = mZ(i14);
                if (viewMZ != null && viewMZ.getVisibility() != 8) {
                    ZRu zRu = (ZRu) viewMZ.getLayoutParams();
                    if (uR(i14, i13)) {
                        if (z10) {
                            left = viewMZ.getRight() + ((ViewGroup.MarginLayoutParams) zRu).rightMargin;
                        } else {
                            left = (viewMZ.getLeft() - ((ViewGroup.MarginLayoutParams) zRu).leftMargin) - this.lp;
                        }
                        ZRu(canvas, left, mZVar.NOt, mZVar.Mm);
                    }
                    if (i13 == mZVar.FA - 1 && (this.aT & 4) > 0) {
                        if (z10) {
                            right = (viewMZ.getLeft() - ((ViewGroup.MarginLayoutParams) zRu).leftMargin) - this.lp;
                        } else {
                            right = viewMZ.getRight() + ((ViewGroup.MarginLayoutParams) zRu).rightMargin;
                        }
                        ZRu(canvas, right, mZVar.NOt, mZVar.Mm);
                    }
                }
            }
            if (uR(i12)) {
                if (z11) {
                    i11 = mZVar.uR;
                } else {
                    i11 = mZVar.NOt - this.ZH;
                }
                NOt(canvas, paddingLeft, i11, iMax);
            }
            if (Ht(i12) && (this.Vor & 4) > 0) {
                if (z11) {
                    i10 = mZVar.NOt - this.ZH;
                } else {
                    i10 = mZVar.uR;
                }
                NOt(canvas, paddingLeft, i10, iMax);
            }
        }
    }

    private void ZRu(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.FA;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.lp + i10, i12 + i11);
        this.FA.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public int ZRu(View view, int i10, int i11) {
        int i12;
        int i13;
        if (ZRu()) {
            i12 = uR(i10, i11) ? this.lp : 0;
            if ((this.aT & 4) <= 0) {
                return i12;
            }
            i13 = this.lp;
        } else {
            i12 = uR(i10, i11) ? this.ZH : 0;
            if ((this.Vor & 4) <= 0) {
                return i12;
            }
            i13 = this.ZH;
        }
        return i12 + i13;
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public void ZRu(mZ mZVar) {
        if (ZRu()) {
            if ((this.aT & 4) > 0) {
                int i10 = mZVar.TFq;
                int i11 = this.lp;
                mZVar.TFq = i10 + i11;
                mZVar.Ht += i11;
                return;
            }
            return;
        }
        if ((this.Vor & 4) > 0) {
            int i12 = mZVar.TFq;
            int i13 = this.ZH;
            mZVar.TFq = i12 + i13;
            mZVar.Ht += i13;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public int ZRu(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // com.bytedance.adsdk.ugeno.TFq.ZRu
    public void ZRu(View view, int i10, int i11, mZ mZVar) {
        if (uR(i10, i11)) {
            if (ZRu()) {
                int i12 = mZVar.TFq;
                int i13 = this.lp;
                mZVar.TFq = i12 + i13;
                mZVar.Ht += i13;
                return;
            }
            int i14 = mZVar.TFq;
            int i15 = this.ZH;
            mZVar.TFq = i14 + i15;
            mZVar.Ht += i15;
        }
    }

    public void ZRu(com.bytedance.adsdk.ugeno.NOt.mZ mZVar) {
        this.WMI = mZVar;
    }
}
