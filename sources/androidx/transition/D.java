package androidx.transition;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class D extends K implements F {
    public D(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    public static D c(ViewGroup viewGroup) {
        return (D) K.a(viewGroup);
    }

    @Override // androidx.transition.F
    public void add(@NonNull View view) {
        this.f117751a.b(view);
    }

    @Override // androidx.transition.F
    public void remove(@NonNull View view) {
        this.f117751a.h(view);
    }
}
