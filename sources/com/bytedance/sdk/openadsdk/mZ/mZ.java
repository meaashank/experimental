package com.bytedance.sdk.openadsdk.mZ;

import U6.j;
import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.le;
import com.bytedance.sdk.openadsdk.mZ.lp;
import com.bytedance.sdk.openadsdk.mZ.uR;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class mZ implements le {
    private final Context NOt;
    private le.ZRu TFq;
    public lp ZRu;
    private uR mZ;
    private boolean uR;

    public mZ(Context context, String str, List<FilterWord> list, String str2, String str3) {
        if (!(context instanceof Activity)) {
            com.bytedance.sdk.component.utils.lp.NOt("Dislike Initialization must use activity, please pass in TTAdManager.createAdNative(activity)");
        }
        this.NOt = context;
        ZRu(str, list, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uR() {
        Context context = this.NOt;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.ZRu.isShowing()) {
            return;
        }
        this.ZRu.show();
    }

    private void ZRu(String str, List<FilterWord> list, String str2, String str3) {
        this.mZ = new uR(this.NOt, str, list, str3);
        lp lpVar = new lp(this.NOt, this.mZ.getDislikeManager());
        this.ZRu = lpVar;
        lpVar.ZRu(str, str2);
        this.ZRu.ZRu(str3);
        this.ZRu.ZRu(new lp.ZRu() { // from class: com.bytedance.sdk.openadsdk.mZ.mZ.1
            @Override // com.bytedance.sdk.openadsdk.mZ.lp.ZRu
            public void NOt() {
                mZ.this.ZRu();
            }

            @Override // com.bytedance.sdk.openadsdk.mZ.lp.ZRu
            public void ZRu() {
            }

            @Override // com.bytedance.sdk.openadsdk.mZ.lp.ZRu
            public void mZ() {
                mZ.this.ZRu();
            }

            @Override // com.bytedance.sdk.openadsdk.mZ.lp.ZRu
            public void ZRu(int i10, FilterWord filterWord, String str4) {
                mZ.this.mZ.onSuggestionSubmit(str4);
                mZ.this.ZRu();
            }
        });
        this.mZ.ZRu(new uR.ZRu() { // from class: com.bytedance.sdk.openadsdk.mZ.mZ.2
            @Override // com.bytedance.sdk.openadsdk.mZ.uR.ZRu
            public void NOt() {
                com.bytedance.sdk.component.utils.lp.ZRu("TTAdDislikeImpl", "onDislikeDismiss: ");
                try {
                    if (mZ.this.TFq != null) {
                        mZ.this.TFq.ZRu();
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lp.ZRu("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.mZ.uR.ZRu
            public void ZRu() {
                mZ.this.ZRu(true);
                if (mZ.this.mZ != null && mZ.this.mZ.isShowing()) {
                    mZ.this.mZ.hide();
                }
                mZ.this.uR();
            }

            @Override // com.bytedance.sdk.openadsdk.mZ.uR.ZRu
            public void ZRu(int i10, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && mZ.this.TFq != null) {
                        mZ.this.TFq.ZRu(i10, filterWord.getName());
                    }
                    com.bytedance.sdk.component.utils.lp.ZRu("TTAdDislikeImpl", "onDislikeSelected: " + i10 + j.f68738d + filterWord.getName());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lp.ZRu("TTAdDislikeImpl", "dislike callback selected error: ", th);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.le
    public void NOt() {
        uR uRVar = this.mZ;
        if (uRVar != null) {
            uRVar.destroy();
        }
    }

    public boolean mZ() {
        return this.uR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.le
    public void ZRu() {
        Context context = this.NOt;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.mZ.isShowing()) {
            return;
        }
        this.mZ.show();
    }

    @Override // com.bytedance.sdk.openadsdk.core.le
    public void ZRu(le.ZRu zRu) {
        this.TFq = zRu;
    }

    public void ZRu(String str) {
        uR uRVar = this.mZ;
        if (uRVar != null) {
            uRVar.ZRu(str);
        }
    }

    public void ZRu(boolean z10) {
        this.uR = z10;
    }
}
