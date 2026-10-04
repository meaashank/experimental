package androidx.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class k {
    @NonNull
    public List<k> a() {
        return Collections.EMPTY_LIST;
    }

    public abstract String b(int i10);

    public abstract B c(DataBindingComponent dataBindingComponent, View view, int i10);

    public abstract B d(DataBindingComponent dataBindingComponent, View[] viewArr, int i10);

    public abstract int e(String str);
}
