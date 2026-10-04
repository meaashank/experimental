package com.bytedance.sdk.openadsdk.mZ;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.om;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.utils.Cox;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class uR extends TTDislikeDialogAbstract {
    private String TFq;
    private ZRu uR;

    public interface ZRu {
        void NOt();

        void ZRu();

        void ZRu(int i10, FilterWord filterWord);
    }

    public uR(Context context, String str, List<FilterWord> list, String str2) {
        super(context, om.Ht(context, "tt_dislikeDialog"), str2);
        this.ZRu = str;
        this.NOt = list;
    }

    private void NOt() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.mZ.uR.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (uR.this.uR != null) {
                    ZRu unused = uR.this.uR;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.mZ.uR.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (uR.this.uR != null) {
                    uR.this.uR.NOt();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(Cox.mZ(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new Vor(getContext(), this.mZ, this.NOt);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            ZRu();
            NOt();
            setMaterialMeta(this.ZRu, this.NOt);
        } catch (Throwable unused) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public void ZRu(ZRu zRu) {
        this.uR = zRu;
    }

    public void ZRu(String str) {
        this.TFq = str;
    }

    @Override // com.bytedance.sdk.openadsdk.mZ.aT.NOt
    public void ZRu(int i10) {
        FilterWord filterWordNOt;
        if (aT.mZ == i10) {
            dismiss();
            return;
        }
        if (aT.TFq == i10) {
            ZRu zRu = this.uR;
            if (zRu != null) {
                zRu.ZRu();
                return;
            }
            return;
        }
        if (aT.NOt != i10 || (filterWordNOt = this.mZ.NOt()) == null || aT.ZRu.equals(filterWordNOt)) {
            return;
        }
        ZRu zRu2 = this.uR;
        if (zRu2 != null) {
            try {
                zRu2.ZRu(0, filterWordNOt);
            } catch (Throwable unused) {
            }
        }
        dismiss();
    }

    private void ZRu() {
        Window window = getWindow();
        if (window == null || window.getAttributes() == null) {
            return;
        }
        window.getAttributes().windowAnimations = 0;
    }
}
