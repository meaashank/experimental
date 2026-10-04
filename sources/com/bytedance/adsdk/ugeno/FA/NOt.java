package com.bytedance.adsdk.ugeno.FA;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NOt {
    private DataSetObserver NOt;
    private final DataSetObservable ZRu = new DataSetObservable();

    public Parcelable NOt() {
        return null;
    }

    public float ZRu(int i10) {
        return 1.0f;
    }

    public abstract int ZRu();

    public abstract boolean ZRu(View view, Object obj);

    public void mZ() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.NOt;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.ZRu.notifyChanged();
    }

    public int ZRu(Object obj) {
        return -1;
    }

    public Object ZRu(ViewGroup viewGroup, int i10) {
        return ZRu((View) viewGroup, i10);
    }

    public void ZRu(ViewGroup viewGroup, int i10, Object obj) {
        ZRu((View) viewGroup, i10, obj);
    }

    @Deprecated
    public Object ZRu(View view, int i10) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void ZRu(View view, int i10, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void ZRu(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.NOt = dataSetObserver;
        }
    }
}
