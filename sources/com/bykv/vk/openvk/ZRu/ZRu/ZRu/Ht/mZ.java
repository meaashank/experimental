package com.bykv.vk.openvk.ZRu.ZRu.ZRu.Ht;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.ZRu.ZRu.ZRu.Ht.NOt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class mZ extends TFq implements SurfaceHolder.Callback, NOt {
    private static final ArrayList<Ht> mZ = new ArrayList<>();
    private Ht NOt;
    private WeakReference<ZRu> ZRu;
    private NOt.ZRu uR;

    public mZ(Context context) {
        super(context);
        ZRu();
    }

    private void ZRu() {
        Ht ht = new Ht(this);
        this.NOt = ht;
        mZ.add(ht);
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.Ht.NOt
    public View getView() {
        return this;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public void setWindowVisibilityChangedListener(NOt.ZRu zRu) {
        this.uR = zRu;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        WeakReference<ZRu> weakReference = this.ZRu;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ZRu.get().ZRu(surfaceHolder, i10, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<ZRu> weakReference = this.ZRu;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ZRu.get().ZRu(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference<ZRu> weakReference = this.ZRu;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ZRu.get().NOt(surfaceHolder);
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.Ht.NOt
    public void ZRu(ZRu zRu) {
        this.ZRu = new WeakReference<>(zRu);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<Ht> it = mZ.iterator();
        while (it.hasNext()) {
            Ht next = it.next();
            if (next != null && next.ZRu() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.NOt);
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.Ht.NOt
    public void ZRu(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }
}
