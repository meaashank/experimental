package androidx.core.util;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"UnknownNullness"})
public interface B<T> {
    @SuppressLint({"MissingNullability"})
    B<T> a(@SuppressLint({"MissingNullability"}) B<? super T> b10);

    @SuppressLint({"MissingNullability"})
    B<T> b(@SuppressLint({"MissingNullability"}) B<? super T> b10);

    @SuppressLint({"MissingNullability"})
    B<T> negate();

    boolean test(T t10);
}
