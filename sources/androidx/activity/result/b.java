package androidx.activity.result;

import androidx.annotation.NonNull;
import d.AbstractC4282a;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    @NonNull
    <I, O> g<I> registerForActivityResult(@NonNull AbstractC4282a<I, O> abstractC4282a, @NonNull a<O> aVar);

    @NonNull
    <I, O> g<I> registerForActivityResult(@NonNull AbstractC4282a<I, O> abstractC4282a, @NonNull j jVar, @NonNull a<O> aVar);
}
