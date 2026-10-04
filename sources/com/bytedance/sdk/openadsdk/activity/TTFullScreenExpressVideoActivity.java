package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes3.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.core.sAl.uR.NOt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ZRu(long r10, boolean r12) {
        /*
            r9 = this;
            com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu r0 = r9.NOt
            com.bytedance.sdk.openadsdk.component.reward.view.FA r0 = r0.MR
            if (r0 == 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.view.NOt r0 = r0.ZRu()
            if (r0 == 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu r0 = r9.NOt
            com.bytedance.sdk.openadsdk.component.reward.view.FA r0 = r0.MR
            com.bytedance.sdk.openadsdk.component.reward.view.NOt r0 = r0.ZRu()
            com.bytedance.sdk.openadsdk.uR.Mm r0 = r0.getAdShowTime()
            goto L1e
        L19:
            com.bytedance.sdk.openadsdk.uR.Mm r0 = new com.bytedance.sdk.openadsdk.uR.Mm
            r0.<init>()
        L1e:
            com.bytedance.sdk.openadsdk.component.reward.NOt.NOt r1 = r9.mZ
            if (r1 == 0) goto L38
            boolean r2 = r1 instanceof com.bytedance.sdk.openadsdk.component.reward.NOt.FA
            if (r2 == 0) goto L38
            com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu r2 = r9.NOt
            boolean r3 = r2.Jem
            if (r3 != 0) goto L38
            com.bytedance.sdk.openadsdk.component.reward.ZRu.WMI r2 = r2.Zf
            com.bytedance.sdk.openadsdk.component.reward.NOt.FA r1 = (com.bytedance.sdk.openadsdk.component.reward.NOt.FA) r1
            android.widget.FrameLayout r1 = r1.VdW()
            r2.ZRu(r1, r0)
            goto L45
        L38:
            com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu r1 = r9.NOt
            com.bytedance.sdk.openadsdk.component.reward.ZRu.WMI r2 = r1.Zf
            com.bytedance.sdk.openadsdk.component.reward.view.FA r1 = r1.MR
            android.widget.FrameLayout r1 = r1.NOt()
            r2.ZRu(r1, r0)
        L45:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu r0 = r9.NOt
            com.bytedance.sdk.openadsdk.component.reward.view.FA r0 = r0.MR
            if (r0 == 0) goto L80
            int r0 = r0.Vor()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "dynamic_show_type"
            r7.put(r1, r0)
            com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu r0 = r9.NOt
            com.bytedance.sdk.openadsdk.component.reward.view.FA r0 = r0.MR
            r1 = 0
            org.json.JSONObject r0 = r0.ZRu(r1)
            if (r0 == 0) goto L80
            java.util.Iterator r1 = r0.keys()
        L6c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L80
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.get(r2)     // Catch: org.json.JSONException -> L6c
            r7.put(r2, r3)     // Catch: org.json.JSONException -> L6c
            goto L6c
        L80:
            com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu r0 = r9.NOt
            com.bytedance.sdk.openadsdk.component.reward.ZRu.WMI r0 = r0.Zf
            com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity$1 r1 = new com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity$1
            r1.<init>()
            r0.ZRu(r1)
            com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu r0 = r9.NOt
            com.bytedance.sdk.openadsdk.component.reward.ZRu.WMI r3 = r0.Zf
            com.bytedance.sdk.openadsdk.component.reward.NOt.NOt r8 = r9.mZ
            r4 = r10
            r6 = r12
            boolean r10 = r3.ZRu(r4, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.ZRu(long, boolean):boolean");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void mZ() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean qF() {
        return true;
    }
}
