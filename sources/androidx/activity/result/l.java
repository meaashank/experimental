package androidx.activity.result;

import androidx.activity.result.PickVisualMediaRequest;
import d.C4283b;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    @NotNull
    public static final PickVisualMediaRequest a(@NotNull C4283b.j.f mediaType) {
        G.p(mediaType, "mediaType");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).build();
    }

    public static /* synthetic */ PickVisualMediaRequest b(C4283b.j.f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = C4283b.j.C0709b.f194526a;
        }
        return a(fVar);
    }
}
