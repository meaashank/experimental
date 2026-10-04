package com.bytedance.adsdk.ugeno.core;

/* JADX INFO: loaded from: classes2.dex */
public enum ZH {
    UNKNOWN_EVENT("UNKNOWN_EVENT", 0),
    TAP_EVENT("onTap", 1),
    LONG_TAP_EVENT("onLongTap", 2),
    SHAKE_EVENT("onShake", 3),
    TWIST_EVENT("onTwist", 18),
    SLIDE_EVENT("onSlide", 4),
    EXPOSURE_EVENT("onExposure", 5),
    SCROLL_EVENT("onScroll", 6),
    PULL_TO_REFRESH_EVENT("onPullToRefresh", 7),
    LOAD_MORE_EVENT("onLoadMore", 8),
    TIMER("onTimer", 9),
    DELAY("onDelay", 10),
    ANIMATION("onAnimation", 11),
    VIDEO_PROGRESS("onVideoProgress", 12),
    VIDEO_PAUSE("onVideoPause", 13),
    VIDEO_RESUME("onVideoResume", 14),
    VIDEO_FINISH("onVideoFinish", 15),
    VIDEO_PLAY("onVideoPlay", 16),
    DOWN_EVENT("onDown", 17);

    private String OCA;
    private int to;

    ZH(String str, int i10) {
        this.OCA = str;
        this.to = i10;
    }

    public int ZRu() {
        return this.to;
    }

    public static ZH ZRu(String str) {
        for (ZH zh : values()) {
            if (zh.OCA.equals(str)) {
                return zh;
            }
        }
        return UNKNOWN_EVENT;
    }
}
