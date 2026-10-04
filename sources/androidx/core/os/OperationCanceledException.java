package androidx.core.os;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        super("The operation has been canceled.");
    }

    public OperationCanceledException(@Nullable String str) {
        super(str != null ? str.toString() : "The operation has been canceled.");
    }
}
