package com.bykv.vk.openvk.ZRu.ZRu.NOt.uR;

import com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZRu implements mZ {
    private mZ.uR FA;
    private mZ.Mm Ht;
    private mZ.InterfaceC0374mZ Mm;
    private mZ.TFq NOt;
    private mZ.Ht TFq;
    protected boolean ZRu = false;
    private mZ.NOt mZ;
    private mZ.ZRu uR;

    public final void NOt() {
        try {
            mZ.TFq tFq = this.NOt;
            if (tFq != null) {
                tFq.NOt(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public final void ZRu(mZ.TFq tFq) {
        this.NOt = tFq;
    }

    public final void mZ() {
        try {
            mZ.NOt nOt = this.mZ;
            if (nOt != null) {
                nOt.ZRu(this);
            }
        } catch (Throwable unused) {
        }
    }

    public final void uR() {
        try {
            mZ.Ht ht = this.TFq;
            if (ht != null) {
                ht.mZ(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public final void ZRu(mZ.NOt nOt) {
        this.mZ = nOt;
    }

    public final boolean NOt(int i10, int i11) {
        try {
            mZ.uR uRVar = this.FA;
            if (uRVar != null) {
                if (uRVar.NOt(this, i10, i11)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public final void ZRu(mZ.ZRu zRu) {
        this.uR = zRu;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public final void ZRu(mZ.Ht ht) {
        this.TFq = ht;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public final void ZRu(mZ.InterfaceC0374mZ interfaceC0374mZ) {
        this.Mm = interfaceC0374mZ;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public final void ZRu(mZ.uR uRVar) {
        this.FA = uRVar;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public final void ZRu(mZ.Mm mm) {
        this.Ht = mm;
    }

    public void ZRu() {
        this.NOt = null;
        this.uR = null;
        this.mZ = null;
        this.TFq = null;
        this.Ht = null;
        this.Mm = null;
        this.FA = null;
    }

    public final void ZRu(int i10) {
        try {
            mZ.ZRu zRu = this.uR;
            if (zRu != null) {
                zRu.ZRu(this, i10);
            }
        } catch (Throwable unused) {
        }
    }

    public final void ZRu(int i10, int i11, int i12, int i13) {
        try {
            mZ.Mm mm = this.Ht;
            if (mm != null) {
                mm.ZRu(this, i10, i11, i12, i13);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean ZRu(int i10, int i11) {
        try {
            mZ.InterfaceC0374mZ interfaceC0374mZ = this.Mm;
            if (interfaceC0374mZ != null) {
                if (interfaceC0374mZ.ZRu(this, i10, i11)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ
    public void ZRu(boolean z10) {
        this.ZRu = z10;
    }
}
