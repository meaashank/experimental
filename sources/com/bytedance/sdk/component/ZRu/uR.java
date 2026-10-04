package com.bytedance.sdk.component.ZRu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uR<P, R> extends com.bytedance.sdk.component.ZRu.NOt<P, R> {
    private ZRu NOt;
    private boolean ZRu = true;
    private Ht mZ;

    public interface NOt {
        uR ZRu();
    }

    public interface ZRu {
        void ZRu(Object obj);

        void ZRu(Throwable th);
    }

    private boolean Ht() {
        if (this.ZRu) {
            return true;
        }
        Vor.ZRu(new IllegalStateException("Jsb async call already finished: " + ZRu() + ", hashcode: " + hashCode()));
        return false;
    }

    public void TFq() {
        uR();
    }

    @Override // com.bytedance.sdk.component.ZRu.NOt
    public /* bridge */ /* synthetic */ String ZRu() {
        return super.ZRu();
    }

    public abstract void ZRu(P p10, Ht ht) throws Exception;

    public final void mZ() {
        ZRu((Throwable) null);
    }

    public void uR() {
        this.ZRu = false;
        this.mZ = null;
    }

    public final void ZRu(R r10) {
        if (Ht()) {
            this.NOt.ZRu(r10);
            uR();
        }
    }

    public final void ZRu(Throwable th) {
        if (Ht()) {
            this.NOt.ZRu(th);
            uR();
        }
    }

    public void ZRu(P p10, Ht ht, ZRu zRu) throws Exception {
        this.mZ = ht;
        this.NOt = zRu;
        ZRu(p10, ht);
    }
}
