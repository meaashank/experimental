package org.slf4j.event;

import com.tencent.qcloud.core.http.f;

/* JADX INFO: loaded from: classes8.dex */
public enum Level {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, f.c.f194278e);

    private int levelInt;
    private String levelStr;

    Level(int i10, String str) {
        this.levelInt = i10;
        this.levelStr = str;
    }

    public int toInt() {
        return this.levelInt;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.levelStr;
    }
}
