package com.bytedance.adsdk.NOt.mZ.mZ;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.NOt.OCA;
import com.bytedance.adsdk.NOt.aT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mZ extends uR {
    private LinearLayout FA;
    private final LinearLayout.LayoutParams Vor;
    private final List<TextView> ZH;
    private final List<String> aT;
    private String lp;

    public mZ(com.bytedance.adsdk.NOt.Vor vor, TFq tFq, Context context) {
        List<aT.ZRu> listMZ;
        super(vor, tFq);
        this.Vor = new LinearLayout.LayoutParams(-2, -2);
        this.aT = new ArrayList();
        this.ZH = new ArrayList();
        aT aTVar = ((uR) this).Mm;
        if (aTVar == null || (listMZ = aTVar.mZ()) == null || listMZ.size() <= 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.FA = linearLayout;
        int i10 = 0;
        linearLayout.setOrientation(0);
        this.FA.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(80);
        this.FA.addView(linearLayout2);
        List<String> listLp = lp();
        while (i10 < listMZ.size()) {
            aT.ZRu zRu = listMZ.get(i10);
            TextView textView = new TextView(context);
            ZRu(textView, zRu, (listLp == null || i10 >= listLp.size()) ? "" : listLp.get(i10));
            int i11 = zRu.Ht;
            if (i11 != 0) {
                this.Vor.bottomMargin = (int) (com.bytedance.adsdk.NOt.Ht.Ht.ZRu() * i11);
                linearLayout2.addView(textView, this.Vor);
            } else {
                linearLayout2.addView(textView);
            }
            i10++;
        }
        float fZRu = com.bytedance.adsdk.NOt.Ht.Ht.ZRu();
        ZRu(this.FA, (int) (((uR) this).Mm.ZRu() * fZRu), (int) (((uR) this).Mm.NOt() * fZRu));
    }

    private void ZRu(TextView textView, aT.ZRu zRu, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
        } else {
            textView.setText(str);
        }
        if (!TextUtils.isEmpty(zRu.mZ)) {
            textView.setTextColor(Color.parseColor(zRu.mZ));
        }
        if (!TextUtils.isEmpty(zRu.uR)) {
            textView.setBackgroundColor(Color.parseColor(zRu.uR));
        }
        textView.setTextAlignment(4);
        textView.setTextSize(zRu.TFq);
    }

    private List<String> lp() {
        com.bytedance.adsdk.NOt.Vor vor;
        OCA ocaXY;
        List<aT.ZRu> listMZ;
        if (((uR) this).Mm == null || (vor = this.NOt) == null || (ocaXY = vor.xY()) == null) {
            return null;
        }
        String strUR = ((uR) this).Mm.uR();
        if ((!TextUtils.isEmpty(strUR) || !TextUtils.isEmpty(this.lp)) && (listMZ = ((uR) this).Mm.mZ()) != null) {
            String strZRu = this.lp;
            if (TextUtils.isEmpty(strZRu)) {
                strZRu = ocaXY.ZRu(strUR);
            }
            if (!TextUtils.isEmpty(strZRu)) {
                this.aT.clear();
                for (int i10 = 0; i10 < listMZ.size(); i10++) {
                    aT.ZRu zRu = listMZ.get(i10);
                    int length = zRu.ZRu;
                    int i11 = zRu.NOt;
                    if (i11 == 0) {
                        this.aT.add(strZRu);
                    } else {
                        if (length < 0) {
                            length += strZRu.length();
                        }
                        int length2 = i11 < 0 ? strZRu.length() + i11 : length + i11;
                        if (length2 > strZRu.length()) {
                            length2 = strZRu.length();
                        }
                        if (length < 0 || length >= strZRu.length() || length2 <= length) {
                            this.aT.add("");
                        } else {
                            this.aT.add(strZRu.substring(length, length2));
                        }
                    }
                }
                return this.aT;
            }
        }
        return null;
    }

    private void mZ(float f10) {
        List<aT.ZRu> listMZ;
        aT aTVar = ((uR) this).Mm;
        if (aTVar == null || (listMZ = aTVar.mZ()) == null || listMZ.size() <= 0) {
            return;
        }
        this.FA.setOrientation(0);
        this.FA.setGravity(17);
        if (this.FA.getChildCount() <= 0) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.FA.getChildAt(0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(80);
        this.FA.removeAllViews();
        if (linearLayout.getChildCount() != listMZ.size()) {
            return;
        }
        List<String> listLp = lp();
        this.ZH.clear();
        int i10 = 0;
        while (i10 < listMZ.size()) {
            aT.ZRu zRu = listMZ.get(i10);
            TextView textView = (TextView) linearLayout.getChildAt(i10);
            this.ZH.add(textView);
            ZRu(textView, zRu, (listLp == null || i10 >= listLp.size()) ? "" : listLp.get(i10));
            i10++;
        }
        linearLayout.removeAllViews();
        for (int i11 = 0; i11 < listMZ.size(); i11++) {
            aT.ZRu zRu2 = listMZ.get(i11);
            TextView textView2 = this.ZH.get(i11);
            textView2.setAlpha(f10);
            linearLayout.setAlpha(f10);
            int i12 = zRu2.Ht;
            if (i12 != 0) {
                this.Vor.bottomMargin = (int) (com.bytedance.adsdk.NOt.Ht.Ht.ZRu() * i12);
                linearLayout.addView(textView2, this.Vor);
            } else {
                linearLayout.addView(textView2);
            }
        }
        this.FA.setAlpha(f10);
        this.FA.addView(linearLayout);
        float fZRu = com.bytedance.adsdk.NOt.Ht.Ht.ZRu();
        ZRu(this.FA, (int) (((uR) this).Mm.ZRu() * fZRu), (int) (((uR) this).Mm.NOt() * fZRu));
    }

    @Override // com.bytedance.adsdk.NOt.mZ.mZ.uR, com.bytedance.adsdk.NOt.mZ.mZ.ZRu
    public void NOt(Canvas canvas, Matrix matrix, int i10) {
        if (this.FA == null) {
            super.NOt(canvas, matrix, i10);
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        ZRu(i10);
        mZ(Ht());
        this.FA.draw(canvas);
        canvas.restore();
    }

    private static void ZRu(View view, int i10, int i11) {
        view.layout(0, 0, i10, i11);
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void ZRu(String str) {
        this.lp = str;
    }
}
