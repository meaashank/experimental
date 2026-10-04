package ha;

import java.io.File;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: ha.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C4508b implements ToLongFunction {
    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return ((File) obj).lastModified();
    }
}
