package com.bytedance.sdk.openadsdk.core.ZH.NOt;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class mZ extends com.bytedance.adsdk.ugeno.Vor.mZ.ZRu {
    public mZ(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.Vor.mZ.ZRu
    public String Mm(String str) {
        str.getClass();
        switch (str) {
            case "unmuted":
                return "tt_reward_full_unmute";
            case "feedback":
                return "tt_reward_full_feedback";
            case "logo":
                return "tt_ad_logo";
            case "close":
                return "tt_close_btn";
            case "muted":
                return "tt_reward_full_mute";
            default:
                return null;
        }
    }
}
