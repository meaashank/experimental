package androidx.databinding;

import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableField<T> extends AbstractC2509b implements Serializable {
    static final long serialVersionUID = 1;
    private T mValue;

    public ObservableField() {
    }

    @Nullable
    public T get() {
        return this.mValue;
    }

    public void set(T t10) {
        if (t10 != this.mValue) {
            this.mValue = t10;
            notifyChange();
        }
    }

    public ObservableField(T t10) {
        this.mValue = t10;
    }

    public ObservableField(t... tVarArr) {
        super(tVarArr);
    }
}
