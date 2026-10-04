package androidx.work.impl;

import T2.r;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.WorkRequest;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class l extends WorkRequest {
    public l(@NonNull UUID id2, @NonNull r workSpec, @NonNull Set<String> tags) {
        super(id2, workSpec, tags);
    }
}
