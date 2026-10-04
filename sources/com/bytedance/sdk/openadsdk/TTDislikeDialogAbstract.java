package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.openadsdk.mZ.aT;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements aT.NOt {
    protected List<FilterWord> NOt;
    private String TFq;
    protected String ZRu;
    protected final aT mZ;
    private View uR;

    public TTDislikeDialogAbstract(@NonNull Context context) {
        super(context);
        aT aTVar = new aT();
        this.mZ = aTVar;
        aTVar.ZRu(this);
    }

    public void destroy() {
        aT aTVar = this.mZ;
        if (aTVar != null) {
            aTVar.ZRu();
        }
    }

    public aT getDislikeManager() {
        return this.mZ;
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View layoutView = getLayoutView();
        this.uR = layoutView;
        if (layoutView == null) {
            lp.NOt("getLayoutView,layout  may be abnormal, please check");
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.uR;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void onSuggestionSubmit(String str) {
        aT aTVar = this.mZ;
        if (aTVar != null) {
            aTVar.mZ(str);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.ZRu = str;
        this.NOt = list;
        this.mZ.ZRu(str);
        this.mZ.ZRu(this.NOt);
    }

    public TTDislikeDialogAbstract(@NonNull Context context, int i10, String str) {
        super(context, i10);
        this.TFq = str;
        aT aTVar = new aT();
        this.mZ = aTVar;
        aTVar.ZRu(this);
    }
}
