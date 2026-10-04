package com.bytedance.sdk.component.Mm.uR;

/* JADX INFO: loaded from: classes2.dex */
public class mZ {
    private NOt NOt;
    private ZRu ZRu;

    public interface NOt {
    }

    public enum ZRu {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.Mm.uR.mZ$mZ, reason: collision with other inner class name */
    public static class C0407mZ {
        private static final mZ ZRu = new mZ();
    }

    public static void ZRu(ZRu zRu) {
        synchronized (mZ.class) {
            C0407mZ.ZRu.ZRu = zRu;
        }
    }

    private mZ() {
        this.ZRu = ZRu.OFF;
        this.NOt = new com.bytedance.sdk.component.Mm.uR.NOt();
    }
}
