package androidx.core.net;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class ParseException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f111241a;

    public ParseException(@NonNull String str) {
        super(str);
        this.f111241a = str;
    }
}
