package androidx.databinding;

import androidx.annotation.NonNull;
import androidx.databinding.t;

/* JADX INFO: renamed from: androidx.databinding.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2508a implements t {
    private transient z mCallbacks;

    @Override // androidx.databinding.t
    public void addOnPropertyChangedCallback(@NonNull t.a aVar) {
        synchronized (this) {
            try {
                if (this.mCallbacks == null) {
                    this.mCallbacks = new z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mCallbacks.a(aVar);
    }

    public void notifyChange() {
        synchronized (this) {
            try {
                z zVar = this.mCallbacks;
                if (zVar == null) {
                    return;
                }
                zVar.i(this, 0, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyPropertyChanged(int i10) {
        synchronized (this) {
            try {
                z zVar = this.mCallbacks;
                if (zVar == null) {
                    return;
                }
                zVar.i(this, i10, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.t
    public void removeOnPropertyChangedCallback(@NonNull t.a aVar) {
        synchronized (this) {
            try {
                z zVar = this.mCallbacks;
                if (zVar == null) {
                    return;
                }
                zVar.n(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
