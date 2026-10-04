package com.bytedance.sdk.openadsdk.core.lp;

import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import e.e0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class Ht {
    private Mm NOt;
    final Set<Pair<View, FriendlyObstructionPurpose>> ZRu = new HashSet();

    private Ht() {
        TFq.ZRu(WMI.ZRu());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FA() {
        Mm mm = this.NOt;
        if (mm != null) {
            try {
                mm.mZ();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ht() {
        if (this.NOt != null) {
            try {
                ZRu((View) null, (FriendlyObstructionPurpose) null);
                this.NOt.NOt();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm() {
        Mm mm = this.NOt;
        if (mm != null) {
            try {
                mm.uR();
            } catch (Throwable unused) {
            }
        }
    }

    private Handler TFq() {
        return com.bytedance.sdk.component.utils.Mm.NOt();
    }

    @e0
    public void uR() {
        if (com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.NOt()) {
            FA();
        } else {
            TFq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.lp.Ht.8
                @Override // java.lang.Runnable
                public void run() {
                    Ht.this.FA();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(WebView webView) {
        try {
            if (this.NOt == null) {
                this.NOt = FA.ZRu(webView);
            }
        } catch (Throwable th) {
            lp.NOt("createWebViewSession failed : ".concat(String.valueOf(th)));
            HashMap map = new HashMap();
            map.put("scene", "createWebViewSession");
            map.put(PglCryptUtils.KEY_MESSAGE, th.getMessage());
            TFq.ZRu(map);
        }
    }

    @e0
    public void mZ() {
        if (com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.NOt()) {
            Mm();
        } else {
            TFq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.lp.Ht.7
                @Override // java.lang.Runnable
                public void run() {
                    Ht.this.Mm();
                }
            });
        }
    }

    public static Ht ZRu() {
        return new Ht();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(View view, Set<aT> set) {
        try {
            if (this.NOt == null) {
                this.NOt = FA.ZRu(view, set);
            }
        } catch (Throwable th) {
            lp.NOt("createVideoSession failed : ".concat(String.valueOf(th)));
            HashMap map = new HashMap();
            map.put("scene", "createVideoSession");
            map.put(PglCryptUtils.KEY_MESSAGE, th.getMessage());
            TFq.ZRu(map);
        }
    }

    @e0
    public void ZRu(final WebView webView) {
        if (webView == null || this.NOt != null) {
            return;
        }
        if (com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.NOt()) {
            NOt(webView);
        } else {
            TFq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.lp.Ht.1
                @Override // java.lang.Runnable
                public void run() {
                    Ht.this.NOt(webView);
                }
            });
        }
    }

    public void ZRu(final View view, final Set<aT> set) {
        if (this.NOt != null || view == null || set == null) {
            return;
        }
        if (com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.NOt()) {
            NOt(view, set);
        } else {
            TFq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.lp.Ht.4
                @Override // java.lang.Runnable
                public void run() {
                    Ht.this.NOt(view, (Set<aT>) set);
                }
            });
        }
    }

    @e0
    public void NOt() {
        if (com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.NOt()) {
            Ht();
        } else {
            TFq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.lp.Ht.5
                @Override // java.lang.Runnable
                public void run() {
                    Ht.this.Ht();
                }
            });
        }
    }

    @e0
    public void ZRu(final boolean z10, final float f10) {
        if (com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.NOt()) {
            NOt(z10, f10);
        } else {
            TFq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.lp.Ht.6
                @Override // java.lang.Runnable
                public void run() {
                    Ht.this.NOt(z10, f10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(boolean z10, float f10) {
        if (this.NOt != null) {
            try {
                ZRu((View) null, (FriendlyObstructionPurpose) null);
                this.NOt.ZRu(z10, f10);
            } catch (Throwable unused) {
            }
        }
    }

    @e0
    public void ZRu(@Nullable final View view, @Nullable final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.NOt()) {
            NOt(view, friendlyObstructionPurpose);
        } else {
            TFq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.lp.Ht.9
                @Override // java.lang.Runnable
                public void run() {
                    Ht.this.NOt(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
        Mm mm = this.NOt;
        try {
            if (mm == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.ZRu.add(new Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                mm.ZRu(view, friendlyObstructionPurpose);
            }
            if (this.ZRu.size() > 0) {
                mm.ZRu(this.ZRu);
                this.ZRu.clear();
            }
        } catch (Throwable unused) {
        }
    }

    @e0
    public void ZRu(final long j10, final boolean z10) {
        if (com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.NOt()) {
            NOt(j10, z10);
        } else {
            TFq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.lp.Ht.10
                @Override // java.lang.Runnable
                public void run() {
                    Ht.this.NOt(j10, z10);
                }
            });
        }
    }

    @e0
    public void ZRu(final boolean z10) {
        if (com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.NOt()) {
            NOt(z10);
        } else {
            TFq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.lp.Ht.2
                @Override // java.lang.Runnable
                public void run() {
                    Ht.this.NOt(z10);
                }
            });
        }
    }

    public void NOt(long j10, boolean z10) {
        Mm mm = this.NOt;
        if (mm != null) {
            try {
                mm.ZRu(j10 / 1000.0f, z10);
            } catch (Throwable unused) {
            }
        }
    }

    @e0
    public void ZRu(final int i10) {
        if (com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.NOt()) {
            NOt(i10);
        } else {
            TFq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.lp.Ht.3
                @Override // java.lang.Runnable
                public void run() {
                    Ht.this.NOt(i10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(boolean z10) {
        Mm mm = this.NOt;
        if (mm != null) {
            try {
                mm.ZRu(z10);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(int i10) {
        Mm mm = this.NOt;
        if (mm != null) {
            try {
                mm.NOt(i10);
            } catch (Throwable unused) {
            }
        }
    }
}
