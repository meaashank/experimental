package androidx.activity.result;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.C2382e;
import d.AbstractC4282a;
import e.I;

/* JADX INFO: loaded from: classes.dex */
public abstract class g<I> {
    @NonNull
    public abstract AbstractC4282a<I, ?> a();

    public void b(@SuppressLint({"UnknownNullness"}) I i10) {
        c(i10, null);
    }

    public abstract void c(@SuppressLint({"UnknownNullness"}) I i10, @Nullable C2382e c2382e);

    @I
    public abstract void d();
}
