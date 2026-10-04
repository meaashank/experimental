package androidx.transition;

import android.view.View;
import android.view.WindowId;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@e.T(18)
public class d0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowId f117837a;

    public d0(@NonNull View view) {
        this.f117837a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof d0) && ((d0) obj).f117837a.equals(this.f117837a);
    }

    public int hashCode() {
        return this.f117837a.hashCode();
    }
}
